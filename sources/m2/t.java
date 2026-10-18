package m2;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class t {
    public final int f16469a;
    public final String f16470b;
    public final String f16471c;

    public t(int i10, String str, String str2) {
        this.f16469a = i10;
        this.f16470b = str;
        this.f16471c = str2;
    }

    public String toString() {
        switch (this.f16469a) {
            case 0:
                return this.f16470b + ", " + this.f16471c;
            default:
                return super.toString();
        }
    }

    public t(String str, String str2) {
        this.f16469a = 1;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f16470b = str;
        this.f16471c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public t(mi.q qVar) {
        this.f16469a = 3;
        Context context = (Context) qVar.f16974b;
        int e = x9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f16470b = "Unity";
            String string = context.getResources().getString(e);
            this.f16471c = string;
            String h = r4.c.h("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", h, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f16470b = "Flutter";
                this.f16471c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f16470b = null;
                this.f16471c = null;
            }
        }
        this.f16470b = null;
        this.f16471c = null;
    }
}
