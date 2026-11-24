package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class i5 {
    public String a;
    public String b;

    public i5(hi2 hi2Var) {
        Context context = (Context) hi2Var.b;
        int e = bo2.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.a = "Unity";
            String string = context.getResources().getString(e);
            this.b = string;
            String h = b10.h("Unity Editor version is: ", string);
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

    public final zy8 a() {
        if (!"first_party".equals(this.b)) {
            if (this.a != null) {
                if (this.b != null) {
                    return new zy8(this);
                }
                u36.j("Product type must be provided.");
                return null;
            }
            u36.j("Product id must be provided.");
            return null;
        }
        u36.j("Serialized doc id must be provided for first party products.");
        return null;
    }

    public i5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
