package ai;

import android.graphics.Matrix;
import bi.x3;
import hi.x7;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.kc;
public final class j implements Runnable {
    public final int f1281a;
    public final Object f1282b;
    public final Object f1283c;
    public final Object d;
    public final Object f1284e;

    public j(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1281a = i7;
        this.d = obj;
        this.f1283c = obj2;
        this.f1284e = obj3;
        this.f1282b = obj4;
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
        x7 x7Var = (x7) this.d;
        String str = (String) this.f1283c;
        int[][] iArr2 = (int[][]) this.f1284e;
        w10 w10Var = (w10) this.f1282b;
        x7Var.getClass();
        d20 d20Var = new d20();
        char c10 = 1;
        d20Var.J = true;
        d20Var.f23588a0 = x7Var.f15741c1;
        d20Var.h = x7Var.f15757k0;
        d20Var.f23595i = x7Var.f15759l0;
        d20Var.f23597k = x7Var.f15753i0;
        d20Var.f23598l = x7Var.f15755j0;
        File file = x7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        d20Var.B = path;
        File file2 = x7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        d20Var.D = path2;
        File file3 = x7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        d20Var.E = path3;
        File file4 = x7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        d20Var.F = path4;
        int v = MediaController.v(d20Var.f23597k, d20Var.f23598l, d20Var.f23599m, true);
        if (x7Var.K && str != null && !x7Var.v()) {
            d20Var.f23601o = str;
            d20Var.I = false;
            d20Var.f23600n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            d20Var.f23596j = E;
            if (E < 1000000 && (arrayList = x7Var.T0) != null && !arrayList.isEmpty()) {
                d20Var.f23599m = 2000000;
                d20Var.f23596j = -1;
            } else {
                int i12 = d20Var.f23596j;
                if (i12 < 500000) {
                    d20Var.f23599m = 2500000;
                    d20Var.f23596j = -1;
                } else {
                    d20Var.f23599m = Utilities.j(i12, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(d20Var.f23596j);
            sb2.append(" => ");
            i5.c.t(d20Var.f23599m, sb2);
            long j12 = iArr2[0][4];
            x7Var.f15751h0 = j12;
            d20Var.v = j12 * 1000;
            float f12 = (float) j12;
            long j13 = x7Var.Z * f12 * 1000;
            d20Var.f23587a = j13;
            long j14 = x7Var.f15734a0 * f12 * 1000;
            d20Var.f23589b = j14;
            d20Var.f23604r = j14 - j13;
            d20Var.f23607u = x7Var.P;
            d20Var.f23606t = x7Var.Y;
            d20Var.f23603q = a8.p0.f(i11 / 1000.0f, v, 8.0f, iArr[5]);
            d20Var.f23603q = Math.max(x7Var.L.length(), d20Var.f23603q);
            d20Var.A = x7Var.f15735a1;
            File file5 = x7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            d20Var.C = path5;
            j3 = 0;
        } else {
            File file6 = x7Var.Z0;
            if (file6 != null) {
                d20Var.f23601o = file6.getAbsolutePath();
            } else {
                d20Var.f23601o = str;
            }
            d20Var.I = true;
            d20Var.L = x7Var.S;
            if (x7Var.v()) {
                int i13 = 0;
                boolean z10 = false;
                while (i13 < x7Var.T.size()) {
                    x7 x7Var2 = (x7) x7Var.T.get(i13);
                    if (x7Var2.K) {
                        x7Var2.f15757k0 = Math.max(x7Var2.f15757k0, iArr2[i13][c10]);
                        x7Var2.f15759l0 = Math.max(x7Var2.f15759l0, iArr2[i13][2]);
                        i10 = v;
                        x7Var2.f15751h0 = Math.max(x7Var2.f15751h0, iArr2[i13][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i13++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = c20.a(x7Var);
                d20Var.M = a10;
                if (!z10) {
                    long j15 = x7Var.S0;
                    x7Var.f15751h0 = j15;
                    d20Var.v = j15;
                    d20Var.f23604r = j15;
                } else {
                    int size = a10.size();
                    long j16 = 0;
                    c20 c20Var = null;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = a10.get(i14);
                        i14++;
                        c20 c20Var2 = (c20) obj;
                        if (c20Var2.f23355b) {
                            long j17 = c20Var2.f23364o;
                            if (j17 > j16) {
                                c20Var = c20Var2;
                                j16 = j17;
                            }
                        }
                    }
                    if (c20Var != null) {
                        long j18 = (c20Var.f23361k - c20Var.f23360j) * ((float) c20Var.f23364o);
                        x7Var.f15751h0 = j18;
                        d20Var.v = j18;
                        d20Var.f23604r = j18;
                        j3 = -(c20Var.f23358f + (f11 * f10));
                        c20Var.f23358f = j3;
                        ArrayList arrayList2 = d20Var.M;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            c20 c20Var3 = (c20) obj2;
                            if (c20Var3.f23355b && c20Var3 != c20Var) {
                                c20Var3.f23358f += j3;
                            }
                        }
                        d20Var.f23587a = -1L;
                        d20Var.f23589b = -1L;
                        d20Var.f23606t = true;
                        d20Var.f23596j = -1;
                        d20Var.f23607u = 1.0f;
                        d20Var.f23599m = -1;
                        d20Var.f23600n = 30;
                        d20Var.f23603q = ((((float) x7Var.f15751h0) / 1000.0f) * i7) / 8.0f;
                        d20Var.A = null;
                    }
                }
            } else {
                i7 = v;
                if (x7Var.f15764o0 != null) {
                    long j19 = (x7Var.f15774t0 - x7Var.f15772s0) * ((float) x7Var.f15768q0);
                    x7Var.f15751h0 = j19;
                    d20Var.v = j19;
                    d20Var.f23604r = j19;
                } else if (x7Var.f15782y != null) {
                    long j20 = (x7Var.F - x7Var.E) * ((float) x7Var.C);
                    x7Var.f15751h0 = j20;
                    d20Var.v = j20;
                    d20Var.f23604r = j20;
                } else {
                    long j21 = x7Var.S0;
                    x7Var.f15751h0 = j21;
                    d20Var.v = j21;
                    d20Var.f23604r = j21;
                }
            }
            j3 = 0;
            d20Var.f23587a = -1L;
            d20Var.f23589b = -1L;
            d20Var.f23606t = true;
            d20Var.f23596j = -1;
            d20Var.f23607u = 1.0f;
            d20Var.f23599m = -1;
            d20Var.f23600n = 30;
            d20Var.f23603q = ((((float) x7Var.f15751h0) / 1000.0f) * i7) / 8.0f;
            d20Var.A = null;
        }
        d20Var.S = x7Var.f15733a;
        d20Var.U = x7Var.f15785z0;
        d20Var.T = x7Var.f15783y0;
        d20Var.f23591c = -1L;
        we weVar = x7Var.m0;
        if (weVar != null) {
            d20Var.H = weVar.clone();
        } else {
            d20Var.H = new we();
        }
        d20Var.H.B = new Matrix();
        d20Var.H.B.set(x7Var.f15762n0);
        d20Var.G = x7Var.T0;
        d20Var.Q = Integer.valueOf(x7Var.A0);
        d20Var.R = Integer.valueOf(x7Var.B0);
        d20Var.V = true;
        d20Var.K = x7Var.f15743d1;
        d20Var.f23590b0.clear();
        if (x7Var.v() && !x7Var.Y) {
            ArrayList arrayList3 = d20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                c20 c20Var4 = (c20) obj3;
                if (c20Var4.f23355b && c20Var4.f23357e > 0.0f && !c20Var4.f23356c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(c20Var4.d);
                    mixedSoundInfo.volume = c20Var4.f23357e;
                    float f13 = c20Var4.f23360j;
                    float f14 = (float) c20Var4.f23364o;
                    mixedSoundInfo.audioOffset = f13 * f14 * 1000;
                    mixedSoundInfo.startTime = c20Var4.f23358f * 1000;
                    mixedSoundInfo.duration = (c20Var4.f23361k - f13) * f14 * 1000;
                    d20Var.f23590b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = x7Var.f15764o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = x7Var.f15776u0;
            float f15 = x7Var.f15772s0;
            float f16 = (float) x7Var.f15768q0;
            long j22 = f15 * f16 * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (x7Var.K) {
                mixedSoundInfo2.startTime = (((float) x7Var.f15770r0) - (x7Var.Z * ((float) x7Var.f15751h0))) * 1000;
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
            mixedSoundInfo2.duration = (x7Var.f15774t0 - f15) * f16 * 1000;
            d20Var.f23590b0.add(mixedSoundInfo2);
        }
        String str2 = x7Var.f15782y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = x7Var.G;
            float f17 = x7Var.E;
            float f18 = (float) x7Var.C;
            long j24 = f17 * f18 * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (x7Var.K) {
                mixedSoundInfo3.startTime = (((float) x7Var.D) - (x7Var.Z * ((float) x7Var.f15751h0))) * 1000;
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
            mixedSoundInfo3.duration = (x7Var.F - f17) * f18 * 1000;
            d20Var.f23590b0.add(mixedSoundInfo3);
        }
        w10Var.a(d20Var);
    }

    private final void b() {
        w2 w2Var = (w2) this.f1284e;
        x3 x3Var = (x3) this.f1282b;
        ((hi.e) this.d).setLoading(false);
        if (((TLObject) this.f1283c) instanceof TLRPC.TL_boolTrue) {
            w2Var.dismiss();
            x3Var.a(Boolean.FALSE);
        }
    }

    private final void c() {
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.d;
        org.telegram.messenger.g0.g(connectedbotstarref.url);
        new kc(((w2) this.f1283c).F, (i6) this.f1284e).I(2131623994, gd.N0(2131754330, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), n10.q((TLRPC.User) this.f1282b)))).j();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.j.run():void");
    }

    public j(Object obj, boolean[] zArr, Object obj2, Object obj3, int i7) {
        this.f1281a = i7;
        this.d = obj;
        this.f1282b = zArr;
        this.f1283c = obj2;
        this.f1284e = obj3;
    }

    public j(String str, boolean[] zArr, g21 g21Var, android.support.v4.media.session.a0 a0Var) {
        this.f1281a = 1;
        this.d = str;
        this.f1282b = zArr;
        this.f1284e = g21Var;
        this.f1283c = a0Var;
    }
}
