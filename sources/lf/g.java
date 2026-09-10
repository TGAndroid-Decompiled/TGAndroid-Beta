package lf;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import og.u0;
import org.telegram.ui.Cells.r6;
public final class g {
    public final int f12912a;
    public final String f12913b;
    public final String f12914c;

    public g(int i10, String str, String str2) {
        this.f12912a = i10;
        this.f12913b = str;
        this.f12914c = str2;
    }

    public String toString() {
        switch (this.f12912a) {
            case 1:
                return this.f12913b + ", " + this.f12914c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.f12912a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f12913b = str;
        this.f12914c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public g(u0 u0Var) {
        this.f12912a = 3;
        Context context = (Context) u0Var.f14497b;
        int e = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f12913b = "Unity";
            String string = context.getResources().getString(e);
            this.f12914c = string;
            String i10 = r6.i("Unity Editor version is: ", string);
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
                this.f12913b = "Flutter";
                this.f12914c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f12913b = null;
                this.f12914c = null;
            }
        }
        this.f12913b = null;
        this.f12914c = null;
    }
}
