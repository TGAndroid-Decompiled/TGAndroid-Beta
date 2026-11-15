package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;
public final class o2 {
    public final int f1406a;
    public int f1408c;
    public x d;
    public long f1409e;
    public long f1410f;
    public int f1411g;
    public int h;
    public boolean f1412i;
    public String f1414k;
    public int f1417n;
    public int f1418o;
    public int f1419p;
    public boolean f1420q;
    public boolean f1421r;
    public int f1422s;
    public final p2 f1423t;
    public final byte[] f1407b = new byte[16000];
    public String f1413j = "";
    public final ByteArrayOutputStream f1415l = new ByteArrayOutputStream();
    public final ByteArrayOutputStream f1416m = new ByteArrayOutputStream();

    public o2(p2 p2Var, int i7) {
        this.f1423t = p2Var;
        this.f1406a = i7;
    }

    public final void a() {
        if (this.f1418o >= 0 && !this.f1420q && this.d != null && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1415l;
            int size = byteArrayOutputStream.size();
            if (size - this.f1419p >= 16000) {
                this.f1419p = size;
                this.f1420q = true;
                DictationLid.j(byteArrayOutputStream.toByteArray(), DictationLid.f42592j[this.f1418o], new s1(this, this.f1417n, 2));
            }
        }
    }

    public final void b() {
        o2 o2Var;
        if (!this.f1413j.isEmpty()) {
            o2Var = this;
            org.telegram.messenger.g0.h3(new l2((Object) o2Var, this.f1410f, (Serializable) this.f1413j, true, 0));
            o2Var.f1413j = "";
        } else {
            o2Var = this;
        }
        p2 p2Var = o2Var.f1423t;
        long j3 = p2Var.f1433f;
        p2Var.f1433f = 1 + j3;
        o2Var.f1410f = j3;
        o2Var.f1416m.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        if (this.f1418o >= 0 && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1415l;
            int size = byteArrayOutputStream.size();
            ByteArrayOutputStream byteArrayOutputStream2 = this.f1416m;
            if (size > 1920000) {
                this.f1418o = -1;
                byteArrayOutputStream.reset();
                byteArrayOutputStream2.reset();
                return;
            }
            byteArrayOutputStream.write(bArr, i7, i10);
            byteArrayOutputStream2.write(bArr, i7, i10);
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.f1407b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - 16000, bArr2, 0, 16000);
            this.f1408c = 16000;
            return;
        }
        int min = Math.min(this.f1408c, 16000 - i10);
        System.arraycopy(bArr2, this.f1408c - min, bArr2, 0, min);
        System.arraycopy(bArr, i7, bArr2, min, i10);
        this.f1408c = min + i10;
    }

    public final void e() {
        int i7;
        this.f1417n++;
        this.f1415l.reset();
        this.f1416m.reset();
        if (this.f1423t.f1431c) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        this.f1418o = i7;
        this.f1419p = 0;
        this.f1421r = false;
    }
}
