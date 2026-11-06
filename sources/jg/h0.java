package jg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.ua;
import c8.ha;
import hi.j2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c61;
import org.telegram.ui.e61;
import org.telegram.ui.hw;
import org.telegram.ui.pz;
import org.telegram.ui.ww;
public abstract class h0 extends oj0 {
    public pz A0;
    public int B0;
    public int C0;
    public String D;
    public int D0;
    public c61 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public hw U;
    public final int V;
    public boolean W;
    public boolean X;
    public String Z;
    public int f16734a0;
    public String f16735b0;
    public int f16737c0;
    public boolean d;
    public int f16738d0;
    public final Context f16739e;
    public int f16740e0;
    public o f16741f;
    public int f16742f0;
    public int f16743g0;
    public o h;
    public final int f16744h0;
    public final v4.k f16745i0;
    public final z f16746j0;
    public e61 f16747k0;
    public final long f16748l0;
    public long f16750n0;
    public View f16751o0;
    public ha.b f16752p0;
    public ArrayList f16753q0;
    public ai.e0 f16754r;
    public final ww f16755r0;
    public final int f16757s0;
    public ArrayList f16758t0;
    public final ArrayList f16759u0;
    public final ArrayList f16760v0;
    public int f16761w;
    public String f16762w0;
    public int f16763x;
    public a0.h f16764x0;
    public final ArrayList f16766y0;
    public boolean f16767z0;
    public e0 f16736c = e0.All;
    public int f16749n = -1;
    public ArrayList f16756s = new ArrayList();
    public final ArrayList f16765y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final HashSet L = new HashSet();
    public int O = 0;
    public int Q = 0;
    public int Y = -1;
    public boolean m0 = false;

    public h0(Context context, ww wwVar, int i7, int i10, v4.k kVar, boolean z9) {
        int i11 = p10.f24459s0;
        this.f16757s0 = i11;
        this.f16758t0 = new ArrayList();
        this.f16759u0 = new ArrayList();
        this.f16760v0 = new ArrayList();
        this.f16762w0 = null;
        this.f16764x0 = new a0.h();
        this.f16766y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.f16745i0 = kVar;
        this.f16755r0 = wwVar;
        yl0 yl0Var = (yl0) this;
        z zVar = new z(yl0Var);
        this.f16746j0 = zVar;
        zVar.f16989a = new gf.g(yl0Var, 7);
        zVar.f17002p = z9;
        this.f16739e = context;
        this.V = i7;
        this.f16744h0 = i10;
        this.f16748l0 = p10.i(i11).e();
        if (i10 != 15) {
            yr.a0(i11).f26688a.c(new r(i11, i10, new t(this), 0));
        }
        ui.b0(i11).M0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i7 = 0; i7 < split.length; i7++) {
                String str3 = split[i7];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i7]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56931f;
        if (i7 != 1 && i7 != 4 && i7 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z9 = this.N;
        ArrayList arrayList = this.f16759u0;
        ArrayList arrayList2 = this.f16760v0;
        String str = null;
        if (z9) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                g0 g0Var = (g0) arrayList2.remove(0);
                this.f16758t0.remove(g0Var);
                arrayList.remove(g0Var);
                this.f16764x0.l(g0Var.f16726c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(g0Var.f16726c);
                } else {
                    sb2.append(", ");
                    sb2.append(g0Var.f16726c);
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder("1");
            } else {
                sb2.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.f16758t0.clear();
            this.f16764x0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        f();
        boolean z10 = this.N;
        int i7 = this.f16757s0;
        if (!z10) {
            yr.a0(i7).f26688a.c(new j2(i7, 1));
        } else {
            yr.a0(i7).f26688a.c(new ha.b(13, (yl0) this, sb2));
        }
    }

    public final boolean F(Object obj) {
        if (this.f16744h0 != 14) {
            return true;
        }
        boolean z9 = obj instanceof TLRPC.User;
        ww wwVar = this.f16755r0;
        if (z9) {
            if (((TLRPC.User) obj).bot) {
                return wwVar.A2;
            }
            return wwVar.f51641z2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (t3.T(chat)) {
                return wwVar.f51637y2;
            }
            if (t3.n0(chat)) {
                if (wwVar.f51620v2 || wwVar.f51626w2) {
                    return true;
                }
                return false;
            } else if (wwVar.f51620v2 || wwVar.f51632x2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        hw hwVar;
        String str2;
        String str3;
        this.f16762w0 = str;
        ArrayList arrayList = this.f16760v0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f16759u0;
            arrayList2.clear();
            int size = this.f16758t0.size();
            for (int i7 = 0; i7 < size; i7++) {
                hw hwVar2 = this.U;
                if ((hwVar2 == null || hwVar2.a() != ((g0) this.f16758t0.get(i7)).f16726c) && F(((g0) this.f16758t0.get(i7)).f16724a)) {
                    arrayList2.add((g0) this.f16758t0.get(i7));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f16758t0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            g0 g0Var = (g0) this.f16758t0.get(i10);
            if (g0Var != null && g0Var.f16724a != null && (((hwVar = this.U) == null || hwVar.a() != g0Var.f16726c) && F(((g0) this.f16758t0.get(i10)).f16724a))) {
                TLObject tLObject = g0Var.f16724a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = qg.d.i(this.f16757s0, chat, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) g0Var.f16724a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = t10.p((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) g0Var.f16724a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(g0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(e0 e0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(e0Var.f16713c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new wp(2131230873, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final Object I(int i7) {
        int size;
        int i10;
        int size2;
        ArrayList arrayList;
        int i11;
        TLRPC.Chat M0;
        int i12;
        ArrayList arrayList2 = this.f16765y;
        if (!arrayList2.isEmpty()) {
            if (i7 > 0 && i7 - 1 < arrayList2.size()) {
                return arrayList2.get(i12);
            }
            i7 = g.g(1, i7, arrayList2);
        }
        ArrayList arrayList3 = this.J;
        if (!arrayList3.isEmpty()) {
            if (i7 > 0) {
                return arrayList3.get(i7 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            if (this.N) {
                arrayList = this.f16760v0;
            } else {
                arrayList = this.f16759u0;
            }
            if (i7 > L && (i11 = (i7 - 1) - (L == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((g0) arrayList.get(i11)).f16724a;
                boolean z9 = tLObject instanceof TLRPC.User;
                int i13 = this.f16757s0;
                if (z9) {
                    TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(((TLRPC.User) tLObject).f27101id));
                    if (a22 != null) {
                        return a22;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (M0 = qp.s1(i13).M0(Long.valueOf(((TLRPC.Chat) tLObject).f26952id))) != null) {
                    return M0;
                } else {
                    return tLObject;
                }
            }
            i7 -= J();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList4.size()) {
                return arrayList4.get(i7 - 1);
            }
            i7 = g.g(1, i7, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList5.size()) {
                return arrayList5.get(i7 - 1);
            }
            i7 = g.g(1, i7, arrayList5);
        }
        z zVar = this.f16746j0;
        ArrayList arrayList6 = zVar.f16992e;
        ArrayList arrayList7 = zVar.d;
        ArrayList arrayList8 = zVar.f16996j;
        int size3 = this.f16756s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
            if (i7 != 0) {
                i7--;
            } else {
                return null;
            }
        }
        int size5 = arrayList8.size();
        int i14 = 3;
        if (size5 > 3 && this.H0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.G0) {
            i14 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i15 = 0;
        ArrayList arrayList9 = this.K;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i14 + 1;
        }
        if (i7 >= 0 && i7 < size3) {
            return this.f16756s.get(i7);
        }
        int i16 = i7 - size3;
        if (i16 >= 0 && i16 < size4) {
            return arrayList7.get(i16);
        }
        int i17 = i16 - size4;
        if (i17 >= 0 && i17 < size5) {
            return arrayList8.get(i17);
        }
        int i18 = i17 - size5;
        if (i18 > 0 && i18 < size) {
            int i19 = i18 - 1;
            if (i19 >= 0 && i19 < arrayList9.size()) {
                return arrayList9.get(i19);
            }
            i10 = i19 - arrayList9.size();
            if (i10 >= 0 && i10 < arrayList6.size()) {
                return arrayList6.get(i10);
            }
        } else {
            i10 = i18 - size;
        }
        ArrayList arrayList10 = this.H;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i10 > 0 && i10 <= arrayList10.size()) {
            return arrayList10.get(i10 - 1);
        }
        if (!this.X && !arrayList10.isEmpty()) {
            i15 = 1;
        }
        int i20 = i10 - (size2 + i15);
        ArrayList arrayList11 = this.I;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i20 > 0 && i20 <= arrayList11.size()) {
            return arrayList11.get(i20 - 1);
        }
        return null;
    }

    public final int J() {
        ArrayList arrayList;
        int i7;
        if (this.N) {
            arrayList = this.f16760v0;
        } else {
            arrayList = this.f16759u0;
        }
        if (!arrayList.isEmpty()) {
            i7 = arrayList.size() + 1;
        } else {
            i7 = 0;
        }
        return (L() ? 1 : 0) + i7;
    }

    public final int K() {
        int i7 = 0;
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f16765y;
        if (!arrayList.isEmpty()) {
            i7 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i7;
        }
        if (O()) {
            i7 += J();
            if (!this.N) {
                return i7;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            i7 = i7 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            i7 += arrayList4.size() + 1;
        }
        int size = this.f16756s.size();
        int size2 = this.f16746j0.d.size();
        int i10 = i7 + size + size2;
        if (size + size2 > 0) {
            if (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    public final boolean L() {
        if (!this.N && !ui.b0(this.f16757s0).f25810i1.isEmpty()) {
            if (this.f16744h0 != 14 || this.f16755r0.f51641z2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean M() {
        if (R() && J() > 0) {
            return true;
        }
        return false;
    }

    public final boolean N(int i7) {
        int size;
        int i10;
        int i11;
        int size2;
        ArrayList arrayList;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList2 = this.f16765y;
            if (!arrayList2.isEmpty()) {
                i7 = g.g(1, i7, arrayList2);
            }
            if (O()) {
                ?? L = L();
                if (this.N) {
                    arrayList = this.f16760v0;
                } else {
                    arrayList = this.f16759u0;
                }
                if (i7 <= L || (i7 - 1) - (L == true ? 1 : 0) >= arrayList.size()) {
                    i7 -= J();
                }
            }
            z zVar = this.f16746j0;
            ArrayList arrayList3 = zVar.f16992e;
            ArrayList arrayList4 = zVar.d;
            int size3 = this.f16756s.size();
            int size4 = arrayList4.size();
            int size5 = zVar.f16996j.size();
            int i12 = 3;
            if (size5 > 3 && this.H0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.G0) {
                i12 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.K;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i12 + 1;
            }
            int size7 = this.E.size();
            if (size7 > 0) {
                if (i7 < 0 || i7 >= size7) {
                    i7 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (J() > 0 || !this.F.isEmpty() || !arrayList2.isEmpty())) {
                if (i7 != 0) {
                    i7--;
                }
            }
            if ((i7 < 0 || i7 >= size3) && (((i10 = i7 - size3) < 0 || i10 >= size4) && ((i11 = i10 - size4) <= 0 || i11 >= size5))) {
                int i13 = i11 - size5;
                if (i13 > 0 && i13 < size) {
                    return true;
                }
                int i14 = i13 - size;
                ArrayList arrayList6 = this.H;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i14 <= 0 || i14 >= size2) {
                    ArrayList arrayList7 = this.I;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.f16736c != e0.All || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        if (this.V != 2 && M()) {
            return true;
        }
        return false;
    }

    public final void P() {
        if ((this.Q != 0 && this.O != 0) || this.f16743g0 != this.f16738d0) {
            return;
        }
        hw hwVar = this.U;
        if (hwVar != null && hwVar.a() != 0 && !this.X) {
            U(this.f16743g0, this.Z);
            return;
        }
        V(this.f16743g0, this.Z);
    }

    public final void Q(long j3, TLObject tLObject) {
        g0 g0Var;
        String str;
        g0 g0Var2 = (g0) this.f16764x0.f(j3);
        if (g0Var2 == null) {
            Object obj = new Object();
            this.f16764x0.k(obj, j3);
            g0Var = obj;
        } else {
            this.f16758t0.remove(g0Var2);
            g0Var = g0Var2;
        }
        this.f16758t0.add(0, g0Var);
        g0Var.f16726c = j3;
        g0Var.f16724a = tLObject;
        g0Var.f16725b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        f();
        int i7 = this.f16757s0;
        yr.a0(i7).f26688a.c(new ua(i7, j3, 2));
    }

    public final boolean R() {
        int i7 = this.f16744h0;
        if (i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 1 && i7 != 11 && i7 != 15) {
            return true;
        }
        return false;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (K = K()) < b()) {
            int size = arrayList.size();
            arrayList.clear();
            p(K + 1, size);
            int size2 = this.f16746j0.f16992e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                s(K);
            }
        }
    }

    public final void T(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h0.T(int, java.lang.String):void");
    }

    public final void U(int i7, String str) {
        hw hwVar = this.U;
        if (hwVar != null && hwVar.a() != 0 && this.V != 0) {
            if (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str)) {
                int i10 = this.Q;
                int i11 = this.f16757s0;
                if (i10 != 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.Q, true);
                    this.Q = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.H;
                if (isEmpty) {
                    this.f16762w0 = null;
                    this.I.clear();
                    arrayList.clear();
                    this.T = 0;
                    this.Z = null;
                    this.N = false;
                    f();
                } else if (this.f16744h0 != 15) {
                    long a10 = this.U.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f27063q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = qp.s1(i11).j1(a10);
                    if (str.equals(this.Z) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.Z = str;
                    int i12 = 1 + this.T;
                    this.T = i12;
                    this.Q = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new s(i12, i7, 0, this, str, tL_messages_search), 2);
                }
            }
        }
    }

    public final void V(int i7, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.V != 0 && (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str))) {
            int i10 = this.O;
            int i11 = this.f16757s0;
            boolean z12 = false;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.O, true);
                this.O = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.I;
            if (!isEmpty && this.U.a() == 0) {
                G(str);
                this.f16746j0.f(this.f16756s, this.f16760v0);
                if (this.f16744h0 == 15) {
                    int i12 = this.D0 - 1;
                    this.D0 = i12;
                    hw hwVar = this.U;
                    if (hwVar != null) {
                        if (i12 > 0) {
                            z12 = true;
                        }
                        hwVar.d(z12, true);
                        this.U.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i13 = this.f16736c.f16711a;
                    if ((i13 & 2) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    tL_messages_searchGlobal.broadcasts_only = z9;
                    if ((i13 & 4) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tL_messages_searchGlobal.groups_only = z10;
                    if ((i13 & 8) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    tL_messages_searchGlobal.users_only = z11;
                    tL_messages_searchGlobal.limit = 20;
                    tL_messages_searchGlobal.f27065q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.C0;
                    if (!str.equals(this.Z)) {
                        this.d = false;
                    }
                    if (str.equals(this.Z) && this.f16734a0 == this.f16736c.f16711a && !arrayList.isEmpty() && this.f16743g0 == this.f16738d0) {
                        ij ijVar = (ij) g.i(1, arrayList);
                        tL_messages_searchGlobal.offset_id = ijVar.f1();
                        tL_messages_searchGlobal.offset_rate = this.f16737c0;
                        tL_messages_searchGlobal.offset_peer = qp.s1(i11).j1(ij.C1(ijVar.f23237k.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.Z = str;
                    this.f16734a0 = this.f16736c.f16711a;
                    int i14 = this.P + 1;
                    this.P = i14;
                    this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new s(i14, i7, 1, this, str, tL_messages_searchGlobal), 2);
                }
            } else {
                this.f16762w0 = null;
                arrayList.clear();
                this.H.clear();
                this.P = 0;
                this.Z = null;
                this.f16734a0 = 0;
                this.N = false;
                f();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        hw hwVar = this.U;
        if (hwVar != null && hwVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList l10 = qp.s1(this.f16757s0).f24862q7.l(-this.U.a());
                String trim = str.trim();
                for (int i7 = 0; i7 < l10.size(); i7++) {
                    if (l10.get(i7) != null && ((TLRPC.TL_forumTopic) l10.get(i7)).title.toLowerCase().contains(trim)) {
                        arrayList.add((TLRPC.TL_forumTopic) l10.get(i7));
                        ((TLRPC.TL_forumTopic) l10.get(i7)).searchQuery = trim;
                    }
                }
            }
            f();
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10 = 0;
        int i11 = 3;
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f16765y;
        if (!arrayList.isEmpty()) {
            i7 = arrayList.size() + 1;
        } else {
            i7 = 0;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i7;
        }
        if (O()) {
            i7 += J();
            if (!this.N) {
                return i7;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            i7 = i7 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            i7 += arrayList4.size() + 1;
        }
        int size = this.f16756s.size();
        z zVar = this.f16746j0;
        int size2 = zVar.d.size();
        int i12 = i7 + size + size2;
        int size3 = zVar.f16992e.size();
        if (size3 > 3 && this.G0) {
            size3 = 3;
        }
        int size4 = this.K.size() + size3;
        int size5 = zVar.f16996j.size();
        if (size5 > 3 && this.H0) {
            size5 = 3;
        }
        if (size + size2 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i12++;
        }
        if (size4 != 0) {
            i12 += size4 + 1;
        }
        if (size5 != 0) {
            i12 += size5;
        }
        ArrayList arrayList5 = this.H;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i12 += size6 + 1 + (!this.X ? 1 : 0);
        }
        if (!this.X) {
            this.Y = i12;
        }
        ArrayList arrayList6 = this.I;
        int size7 = arrayList6.size();
        if ((this.f16736c != e0.All || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i11 = 1;
            }
            size7 = i11;
        }
        if (arrayList5.isEmpty() || this.X) {
            i10 = size7;
        }
        if (i10 != 0) {
            i12 += i10 + 1 + (!this.W ? 1 : 0);
        }
        if (this.X) {
            this.Y = i12;
        }
        this.B0 = i12;
        return i12;
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h0.d(int):int");
    }

    @Override
    public final void t(v4.d1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        e61 e61Var;
        c61 c61Var;
        boolean z9;
        int i10 = this.f16744h0;
        boolean z10 = false;
        Context context = this.f16739e;
        switch (i7) {
            case 0:
                g6 g6Var = new g6(context, null);
                if (i10 == 3) {
                    z10 = true;
                }
                g6Var.f29155l0 = z10;
                e61Var = g6Var;
                c61Var = e61Var;
                break;
            case 1:
                c61Var = new x3(context, null);
                break;
            case 2:
            case 9:
                c61Var = new a0(0, context, true);
                break;
            case 3:
                c61Var = new ja(context);
                break;
            case 4:
                lz lzVar = new lz(context, null);
                lzVar.setViewType(1);
                lzVar.setIsSingleCell(true);
                c61Var = lzVar;
                break;
            case 5:
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                r6.V(textView, k6.G6, null);
                c61Var = textView;
                break;
            case 6:
                e61 e61Var2 = new e61(2, context, null);
                r6.m(e61Var2, 20, k6.f27940i6, null);
                e61Var2.setTag(9);
                e61Var2.setItemAnimator(null);
                e61Var2.setLayoutAnimation(null);
                b0 b0Var = new b0(0);
                b0Var.j1(0);
                e61Var2.setLayoutManager(b0Var);
                if (i10 == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                e61Var2.setAdapter(new c0(this.f16757s0, this.f16739e, null, false, z9));
                e61Var2.setOnItemClickListener(new ai.k(this, 14));
                e61Var2.setOnItemLongClickListener(new t(this));
                this.f16747k0 = e61Var2;
                e61Var = e61Var2;
                c61Var = e61Var;
                break;
            case 7:
            default:
                c61Var = new m8(16, context, false);
                break;
            case 8:
                c61Var = new g6(context, null);
                break;
            case 10:
                w wVar = new w(this, 1);
                c61 c61Var2 = new c61(context, 5);
                c61Var2.setOrientation(1);
                l9 l9Var = new l9(context);
                l9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
                c61Var2.addView(l9Var, ha.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 17.0f);
                int i11 = k6.G6;
                r6.V(textView2, i11, null);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setText(hd.M0(2131745750, null));
                textView2.setGravity(17);
                c61Var2.addView(textView2, ha.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(context);
                c61Var2.f44685b = textView3;
                textView3.setTextSize(1, 14.0f);
                r6.V(textView3, i11, null);
                textView3.setText(hd.a0(null, null, 2131745751, ""));
                textView3.setGravity(17);
                c61Var2.addView(textView3, ha.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(context);
                textView4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
                g.v(textView4, 1, 14.0f, null, 2131745752);
                int i12 = k6.Ci;
                r6.V(textView4, i12, null);
                int r12 = k6.r1(0.15f, k6.v0(i12));
                org.telegram.ui.Cells.y k02 = k6.k0(6, 6, 6, 6, 0, r12, r12);
                n6 L = r6.L(0.15f, i12);
                textView4.setBackground(k02);
                r6.k(textView4, k02, null, L, null);
                textView4.setOnClickListener(new ii.g(wVar, 4));
                c61Var2.addView(textView4, ha.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = c61Var2;
                textView3.setText(hd.a0(null, null, 2131745751, this.Z));
                c61Var = c61Var2;
                break;
        }
        if (i7 == 5) {
            c61Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(86.0f)));
        } else {
            c61Var.setLayoutParams(new v4.o0(-1, -2));
        }
        return new v4.d1(c61Var);
    }
}
