package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import di.f6;
import hi.d7;
import hi.w5;
import java.io.File;
import java.util.ArrayList;
import ki.h3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.f20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.xe;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
public final class m implements Runnable {
    public final int f1369a;
    public final Object f1370b;
    public final Object f1371c;
    public final Object d;
    public final Object f1372e;

    public m(f6 f6Var, TLObject tLObject, TL_wallet.nftItem nftitem, String str) {
        this.f1369a = 10;
        this.f1371c = f6Var;
        this.d = tLObject;
        this.f1372e = nftitem;
        this.f1370b = str;
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
        d7 d7Var = (d7) this.f1371c;
        String str = (String) this.f1370b;
        int[][] iArr2 = (int[][]) this.d;
        y10 y10Var = (y10) this.f1372e;
        d7Var.getClass();
        f20 f20Var = new f20();
        char c10 = 1;
        f20Var.J = true;
        f20Var.f23791a0 = d7Var.f14370c1;
        f20Var.h = d7Var.f14386k0;
        f20Var.f23798i = d7Var.f14388l0;
        f20Var.f23800k = d7Var.f14382i0;
        f20Var.f23801l = d7Var.f14384j0;
        File file = d7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        f20Var.B = path;
        File file2 = d7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        f20Var.D = path2;
        File file3 = d7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        f20Var.E = path3;
        File file4 = d7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        f20Var.F = path4;
        int v = MediaController.v(f20Var.f23800k, f20Var.f23801l, f20Var.f23802m, true);
        if (d7Var.K && str != null && !d7Var.v()) {
            f20Var.f23804o = str;
            f20Var.I = false;
            f20Var.f23803n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            f20Var.f23799j = E;
            if (E < 1000000 && (arrayList = d7Var.T0) != null && !arrayList.isEmpty()) {
                f20Var.f23802m = 2000000;
                f20Var.f23799j = -1;
            } else {
                int i12 = f20Var.f23799j;
                if (i12 < 500000) {
                    f20Var.f23802m = 2500000;
                    f20Var.f23799j = -1;
                } else {
                    f20Var.f23802m = Utilities.j(i12, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(f20Var.f23799j);
            sb2.append(" => ");
            i5.c.t(f20Var.f23802m, sb2);
            long j12 = iArr2[0][4];
            d7Var.f14380h0 = j12;
            f20Var.v = j12 * 1000;
            float f12 = (float) j12;
            long j13 = d7Var.Z * f12 * 1000;
            f20Var.f23790a = j13;
            long j14 = d7Var.f14363a0 * f12 * 1000;
            f20Var.f23792b = j14;
            f20Var.f23807r = j14 - j13;
            f20Var.f23810u = d7Var.P;
            f20Var.f23809t = d7Var.Y;
            f20Var.f23806q = a8.p0.f(i11 / 1000.0f, v, 8.0f, iArr[5]);
            f20Var.f23806q = Math.max(d7Var.L.length(), f20Var.f23806q);
            f20Var.A = d7Var.f14364a1;
            File file5 = d7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            f20Var.C = path5;
            j3 = 0;
        } else {
            File file6 = d7Var.Z0;
            if (file6 != null) {
                f20Var.f23804o = file6.getAbsolutePath();
            } else {
                f20Var.f23804o = str;
            }
            f20Var.I = true;
            f20Var.L = d7Var.S;
            if (d7Var.v()) {
                int i13 = 0;
                boolean z10 = false;
                while (i13 < d7Var.T.size()) {
                    d7 d7Var2 = (d7) d7Var.T.get(i13);
                    if (d7Var2.K) {
                        d7Var2.f14386k0 = Math.max(d7Var2.f14386k0, iArr2[i13][c10]);
                        d7Var2.f14388l0 = Math.max(d7Var2.f14388l0, iArr2[i13][2]);
                        i10 = v;
                        d7Var2.f14380h0 = Math.max(d7Var2.f14380h0, iArr2[i13][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i13++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = e20.a(d7Var);
                f20Var.M = a10;
                if (!z10) {
                    long j15 = d7Var.S0;
                    d7Var.f14380h0 = j15;
                    f20Var.v = j15;
                    f20Var.f23807r = j15;
                } else {
                    int size = a10.size();
                    long j16 = 0;
                    e20 e20Var = null;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = a10.get(i14);
                        i14++;
                        e20 e20Var2 = (e20) obj;
                        if (e20Var2.f23626b) {
                            long j17 = e20Var2.f23635o;
                            if (j17 > j16) {
                                e20Var = e20Var2;
                                j16 = j17;
                            }
                        }
                    }
                    if (e20Var != null) {
                        long j18 = (e20Var.f23632k - e20Var.f23631j) * ((float) e20Var.f23635o);
                        d7Var.f14380h0 = j18;
                        f20Var.v = j18;
                        f20Var.f23807r = j18;
                        j3 = -(e20Var.f23629f + (f11 * f10));
                        e20Var.f23629f = j3;
                        ArrayList arrayList2 = f20Var.M;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            e20 e20Var3 = (e20) obj2;
                            if (e20Var3.f23626b && e20Var3 != e20Var) {
                                e20Var3.f23629f += j3;
                            }
                        }
                        f20Var.f23790a = -1L;
                        f20Var.f23792b = -1L;
                        f20Var.f23809t = true;
                        f20Var.f23799j = -1;
                        f20Var.f23810u = 1.0f;
                        f20Var.f23802m = -1;
                        f20Var.f23803n = 30;
                        f20Var.f23806q = ((((float) d7Var.f14380h0) / 1000.0f) * i7) / 8.0f;
                        f20Var.A = null;
                    }
                }
            } else {
                i7 = v;
                if (d7Var.f14393o0 != null) {
                    long j19 = (d7Var.f14403t0 - d7Var.f14401s0) * ((float) d7Var.f14397q0);
                    d7Var.f14380h0 = j19;
                    f20Var.v = j19;
                    f20Var.f23807r = j19;
                } else if (d7Var.f14411y != null) {
                    long j20 = (d7Var.F - d7Var.E) * ((float) d7Var.C);
                    d7Var.f14380h0 = j20;
                    f20Var.v = j20;
                    f20Var.f23807r = j20;
                } else {
                    long j21 = d7Var.S0;
                    d7Var.f14380h0 = j21;
                    f20Var.v = j21;
                    f20Var.f23807r = j21;
                }
            }
            j3 = 0;
            f20Var.f23790a = -1L;
            f20Var.f23792b = -1L;
            f20Var.f23809t = true;
            f20Var.f23799j = -1;
            f20Var.f23810u = 1.0f;
            f20Var.f23802m = -1;
            f20Var.f23803n = 30;
            f20Var.f23806q = ((((float) d7Var.f14380h0) / 1000.0f) * i7) / 8.0f;
            f20Var.A = null;
        }
        f20Var.S = d7Var.f14362a;
        f20Var.U = d7Var.f14414z0;
        f20Var.T = d7Var.f14412y0;
        f20Var.f23794c = -1L;
        xe xeVar = d7Var.m0;
        if (xeVar != null) {
            f20Var.H = xeVar.clone();
        } else {
            f20Var.H = new xe();
        }
        f20Var.H.B = new Matrix();
        f20Var.H.B.set(d7Var.f14391n0);
        f20Var.G = d7Var.T0;
        f20Var.Q = Integer.valueOf(d7Var.A0);
        f20Var.R = Integer.valueOf(d7Var.B0);
        f20Var.V = true;
        f20Var.K = d7Var.f14372d1;
        f20Var.f23793b0.clear();
        if (d7Var.v() && !d7Var.Y) {
            ArrayList arrayList3 = f20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                e20 e20Var4 = (e20) obj3;
                if (e20Var4.f23626b && e20Var4.f23628e > 0.0f && !e20Var4.f23627c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(e20Var4.d);
                    mixedSoundInfo.volume = e20Var4.f23628e;
                    float f13 = e20Var4.f23631j;
                    float f14 = (float) e20Var4.f23635o;
                    mixedSoundInfo.audioOffset = f13 * f14 * 1000;
                    mixedSoundInfo.startTime = e20Var4.f23629f * 1000;
                    mixedSoundInfo.duration = (e20Var4.f23632k - f13) * f14 * 1000;
                    f20Var.f23793b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = d7Var.f14393o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = d7Var.f14405u0;
            float f15 = d7Var.f14401s0;
            float f16 = (float) d7Var.f14397q0;
            long j22 = f15 * f16 * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (d7Var.K) {
                mixedSoundInfo2.startTime = (((float) d7Var.f14399r0) - (d7Var.Z * ((float) d7Var.f14380h0))) * 1000;
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
            mixedSoundInfo2.duration = (d7Var.f14403t0 - f15) * f16 * 1000;
            f20Var.f23793b0.add(mixedSoundInfo2);
        }
        String str2 = d7Var.f14411y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = d7Var.G;
            float f17 = d7Var.E;
            float f18 = (float) d7Var.C;
            long j24 = f17 * f18 * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (d7Var.K) {
                mixedSoundInfo3.startTime = (((float) d7Var.D) - (d7Var.Z * ((float) d7Var.f14380h0))) * 1000;
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
            f20Var.f23793b0.add(mixedSoundInfo3);
        }
        y10Var.a(f20Var);
    }

    private final void b() {
        h3.A0((h3) this.f1370b, (Context) this.f1371c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.f1372e);
    }

    private final void c() {
        boolean[] zArr = (boolean[]) this.f1371c;
        org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
        TLRPC.UserFull userFull = (TLRPC.UserFull) this.f1372e;
        if (!(((TLObject) this.f1370b) instanceof TLRPC.TL_boolTrue)) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.m.run():void");
    }

    public m(w5 w5Var, Bitmap[] bitmapArr, d7 d7Var, boolean[] zArr) {
        this.f1369a = 19;
        this.f1370b = w5Var;
        this.d = bitmapArr;
        this.f1372e = d7Var;
        this.f1371c = zArr;
    }

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1369a = i7;
        this.f1370b = obj;
        this.f1371c = obj2;
        this.d = obj3;
        this.f1372e = obj4;
    }

    public m(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f1369a = i7;
        this.f1371c = obj;
        this.d = obj2;
        this.f1370b = str;
        this.f1372e = obj3;
    }

    public m(Object obj, String str, Object obj2, Object obj3, int i7) {
        this.f1369a = i7;
        this.f1371c = obj;
        this.f1370b = str;
        this.d = obj2;
        this.f1372e = obj3;
    }
}
