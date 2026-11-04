package kg;

import ai.e3;
import ai.j6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.mf;
import ci.s9;
import gi.v5;
import ii.i2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.ew;
import org.telegram.ui.nz;
import org.telegram.ui.s51;
import org.telegram.ui.u51;
import org.telegram.ui.uw;
public abstract class e0 extends sj0 {
    public boolean A0;
    public nz B0;
    public int C0;
    public int D0;
    public String E;
    public int E0;
    public s51 F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public String N;
    public boolean O;
    public int Q;
    public String S;
    public int T;
    public int U;
    public ew V;
    public final int W;
    public boolean X;
    public boolean Y;
    public String f16956a0;
    public int f16957b0;
    public String f16959c0;
    public boolean d;
    public int f16960d0;
    public final Context f16961e;
    public int f16962e0;
    public n f16963f;
    public int f16964f0;
    public int f16965g0;
    public n h;
    public int f16966h0;
    public final int f16967i0;
    public final u4.k f16968j0;
    public final w f16969k0;
    public u51 f16970l0;
    public final long m0;
    public long f16973o0;
    public View f16974p0;
    public ii.e f16975q0;
    public e3 f16976r;
    public ArrayList f16977r0;
    public final uw f16979s0;
    public final int f16980t0;
    public ArrayList f16981u0;
    public final ArrayList f16982v0;
    public int f16983w;
    public final ArrayList f16984w0;
    public int f16985x;
    public String f16986x0;
    public a0.h f16988y0;
    public final ArrayList f16989z0;
    public b0 f16958c = b0.All;
    public int f16971n = -1;
    public ArrayList f16978s = new ArrayList();
    public final ArrayList f16987y = new ArrayList();
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
    public boolean f16972n0 = false;

    public e0(Context context, uw uwVar, int i3, int i10, u4.k kVar, boolean z10) {
        int i11 = h10.f22829t0;
        this.f16980t0 = i11;
        this.f16981u0 = new ArrayList();
        this.f16982v0 = new ArrayList();
        this.f16984w0 = new ArrayList();
        this.f16986x0 = null;
        this.f16988y0 = new a0.h();
        this.f16989z0 = new ArrayList();
        this.G0 = -1;
        this.H0 = true;
        this.I0 = true;
        this.f16968j0 = kVar;
        this.f16979s0 = uwVar;
        bm0 bm0Var = (bm0) this;
        w wVar = new w(bm0Var);
        this.f16969k0 = wVar;
        wVar.f17206a = new v5(bm0Var, 7);
        wVar.f17219p = z10;
        this.f16961e = context;
        this.W = i3;
        this.f16967i0 = i10;
        this.m0 = h10.i(i11).e();
        if (i10 != 15) {
            qr.a0(i11).f24934a.c(new k2.u(i11, i10, new r(this), 2));
        }
        li.b0(i11).M0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i3 = 0; i3 < split.length; i3++) {
                String str3 = split[i3];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i3]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 1 && i3 != 4 && i3 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.O;
        ArrayList arrayList = this.f16982v0;
        ArrayList arrayList2 = this.f16984w0;
        String str = null;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                d0 d0Var = (d0) arrayList2.remove(0);
                this.f16981u0.remove(d0Var);
                arrayList.remove(d0Var);
                this.f16988y0.l(d0Var.f16948c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(d0Var.f16948c);
                } else {
                    sb2.append(", ");
                    sb2.append(d0Var.f16948c);
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
            this.f16981u0.clear();
            this.f16988y0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.N;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        f();
        boolean z11 = this.O;
        int i3 = this.f16980t0;
        if (!z11) {
            qr.a0(i3).f24934a.c(new i2(i3, 1));
        } else {
            qr.a0(i3).f24934a.c(new ii.e(14, (bm0) this, sb2));
        }
    }

    public final boolean F(Object obj) {
        if (this.f16967i0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        uw uwVar = this.f16979s0;
        if (z10) {
            if (((TLRPC.User) obj).bot) {
                return uwVar.B2;
            }
            return uwVar.A2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (t3.T(chat)) {
                return uwVar.f50332z2;
            }
            if (t3.n0(chat)) {
                if (uwVar.f50316w2 || uwVar.f50322x2) {
                    return true;
                }
                return false;
            } else if (uwVar.f50316w2 || uwVar.f50328y2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        ew ewVar;
        String str2;
        String str3;
        this.f16986x0 = str;
        ArrayList arrayList = this.f16984w0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f16982v0;
            arrayList2.clear();
            int size = this.f16981u0.size();
            for (int i3 = 0; i3 < size; i3++) {
                ew ewVar2 = this.V;
                if ((ewVar2 == null || ewVar2.a() != ((d0) this.f16981u0.get(i3)).f16948c) && F(((d0) this.f16981u0.get(i3)).f16946a)) {
                    arrayList2.add((d0) this.f16981u0.get(i3));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f16981u0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            d0 d0Var = (d0) this.f16981u0.get(i10);
            if (d0Var != null && d0Var.f16946a != null && (((ewVar = this.V) == null || ewVar.a() != d0Var.f16948c) && F(((d0) this.f16981u0.get(i10)).f16946a))) {
                TLObject tLObject = d0Var.f16946a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = rg.c.i(this.f16980t0, chat, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) d0Var.f16946a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = l10.p((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) d0Var.f16946a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(d0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(b0 b0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(b0Var.f16929c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new wp(2131230873, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final Object I(int i3) {
        int size;
        int i10;
        int size2;
        ArrayList arrayList;
        int i11;
        TLRPC.Chat M0;
        int i12;
        ArrayList arrayList2 = this.f16987y;
        if (!arrayList2.isEmpty()) {
            if (i3 > 0 && i3 - 1 < arrayList2.size()) {
                return arrayList2.get(i12);
            }
            i3 = k2.p1.f(1, i3, arrayList2);
        }
        ArrayList arrayList3 = this.K;
        if (!arrayList3.isEmpty()) {
            if (i3 > 0) {
                return arrayList3.get(i3 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            if (this.O) {
                arrayList = this.f16984w0;
            } else {
                arrayList = this.f16982v0;
            }
            if (i3 > L && (i11 = (i3 - 1) - (L == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((d0) arrayList.get(i11)).f16946a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i13 = this.f16980t0;
                if (z10) {
                    TLRPC.User a22 = hp.s1(i13).a2(Long.valueOf(((TLRPC.User) tLObject).f27150id));
                    if (a22 != null) {
                        return a22;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (M0 = hp.s1(i13).M0(Long.valueOf(((TLRPC.Chat) tLObject).f27001id))) != null) {
                    return M0;
                } else {
                    return tLObject;
                }
            }
            i3 -= J();
        }
        ArrayList arrayList4 = this.G;
        if (!arrayList4.isEmpty()) {
            if (i3 > 0 && i3 <= arrayList4.size()) {
                return arrayList4.get(i3 - 1);
            }
            i3 = k2.p1.f(1, i3, arrayList4);
        }
        ArrayList arrayList5 = this.F;
        if (!arrayList5.isEmpty()) {
            if (i3 > 0 && i3 <= arrayList5.size()) {
                return arrayList5.get(i3 - 1);
            }
            i3 = k2.p1.f(1, i3, arrayList5);
        }
        w wVar = this.f16969k0;
        ArrayList arrayList6 = wVar.f17209e;
        ArrayList arrayList7 = wVar.d;
        ArrayList arrayList8 = wVar.f17213j;
        int size3 = this.f16978s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
            if (i3 != 0) {
                i3--;
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
        if (i3 >= 0 && i3 < size3) {
            return this.f16978s.get(i3);
        }
        int i16 = i3 - size3;
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
        int i3;
        if (this.O) {
            arrayList = this.f16984w0;
        } else {
            arrayList = this.f16982v0;
        }
        if (!arrayList.isEmpty()) {
            i3 = arrayList.size() + 1;
        } else {
            i3 = 0;
        }
        return (L() ? 1 : 0) + i3;
    }

    public final int K() {
        int i3 = 0;
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f16987y;
        if (!arrayList.isEmpty()) {
            i3 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i3;
        }
        if (O()) {
            i3 += J();
            if (!this.O) {
                return i3;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            i3 = i3 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            i3 += arrayList4.size() + 1;
        }
        int size = this.f16978s.size();
        int size2 = this.f16969k0.d.size();
        int i10 = i3 + size + size2;
        if (size + size2 > 0) {
            if (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    public final boolean L() {
        if (!this.O && !li.b0(this.f16980t0).f24032j1.isEmpty()) {
            if (this.f16967i0 != 14 || this.f16979s0.A2) {
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

    public final boolean N(int i3) {
        int size;
        int i10;
        int i11;
        int size2;
        ArrayList arrayList;
        if (this.O && this.K.isEmpty()) {
            ArrayList arrayList2 = this.f16987y;
            if (!arrayList2.isEmpty()) {
                i3 = k2.p1.f(1, i3, arrayList2);
            }
            if (O()) {
                ?? L = L();
                if (this.O) {
                    arrayList = this.f16984w0;
                } else {
                    arrayList = this.f16982v0;
                }
                if (i3 <= L || (i3 - 1) - (L == true ? 1 : 0) >= arrayList.size()) {
                    i3 -= J();
                }
            }
            w wVar = this.f16969k0;
            ArrayList arrayList3 = wVar.f17209e;
            ArrayList arrayList4 = wVar.d;
            int size3 = this.f16978s.size();
            int size4 = arrayList4.size();
            int size5 = wVar.f17213j.size();
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
                if (i3 < 0 || i3 >= size7) {
                    i3 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (J() > 0 || !this.G.isEmpty() || !arrayList2.isEmpty())) {
                if (i3 != 0) {
                    i3--;
                }
            }
            if ((i3 < 0 || i3 >= size3) && (((i10 = i3 - size3) < 0 || i10 >= size4) && ((i11 = i10 - size4) <= 0 || i11 >= size5))) {
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
                    if (this.f16958c != b0.All || this.d) {
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
        if ((this.R != 0 && this.P != 0) || this.f16966h0 != this.f16962e0) {
            return;
        }
        ew ewVar = this.V;
        if (ewVar != null && ewVar.a() != 0 && !this.Y) {
            U(this.f16966h0, this.f16956a0);
            return;
        }
        V(this.f16966h0, this.f16956a0);
    }

    public final void Q(long j10, TLObject tLObject) {
        d0 d0Var;
        String str;
        d0 d0Var2 = (d0) this.f16988y0.f(j10);
        if (d0Var2 == null) {
            Object obj = new Object();
            this.f16988y0.k(obj, j10);
            d0Var = obj;
        } else {
            this.f16981u0.remove(d0Var2);
            d0Var = d0Var2;
        }
        this.f16981u0.add(0, d0Var);
        d0Var.f16948c = j10;
        d0Var.f16946a = tLObject;
        d0Var.f16947b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.N;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        f();
        int i3 = this.f16980t0;
        qr.a0(i3).f24934a.c(new s9(i3, j10, 2));
    }

    public final boolean R() {
        int i3 = this.f16967i0;
        if (i3 != 2 && i3 != 4 && i3 != 5 && i3 != 6 && i3 != 1 && i3 != 11 && i3 != 15) {
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
            int size2 = this.f16969k0.f17209e.size();
            if (this.H0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                s(K);
            }
        }
    }

    public final void T(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e0.T(int, java.lang.String):void");
    }

    public final void U(int i3, String str) {
        ew ewVar = this.V;
        if (ewVar != null && ewVar.a() != 0 && this.W != 0) {
            if (!TextUtils.isEmpty(this.f16956a0) || !TextUtils.isEmpty(str)) {
                int i10 = this.R;
                int i11 = this.f16980t0;
                if (i10 != 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.R, true);
                    this.R = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.I;
                if (isEmpty) {
                    this.f16986x0 = null;
                    this.J.clear();
                    arrayList.clear();
                    this.U = 0;
                    this.f16956a0 = null;
                    this.O = false;
                    f();
                } else if (this.f16967i0 != 15) {
                    long a10 = this.V.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f27112q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = hp.s1(i11).j1(a10);
                    if (str.equals(this.f16956a0) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.f16956a0 = str;
                    int i12 = 1 + this.U;
                    this.U = i12;
                    this.R = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new q(i12, i3, 0, this, str, tL_messages_search), 2);
                }
            }
        }
    }

    public final void V(int i3, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.W != 0 && (!TextUtils.isEmpty(this.f16956a0) || !TextUtils.isEmpty(str))) {
            int i10 = this.P;
            int i11 = this.f16980t0;
            boolean z13 = false;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.P, true);
                this.P = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.J;
            if (!isEmpty && this.V.a() == 0) {
                G(str);
                this.f16969k0.f(this.f16978s, this.f16984w0);
                if (this.f16967i0 == 15) {
                    int i12 = this.E0 - 1;
                    this.E0 = i12;
                    ew ewVar = this.V;
                    if (ewVar != null) {
                        if (i12 > 0) {
                            z13 = true;
                        }
                        ewVar.d(z13, true);
                        this.V.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i13 = this.f16958c.f16927a;
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
                    tL_messages_searchGlobal.f27114q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.D0;
                    if (!str.equals(this.f16956a0)) {
                        this.d = false;
                    }
                    if (str.equals(this.f16956a0) && this.f16957b0 == this.f16958c.f16927a && !arrayList.isEmpty() && this.f16966h0 == this.f16962e0) {
                        zi ziVar = (zi) k2.p1.h(1, arrayList);
                        tL_messages_searchGlobal.offset_id = ziVar.f1();
                        tL_messages_searchGlobal.offset_rate = this.f16960d0;
                        tL_messages_searchGlobal.offset_peer = hp.s1(i11).j1(zi.C1(ziVar.f26868k.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.f16956a0 = str;
                    this.f16957b0 = this.f16958c.f16927a;
                    int i14 = this.Q + 1;
                    this.Q = i14;
                    this.P = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new q(i14, i3, 1, this, str, tL_messages_searchGlobal), 2);
                }
            } else {
                this.f16986x0 = null;
                arrayList.clear();
                this.I.clear();
                this.Q = 0;
                this.f16956a0 = null;
                this.f16957b0 = 0;
                this.O = false;
                f();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        ew ewVar = this.V;
        if (ewVar != null && ewVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList l10 = hp.s1(this.f16980t0).f23102q7.l(-this.V.a());
                String trim = str.trim();
                for (int i3 = 0; i3 < l10.size(); i3++) {
                    if (l10.get(i3) != null && ((TLRPC.TL_forumTopic) l10.get(i3)).title.toLowerCase().contains(trim)) {
                        arrayList.add((TLRPC.TL_forumTopic) l10.get(i3));
                        ((TLRPC.TL_forumTopic) l10.get(i3)).searchQuery = trim;
                    }
                }
            }
            f();
        }
    }

    @Override
    public final int b() {
        int i3;
        int i10 = 0;
        int i11 = 3;
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f16987y;
        if (!arrayList.isEmpty()) {
            i3 = arrayList.size() + 1;
        } else {
            i3 = 0;
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i3;
        }
        if (O()) {
            i3 += J();
            if (!this.O) {
                return i3;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            i3 = i3 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            i3 += arrayList4.size() + 1;
        }
        int size = this.f16978s.size();
        w wVar = this.f16969k0;
        int size2 = wVar.d.size();
        int i12 = i3 + size + size2;
        int size3 = wVar.f17209e.size();
        if (size3 > 3 && this.H0) {
            size3 = 3;
        }
        int size4 = this.L.size() + size3;
        int size5 = wVar.f17213j.size();
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
        if ((this.f16958c != b0.All || this.d) && arrayList6.isEmpty()) {
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
    public final long c(int i3) {
        return i3;
    }

    @Override
    public final int d(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e0.d(int):int");
    }

    @Override
    public final void t(u4.d1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        u51 u51Var;
        s51 s51Var;
        boolean z10;
        int i10 = this.f16967i0;
        boolean z11 = false;
        Context context = this.f16961e;
        switch (i3) {
            case 0:
                f6 f6Var = new f6(context, null);
                if (i10 == 3) {
                    z11 = true;
                }
                f6Var.m0 = z11;
                u51Var = f6Var;
                s51Var = u51Var;
                break;
            case 1:
                s51Var = new x3(context, null);
                break;
            case 2:
            case 9:
                s51Var = new x(0, context, true);
                break;
            case 3:
                s51Var = new ja(context);
                break;
            case 4:
                iz izVar = new iz(context, null);
                izVar.setViewType(1);
                izVar.setIsSingleCell(true);
                s51Var = izVar;
                break;
            case 5:
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                r6.V(textView, k6.G6, null);
                s51Var = textView;
                break;
            case 6:
                u51 u51Var2 = new u51(2, context, null);
                r6.m(u51Var2, 20, k6.f27972i6, null);
                u51Var2.setTag(9);
                u51Var2.setItemAnimator(null);
                u51Var2.setLayoutAnimation(null);
                y yVar = new y(0);
                yVar.j1(0);
                u51Var2.setLayoutManager(yVar);
                if (i10 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u51Var2.setAdapter(new z(this.f16980t0, this.f16961e, null, false, z10));
                u51Var2.setOnItemClickListener(new j6(this, 15));
                u51Var2.setOnItemLongClickListener(new r(this));
                this.f16970l0 = u51Var2;
                u51Var = u51Var2;
                s51Var = u51Var;
                break;
            case 7:
            default:
                s51Var = new l8(16, context, false);
                break;
            case 8:
                s51Var = new f6(context, null);
                break;
            case 10:
                u uVar = new u(this, 1);
                s51 s51Var2 = new s51(context, 6);
                s51Var2.setOrientation(1);
                k9 k9Var = new k9(context);
                k9Var.setImageDrawable(new ch0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
                s51Var2.addView(k9Var, mf.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 17.0f);
                int i11 = k6.G6;
                r6.V(textView2, i11, null);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setText(bd.M0(2131745759, null));
                textView2.setGravity(17);
                s51Var2.addView(textView2, mf.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(context);
                s51Var2.f49370b = textView3;
                textView3.setTextSize(1, 14.0f);
                r6.V(textView3, i11, null);
                textView3.setText(bd.a0(null, null, 2131745760, ""));
                textView3.setGravity(17);
                s51Var2.addView(textView3, mf.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(context);
                textView4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
                k2.p1.u(textView4, 1, 14.0f, null, 2131745761);
                int i12 = k6.Ci;
                r6.V(textView4, i12, null);
                int r12 = k6.r1(0.15f, k6.v0(i12));
                org.telegram.ui.Cells.y k02 = k6.k0(6, 6, 6, 6, 0, r12, r12);
                n6 L = r6.L(0.15f, i12);
                textView4.setBackground(k02);
                r6.k(textView4, k02, null, L, null);
                textView4.setOnClickListener(new ii.m(uVar, 7));
                s51Var2.addView(textView4, mf.t(-2, -2, 1, 0, 0, 0, 38));
                this.F0 = s51Var2;
                textView3.setText(bd.a0(null, null, 2131745760, this.f16956a0));
                s51Var = s51Var2;
                break;
        }
        if (i3 == 5) {
            s51Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(86.0f)));
        } else {
            s51Var.setLayoutParams(new u4.p0(-1, -2));
        }
        return new u4.d1(s51Var);
    }
}
