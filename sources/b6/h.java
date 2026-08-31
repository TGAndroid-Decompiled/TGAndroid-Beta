package b6;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.telegram.ui.yh;
public final class h {
    public final int f1727a;
    public String f1728b;
    public String f1729c;

    public h() {
        this.f1727a = 3;
    }

    public p2.p a() {
        if (!"first_party".equals(this.f1729c)) {
            if (this.f1728b != null) {
                if (this.f1729c != null) {
                    return new p2.p(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f1727a) {
            case 4:
                return this.f1728b + ", " + this.f1729c;
            default:
                return super.toString();
        }
    }

    public h(int i10, String str, String str2) {
        this.f1727a = i10;
        this.f1728b = str;
        this.f1729c = str2;
    }

    public h(String str, String str2) {
        this.f1727a = 0;
        m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f1728b = str;
        this.f1729c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public h(f7.b bVar) {
        this.f1727a = 1;
        Context context = (Context) bVar.f6120b;
        int e6 = i9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e6 != 0) {
            this.f1728b = "Unity";
            String string = context.getResources().getString(e6);
            this.f1729c = string;
            String k10 = yh.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", k10, null);
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
                this.f1728b = "Flutter";
                this.f1729c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f1728b = null;
                this.f1729c = null;
            }
        }
        this.f1728b = null;
        this.f1729c = null;
    }
}
