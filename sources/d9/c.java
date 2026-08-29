package d9;

import android.content.Context;
import android.util.Log;
import g9.h;
import java.io.IOException;
import java.io.InputStream;
import p2.o;
import z5.l;
public final class c {
    public final int f5535a;
    public String f5536b;
    public String f5537c;

    public c() {
        this.f5535a = 2;
    }

    public o a() {
        if (!"first_party".equals(this.f5537c)) {
            if (this.f5536b != null) {
                if (this.f5537c != null) {
                    return new o(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f5535a) {
            case 3:
                return this.f5536b + ", " + this.f5537c;
            default:
                return super.toString();
        }
    }

    public c(int i10, String str, String str2) {
        this.f5535a = i10;
        this.f5536b = str;
        this.f5537c = str2;
    }

    public c(String str, String str2) {
        this.f5535a = 5;
        l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f5536b = str;
        this.f5537c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public c(ze.b bVar) {
        this.f5535a = 0;
        Context context = (Context) bVar.f50824a;
        int e10 = h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f5536b = "Unity";
            String string = context.getResources().getString(e10);
            this.f5537c = string;
            String e11 = u3.c.e("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", e11, null);
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
                this.f5536b = "Flutter";
                this.f5537c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f5536b = null;
                this.f5537c = null;
            }
        }
        this.f5536b = null;
        this.f5537c = null;
    }
}
