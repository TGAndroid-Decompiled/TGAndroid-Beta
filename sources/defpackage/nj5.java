package defpackage;

import android.net.Uri;
import java.util.Map;
public final class nj5 implements o63 {
    public final o63 a;
    public final int b;
    public final qs8 c;
    public final byte[] d;
    public int e;

    public nj5(o63 o63Var, int i, qs8 qs8Var) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        this.a = o63Var;
        this.b = i;
        this.c = qs8Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        this.a.addTransferListener(vybVar);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override
    public final long open(u63 u63Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.e;
        o63 o63Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (o63Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = o63Var.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (true) {
                        if (i5 <= 0) {
                            break;
                        } else if (bArr3[i5 - 1] == 0) {
                            i5--;
                        } else {
                            xu7 xu7Var = new xu7(i5, bArr3);
                            qs8 qs8Var = this.c;
                            if (!qs8Var.y) {
                                max = qs8Var.s;
                            } else {
                                max = Math.max(qs8Var.E.j(true), qs8Var.s);
                            }
                            long j = max;
                            int a = xu7Var.a();
                            wxb wxbVar = qs8Var.x;
                            wxbVar.getClass();
                            wxbVar.e(a, xu7Var);
                            wxbVar.a(j, 1, a, 0, null);
                            qs8Var.y = true;
                        }
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int read2 = o63Var.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
