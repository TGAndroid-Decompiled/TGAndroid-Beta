package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import n7.z0;
public final class a {
    public String f3840a;
    public String f3841b;

    public a(String str, String str2) {
        this.f3840a = str;
        this.f3841b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f3841b)) {
            if (this.f3840a != null) {
                if (this.f3841b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(z0 z0Var) {
        Context context = (Context) z0Var.f15426b;
        int e = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f3840a = "Unity";
            String string = context.getResources().getString(e);
            this.f3841b = string;
            String g10 = v7.j.g("Unity Editor version is: ", string);
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
                this.f3840a = "Flutter";
                this.f3841b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f3840a = null;
                this.f3841b = null;
            }
        }
        this.f3840a = null;
        this.f3841b = null;
    }
}
