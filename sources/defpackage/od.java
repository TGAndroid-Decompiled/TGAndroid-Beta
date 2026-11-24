package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
public final class od implements ed {
    public final byte a;
    public final Context b;

    public od(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                d01.t(context, w01.g);
                return;
            case 2:
                try {
                    context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
