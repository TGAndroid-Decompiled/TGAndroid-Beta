package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class tl3 extends c79 {
    public boolean A0;
    public og4 B0;
    public int C0;
    public boolean D0;
    public String E;
    public int E0;
    public oob F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public String N;
    public boolean O;
    public int Q;
    public String S;
    public int T;
    public int U;
    public dj3 V;
    public final byte W;
    public boolean X;
    public boolean Y;
    public String a0;
    public byte b0;
    public String c0;
    public boolean d;
    public int d0;
    public final Activity e;
    public int e0;
    public dl3 f;
    public int f0;
    public int g0;
    public dl3 h;
    public int h0;
    public final int i0;
    public final zb3 j0;
    public final ml3 k0;
    public qob l0;
    public final long m0;
    public long o0;
    public View p0;
    public wd3 q0;
    public bf7 r;
    public ArrayList r0;
    public final uj3 s0;
    public final int t0;
    public ArrayList u0;
    public final ArrayList v0;
    public int w;
    public final ArrayList w0;
    public int x;
    public String x0;
    public zh6 y0;
    public final ArrayList z0;
    public ql3 c = ql3.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
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
    public boolean n0 = false;

    public tl3(Activity activity, uj3 uj3Var, int i, int i2, zb3 zb3Var, boolean z) {
        int i3 = yac.t0;
        this.t0 = i3;
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = null;
        this.y0 = new zh6();
        this.z0 = new ArrayList();
        this.G0 = -1;
        this.H0 = true;
        this.I0 = true;
        this.j0 = zb3Var;
        this.s0 = uj3Var;
        gx9 gx9Var = (gx9) this;
        ml3 ml3Var = new ml3(gx9Var);
        this.k0 = ml3Var;
        ml3Var.a = new zm9(gx9Var, (byte) 28);
        ml3Var.p = z;
        this.e = activity;
        this.W = i;
        this.i0 = i2;
        this.m0 = yac.h(i3).e();
        if (i2 != 15) {
            kf7.a0(i3).a.c(new bt(i3, i2, new ll3(this), (byte) 6));
        }
        ls6.d0(i3).O0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i = 0; i < split.length; i++) {
                String str3 = split[i];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 1 && i != 4 && i != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb;
        boolean z = this.O;
        ArrayList arrayList = this.v0;
        ArrayList arrayList2 = this.w0;
        String str = null;
        if (z) {
            sb = null;
            while (arrayList2.size() > 0) {
                sl3 sl3Var = (sl3) arrayList2.remove(0);
                this.u0.remove(sl3Var);
                arrayList.remove(sl3Var);
                this.y0.l(sl3Var.c);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(sl3Var.c);
                } else {
                    sb.append(", ");
                    sb.append(sl3Var.c);
                }
            }
            if (sb == null) {
                sb = new StringBuilder("1");
            } else {
                sb.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.u0.clear();
            this.y0.b();
            sb = new StringBuilder("1");
        }
        String str2 = this.N;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        f();
        boolean z2 = this.O;
        int i = this.t0;
        if (!z2) {
            kf7.a0(i).a.c(new gw0(i, (byte) 4));
        } else {
            kf7.a0(i).a.c(new wd3((gx9) this, sb, (byte) 11));
        }
    }

    public final boolean F(Object obj) {
        if (this.i0 != 14) {
            return true;
        }
        boolean z = obj instanceof TLRPC.User;
        uj3 uj3Var = this.s0;
        if (z) {
            if (((TLRPC.User) obj).bot) {
                return uj3Var.C2;
            }
            return uj3Var.B2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (xc2.T(chat)) {
                return uj3Var.A2;
            }
            if (xc2.n0(chat)) {
                if (uj3Var.x2 || uj3Var.y2) {
                    return true;
                }
                return false;
            } else if (uj3Var.x2 || uj3Var.z2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        dj3 dj3Var;
        String str2;
        String str3;
        this.x0 = str;
        ArrayList arrayList = this.w0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.v0;
            arrayList2.clear();
            int size = this.u0.size();
            for (int i = 0; i < size; i++) {
                dj3 dj3Var2 = this.V;
                if ((dj3Var2 == null || dj3Var2.a() != ((sl3) this.u0.get(i)).c) && F(((sl3) this.u0.get(i)).a)) {
                    arrayList2.add((sl3) this.u0.get(i));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.u0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sl3 sl3Var = (sl3) this.u0.get(i2);
            if (sl3Var != null && sl3Var.a != null && (((dj3Var = this.V) == null || dj3Var.a() != sl3Var.c) && F(((sl3) this.u0.get(i2)).a))) {
                TLObject tLObject = sl3Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = ro4.j(this.t0, chat, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) sl3Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = lbc.r((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) sl3Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(sl3Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(ql3 ql3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(ql3Var.c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new wm2(2131230873, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final Object I(int i) {
        int size;
        int i2;
        int size2;
        ArrayList arrayList;
        int i3;
        TLRPC.Chat M0;
        int i4;
        ArrayList arrayList2 = this.y;
        if (!arrayList2.isEmpty()) {
            if (i > 0 && i - 1 < arrayList2.size()) {
                return arrayList2.get(i4);
            }
            i = bs2.k(1, i, arrayList2);
        }
        ArrayList arrayList3 = this.K;
        if (!arrayList3.isEmpty()) {
            if (i > 0) {
                return arrayList3.get(i - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            if (this.O) {
                arrayList = this.w0;
            } else {
                arrayList = this.v0;
            }
            if (i > L && (i3 = (i - 1) - (L == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((sl3) arrayList.get(i3)).a;
                boolean z = tLObject instanceof TLRPC.User;
                int i5 = this.t0;
                if (z) {
                    TLRPC.User X1 = uc7.s1(i5).X1(Long.valueOf(((TLRPC.User) tLObject).id));
                    if (X1 != null) {
                        return X1;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (M0 = uc7.s1(i5).M0(Long.valueOf(((TLRPC.Chat) tLObject).id))) != null) {
                    return M0;
                } else {
                    return tLObject;
                }
            }
            i -= J();
        }
        ArrayList arrayList4 = this.G;
        if (!arrayList4.isEmpty()) {
            if (i > 0 && i <= arrayList4.size()) {
                return arrayList4.get(i - 1);
            }
            i = bs2.k(1, i, arrayList4);
        }
        ArrayList arrayList5 = this.F;
        if (!arrayList5.isEmpty()) {
            if (i > 0 && i <= arrayList5.size()) {
                return arrayList5.get(i - 1);
            }
            i = bs2.k(1, i, arrayList5);
        }
        ml3 ml3Var = this.k0;
        ArrayList arrayList6 = ml3Var.e;
        ArrayList arrayList7 = ml3Var.d;
        ArrayList arrayList8 = ml3Var.j;
        int size3 = this.s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
            if (i != 0) {
                i--;
            } else {
                return null;
            }
        }
        int size5 = arrayList8.size();
        int i6 = 3;
        if (size5 > 3 && this.I0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.H0) {
            i6 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i7 = 0;
        ArrayList arrayList9 = this.L;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i6 + 1;
        }
        if (i >= 0 && i < size3) {
            return this.s.get(i);
        }
        int i8 = i - size3;
        if (i8 >= 0 && i8 < size4) {
            return arrayList7.get(i8);
        }
        int i9 = i8 - size4;
        if (i9 >= 0 && i9 < size5) {
            return arrayList8.get(i9);
        }
        int i10 = i9 - size5;
        if (i10 > 0 && i10 < size) {
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < arrayList9.size()) {
                return arrayList9.get(i11);
            }
            i2 = i11 - arrayList9.size();
            if (i2 >= 0 && i2 < arrayList6.size()) {
                return arrayList6.get(i2);
            }
        } else {
            i2 = i10 - size;
        }
        ArrayList arrayList10 = this.I;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i2 > 0 && i2 <= arrayList10.size()) {
            return arrayList10.get(i2 - 1);
        }
        if (!this.Y && !arrayList10.isEmpty()) {
            i7 = 1;
        }
        int i12 = i2 - (size2 + i7);
        ArrayList arrayList11 = this.J;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i12 > 0 && i12 <= arrayList11.size()) {
            return arrayList11.get(i12 - 1);
        }
        return null;
    }

    public final int J() {
        ArrayList arrayList;
        int i;
        if (this.O) {
            arrayList = this.w0;
        } else {
            arrayList = this.v0;
        }
        if (!arrayList.isEmpty()) {
            i = arrayList.size() + 1;
        } else {
            i = 0;
        }
        return (L() ? 1 : 0) + i;
    }

    public final int K() {
        int i = 0;
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            i = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i;
        }
        if (O()) {
            i += J();
            if (!this.O) {
                return i;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            i = i + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            i += arrayList4.size() + 1;
        }
        int size = this.s.size();
        int size2 = this.k0.d.size();
        int i2 = i + size + size2;
        if (size + size2 > 0) {
            if (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    public final boolean L() {
        if (!this.O && !ls6.d0(this.t0).j1.isEmpty()) {
            if (this.i0 != 14 || this.s0.B2) {
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

    public final boolean N(int i) {
        int size;
        int i2;
        int i3;
        int size2;
        ArrayList arrayList;
        if (this.O && this.K.isEmpty()) {
            ArrayList arrayList2 = this.y;
            if (!arrayList2.isEmpty()) {
                i = bs2.k(1, i, arrayList2);
            }
            if (O()) {
                ?? L = L();
                if (this.O) {
                    arrayList = this.w0;
                } else {
                    arrayList = this.v0;
                }
                if (i <= L || (i - 1) - (L == true ? 1 : 0) >= arrayList.size()) {
                    i -= J();
                }
            }
            ml3 ml3Var = this.k0;
            ArrayList arrayList3 = ml3Var.e;
            ArrayList arrayList4 = ml3Var.d;
            int size3 = this.s.size();
            int size4 = arrayList4.size();
            int size5 = ml3Var.j.size();
            int i4 = 3;
            if (size5 > 3 && this.I0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.H0) {
                i4 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.L;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i4 + 1;
            }
            int size7 = this.F.size();
            if (size7 > 0) {
                if (i < 0 || i >= size7) {
                    i -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (J() > 0 || !this.G.isEmpty() || !arrayList2.isEmpty())) {
                if (i != 0) {
                    i--;
                }
            }
            if ((i < 0 || i >= size3) && (((i2 = i - size3) < 0 || i2 >= size4) && ((i3 = i2 - size4) <= 0 || i3 >= size5))) {
                int i5 = i3 - size5;
                if (i5 > 0 && i5 < size) {
                    return true;
                }
                int i6 = i5 - size;
                ArrayList arrayList6 = this.I;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i6 <= 0 || i6 >= size2) {
                    ArrayList arrayList7 = this.J;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != ql3.d || this.d) {
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
        if ((this.R != 0 && this.P != 0) || this.h0 != this.e0) {
            return;
        }
        dj3 dj3Var = this.V;
        if (dj3Var != null && dj3Var.a() != 0 && !this.Y) {
            U(this.h0, this.a0);
            return;
        }
        V(this.h0, this.a0);
    }

    public final void Q(long j, TLObject tLObject) {
        sl3 sl3Var;
        String str;
        sl3 sl3Var2 = (sl3) this.y0.f(j);
        if (sl3Var2 == null) {
            Object obj = new Object();
            this.y0.k(j, obj);
            sl3Var = obj;
        } else {
            this.u0.remove(sl3Var2);
            sl3Var = sl3Var2;
        }
        this.u0.add(0, sl3Var);
        sl3Var.c = j;
        sl3Var.a = tLObject;
        sl3Var.b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.N;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        f();
        int i = this.t0;
        kf7.a0(i).a.c(new am0(i, j, (byte) 2));
    }

    public final boolean R() {
        int i = this.i0;
        if (i != 2 && i != 4 && i != 5 && i != 6 && i != 1 && i != 11 && i != 15) {
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
            q(K + 1, size);
            int size2 = this.k0.e.size();
            if (this.H0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                s(K);
            }
        }
    }

    public final void T(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl3.T(int, java.lang.String):void");
    }

    public final void U(int i, String str) {
        dj3 dj3Var = this.V;
        if (dj3Var != null && dj3Var.a() != 0 && this.W != 0) {
            if (!TextUtils.isEmpty(this.a0) || !TextUtils.isEmpty(str)) {
                int i2 = this.R;
                int i3 = this.t0;
                if (i2 != 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(this.R, true);
                    this.R = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.I;
                if (isEmpty) {
                    this.x0 = null;
                    this.J.clear();
                    arrayList.clear();
                    this.U = 0;
                    this.a0 = null;
                    this.O = false;
                    f();
                } else if (this.i0 != 15) {
                    long a = this.V.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = uc7.s1(i3).j1(a);
                    if (str.equals(this.a0) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.a0 = str;
                    int i4 = 1 + this.U;
                    this.U = i4;
                    this.R = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_search, new il3(this, str, i4, i, tL_messages_search, (byte) 0), 2);
                }
            }
        }
    }

    public final void V(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.W != 0) {
            if (!TextUtils.isEmpty(this.a0) || !TextUtils.isEmpty(str)) {
                int i2 = this.P;
                int i3 = this.t0;
                boolean z4 = false;
                if (i2 != 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(this.P, true);
                    this.P = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.J;
                if (!isEmpty && this.V.a() == 0) {
                    G(str);
                    this.k0.f(this.s, this.w0);
                    if (this.i0 == 15) {
                        int i4 = this.E0 - 1;
                        this.E0 = i4;
                        dj3 dj3Var = this.V;
                        if (dj3Var != null) {
                            if (i4 > 0) {
                                z4 = true;
                            }
                            dj3Var.d(z4, true);
                            this.V.c();
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    byte b = this.c.a;
                    if ((b & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tL_messages_searchGlobal.broadcasts_only = z;
                    if ((b & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    tL_messages_searchGlobal.groups_only = z2;
                    if ((b & 8) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    tL_messages_searchGlobal.users_only = z3;
                    tL_messages_searchGlobal.limit = 20;
                    tL_messages_searchGlobal.q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.D0 ? 1 : 0;
                    if (!str.equals(this.a0)) {
                        this.d = false;
                    }
                    if (str.equals(this.a0) && this.b0 == this.c.a && !arrayList.isEmpty() && this.h0 == this.e0) {
                        r47 r47Var = (r47) c00.g(1, arrayList);
                        tL_messages_searchGlobal.offset_id = r47Var.e1();
                        tL_messages_searchGlobal.offset_rate = this.d0;
                        tL_messages_searchGlobal.offset_peer = uc7.s1(i3).j1(r47.B1(r47Var.k.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.a0 = str;
                    this.b0 = this.c.a;
                    int i5 = this.Q + 1;
                    this.Q = i5;
                    this.P = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_searchGlobal, new il3(this, str, i5, i, tL_messages_searchGlobal, (byte) 1), 2);
                    return;
                }
                this.x0 = null;
                arrayList.clear();
                this.I.clear();
                this.Q = 0;
                this.a0 = null;
                this.b0 = (byte) 0;
                this.O = false;
                f();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        dj3 dj3Var = this.V;
        if (dj3Var != null && dj3Var.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList l = uc7.s1(this.t0).h4.l(-this.V.a());
                String trim = str.trim();
                for (int i = 0; i < l.size(); i++) {
                    if (l.get(i) != null && ((TLRPC.TL_forumTopic) l.get(i)).title.toLowerCase().contains(trim)) {
                        arrayList.add((TLRPC.TL_forumTopic) l.get(i));
                        ((TLRPC.TL_forumTopic) l.get(i)).searchQuery = trim;
                    }
                }
            }
            f();
        }
    }

    @Override
    public final int b() {
        int i;
        int i2 = 0;
        int i3 = 3;
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            i = arrayList.size() + 1;
        } else {
            i = 0;
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i;
        }
        if (O()) {
            i += J();
            if (!this.O) {
                return i;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            i = i + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            i += arrayList4.size() + 1;
        }
        int size = this.s.size();
        ml3 ml3Var = this.k0;
        int size2 = ml3Var.d.size();
        int i4 = i + size + size2;
        int size3 = ml3Var.e.size();
        if (size3 > 3 && this.H0) {
            size3 = 3;
        }
        int size4 = this.L.size() + size3;
        int size5 = ml3Var.j.size();
        if (size5 > 3 && this.I0) {
            size5 = 3;
        }
        if (size + size2 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i4++;
        }
        if (size4 != 0) {
            i4 += size4 + 1;
        }
        if (size5 != 0) {
            i4 += size5;
        }
        ArrayList arrayList5 = this.I;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i4 += size6 + 1 + (!this.Y ? 1 : 0);
        }
        if (!this.Y) {
            this.Z = i4;
        }
        ArrayList arrayList6 = this.J;
        int size7 = arrayList6.size();
        if ((this.c != ql3.d || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i3 = 1;
            }
            size7 = i3;
        }
        if (arrayList5.isEmpty() || this.Y) {
            i2 = size7;
        }
        if (i2 != 0) {
            i4 += i2 + 1 + (!this.X ? 1 : 0);
        }
        if (this.Y) {
            this.Z = i4;
        }
        this.C0 = i4;
        return i4;
    }

    @Override
    public final long c(int i) {
        return i;
    }

    @Override
    public final int d(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl3.d(int):int");
    }

    @Override
    public final void t(defpackage.f89 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl3.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        boolean z;
        oob oobVar;
        int i2 = this.i0;
        boolean z2 = false;
        Activity activity = this.e;
        switch (i) {
            case 0:
                bv8 bv8Var = new bv8(activity, null);
                if (i2 == 3) {
                    z2 = true;
                }
                bv8Var.n0 = z2;
                oobVar = bv8Var;
                break;
            case 1:
                oobVar = new p55(activity, null);
                break;
            case 2:
            case 9:
                oobVar = new nl3((byte) 0, activity, true);
                break;
            case 3:
                oobVar = new zxb(activity);
                break;
            case 4:
                tk4 tk4Var = new tk4(activity, null);
                tk4Var.setViewType(1);
                tk4Var.setIsSingleCell(true);
                oobVar = tk4Var;
                break;
            case 5:
                TextView textView = new TextView(activity);
                textView.setGravity(16);
                textView.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                yob.X(textView, aob.G6, null);
                oobVar = textView;
                break;
            case 6:
                qob qobVar = new qob(activity, null, (byte) 6);
                yob.l(qobVar, 20, aob.i6, null);
                qobVar.setTag(9);
                qobVar.setItemAnimator(null);
                qobVar.setLayoutAnimation(null);
                as asVar = new as((byte) 5);
                asVar.i1(0);
                qobVar.setLayoutManager(asVar);
                if (i2 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                qobVar.setAdapter(new ol3(this.t0, null, this.e, false, z));
                qobVar.setOnItemClickListener(new u(this, (byte) 21));
                qobVar.setOnItemLongClickListener(new ll3(this));
                this.l0 = qobVar;
                oobVar = qobVar;
                break;
            case 7:
            default:
                oobVar = new skb(16, activity, false);
                break;
            case 8:
                oobVar = new bv8(activity, null);
                break;
            case 10:
                zg3 zg3Var = new zg3(this, (byte) 12);
                oob oobVar2 = new oob(activity, (byte) 4);
                oobVar2.setOrientation(1);
                de0 de0Var = new de0(activity);
                de0Var.setImageDrawable(new b29(2131624315, hl.L(120.0f), hl.L(120.0f)));
                oobVar2.addView(de0Var, tre.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(activity);
                textView2.setTextSize(1, 17.0f);
                int i3 = aob.G6;
                yob.X(textView2, i3, null);
                textView2.setTypeface(hl.o());
                textView2.setText(ob6.M0(2131745477, null));
                textView2.setGravity(17);
                oobVar2.addView(textView2, tre.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(activity);
                oobVar2.b = textView3;
                textView3.setTextSize(1, 14.0f);
                yob.X(textView3, i3, null);
                textView3.setText(ob6.a0(null, null, 2131745478, ""));
                textView3.setGravity(17);
                oobVar2.addView(textView3, tre.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(activity);
                textView4.setPadding(hl.L(12.0f), hl.L(4.0f), hl.L(12.0f), hl.L(4.0f));
                bs2.r(14.0f, 1, 2131745479, textView4, null);
                int i4 = aob.Fi;
                yob.X(textView4, i4, null);
                int p1 = aob.p1(0.15f, aob.w0(null, i4, false));
                hf0 i0 = aob.i0(6, 6, 6, 6, 0, p1, p1);
                uob K = yob.K(0.15f, i4);
                textView4.setBackground(i0);
                yob.j(textView4, i0, null, K, null);
                textView4.setOnClickListener(new mh3(zg3Var, (byte) 3));
                oobVar2.addView(textView4, tre.t(-2, -2, 1, 0, 0, 0, 38));
                this.F0 = oobVar2;
                textView3.setText(ob6.a0(null, null, 2131745478, this.a0));
                oobVar = oobVar2;
                break;
        }
        if (i == 5) {
            oobVar.setLayoutParams(new r79(-1, hl.L(86.0f)));
        } else {
            oobVar.setLayoutParams(new r79(-1, -2));
        }
        return new f89(oobVar);
    }
}
