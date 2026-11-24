package org.telegram.messenger;

import android.content.pm.PackageManager;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Process;
import android.service.media.MediaBrowserService;
import android.widget.Toast;
import java.util.HashSet;
public class MusicBrowserService extends MediaBrowserService {
    @Override
    public final void onCreate() {
        super.onCreate();
        a.v();
        setSessionToken((MediaSession.Token) ((zu6) hgb.a(this).b.b).c.b);
    }

    @Override
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        if (str != null) {
            if (1000 != i && Process.myUid() != i) {
                HashSet hashSet = lr7.a;
                if (i != 1000 && i != Process.myUid() && !lr7.a.contains(str)) {
                    PackageManager packageManager = getPackageManager();
                    try {
                        if (packageManager.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", str) != 0) {
                            if (packageManager.checkPermission("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE", str) != 0) {
                                return null;
                            }
                        }
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            }
            hgb.a(this).getClass();
            if (hgb.b()) {
                return null;
            }
            hgb.a(this).getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
            bundle2.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
            bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
            return new MediaBrowserService.BrowserRoot("__ROOT__", bundle2);
        }
        return null;
    }

    @Override
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        hgb a = hgb.a(this);
        a.getClass();
        if (hgb.b()) {
            Toast.makeText(getApplicationContext(), k96.M0(2131751098, null), 1).show();
            stopSelf();
            result.detach();
            return;
        }
        result.detach();
        a.c(str, new im6(result, (byte) 12));
    }
}
