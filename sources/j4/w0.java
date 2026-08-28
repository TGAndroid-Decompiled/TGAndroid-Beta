package j4;

import android.graphics.Paint;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ib0;
public final class w0 {
    public final int f13592a;
    public long f13593b;
    public final Object f13594c;
    public final Object d;
    public Object f13595e;
    public Object f13596f;
    public Object f13597g;

    public w0(com.google.android.exoplayer2.upstream.r rVar) {
        this.f13594c = rVar;
        int i9 = rVar.f2597b;
        this.f13592a = i9;
        this.d = new d5.y(32);
        v0 v0Var = new v0(0L, i9);
        this.f13595e = v0Var;
        this.f13596f = v0Var;
        this.f13597g = v0Var;
    }

    public static v0 d(v0 v0Var, long j10, ByteBuffer byteBuffer, int i9) {
        while (j10 >= v0Var.f13589b) {
            v0Var = (v0) v0Var.d;
        }
        while (i9 > 0) {
            int min = Math.min(i9, (int) (v0Var.f13589b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f13590c;
            byteBuffer.put(aVar.f2520a, ((int) (j10 - v0Var.f13588a)) + aVar.f2521b, min);
            i9 -= min;
            j10 += min;
            if (j10 == v0Var.f13589b) {
                v0Var = (v0) v0Var.d;
            }
        }
        return v0Var;
    }

    public static v0 e(v0 v0Var, long j10, byte[] bArr, int i9) {
        while (j10 >= v0Var.f13589b) {
            v0Var = (v0) v0Var.d;
        }
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (v0Var.f13589b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f13590c;
            System.arraycopy(aVar.f2520a, ((int) (j10 - v0Var.f13588a)) + aVar.f2521b, bArr, i9 - i10, min);
            i10 -= min;
            j10 += min;
            if (j10 == v0Var.f13589b) {
                v0Var = (v0) v0Var.d;
            }
        }
        return v0Var;
    }

    public static v0 f(v0 v0Var, k3.i iVar, x0 x0Var, d5.y yVar) {
        boolean z10;
        if (iVar.getFlag(1073741824)) {
            long j10 = x0Var.f13606a;
            int i9 = 1;
            yVar.z(1);
            v0 e10 = e(v0Var, j10, yVar.f4410a, 1);
            long j11 = j10 + 1;
            byte b10 = yVar.f4410a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = b10 & Byte.MAX_VALUE;
            k3.d dVar = iVar.f14607a;
            byte[] bArr = dVar.f14589a;
            if (bArr == null) {
                dVar.f14589a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            v0Var = e(e10, j11, dVar.f14589a, i10);
            long j12 = j11 + i10;
            if (z10) {
                yVar.z(2);
                v0Var = e(v0Var, j12, yVar.f4410a, 2);
                j12 += 2;
                i9 = yVar.w();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i9) {
                iArr = new int[i9];
            }
            int[] iArr2 = dVar.f14592e;
            if (iArr2 == null || iArr2.length < i9) {
                iArr2 = new int[i9];
            }
            if (z10) {
                int i11 = i9 * 6;
                yVar.z(i11);
                v0Var = e(v0Var, j12, yVar.f4410a, i11);
                j12 += i11;
                yVar.C(0);
                for (int i12 = 0; i12 < i9; i12++) {
                    iArr[i12] = yVar.w();
                    iArr2[i12] = yVar.u();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = x0Var.f13607b - ((int) (j12 - x0Var.f13606a));
            }
            m3.v vVar = (m3.v) x0Var.f13608c;
            int i13 = d5.f0.f4349a;
            byte[] bArr2 = vVar.f17262b;
            byte[] bArr3 = dVar.f14589a;
            int i14 = vVar.f17261a;
            int i15 = vVar.f17263c;
            int i16 = vVar.d;
            dVar.f14593f = i9;
            dVar.d = iArr;
            dVar.f14592e = iArr2;
            dVar.f14590b = bArr2;
            dVar.f14589a = bArr3;
            dVar.f14591c = i14;
            dVar.f14594g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f14595i;
            cryptoInfo.numSubSamples = i9;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (d5.f0.f4349a >= 24) {
                k3.c cVar = dVar.f14596j;
                cVar.getClass();
                k3.c.a(cVar, i15, i16);
            }
            long j13 = x0Var.f13606a;
            int i17 = (int) (j12 - j13);
            x0Var.f13606a = j13 + i17;
            x0Var.f13607b -= i17;
        }
        if (iVar.hasSupplementalData()) {
            yVar.z(4);
            v0 e11 = e(v0Var, x0Var.f13606a, yVar.f4410a, 4);
            int u10 = yVar.u();
            x0Var.f13606a += 4;
            x0Var.f13607b -= 4;
            iVar.c(u10);
            v0 d = d(e11, x0Var.f13606a, iVar.f14608b, u10);
            x0Var.f13606a += u10;
            int i18 = x0Var.f13607b - u10;
            x0Var.f13607b = i18;
            ByteBuffer byteBuffer = iVar.f14610e;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                iVar.f14610e.clear();
            } else {
                iVar.f14610e = ByteBuffer.allocate(i18);
            }
            return d(d, x0Var.f13606a, iVar.f14610e, x0Var.f13607b);
        }
        iVar.c(x0Var.f13607b);
        return d(v0Var, x0Var.f13606a, iVar.f14608b, x0Var.f13607b);
    }

    public void a(v0 v0Var) {
        if (((com.google.android.exoplayer2.upstream.a) v0Var.f13590c) == null) {
            return;
        }
        com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f13594c;
        synchronized (rVar) {
            v0 v0Var2 = v0Var;
            while (v0Var2 != null) {
                try {
                    com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f2600f;
                    int i9 = rVar.f2599e;
                    rVar.f2599e = i9 + 1;
                    com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var2.f13590c;
                    aVar.getClass();
                    aVarArr[i9] = aVar;
                    rVar.d--;
                    v0Var2 = (v0) v0Var2.d;
                    if (v0Var2 == null || ((com.google.android.exoplayer2.upstream.a) v0Var2.f13590c) == null) {
                        v0Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.notifyAll();
        }
        v0Var.f13590c = null;
        v0Var.d = null;
    }

    public void b(long j10) {
        v0 v0Var;
        if (j10 != -1) {
            while (true) {
                v0Var = (v0) this.f13595e;
                if (j10 < v0Var.f13589b) {
                    break;
                }
                com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f13594c;
                com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f13590c;
                synchronized (rVar) {
                    com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f2600f;
                    int i9 = rVar.f2599e;
                    rVar.f2599e = i9 + 1;
                    aVarArr[i9] = aVar;
                    rVar.d--;
                    rVar.notifyAll();
                }
                v0 v0Var2 = (v0) this.f13595e;
                v0Var2.f13590c = null;
                v0Var2.d = null;
                this.f13595e = (v0) v0Var2.d;
            }
            if (((v0) this.f13596f).f13588a < v0Var.f13588a) {
                this.f13596f = v0Var;
            }
        }
    }

    public int c(int i9) {
        com.google.android.exoplayer2.upstream.a aVar;
        v0 v0Var = (v0) this.f13597g;
        if (((com.google.android.exoplayer2.upstream.a) v0Var.f13590c) == null) {
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f13594c;
            synchronized (rVar) {
                try {
                    int i10 = rVar.d + 1;
                    rVar.d = i10;
                    int i11 = rVar.f2599e;
                    if (i11 > 0) {
                        com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f2600f;
                        int i12 = i11 - 1;
                        rVar.f2599e = i12;
                        aVar = aVarArr[i12];
                        aVar.getClass();
                        rVar.f2600f[rVar.f2599e] = null;
                    } else {
                        com.google.android.exoplayer2.upstream.a aVar2 = new com.google.android.exoplayer2.upstream.a(new byte[rVar.f2597b], 0);
                        com.google.android.exoplayer2.upstream.a[] aVarArr2 = rVar.f2600f;
                        if (i10 > aVarArr2.length) {
                            rVar.f2600f = (com.google.android.exoplayer2.upstream.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            v0 v0Var2 = new v0(((v0) this.f13597g).f13589b, this.f13592a);
            v0Var.f13590c = aVar;
            v0Var.d = v0Var2;
        }
        return Math.min(i9, (int) (((v0) this.f13597g).f13589b - this.f13593b));
    }

    public w0(ib0 ib0Var) {
        this.d = new ArrayList(50);
        this.f13595e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f13596f = paint;
        this.f13592a = 250;
        this.f13594c = ib0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
