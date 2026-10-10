package mf;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import n6.t;
import sc.v;
public final class g {
    public final String f16392a;
    public final String f16393b;

    public g(int i10, String str, String str2) {
        switch (i10) {
            case 1:
                n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
                this.f16392a = str;
                this.f16393b = (str2 == null || str2.length() <= 0) ? null : str2;
                return;
            default:
                this.f16392a = str;
                this.f16393b = str2;
                return;
        }
    }

    public g(t tVar) {
        Context context = (Context) tVar.f16721b;
        int e7 = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e7 != 0) {
            this.f16392a = "Unity";
            String string = context.getResources().getString(e7);
            this.f16393b = string;
            String i10 = v.i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i10, null);
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
                this.f16392a = "Flutter";
                this.f16393b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f16392a = null;
                this.f16393b = null;
            }
        }
        this.f16392a = null;
        this.f16393b = null;
    }
}
