package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;
public final class n2 {
    public final int f1400a;
    public int f1402c;
    public w d;
    public long f1403e;
    public long f1404f;
    public int f1405g;
    public int h;
    public boolean f1406i;
    public String f1408k;
    public int f1411n;
    public int f1412o;
    public int f1413p;
    public boolean f1414q;
    public boolean f1415r;
    public int f1416s;
    public final o2 f1417t;
    public final byte[] f1401b = new byte[16000];
    public String f1407j = "";
    public final ByteArrayOutputStream f1409l = new ByteArrayOutputStream();
    public final ByteArrayOutputStream f1410m = new ByteArrayOutputStream();

    public n2(o2 o2Var, int i7) {
        this.f1417t = o2Var;
        this.f1400a = i7;
    }

    public final void a() {
        if (this.f1412o >= 0 && !this.f1414q && this.d != null && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1409l;
            int size = byteArrayOutputStream.size();
            if (size - this.f1413p >= 16000) {
                this.f1413p = size;
                this.f1414q = true;
                DictationLid.j(byteArrayOutputStream.toByteArray(), DictationLid.f42592j[this.f1412o], new r1(this, this.f1411n, 2));
            }
        }
    }

    public final void b() {
        n2 n2Var;
        if (!this.f1407j.isEmpty()) {
            n2Var = this;
            org.telegram.messenger.g0.h3(new k2((Object) n2Var, this.f1404f, (Serializable) this.f1407j, true, 0));
            n2Var.f1407j = "";
        } else {
            n2Var = this;
        }
        o2 o2Var = n2Var.f1417t;
        long j3 = o2Var.f1426f;
        o2Var.f1426f = 1 + j3;
        n2Var.f1404f = j3;
        n2Var.f1410m.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        if (this.f1412o >= 0 && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1409l;
            int size = byteArrayOutputStream.size();
            ByteArrayOutputStream byteArrayOutputStream2 = this.f1410m;
            if (size > 1920000) {
                this.f1412o = -1;
                byteArrayOutputStream.reset();
                byteArrayOutputStream2.reset();
                return;
            }
            byteArrayOutputStream.write(bArr, i7, i10);
            byteArrayOutputStream2.write(bArr, i7, i10);
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.f1401b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - 16000, bArr2, 0, 16000);
            this.f1402c = 16000;
            return;
        }
        int min = Math.min(this.f1402c, 16000 - i10);
        System.arraycopy(bArr2, this.f1402c - min, bArr2, 0, min);
        System.arraycopy(bArr, i7, bArr2, min, i10);
        this.f1402c = min + i10;
    }

    public final void e() {
        int i7;
        this.f1411n++;
        this.f1409l.reset();
        this.f1410m.reset();
        if (this.f1417t.f1424c) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        this.f1412o = i7;
        this.f1413p = 0;
        this.f1415r = false;
    }
}
