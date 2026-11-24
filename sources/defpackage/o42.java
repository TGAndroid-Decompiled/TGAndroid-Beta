package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o42 extends m59 {
    public sh4 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final p42 Y;
    public final Context r;
    public j42 w;
    public lx1 x;
    public long y;
    public ArrayList s = new ArrayList();
    public final ug4 I = new ug4(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final po V = new po(null);
    public final o1 X = new o1(this, (byte) 15);

    public o42(p42 p42Var, Context context) {
        this.Y = p42Var;
        this.r = context;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        if (i == 0) {
            return this.s.size();
        }
        int i2 = i - 1;
        ArrayList arrayList = this.Q;
        int i3 = 1;
        if (i2 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.R.get(arrayList.get(i2));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i2 == 0 && this.s.isEmpty()) {
            i3 = 0;
        }
        return size + i3;
    }

    @Override
    public final Object O(int i, int i2) {
        ArrayList arrayList;
        int i3;
        if (i == 0) {
            if (i2 < this.s.size()) {
                return this.s.get(i2);
            }
            return null;
        }
        int i4 = i - 1;
        ArrayList arrayList2 = this.Q;
        if (i4 < arrayList2.size() && (arrayList = (ArrayList) this.R.get(arrayList2.get(i4))) != null) {
            if (i4 == 0 && this.s.isEmpty()) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = i2 - i3;
            if (i5 >= 0 && i5 < arrayList.size()) {
                return arrayList.get(i5);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i == R() - 1) {
            return 3;
        }
        int i3 = i - 1;
        if (i3 < this.Q.size()) {
            if ((i3 != 0 || !this.s.isEmpty()) && i2 == 0) {
                return 0;
            }
            return 4;
        }
        return 2;
    }

    @Override
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override
    public final View T(int i, View view) {
        String e0;
        ylb ylbVar = this.Y.a;
        l55 l55Var = (l55) view;
        if (l55Var == null) {
            l55Var = new l55(this.r, ylbVar);
            l55Var.setBackgroundColor(cmb.v0(cmb.d7, ylbVar) & (-218103809));
        }
        if (i != 0 && (i != 1 || !this.s.isEmpty())) {
            int i2 = i - 1;
            ArrayList arrayList = this.Q;
            if (i2 < arrayList.size()) {
                l55Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.R.get((String) arrayList.get(i2));
                if (arrayList2 != null) {
                    k47 k47Var = (k47) arrayList2.get(0);
                    if (i2 == 0 && !this.s.isEmpty()) {
                        e0 = jb6.M0(2131749309, null);
                    } else {
                        e0 = jb6.e0(k47Var.k.date, false);
                    }
                    l55Var.setText(e0);
                }
            }
            return view;
        }
        l55Var.setAlpha(0.0f);
        return l55Var;
    }

    @Override
    public final void W(int i, int i2, u69 u69Var) {
        String e0;
        boolean z;
        int i3 = i2;
        int i4 = u69Var.f;
        View view = u69Var.a;
        if (i4 != 2 && i4 != 3) {
            HashMap hashMap = this.R;
            ArrayList arrayList = this.Q;
            boolean z2 = false;
            if (i4 != 0) {
                if (i4 == 1 || i4 == 4) {
                    ida idaVar = (ida) view;
                    if (i == 0) {
                        i42 i42Var = (i42) O(S(i3), Q(i3));
                        int i5 = i42Var.a;
                        if (i5 != 0) {
                            idaVar.d(i42Var.b, i42Var.c, null, null, i5, false);
                        } else {
                            idaVar.d(i42Var.b, i42Var.c, i42Var.d.toUpperCase().substring(0, Math.min(i42Var.d.length(), 4)), i42Var.e, 0, false);
                        }
                        File file = i42Var.f;
                        p42 p42Var = this.Y;
                        if (file != null) {
                            idaVar.b(p42Var.S.containsKey(file.toString()), !p42Var.V);
                            return;
                        } else {
                            idaVar.b(false, !p42Var.V);
                            return;
                        }
                    }
                    int i6 = i - 1;
                    if (i6 != 0 || !this.s.isEmpty()) {
                        i3--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i6));
                    if (arrayList2 != null) {
                        k47 k47Var = (k47) arrayList2.get(i3);
                        if (idaVar.getMessage() != null && idaVar.getMessage().e1() == k47Var.e1()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 != arrayList2.size() - 1 || (i6 == arrayList.size() - 1 && this.T)) {
                            z2 = true;
                        }
                        idaVar.c(k47Var, z2);
                        idaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, idaVar, k47Var, z, (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = i - 1;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) arrayList.get(i7));
            if (arrayList3 != null) {
                k47 k47Var2 = (k47) arrayList3.get(0);
                if (i7 == 0 && !this.s.isEmpty()) {
                    e0 = jb6.M0(2131749309, null);
                } else {
                    e0 = jb6.e0(k47Var2.k.date, false);
                }
                ((l55) view).setText(e0);
            }
        }
    }

    public final void Y(String str, boolean z) {
        long j;
        p42 p42Var = this.Y;
        h42 h42Var = p42Var.w;
        d42 d42Var = p42Var.r;
        lx1 lx1Var = this.x;
        if (lx1Var != null) {
            gm.r(lx1Var);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (d42Var.getAdapter() != h42Var) {
                d42Var.setAdapter(h42Var);
            }
            f();
        } else {
            lx1 lx1Var2 = new lx1(this, str, (byte) 15);
            this.x = lx1Var2;
            gm.d3(lx1Var2, 300L);
        }
        if (!p42Var.a0 && h42Var.f.isEmpty()) {
            int i = 0;
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i < arrayList.size()) {
                    sh4 sh4Var = (sh4) arrayList.get(i);
                    byte b = sh4Var.d;
                    if (b == 4) {
                        TLObject tLObject = sh4Var.f;
                        if (tLObject instanceof TLRPC.User) {
                            j = ((TLRPC.User) tLObject).id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j = -((TLRPC.Chat) tLObject).id;
                        }
                        j2 = j;
                    } else if (b == 6) {
                        qh4 qh4Var = sh4Var.g;
                        j3 = qh4Var.b;
                        j4 = qh4Var.c;
                    }
                    i++;
                } else {
                    Z(j2, j3, j4, uh4.k3[2], str, z);
                    return;
                }
            }
        }
    }

    public final void Z(final long j, final long j2, final long j3, sh4 sh4Var, final String str, boolean z) {
        final boolean z2;
        boolean z3;
        long j4;
        p42 p42Var = this.Y;
        d42 d42Var = p42Var.r;
        c42 c42Var = p42Var.M;
        Locale locale = Locale.ENGLISH;
        byte b = sh4Var.d;
        final String str2 = j + j2 + j3 + ((int) b) + str;
        String str3 = this.J;
        if (str3 != null && str3.equals(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.E = sh4Var;
        this.y = j;
        this.F = j2;
        this.G = j3;
        j42 j42Var = this.w;
        if (j42Var != null) {
            gm.r(j42Var);
        }
        o1 o1Var = this.X;
        gm.r(o1Var);
        if (z2 && z) {
            return;
        }
        ArrayList arrayList = this.N;
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = this.O;
        if (z3) {
            arrayList3.clear();
            this.Q.clear();
            this.R.clear();
            this.T = true;
            c42Var.setVisibility(0);
            f();
            this.U++;
            if (d42Var.getPinnedHeader() != null) {
                d42Var.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z2) {
            o1Var.run();
            c42Var.e(true, !z);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i = 1 + this.U;
        this.U = i;
        final j5 a = j5.a(z8c.t0);
        ?? r0 = new Runnable() {
            @Override
            public final void run() {
                j5 j5Var;
                int i2;
                long j5;
                final ArrayList arrayList4;
                long j6;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                j5 j5Var2 = a;
                int i3 = j5Var2.a;
                final o42 o42Var = o42.this;
                ArrayList arrayList5 = o42Var.O;
                final long j7 = j;
                int i4 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
                final String str4 = str;
                final long j8 = j2;
                long j9 = j3;
                final boolean z4 = z2;
                if (i4 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = o42Var.E.e;
                    tL_messages_search.peer = oc7.r1(i3).i1(j7);
                    if (j8 > 0) {
                        tL_messages_search.min_date = (int) (j8 / 1000);
                    }
                    if (j9 > 0) {
                        tL_messages_search.max_date = (int) (j9 / 1000);
                    }
                    if (z4 && str4.equals(o42Var.K) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((k47) b10.f(1, arrayList5)).e1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    j5Var = j5Var2;
                    arrayList4 = null;
                    tL_messages_searchGlobal = tL_messages_search;
                } else {
                    if (!TextUtils.isEmpty(str4)) {
                        ArrayList arrayList6 = new ArrayList();
                        j5 = j9;
                        j5Var = j5Var2;
                        i2 = 20;
                        cf7.Y(i3).J0(0, str4, arrayList6, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList6;
                    } else {
                        j5Var = j5Var2;
                        i2 = 20;
                        j5 = j9;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i2;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = o42Var.E.e;
                    if (j8 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j8 / 1000);
                    }
                    if (j5 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j5 / 1000);
                    }
                    if (z4 && str4.equals(o42Var.K) && !arrayList5.isEmpty()) {
                        k47 k47Var = (k47) b10.f(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = k47Var.e1();
                        tL_messages_searchGlobal2.offset_rate = o42Var.H;
                        TLRPC.Peer peer = k47Var.k.peer_id;
                        long j10 = peer.channel_id;
                        if (j10 == 0) {
                            j10 = peer.chat_id;
                            if (j10 == 0) {
                                j6 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = oc7.r1(i3).i1(j6);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j6 = -j10;
                        tL_messages_searchGlobal2.offset_peer = oc7.r1(i3).i1(j6);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                o42Var.K = str4;
                o42Var.J = str2;
                final ArrayList arrayList7 = new ArrayList();
                uh4.B1(o42Var.K, arrayList7);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                final int i5 = i;
                final j5 j5Var3 = j5Var;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList8 = new ArrayList();
                        j5 j5Var4 = j5Var3;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                k47 k47Var2 = new k47(j5Var4.a, messages_messages.messages.get(i6), false, true);
                                k47Var2.J5(str5, true);
                                arrayList8.add(k47Var2);
                            }
                        }
                        gm.c3(new bh1(o42.this, i5, tL_error, tLObject, j5Var4, z4, str5, arrayList8, j7, j8, arrayList4, arrayList7));
                    }
                });
            }
        };
        this.w = r0;
        if (z2 && !arrayList3.isEmpty()) {
            j4 = 0;
        } else {
            j4 = 350;
        }
        gm.d3(r0, j4);
        p42Var.K.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o42.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void f() {
        X(false);
        this.Y.Y();
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        l55 l55Var;
        View view;
        ylb ylbVar = this.Y.a;
        Context context = this.r;
        if (i != 0) {
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return kt6.h(view, view, -1, -2);
                    }
                } else {
                    tk4 tk4Var = new tk4(context, ylbVar);
                    tk4Var.setViewType(3);
                    tk4Var.setIsSingleCell(true);
                    l55Var = tk4Var;
                }
            }
            if (i == 1) {
                i2 = 1;
            }
            ida idaVar = new ida(i2, ylbVar, context);
            idaVar.setDrawDownloadIcon(false);
            view = idaVar;
            return kt6.h(view, view, -1, -2);
        }
        l55Var = new l55(context, ylbVar);
        view = l55Var;
        return kt6.h(view, view, -1, -2);
    }
}
