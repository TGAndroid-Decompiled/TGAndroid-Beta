package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
public final class ss2 implements g8d {
    public String a;

    public ss2(String str) {
        this.a = str;
    }

    public static ss2 a(xu7 xu7Var) {
        String str;
        String str2;
        xu7Var.O(2);
        int A = xu7Var.A();
        int i = A >> 1;
        int A2 = ((A & 1) << 5) | ((xu7Var.A() >> 3) & 31);
        if (i != 4 && i != 5 && i != 7 && i != 8) {
            if (i == 9) {
                str = "dvav";
            } else if (i == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder(str);
        String str3 = ".";
        if (i >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        sb.append(str2);
        sb.append(i);
        if (A2 < 10) {
            str3 = ".0";
        }
        sb.append(str3);
        sb.append(A2);
        return new ss2(sb.toString());
    }

    @Override
    public final Object zzp() {
        Object obj;
        boolean z;
        String str = this.a;
        ContentResolver contentResolver = g6d.g.getContentResolver();
        Uri uri = qhf.a;
        synchronized (qhf.class) {
            qhf.c(contentResolver);
            obj = qhf.k;
        }
        HashMap hashMap = qhf.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) qhf.a(hashMap, str, bool);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            String b = qhf.b(contentResolver, str);
            boolean z2 = false;
            if (b != null && !b.equals("")) {
                if (qhf.c.matcher(b).matches()) {
                    bool = Boolean.TRUE;
                    z2 = true;
                } else if (!qhf.d.matcher(b).matches()) {
                    Log.w("Gservices", b00.i("attempt to read gservices key ", str, " (value \"", b, "\") as boolean"));
                }
                qhf.e(obj, hashMap, str, bool);
                z = z2;
            }
            bool = bool2;
            qhf.e(obj, hashMap, str, bool);
            z = z2;
        }
        return Boolean.valueOf(z);
    }
}
