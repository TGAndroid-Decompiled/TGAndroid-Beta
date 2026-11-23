package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;
public final class h2 {
    public final int f1246a;
    public int f1248c;
    public t d;
    public long f1249e;
    public long f1250f;
    public int f1251g;
    public int h;
    public boolean f1252i;
    public String f1254k;
    public int f1255l;
    public String f1256m;
    public int f1257n;
    public int f1258o;
    public int f1261r;
    public int f1262s;
    public int f1263t;
    public boolean f1264u;
    public boolean v;
    public int f1265w;
    public final i2 f1266x;
    public final byte[] f1247b = new byte[16000];
    public String f1253j = "";
    public final ByteArrayOutputStream f1259p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream f1260q = new ByteArrayOutputStream();

    public h2(i2 i2Var, int i7) {
        this.f1266x = i2Var;
        this.f1246a = i7;
    }

    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.f1259p;
        if (this.f1262s >= 0 && !this.f1264u && this.d != null && DictationLid.f43042c != 0) {
            int size = byteArrayOutputStream.size();
            if (size - this.f1263t >= 16000) {
                this.f1263t = size;
                this.f1264u = true;
                int i7 = this.f1261r;
                DictationLid.h(DictationLid.f43047j[this.f1262s], new m1(this, i7, 1), null, byteArrayOutputStream.toByteArray());
            }
        }
    }

    public final void b() {
        h2 h2Var;
        if (!this.f1253j.isEmpty()) {
            h2Var = this;
            org.telegram.messenger.g0.g3(new e2((Object) h2Var, this.f1250f, (Serializable) this.f1253j, true, 0));
            h2Var.f1253j = "";
        } else {
            h2Var = this;
        }
        i2 i2Var = h2Var.f1266x;
        long j3 = i2Var.f1298f;
        i2Var.f1298f = 1 + j3;
        h2Var.f1250f = j3;
        h2Var.f1260q.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = this.f1260q;
        ByteArrayOutputStream byteArrayOutputStream2 = this.f1259p;
        if (this.f1262s >= 0 && DictationLid.f43042c != 0) {
            if (byteArrayOutputStream2.size() > 1920000) {
                this.f1262s = -1;
                byteArrayOutputStream2.reset();
                byteArrayOutputStream.reset();
                return;
            }
            byteArrayOutputStream2.write(bArr, i7, i10);
            byteArrayOutputStream.write(bArr, i7, i10);
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.f1247b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - 16000, bArr2, 0, 16000);
            this.f1248c = 16000;
            return;
        }
        int min = Math.min(this.f1248c, 16000 - i10);
        System.arraycopy(bArr2, this.f1248c - min, bArr2, 0, min);
        System.arraycopy(bArr, i7, bArr2, min, i10);
        this.f1248c = min + i10;
    }

    public final void e() {
        int i7;
        this.f1261r++;
        this.f1259p.reset();
        this.f1260q.reset();
        if (this.f1266x.f1296c) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        this.f1262s = i7;
        this.f1263t = 0;
        this.f1258o = 0;
        this.v = false;
    }
}
