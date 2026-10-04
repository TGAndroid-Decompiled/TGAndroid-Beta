package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import n7.z0;
public final class a {
    public String f4147a;
    public String f4148b;

    public a(String str, String str2) {
        this.f4147a = str;
        this.f4148b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f4148b)) {
            if (this.f4147a != null) {
                if (this.f4148b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(z0 z0Var) {
        Context context = (Context) z0Var.f16847b;
        int e7 = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e7 != 0) {
            this.f4147a = "Unity";
            String string = context.getResources().getString(e7);
            this.f4148b = string;
            String i10 = t8.b.i("Unity Editor version is: ", string);
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
                this.f4147a = "Flutter";
                this.f4148b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f4147a = null;
                this.f4148b = null;
            }
        }
        this.f4147a = null;
        this.f4148b = null;
    }
}
