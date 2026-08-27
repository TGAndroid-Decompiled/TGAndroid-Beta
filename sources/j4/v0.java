package j4;

import android.graphics.Paint;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mb0;

public final class v0 {

    public final int f12689a;

    public long f12690b;

    public final Object f12691c;
    public final Object d;

    public Object f12692e;

    public Object f12693f;

    public Object f12694g;

    public v0(com.google.android.exoplayer2.upstream.r rVar) {
        this.f12691c = rVar;
        int i10 = rVar.f3034b;
        this.f12689a = i10;
        this.d = new d5.z(32);
        u0 u0Var = new u0(0L, i10);
        this.f12692e = u0Var;
        this.f12693f = u0Var;
        this.f12694g = u0Var;
    }

    public static u0 d(u0 u0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= u0Var.f12686b) {
            u0Var = (u0) u0Var.d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (u0Var.f12686b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.f12687c;
            byteBuffer.put(aVar.f2957a, ((int) (j10 - u0Var.f12685a)) + aVar.f2958b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == u0Var.f12686b) {
                u0Var = (u0) u0Var.d;
            }
        }
        return u0Var;
    }

    public static u0 e(u0 u0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= u0Var.f12686b) {
            u0Var = (u0) u0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (u0Var.f12686b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.f12687c;
            System.arraycopy(aVar.f2957a, ((int) (j10 - u0Var.f12685a)) + aVar.f2958b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == u0Var.f12686b) {
                u0Var = (u0) u0Var.d;
            }
        }
        return u0Var;
    }

    public static u0 f(u0 u0Var, k3.i iVar, x0 x0Var, d5.z zVar) {
        if (iVar.getFlag(1073741824)) {
            long j10 = x0Var.f12710a;
            int iW = 1;
            zVar.z(1);
            u0 u0VarE = e(u0Var, j10, zVar.f4858a, 1);
            long j11 = j10 + 1;
            byte b10 = zVar.f4858a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            k3.d dVar = iVar.f14428a;
            byte[] bArr = dVar.f14410a;
            if (bArr == null) {
                dVar.f14410a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            u0Var = e(u0VarE, j11, dVar.f14410a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                zVar.z(2);
                u0Var = e(u0Var, j12, zVar.f4858a, 2);
                j12 += 2;
                iW = zVar.w();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < iW) {
                iArr = new int[iW];
            }
            int[] iArr2 = dVar.f14413e;
            if (iArr2 == null || iArr2.length < iW) {
                iArr2 = new int[iW];
            }
            if (z10) {
                int i11 = iW * 6;
                zVar.z(i11);
                u0Var = e(u0Var, j12, zVar.f4858a, i11);
                j12 += (long) i11;
                zVar.C(0);
                for (int i12 = 0; i12 < iW; i12++) {
                    iArr[i12] = zVar.w();
                    iArr2[i12] = zVar.u();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = x0Var.f12711b - ((int) (j12 - x0Var.f12710a));
            }
            m3.v vVar = (m3.v) x0Var.f12712c;
            int i13 = d5.g0.f4795a;
            byte[] bArr2 = vVar.f17638b;
            byte[] bArr3 = dVar.f14410a;
            int i14 = vVar.f17637a;
            int i15 = vVar.f17639c;
            int i16 = vVar.d;
            dVar.f14414f = iW;
            dVar.d = iArr;
            dVar.f14413e = iArr2;
            dVar.f14411b = bArr2;
            dVar.f14410a = bArr3;
            dVar.f14412c = i14;
            dVar.f14415g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f14416i;
            cryptoInfo.numSubSamples = iW;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (d5.g0.f4795a >= 24) {
                k3.c cVar = dVar.f14417j;
                cVar.getClass();
                k3.c.a(cVar, i15, i16);
            }
            long j13 = x0Var.f12710a;
            int i17 = (int) (j12 - j13);
            x0Var.f12710a = j13 + ((long) i17);
            x0Var.f12711b -= i17;
        }
        if (!iVar.hasSupplementalData()) {
            iVar.b(x0Var.f12711b);
            return d(u0Var, x0Var.f12710a, iVar.f14429b, x0Var.f12711b);
        }
        zVar.z(4);
        u0 u0VarE2 = e(u0Var, x0Var.f12710a, zVar.f4858a, 4);
        int iU = zVar.u();
        x0Var.f12710a += 4;
        x0Var.f12711b -= 4;
        iVar.b(iU);
        u0 u0VarD = d(u0VarE2, x0Var.f12710a, iVar.f14429b, iU);
        x0Var.f12710a += (long) iU;
        int i18 = x0Var.f12711b - iU;
        x0Var.f12711b = i18;
        ByteBuffer byteBuffer = iVar.f14431e;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            iVar.f14431e = ByteBuffer.allocate(i18);
        } else {
            iVar.f14431e.clear();
        }
        return d(u0VarD, x0Var.f12710a, iVar.f14431e, x0Var.f12711b);
    }

    public void a(u0 u0Var) {
        if (((com.google.android.exoplayer2.upstream.a) u0Var.f12687c) == null) {
            return;
        }
        com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f12691c;
        synchronized (rVar) {
            u0 u0Var2 = u0Var;
            while (u0Var2 != null) {
                try {
                    com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f3037f;
                    int i10 = rVar.f3036e;
                    rVar.f3036e = i10 + 1;
                    com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var2.f12687c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    rVar.d--;
                    u0Var2 = (u0) u0Var2.d;
                    if (u0Var2 == null || ((com.google.android.exoplayer2.upstream.a) u0Var2.f12687c) == null) {
                        u0Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.notifyAll();
        }
        u0Var.f12687c = null;
        u0Var.d = null;
    }

    public void b(long j10) {
        u0 u0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            u0Var = (u0) this.f12692e;
            if (j10 < u0Var.f12686b) {
                break;
            }
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f12691c;
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.f12687c;
            synchronized (rVar) {
                com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f3037f;
                int i10 = rVar.f3036e;
                rVar.f3036e = i10 + 1;
                aVarArr[i10] = aVar;
                rVar.d--;
                rVar.notifyAll();
            }
            u0 u0Var2 = (u0) this.f12692e;
            u0Var2.f12687c = null;
            u0 u0Var3 = (u0) u0Var2.d;
            u0Var2.d = null;
            this.f12692e = u0Var3;
        }
        if (((u0) this.f12693f).f12685a < u0Var.f12685a) {
            this.f12693f = u0Var;
        }
    }

    public int c(int i10) {
        com.google.android.exoplayer2.upstream.a aVar;
        u0 u0Var = (u0) this.f12694g;
        if (((com.google.android.exoplayer2.upstream.a) u0Var.f12687c) == null) {
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.f12691c;
            synchronized (rVar) {
                try {
                    int i11 = rVar.d + 1;
                    rVar.d = i11;
                    int i12 = rVar.f3036e;
                    if (i12 > 0) {
                        com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f3037f;
                        int i13 = i12 - 1;
                        rVar.f3036e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        rVar.f3037f[rVar.f3036e] = null;
                    } else {
                        com.google.android.exoplayer2.upstream.a aVar2 = new com.google.android.exoplayer2.upstream.a(new byte[rVar.f3034b], 0);
                        com.google.android.exoplayer2.upstream.a[] aVarArr2 = rVar.f3037f;
                        if (i11 > aVarArr2.length) {
                            rVar.f3037f = (com.google.android.exoplayer2.upstream.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            u0 u0Var2 = new u0(((u0) this.f12694g).f12686b, this.f12689a);
            u0Var.f12687c = aVar;
            u0Var.d = u0Var2;
        }
        return Math.min(i10, (int) (((u0) this.f12694g).f12686b - this.f12690b));
    }

    public v0(mb0 mb0Var) {
        this.d = new ArrayList(50);
        this.f12692e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f12693f = paint;
        this.f12689a = 250;
        this.f12691c = mb0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
