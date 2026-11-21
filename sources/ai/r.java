package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import di.f6;
import hi.c7;
import hi.v5;
import java.io.File;
import java.util.ArrayList;
import ki.h3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.we;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
public final class r implements Runnable {
    public final int f1438a;
    public final Object f1439b;
    public final Object f1440c;
    public final Object d;
    public final Object f1441e;

    public r(f6 f6Var, TLObject tLObject, TL_wallet.nftItem nftitem, String str) {
        this.f1438a = 10;
        this.f1440c = f6Var;
        this.d = tLObject;
        this.f1441e = nftitem;
        this.f1439b = str;
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
        c7 c7Var = (c7) this.f1440c;
        String str = (String) this.f1439b;
        int[][] iArr2 = (int[][]) this.d;
        x10 x10Var = (x10) this.f1441e;
        c7Var.getClass();
        e20 e20Var = new e20();
        char c10 = 1;
        e20Var.J = true;
        e20Var.f23663a0 = c7Var.f14343c1;
        e20Var.h = c7Var.f14359k0;
        e20Var.f23670i = c7Var.f14361l0;
        e20Var.f23672k = c7Var.f14355i0;
        e20Var.f23673l = c7Var.f14357j0;
        File file = c7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        e20Var.B = path;
        File file2 = c7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        e20Var.D = path2;
        File file3 = c7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        e20Var.E = path3;
        File file4 = c7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        e20Var.F = path4;
        int v = MediaController.v(e20Var.f23672k, e20Var.f23673l, e20Var.f23674m, true);
        if (c7Var.K && str != null && !c7Var.v()) {
            e20Var.f23676o = str;
            e20Var.I = false;
            e20Var.f23675n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            e20Var.f23671j = E;
            if (E < 1000000 && (arrayList = c7Var.T0) != null && !arrayList.isEmpty()) {
                e20Var.f23674m = 2000000;
                e20Var.f23671j = -1;
            } else {
                int i12 = e20Var.f23671j;
                if (i12 < 500000) {
                    e20Var.f23674m = 2500000;
                    e20Var.f23671j = -1;
                } else {
                    e20Var.f23674m = Utilities.j(i12, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(e20Var.f23671j);
            sb2.append(" => ");
            i5.c.t(e20Var.f23674m, sb2);
            long j12 = iArr2[0][4];
            c7Var.f14353h0 = j12;
            e20Var.v = j12 * 1000;
            float f12 = (float) j12;
            long j13 = c7Var.Z * f12 * 1000;
            e20Var.f23662a = j13;
            long j14 = c7Var.f14336a0 * f12 * 1000;
            e20Var.f23664b = j14;
            e20Var.f23679r = j14 - j13;
            e20Var.f23682u = c7Var.P;
            e20Var.f23681t = c7Var.Y;
            e20Var.f23678q = a8.p0.f(i11 / 1000.0f, v, 8.0f, iArr[5]);
            e20Var.f23678q = Math.max(c7Var.L.length(), e20Var.f23678q);
            e20Var.A = c7Var.f14337a1;
            File file5 = c7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            e20Var.C = path5;
            j3 = 0;
        } else {
            File file6 = c7Var.Z0;
            if (file6 != null) {
                e20Var.f23676o = file6.getAbsolutePath();
            } else {
                e20Var.f23676o = str;
            }
            e20Var.I = true;
            e20Var.L = c7Var.S;
            if (c7Var.v()) {
                int i13 = 0;
                boolean z10 = false;
                while (i13 < c7Var.T.size()) {
                    c7 c7Var2 = (c7) c7Var.T.get(i13);
                    if (c7Var2.K) {
                        c7Var2.f14359k0 = Math.max(c7Var2.f14359k0, iArr2[i13][c10]);
                        c7Var2.f14361l0 = Math.max(c7Var2.f14361l0, iArr2[i13][2]);
                        i10 = v;
                        c7Var2.f14353h0 = Math.max(c7Var2.f14353h0, iArr2[i13][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i13++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = d20.a(c7Var);
                e20Var.M = a10;
                if (!z10) {
                    long j15 = c7Var.S0;
                    c7Var.f14353h0 = j15;
                    e20Var.v = j15;
                    e20Var.f23679r = j15;
                } else {
                    int size = a10.size();
                    long j16 = 0;
                    d20 d20Var = null;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = a10.get(i14);
                        i14++;
                        d20 d20Var2 = (d20) obj;
                        if (d20Var2.f23494b) {
                            long j17 = d20Var2.f23503o;
                            if (j17 > j16) {
                                d20Var = d20Var2;
                                j16 = j17;
                            }
                        }
                    }
                    if (d20Var != null) {
                        long j18 = (d20Var.f23500k - d20Var.f23499j) * ((float) d20Var.f23503o);
                        c7Var.f14353h0 = j18;
                        e20Var.v = j18;
                        e20Var.f23679r = j18;
                        j3 = -(d20Var.f23497f + (f11 * f10));
                        d20Var.f23497f = j3;
                        ArrayList arrayList2 = e20Var.M;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            d20 d20Var3 = (d20) obj2;
                            if (d20Var3.f23494b && d20Var3 != d20Var) {
                                d20Var3.f23497f += j3;
                            }
                        }
                        e20Var.f23662a = -1L;
                        e20Var.f23664b = -1L;
                        e20Var.f23681t = true;
                        e20Var.f23671j = -1;
                        e20Var.f23682u = 1.0f;
                        e20Var.f23674m = -1;
                        e20Var.f23675n = 30;
                        e20Var.f23678q = ((((float) c7Var.f14353h0) / 1000.0f) * i7) / 8.0f;
                        e20Var.A = null;
                    }
                }
            } else {
                i7 = v;
                if (c7Var.f14366o0 != null) {
                    long j19 = (c7Var.f14376t0 - c7Var.f14374s0) * ((float) c7Var.f14370q0);
                    c7Var.f14353h0 = j19;
                    e20Var.v = j19;
                    e20Var.f23679r = j19;
                } else if (c7Var.f14384y != null) {
                    long j20 = (c7Var.F - c7Var.E) * ((float) c7Var.C);
                    c7Var.f14353h0 = j20;
                    e20Var.v = j20;
                    e20Var.f23679r = j20;
                } else {
                    long j21 = c7Var.S0;
                    c7Var.f14353h0 = j21;
                    e20Var.v = j21;
                    e20Var.f23679r = j21;
                }
            }
            j3 = 0;
            e20Var.f23662a = -1L;
            e20Var.f23664b = -1L;
            e20Var.f23681t = true;
            e20Var.f23671j = -1;
            e20Var.f23682u = 1.0f;
            e20Var.f23674m = -1;
            e20Var.f23675n = 30;
            e20Var.f23678q = ((((float) c7Var.f14353h0) / 1000.0f) * i7) / 8.0f;
            e20Var.A = null;
        }
        e20Var.S = c7Var.f14335a;
        e20Var.U = c7Var.f14387z0;
        e20Var.T = c7Var.f14385y0;
        e20Var.f23666c = -1L;
        we weVar = c7Var.m0;
        if (weVar != null) {
            e20Var.H = weVar.clone();
        } else {
            e20Var.H = new we();
        }
        e20Var.H.B = new Matrix();
        e20Var.H.B.set(c7Var.f14364n0);
        e20Var.G = c7Var.T0;
        e20Var.Q = Integer.valueOf(c7Var.A0);
        e20Var.R = Integer.valueOf(c7Var.B0);
        e20Var.V = true;
        e20Var.K = c7Var.f14345d1;
        e20Var.f23665b0.clear();
        if (c7Var.v() && !c7Var.Y) {
            ArrayList arrayList3 = e20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                d20 d20Var4 = (d20) obj3;
                if (d20Var4.f23494b && d20Var4.f23496e > 0.0f && !d20Var4.f23495c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(d20Var4.d);
                    mixedSoundInfo.volume = d20Var4.f23496e;
                    float f13 = d20Var4.f23499j;
                    float f14 = (float) d20Var4.f23503o;
                    mixedSoundInfo.audioOffset = f13 * f14 * 1000;
                    mixedSoundInfo.startTime = d20Var4.f23497f * 1000;
                    mixedSoundInfo.duration = (d20Var4.f23500k - f13) * f14 * 1000;
                    e20Var.f23665b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = c7Var.f14366o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = c7Var.f14378u0;
            float f15 = c7Var.f14374s0;
            float f16 = (float) c7Var.f14370q0;
            long j22 = f15 * f16 * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (c7Var.K) {
                mixedSoundInfo2.startTime = (((float) c7Var.f14372r0) - (c7Var.Z * ((float) c7Var.f14353h0))) * 1000;
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
            mixedSoundInfo2.duration = (c7Var.f14376t0 - f15) * f16 * 1000;
            e20Var.f23665b0.add(mixedSoundInfo2);
        }
        String str2 = c7Var.f14384y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = c7Var.G;
            float f17 = c7Var.E;
            float f18 = (float) c7Var.C;
            long j24 = f17 * f18 * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (c7Var.K) {
                mixedSoundInfo3.startTime = (((float) c7Var.D) - (c7Var.Z * ((float) c7Var.f14353h0))) * 1000;
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
            mixedSoundInfo3.duration = (c7Var.F - f17) * f18 * 1000;
            e20Var.f23665b0.add(mixedSoundInfo3);
        }
        x10Var.a(e20Var);
    }

    private final void b() {
        h3.A0((h3) this.f1439b, (Context) this.f1440c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.f1441e);
    }

    private final void c() {
        boolean[] zArr = (boolean[]) this.f1440c;
        org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
        TLRPC.UserFull userFull = (TLRPC.UserFull) this.f1441e;
        if (!(((TLObject) this.f1439b) instanceof TLRPC.TL_boolTrue)) {
            if (!zArr[0]) {
                zArr[0] = true;
                oVar.a(Boolean.TRUE, "cancelled");
                return;
            }
            return;
        }
        userFull.bot_can_manage_emoji_status = true;
        if (!zArr[0]) {
            zArr[0] = true;
            oVar.a(Boolean.TRUE, "allowed");
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.r.run():void");
    }

    public r(v5 v5Var, Bitmap[] bitmapArr, c7 c7Var, boolean[] zArr) {
        this.f1438a = 19;
        this.f1439b = v5Var;
        this.d = bitmapArr;
        this.f1441e = c7Var;
        this.f1440c = zArr;
    }

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1438a = i7;
        this.f1439b = obj;
        this.f1440c = obj2;
        this.d = obj3;
        this.f1441e = obj4;
    }

    public r(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f1438a = i7;
        this.f1440c = obj;
        this.d = obj2;
        this.f1439b = str;
        this.f1441e = obj3;
    }

    public r(Object obj, String str, Object obj2, Object obj3, int i7) {
        this.f1438a = i7;
        this.f1440c = obj;
        this.f1439b = str;
        this.d = obj2;
        this.f1441e = obj3;
    }
}
