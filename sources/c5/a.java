package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import n7.z0;
import v7.k0;
public final class a {
    public String f3835a;
    public String f3836b;

    public a(String str, String str2) {
        this.f3835a = str;
        this.f3836b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f3836b)) {
            if (this.f3835a != null) {
                if (this.f3836b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(z0 z0Var) {
        Context context = (Context) z0Var.f15445b;
        int e = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f3835a = "Unity";
            String string = context.getResources().getString(e);
            this.f3836b = string;
            String g10 = k0.g("Unity Editor version is: ", string);
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
                this.f3835a = "Flutter";
                this.f3836b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f3835a = null;
                this.f3836b = null;
            }
        }
        this.f3835a = null;
        this.f3836b = null;
    }
}
