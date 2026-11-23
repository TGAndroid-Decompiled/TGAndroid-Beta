package jg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.k8;
import c8.ma;
import di.m9;
import hi.o4;
import hi.w4;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.la;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.yz;
import org.telegram.ui.cx;
import org.telegram.ui.d61;
import org.telegram.ui.f61;
import org.telegram.ui.mw;
import org.telegram.ui.tz;
public abstract class h0 extends dk0 {
    public boolean A0;
    public tz B0;
    public int C0;
    public int D0;
    public String E;
    public int E0;
    public d61 F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public String N;
    public boolean O;
    public int Q;
    public String S;
    public int T;
    public int U;
    public mw V;
    public final int W;
    public boolean X;
    public boolean Y;
    public String f17494a0;
    public int f17495b0;
    public String f17497c0;
    public boolean d;
    public int f17498d0;
    public final Context f17499e;
    public int f17500e0;
    public n f17501f;
    public int f17502f0;
    public int f17503g0;
    public n h;
    public int f17504h0;
    public final int f17505i0;
    public final v4.k f17506j0;
    public final z f17507k0;
    public f61 f17508l0;
    public final long m0;
    public long f17511o0;
    public View f17512p0;
    public hi.c f17513q0;
    public ai.j1 f17514r;
    public ArrayList f17515r0;
    public final cx f17517s0;
    public final int f17518t0;
    public ArrayList f17519u0;
    public final ArrayList f17520v0;
    public int f17521w;
    public final ArrayList f17522w0;
    public int f17523x;
    public String f17524x0;
    public a0.h f17526y0;
    public final ArrayList f17527z0;
    public e0 f17496c = e0.All;
    public int f17509n = -1;
    public ArrayList f17516s = new ArrayList();
    public final ArrayList f17525y = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashSet M = new HashSet();
    public int P = 0;
    public int R = 0;
    public int Z = -1;
    public boolean f17510n0 = false;

    public h0(Context context, cx cxVar, int i7, int i10, v4.k kVar, boolean z10) {
        int i11 = k10.f24968t0;
        this.f17518t0 = i11;
        this.f17519u0 = new ArrayList();
        this.f17520v0 = new ArrayList();
        this.f17522w0 = new ArrayList();
        this.f17524x0 = null;
        this.f17526y0 = new a0.h();
        this.f17527z0 = new ArrayList();
        this.G0 = -1;
        this.H0 = true;
        this.I0 = true;
        this.f17506j0 = kVar;
        this.f17517s0 = cxVar;
        nm0 nm0Var = (nm0) this;
        z zVar = new z(nm0Var);
        this.f17507k0 = zVar;
        zVar.f17755a = new w4(nm0Var, 6);
        zVar.f17768p = z10;
        this.f17499e = context;
        this.W = i7;
        this.f17505i0 = i10;
        this.m0 = k10.i(i11).e();
        if (i10 != 15) {
            ur.a0(i11).f27250a.c(new q(i11, i10, new s(this), 0));
        }
        si.d0(i11).P0(true);
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
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 1 && i7 != 4 && i7 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.O;
        ArrayList arrayList = this.f17520v0;
        ArrayList arrayList2 = this.f17522w0;
        String str = null;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                g0 g0Var = (g0) arrayList2.remove(0);
                this.f17519u0.remove(g0Var);
                arrayList.remove(g0Var);
                this.f17526y0.l(g0Var.f17490c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(g0Var.f17490c);
                } else {
                    sb2.append(", ");
                    sb2.append(g0Var.f17490c);
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
            this.f17519u0.clear();
            this.f17526y0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.N;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        f();
        boolean z11 = this.O;
        int i7 = this.f17518t0;
        if (!z11) {
            ur.a0(i7).f27250a.c(new x(i7, 0));
        } else {
            ur.a0(i7).f27250a.c(new hi.c(25, (nm0) this, sb2));
        }
    }

    public final boolean F(Object obj) {
        if (this.f17505i0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        cx cxVar = this.f17517s0;
        if (z10) {
            if (((TLRPC.User) obj).bot) {
                return cxVar.C2;
            }
            return cxVar.B2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (v3.T(chat)) {
                return cxVar.A2;
            }
            if (v3.n0(chat)) {
                if (cxVar.f46814x2 || cxVar.f46820y2) {
                    return true;
                }
                return false;
            } else if (cxVar.f46814x2 || cxVar.f46825z2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        mw mwVar;
        String str2;
        String str3;
        this.f17524x0 = str;
        ArrayList arrayList = this.f17522w0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f17520v0;
            arrayList2.clear();
            int size = this.f17519u0.size();
            for (int i7 = 0; i7 < size; i7++) {
                mw mwVar2 = this.V;
                if ((mwVar2 == null || mwVar2.a() != ((g0) this.f17519u0.get(i7)).f17490c) && F(((g0) this.f17519u0.get(i7)).f17488a)) {
                    arrayList2.add((g0) this.f17519u0.get(i7));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f17519u0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            g0 g0Var = (g0) this.f17519u0.get(i10);
            if (g0Var != null && g0Var.f17488a != null && (((mwVar = this.V) == null || mwVar.a() != g0Var.f17490c) && F(((g0) this.f17519u0.get(i10)).f17488a))) {
                TLObject tLObject = g0Var.f17488a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = qg.c.j(this.f17518t0, chat, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) g0Var.f17488a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = p10.q((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) g0Var.f17488a).username;
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(e0Var.f17476c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new nq(2131230873, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final Object I(int i7) {
        int size;
        int i10;
        int size2;
        ArrayList arrayList;
        int i11;
        TLRPC.Chat O0;
        int i12;
        ArrayList arrayList2 = this.f17525y;
        if (!arrayList2.isEmpty()) {
            if (i7 > 0 && i7 - 1 < arrayList2.size()) {
                return arrayList2.get(i12);
            }
            i7 = i5.c.f(1, i7, arrayList2);
        }
        ArrayList arrayList3 = this.K;
        if (!arrayList3.isEmpty()) {
            if (i7 > 0) {
                return arrayList3.get(i7 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            if (this.O) {
                arrayList = this.f17522w0;
            } else {
                arrayList = this.f17520v0;
            }
            if (i7 > L && (i11 = (i7 - 1) - (L == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((g0) arrayList.get(i11)).f17488a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i13 = this.f17518t0;
                if (z10) {
                    TLRPC.User c22 = np.u1(i13).c2(Long.valueOf(((TLRPC.User) tLObject).f28583id));
                    if (c22 != null) {
                        return c22;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (O0 = np.u1(i13).O0(Long.valueOf(((TLRPC.Chat) tLObject).f28434id))) != null) {
                    return O0;
                } else {
                    return tLObject;
                }
            }
            i7 -= J();
        }
        ArrayList arrayList4 = this.G;
        if (!arrayList4.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList4.size()) {
                return arrayList4.get(i7 - 1);
            }
            i7 = i5.c.f(1, i7, arrayList4);
        }
        ArrayList arrayList5 = this.F;
        if (!arrayList5.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList5.size()) {
                return arrayList5.get(i7 - 1);
            }
            i7 = i5.c.f(1, i7, arrayList5);
        }
        z zVar = this.f17507k0;
        ArrayList arrayList6 = zVar.f17758e;
        ArrayList arrayList7 = zVar.d;
        ArrayList arrayList8 = zVar.f17762j;
        int size3 = this.f17516s.size();
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
        if (size5 > 3 && this.I0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.H0) {
            i14 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i15 = 0;
        ArrayList arrayList9 = this.L;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i14 + 1;
        }
        if (i7 >= 0 && i7 < size3) {
            return this.f17516s.get(i7);
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
        ArrayList arrayList10 = this.I;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i10 > 0 && i10 <= arrayList10.size()) {
            return arrayList10.get(i10 - 1);
        }
        if (!this.Y && !arrayList10.isEmpty()) {
            i15 = 1;
        }
        int i20 = i10 - (size2 + i15);
        ArrayList arrayList11 = this.J;
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
        if (this.O) {
            arrayList = this.f17522w0;
        } else {
            arrayList = this.f17520v0;
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
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f17525y;
        if (!arrayList.isEmpty()) {
            i7 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i7;
        }
        if (O()) {
            i7 += J();
            if (!this.O) {
                return i7;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            i7 = i7 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            i7 += arrayList4.size() + 1;
        }
        int size = this.f17516s.size();
        int size2 = this.f17507k0.d.size();
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
        if (!this.O && !si.d0(this.f17518t0).f26834j1.isEmpty()) {
            if (this.f17505i0 != 14 || this.f17517s0.B2) {
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
        if (this.O && this.K.isEmpty()) {
            ArrayList arrayList2 = this.f17525y;
            if (!arrayList2.isEmpty()) {
                i7 = i5.c.f(1, i7, arrayList2);
            }
            if (O()) {
                ?? L = L();
                if (this.O) {
                    arrayList = this.f17522w0;
                } else {
                    arrayList = this.f17520v0;
                }
                if (i7 <= L || (i7 - 1) - (L == true ? 1 : 0) >= arrayList.size()) {
                    i7 -= J();
                }
            }
            z zVar = this.f17507k0;
            ArrayList arrayList3 = zVar.f17758e;
            ArrayList arrayList4 = zVar.d;
            int size3 = this.f17516s.size();
            int size4 = arrayList4.size();
            int size5 = zVar.f17762j.size();
            int i12 = 3;
            if (size5 > 3 && this.I0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.H0) {
                i12 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.L;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i12 + 1;
            }
            int size7 = this.F.size();
            if (size7 > 0) {
                if (i7 < 0 || i7 >= size7) {
                    i7 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (J() > 0 || !this.G.isEmpty() || !arrayList2.isEmpty())) {
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
                ArrayList arrayList6 = this.I;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i14 <= 0 || i14 >= size2) {
                    ArrayList arrayList7 = this.J;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.f17496c != e0.All || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        if (this.W != 2 && M()) {
            return true;
        }
        return false;
    }

    public final void P() {
        if ((this.R != 0 && this.P != 0) || this.f17504h0 != this.f17500e0) {
            return;
        }
        mw mwVar = this.V;
        if (mwVar != null && mwVar.a() != 0 && !this.Y) {
            U(this.f17504h0, this.f17494a0);
            return;
        }
        V(this.f17504h0, this.f17494a0);
    }

    public final void Q(long j3, TLObject tLObject) {
        g0 g0Var;
        String str;
        g0 g0Var2 = (g0) this.f17526y0.f(j3);
        if (g0Var2 == null) {
            Object obj = new Object();
            this.f17526y0.k(obj, j3);
            g0Var = obj;
        } else {
            this.f17519u0.remove(g0Var2);
            g0Var = g0Var2;
        }
        this.f17519u0.add(0, g0Var);
        g0Var.f17490c = j3;
        g0Var.f17488a = tLObject;
        g0Var.f17489b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.N;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        f();
        int i7 = this.f17518t0;
        ur.a0(i7).f27250a.c(new m9(i7, j3, 1));
    }

    public final boolean R() {
        int i7 = this.f17505i0;
        if (i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 1 && i7 != 11 && i7 != 15) {
            return true;
        }
        return false;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.L;
        if (!arrayList.isEmpty() && (K = K()) < b()) {
            int size = arrayList.size();
            arrayList.clear();
            p(K + 1, size);
            int size2 = this.f17507k0.f17758e.size();
            if (this.H0) {
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
        mw mwVar = this.V;
        if (mwVar != null && mwVar.a() != 0 && this.W != 0) {
            if (!TextUtils.isEmpty(this.f17494a0) || !TextUtils.isEmpty(str)) {
                int i10 = this.R;
                int i11 = this.f17518t0;
                if (i10 != 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.R, true);
                    this.R = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.I;
                if (isEmpty) {
                    this.f17524x0 = null;
                    this.J.clear();
                    arrayList.clear();
                    this.U = 0;
                    this.f17494a0 = null;
                    this.O = false;
                    f();
                } else if (this.f17505i0 != 15) {
                    long a10 = this.V.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f28545q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = np.u1(i11).l1(a10);
                    if (str.equals(this.f17494a0) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.f17494a0 = str;
                    int i12 = 1 + this.U;
                    this.U = i12;
                    this.R = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new r(i12, i7, 0, this, str, tL_messages_search), 2);
                }
            }
        }
    }

    public final void V(int i7, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.W != 0 && (!TextUtils.isEmpty(this.f17494a0) || !TextUtils.isEmpty(str))) {
            int i10 = this.P;
            int i11 = this.f17518t0;
            boolean z13 = false;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.P, true);
                this.P = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.J;
            if (!isEmpty && this.V.a() == 0) {
                G(str);
                this.f17507k0.f(this.f17516s, this.f17522w0);
                if (this.f17505i0 == 15) {
                    int i12 = this.E0 - 1;
                    this.E0 = i12;
                    mw mwVar = this.V;
                    if (mwVar != null) {
                        if (i12 > 0) {
                            z13 = true;
                        }
                        mwVar.d(z13, true);
                        this.V.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i13 = this.f17496c.f17474a;
                    if ((i13 & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tL_messages_searchGlobal.broadcasts_only = z10;
                    if ((i13 & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    tL_messages_searchGlobal.groups_only = z11;
                    if ((i13 & 8) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    tL_messages_searchGlobal.users_only = z12;
                    tL_messages_searchGlobal.limit = 20;
                    tL_messages_searchGlobal.f28547q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.D0;
                    if (!str.equals(this.f17494a0)) {
                        this.d = false;
                    }
                    if (str.equals(this.f17494a0) && this.f17495b0 == this.f17496c.f17474a && !arrayList.isEmpty() && this.f17504h0 == this.f17500e0) {
                        gj gjVar = (gj) i5.c.h(1, arrayList);
                        tL_messages_searchGlobal.offset_id = gjVar.e1();
                        tL_messages_searchGlobal.offset_rate = this.f17498d0;
                        tL_messages_searchGlobal.offset_peer = np.u1(i11).l1(gj.B1(gjVar.f24213k.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.f17494a0 = str;
                    this.f17495b0 = this.f17496c.f17474a;
                    int i14 = this.Q + 1;
                    this.Q = i14;
                    this.P = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new r(i14, i7, 1, this, str, tL_messages_searchGlobal), 2);
                }
            } else {
                this.f17524x0 = null;
                arrayList.clear();
                this.I.clear();
                this.Q = 0;
                this.f17494a0 = null;
                this.f17495b0 = 0;
                this.O = false;
                f();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        mw mwVar = this.V;
        if (mwVar != null && mwVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList l10 = np.u1(this.f17518t0).f25968t7.l(-this.V.a());
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
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f17525y;
        if (!arrayList.isEmpty()) {
            i7 = arrayList.size() + 1;
        } else {
            i7 = 0;
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i7;
        }
        if (O()) {
            i7 += J();
            if (!this.O) {
                return i7;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            i7 = i7 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            i7 += arrayList4.size() + 1;
        }
        int size = this.f17516s.size();
        z zVar = this.f17507k0;
        int size2 = zVar.d.size();
        int i12 = i7 + size + size2;
        int size3 = zVar.f17758e.size();
        if (size3 > 3 && this.H0) {
            size3 = 3;
        }
        int size4 = this.L.size() + size3;
        int size5 = zVar.f17762j.size();
        if (size5 > 3 && this.I0) {
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
        ArrayList arrayList5 = this.I;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i12 += size6 + 1 + (!this.Y ? 1 : 0);
        }
        if (!this.Y) {
            this.Z = i12;
        }
        ArrayList arrayList6 = this.J;
        int size7 = arrayList6.size();
        if ((this.f17496c != e0.All || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i11 = 1;
            }
            size7 = i11;
        }
        if (arrayList5.isEmpty() || this.Y) {
            i10 = size7;
        }
        if (i10 != 0) {
            i12 += i10 + 1 + (!this.X ? 1 : 0);
        }
        if (this.Y) {
            this.Z = i12;
        }
        this.C0 = i12;
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
    public final void t(v4.f1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: jg.h0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        f61 f61Var;
        d61 d61Var;
        boolean z10;
        int i10 = this.f17505i0;
        boolean z11 = false;
        Context context = this.f17499e;
        switch (i7) {
            case 0:
                h6 h6Var = new h6(context, null);
                if (i10 == 3) {
                    z11 = true;
                }
                h6Var.m0 = z11;
                f61Var = h6Var;
                d61Var = f61Var;
                break;
            case 1:
                d61Var = new y3(context, null);
                break;
            case 2:
            case 9:
                d61Var = new a0(0, context, true);
                break;
            case 3:
                d61Var = new la(context);
                break;
            case 4:
                yz yzVar = new yz(context, null);
                yzVar.setViewType(1);
                yzVar.setIsSingleCell(true);
                d61Var = yzVar;
                break;
            case 5:
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                t6.U(textView, m6.G6, null);
                d61Var = textView;
                break;
            case 6:
                f61 f61Var2 = new f61(2, context, null);
                t6.l(f61Var2, 20, m6.f29473i6, null);
                f61Var2.setTag(9);
                f61Var2.setItemAnimator(null);
                f61Var2.setLayoutAnimation(null);
                b0 b0Var = new b0(0);
                b0Var.j1(0);
                f61Var2.setLayoutManager(b0Var);
                if (i10 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f61Var2.setAdapter(new c0(this.f17518t0, this.f17499e, null, false, z10));
                f61Var2.setOnItemClickListener(new k8(this, 14));
                f61Var2.setOnItemLongClickListener(new s(this));
                this.f17508l0 = f61Var2;
                f61Var = f61Var2;
                d61Var = f61Var;
                break;
            case 7:
            default:
                d61Var = new n8(16, context, false);
                break;
            case 8:
                d61Var = new h6(context, null);
                break;
            case 10:
                v vVar = new v(this, 1);
                d61 d61Var2 = new d61(context, 5);
                d61Var2.setOrientation(1);
                q9 q9Var = new q9(context);
                q9Var.setImageDrawable(new oh0(2131624320, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
                d61Var2.addView(q9Var, ma.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 17.0f);
                int i11 = m6.G6;
                t6.U(textView2, i11, null);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setText(hd.N0(2131745553, null));
                textView2.setGravity(17);
                d61Var2.addView(textView2, ma.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(context);
                d61Var2.f46888b = textView3;
                textView3.setTextSize(1, 14.0f);
                t6.U(textView3, i11, null);
                textView3.setText(hd.a0(null, null, 2131745554, ""));
                textView3.setGravity(17);
                d61Var2.addView(textView3, ma.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(context);
                textView4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
                i5.c.r(14.0f, 1, 2131745555, textView4, null);
                int i12 = m6.Fi;
                t6.U(textView4, i12, null);
                int r12 = m6.r1(0.15f, m6.v0(i12));
                org.telegram.ui.Cells.y k02 = m6.k0(6, 6, 6, 6, 0, r12, r12);
                p6 K = t6.K(0.15f, i12);
                textView4.setBackground(k02);
                t6.j(textView4, k02, null, K, null);
                textView4.setOnClickListener(new o4(vVar, 4));
                d61Var2.addView(textView4, ma.t(-2, -2, 1, 0, 0, 0, 38));
                this.F0 = d61Var2;
                textView3.setText(hd.a0(null, null, 2131745554, this.f17494a0));
                d61Var = d61Var2;
                break;
        }
        if (i7 == 5) {
            d61Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(86.0f)));
        } else {
            d61Var.setLayoutParams(new v4.q0(-1, -2));
        }
        return new v4.f1(d61Var);
    }
}
