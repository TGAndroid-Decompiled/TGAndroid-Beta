package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
public final class a {
    public final int f4322a;
    public String f4323b;
    public String f4324c;

    public a() {
        this.f4322a = 1;
    }

    public s a() {
        if (!"first_party".equals(this.f4324c)) {
            if (this.f4323b != null) {
                if (this.f4324c != null) {
                    return new s(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f4322a) {
            case 2:
                return this.f4323b + ", " + this.f4324c;
            default:
                return super.toString();
        }
    }

    public a(int i10, String str, String str2) {
        this.f4322a = i10;
        this.f4323b = str;
        this.f4324c = str2;
    }

    public a(String str, String str2) {
        this.f4322a = 3;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f4323b = str;
        this.f4324c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public a(m4.c cVar) {
        this.f4322a = 5;
        Context context = (Context) cVar.f15392b;
        int e = x9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f4323b = "Unity";
            String string = context.getResources().getString(e);
            this.f4324c = string;
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
                this.f4323b = "Flutter";
                this.f4324c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f4323b = null;
                this.f4324c = null;
            }
        }
        this.f4323b = null;
        this.f4324c = null;
    }
}
