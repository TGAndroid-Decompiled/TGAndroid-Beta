package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;
public final class i2 {
    public final int f1260a;
    public int f1262c;
    public u d;
    public long f1263e;
    public long f1264f;
    public int f1265g;
    public int h;
    public boolean f1266i;
    public String f1268k;
    public int f1269l;
    public String f1270m;
    public int f1271n;
    public int f1272o;
    public int f1275r;
    public int f1276s;
    public int f1277t;
    public boolean f1278u;
    public boolean v;
    public int f1279w;
    public final j2 f1280x;
    public final byte[] f1261b = new byte[16000];
    public String f1267j = "";
    public final ByteArrayOutputStream f1273p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream f1274q = new ByteArrayOutputStream();

    public i2(j2 j2Var, int i7) {
        this.f1280x = j2Var;
        this.f1260a = i7;
    }

    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.f1273p;
        if (this.f1276s >= 0 && !this.f1278u && this.d != null && DictationLid.f43152c != 0) {
            int size = byteArrayOutputStream.size();
            if (size - this.f1277t >= 16000) {
                this.f1277t = size;
                this.f1278u = true;
                int i7 = this.f1275r;
                DictationLid.h(DictationLid.f43157j[this.f1276s], new n1(this, i7, 1), null, byteArrayOutputStream.toByteArray());
            }
        }
    }

    public final void b() {
        i2 i2Var;
        if (!this.f1267j.isEmpty()) {
            i2Var = this;
            org.telegram.messenger.g0.g3(new f2((Object) i2Var, this.f1264f, (Serializable) this.f1267j, true, 0));
            i2Var.f1267j = "";
        } else {
            i2Var = this;
        }
        j2 j2Var = i2Var.f1280x;
        long j3 = j2Var.f1315f;
        j2Var.f1315f = 1 + j3;
        i2Var.f1264f = j3;
        i2Var.f1274q.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = this.f1274q;
        ByteArrayOutputStream byteArrayOutputStream2 = this.f1273p;
        if (this.f1276s >= 0 && DictationLid.f43152c != 0) {
            if (byteArrayOutputStream2.size() > 1920000) {
                this.f1276s = -1;
                byteArrayOutputStream2.reset();
                byteArrayOutputStream.reset();
                return;
            }
            byteArrayOutputStream2.write(bArr, i7, i10);
            byteArrayOutputStream.write(bArr, i7, i10);
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.f1261b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - 16000, bArr2, 0, 16000);
            this.f1262c = 16000;
            return;
        }
        int min = Math.min(this.f1262c, 16000 - i10);
        System.arraycopy(bArr2, this.f1262c - min, bArr2, 0, min);
        System.arraycopy(bArr, i7, bArr2, min, i10);
        this.f1262c = min + i10;
    }

    public final void e() {
        int i7;
        this.f1275r++;
        this.f1273p.reset();
        this.f1274q.reset();
        if (this.f1280x.f1313c) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        this.f1276s = i7;
        this.f1277t = 0;
        this.f1272o = 0;
        this.v = false;
    }
}
