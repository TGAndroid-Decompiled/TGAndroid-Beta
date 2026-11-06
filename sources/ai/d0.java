package ai;

import android.graphics.Matrix;
import di.m6;
import fi.e7;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.i20;
import org.telegram.messenger.j20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
public final class d0 implements Runnable {
    public final int f1155a;
    public final Object f1156b;
    public final Object f1157c;
    public final Object d;
    public final Object f1158e;

    public d0(m6 m6Var, TLObject tLObject, c20 c20Var, TLRPC.TL_error tL_error) {
        this.f1155a = 13;
        this.d = m6Var;
        this.f1158e = tLObject;
        this.f1157c = c20Var;
        this.f1156b = tL_error;
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
        e7 e7Var = (e7) this.d;
        String str = (String) this.f1158e;
        int[][] iArr2 = (int[][]) this.f1156b;
        c20 c20Var = (c20) this.f1157c;
        e7Var.getClass();
        j20 j20Var = new j20();
        char c10 = 1;
        j20Var.J = true;
        j20Var.f23444a0 = e7Var.f11884c1;
        j20Var.h = e7Var.f11900k0;
        j20Var.f23451i = e7Var.f11902l0;
        j20Var.f23453k = e7Var.f11896i0;
        j20Var.f23454l = e7Var.f11898j0;
        File file = e7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        j20Var.B = path;
        File file2 = e7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        j20Var.D = path2;
        File file3 = e7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        j20Var.E = path3;
        File file4 = e7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        j20Var.F = path4;
        int v = MediaController.v(j20Var.f23453k, j20Var.f23454l, j20Var.f23455m, true);
        if (e7Var.K && str != null && !e7Var.v()) {
            j20Var.f23457o = str;
            j20Var.I = false;
            j20Var.f23456n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            j20Var.f23452j = E;
            if (E < 1000000 && (arrayList = e7Var.T0) != null && !arrayList.isEmpty()) {
                j20Var.f23455m = 2000000;
                j20Var.f23452j = -1;
            } else {
                int i12 = j20Var.f23452j;
                if (i12 < 500000) {
                    j20Var.f23455m = 2500000;
                    j20Var.f23452j = -1;
                } else {
                    j20Var.f23455m = Utilities.j(i12, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(j20Var.f23452j);
            sb2.append(" => ");
            jg.g.s(j20Var.f23455m, sb2);
            long j12 = iArr2[0][4];
            e7Var.f11894h0 = j12;
            j20Var.v = j12 * 1000;
            float f12 = (float) j12;
            long j13 = e7Var.Z * f12 * 1000;
            j20Var.f23443a = j13;
            long j14 = e7Var.f11877a0 * f12 * 1000;
            j20Var.f23445b = j14;
            j20Var.f23460r = j14 - j13;
            j20Var.f23463u = e7Var.P;
            j20Var.f23462t = e7Var.Y;
            j20Var.f23459q = a8.p0.f(i11 / 1000.0f, v, 8.0f, iArr[5]);
            j20Var.f23459q = Math.max(e7Var.L.length(), j20Var.f23459q);
            j20Var.A = e7Var.f11878a1;
            File file5 = e7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            j20Var.C = path5;
            j3 = 0;
        } else {
            File file6 = e7Var.Z0;
            if (file6 != null) {
                j20Var.f23457o = file6.getAbsolutePath();
            } else {
                j20Var.f23457o = str;
            }
            j20Var.I = true;
            j20Var.L = e7Var.S;
            if (e7Var.v()) {
                int i13 = 0;
                boolean z9 = false;
                while (i13 < e7Var.T.size()) {
                    e7 e7Var2 = (e7) e7Var.T.get(i13);
                    if (e7Var2.K) {
                        e7Var2.f11900k0 = Math.max(e7Var2.f11900k0, iArr2[i13][c10]);
                        e7Var2.f11902l0 = Math.max(e7Var2.f11902l0, iArr2[i13][2]);
                        i10 = v;
                        e7Var2.f11894h0 = Math.max(e7Var2.f11894h0, iArr2[i13][4]);
                        z9 = true;
                    } else {
                        i10 = v;
                    }
                    i13++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = i20.a(e7Var);
                j20Var.M = a10;
                if (!z9) {
                    long j15 = e7Var.S0;
                    e7Var.f11894h0 = j15;
                    j20Var.v = j15;
                    j20Var.f23460r = j15;
                } else {
                    int size = a10.size();
                    long j16 = 0;
                    i20 i20Var = null;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = a10.get(i14);
                        i14++;
                        i20 i20Var2 = (i20) obj;
                        if (i20Var2.f23023b) {
                            long j17 = i20Var2.f23032o;
                            if (j17 > j16) {
                                i20Var = i20Var2;
                                j16 = j17;
                            }
                        }
                    }
                    if (i20Var != null) {
                        long j18 = (i20Var.f23029k - i20Var.f23028j) * ((float) i20Var.f23032o);
                        e7Var.f11894h0 = j18;
                        j20Var.v = j18;
                        j20Var.f23460r = j18;
                        j3 = -(i20Var.f23026f + (f11 * f10));
                        i20Var.f23026f = j3;
                        ArrayList arrayList2 = j20Var.M;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            i20 i20Var3 = (i20) obj2;
                            if (i20Var3.f23023b && i20Var3 != i20Var) {
                                i20Var3.f23026f += j3;
                            }
                        }
                        j20Var.f23443a = -1L;
                        j20Var.f23445b = -1L;
                        j20Var.f23462t = true;
                        j20Var.f23452j = -1;
                        j20Var.f23463u = 1.0f;
                        j20Var.f23455m = -1;
                        j20Var.f23456n = 30;
                        j20Var.f23459q = ((((float) e7Var.f11894h0) / 1000.0f) * i7) / 8.0f;
                        j20Var.A = null;
                    }
                }
            } else {
                i7 = v;
                if (e7Var.f11907o0 != null) {
                    long j19 = (e7Var.f11917t0 - e7Var.f11915s0) * ((float) e7Var.f11911q0);
                    e7Var.f11894h0 = j19;
                    j20Var.v = j19;
                    j20Var.f23460r = j19;
                } else if (e7Var.f11925y != null) {
                    long j20 = (e7Var.F - e7Var.E) * ((float) e7Var.C);
                    e7Var.f11894h0 = j20;
                    j20Var.v = j20;
                    j20Var.f23460r = j20;
                } else {
                    long j21 = e7Var.S0;
                    e7Var.f11894h0 = j21;
                    j20Var.v = j21;
                    j20Var.f23460r = j21;
                }
            }
            j3 = 0;
            j20Var.f23443a = -1L;
            j20Var.f23445b = -1L;
            j20Var.f23462t = true;
            j20Var.f23452j = -1;
            j20Var.f23463u = 1.0f;
            j20Var.f23455m = -1;
            j20Var.f23456n = 30;
            j20Var.f23459q = ((((float) e7Var.f11894h0) / 1000.0f) * i7) / 8.0f;
            j20Var.A = null;
        }
        j20Var.S = e7Var.f11876a;
        j20Var.U = e7Var.f11928z0;
        j20Var.T = e7Var.f11926y0;
        j20Var.f23447c = -1L;
        ye yeVar = e7Var.m0;
        if (yeVar != null) {
            j20Var.H = yeVar.clone();
        } else {
            j20Var.H = new ye();
        }
        j20Var.H.B = new Matrix();
        j20Var.H.B.set(e7Var.f11905n0);
        j20Var.G = e7Var.T0;
        j20Var.Q = Integer.valueOf(e7Var.A0);
        j20Var.R = Integer.valueOf(e7Var.B0);
        j20Var.V = true;
        j20Var.K = e7Var.f11886d1;
        j20Var.f23446b0.clear();
        if (e7Var.v() && !e7Var.Y) {
            ArrayList arrayList3 = j20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                i20 i20Var4 = (i20) obj3;
                if (i20Var4.f23023b && i20Var4.f23025e > 0.0f && !i20Var4.f23024c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(i20Var4.d);
                    mixedSoundInfo.volume = i20Var4.f23025e;
                    float f13 = i20Var4.f23028j;
                    float f14 = (float) i20Var4.f23032o;
                    mixedSoundInfo.audioOffset = f13 * f14 * 1000;
                    mixedSoundInfo.startTime = i20Var4.f23026f * 1000;
                    mixedSoundInfo.duration = (i20Var4.f23029k - f13) * f14 * 1000;
                    j20Var.f23446b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = e7Var.f11907o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = e7Var.f11919u0;
            float f15 = e7Var.f11915s0;
            float f16 = (float) e7Var.f11911q0;
            long j22 = f15 * f16 * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (e7Var.K) {
                mixedSoundInfo2.startTime = (((float) e7Var.f11913r0) - (e7Var.Z * ((float) e7Var.f11894h0))) * 1000;
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
            mixedSoundInfo2.duration = (e7Var.f11917t0 - f15) * f16 * 1000;
            j20Var.f23446b0.add(mixedSoundInfo2);
        }
        String str2 = e7Var.f11925y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = e7Var.G;
            float f17 = e7Var.E;
            float f18 = (float) e7Var.C;
            long j24 = f17 * f18 * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (e7Var.K) {
                mixedSoundInfo3.startTime = (((float) e7Var.D) - (e7Var.Z * ((float) e7Var.f11894h0))) * 1000;
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
            mixedSoundInfo3.duration = (e7Var.F - f17) * f18 * 1000;
            j20Var.f23446b0.add(mixedSoundInfo3);
        }
        c20Var.a(j20Var);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.d0.run():void");
    }

    public d0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1155a = i7;
        this.d = obj;
        this.f1158e = obj2;
        this.f1156b = obj3;
        this.f1157c = obj4;
    }

    public d0(String str, d20 d20Var, f2 f2Var, c20 c20Var) {
        this.f1155a = 1;
        this.d = str;
        this.f1156b = d20Var;
        this.f1158e = f2Var;
        this.f1157c = c20Var;
    }
}
