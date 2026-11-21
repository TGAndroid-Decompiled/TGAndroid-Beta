package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;
public final class q2 {
    public final int f1420a;
    public int f1422c;
    public x d;
    public long f1423e;
    public long f1424f;
    public int f1425g;
    public int h;
    public boolean f1426i;
    public String f1428k;
    public int f1431n;
    public int f1432o;
    public int f1433p;
    public boolean f1434q;
    public boolean f1435r;
    public int f1436s;
    public final r2 f1437t;
    public final byte[] f1421b = new byte[16000];
    public String f1427j = "";
    public final ByteArrayOutputStream f1429l = new ByteArrayOutputStream();
    public final ByteArrayOutputStream f1430m = new ByteArrayOutputStream();

    public q2(r2 r2Var, int i7) {
        this.f1437t = r2Var;
        this.f1420a = i7;
    }

    public final void a() {
        if (this.f1432o >= 0 && !this.f1434q && this.d != null && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1429l;
            int size = byteArrayOutputStream.size();
            if (size - this.f1433p >= 16000) {
                this.f1433p = size;
                this.f1434q = true;
                DictationLid.j(byteArrayOutputStream.toByteArray(), DictationLid.f43078j[this.f1432o], new u1(this, this.f1431n, 2));
            }
        }
    }

    public final void b() {
        q2 q2Var;
        if (!this.f1427j.isEmpty()) {
            q2Var = this;
            org.telegram.messenger.g0.g3(new n2((Object) q2Var, this.f1424f, (Serializable) this.f1427j, true, 0));
            q2Var.f1427j = "";
        } else {
            q2Var = this;
        }
        r2 r2Var = q2Var.f1437t;
        long j3 = r2Var.f1449f;
        r2Var.f1449f = 1 + j3;
        q2Var.f1424f = j3;
        q2Var.f1430m.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        if (this.f1432o >= 0 && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1429l;
            int size = byteArrayOutputStream.size();
            ByteArrayOutputStream byteArrayOutputStream2 = this.f1430m;
            if (size > 1920000) {
                this.f1432o = -1;
                byteArrayOutputStream.reset();
                byteArrayOutputStream2.reset();
                return;
            }
            byteArrayOutputStream.write(bArr, i7, i10);
            byteArrayOutputStream2.write(bArr, i7, i10);
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.f1421b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - 16000, bArr2, 0, 16000);
            this.f1422c = 16000;
            return;
        }
        int min = Math.min(this.f1422c, 16000 - i10);
        System.arraycopy(bArr2, this.f1422c - min, bArr2, 0, min);
        System.arraycopy(bArr, i7, bArr2, min, i10);
        this.f1422c = min + i10;
    }

    public final void e() {
        int i7;
        this.f1431n++;
        this.f1429l.reset();
        this.f1430m.reset();
        if (this.f1437t.f1447c) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        this.f1432o = i7;
        this.f1433p = 0;
        this.f1435r = false;
    }
}
