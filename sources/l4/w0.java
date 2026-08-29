package l4;

import android.graphics.Paint;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xb0;
public final class w0 {
    public final int f14458a;
    public long f14459b;
    public final Object f14460c;
    public final Object d;
    public Object f14461e;
    public Object f14462f;
    public Object f14463g;

    public w0(com.google.android.exoplayer2.upstream.r rVar) {
        this.f14460c = rVar;
        int i10 = rVar.f3611b;
        this.f14458a = i10;
        this.d = new f5.w(32);
        v0 v0Var = new v0(0L, i10);
        this.f14461e = v0Var;
        this.f14462f = v0Var;
        this.f14463g = v0Var;
    }

    public static v0 d(v0 v0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= v0Var.f14448b) {
            v0Var = (v0) v0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (v0Var.f14448b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f14449c;
            byteBuffer.put(aVar.f3534a, ((int) (j10 - v0Var.f14447a)) + aVar.f3535b, min);
            i10 -= min;
            j10 += min;
            if (j10 == v0Var.f14448b) {
                v0Var = (v0) v0Var.d;
            }
        }
        return v0Var;
    }

    public static v0 e(v0 v0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= v0Var.f14448b) {
            v0Var = (v0) v0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (v0Var.f14448b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f14449c;
            System.arraycopy(aVar.f3534a, ((int) (j10 - v0Var.f14447a)) + aVar.f3535b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == v0Var.f14448b) {
                v0Var = (v0) v0Var.d;
            }
        }
        return v0Var;
    }

    public static v0 f(v0 v0Var, m3.i iVar, y0 y0Var, f5.w wVar) {
        boolean z10;
        if (iVar.getFlag(1073741824)) {
            long j10 = y0Var.f14471a;
            int i10 = 1;
            wVar.z(1);
            v0 e10 = e(v0Var, j10, wVar.f6640a, 1);
            long j11 = j10 + 1;
            byte b10 = wVar.f6640a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            m3.d dVar = iVar.f16827a;
            byte[] bArr = dVar.f16809a;
            if (bArr == null) {
                dVar.f16809a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            v0Var = e(e10, j11, dVar.f16809a, i11);
            long j12 = j11 + i11;
            if (z10) {
                wVar.z(2);
                v0Var = e(v0Var, j12, wVar.f6640a, 2);
                j12 += 2;
                i10 = wVar.w();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f16812e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                wVar.z(i12);
                v0Var = e(v0Var, j12, wVar.f6640a, i12);
                j12 += i12;
                wVar.C(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = wVar.w();
                    iArr2[i13] = wVar.u();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = y0Var.f14472b - ((int) (j12 - y0Var.f14471a));
            }
            o3.v vVar = (o3.v) y0Var.f14473c;
            int i14 = f5.d0.f6579a;
            byte[] bArr2 = vVar.f19121b;
            byte[] bArr3 = dVar.f16809a;
            int i15 = vVar.f19120a;
            int i16 = vVar.f19122c;
            int i17 = vVar.d;
            dVar.f16813f = i10;
            dVar.d = iArr;
            dVar.f16812e = iArr2;
            dVar.f16810b = bArr2;
            dVar.f16809a = bArr3;
            dVar.f16811c = i15;
            dVar.f16814g = i16;
            dVar.h = i17;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f16815i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (f5.d0.f6579a >= 24) {
                m3.c cVar = dVar.f16816j;
                cVar.getClass();
                m3.c.a(cVar, i16, i17);
            }
            long j13 = y0Var.f14471a;
            int i18 = (int) (j12 - j13);
            y0Var.f14471a = j13 + i18;
            y0Var.f14472b -= i18;
        }
        if (iVar.hasSupplementalData()) {
            wVar.z(4);
            v0 e11 = e(v0Var, y0Var.f14471a, wVar.f6640a, 4);
            int u10 = wVar.u();
            y0Var.f14471a += 4;
            y0Var.f14472b -= 4;
            iVar.b(u10);
            v0 d = d(e11, y0Var.f14471a, iVar.f16828b, u10);
            y0Var.f14471a += u10;
            int i19 = y0Var.f14472b - u10;
            y0Var.f14472b = i19;
            ByteBuffer byteBuffer = iVar.f16830e;
            if (byteBuffer != null && byteBuffer.capacity() >= i19) {
                iVar.f16830e.clear();
            } else {
                iVar.f16830e = ByteBuffer.allocate(i19);
            }
            return d(d, y0Var.f14471a, iVar.f16830e, y0Var.f14472b);
        }
        iVar.b(y0Var.f14472b);
        return d(v0Var, y0Var.f14471a, iVar.f16828b, y0Var.f14472b);
    }

    public void a(v0 v0Var) {
        if (((com.google.android.exoplayer2.upstream.a) v0Var.f14449c) == null) {
            return;
        }
        com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f14460c;
        synchronized (rVar) {
            v0 v0Var2 = v0Var;
            while (v0Var2 != null) {
                try {
                    com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f3614f;
                    int i10 = rVar.f3613e;
                    rVar.f3613e = i10 + 1;
                    com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var2.f14449c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    rVar.d--;
                    v0Var2 = (v0) v0Var2.d;
                    if (v0Var2 == null || ((com.google.android.exoplayer2.upstream.a) v0Var2.f14449c) == null) {
                        v0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            rVar.notifyAll();
        }
        v0Var.f14449c = null;
        v0Var.d = null;
    }

    public void b(long j10) {
        v0 v0Var;
        if (j10 != -1) {
            while (true) {
                v0Var = (v0) this.f14461e;
                if (j10 < v0Var.f14448b) {
                    break;
                }
                com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f14460c;
                com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f14449c;
                synchronized (rVar) {
                    com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f3614f;
                    int i10 = rVar.f3613e;
                    rVar.f3613e = i10 + 1;
                    aVarArr[i10] = aVar;
                    rVar.d--;
                    rVar.notifyAll();
                }
                v0 v0Var2 = (v0) this.f14461e;
                v0Var2.f14449c = null;
                v0Var2.d = null;
                this.f14461e = (v0) v0Var2.d;
            }
            if (((v0) this.f14462f).f14447a < v0Var.f14447a) {
                this.f14462f = v0Var;
            }
        }
    }

    public int c(int i10) {
        com.google.android.exoplayer2.upstream.a aVar;
        v0 v0Var = (v0) this.f14463g;
        if (((com.google.android.exoplayer2.upstream.a) v0Var.f14449c) == null) {
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f14460c;
            synchronized (rVar) {
                try {
                    int i11 = rVar.d + 1;
                    rVar.d = i11;
                    int i12 = rVar.f3613e;
                    if (i12 > 0) {
                        com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f3614f;
                        int i13 = i12 - 1;
                        rVar.f3613e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        rVar.f3614f[rVar.f3613e] = null;
                    } else {
                        com.google.android.exoplayer2.upstream.a aVar2 = new com.google.android.exoplayer2.upstream.a(new byte[rVar.f3611b], 0);
                        com.google.android.exoplayer2.upstream.a[] aVarArr2 = rVar.f3614f;
                        if (i11 > aVarArr2.length) {
                            rVar.f3614f = (com.google.android.exoplayer2.upstream.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            v0 v0Var2 = new v0(((v0) this.f14463g).f14448b, this.f14458a);
            v0Var.f14449c = aVar;
            v0Var.d = v0Var2;
        }
        return Math.min(i10, (int) (((v0) this.f14463g).f14448b - this.f14459b));
    }

    public w0(xb0 xb0Var) {
        this.d = new ArrayList(50);
        this.f14461e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f14462f = paint;
        this.f14458a = 250;
        this.f14460c = xb0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
