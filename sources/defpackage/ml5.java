package defpackage;

import android.net.Uri;
import java.util.Map;
public final class ml5 implements a83 {
    public final a83 a;
    public final int b;
    public final ru8 c;
    public final byte[] d;
    public int e;

    public ml5(a83 a83Var, int i, ru8 ru8Var) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        this.a = a83Var;
        this.b = i;
        this.c = ru8Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        this.a.addTransferListener(w0cVar);
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
    public final long open(g83 g83Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.e;
        a83 a83Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (a83Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = a83Var.read(bArr3, i4, i6);
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
                            yw7 yw7Var = new yw7(i5, bArr3);
                            ru8 ru8Var = this.c;
                            if (!ru8Var.y) {
                                max = ru8Var.s;
                            } else {
                                max = Math.max(ru8Var.E.m(true), ru8Var.s);
                            }
                            long j = max;
                            int a = yw7Var.a();
                            yzb yzbVar = ru8Var.x;
                            yzbVar.getClass();
                            yzbVar.e(a, yw7Var);
                            yzbVar.a(j, 1, a, 0, null);
                            ru8Var.y = true;
                        }
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int read2 = a83Var.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
