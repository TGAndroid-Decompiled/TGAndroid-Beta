package of;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import java.util.HashSet;
import kh.o8;
import kh.x8;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.dy;
import org.telegram.ui.ox;
import org.telegram.ui.va1;
import org.telegram.ui.w00;
public abstract class f0 extends vk0 {
    public b0 A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public String I;
    public boolean J;
    public int L;
    public String N;
    public int O;
    public int P;
    public ox Q;
    public final int R;
    public boolean S;
    public boolean T;
    public String V;
    public int W;
    public String X;
    public int Y;
    public int Z;
    public int f19286a0;
    public int f19287b0;
    public int f19289c0;
    public boolean d;
    public final int f19290d0;
    public final Context f19291e;
    public final f2.n f19292e0;
    public s f19293f;
    public final w f19294f0;
    public va1 f19295g0;
    public s h;
    public final long f19296h0;
    public long f19298j0;
    public View f19299k0;
    public o8 f19300l0;
    public ArrayList m0;
    public final dy f19302n0;
    public final int f19303o0;
    public ArrayList f19304p0;
    public final ArrayList f19305q0;
    public d5.i f19306r;
    public final ArrayList f19307r0;
    public String f19309s0;
    public a0.h f19310t0;
    public final ArrayList f19311u0;
    public int v;
    public boolean f19312v0;
    public int f19313w;
    public w00 f19314w0;
    public int f19316x0;
    public String f19317y;
    public int f19318y0;
    public int f19319z0;
    public c0 f19288c = c0.All;
    public int f19301n = -1;
    public ArrayList f19308s = new ArrayList();
    public final ArrayList f19315x = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashSet H = new HashSet();
    public int K = 0;
    public int M = 0;
    public int U = -1;
    public boolean f19297i0 = false;

    public f0(Context context, dy dyVar, int i9, int i10, f2.n nVar, boolean z10) {
        int i11 = UserConfig.selectedAccount;
        this.f19303o0 = i11;
        this.f19304p0 = new ArrayList();
        this.f19305q0 = new ArrayList();
        this.f19307r0 = new ArrayList();
        this.f19309s0 = null;
        this.f19310t0 = new a0.h();
        this.f19311u0 = new ArrayList();
        this.B0 = -1;
        this.C0 = true;
        this.D0 = true;
        this.f19292e0 = nVar;
        this.f19302n0 = dyVar;
        an0 an0Var = (an0) this;
        w wVar = new w(an0Var);
        this.f19294f0 = wVar;
        wVar.f19524a = new n5.e0(an0Var, 6);
        wVar.f19537p = z10;
        this.f19291e = context;
        this.R = i9;
        this.f19290d0 = i10;
        this.f19296h0 = UserConfig.getInstance(i11).getClientUserId();
        if (i10 != 15) {
            MessagesStorage.getInstance(i11).getStorageQueue().postRunnable(new h3.y(i11, i10, new v(this), 2));
        }
        MediaDataController.getInstance(i11).loadHints(true);
    }

    public static boolean Y(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i9 = 0; i9 < split.length; i9++) {
                String str3 = split[i9];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i9]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 1 && i9 != 4 && i9 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.J;
        ArrayList arrayList = this.f19305q0;
        ArrayList arrayList2 = this.f19307r0;
        String str = null;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                e0 e0Var = (e0) arrayList2.remove(0);
                this.f19304p0.remove(e0Var);
                arrayList.remove(e0Var);
                this.f19310t0.l(e0Var.f19281c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(e0Var.f19281c);
                } else {
                    sb2.append(", ");
                    sb2.append(e0Var.f19281c);
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
            this.f19304p0.clear();
            this.f19310t0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.I;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f19303o0).getStorageQueue().postRunnable(new o8(16, (an0) this, sb2));
    }

    public final boolean F(Object obj) {
        if (this.f19290d0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        dy dyVar = this.f19302n0;
        if (z10) {
            if (((TLRPC.User) obj).bot) {
                return dyVar.f37742w2;
            }
            return dyVar.f37737v2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (ChatObject.isChannel(chat)) {
                return dyVar.f37733u2;
            }
            if (ChatObject.isMegagroup(chat)) {
                if (dyVar.f37718r2 || dyVar.f37724s2) {
                    return true;
                }
                return false;
            } else if (dyVar.f37718r2 || dyVar.f37729t2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        ox oxVar;
        String str2;
        String str3;
        this.f19309s0 = str;
        ArrayList arrayList = this.f19307r0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f19305q0;
            arrayList2.clear();
            int size = this.f19304p0.size();
            for (int i9 = 0; i9 < size; i9++) {
                ox oxVar2 = this.Q;
                if ((oxVar2 == null || oxVar2.a() != ((e0) this.f19304p0.get(i9)).f19281c) && F(((e0) this.f19304p0.get(i9)).f19279a)) {
                    arrayList2.add((e0) this.f19304p0.get(i9));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f19304p0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            e0 e0Var = (e0) this.f19304p0.get(i10);
            if (e0Var != null && e0Var.f19279a != null && (((oxVar = this.Q) == null || oxVar.a() != e0Var.f19281c) && F(((e0) this.f19304p0.get(i10)).f19279a))) {
                TLObject tLObject = e0Var.f19279a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = vf.c.i(chat, this.f19303o0, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) e0Var.f19279a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) e0Var.f19279a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(e0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(c0 c0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(c0Var.f19264c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new eq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final va1 I() {
        return this.f19295g0;
    }

    public final Object J(int i9) {
        int size;
        int i10;
        int size2;
        ArrayList arrayList;
        int i11;
        TLRPC.Chat chat;
        int i12;
        ArrayList arrayList2 = this.f19315x;
        if (!arrayList2.isEmpty()) {
            if (i9 > 0 && i9 - 1 < arrayList2.size()) {
                return arrayList2.get(i12);
            }
            i9 = j3.r0.g(1, i9, arrayList2);
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            if (i9 > 0) {
                return arrayList3.get(i9 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            if (this.J) {
                arrayList = this.f19307r0;
            } else {
                arrayList = this.f19305q0;
            }
            if (i9 > M && (i11 = (i9 - 1) - (M == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((e0) arrayList.get(i11)).f19279a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i13 = this.f19303o0;
                if (z10) {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.User) tLObject).f22527id));
                    if (user != null) {
                        return user;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (chat = MessagesController.getInstance(i13).getChat(Long.valueOf(((TLRPC.Chat) tLObject).f22380id))) != null) {
                    return chat;
                } else {
                    return tLObject;
                }
            }
            i9 -= K();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            if (i9 > 0 && i9 <= arrayList4.size()) {
                return arrayList4.get(i9 - 1);
            }
            i9 = j3.r0.g(1, i9, arrayList4);
        }
        ArrayList arrayList5 = this.A;
        if (!arrayList5.isEmpty()) {
            if (i9 > 0 && i9 <= arrayList5.size()) {
                return arrayList5.get(i9 - 1);
            }
            i9 = j3.r0.g(1, i9, arrayList5);
        }
        w wVar = this.f19294f0;
        ArrayList arrayList6 = wVar.f19527e;
        ArrayList arrayList7 = wVar.d;
        ArrayList arrayList8 = wVar.f19531j;
        int size3 = this.f19308s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (K() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
            if (i9 != 0) {
                i9--;
            } else {
                return null;
            }
        }
        int size5 = arrayList8.size();
        int i14 = 3;
        if (size5 > 3 && this.D0) {
            size5 = 3;
        }
        int size6 = arrayList6.size();
        if (size6 <= 3 || !this.C0) {
            i14 = size6;
        }
        boolean isEmpty = arrayList6.isEmpty();
        int i15 = 0;
        ArrayList arrayList9 = this.G;
        if (isEmpty && arrayList9.isEmpty()) {
            size = 0;
        } else {
            size = arrayList9.size() + i14 + 1;
        }
        if (i9 >= 0 && i9 < size3) {
            return this.f19308s.get(i9);
        }
        int i16 = i9 - size3;
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
        ArrayList arrayList10 = this.D;
        if (arrayList10.isEmpty()) {
            size2 = 0;
        } else {
            size2 = arrayList10.size() + 1;
        }
        if (i10 > 0 && i10 <= arrayList10.size()) {
            return arrayList10.get(i10 - 1);
        }
        if (!this.T && !arrayList10.isEmpty()) {
            i15 = 1;
        }
        int i20 = i10 - (size2 + i15);
        ArrayList arrayList11 = this.E;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i20 > 0 && i20 <= arrayList11.size()) {
            return arrayList11.get(i20 - 1);
        }
        return null;
    }

    public final int K() {
        ArrayList arrayList;
        int i9;
        if (this.J) {
            arrayList = this.f19307r0;
        } else {
            arrayList = this.f19305q0;
        }
        if (!arrayList.isEmpty()) {
            i9 = arrayList.size() + 1;
        } else {
            i9 = 0;
        }
        return (M() ? 1 : 0) + i9;
    }

    public final int L() {
        int i9 = 0;
        if (this.f19319z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f19315x;
        if (!arrayList.isEmpty()) {
            i9 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i9;
        }
        if (P()) {
            i9 += K();
            if (!this.J) {
                return i9;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            i9 = i9 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            i9 += arrayList4.size() + 1;
        }
        int size = this.f19308s.size();
        int size2 = this.f19294f0.d.size();
        int i10 = i9 + size + size2;
        if (size + size2 > 0) {
            if (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    public final boolean M() {
        if (!this.J && !MediaDataController.getInstance(this.f19303o0).hints.isEmpty()) {
            if (this.f19290d0 != 14 || this.f19302n0.f37737v2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean N() {
        if (S() && K() > 0) {
            return true;
        }
        return false;
    }

    public final boolean O(int i9) {
        int size;
        int i10;
        int i11;
        int size2;
        ArrayList arrayList;
        if (this.J && this.F.isEmpty()) {
            ArrayList arrayList2 = this.f19315x;
            if (!arrayList2.isEmpty()) {
                i9 = j3.r0.g(1, i9, arrayList2);
            }
            if (P()) {
                ?? M = M();
                if (this.J) {
                    arrayList = this.f19307r0;
                } else {
                    arrayList = this.f19305q0;
                }
                if (i9 <= M || (i9 - 1) - (M == true ? 1 : 0) >= arrayList.size()) {
                    i9 -= K();
                }
            }
            w wVar = this.f19294f0;
            ArrayList arrayList3 = wVar.f19527e;
            ArrayList arrayList4 = wVar.d;
            int size3 = this.f19308s.size();
            int size4 = arrayList4.size();
            int size5 = wVar.f19531j.size();
            int i12 = 3;
            if (size5 > 3 && this.D0) {
                size5 = 3;
            }
            int size6 = arrayList3.size();
            if (size6 <= 3 || !this.C0) {
                i12 = size6;
            }
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.G;
            if (isEmpty && arrayList5.isEmpty()) {
                size = 0;
            } else {
                size = arrayList5.size() + i12 + 1;
            }
            int size7 = this.A.size();
            if (size7 > 0) {
                if (i9 < 0 || i9 >= size7) {
                    i9 -= size7 + 1;
                }
            }
            if (size3 + size4 > 0 && (K() > 0 || !this.B.isEmpty() || !arrayList2.isEmpty())) {
                if (i9 != 0) {
                    i9--;
                }
            }
            if ((i9 < 0 || i9 >= size3) && (((i10 = i9 - size3) < 0 || i10 >= size4) && ((i11 = i10 - size4) <= 0 || i11 >= size5))) {
                int i13 = i11 - size5;
                if (i13 > 0 && i13 < size) {
                    return true;
                }
                int i14 = i13 - size;
                ArrayList arrayList6 = this.D;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i14 <= 0 || i14 >= size2) {
                    ArrayList arrayList7 = this.E;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.f19288c != c0.All || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        if (this.R != 2 && N()) {
            return true;
        }
        return false;
    }

    public final void Q() {
        if ((this.M != 0 && this.K != 0) || this.f19289c0 != this.Z) {
            return;
        }
        ox oxVar = this.Q;
        if (oxVar != null && oxVar.a() != 0 && !this.T) {
            V(this.f19289c0, this.V);
            return;
        }
        W(this.f19289c0, this.V);
    }

    public final void R(long j10, TLObject tLObject) {
        e0 e0Var;
        String str;
        e0 e0Var2 = (e0) this.f19310t0.f(j10);
        if (e0Var2 == null) {
            Object obj = new Object();
            this.f19310t0.k(obj, j10);
            e0Var = obj;
        } else {
            this.f19304p0.remove(e0Var2);
            e0Var = e0Var2;
        }
        this.f19304p0.add(0, e0Var);
        e0Var.f19281c = j10;
        e0Var.f19279a = tLObject;
        e0Var.f19280b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.I;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f19303o0).getStorageQueue().postRunnable(new p((an0) this, j10, 1));
    }

    public final boolean S() {
        int i9 = this.f19290d0;
        if (i9 != 2 && i9 != 4 && i9 != 5 && i9 != 6 && i9 != 1 && i9 != 11 && i9 != 15) {
            return true;
        }
        return false;
    }

    public final void T() {
        int L;
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty() && (L = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(L + 1, size);
            int size2 = this.f19294f0.f19527e.size();
            if (this.C0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(L);
            }
        }
    }

    public final void U(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: of.f0.U(int, java.lang.String):void");
    }

    public final void V(int i9, String str) {
        ox oxVar = this.Q;
        if (oxVar != null && oxVar.a() != 0 && this.R != 0) {
            if (!TextUtils.isEmpty(this.V) || !TextUtils.isEmpty(str)) {
                int i10 = this.M;
                int i11 = this.f19303o0;
                if (i10 != 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.M, true);
                    this.M = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.D;
                if (isEmpty) {
                    this.f19309s0 = null;
                    this.E.clear();
                    arrayList.clear();
                    this.P = 0;
                    this.V = null;
                    this.J = false;
                    l();
                } else if (this.f19290d0 != 15) {
                    long a2 = this.Q.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f22489q = str;
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = MessagesController.getInstance(i11).getInputPeer(a2);
                    if (str.equals(this.V) && !arrayList.isEmpty()) {
                        tL_messages_search.add_offset = arrayList.size();
                    }
                    this.V = str;
                    int i12 = 1 + this.P;
                    this.P = i12;
                    this.M = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new q(this, str, i12, i9, tL_messages_search, 0), 2);
                }
            }
        }
    }

    public final void W(int i9, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.R != 0 && (!TextUtils.isEmpty(this.V) || !TextUtils.isEmpty(str))) {
            int i10 = this.K;
            int i11 = this.f19303o0;
            boolean z13 = false;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.K, true);
                this.K = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.E;
            if (!isEmpty && this.Q.a() == 0) {
                G(str);
                this.f19294f0.f(this.f19308s, this.f19307r0);
                if (this.f19290d0 == 15) {
                    int i12 = this.f19319z0 - 1;
                    this.f19319z0 = i12;
                    ox oxVar = this.Q;
                    if (oxVar != null) {
                        if (i12 > 0) {
                            z13 = true;
                        }
                        oxVar.d(z13, true);
                        this.Q.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i13 = this.f19288c.f19262a;
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
                    tL_messages_searchGlobal.f22491q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.f19318y0;
                    if (!str.equals(this.V)) {
                        this.d = false;
                    }
                    if (str.equals(this.V) && this.W == this.f19288c.f19262a && !arrayList.isEmpty() && this.f19289c0 == this.Z) {
                        MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = this.Y;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i11).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.V = str;
                    this.W = this.f19288c.f19262a;
                    int i14 = this.L + 1;
                    this.L = i14;
                    this.K = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new q(this, str, i14, i9, tL_messages_searchGlobal, 1), 2);
                }
            } else {
                this.f19309s0 = null;
                arrayList.clear();
                this.D.clear();
                this.L = 0;
                this.V = null;
                this.W = 0;
                this.J = false;
                l();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.B;
        arrayList.clear();
        ox oxVar = this.Q;
        if (oxVar != null && oxVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f19303o0).getTopicsController().getTopics(-this.Q.a());
                String trim = str.trim();
                for (int i9 = 0; i9 < topics.size(); i9++) {
                    if (topics.get(i9) != null && topics.get(i9).title.toLowerCase().contains(trim)) {
                        arrayList.add(topics.get(i9));
                        topics.get(i9).searchQuery = trim;
                    }
                }
            }
            l();
        }
    }

    @Override
    public final int h() {
        int i9;
        int i10 = 0;
        int i11 = 3;
        if (this.f19319z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f19315x;
        if (!arrayList.isEmpty()) {
            i9 = arrayList.size() + 1;
        } else {
            i9 = 0;
        }
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i9;
        }
        if (P()) {
            i9 += K();
            if (!this.J) {
                return i9;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            i9 = i9 + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            i9 += arrayList4.size() + 1;
        }
        int size = this.f19308s.size();
        w wVar = this.f19294f0;
        int size2 = wVar.d.size();
        int i12 = i9 + size + size2;
        int size3 = wVar.f19527e.size();
        if (size3 > 3 && this.C0) {
            size3 = 3;
        }
        int size4 = this.G.size() + size3;
        int size5 = wVar.f19531j.size();
        if (size5 > 3 && this.D0) {
            size5 = 3;
        }
        if (size + size2 > 0 && (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i12++;
        }
        if (size4 != 0) {
            i12 += size4 + 1;
        }
        if (size5 != 0) {
            i12 += size5;
        }
        ArrayList arrayList5 = this.D;
        int size6 = arrayList5.size();
        if (size6 != 0) {
            i12 += size6 + 1 + (!this.T ? 1 : 0);
        }
        if (!this.T) {
            this.U = i12;
        }
        ArrayList arrayList6 = this.E;
        int size7 = arrayList6.size();
        if ((this.f19288c != c0.All || this.d) && arrayList6.isEmpty()) {
            if (!this.d) {
                i11 = 1;
            }
            size7 = i11;
        }
        if (arrayList5.isEmpty() || this.T) {
            i10 = size7;
        }
        if (i10 != 0) {
            i12 += i10 + 1 + (!this.S ? 1 : 0);
        }
        if (this.T) {
            this.U = i12;
        }
        this.f19316x0 = i12;
        return i12;
    }

    @Override
    public final long i(int i9) {
        return i9;
    }

    @Override
    public final int j(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: of.f0.j(int):int");
    }

    @Override
    public final void v(f2.q1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: of.f0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10;
        va1 va1Var;
        int i10 = this.f19290d0;
        boolean z11 = true;
        Context context = this.f19291e;
        switch (i9) {
            case 0:
                h6 h6Var = new h6(context, null);
                if (i10 != 3) {
                    z11 = false;
                }
                h6Var.f24447h0 = z11;
                va1Var = h6Var;
                break;
            case 1:
                va1Var = new v3(context, null);
                break;
            case 2:
            case 9:
                va1Var = new x(0, context, true);
                break;
            case 3:
                va1Var = new pa(context);
                break;
            case 4:
                e00 e00Var = new e00(context, null);
                e00Var.setViewType(1);
                e00Var.setIsSingleCell(true);
                va1Var = e00Var;
                break;
            case 5:
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                textView.setTextSize(1, 17.0f);
                textView.setTextColor(f6.w0(null, f6.G6, false));
                va1Var = textView;
                break;
            case 6:
                va1 va1Var2 = new va1(context, 2, null);
                va1Var2.setSelectorDrawableColor(f6.w0(null, f6.f23092i6, false));
                va1Var2.setTag(9);
                va1Var2.setItemAnimator(null);
                va1Var2.setLayoutAnimation(null);
                y yVar = new y(0);
                yVar.j1(0);
                va1Var2.setLayoutManager(yVar);
                if (i10 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                va1Var2.setAdapter(new z(this.f19303o0, this.f19291e, null, false, z10));
                va1Var2.setOnItemClickListener(new eh.j(this, 16));
                va1Var2.setOnItemLongClickListener(new v(this));
                this.f19295g0 = va1Var2;
                va1Var = va1Var2;
                break;
            case 7:
            default:
                va1Var = new p8(16, context, false);
                break;
            case 8:
                va1Var = new h6(context, null);
                break;
            case 10:
                t tVar = new t(this, 1);
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                o9 o9Var = new o9(context);
                o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
                linearLayout.addView(o9Var, e6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 17.0f);
                int i11 = f6.G6;
                textView2.setTextColor(f6.w0(null, i11, false));
                textView2.setTypeface(AndroidUtilities.bold());
                ll.l(R.string.SearchMessagesFilterEmptyTitle, textView2, 17);
                linearLayout.addView(textView2, e6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView3 = new TextView(context);
                linearLayout.f19246a = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(f6.w0(null, i11, false));
                textView3.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView3.setGravity(17);
                linearLayout.addView(textView3, e6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView4 = new TextView(context);
                textView4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView4.setTextSize(1, 14.0f);
                textView4.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i12 = f6.Oh;
                textView4.setTextColor(f6.w0(null, i12, false));
                int l1 = f6.l1(0.15f, f6.w0(null, i12, false));
                textView4.setBackground(f6.i0(6, 6, 6, 6, 0, l1, l1));
                textView4.setOnClickListener(new x8(tVar, 9));
                linearLayout.addView(textView4, e6.t(-2, -2, 1, 0, 0, 0, 38));
                this.A0 = linearLayout;
                textView3.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.V));
                va1Var = linearLayout;
                break;
        }
        if (i9 == 5) {
            va1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(86.0f)));
        } else {
            va1Var.setLayoutParams(new f2.a1(-1, -2));
        }
        return new f2.q1(va1Var);
    }
}
