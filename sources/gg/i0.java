package gg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.y8;
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
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.dy;
import org.telegram.ui.l10;
import org.telegram.ui.ry;
import org.telegram.ui.wb1;
import w7.x5;
public abstract class i0 extends ll0 {
    public l10 A0;
    public int B0;
    public int C0;
    public int D0;
    public e0 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public dy U;
    public final int V;
    public boolean W;
    public boolean X;
    public String Z;
    public int f9744a0;
    public String f9745b0;
    public int f9747c0;
    public boolean d;
    public int f9748d0;
    public final Context e;
    public int f9749e0;
    public v f9750f;
    public int f9751f0;
    public int f9752g0;
    public v h;
    public final int f9753h0;
    public final s4.j f9754i0;
    public final z f9755j0;
    public wb1 f9756k0;
    public final long f9757l0;
    public long f9759n0;
    public View f9760o0;
    public y8 f9761p0;
    public ArrayList f9762q0;
    public ai.s1 f9763r;
    public final ry f9764r0;
    public final int f9766s0;
    public ArrayList f9767t0;
    public final ArrayList f9768u0;
    public int v;
    public final ArrayList f9769v0;
    public int f9770w;
    public String f9771w0;
    public a0.i f9773x0;
    public String f9774y;
    public final ArrayList f9775y0;
    public boolean f9776z0;
    public f0 f9746c = f0.All;
    public int f9758n = -1;
    public ArrayList f9765s = new ArrayList();
    public final ArrayList f9772x = new ArrayList();
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

    public i0(Context context, ry ryVar, int i10, int i11, s4.j jVar, boolean z10) {
        int i12 = UserConfig.selectedAccount;
        this.f9766s0 = i12;
        this.f9767t0 = new ArrayList();
        this.f9768u0 = new ArrayList();
        this.f9769v0 = new ArrayList();
        this.f9771w0 = null;
        this.f9773x0 = new a0.i();
        this.f9775y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.f9754i0 = jVar;
        this.f9764r0 = ryVar;
        rn0 rn0Var = (rn0) this;
        z zVar = new z(rn0Var);
        this.f9755j0 = zVar;
        zVar.f9672a = new a6.m(rn0Var, 22);
        zVar.f9684p = z10;
        this.e = context;
        this.V = i10;
        this.f9753h0 = i11;
        this.f9757l0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new n(i12, i11, new y(this), 0));
        }
        MediaDataController.getInstance(i12).loadHints(true);
    }

    public static boolean Y(String str, String str2) {
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
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 1 && i10 != 4 && i10 != 10) {
            return true;
        }
        return false;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.N;
        ArrayList arrayList = this.f9768u0;
        ArrayList arrayList2 = this.f9769v0;
        String str = null;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                h0 h0Var = (h0) arrayList2.remove(0);
                this.f9767t0.remove(h0Var);
                arrayList.remove(h0Var);
                this.f9773x0.l(h0Var.f9738c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(h0Var.f9738c);
                } else {
                    sb2.append(", ");
                    sb2.append(h0Var.f9738c);
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
            this.f9767t0.clear();
            this.f9773x0.b();
            sb2 = new StringBuilder("1");
        }
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f9766s0).getStorageQueue().postRunnable(new y8(28, (rn0) this, sb2));
    }

    public final boolean F(Object obj) {
        if (this.f9753h0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        ry ryVar = this.f9764r0;
        if (z10) {
            if (((TLRPC.User) obj).bot) {
                return ryVar.A2;
            }
            return ryVar.f37084z2;
        } else if (!(obj instanceof TLRPC.Chat)) {
            return false;
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (ChatObject.isChannel(chat)) {
                return ryVar.f37081y2;
            }
            if (ChatObject.isMegagroup(chat)) {
                if (ryVar.f37065v2 || ryVar.f37071w2) {
                    return true;
                }
                return false;
            } else if (ryVar.f37065v2 || ryVar.f37076x2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void G(String str) {
        dy dyVar;
        String str2;
        String str3;
        this.f9771w0 = str;
        ArrayList arrayList = this.f9769v0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.f9768u0;
            arrayList2.clear();
            int size = this.f9767t0.size();
            for (int i10 = 0; i10 < size; i10++) {
                dy dyVar2 = this.U;
                if ((dyVar2 == null || dyVar2.a() != ((h0) this.f9767t0.get(i10)).f9738c) && F(((h0) this.f9767t0.get(i10)).f9736a)) {
                    arrayList2.add((h0) this.f9767t0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.f9767t0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h0 h0Var = (h0) this.f9767t0.get(i11);
            if (h0Var != null && h0Var.f9736a != null && (((dyVar = this.U) == null || dyVar.a() != h0Var.f9738c) && F(((h0) this.f9767t0.get(i11)).f9736a))) {
                TLObject tLObject = h0Var.f9736a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (chat.monoforum) {
                        str2 = ng.d.i(chat, this.f9766s0, false);
                    } else {
                        str2 = chat.title;
                    }
                    str3 = ((TLRPC.Chat) h0Var.f9736a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) h0Var.f9736a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(h0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(f0 f0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(f0Var.f9715c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new pq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final wb1 I() {
        return this.f9756k0;
    }

    public final Object J(int i10) {
        int size;
        int i11;
        int size2;
        ArrayList arrayList;
        int i12;
        TLRPC.Chat chat;
        int i13;
        ArrayList arrayList2 = this.f9772x;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList2.size()) {
                return arrayList2.get(i13);
            }
            i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList2);
        }
        ArrayList arrayList3 = this.J;
        if (!arrayList3.isEmpty()) {
            if (i10 > 0) {
                return arrayList3.get(i10 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            if (this.N) {
                arrayList = this.f9769v0;
            } else {
                arrayList = this.f9768u0;
            }
            if (i10 > M && (i12 = (i10 - 1) - (M == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((h0) arrayList.get(i12)).f9736a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i14 = this.f9766s0;
                if (z10) {
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.User) tLObject).f18230id));
                    if (user != null) {
                        return user;
                    }
                    return tLObject;
                } else if ((tLObject instanceof TLRPC.Chat) && (chat = MessagesController.getInstance(i14).getChat(Long.valueOf(((TLRPC.Chat) tLObject).f18083id))) != null) {
                    return chat;
                } else {
                    return tLObject;
                }
            }
            i10 -= K();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList5);
        }
        z zVar = this.f9755j0;
        ArrayList arrayList6 = zVar.e;
        ArrayList arrayList7 = zVar.d;
        ArrayList arrayList8 = zVar.f9678j;
        int size3 = this.f9765s.size();
        int size4 = arrayList7.size();
        if (size3 + size4 > 0 && (K() > 0 || !arrayList4.isEmpty() || !arrayList2.isEmpty())) {
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
            return this.f9765s.get(i10);
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

    public final int K() {
        ArrayList arrayList;
        int i10;
        if (this.N) {
            arrayList = this.f9769v0;
        } else {
            arrayList = this.f9768u0;
        }
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        return (M() ? 1 : 0) + i10;
    }

    public final int L() {
        int i10 = 0;
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.f9772x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (P()) {
            i10 += K();
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
        int size = this.f9765s.size();
        int size2 = this.f9755j0.d.size();
        int i11 = i10 + size + size2;
        if (size + size2 > 0) {
            if (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                return i11 + 1;
            }
            return i11;
        }
        return i11;
    }

    public final boolean M() {
        if (!this.N && !MediaDataController.getInstance(this.f9766s0).hints.isEmpty()) {
            if (this.f9753h0 != 14 || this.f9764r0.f37084z2) {
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

    public final boolean O(int i10) {
        int size;
        int i11;
        int i12;
        int size2;
        ArrayList arrayList;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList2 = this.f9772x;
            if (!arrayList2.isEmpty()) {
                i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList2);
            }
            if (P()) {
                ?? M = M();
                if (this.N) {
                    arrayList = this.f9769v0;
                } else {
                    arrayList = this.f9768u0;
                }
                if (i10 <= M || (i10 - 1) - (M == true ? 1 : 0) >= arrayList.size()) {
                    i10 -= K();
                }
            }
            z zVar = this.f9755j0;
            ArrayList arrayList3 = zVar.e;
            ArrayList arrayList4 = zVar.d;
            int size3 = this.f9765s.size();
            int size4 = arrayList4.size();
            int size5 = zVar.f9678j.size();
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
            if (size3 + size4 > 0 && (K() > 0 || !this.F.isEmpty() || !arrayList2.isEmpty())) {
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
                    if (this.f9746c != f0.All || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        if (this.V != 2 && N()) {
            return true;
        }
        return false;
    }

    public final void Q() {
        if ((this.Q != 0 && this.O != 0) || this.f9752g0 != this.f9748d0) {
            return;
        }
        dy dyVar = this.U;
        if (dyVar != null && dyVar.a() != 0 && !this.X) {
            V(this.f9752g0, this.Z);
            return;
        }
        W(this.f9752g0, this.Z);
    }

    public final void R(long j3, TLObject tLObject) {
        h0 h0Var;
        String str;
        h0 h0Var2 = (h0) this.f9773x0.f(j3);
        if (h0Var2 == null) {
            Object obj = new Object();
            this.f9773x0.k(obj, j3);
            h0Var = obj;
        } else {
            this.f9767t0.remove(h0Var2);
            h0Var = h0Var2;
        }
        this.f9767t0.add(0, h0Var);
        h0Var.f9738c = j3;
        h0Var.f9736a = tLObject;
        h0Var.f9737b = (int) (System.currentTimeMillis() / 1000);
        String str2 = this.M;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        G(str);
        l();
        MessagesStorage.getInstance(this.f9766s0).getStorageQueue().postRunnable(new q((rn0) this, j3, 1));
    }

    public final boolean S() {
        int i10 = this.f9753h0;
        if (i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 1 && i10 != 11 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void T() {
        int L;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (L = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(L + 1, size);
            int size2 = this.f9755j0.e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(L);
            }
        }
    }

    public final void U(int r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: gg.i0.U(int, java.lang.String):void");
    }

    public final void V(int i10, String str) {
        dy dyVar = this.U;
        if (dyVar != null && dyVar.a() != 0 && this.V != 0) {
            if (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str)) {
                int i11 = this.Q;
                int i12 = this.f9766s0;
                if (i11 != 0) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.Q, true);
                    this.Q = 0;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                ArrayList arrayList = this.H;
                if (isEmpty) {
                    this.f9771w0 = null;
                    this.I.clear();
                    arrayList.clear();
                    this.T = 0;
                    this.Z = null;
                    this.N = false;
                    l();
                } else if (this.f9753h0 != 15) {
                    long a2 = this.U.a();
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.limit = 20;
                    tL_messages_search.f18192q = str;
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

    public final void W(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.V != 0 && (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str))) {
            int i11 = this.O;
            int i12 = this.f9766s0;
            boolean z13 = false;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.O, true);
                this.O = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.I;
            if (!isEmpty && this.U.a() == 0) {
                G(str);
                this.f9755j0.f(this.f9765s, this.f9769v0);
                if (this.f9753h0 == 15) {
                    int i13 = this.D0 - 1;
                    this.D0 = i13;
                    dy dyVar = this.U;
                    if (dyVar != null) {
                        if (i13 > 0) {
                            z13 = true;
                        }
                        dyVar.d(z13, true);
                        this.U.c();
                    }
                } else {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    int i14 = this.f9746c.f9713a;
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
                    tL_messages_searchGlobal.f18194q = str;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.flags |= 1;
                    tL_messages_searchGlobal.folder_id = this.C0;
                    if (!str.equals(this.Z)) {
                        this.d = false;
                    }
                    if (str.equals(this.Z) && this.f9744a0 == this.f9746c.f9713a && !arrayList.isEmpty() && this.f9752g0 == this.f9748d0) {
                        MessageObject messageObject = (MessageObject) hg.c.h(1, arrayList);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = this.f9747c0;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    this.Z = str;
                    this.f9744a0 = this.f9746c.f9713a;
                    int i15 = this.P + 1;
                    this.P = i15;
                    this.O = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new r(this, str, i15, i10, tL_messages_searchGlobal, 1), 2);
                }
            } else {
                this.f9771w0 = null;
                arrayList.clear();
                this.H.clear();
                this.P = 0;
                this.Z = null;
                this.f9744a0 = 0;
                this.N = false;
                l();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        dy dyVar = this.U;
        if (dyVar != null && dyVar.a() != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.f9766s0).getTopicsController().getTopics(-this.U.a());
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
        ArrayList arrayList = this.f9772x;
        if (!arrayList.isEmpty()) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + i10;
        }
        if (P()) {
            i10 += K();
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
        int size = this.f9765s.size();
        z zVar = this.f9755j0;
        int size2 = zVar.d.size();
        int i13 = i10 + size + size2;
        int size3 = zVar.e.size();
        if (size3 > 3 && this.G0) {
            size3 = 3;
        }
        int size4 = this.K.size() + size3;
        int size5 = zVar.f9678j.size();
        if (size5 > 3 && this.H0) {
            size5 = 3;
        }
        if (size + size2 > 0 && (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
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
        if ((this.f9746c != f0.All || this.d) && arrayList6.isEmpty()) {
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
        throw new UnsupportedOperationException("Method not decompiled: gg.i0.j(int):int");
    }

    @Override
    public final void v(s4.c1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: gg.i0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        wb1 wb1Var;
        TextView textView;
        boolean z10;
        int i11 = this.f9753h0;
        boolean z11 = true;
        Context context = this.e;
        switch (i10) {
            case 0:
                i6 i6Var = new i6(context, null);
                if (i11 != 3) {
                    z11 = false;
                }
                i6Var.f20203l0 = z11;
                wb1Var = i6Var;
                textView = wb1Var;
                break;
            case 1:
                textView = new v3(context, null);
                break;
            case 2:
            case 9:
                textView = new a0(0, context, true);
                break;
            case 3:
                textView = new ua(context);
                break;
            case 4:
                u00 u00Var = new u00(context, null);
                u00Var.setViewType(1);
                u00Var.setIsSingleCell(true);
                textView = u00Var;
                break;
            case 5:
                TextView textView2 = new TextView(context);
                textView2.setGravity(16);
                textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                textView2.setTextSize(1, 17.0f);
                textView2.setTextColor(h6.w0(null, h6.G6, false));
                textView = textView2;
                break;
            case 6:
                wb1 wb1Var2 = new wb1(context, 2, null);
                wb1Var2.setSelectorDrawableColor(h6.w0(null, h6.f18878i6, false));
                wb1Var2.setTag(9);
                wb1Var2.setItemAnimator(null);
                wb1Var2.setLayoutAnimation(null);
                b0 b0Var = new b0(0);
                b0Var.j1(0);
                wb1Var2.setLayoutManager(b0Var);
                if (i11 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wb1Var2.setAdapter(new c0(this.f9766s0, this.e, null, false, z10));
                wb1Var2.setOnItemClickListener(new ai.g(this, 9));
                wb1Var2.setOnItemLongClickListener(new y(this));
                this.f9756k0 = wb1Var2;
                wb1Var = wb1Var2;
                textView = wb1Var;
                break;
            case 7:
            default:
                textView = new s8(16, context, false);
                break;
            case 8:
                textView = new i6(context, null);
                break;
            case 10:
                w wVar = new w(this, 1);
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                w9 w9Var = new w9(context);
                w9Var.setImageDrawable(new yi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
                linearLayout.addView(w9Var, x5.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 17.0f);
                int i12 = h6.G6;
                textView3.setTextColor(h6.w0(null, i12, false));
                textView3.setTypeface(AndroidUtilities.bold());
                ul.l(R.string.SearchMessagesFilterEmptyTitle, textView3, 17);
                linearLayout.addView(textView3, x5.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView4 = new TextView(context);
                linearLayout.f9704a = textView4;
                textView4.setTextSize(1, 14.0f);
                textView4.setTextColor(h6.w0(null, i12, false));
                textView4.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView4.setGravity(17);
                linearLayout.addView(textView4, x5.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView5 = new TextView(context);
                textView5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView5.setTextSize(1, 14.0f);
                textView5.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i13 = h6.Oh;
                textView5.setTextColor(h6.w0(null, i13, false));
                int l1 = h6.l1(0.15f, h6.w0(null, i13, false));
                textView5.setBackground(h6.i0(6, 6, 6, 6, 0, l1, l1));
                textView5.setOnClickListener(new ai.v0(wVar, 21));
                linearLayout.addView(textView5, x5.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = linearLayout;
                textView4.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.Z));
                textView = linearLayout;
                break;
        }
        if (i10 == 5) {
            textView.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            textView.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(textView);
    }
}
