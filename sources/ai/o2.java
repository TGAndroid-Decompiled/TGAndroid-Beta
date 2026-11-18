package ai;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.telegram.ui.Dictation.DictationLid;
public final class o2 {
    public final int f1397a;
    public int f1399c;
    public x d;
    public long f1400e;
    public long f1401f;
    public int f1402g;
    public int h;
    public boolean f1403i;
    public String f1405k;
    public int f1408n;
    public int f1409o;
    public int f1410p;
    public boolean f1411q;
    public boolean f1412r;
    public int f1413s;
    public final p2 f1414t;
    public final byte[] f1398b = new byte[16000];
    public String f1404j = "";
    public final ByteArrayOutputStream f1406l = new ByteArrayOutputStream();
    public final ByteArrayOutputStream f1407m = new ByteArrayOutputStream();

    public o2(p2 p2Var, int i7) {
        this.f1414t = p2Var;
        this.f1397a = i7;
    }

    public final void a() {
        if (this.f1409o >= 0 && !this.f1411q && this.d != null && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1406l;
            int size = byteArrayOutputStream.size();
            if (size - this.f1410p >= 16000) {
                this.f1410p = size;
                this.f1411q = true;
                DictationLid.j(byteArrayOutputStream.toByteArray(), DictationLid.f43037j[this.f1409o], new s1(this, this.f1408n, 2));
            }
        }
    }

    public final void b() {
        o2 o2Var;
        if (!this.f1404j.isEmpty()) {
            o2Var = this;
            org.telegram.messenger.g0.g3(new l2((Object) o2Var, this.f1401f, (Serializable) this.f1404j, true, 0));
            o2Var.f1404j = "";
        } else {
            o2Var = this;
        }
        p2 p2Var = o2Var.f1414t;
        long j3 = p2Var.f1424f;
        p2Var.f1424f = 1 + j3;
        o2Var.f1401f = j3;
        o2Var.f1407m.reset();
    }

    public final void c(int i7, int i10, byte[] bArr) {
        if (this.f1409o >= 0 && DictationLid.f()) {
            ByteArrayOutputStream byteArrayOutputStream = this.f1406l;
            int size = byteArrayOutputStream.size();
            ByteArrayOutputStream byteArrayOutputStream2 = this.f1407m;
            if (size > 1920000) {
                this.f1409o = -1;
                byteArrayOutputStream.reset();
                byteArrayOutputStream2.reset();
                return;
            }
            byteArrayOutputStream.write(bArr, i7, i10);
            byteArrayOutputStream2.write(bArr, i7, i10);
        }
    }

    public final void d(int i7, int i10, byte[] bArr) {
        byte[] bArr2 = this.f1398b;
        if (i10 >= 16000) {
            System.arraycopy(bArr, (i7 + i10) - 16000, bArr2, 0, 16000);
            this.f1399c = 16000;
            return;
        }
        int min = Math.min(this.f1399c, 16000 - i10);
        System.arraycopy(bArr2, this.f1399c - min, bArr2, 0, min);
        System.arraycopy(bArr, i7, bArr2, min, i10);
        this.f1399c = min + i10;
    }

    public final void e() {
        int i7;
        this.f1408n++;
        this.f1406l.reset();
        this.f1407m.reset();
        if (this.f1414t.f1422c) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        this.f1409o = i7;
        this.f1410p = 0;
        this.f1412r = false;
    }
}
