package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class c35 implements AutoCloseable {
    public final byte[] a;
    public boolean b;

    public c35(byte[] bArr) {
        if (bArr != null) {
            this.a = (byte[]) bArr.clone();
        } else {
            lq5.j("Missing recovery phrase");
            throw null;
        }
    }

    public static boolean e(byte b) {
        if (b != 32 && b != 9 && b != 10 && b != 13 && b != 12 && b != 11) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (!this.b) {
            return;
        }
        grb.i("Recovery phrase is closed");
    }

    public final synchronized c35 b() {
        a();
        return new c35(this.a);
    }

    public final synchronized byte[] c() {
        a();
        return (byte[]) this.a.clone();
    }

    @Override
    public final synchronized void close() {
        Arrays.fill(this.a, (byte) 0);
        this.b = true;
    }

    public final synchronized boolean d() {
        boolean z;
        if (g() == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        a();
        arrayList = new ArrayList();
        int i = 0;
        while (i < this.a.length) {
            while (true) {
                byte[] bArr = this.a;
                if (i >= bArr.length || !e(bArr[i])) {
                    break;
                }
                i++;
            }
            int i2 = i;
            while (true) {
                byte[] bArr2 = this.a;
                if (i2 >= bArr2.length || e(bArr2[i2])) {
                    break;
                }
                i2++;
            }
            if (i2 > i) {
                arrayList.add(new String(this.a, i, i2 - i, StandardCharsets.UTF_8));
            }
            i = i2;
        }
        return arrayList;
    }

    public final synchronized int g() {
        int i;
        a();
        i = 0;
        boolean z = false;
        for (byte b : this.a) {
            if (e(b)) {
                z = false;
            } else if (!z) {
                i++;
                z = true;
            }
        }
        return i;
    }

    public final String toString() {
        return "SecretPhrase[redacted]";
    }
}
