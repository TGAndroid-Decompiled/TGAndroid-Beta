package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class we3 {
    public String a;
    public String b;

    public we3(qx6 qx6Var) {
        Context context = (Context) qx6Var.b;
        int e = jn2.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.a = "Unity";
            String string = context.getResources().getString(e);
            this.b = string;
            String i = c00.i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i, null);
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
                this.a = "Flutter";
                this.b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.a = null;
        this.b = null;
    }

    public final j09 a() {
        if (!"first_party".equals(this.b)) {
            if (this.a != null) {
                if (this.b != null) {
                    return new j09(this);
                }
                lq5.j("Product type must be provided.");
                return null;
            }
            lq5.j("Product id must be provided.");
            return null;
        }
        lq5.j("Serialized doc id must be provided for first party products.");
        return null;
    }

    public we3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
