package org.telegram.messenger.pip;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;

public abstract class PipNativeApiController {
    private static PipSource maxPrioritySource;
    private static MediaSessionCompat mediaSession;
    static MediaSessionConnector mediaSessionConnector;
    private static final HashMap sources = new HashMap();

    public static boolean checkAnyPipPermissions(Context context) {
        return checkPermissions(context) > 0;
    }

    public static int checkPermissions(Context context) {
        if (AndroidUtilities.checkInlinePermissions(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return AndroidUtilities.checkPipPermissions(context) ? 1 : -2;
        }
        return -1;
    }

    public static WindowManager.LayoutParams createWindowLayoutParams(Context context, boolean z) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        layoutParams.type = getWindowLayoutParamsType(context, z);
        layoutParams.flags = 520;
        return layoutParams;
    }

    private static String getMaxPrioritySourceTag() {
        PipSource pipSource = maxPrioritySource;
        if (pipSource != null) {
            return pipSource.tag;
        }
        return null;
    }

    public static int getWindowLayoutParamsType(Context context, boolean z) {
        if (z || !AndroidUtilities.checkInlinePermissions(context)) {
            return 2;
        }
        return Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
    }

    public static boolean isMaxPrioritySource(String str) {
        return TextUtils.equals(str, getMaxPrioritySourceTag());
    }

    private static void onMaxPrioritySourceChanged(PipSource pipSource, PipSource pipSource2) {
        if ((pipSource != null && pipSource.needMediaSession) != (pipSource2 != null && pipSource2.needMediaSession)) {
            MediaSessionConnector mediaSessionConnector2 = mediaSessionConnector;
            if (mediaSessionConnector2 != null) {
                mediaSessionConnector2.setPlayer(null);
                mediaSessionConnector = null;
            }
            MediaSessionCompat mediaSessionCompat = mediaSession;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setActive(false);
                mediaSession.release();
                mediaSession = null;
            }
            if (pipSource2 != null) {
                MediaSessionCompat mediaSessionCompat2 = new MediaSessionCompat(pipSource2.activity, "pip-media-session");
                mediaSession = mediaSessionCompat2;
                mediaSessionCompat2.setActive(true);
                mediaSessionConnector = new MediaSessionConnector(mediaSession);
            }
        }
        if (pipSource != null) {
            pipSource.detachFromPictureInPicture();
        }
        if (pipSource2 == null) {
            if (pipSource != null) {
                AndroidUtilities.resetPictureInPictureParams(pipSource.activity);
                return;
            }
            return;
        }
        pipSource2.applyPictureInPictureParams();
        MediaSessionConnector mediaSessionConnector3 = mediaSessionConnector;
        if (mediaSessionConnector3 != null) {
            mediaSessionConnector3.setPlayer(pipSource2.player);
        }
        if (AndroidUtilities.isInPictureInPictureMode(pipSource2.activity)) {
            pipSource2.attachToPictureInPicture();
        }
    }

    public static void onPictureInPictureModeChanged(Activity activity, boolean z) {
        PipSource pipSource = maxPrioritySource;
        if (pipSource != null) {
            if (z) {
                pipSource.attachToPictureInPicture();
            } else {
                pipSource.detachFromPictureInPicture();
            }
        }
    }

    private static void onUpdateSourcesMap() {
        PipSource pipSource = maxPrioritySource;
        String str = pipSource != null ? pipSource.tag : null;
        maxPrioritySource = null;
        for (PipSource pipSource2 : sources.values()) {
            PipSource pipSource3 = maxPrioritySource;
            if (pipSource3 == null || pipSource2.priority >= pipSource3.priority) {
                maxPrioritySource = pipSource2;
            }
        }
        if (TextUtils.equals(str, getMaxPrioritySourceTag())) {
            return;
        }
        onMaxPrioritySourceChanged(pipSource, maxPrioritySource);
    }

    public static void onUserLeaveHint(Activity activity) {
        PipSource pipSource;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 26 && (pipSource = maxPrioritySource) != null) {
            activity.enterPictureInPictureMode(pipSource.buildPictureInPictureParams());
        }
    }

    public static void register(PipSource pipSource) {
        sources.put(pipSource.tag, pipSource);
        onUpdateSourcesMap();
    }

    public static void unregister(PipSource pipSource) {
        if (sources.remove(pipSource.tag) != null) {
            onUpdateSourcesMap();
        }
    }
}
