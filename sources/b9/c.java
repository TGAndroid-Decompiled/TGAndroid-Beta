package b9;

import android.content.Context;
import android.util.Log;
import e9.h;
import java.io.IOException;
import java.io.InputStream;
import n2.o;
import x5.l;
public final class c {
    public final int f1661a;
    public String f1662b;
    public String f1663c;

    public c() {
        this.f1661a = 2;
    }

    public o a() {
        if (!"first_party".equals(this.f1663c)) {
            if (this.f1662b != null) {
                if (this.f1663c != null) {
                    return new o(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f1661a) {
            case 3:
                return this.f1662b + ", " + this.f1663c;
            default:
                return super.toString();
        }
    }

    public c(int i9, String str, String str2) {
        this.f1661a = i9;
        this.f1662b = str;
        this.f1663c = str2;
    }

    public c(String str, String str2) {
        this.f1661a = 5;
        l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f1662b = str;
        this.f1663c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public c(we.b bVar) {
        this.f1661a = 0;
        Context context = (Context) bVar.f48793b;
        int e10 = h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f1662b = "Unity";
            String string = context.getResources().getString(e10);
            this.f1663c = string;
            String d = ta.b.d("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", d, null);
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
                this.f1662b = "Flutter";
                this.f1663c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f1662b = null;
                this.f1663c = null;
            }
        }
        this.f1662b = null;
        this.f1663c = null;
    }
}
