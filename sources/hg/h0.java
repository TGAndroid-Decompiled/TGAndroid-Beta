package hg;

import ai.ra;
import ai.xa;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import ei.p6;
import gi.l2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ey;
import org.telegram.ui.px;
import org.telegram.ui.xa1;
import org.telegram.ui.y00;
import w7.z5;
public abstract class h0 extends lm0 {
    public y00 A0;
    public int B0;
    public int C0;
    public int D0;
    public d0 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public px U;
    public final int V;
    public boolean W;
    public boolean X;
    public String Z;
    public int f11899a0;
    public String f11900b0;
    public int f11902c0;
    public boolean d;
    public int f11903d0;
    public final Context e;
    public int f11904e0;
    public s f11905f;
    public int f11906f0;
    public int f11907g0;
    public s h;
    public final int f11908h0;
    public final s4.k f11909i0;
    public final y f11910j0;
    public xa1 f11911k0;
    public final long f11912l0;
    public long f11914n0;
    public View f11915o0;
    public p6 f11916p0;
    public ArrayList f11917q0;
    public ah.o f11918r;
    public final ey f11919r0;
    public final int f11921s0;
    public ArrayList f11922t0;
    public final ArrayList f11923u0;
    public int v;
    public final ArrayList f11924v0;
    public int f11925w;
    public String f11926w0;
    public a0.h f11928x0;
    public String f11929y;
    public final ArrayList f11930y0;
    public boolean f11931z0;
    public e0 f11901c = e0.All;
    public int f11913n = -1;
    public ArrayList f11920s = new ArrayList();
    public final ArrayList f11927x = new ArrayList();
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

    public h0(Context context, ey eyVar, int i10, int i11, s4.k kVar, boolean z10) {
        int i12 = UserConfig.selectedAccount;
        this.f11921s0 = i12;
        this.f11922t0 = new ArrayList();
        this.f11923u0 = new ArrayList();
        this.f11924v0 = new ArrayList();
        this.f11926w0 = null;
        this.f11928x0 = new a0.h();
        this.f11930y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.f11909i0 = kVar;
        this.f11919r0 = eyVar;
        so0 so0Var = (so0) this;
        y yVar = new y(so0Var);
        this.f11910j0 = yVar;
        yVar.f11819a = new a4.l(so0Var, 22);
        yVar.f11831p = z10;
        this.e = context;
        this.V = i10;
        this.f11908h0 = i11;
        this.f11912l0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new n(i12, i11, new w(this), 0));
        }
        MediaDataController.getInstance(i12).loadHints(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i10 = 0; i10 < split.length; i10++) {
                String str3 = split[i10];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i10]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 1 && i10 != 4 && i10 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.N;
        ArrayList arrayList = this.f11923u0;
        ArrayList arrayList2 = this.f11924v0;
        String str = null;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                g0 g0Var = (g0) arrayList2.remove(0);
                this.f11922t0.remove(g0Var);
                arrayList.remove(g0Var);
                this.f11928x0.l(g0Var.f11895c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(g0Var.f11895c);
                } else {
                    sb2.append(", ");
                    sb2.append(g0Var.f11895c);
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
            this.f11922t0.clear();
            this.f11928x0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        l();
        boolean z11 = this.N;
        int i10 = this.f11921s0;
        if (!z11) {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new l2(i10, 1));
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new p6(26, (so0) this, sb2));
        }
    }

    public final boolean F(Object obj) {
        if (this.f11908h0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        ey eyVar = this.f11919r0;
        if (z10) {
            if (((TLRPC.User) obj).bot) {
                return eyVar.A2;
            }
            return eyVar.f37169z2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (ChatObject.isChannel(chat)) {
                return eyVar.f37165y2;
            }
            if (ChatObject.isMegagroup(chat)) {
                if (eyVar.f37147v2 || eyVar.f37153w2) {
                    return true;
                }
                return false;
            } else if (eyVar.f37147v2 || eyVar.f37159x2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        px pxVar;
        String str2;
        String str3;
        this.f11926w0 = str;
        ArrayList arrayList = this.f11924v0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f11923u0;
            arrayList2.clear();
            int size = this.f11922t0.size();
            for (int i10 = 0; i10 < size; i10++) {
                px pxVar2 = this.U;
                if ((pxVar2 == null || pxVar2.a() != ((g0) this.f11922t0.get(i10)).f11895c) && F(((g0) this.f11922t0.get(i10)).f11893a)) {
                    arrayList2.add((g0) this.f11922t0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f11922t0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            g0 g0Var = (g0) this.f11922t0.get(i11);
            if (g0Var != null && g0Var.f11893a != null && (((pxVar = this.U) == null || pxVar.a() != g0Var.f11895c) && F(((g0) this.f11922t0.get(i11)).f11893a))) {
                TLObject tLObject = g0Var.f11893a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = og.d.i(chat, this.f11921s0, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) g0Var.f11893a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) g0Var.f11893a).username;
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(e0Var.f11871c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new xq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final Object I(int i10) {
        int size;
        int i11;
        int size2;
        ArrayList arrayList;
        int i12;
        TLRPC.Chat chat;
        int i13;
        ArrayList arrayList2 = this.f11927x;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList2.size()) {
                return arrayList2.get(i13);
            }
            i10 = k3.g(1, i10, arrayList2);
        }
        ArrayList arrayList3 = this.J;
        if (!arrayList3.isEmpty()) {
            if (i10 > 0) {
                return arrayList3.get(i10 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            if (this.N) {
                arrayList = this.f11924v0;
            } else {
                arrayList = this.f11923u0;
            }
            if (i10 > L && (i12 = (i10 - 1) - (L == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((g0) arrayList.get(i12)).f11893a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i14 = this.f11921s0;
                if (z10) {
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.User) tLObject).f20490id));
                    if (user != null) {
                        return user;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (chat = MessagesController.getInstance(i14).getChat(Long.valueOf(((TLRPC.Chat) tLObject).f20343id))) != null) {
                    return chat;
                } else {
                    return tLObject;
                }
            }
            i10 -= J();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = k3.g(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = k3.g(1, i10, arrayList5);
        }
        y yVar = this.f11910j0;
        ArrayList arrayList6 = yVar.e;
        ArrayList arrayList7 = yVar.d;
        ArrayList arrayList8 = yVar.f11825j;
        int size3 = this.f11920s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
            if (i10 != 0) {
                i10--;
            } else {
                return null;
            }
        }
        int size5 = arrayList8.size();
        int i15 = 3;
        if (size5 > 3 && this.H0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.G0) {
            i15 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i16 = 0;
        ArrayList arrayList9 = this.K;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i15 + 1;
        }
        if (i10 >= 0 && i10 < size3) {
            return this.f11920s.get(i10);
        }
        int i17 = i10 - size3;
        if (i17 >= 0 && i17 < size4) {
            return arrayList7.get(i17);
        }
        int i18 = i17 - size4;
        if (i18 >= 0 && i18 < size5) {
            return arrayList8.get(i18);
        }
        int i19 = i18 - size5;
        if (i19 > 0 && i19 < size) {
            int i20 = i19 - 1;
            if (i20 >= 0 && i20 < arrayList9.size()) {
                return arrayList9.get(i20);
            }
            i11 = i20 - arrayList9.size();
            if (i11 >= 0 && i11 < arrayList6.size()) {
                return arrayList6.get(i11);
            }
        } else {
            i11 = i19 - size;
        }
        ArrayList arrayList10 = this.H;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i11 > 0 && i11 <= arrayList10.size()) {
            return arrayList10.get(i11 - 1);
        }
        if (!this.X && !arrayList10.isEmpty()) {
            i16 = 1;
        }
        int i21 = i11 - (size2 + i16);
        ArrayList arrayList11 = this.I;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i21 > 0 && i21 <= arrayList11.size()) {
            return arrayList11.get(i21 - 1);
        }
        return null;
    }

    public final int J() {
        ArrayList arrayList;
        int i10;
        if (this.N) {
            arrayList = this.f11924v0;
        } else {
            arrayList = this.f11923u0;
        }
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        return (L() ? 1 : 0) + i10;
    }

    public final int K() {
        int i10 = 0;
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f11927x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (O()) {
            i10 += J();
            if (!this.N) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f11920s.size();
        int size2 = this.f11910j0.d.size();
        int i11 = i10 + size + size2;
        if (size + size2 > 0) {
            if (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i11 + 1;
            }
            return i11;
        }
        return i11;
    }

    public final boolean L() {
        if (!this.N && !MediaDataController.getInstance(this.f11921s0).hints.isEmpty()) {
            if (this.f11908h0 != 14 || this.f11919r0.f37169z2) {
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

    public final boolean N(int i10) {
        int size;
        int i11;
        int i12;
        int size2;
        ArrayList arrayList;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList2 = this.f11927x;
            if (!arrayList2.isEmpty()) {
                i10 = k3.g(1, i10, arrayList2);
            }
            if (O()) {
                ?? L = L();
                if (this.N) {
                    arrayList = this.f11924v0;
                } else {
                    arrayList = this.f11923u0;
                }
                if (i10 <= L || (i10 - 1) - (L == true ? 1 : 0) >= arrayList.size()) {
                    i10 -= J();
                }
            }
            y yVar = this.f11910j0;
            ArrayList arrayList3 = yVar.e;
            ArrayList arrayList4 = yVar.d;
            int size3 = this.f11920s.size();
            int size4 = arrayList4.size();
            int size5 = yVar.f11825j.size();
            int i13 = 3;
            if (size5 > 3 && this.H0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.G0) {
                i13 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.K;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i13 + 1;
            }
            int size7 = this.E.size();
            if (size7 > 0) {
                if (i10 < 0 || i10 >= size7) {
                    i10 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (J() > 0 || !this.F.isEmpty() || !arrayList2.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            if ((i10 < 0 || i10 >= size3) && (((i11 = i10 - size3) < 0 || i11 >= size4) && ((i12 = i11 - size4) <= 0 || i12 >= size5))) {
                int i14 = i12 - size5;
                if (i14 > 0 && i14 < size) {
                    return true;
                }
                int i15 = i14 - size;
                ArrayList arrayList6 = this.H;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i15 <= 0 || i15 >= size2) {
                    ArrayList arrayList7 = this.I;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.f11901c != e0.All || this.d) {
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
        if ((this.Q != 0 && this.O != 0) || this.f11907g0 != this.f11903d0) {
            return;
        }
        px pxVar = this.U;
        if (pxVar != null && pxVar.a() != 0 && !this.X) {
            U(this.f11907g0, this.Z);
            return;
        }
        V(this.f11907g0, this.Z);
    }

    public final void Q(long j10, TLObject tLObject) {
        g0 g0Var;
        String str;
        g0 g0Var2 = (g0) this.f11928x0.f(j10);
        if (g0Var2 == null) {
            Object obj = new Object();
            this.f11928x0.k(obj, j10);
            g0Var = obj;
        } else {
            this.f11922t0.remove(g0Var2);
            g0Var = g0Var2;
        }
        this.f11922t0.add(0, g0Var);
        g0Var.f11895c = j10;
        g0Var.f11893a = tLObject;
        g0Var.f11894b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        l();
        int i10 = this.f11921s0;
        MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new ra(i10, j10, 2));
    }

    public final boolean R() {
        int i10 = this.f11908h0;
        if (i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 1 && i10 != 11 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (K = K()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(K + 1, size);
            int size2 = this.f11910j0.e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(K);
            }
        }
    }

    public final void T(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: hg.h0.T(int, java.lang.String):void");
    }

    public final void U(int i10, String str) {
        px pxVar = this.U;
        if (pxVar != null && pxVar.a() != 0 && this.V != 0) {
            if (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str)) {
                int i11 = this.Q;
                int i12 = this.f11921s0;
                if (i11 != 0) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.Q, true);
                    this.Q = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.H;
                if (isEmpty) {
                    this.f11926w0 = null;
                    this.I.clear();
                    arrayList.clear();
                    this.T = 0;
                    this.Z = null;
                    this.N = false;
                    l();
                } else if (this.f11908h0 != 15) {
                    long a2 = this.U.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f20452q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = MessagesController.getInstance(i12).getInputPeer(a2);
                    if (str.equals(this.Z) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.Z = str;
                    int i13 = 1 + this.T;
                    this.T = i13;
                    this.Q = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new r(this, str, i13, i10, tL_messages_search, 0), 2);
                }
            }
        }
    }

    public final void V(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.V != 0 && (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str))) {
            int i11 = this.O;
            int i12 = this.f11921s0;
            boolean z13 = false;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.O, true);
                this.O = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.I;
            if (!isEmpty && this.U.a() == 0) {
                G(str);
                this.f11910j0.f(this.f11920s, this.f11924v0);
                if (this.f11908h0 == 15) {
                    int i13 = this.D0 - 1;
                    this.D0 = i13;
                    px pxVar = this.U;
                    if (pxVar != null) {
                        if (i13 > 0) {
                            z13 = true;
                        }
                        pxVar.d(z13, true);
                        this.U.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i14 = this.f11901c.f11869a;
                    if ((i14 & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tL_messages_searchGlobal.broadcasts_only = z10;
                    if ((i14 & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    tL_messages_searchGlobal.groups_only = z11;
                    if ((i14 & 8) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    tL_messages_searchGlobal.users_only = z12;
                    tL_messages_searchGlobal.limit = 20;
                    tL_messages_searchGlobal.f20454q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.C0;
                    if (!str.equals(this.Z)) {
                        this.d = false;
                    }
                    if (str.equals(this.Z) && this.f11899a0 == this.f11901c.f11869a && !arrayList.isEmpty() && this.f11907g0 == this.f11903d0) {
                        MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = this.f11902c0;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.Z = str;
                    this.f11899a0 = this.f11901c.f11869a;
                    int i15 = this.P + 1;
                    this.P = i15;
                    this.O = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new r(this, str, i15, i10, tL_messages_searchGlobal, 1), 2);
                }
            } else {
                this.f11926w0 = null;
                arrayList.clear();
                this.H.clear();
                this.P = 0;
                this.Z = null;
                this.f11899a0 = 0;
                this.N = false;
                l();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        px pxVar = this.U;
        if (pxVar != null && pxVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f11921s0).getTopicsController().getTopics(-this.U.a());
                String trim = str.trim();
                for (int i10 = 0; i10 < topics.size(); i10++) {
                    if (topics.get(i10) != null && topics.get(i10).title.toLowerCase().contains(trim)) {
                        arrayList.add(topics.get(i10));
                        topics.get(i10).searchQuery = trim;
                    }
                }
            }
            l();
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11 = 0;
        int i12 = 3;
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f11927x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (O()) {
            i10 += J();
            if (!this.N) {
                return i10;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            i10 = i10 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            i10 += arrayList4.size() + 1;
        }
        int size = this.f11920s.size();
        y yVar = this.f11910j0;
        int size2 = yVar.d.size();
        int i13 = i10 + size + size2;
        int size3 = yVar.e.size();
        if (size3 > 3 && this.G0) {
            size3 = 3;
        }
        int size4 = this.K.size() + size3;
        int size5 = yVar.f11825j.size();
        if (size5 > 3 && this.H0) {
            size5 = 3;
        }
        if (size + size2 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i13++;
        }
        if (size4 != 0) {
            i13 += size4 + 1;
        }
        if (size5 != 0) {
            i13 += size5;
        }
        ArrayList arrayList5 = this.H;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i13 += size6 + 1 + (!this.X ? 1 : 0);
        }
        if (!this.X) {
            this.Y = i13;
        }
        ArrayList arrayList6 = this.I;
        int size7 = arrayList6.size();
        if ((this.f11901c != e0.All || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i12 = 1;
            }
            size7 = i12;
        }
        if (arrayList5.isEmpty() || this.X) {
            i11 = size7;
        }
        if (i11 != 0) {
            i13 += i11 + 1 + (!this.W ? 1 : 0);
        }
        if (this.X) {
            this.Y = i13;
        }
        this.B0 = i13;
        return i13;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: hg.h0.j(int):int");
    }

    @Override
    public final void v(s4.b1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: hg.h0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xa1 xa1Var;
        TextView textView;
        boolean z10;
        int i11 = this.f11908h0;
        boolean z11 = false;
        Context context = this.e;
        switch (i10) {
            case 0:
                i6 i6Var = new i6(context, null);
                if (i11 == 3) {
                    z11 = true;
                }
                i6Var.f22519l0 = z11;
                xa1Var = i6Var;
                textView = xa1Var;
                break;
            case 1:
                textView = new u3(context, null);
                break;
            case 2:
            case 9:
                textView = new z(0, context, true);
                break;
            case 3:
                textView = new qa(context);
                break;
            case 4:
                b10 b10Var = new b10(context, null);
                b10Var.setViewType(1);
                b10Var.setIsSingleCell(true);
                textView = b10Var;
                break;
            case 5:
                TextView textView2 = new TextView(context);
                textView2.setGravity(16);
                textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                textView2.setTextSize(1, 17.0f);
                r6.W(textView2, k6.G6, null);
                textView = textView2;
                break;
            case 6:
                xa1 xa1Var2 = new xa1(context, 2, null);
                r6.m(xa1Var2, 20, k6.f21272i6, null);
                xa1Var2.setTag(9);
                xa1Var2.setItemAnimator(null);
                xa1Var2.setLayoutAnimation(null);
                a0 a0Var = new a0(0);
                a0Var.j1(0);
                xa1Var2.setLayoutManager(a0Var);
                if (i11 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xa1Var2.setAdapter(new b0(this.f11921s0, this.e, null, false, z10));
                xa1Var2.setOnItemClickListener(new xa(this, 13));
                xa1Var2.setOnItemLongClickListener(new w(this));
                this.f11911k0 = xa1Var2;
                xa1Var = xa1Var2;
                textView = xa1Var;
                break;
            case 7:
            default:
                textView = new r8(16, context, false);
                break;
            case 8:
                textView = new i6(context, null);
                break;
            case 10:
                v vVar = new v(this, 1);
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                w9 w9Var = new w9(context);
                w9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
                linearLayout.addView(w9Var, z5.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 17.0f);
                int i12 = k6.G6;
                r6.W(textView3, i12, null);
                textView3.setTypeface(AndroidUtilities.bold());
                sl.m(R.string.SearchMessagesFilterEmptyTitle, textView3, 17);
                linearLayout.addView(textView3, z5.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView4 = new TextView(context);
                linearLayout.f11858a = textView4;
                textView4.setTextSize(1, 14.0f);
                r6.W(textView4, i12, null);
                textView4.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView4.setGravity(17);
                linearLayout.addView(textView4, z5.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView5 = new TextView(context);
                textView5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView5.setTextSize(1, 14.0f);
                textView5.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i13 = k6.Oh;
                r6.W(textView5, i13, null);
                int o12 = k6.o1(0.15f, k6.x0(null, i13, false));
                org.telegram.ui.Cells.y j02 = k6.j0(6, 6, 6, 6, 0, o12, o12);
                n6 M = r6.M(0.15f, i13);
                textView5.setBackground(j02);
                r6.k(textView5, j02, null, M, null);
                textView5.setOnClickListener(new ah.g0(vVar, 29));
                linearLayout.addView(textView5, z5.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = linearLayout;
                textView4.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.Z));
                textView = linearLayout;
                break;
        }
        if (i10 == 5) {
            textView.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            textView.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(textView);
    }
}
