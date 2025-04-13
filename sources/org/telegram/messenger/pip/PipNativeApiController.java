package org.telegram.messenger.pip;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
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
        return AndroidUtilities.checkInlinePermissions(context) ? 2 : -1;
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
                if (AndroidUtilities.isInPictureInPictureMode(pipSource.activity)) {
                    pipSource.activity.moveTaskToBack(false);
                    return;
                }
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

    public static void onUpdateSourcesMap() {
        PipSource pipSource;
        PipSource pipSource2 = maxPrioritySource;
        String str = pipSource2 != null ? pipSource2.tag : null;
        maxPrioritySource = null;
        for (PipSource pipSource3 : sources.values()) {
            if (pipSource3.isEnabled()) {
                if (pipSource3.player != null) {
                    Point point = pipSource3.ratio;
                    if (point.x != 0 && point.y != 0) {
                    }
                }
                pipSource = maxPrioritySource;
                if (pipSource != null || pipSource3.priority >= pipSource.priority) {
                    maxPrioritySource = pipSource3;
                }
            }
            if (pipSource3.isAttachedToPictureInPicture()) {
                pipSource = maxPrioritySource;
                if (pipSource != null) {
                }
                maxPrioritySource = pipSource3;
            }
        }
        if (TextUtils.equals(str, getMaxPrioritySourceTag())) {
            return;
        }
        onMaxPrioritySourceChanged(pipSource2, maxPrioritySource);
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
