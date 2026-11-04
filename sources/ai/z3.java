package ai;

import android.graphics.Matrix;
import gi.f7;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
public final class z3 implements Runnable {
    public final int f1128a;
    public final Object f1129b;
    public final Object f1130c;
    public final Object d;
    public final Object f1131e;

    public z3(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f1128a = i3;
        this.f1129b = obj;
        this.f1130c = obj2;
        this.d = obj3;
        this.f1131e = obj4;
    }

    private final void a() {
        String path;
        String path2;
        String path3;
        String path4;
        int i3;
        long j10;
        float f10;
        float f11;
        int i10;
        long j11;
        long j12;
        int[] iArr;
        int i11;
        String path5;
        ArrayList arrayList;
        f7 f7Var = (f7) this.f1129b;
        String str = (String) this.f1130c;
        int[][] iArr2 = (int[][]) this.d;
        u10 u10Var = (u10) this.f1131e;
        f7Var.getClass();
        b20 b20Var = new b20();
        char c2 = 1;
        b20Var.J = true;
        b20Var.f21709a0 = f7Var.f12710c1;
        b20Var.h = f7Var.f12726k0;
        b20Var.f21716i = f7Var.f12728l0;
        b20Var.f21718k = f7Var.f12722i0;
        b20Var.f21719l = f7Var.f12724j0;
        File file = f7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        b20Var.B = path;
        File file2 = f7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        b20Var.D = path2;
        File file3 = f7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        b20Var.E = path3;
        File file4 = f7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        b20Var.F = path4;
        int v = MediaController.v(b20Var.f21718k, b20Var.f21719l, b20Var.f21720m, true);
        if (f7Var.K && str != null && !f7Var.v()) {
            b20Var.f21722o = str;
            b20Var.I = false;
            b20Var.f21721n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            b20Var.f21717j = E;
            if (E < 1000000 && (arrayList = f7Var.T0) != null && !arrayList.isEmpty()) {
                b20Var.f21720m = 2000000;
                b20Var.f21717j = -1;
            } else {
                int i12 = b20Var.f21717j;
                if (i12 < 500000) {
                    b20Var.f21720m = 2500000;
                    b20Var.f21717j = -1;
                } else {
                    b20Var.f21720m = Utilities.j(i12, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(b20Var.f21717j);
            sb2.append(" => ");
            k2.p1.q(b20Var.f21720m, sb2);
            long j13 = iArr2[0][4];
            f7Var.f12720h0 = j13;
            b20Var.v = j13 * 1000;
            float f12 = (float) j13;
            long j14 = f7Var.Z * f12 * 1000;
            b20Var.f21708a = j14;
            long j15 = f7Var.f12703a0 * f12 * 1000;
            b20Var.f21710b = j15;
            b20Var.f21725r = j15 - j14;
            b20Var.f21728u = f7Var.P;
            b20Var.f21727t = f7Var.Y;
            b20Var.f21724q = a1.g.e(i11 / 1000.0f, v, 8.0f, iArr[5]);
            b20Var.f21724q = Math.max(f7Var.L.length(), b20Var.f21724q);
            b20Var.A = f7Var.f12704a1;
            File file5 = f7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            b20Var.C = path5;
            j10 = 0;
        } else {
            File file6 = f7Var.Z0;
            if (file6 != null) {
                b20Var.f21722o = file6.getAbsolutePath();
            } else {
                b20Var.f21722o = str;
            }
            b20Var.I = true;
            b20Var.L = f7Var.S;
            if (f7Var.v()) {
                int i13 = 0;
                boolean z10 = false;
                while (i13 < f7Var.T.size()) {
                    f7 f7Var2 = (f7) f7Var.T.get(i13);
                    if (f7Var2.K) {
                        f7Var2.f12726k0 = Math.max(f7Var2.f12726k0, iArr2[i13][c2]);
                        f7Var2.f12728l0 = Math.max(f7Var2.f12728l0, iArr2[i13][2]);
                        i10 = v;
                        f7Var2.f12720h0 = Math.max(f7Var2.f12720h0, iArr2[i13][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i13++;
                    v = i10;
                    c2 = 1;
                }
                i3 = v;
                ArrayList a10 = a20.a(f7Var);
                b20Var.M = a10;
                if (!z10) {
                    long j16 = f7Var.S0;
                    f7Var.f12720h0 = j16;
                    b20Var.v = j16;
                    b20Var.f21725r = j16;
                } else {
                    int size = a10.size();
                    long j17 = 0;
                    a20 a20Var = null;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = a10.get(i14);
                        i14++;
                        a20 a20Var2 = (a20) obj;
                        if (a20Var2.f21434b) {
                            long j18 = a20Var2.f21443o;
                            if (j18 > j17) {
                                a20Var = a20Var2;
                                j17 = j18;
                            }
                        }
                    }
                    if (a20Var != null) {
                        long j19 = (a20Var.f21440k - a20Var.f21439j) * ((float) a20Var.f21443o);
                        f7Var.f12720h0 = j19;
                        b20Var.v = j19;
                        b20Var.f21725r = j19;
                        j10 = -(a20Var.f21437f + (f11 * f10));
                        a20Var.f21437f = j10;
                        ArrayList arrayList2 = b20Var.M;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            a20 a20Var3 = (a20) obj2;
                            if (a20Var3.f21434b && a20Var3 != a20Var) {
                                a20Var3.f21437f += j10;
                            }
                        }
                        b20Var.f21708a = -1L;
                        b20Var.f21710b = -1L;
                        b20Var.f21727t = true;
                        b20Var.f21717j = -1;
                        b20Var.f21728u = 1.0f;
                        b20Var.f21720m = -1;
                        b20Var.f21721n = 30;
                        b20Var.f21724q = ((((float) f7Var.f12720h0) / 1000.0f) * i3) / 8.0f;
                        b20Var.A = null;
                    }
                }
            } else {
                i3 = v;
                if (f7Var.f12733o0 != null) {
                    long j20 = (f7Var.f12743t0 - f7Var.f12741s0) * ((float) f7Var.f12737q0);
                    f7Var.f12720h0 = j20;
                    b20Var.v = j20;
                    b20Var.f21725r = j20;
                } else if (f7Var.f12751y != null) {
                    long j21 = (f7Var.F - f7Var.E) * ((float) f7Var.C);
                    f7Var.f12720h0 = j21;
                    b20Var.v = j21;
                    b20Var.f21725r = j21;
                } else {
                    long j22 = f7Var.S0;
                    f7Var.f12720h0 = j22;
                    b20Var.v = j22;
                    b20Var.f21725r = j22;
                }
            }
            j10 = 0;
            b20Var.f21708a = -1L;
            b20Var.f21710b = -1L;
            b20Var.f21727t = true;
            b20Var.f21717j = -1;
            b20Var.f21728u = 1.0f;
            b20Var.f21720m = -1;
            b20Var.f21721n = 30;
            b20Var.f21724q = ((((float) f7Var.f12720h0) / 1000.0f) * i3) / 8.0f;
            b20Var.A = null;
        }
        b20Var.S = f7Var.f12702a;
        b20Var.U = f7Var.f12754z0;
        b20Var.T = f7Var.f12752y0;
        b20Var.f21712c = -1L;
        re reVar = f7Var.m0;
        if (reVar != null) {
            b20Var.H = reVar.clone();
        } else {
            b20Var.H = new re();
        }
        b20Var.H.B = new Matrix();
        b20Var.H.B.set(f7Var.f12731n0);
        b20Var.G = f7Var.T0;
        b20Var.Q = Integer.valueOf(f7Var.A0);
        b20Var.R = Integer.valueOf(f7Var.B0);
        b20Var.V = true;
        b20Var.K = f7Var.f12712d1;
        b20Var.f21711b0.clear();
        if (f7Var.v() && !f7Var.Y) {
            ArrayList arrayList3 = b20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                a20 a20Var4 = (a20) obj3;
                if (a20Var4.f21434b && a20Var4.f21436e > 0.0f && !a20Var4.f21435c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(a20Var4.d);
                    mixedSoundInfo.volume = a20Var4.f21436e;
                    float f13 = a20Var4.f21439j;
                    float f14 = (float) a20Var4.f21443o;
                    mixedSoundInfo.audioOffset = f13 * f14 * 1000;
                    mixedSoundInfo.startTime = a20Var4.f21437f * 1000;
                    mixedSoundInfo.duration = (a20Var4.f21440k - f13) * f14 * 1000;
                    b20Var.f21711b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = f7Var.f12733o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = f7Var.f12745u0;
            float f15 = f7Var.f12741s0;
            float f16 = (float) f7Var.f12737q0;
            long j23 = f15 * f16 * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (f7Var.K) {
                mixedSoundInfo2.startTime = (((float) f7Var.f12739r0) - (f7Var.Z * ((float) f7Var.f12720h0))) * 1000;
                j12 = 0;
            } else {
                j12 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j24 = mixedSoundInfo2.startTime + j10;
            mixedSoundInfo2.startTime = j24;
            if (j24 < j12) {
                mixedSoundInfo2.audioOffset = j23 - j24;
                mixedSoundInfo2.startTime = j12;
            }
            mixedSoundInfo2.duration = (f7Var.f12743t0 - f15) * f16 * 1000;
            b20Var.f21711b0.add(mixedSoundInfo2);
        }
        String str2 = f7Var.f12751y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = f7Var.G;
            float f17 = f7Var.E;
            float f18 = (float) f7Var.C;
            long j25 = f17 * f18 * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (f7Var.K) {
                mixedSoundInfo3.startTime = (((float) f7Var.D) - (f7Var.Z * ((float) f7Var.f12720h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j26 = mixedSoundInfo3.startTime + j10;
            mixedSoundInfo3.startTime = j26;
            if (j26 < j11) {
                mixedSoundInfo3.audioOffset = j25 - j26;
                mixedSoundInfo3.startTime = j11;
            }
            mixedSoundInfo3.duration = (f7Var.F - f17) * f18 * 1000;
            b20Var.f21711b0.add(mixedSoundInfo3);
        }
        u10Var.a(b20Var);
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z3.b():void");
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z3.c():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z3.run():void");
    }
}
