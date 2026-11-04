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
        setSessionToken((MediaSession.Token) ((android.support.v4.media.session.u) oz.a(this).f24631b.f1186b).f1218c.f1162b);
    }

    @Override
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i3, Bundle bundle) {
        if (str != null) {
            if (1000 != i3 && Process.myUid() != i3) {
                HashSet hashSet = xs.f26433a;
                if (i3 != 1000 && i3 != Process.myUid() && !xs.f26433a.contains(str)) {
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
            oz.a(this).getClass();
            if (oz.b()) {
                return null;
            }
            oz.a(this).getClass();
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
        oz a10 = oz.a(this);
        a10.getClass();
        if (oz.b()) {
            Toast.makeText(getApplicationContext(), bd.M0(2131751111, null), 1).show();
            stopSelf();
            result.detach();
            return;
        }
        result.detach();
        a10.c(str, new p1(result, 11));
    }
}
