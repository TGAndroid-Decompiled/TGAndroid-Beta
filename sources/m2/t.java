package m2;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class t {
    public final int f16462a;
    public final String f16463b;
    public final String f16464c;

    public t(int i10, String str, String str2) {
        this.f16462a = i10;
        this.f16463b = str;
        this.f16464c = str2;
    }

    public String toString() {
        switch (this.f16462a) {
            case 0:
                return this.f16463b + ", " + this.f16464c;
            default:
                return super.toString();
        }
    }

    public t(String str, String str2) {
        this.f16462a = 1;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f16463b = str;
        this.f16464c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public t(mi.q qVar) {
        this.f16462a = 3;
        Context context = (Context) qVar.f16967b;
        int e = x9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f16463b = "Unity";
            String string = context.getResources().getString(e);
            this.f16464c = string;
            String g10 = r.c.g("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", g10, null);
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
                this.f16463b = "Flutter";
                this.f16464c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f16463b = null;
                this.f16464c = null;
            }
        }
        this.f16463b = null;
        this.f16464c = null;
    }
}
