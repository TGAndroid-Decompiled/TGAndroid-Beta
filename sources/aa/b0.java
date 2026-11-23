package aa;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.vision.e2;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.internal.clearcut.g {
    public String f782a;

    public b0(String str) {
        this.f782a = str;
    }

    public static b0 a(h2.x xVar) {
        String str;
        String str2;
        xVar.O(2);
        int A = xVar.A();
        int i7 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i7 != 4 && i7 != 5 && i7 != 7 && i7 != 8) {
            if (i7 == 9) {
                str = "dvav";
            } else if (i7 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder m10 = e2.m(str);
        String str3 = ".";
        if (i7 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        m10.append(str2);
        m10.append(i7);
        if (A2 < 10) {
            str3 = ".0";
        }
        m10.append(str3);
        m10.append(A2);
        return new b0(m10.toString());
    }

    @Override
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.f782a;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.f6800g.getContentResolver();
        Uri uri = d2.f6815a;
        synchronized (d2.class) {
            d2.c(contentResolver);
            obj = d2.f6823k;
        }
        HashMap hashMap = d2.f6820g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) d2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = d2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (d2.f6817c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!d2.d.matcher(b10).matches()) {
                    Log.w("Gservices", p5.c.l("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                d2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            d2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
