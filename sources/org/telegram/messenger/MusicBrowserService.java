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
        t0.w();
        setSessionToken((MediaSession.Token) ((android.support.v4.media.session.u) rz.a(this).f26675b.f1675b).f1707c.f1651b);
    }

    @Override
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i7, Bundle bundle) {
        if (str != null) {
            if (1000 != i7 && Process.myUid() != i7) {
                HashSet hashSet = at.f22931a;
                if (i7 != 1000 && i7 != Process.myUid() && !at.f22931a.contains(str)) {
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
            rz.a(this).getClass();
            if (rz.b()) {
                return null;
            }
            rz.a(this).getClass();
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
        rz a10 = rz.a(this);
        a10.getClass();
        if (rz.b()) {
            Toast.makeText(getApplicationContext(), hd.N0(2131751098, null), 1).show();
            stopSelf();
            result.detach();
            return;
        }
        result.detach();
        a10.c(str, new j1(result, 13));
    }
}
