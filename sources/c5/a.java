package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class a {
    public String f4326a;
    public String f4327b;

    public a(String str, String str2, boolean z10) {
        this.f4326a = str;
        this.f4327b = str2;
    }

    public s a() {
        if (!"first_party".equals(this.f4327b)) {
            if (this.f4326a != null) {
                if (this.f4327b != null) {
                    return new s(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(String str, String str2) {
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f4326a = str;
        this.f4327b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public a(m2.t tVar) {
        Context context = (Context) tVar.f15110b;
        int e = x9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f4326a = "Unity";
            String string = context.getResources().getString(e);
            this.f4327b = string;
            String h = t8.b.h("Unity Editor version is: ", string);
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
                this.f4326a = "Flutter";
                this.f4327b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f4326a = null;
                this.f4327b = null;
            }
        }
        this.f4326a = null;
        this.f4327b = null;
    }
}
