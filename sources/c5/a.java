package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class a {
    public final int f3730a;
    public String f3731b;
    public String f3732c;

    public p a() {
        if (!"first_party".equals(this.f3732c)) {
            if (this.f3731b != null) {
                if (this.f3732c != null) {
                    return new p(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f3730a) {
            case 2:
                return this.f3731b + ", " + this.f3732c;
            default:
                return super.toString();
        }
    }

    public a(int i10, String str, String str2) {
        this.f3730a = i10;
        this.f3731b = str;
        this.f3732c = str2;
    }

    public a(String str, String str2) {
        this.f3730a = 3;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f3731b = str;
            this.f3732c = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public a(u9.b bVar) {
        this.f3730a = 5;
        Context context = (Context) bVar.f50194b;
        int e = x9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f3731b = "Unity";
            String string = context.getResources().getString(e);
            this.f3732c = string;
            String h = sc.e.h("Unity Editor version is: ", string);
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
                this.f3731b = "Flutter";
                this.f3732c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f3731b = null;
                this.f3732c = null;
            }
        }
        this.f3731b = null;
        this.f3732c = null;
    }
}
