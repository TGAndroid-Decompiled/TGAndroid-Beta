package defpackage;

import java.io.ByteArrayOutputStream;
import org.telegram.ui.Dictation.DictationLid;
public final class t86 {
    public final int a;
    public int c;
    public rm3 d;
    public long e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public String m;
    public int n;
    public int o;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public final u86 x;
    public final byte[] b = new byte[16000];
    public String j = "";
    public final ByteArrayOutputStream p = new ByteArrayOutputStream();
    public final ByteArrayOutputStream q = new ByteArrayOutputStream();

    public t86(u86 u86Var, int i) {
        this.x = u86Var;
        this.a = i;
    }

    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.p;
        if (this.s >= 0 && !this.u && this.d != null && DictationLid.c != 0) {
            int size = byteArrayOutputStream.size();
            if (size - this.t >= 16000) {
                this.t = size;
                this.u = true;
                int i = this.r;
                DictationLid.i(DictationLid.j[this.s], new wg(this, i, (byte) 12), null, byteArrayOutputStream.toByteArray());
            }
        }
    }

    public final void b() {
        t86 t86Var;
        if (!this.j.isEmpty()) {
            t86Var = this;
            hl.c3(new j61((Object) t86Var, this.f, (Object) this.j, true, (byte) 2));
            t86Var.j = "";
        } else {
            t86Var = this;
        }
        u86 u86Var = t86Var.x;
        long j = u86Var.f;
        u86Var.f = 1 + j;
        t86Var.f = j;
        t86Var.q.reset();
    }

    public final void c(int i, int i2, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = this.q;
        ByteArrayOutputStream byteArrayOutputStream2 = this.p;
        if (this.s >= 0 && DictationLid.c != 0) {
            if (byteArrayOutputStream2.size() > 1920000) {
                this.s = -1;
                byteArrayOutputStream2.reset();
                byteArrayOutputStream.reset();
                return;
            }
            byteArrayOutputStream2.write(bArr, i, i2);
            byteArrayOutputStream.write(bArr, i, i2);
        }
    }

    public final void d(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.b;
        if (i2 >= 16000) {
            System.arraycopy(bArr, (i + i2) - 16000, bArr2, 0, 16000);
            this.c = 16000;
            return;
        }
        int min = Math.min(this.c, 16000 - i2);
        System.arraycopy(bArr2, this.c - min, bArr2, 0, min);
        System.arraycopy(bArr, i, bArr2, min, i2);
        this.c = min + i2;
    }

    public final void e() {
        int i;
        this.r++;
        this.p.reset();
        this.q.reset();
        if (this.x.c) {
            i = 0;
        } else {
            i = -1;
        }
        this.s = i;
        this.t = 0;
        this.o = 0;
        this.v = false;
    }
}
