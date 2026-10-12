package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class a {
    public String f4196a;
    public String f4197b;

    public a(String str, String str2, boolean z10) {
        this.f4196a = str;
        this.f4197b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f4197b)) {
            if (this.f4196a != null) {
                if (this.f4197b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(String str, String str2) {
        n6.m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f4196a = str;
        this.f4197b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public a(n6.k kVar) {
        Context context = (Context) kVar.f16432b;
        int e7 = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e7 != 0) {
            this.f4196a = "Unity";
            String string = context.getResources().getString(e7);
            this.f4197b = string;
            String i10 = sc.v.i("Unity Editor version is: ", string);
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
                this.f4196a = "Flutter";
                this.f4197b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f4196a = null;
                this.f4197b = null;
            }
        }
        this.f4196a = null;
        this.f4197b = null;
    }
}
