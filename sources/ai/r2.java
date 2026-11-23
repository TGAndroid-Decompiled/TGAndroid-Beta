package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;
public final class r2 {
    public final int f1437a;
    public int f1439c;
    public x d;
    public long f1440e;
    public long f1441f;
    public int f1442g;
    public int h;
    public boolean f1443i;
    public String f1445k;
    public int f1446l;
    public String f1447m;
    public int f1448n;
    public int f1449o;
    public int f1452r;
    public int f1453s;
    public int f1454t;
    public boolean f1455u;
    public boolean v;
    public int f1456w;
    public final s2 f1457x;
    public final byte[] f1438b = new byte[16000];
    public String f1444j = "";
    public final ByteArrayOutputStream f1450p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream f1451q = new ByteArrayOutputStream();

    public r2(s2 s2Var, int i7) {
        this.f1457x = s2Var;
        this.f1437a = i7;
    }

    public final void a() {
        if (this.f1453s >= 0 && !this.f1455u && this.d != null && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1450p;
            int size = byteArrayOutputStream.size();
            if (size - this.f1454t >= 16000) {
                this.f1454t = size;
                this.f1455u = true;
                int i7 = this.f1452r;
                DictationLid.j(DictationLid.f43082k[this.f1453s], new v1(this, i7, 2), null, byteArrayOutputStream.toByteArray());
            }
        }
    }

    public final void b() {
        r2 r2Var;
        if (!this.f1444j.isEmpty()) {
            r2Var = this;
            org.telegram.messenger.g0.g3(new o2((Object) r2Var, this.f1441f, (Serializable) this.f1444j, true, 0));
            r2Var.f1444j = "";
        } else {
            r2Var = this;
        }
        s2 s2Var = r2Var.f1457x;
        long j3 = s2Var.f1515f;
        s2Var.f1515f = 1 + j3;
        r2Var.f1441f = j3;
        r2Var.f1451q.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        if (this.f1453s >= 0 && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1450p;
            int size = byteArrayOutputStream.size();
            ByteArrayOutputStream byteArrayOutputStream2 = this.f1451q;
            if (size > 1920000) {
                this.f1453s = -1;
                byteArrayOutputStream.reset();
                byteArrayOutputStream2.reset();
                return;
            }
            byteArrayOutputStream.write(bArr, i7, i10);
            byteArrayOutputStream2.write(bArr, i7, i10);
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.f1438b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - 16000, bArr2, 0, 16000);
            this.f1439c = 16000;
            return;
        }
        int min = Math.min(this.f1439c, 16000 - i10);
        System.arraycopy(bArr2, this.f1439c - min, bArr2, 0, min);
        System.arraycopy(bArr, i7, bArr2, min, i10);
        this.f1439c = min + i10;
    }

    public final void e() {
        int i7;
        this.f1452r++;
        this.f1450p.reset();
        this.f1451q.reset();
        if (this.f1457x.f1513c) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        this.f1453s = i7;
        this.f1454t = 0;
        this.f1449o = 0;
        this.v = false;
    }
}
