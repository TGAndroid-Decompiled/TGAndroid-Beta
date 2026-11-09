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
        setSessionToken((MediaSession.Token) ((android.support.v4.media.session.u) wz.a(this).f26410b.f1763b).f1795c.f1739b);
    }

    @Override
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i7, Bundle bundle) {
        if (str != null) {
            if (1000 != i7 && Process.myUid() != i7) {
                HashSet hashSet = ft.f22468a;
                if (i7 != 1000 && i7 != Process.myUid() && !ft.f22468a.contains(str)) {
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
            wz.a(this).getClass();
            if (wz.b()) {
                return null;
            }
            wz.a(this).getClass();
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
        wz a10 = wz.a(this);
        a10.getClass();
        if (wz.b()) {
            Toast.makeText(getApplicationContext(), id.M0(2131751110, null), 1).show();
            stopSelf();
            result.detach();
            return;
        }
        result.detach();
        a10.c(str, new j1(result, 12));
    }
}
