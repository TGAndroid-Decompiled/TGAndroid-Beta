package l2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import c3.g0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import gg.a2;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import m.f3;
import o2.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.sv0;
import org.telegram.ui.vs0;
import qg.o2;
import qg.v1;
import s4.d1;
import s4.g1;
import s4.j1;
import s4.p0;
import u2.b1;
import u2.c1;
import u2.n1;
import u2.t;
import v7.g5;
import w7.u8;
public class g implements y2.g, m.k, n5.b, o0.a, b1, l1, ah.j, lg.e, n81, a2, s, v1, com.google.android.gms.common.api.internal.o, j1, s0 {
    public final int f15080a;
    public Object f15081b;

    public g(int i10) {
        this.f15080a = i10;
    }

    public static int P0(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.P0(b2.s):int");
    }

    public boolean A0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void C(y2.i iVar, long j3, long j10) {
        int size;
        int i10;
        boolean z10;
        long j11;
        y2.o oVar = (y2.o) iVar;
        h hVar = (h) this.f15081b;
        long j12 = oVar.f51931a;
        Uri uri = oVar.d.f10233c;
        t tVar = new t(j10);
        hVar.f15086m.getClass();
        hVar.f15090q.q(tVar, oVar.f51933c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f51935f;
        m2.c cVar2 = hVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f15671m.size();
        }
        long j13 = cVar.b(0).f15690b;
        int i11 = 0;
        while (i11 < size && hVar.H.b(i11).f15690b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f15671m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = hVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    z10 = true;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.N);
                    }
                } else {
                    i10 = i11;
                    z10 = true;
                }
                hVar.M = 0;
            }
            int i12 = hVar.M;
            hVar.M = i12 + 1;
            if (i12 < hVar.f15086m.J(oVar.f51933c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.M - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        i10 = i11;
        z10 = true;
        j11 = -9223372036854775807L;
        hVar.H = cVar;
        hVar.I = cVar.d & hVar.I;
        hVar.J = j3 - j10;
        hVar.K = j3;
        hVar.O += i10;
        synchronized (hVar.f15093t) {
            try {
                if (oVar.f51932b.f10265a.equals(hVar.F)) {
                    Uri uri2 = hVar.H.f15669k;
                    if (uri2 == null) {
                        uri2 = u8.a(oVar.d.f10233c);
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.H;
        if (cVar3.d && hVar.L == j11) {
            pf.b bVar = cVar3.f15667i;
            if (bVar != null) {
                String str = (String) bVar.f45448b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.x(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.v();
                                return;
                            }
                        }
                        hVar.z(bVar, new ob.a(12));
                        return;
                    }
                    hVar.z(bVar, new Object());
                    return;
                }
                try {
                    hVar.L = d0.S((String) bVar.f45449c) - hVar.K;
                    hVar.y(z10);
                    return;
                } catch (b2.s0 e7) {
                    hVar.x(e7);
                    return;
                }
            }
            hVar.v();
            return;
        }
        hVar.y(true);
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean C2(int i10) {
        return false;
    }

    @Override
    public int D() {
        return ((p0) this.f15081b).D();
    }

    @Override
    public a0.i G() {
        switch (this.f15080a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public p9 G2() {
        return null;
    }

    @Override
    public void H(y2.i iVar, long j3, long j10, boolean z10) {
        ((h) this.f15081b).w((y2.o) iVar, j10);
    }

    public void H0(d1 d1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        d1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15081b;
        recyclerView.f3138b.k(d1Var);
        recyclerView.h(d1Var);
        d1Var.q(false);
        g1 g1Var = (g1) recyclerView.f3141c0;
        g1Var.getClass();
        int i13 = q0Var.f3531a;
        int i14 = q0Var.f3532b;
        View view = d1Var.f47897a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3531a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3532b;
        }
        int i16 = i11;
        if (!d1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = g1Var.r(d1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = d1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            d1Var.f47903i = (d1Var.h - i18) + (i18 * 1000);
            g1Var.s(d1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override
    public boolean H1() {
        return false;
    }

    public void J(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        long j3;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr;
        int i19;
        u3.d dVar = (u3.d) this.f15081b;
        u3.e eVar = dVar.f49042b;
        SparseArray sparseArray = dVar.f49044c;
        v vVar = dVar.f49053k;
        v vVar2 = dVar.f49051i;
        int i20 = 1;
        int i21 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.d(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f49065x.f49031x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw b2.s0.a(null, "Unexpected id: " + i10);
                                }
                                dVar.d(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f49065x.f49020l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(vVar.f8581a, (byte) 0);
                            pVar.readFully(vVar.f8581a, 4 - i11, i11);
                            vVar.J(0);
                            dVar.f49067z = (int) vVar.z();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        dVar.d(i10);
                        dVar.f49065x.f49019k = new g0(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.d(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f49065x.f49018j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.d(i10);
                u3.c cVar = dVar.f49065x;
                int i22 = cVar.h;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    pVar.o(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.J == 2) {
                u3.c cVar2 = (u3.c) sparseArray.get(dVar.P);
                int i23 = dVar.S;
                v vVar3 = dVar.f49058p;
                if (i23 == 4 && "V_VP9".equals(cVar2.f49013c)) {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.f8581a, 0, i11);
                    return;
                }
                pVar.o(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.f49070c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.o(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i24 = (vVar2.f8581a[2] & 6) >> 1;
            int i25 = 255;
            if (i24 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i26 = (vVar2.f8581a[3] & 255) + 1;
                dVar.N = i26;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i26];
                } else if (iArr2.length < i26) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i26)];
                }
                dVar.O = iArr2;
                if (i24 == 2) {
                    int i27 = dVar.N;
                    Arrays.fill(iArr2, 0, i27, ((i11 - dVar.Q) - 4) / i27);
                } else if (i24 == 1) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        i16 = dVar.N - 1;
                        if (i28 >= i16) {
                            break;
                        }
                        dVar.O[i28] = 0;
                        while (true) {
                            i17 = i30 + 1;
                            dVar.j(pVar, i17);
                            int i31 = vVar2.f8581a[i30] & 255;
                            int[] iArr3 = dVar.O;
                            i18 = iArr3[i28] + i31;
                            iArr3[i28] = i18;
                            if (i31 != 255) {
                                break;
                            }
                            i30 = i17;
                        }
                        i29 += i18;
                        i28++;
                        i30 = i17;
                    }
                    dVar.O[i16] = ((i11 - dVar.Q) - i30) - i29;
                } else if (i24 == 3) {
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        int i35 = dVar.N - i20;
                        if (i32 < i35) {
                            dVar.O[i32] = i21;
                            int i36 = i34 + 1;
                            dVar.j(pVar, i36);
                            if (vVar2.f8581a[i34] != 0) {
                                int i37 = i20;
                                int i38 = i21;
                                while (true) {
                                    if (i38 < 8) {
                                        int i39 = i37 << (7 - i38);
                                        i14 = i21;
                                        if ((vVar2.f8581a[i34] & i39) != 0) {
                                            i15 = i36 + i38;
                                            dVar.j(pVar, i15);
                                            j3 = vVar2.f8581a[i34] & i25 & (~i39);
                                            while (i36 < i15) {
                                                j3 = (j3 << 8) | (vVar2.f8581a[i36] & i25);
                                                i36++;
                                                i25 = 255;
                                            }
                                            if (i32 > 0) {
                                                j3 -= (1 << ((i38 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i38++;
                                            i21 = i14;
                                            i25 = 255;
                                        }
                                    } else {
                                        i14 = i21;
                                        j3 = 0;
                                        i15 = i36;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i40 = (int) j3;
                                int[] iArr4 = dVar.O;
                                if (i32 != 0) {
                                    i40 += iArr4[i32 - 1];
                                }
                                iArr4[i32] = i40;
                                i33 += i40;
                                i32++;
                                i34 = i15;
                                i20 = i37;
                                i21 = i14;
                                i25 = 255;
                            } else {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i12 = i20;
                            i13 = i21;
                            dVar.O[i35] = ((i11 - dVar.Q) - i34) - i33;
                            break;
                        }
                    }
                    throw b2.s0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw b2.s0.a(null, "Unexpected lacing value: " + i24);
                }
            }
            i12 = 1;
            i13 = 0;
            int i41 = vVar2.f8581a[i12] & 255;
            dVar.K = dVar.l(i41 | (bArr[i13] << 8)) + dVar.E;
            if (cVar3.f49014e != 2 && (i10 != 163 || (vVar2.f8581a[2] & 128) != 128)) {
                i19 = i13;
            } else {
                i19 = i12;
            }
            dVar.R = i19;
            dVar.J = 2;
            dVar.M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i42 = dVar.M;
                if (i42 < dVar.N) {
                    dVar.e(cVar3, ((dVar.M * cVar3.f49015f) / 1000) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i42], false), 0);
                    dVar.M++;
                } else {
                    dVar.J = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i43 = dVar.M;
                if (i43 < dVar.N) {
                    int[] iArr5 = dVar.O;
                    boolean z10 = i12;
                    iArr5[i43] = dVar.n(pVar, cVar3, iArr5[i43], z10);
                    dVar.M += z10 ? 1 : 0;
                } else {
                    return;
                }
            }
        }
    }

    public byte J0() {
        int read = ((com.google.firebase.messaging.d) this.f15081b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void K() {
        ((zf0) this.f15081b).f33350b.f15319a.g(1, true);
    }

    public int L0() {
        return ((J0() & 255) << 24) | ((J0() & 255) << 16) | ((J0() & 255) << 8) | (J0() & 255);
    }

    public int M0() {
        return ((J0() & Byte.MAX_VALUE) << 21) | ((J0() & Byte.MAX_VALUE) << 14) | ((J0() & Byte.MAX_VALUE) << 7) | (J0() & Byte.MAX_VALUE);
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void O0(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.f15081b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    public void Q0(d1 d1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15081b;
        p0 p0Var = recyclerView.f3167x;
        View view = d1Var.f47897a;
        pf.e eVar = recyclerView.f3138b;
        f3 f3Var = p0Var.f48002a;
        k2.g0 g0Var = (k2.g0) f3Var.f15424b;
        int indexOfChild = ((RecyclerView) g0Var.f14467b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) f3Var.f15425c).A(indexOfChild)) {
                f3Var.Y(view);
            }
            g0Var.f(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    @Override
    public int U() {
        p0 p0Var = (p0) this.f15081b;
        return p0Var.f48012m - p0Var.E();
    }

    @Override
    public void U0(int i10, u1 u1Var) {
        ga gaVar = (ga) this.f15081b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f21938s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.f15081b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f21938s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public a0.i W() {
        switch (this.f15080a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean X() {
        yf0 yf0Var = ((zf0) this.f15081b).f33349a;
        if (yf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((vs0) yf0Var).f42847a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public View Z(int i10) {
        return ((p0) this.f15081b).q(i10);
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15080a) {
            case 16:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.p) this.f15081b);
                try {
                    aVar.f338b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            case 24:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, (s6.a) this.f15081b);
                eVar.I0(H02, 1);
                return;
            default:
                v8.e eVar2 = (v8.e) this.f15081b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar2 = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8698a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    iVar.f8706a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e7);
                    Bundle bundle = Bundle.EMPTY;
                    g5.a(Status.h, Boolean.FALSE, aVar2.f8697b);
                    return;
                }
        }
    }

    @Override
    public void b(c1 c1Var) {
        q qVar = (q) c1Var;
        o2.k kVar = (o2.k) this.f15081b;
        kVar.G.b(kVar);
    }

    @Override
    public boolean b0(int i10) {
        switch (this.f15080a) {
            case 13:
                if (i10 == ((or0) this.f15081b).f29280r) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean b1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public androidx.lifecycle.p0 c(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15081b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15081b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override
    public int d0(View view) {
        return p0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public boolean e() {
        return ((ga) this.f15081b).a();
    }

    @Override
    public sv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public androidx.lifecycle.p0 f1(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f15081b) {
            if (cVar.f49266a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public void g0(ah.a aVar) {
        aVar.a(((aj) this.f15081b).getThemedColor(h6.f20560d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public Object mo27get() {
        return this.f15081b;
    }

    @Override
    public void h(int i10) {
        switch (this.f15080a) {
            case 13:
                or0 or0Var = (or0) this.f15081b;
                sr0 sr0Var = or0Var.K;
                or0Var.f29281s = i10;
                if (or0Var.v != i10) {
                    or0Var.d.clear();
                }
                int i11 = or0Var.J;
                if (or0Var.h() == 0 && !or0Var.f29277e.e() && !or0Var.I) {
                    sr0Var.Q.e(false, true);
                } else {
                    sr0Var.f30663x0.b(i11);
                }
                or0Var.l();
                int i12 = sr0.f30631a1;
                sr0Var.L0(true);
                return;
            default:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) this.f15081b;
                if (!u8Var.f35427n && i10 == u8Var.I) {
                    u8Var.d0(u8Var.M.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.f15081b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f21938s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void i0(ArrayList arrayList) {
        int i10 = this.f15080a;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        if (i10 == ((ga) this.f15081b).f21938s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int j0(u1 u1Var) {
        return 0;
    }

    @Override
    public void l(Canvas canvas) {
        aj ajVar = (aj) this.f15081b;
        canvas.drawColor(ajVar.getThemedColor(h6.f20560d6));
        if (SharedConfig.chatBlurEnabled()) {
            ajVar.F2.b(canvas, -2);
        }
    }

    @Override
    public void l0(float f7) {
        ((o2) this.f15081b).setOutlineWidth(f7);
    }

    @Override
    public int m(View view) {
        return p0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void m0() {
        ((zf0) this.f15081b).f33350b.k();
    }

    @Override
    public void n0(float f7) {
        zf0 zf0Var = (zf0) this.f15081b;
        zf0Var.f33350b.setRotation(f7);
        zf0Var.getClass();
        yf0 yf0Var = zf0Var.f33349a;
        if (yf0Var != null) {
            ((vs0) yf0Var).a(false);
        }
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public boolean o0() {
        return e();
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        ol0 ol0Var = (ol0) this.f15081b;
        if (z10 && ol0Var.f29243n.n() >= 0) {
            ol0Var.f29246w = true;
        }
        kh0 kh0Var = ol0Var.f29242f;
        cd0 cd0Var = ol0Var.f29247x;
        kh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(cd0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(cd0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public s0.d p0(int i10) {
        return null;
    }

    @Override
    public boolean q() {
        yf0 yf0Var = ((zf0) this.f15081b).f33349a;
        if (yf0Var != null) {
            PhotoViewer photoViewer = ((vs0) yf0Var).f42847a;
            Drawable[] drawableArr = PhotoViewer.U8;
            return photoViewer.N0();
        }
        return false;
    }

    public s0.d q0(int i10) {
        return null;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean s0(b6 b6Var) {
        return false;
    }

    public void t0(int i10, long j3) {
        u3.d dVar = (u3.d) this.f15081b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        dVar.d(i10);
                        dVar.f49065x.f49014e = (int) j3;
                        return;
                    case 136:
                        dVar.d(i10);
                        u3.c cVar = dVar.f49065x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar.X = z10;
                        return;
                    case 155:
                        dVar.L = dVar.l(j3);
                        return;
                    case 159:
                        dVar.d(i10);
                        dVar.f49065x.Q = (int) j3;
                        return;
                    case 176:
                        dVar.d(i10);
                        dVar.f49065x.f49022n = (int) j3;
                        return;
                    case 179:
                        dVar.a(i10);
                        dVar.F.d(dVar.l(j3));
                        return;
                    case 186:
                        dVar.d(i10);
                        dVar.f49065x.f49023o = (int) j3;
                        return;
                    case 215:
                        dVar.d(i10);
                        dVar.f49065x.d = (int) j3;
                        return;
                    case 231:
                        dVar.E = dVar.l(j3);
                        return;
                    case 238:
                        dVar.S = (int) j3;
                        return;
                    case 241:
                        if (!dVar.H) {
                            dVar.a(i10);
                            dVar.G.d(j3);
                            dVar.H = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.T = true;
                        return;
                    case 16871:
                        dVar.d(i10);
                        dVar.f49065x.h = (int) j3;
                        return;
                    case 16980:
                        if (j3 != 3) {
                            throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j3 < 1 || j3 > 2) {
                            throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j3 != 5) {
                            throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.A = j3 + dVar.f49061s;
                        return;
                    case 21432:
                        int i11 = (int) j3;
                        dVar.d(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f49065x.f49032y = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f49065x.f49032y = 1;
                                return;
                            }
                            dVar.f49065x.f49032y = 2;
                            return;
                        }
                        dVar.f49065x.f49032y = 0;
                        return;
                    case 21680:
                        dVar.d(i10);
                        dVar.f49065x.f49025q = (int) j3;
                        return;
                    case 21682:
                        dVar.d(i10);
                        dVar.f49065x.f49027s = (int) j3;
                        return;
                    case 21690:
                        dVar.d(i10);
                        dVar.f49065x.f49026r = (int) j3;
                        return;
                    case 21930:
                        dVar.d(i10);
                        u3.c cVar2 = dVar.f49065x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar2.W = z10;
                        return;
                    case 21938:
                        dVar.d(i10);
                        u3.c cVar3 = dVar.f49065x;
                        cVar3.f49033z = true;
                        cVar3.f49024p = (int) j3;
                        return;
                    case 21998:
                        dVar.d(i10);
                        dVar.f49065x.f49016g = (int) j3;
                        return;
                    case 22186:
                        dVar.d(i10);
                        dVar.f49065x.T = j3;
                        return;
                    case 22203:
                        dVar.d(i10);
                        dVar.f49065x.U = j3;
                        return;
                    case 25188:
                        dVar.d(i10);
                        dVar.f49065x.R = (int) j3;
                        return;
                    case 30114:
                        dVar.U = j3;
                        return;
                    case 30321:
                        dVar.d(i10);
                        int i12 = (int) j3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f49065x.f49028t = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f49065x.f49028t = 2;
                                return;
                            }
                            dVar.f49065x.f49028t = 1;
                            return;
                        }
                        dVar.f49065x.f49028t = 0;
                        return;
                    case 2352003:
                        dVar.d(i10);
                        dVar.f49065x.f49015f = (int) j3;
                        return;
                    case 2807729:
                        dVar.f49062t = j3;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.d(i10);
                                int i13 = (int) j3;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f49065x.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f49065x.C = 2;
                                return;
                            case 21946:
                                dVar.d(i10);
                                int g10 = b2.j.g((int) j3);
                                if (g10 != -1) {
                                    dVar.f49065x.B = g10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i10);
                                dVar.f49065x.f49033z = true;
                                int f7 = b2.j.f((int) j3);
                                if (f7 != -1) {
                                    dVar.f49065x.A = f7;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i10);
                                dVar.f49065x.D = (int) j3;
                                return;
                            case 21949:
                                dVar.d(i10);
                                dVar.f49065x.E = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j3 != 1) {
                throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
            }
        } else if (j3 == 0) {
        } else {
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
    }

    @Override
    public void v(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f15081b);
    }

    public void v0() {
        q[] qVarArr;
        q[] qVarArr2;
        o2.k kVar = (o2.k) this.f15081b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f48887a;
        }
        b2.l1[] l1VarArr = new b2.l1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f48887a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new n1(l1VarArr);
        kVar.G.a(kVar);
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public k4.d x(y2.i r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.x(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void y(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        y2.o oVar = (y2.o) iVar;
        h hVar = (h) this.f15081b;
        if (i10 == 0) {
            long j11 = oVar.f51931a;
            tVar = new t(oVar.f51932b);
        } else {
            long j12 = oVar.f51931a;
            Uri uri = oVar.d.f10233c;
            tVar = new t(j10);
        }
        hVar.f15090q.u(tVar, oVar.f51933c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    public boolean y0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.y0(android.view.MotionEvent):boolean");
    }

    @Override
    public void z() {
        ((zf0) this.f15081b).f33350b.o();
    }

    public g(Object obj, int i10) {
        this.f15080a = i10;
        this.f15081b = obj;
    }

    @Override
    public float get() {
        return ((o2) this.f15081b).F;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public g(s6.g gVar, s6.a aVar) {
        this.f15080a = 24;
        this.f15081b = aVar;
    }

    public g(v1.c[] initializers) {
        this.f15080a = 27;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f15081b = initializers;
    }

    public g() {
        this.f15080a = 21;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15081b = new hi0(this);
        } else {
            this.f15081b = new hi0(this);
        }
    }

    public g(Context context, Uri uri) {
        this.f15080a = 6;
        this.f15081b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g(Context context, f30 f30Var) {
        this.f15080a = 10;
        this.f15081b = new e30(context, f30Var);
    }

    @Override
    public void E0() {
    }

    @Override
    public void E2() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void x2() {
    }

    private final void w0(ArrayList arrayList) {
    }

    private final void x0(ArrayList arrayList) {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void Q1(u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void c1(u1 u1Var) {
    }

    @Override
    public void e0(int i10) {
    }

    @Override
    public void e1(u1 u1Var) {
    }

    @Override
    public void k0(u1 u1Var) {
    }

    @Override
    public void k2(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void s2(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(u1 u1Var, long j3) {
    }

    @Override
    public void onError(q81 q81Var, Exception exc) {
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void B1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void F0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void u0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void z0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
