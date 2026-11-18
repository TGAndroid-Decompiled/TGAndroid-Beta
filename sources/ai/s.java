package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import di.f6;
import hi.d7;
import hi.w5;
import java.io.File;
import java.util.ArrayList;
import ki.i3;
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
public final class s implements Runnable {
    public final int f1489a;
    public final Object f1490b;
    public final Object f1491c;
    public final Object d;
    public final Object f1492e;

    public s(f6 f6Var, TLObject tLObject, TL_wallet.nftItem nftitem, String str) {
        this.f1489a = 10;
        this.f1491c = f6Var;
        this.d = tLObject;
        this.f1492e = nftitem;
        this.f1490b = str;
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
        d7 d7Var = (d7) this.f1491c;
        String str = (String) this.f1490b;
        int[][] iArr2 = (int[][]) this.d;
        x10 x10Var = (x10) this.f1492e;
        d7Var.getClass();
        e20 e20Var = new e20();
        char c10 = 1;
        e20Var.J = true;
        e20Var.f23638a0 = d7Var.f14396c1;
        e20Var.h = d7Var.f14412k0;
        e20Var.f23645i = d7Var.f14414l0;
        e20Var.f23647k = d7Var.f14408i0;
        e20Var.f23648l = d7Var.f14410j0;
        File file = d7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        e20Var.B = path;
        File file2 = d7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        e20Var.D = path2;
        File file3 = d7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        e20Var.E = path3;
        File file4 = d7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        e20Var.F = path4;
        int v = MediaController.v(e20Var.f23647k, e20Var.f23648l, e20Var.f23649m, true);
        if (d7Var.K && str != null && !d7Var.v()) {
            e20Var.f23651o = str;
            e20Var.I = false;
            e20Var.f23650n = Math.min(59, iArr2[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr2[0][3];
            }
            e20Var.f23646j = E;
            if (E < 1000000 && (arrayList = d7Var.T0) != null && !arrayList.isEmpty()) {
                e20Var.f23649m = 2000000;
                e20Var.f23646j = -1;
            } else {
                int i12 = e20Var.f23646j;
                if (i12 < 500000) {
                    e20Var.f23649m = 2500000;
                    e20Var.f23646j = -1;
                } else {
                    e20Var.f23649m = Utilities.j(i12, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(e20Var.f23646j);
            sb2.append(" => ");
            i5.c.t(e20Var.f23649m, sb2);
            long j12 = iArr2[0][4];
            d7Var.f14406h0 = j12;
            e20Var.v = j12 * 1000;
            float f12 = (float) j12;
            long j13 = d7Var.Z * f12 * 1000;
            e20Var.f23637a = j13;
            long j14 = d7Var.f14389a0 * f12 * 1000;
            e20Var.f23639b = j14;
            e20Var.f23654r = j14 - j13;
            e20Var.f23657u = d7Var.P;
            e20Var.f23656t = d7Var.Y;
            e20Var.f23653q = a8.p0.f(i11 / 1000.0f, v, 8.0f, iArr[5]);
            e20Var.f23653q = Math.max(d7Var.L.length(), e20Var.f23653q);
            e20Var.A = d7Var.f14390a1;
            File file5 = d7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            e20Var.C = path5;
            j3 = 0;
        } else {
            File file6 = d7Var.Z0;
            if (file6 != null) {
                e20Var.f23651o = file6.getAbsolutePath();
            } else {
                e20Var.f23651o = str;
            }
            e20Var.I = true;
            e20Var.L = d7Var.S;
            if (d7Var.v()) {
                int i13 = 0;
                boolean z10 = false;
                while (i13 < d7Var.T.size()) {
                    d7 d7Var2 = (d7) d7Var.T.get(i13);
                    if (d7Var2.K) {
                        d7Var2.f14412k0 = Math.max(d7Var2.f14412k0, iArr2[i13][c10]);
                        d7Var2.f14414l0 = Math.max(d7Var2.f14414l0, iArr2[i13][2]);
                        i10 = v;
                        d7Var2.f14406h0 = Math.max(d7Var2.f14406h0, iArr2[i13][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i13++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = d20.a(d7Var);
                e20Var.M = a10;
                if (!z10) {
                    long j15 = d7Var.S0;
                    d7Var.f14406h0 = j15;
                    e20Var.v = j15;
                    e20Var.f23654r = j15;
                } else {
                    int size = a10.size();
                    long j16 = 0;
                    d20 d20Var = null;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = a10.get(i14);
                        i14++;
                        d20 d20Var2 = (d20) obj;
                        if (d20Var2.f23469b) {
                            long j17 = d20Var2.f23478o;
                            if (j17 > j16) {
                                d20Var = d20Var2;
                                j16 = j17;
                            }
                        }
                    }
                    if (d20Var != null) {
                        long j18 = (d20Var.f23475k - d20Var.f23474j) * ((float) d20Var.f23478o);
                        d7Var.f14406h0 = j18;
                        e20Var.v = j18;
                        e20Var.f23654r = j18;
                        j3 = -(d20Var.f23472f + (f11 * f10));
                        d20Var.f23472f = j3;
                        ArrayList arrayList2 = e20Var.M;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            d20 d20Var3 = (d20) obj2;
                            if (d20Var3.f23469b && d20Var3 != d20Var) {
                                d20Var3.f23472f += j3;
                            }
                        }
                        e20Var.f23637a = -1L;
                        e20Var.f23639b = -1L;
                        e20Var.f23656t = true;
                        e20Var.f23646j = -1;
                        e20Var.f23657u = 1.0f;
                        e20Var.f23649m = -1;
                        e20Var.f23650n = 30;
                        e20Var.f23653q = ((((float) d7Var.f14406h0) / 1000.0f) * i7) / 8.0f;
                        e20Var.A = null;
                    }
                }
            } else {
                i7 = v;
                if (d7Var.f14419o0 != null) {
                    long j19 = (d7Var.f14429t0 - d7Var.f14427s0) * ((float) d7Var.f14423q0);
                    d7Var.f14406h0 = j19;
                    e20Var.v = j19;
                    e20Var.f23654r = j19;
                } else if (d7Var.f14437y != null) {
                    long j20 = (d7Var.F - d7Var.E) * ((float) d7Var.C);
                    d7Var.f14406h0 = j20;
                    e20Var.v = j20;
                    e20Var.f23654r = j20;
                } else {
                    long j21 = d7Var.S0;
                    d7Var.f14406h0 = j21;
                    e20Var.v = j21;
                    e20Var.f23654r = j21;
                }
            }
            j3 = 0;
            e20Var.f23637a = -1L;
            e20Var.f23639b = -1L;
            e20Var.f23656t = true;
            e20Var.f23646j = -1;
            e20Var.f23657u = 1.0f;
            e20Var.f23649m = -1;
            e20Var.f23650n = 30;
            e20Var.f23653q = ((((float) d7Var.f14406h0) / 1000.0f) * i7) / 8.0f;
            e20Var.A = null;
        }
        e20Var.S = d7Var.f14388a;
        e20Var.U = d7Var.f14440z0;
        e20Var.T = d7Var.f14438y0;
        e20Var.f23641c = -1L;
        we weVar = d7Var.m0;
        if (weVar != null) {
            e20Var.H = weVar.clone();
        } else {
            e20Var.H = new we();
        }
        e20Var.H.B = new Matrix();
        e20Var.H.B.set(d7Var.f14417n0);
        e20Var.G = d7Var.T0;
        e20Var.Q = Integer.valueOf(d7Var.A0);
        e20Var.R = Integer.valueOf(d7Var.B0);
        e20Var.V = true;
        e20Var.K = d7Var.f14398d1;
        e20Var.f23640b0.clear();
        if (d7Var.v() && !d7Var.Y) {
            ArrayList arrayList3 = e20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                d20 d20Var4 = (d20) obj3;
                if (d20Var4.f23469b && d20Var4.f23471e > 0.0f && !d20Var4.f23470c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(d20Var4.d);
                    mixedSoundInfo.volume = d20Var4.f23471e;
                    float f13 = d20Var4.f23474j;
                    float f14 = (float) d20Var4.f23478o;
                    mixedSoundInfo.audioOffset = f13 * f14 * 1000;
                    mixedSoundInfo.startTime = d20Var4.f23472f * 1000;
                    mixedSoundInfo.duration = (d20Var4.f23475k - f13) * f14 * 1000;
                    e20Var.f23640b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = d7Var.f14419o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = d7Var.f14431u0;
            float f15 = d7Var.f14427s0;
            float f16 = (float) d7Var.f14423q0;
            long j22 = f15 * f16 * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (d7Var.K) {
                mixedSoundInfo2.startTime = (((float) d7Var.f14425r0) - (d7Var.Z * ((float) d7Var.f14406h0))) * 1000;
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
            mixedSoundInfo2.duration = (d7Var.f14429t0 - f15) * f16 * 1000;
            e20Var.f23640b0.add(mixedSoundInfo2);
        }
        String str2 = d7Var.f14437y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = d7Var.G;
            float f17 = d7Var.E;
            float f18 = (float) d7Var.C;
            long j24 = f17 * f18 * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (d7Var.K) {
                mixedSoundInfo3.startTime = (((float) d7Var.D) - (d7Var.Z * ((float) d7Var.f14406h0))) * 1000;
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
            e20Var.f23640b0.add(mixedSoundInfo3);
        }
        x10Var.a(e20Var);
    }

    private final void b() {
        i3.A0((i3) this.f1490b, (Context) this.f1491c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.f1492e);
    }

    private final void c() {
        boolean[] zArr = (boolean[]) this.f1491c;
        org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
        TLRPC.UserFull userFull = (TLRPC.UserFull) this.f1492e;
        if (!(((TLObject) this.f1490b) instanceof TLRPC.TL_boolTrue)) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.s.run():void");
    }

    public s(w5 w5Var, Bitmap[] bitmapArr, d7 d7Var, boolean[] zArr) {
        this.f1489a = 19;
        this.f1490b = w5Var;
        this.d = bitmapArr;
        this.f1492e = d7Var;
        this.f1491c = zArr;
    }

    public s(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1489a = i7;
        this.f1490b = obj;
        this.f1491c = obj2;
        this.d = obj3;
        this.f1492e = obj4;
    }

    public s(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f1489a = i7;
        this.f1491c = obj;
        this.d = obj2;
        this.f1490b = str;
        this.f1492e = obj3;
    }

    public s(Object obj, String str, Object obj2, Object obj3, int i7) {
        this.f1489a = i7;
        this.f1491c = obj;
        this.f1490b = str;
        this.d = obj2;
        this.f1492e = obj3;
    }
}
