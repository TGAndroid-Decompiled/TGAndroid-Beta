package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
public final class mt2 implements ys3, zcd {
    public final byte a;
    public String b;

    public mt2(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public static mt2 c(ey7 ey7Var) {
        String str;
        String str2;
        ey7Var.O(2);
        int A = ey7Var.A();
        int i = A >> 1;
        int A2 = ((A & 1) << 5) | ((ey7Var.A() >> 3) & 31);
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
        return new mt2(sb.toString(), (byte) 1);
    }

    @Override
    public final int a(int i) {
        return -1;
    }

    @Override
    public final boolean b(int i) {
        return false;
    }

    @Override
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override
    public final int length() {
        return this.b.length();
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override
    public final Object zzp() {
        Object obj;
        boolean z;
        String str = this.b;
        ContentResolver contentResolver = zad.g.getContentResolver();
        Uri uri = gmf.a;
        synchronized (gmf.class) {
            gmf.c(contentResolver);
            obj = gmf.k;
        }
        HashMap hashMap = gmf.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) gmf.a(hashMap, str, bool);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            String b = gmf.b(contentResolver, str);
            boolean z2 = false;
            if (b != null && !b.equals("")) {
                if (gmf.c.matcher(b).matches()) {
                    bool = Boolean.TRUE;
                    z2 = true;
                } else if (!gmf.d.matcher(b).matches()) {
                    Log.w("Gservices", c00.j("attempt to read gservices key ", str, " (value \"", b, "\") as boolean"));
                }
                gmf.e(obj, hashMap, str, bool);
                z = z2;
            }
            bool = bool2;
            gmf.e(obj, hashMap, str, bool);
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    public mt2(byte b) {
        this.a = b;
    }
}
