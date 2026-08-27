package c9;

import android.content.Context;
import android.util.Log;
import f9.h;
import java.io.IOException;
import java.io.InputStream;
import n2.o;
import y5.l;

public final class b {

    public final int f2565a;

    public String f2566b;

    public String f2567c;

    public b() {
        this.f2565a = 2;
    }

    public o a() {
        if ("first_party".equals(this.f2567c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.f2566b == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.f2567c != null) {
            return new o(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public String toString() {
        switch (this.f2565a) {
            case 3:
                return this.f2566b + ", " + this.f2567c;
            default:
                return super.toString();
        }
    }

    public b(int i10, String str, String str2) {
        this.f2565a = i10;
        this.f2566b = str;
        this.f2567c = str2;
    }

    public b(String str, String str2) {
        this.f2565a = 5;
        l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f2566b = str;
        this.f2567c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public b(xe.b bVar) {
        this.f2565a = 0;
        Context context = (Context) bVar.f49392b;
        int iE = h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iE != 0) {
            this.f2566b = "Unity";
            String string = context.getResources().getString(iE);
            this.f2567c = string;
            String strE = s3.c.e("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strE, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f2566b = "Flutter";
                this.f2567c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f2566b = null;
        this.f2567c = null;
    }
}
