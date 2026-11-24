package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class ce3 {
    public final byte a;
    public final String b;
    public final String c;

    public ce3(lv6 lv6Var) {
        this.a = (byte) 0;
        Context context = (Context) lv6Var.b;
        int e = pm2.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e);
            this.c = string;
            String h = b00.h("Unity Editor version is: ", string);
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
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public ce3(String str, String str2) {
        this.a = (byte) 2;
        fre.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public ce3(String str, String str2, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
    }
}
