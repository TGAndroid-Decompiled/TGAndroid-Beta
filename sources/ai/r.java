package ai;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import hi.d7;
import hi.x5;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f20;
import org.telegram.messenger.g20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.xe;
import org.telegram.messenger.z10;
public final class r implements Runnable {
    public final int f1492a;
    public final Object f1493b;
    public final Object f1494c;
    public final Object d;
    public final Object f1495e;

    public r(x5 x5Var, Bitmap[] bitmapArr, d7 d7Var, boolean[] zArr) {
        this.f1492a = 17;
        this.f1493b = x5Var;
        this.d = bitmapArr;
        this.f1495e = d7Var;
        this.f1494c = zArr;
    }

    private final void a() {
        String path;
        String path2;
        String path3;
        String path4;
        int i7;
        long j3;
        float f10;
        float f11;
        int i10;
        long j10;
        long j11;
        int[] iArr;
        int i11;
        String path5;
        ArrayList arrayList;
        d7 d7Var = (d7) this.f1494c;
        String str = (String) this.f1493b;
        int[][] iArr2 = (int[][]) this.d;
        z10 z10Var = (z10) this.f1495e;
        d7Var.getClass();
        g20 g20Var = new g20();
        char c10 = 1;
        g20Var.J = true;
        g20Var.f23635a0 = d7Var.f14131c1;
        g20Var.h = d7Var.f14147k0;
        g20Var.f23642i = d7Var.f14149l0;
        g20Var.f23644k = d7Var.f14143i0;
        g20Var.f23645l = d7Var.f14145j0;
        File file = d7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        g20Var.B = path;
        File file2 = d7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        g20Var.D = path2;
        File file3 = d7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        g20Var.E = path3;
        File file4 = d7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        g20Var.F = path4;
        int v = MediaController.v(g20Var.f23644k, g20Var.f23645l, g20Var.f23646m, true);
        if (d7Var.K && str != null && !d7Var.v()) {
            g20Var.f23648o = str;
            g20Var.I = false;
            g20Var.f23647n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            g20Var.f23643j = E;
            if (E < 1000000 && (arrayList = d7Var.T0) != null && !arrayList.isEmpty()) {
                g20Var.f23646m = 2000000;
                g20Var.f23643j = -1;
            } else {
                int i12 = g20Var.f23643j;
                if (i12 < 500000) {
                    g20Var.f23646m = 2500000;
                    g20Var.f23643j = -1;
                } else {
                    g20Var.f23646m = Utilities.j(i12, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(g20Var.f23643j);
            sb2.append(" => ");
            i5.c.r(g20Var.f23646m, sb2);
            long j12 = iArr2[0][4];
            d7Var.f14141h0 = j12;
            g20Var.v = j12 * 1000;
            float f12 = (float) j12;
            long j13 = d7Var.Z * f12 * 1000;
            g20Var.f23634a = j13;
            long j14 = d7Var.f14124a0 * f12 * 1000;
            g20Var.f23636b = j14;
            g20Var.f23651r = j14 - j13;
            g20Var.f23654u = d7Var.P;
            g20Var.f23653t = d7Var.Y;
            g20Var.f23650q = a8.p0.f(i11 / 1000.0f, v, 8.0f, iArr[5]);
            g20Var.f23650q = Math.max(d7Var.L.length(), g20Var.f23650q);
            g20Var.A = d7Var.f14125a1;
            File file5 = d7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            g20Var.C = path5;
            j3 = 0;
        } else {
            File file6 = d7Var.Z0;
            if (file6 != null) {
                g20Var.f23648o = file6.getAbsolutePath();
            } else {
                g20Var.f23648o = str;
            }
            g20Var.I = true;
            g20Var.L = d7Var.S;
            if (d7Var.v()) {
                int i13 = 0;
                boolean z10 = false;
                while (i13 < d7Var.T.size()) {
                    d7 d7Var2 = (d7) d7Var.T.get(i13);
                    if (d7Var2.K) {
                        d7Var2.f14147k0 = Math.max(d7Var2.f14147k0, iArr2[i13][c10]);
                        d7Var2.f14149l0 = Math.max(d7Var2.f14149l0, iArr2[i13][2]);
                        i10 = v;
                        d7Var2.f14141h0 = Math.max(d7Var2.f14141h0, iArr2[i13][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i13++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = f20.a(d7Var);
                g20Var.M = a10;
                if (!z10) {
                    long j15 = d7Var.S0;
                    d7Var.f14141h0 = j15;
                    g20Var.v = j15;
                    g20Var.f23651r = j15;
                } else {
                    int size = a10.size();
                    long j16 = 0;
                    f20 f20Var = null;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = a10.get(i14);
                        i14++;
                        f20 f20Var2 = (f20) obj;
                        if (f20Var2.f23423b) {
                            long j17 = f20Var2.f23432o;
                            if (j17 > j16) {
                                f20Var = f20Var2;
                                j16 = j17;
                            }
                        }
                    }
                    if (f20Var != null) {
                        long j18 = (f20Var.f23429k - f20Var.f23428j) * ((float) f20Var.f23432o);
                        d7Var.f14141h0 = j18;
                        g20Var.v = j18;
                        g20Var.f23651r = j18;
                        j3 = -(f20Var.f23426f + (f11 * f10));
                        f20Var.f23426f = j3;
                        ArrayList arrayList2 = g20Var.M;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            f20 f20Var3 = (f20) obj2;
                            if (f20Var3.f23423b && f20Var3 != f20Var) {
                                f20Var3.f23426f += j3;
                            }
                        }
                        g20Var.f23634a = -1L;
                        g20Var.f23636b = -1L;
                        g20Var.f23653t = true;
                        g20Var.f23643j = -1;
                        g20Var.f23654u = 1.0f;
                        g20Var.f23646m = -1;
                        g20Var.f23647n = 30;
                        g20Var.f23650q = ((((float) d7Var.f14141h0) / 1000.0f) * i7) / 8.0f;
                        g20Var.A = null;
                    }
                }
            } else {
                i7 = v;
                if (d7Var.f14154o0 != null) {
                    long j19 = (d7Var.f14164t0 - d7Var.f14162s0) * ((float) d7Var.f14158q0);
                    d7Var.f14141h0 = j19;
                    g20Var.v = j19;
                    g20Var.f23651r = j19;
                } else if (d7Var.f14172y != null) {
                    long j20 = (d7Var.F - d7Var.E) * ((float) d7Var.C);
                    d7Var.f14141h0 = j20;
                    g20Var.v = j20;
                    g20Var.f23651r = j20;
                } else {
                    long j21 = d7Var.S0;
                    d7Var.f14141h0 = j21;
                    g20Var.v = j21;
                    g20Var.f23651r = j21;
                }
            }
            j3 = 0;
            g20Var.f23634a = -1L;
            g20Var.f23636b = -1L;
            g20Var.f23653t = true;
            g20Var.f23643j = -1;
            g20Var.f23654u = 1.0f;
            g20Var.f23646m = -1;
            g20Var.f23647n = 30;
            g20Var.f23650q = ((((float) d7Var.f14141h0) / 1000.0f) * i7) / 8.0f;
            g20Var.A = null;
        }
        g20Var.S = d7Var.f14123a;
        g20Var.U = d7Var.f14175z0;
        g20Var.T = d7Var.f14173y0;
        g20Var.f23638c = -1L;
        xe xeVar = d7Var.m0;
        if (xeVar != null) {
            g20Var.H = xeVar.clone();
        } else {
            g20Var.H = new xe();
        }
        g20Var.H.B = new Matrix();
        g20Var.H.B.set(d7Var.f14152n0);
        g20Var.G = d7Var.T0;
        g20Var.Q = Integer.valueOf(d7Var.A0);
        g20Var.R = Integer.valueOf(d7Var.B0);
        g20Var.V = true;
        g20Var.K = d7Var.f14133d1;
        g20Var.f23637b0.clear();
        if (d7Var.v() && !d7Var.Y) {
            ArrayList arrayList3 = g20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                f20 f20Var4 = (f20) obj3;
                if (f20Var4.f23423b && f20Var4.f23425e > 0.0f && !f20Var4.f23424c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(f20Var4.d);
                    mixedSoundInfo.volume = f20Var4.f23425e;
                    float f13 = f20Var4.f23428j;
                    float f14 = (float) f20Var4.f23432o;
                    mixedSoundInfo.audioOffset = f13 * f14 * 1000;
                    mixedSoundInfo.startTime = f20Var4.f23426f * 1000;
                    mixedSoundInfo.duration = (f20Var4.f23429k - f13) * f14 * 1000;
                    g20Var.f23637b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = d7Var.f14154o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = d7Var.f14166u0;
            float f15 = d7Var.f14162s0;
            float f16 = (float) d7Var.f14158q0;
            long j22 = f15 * f16 * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (d7Var.K) {
                mixedSoundInfo2.startTime = (((float) d7Var.f14160r0) - (d7Var.Z * ((float) d7Var.f14141h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j23 = mixedSoundInfo2.startTime + j3;
            mixedSoundInfo2.startTime = j23;
            if (j23 < j11) {
                mixedSoundInfo2.audioOffset = j22 - j23;
                mixedSoundInfo2.startTime = j11;
            }
            mixedSoundInfo2.duration = (d7Var.f14164t0 - f15) * f16 * 1000;
            g20Var.f23637b0.add(mixedSoundInfo2);
        }
        String str2 = d7Var.f14172y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = d7Var.G;
            float f17 = d7Var.E;
            float f18 = (float) d7Var.C;
            long j24 = f17 * f18 * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (d7Var.K) {
                mixedSoundInfo3.startTime = (((float) d7Var.D) - (d7Var.Z * ((float) d7Var.f14141h0))) * 1000;
                j10 = 0;
            } else {
                j10 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j25 = mixedSoundInfo3.startTime + j3;
            mixedSoundInfo3.startTime = j25;
            if (j25 < j10) {
                mixedSoundInfo3.audioOffset = j24 - j25;
                mixedSoundInfo3.startTime = j10;
            }
            mixedSoundInfo3.duration = (d7Var.F - f17) * f18 * 1000;
            g20Var.f23637b0.add(mixedSoundInfo3);
        }
        z10Var.a(g20Var);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.r.run():void");
    }

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1492a = i7;
        this.f1493b = obj;
        this.f1494c = obj2;
        this.d = obj3;
        this.f1495e = obj4;
    }

    public r(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f1492a = i7;
        this.f1494c = obj;
        this.d = obj2;
        this.f1493b = str;
        this.f1495e = obj3;
    }

    public r(Object obj, String str, Object obj2, Object obj3, int i7) {
        this.f1492a = i7;
        this.f1494c = obj;
        this.f1493b = str;
        this.d = obj2;
        this.f1495e = obj3;
    }
}
