package o4;

import android.graphics.Paint;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dc0;
public final class g0 {
    public final int f16323a;
    public long f16324b;
    public final Object f16325c;
    public final Object d;
    public Object e;
    public Object f16326f;
    public Object f16327g;

    public g0(g5.q qVar) {
        this.f16325c = qVar;
        int i10 = qVar.f6411b;
        this.f16323a = i10;
        this.d = new h5.w(32);
        a4.c cVar = new a4.c(0L, i10);
        this.e = cVar;
        this.f16326f = cVar;
        this.f16327g = cVar;
    }

    public static a4.c d(a4.c cVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= cVar.f56b) {
            cVar = (a4.c) cVar.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (cVar.f56b - j10));
            g5.a aVar = (g5.a) cVar.f57c;
            byteBuffer.put(aVar.f6357a, ((int) (j10 - cVar.f55a)) + aVar.f6358b, min);
            i10 -= min;
            j10 += min;
            if (j10 == cVar.f56b) {
                cVar = (a4.c) cVar.d;
            }
        }
        return cVar;
    }

    public static a4.c e(a4.c cVar, long j10, byte[] bArr, int i10) {
        while (j10 >= cVar.f56b) {
            cVar = (a4.c) cVar.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (cVar.f56b - j10));
            g5.a aVar = (g5.a) cVar.f57c;
            System.arraycopy(aVar.f6357a, ((int) (j10 - cVar.f55a)) + aVar.f6358b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == cVar.f56b) {
                cVar = (a4.c) cVar.d;
            }
        }
        return cVar;
    }

    public static a4.c f(a4.c cVar, n3.i iVar, h0 h0Var, h5.w wVar) {
        boolean z4;
        if (iVar.d(1073741824)) {
            long j10 = h0Var.f16329a;
            int i10 = 1;
            wVar.C(1);
            a4.c e = e(cVar, j10, wVar.f6987a, 1);
            long j11 = j10 + 1;
            byte b10 = wVar.f6987a[0];
            if ((b10 & 128) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            n3.d dVar = iVar.f14226c;
            byte[] bArr = dVar.f14210a;
            if (bArr == null) {
                dVar.f14210a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = e(e, j11, dVar.f14210a, i11);
            long j12 = j11 + i11;
            if (z4) {
                wVar.C(2);
                cVar = e(cVar, j12, wVar.f6987a, 2);
                j12 += 2;
                i10 = wVar.z();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z4) {
                int i12 = i10 * 6;
                wVar.C(i12);
                cVar = e(cVar, j12, wVar.f6987a, i12);
                j12 += i12;
                wVar.F(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = wVar.z();
                    iArr2[i13] = wVar.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = h0Var.f16330b - ((int) (j12 - h0Var.f16329a));
            }
            r3.u uVar = (r3.u) h0Var.f16331c;
            int i14 = h5.d0.f6924a;
            byte[] bArr2 = uVar.f43276b;
            byte[] bArr3 = dVar.f14210a;
            int i15 = uVar.f43275a;
            int i16 = uVar.f43277c;
            int i17 = uVar.d;
            dVar.f14213f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f14211b = bArr2;
            dVar.f14210a = bArr3;
            dVar.f14212c = i15;
            dVar.f14214g = i16;
            dVar.h = i17;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f14215i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (h5.d0.f6924a >= 24) {
                n3.c cVar2 = dVar.f14216j;
                cVar2.getClass();
                n3.c.a(cVar2, i16, i17);
            }
            long j13 = h0Var.f16329a;
            int i18 = (int) (j12 - j13);
            h0Var.f16329a = j13 + i18;
            h0Var.f16330b -= i18;
        }
        if (iVar.d(268435456)) {
            wVar.C(4);
            a4.c e6 = e(cVar, h0Var.f16329a, wVar.f6987a, 4);
            int x10 = wVar.x();
            h0Var.f16329a += 4;
            h0Var.f16330b -= 4;
            iVar.k(x10);
            a4.c d = d(e6, h0Var.f16329a, iVar.d, x10);
            h0Var.f16329a += x10;
            int i19 = h0Var.f16330b - x10;
            h0Var.f16330b = i19;
            ByteBuffer byteBuffer = iVar.h;
            if (byteBuffer != null && byteBuffer.capacity() >= i19) {
                iVar.h.clear();
            } else {
                iVar.h = ByteBuffer.allocate(i19);
            }
            return d(d, h0Var.f16329a, iVar.h, h0Var.f16330b);
        }
        iVar.k(h0Var.f16330b);
        return d(cVar, h0Var.f16329a, iVar.d, h0Var.f16330b);
    }

    public void a(a4.c cVar) {
        if (((g5.a) cVar.f57c) == null) {
            return;
        }
        g5.q qVar = (g5.q) this.f16325c;
        synchronized (qVar) {
            a4.c cVar2 = cVar;
            while (cVar2 != null) {
                try {
                    g5.a[] aVarArr = qVar.f6413f;
                    int i10 = qVar.e;
                    qVar.e = i10 + 1;
                    g5.a aVar = (g5.a) cVar2.f57c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    qVar.d--;
                    cVar2 = (a4.c) cVar2.d;
                    if (cVar2 == null || ((g5.a) cVar2.f57c) == null) {
                        cVar2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.notifyAll();
        }
        cVar.f57c = null;
        cVar.d = null;
    }

    public void b(long j10) {
        a4.c cVar;
        if (j10 != -1) {
            while (true) {
                cVar = (a4.c) this.e;
                if (j10 < cVar.f56b) {
                    break;
                }
                g5.q qVar = (g5.q) this.f16325c;
                g5.a aVar = (g5.a) cVar.f57c;
                synchronized (qVar) {
                    g5.a[] aVarArr = qVar.f6413f;
                    int i10 = qVar.e;
                    qVar.e = i10 + 1;
                    aVarArr[i10] = aVar;
                    qVar.d--;
                    qVar.notifyAll();
                }
                a4.c cVar2 = (a4.c) this.e;
                cVar2.f57c = null;
                cVar2.d = null;
                this.e = (a4.c) cVar2.d;
            }
            if (((a4.c) this.f16326f).f55a < cVar.f55a) {
                this.f16326f = cVar;
            }
        }
    }

    public int c(int i10) {
        g5.a aVar;
        a4.c cVar = (a4.c) this.f16327g;
        if (((g5.a) cVar.f57c) == null) {
            g5.q qVar = (g5.q) this.f16325c;
            synchronized (qVar) {
                try {
                    int i11 = qVar.d + 1;
                    qVar.d = i11;
                    int i12 = qVar.e;
                    if (i12 > 0) {
                        g5.a[] aVarArr = qVar.f6413f;
                        int i13 = i12 - 1;
                        qVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        qVar.f6413f[qVar.e] = null;
                    } else {
                        g5.a aVar2 = new g5.a(new byte[qVar.f6411b], 0);
                        g5.a[] aVarArr2 = qVar.f6413f;
                        if (i11 > aVarArr2.length) {
                            qVar.f6413f = (g5.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a4.c cVar2 = new a4.c(((a4.c) this.f16327g).f56b, this.f16323a);
            cVar.f57c = aVar;
            cVar.d = cVar2;
        }
        return Math.min(i10, (int) (((a4.c) this.f16327g).f56b - this.f16324b));
    }

    public g0(dc0 dc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f16326f = paint;
        this.f16323a = 250;
        this.f16325c = dc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
