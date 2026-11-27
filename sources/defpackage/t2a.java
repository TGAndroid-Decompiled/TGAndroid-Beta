package defpackage;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class t2a extends ny0 {
    public final c51 S1;
    public final s2a T1;
    public final p55 U1;
    public final w2a V1;
    public final Paint W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final HashSet a2;
    public final ArrayList b2;
    public final ArrayList c2;
    public final HashMap d2;
    public final ArrayList e2;
    public final ArrayList f2;
    public final LinkedHashMap g2;
    public final mm h2;
    public String i2;
    public n2a j2;
    public int k2;
    public final TLRPC.Chat l2;
    public byte m2;
    public zm0 n2;
    public int o2;
    public cn0 p2;
    public final ki7 q2;

    public t2a(e eVar, long j) {
        super(eVar, false);
        this.W1 = new Paint(1);
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        this.Z1 = new HashSet();
        this.a2 = new HashSet();
        this.b2 = new ArrayList();
        this.c2 = new ArrayList();
        this.d2 = new HashMap();
        this.e2 = new ArrayList();
        this.f2 = new ArrayList();
        this.g2 = new LinkedHashMap();
        this.k2 = hl.L(134.0f);
        this.q2 = new ki7(this, (byte) 25);
        this.u0 = 0;
        this.l2 = uc7.s1(this.a).M0(Long.valueOf(-j));
        ((ViewGroup) this.o1.getParent()).removeView(this.o1);
        ViewGroup viewGroup = this.b;
        k43 k43Var = k43.h;
        this.h2 = new mm(viewGroup, 0L, 350L, k43Var);
        w2a w2aVar = new w2a(getContext(), this.J0);
        this.V1 = w2aVar;
        w2aVar.setOnCloseClickListener(new o2a(this, (byte) 7));
        w2aVar.setText(K0());
        w2aVar.setCloseImageVisible(true);
        w2aVar.f.c(false, 0.0f);
        s2a s2aVar = new s2a(this, getContext(), this.J0);
        this.T1 = s2aVar;
        int i = aob.h5;
        yob.h(i, this.J0, s2aVar);
        s2aVar.setOnSearchTextChange(new q2a(this, (byte) 0));
        this.U1 = new p55(getContext(), this.J0);
        k1();
        ViewGroup viewGroup2 = this.b;
        int i2 = this.u0;
        viewGroup2.addView(w2aVar, tre.f(-2.0f, -1, 55, i2, 0, i2, 0));
        ViewGroup viewGroup3 = this.b;
        int i3 = this.u0;
        viewGroup3.addView(s2aVar, tre.f(-2.0f, -1, 55, i3, 0, i3, 0));
        dr0 dr0Var = new dr0(getContext(), this.J0, (d79) null);
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(10.0f), hl.L(10.0f));
        yob.h(i, this.J0, dr0Var);
        c51 c51Var = new c51(this.J0, getContext(), true);
        this.S1 = c51Var;
        c51Var.setOnClickListener(new p2a(this, (byte) 1));
        dr0Var.addView(c51Var, tre.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i4 = this.u0;
        viewGroup4.addView(dr0Var, tre.f(-2.0f, -1, 87, i4, 0, i4, 0));
        n2a n2aVar = this.j2;
        d79 d79Var = this.n1;
        n2aVar.n = arrayList;
        n2aVar.f = d79Var;
        int i5 = this.u0;
        d79Var.setPadding(i5, 0, i5, hl.L(60.0f));
        this.n1.j(new e98(this, (byte) 18));
        this.n1.setOnItemClickListener(new ye9(this, (byte) 25));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43Var);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        this.n1.i(new lr(this, (byte) 9));
        j1(false, true);
        b1(1, null, true);
        b1(3, null, true);
    }

    public static boolean c1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (ik8.A(tL_help_country)) {
                String lowerCase = hl.I3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !uh9.t(" ", str, lowerCase)) {
                    String lowerCase2 = hl.I3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || uh9.t(" ", str, lowerCase2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void H() {
        super.H();
        hl.r(this.q2);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        n2a n2aVar = new n2a(this.J0, getContext(), true);
        this.j2 = n2aVar;
        return n2aVar;
    }

    @Override
    public final CharSequence K0() {
        byte b = this.m2;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    return "";
                }
                return ob6.M0(2131753281, null);
            }
            return ob6.M0(2131753596, null);
        }
        return ob6.M0(2131749469, null);
    }

    @Override
    public final void N0(Canvas canvas, int i) {
        s2a s2aVar;
        boolean z;
        this.o2 = i;
        w2a w2aVar = this.V1;
        w2aVar.setTranslationY(Math.max(i, (((w2aVar.getMeasuredHeight() - hl.m) - hl.L(40.0f)) / 2.0f) + hl.m));
        float translationY = w2aVar.getTranslationY() + w2aVar.getMeasuredHeight();
        this.T1.setTranslationY(translationY);
        this.n1.setTranslationY((s2aVar.getMeasuredHeight() + w2aVar.getMeasuredHeight()) - hl.L(16.0f));
        int v0 = aob.v0(aob.h5, this.J0);
        Paint paint = this.W1;
        paint.setColor(v0);
        int max = Math.max(0, i);
        if (max < hl.m) {
            z = true;
        } else {
            z = false;
        }
        mm mmVar = this.h2;
        int U1 = hl.U1(mmVar.d(z), max, 0);
        RectF rectF = hl.P;
        rectF.set(this.u0, U1, this.b.getWidth() - this.u0, hl.L(14.0f) + this.b.getHeight());
        float L = (1.0f - mmVar.c) * hl.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override
    public final void Z(Configuration configuration) {
        i1(false, true);
    }

    public final void Z0() {
        if (!TextUtils.isEmpty(this.i2)) {
            this.i2 = null;
            this.T1.setText("");
            hl.r(this.q2);
            ArrayList arrayList = this.b2;
            arrayList.clear();
            arrayList.addAll(on0.f(this.l2.id));
            j1(false, false);
            j1(true, true);
        }
    }

    public final void a1(boolean z, Pair pair) {
        if (z) {
            HashMap hashMap = this.d2;
            hashMap.putAll((Map) pair.first);
            this.e2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new ny2(this, (byte) 1));
        }
        if (this.m2 == 3) {
            j1(true, true);
            f1(true);
        }
    }

    public final void b1(int i, String str, boolean z) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.l2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                r2a r2aVar = new r2a(this, z, (byte) 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (ob6.D0().B != null) {
                    country = ob6.D0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ye(r2aVar, (byte) 4));
                return;
            }
            long j = chat.id;
            q2a q2aVar = new q2a(this, (byte) 1);
            uc7 s1 = uc7.s1(yac.t0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(yac.t0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new p87(s1, j, q2aVar, (byte) 1));
            return;
        }
        long j2 = chat.id;
        r2a r2aVar2 = new r2a(this, z, (byte) 0);
        uc7 s12 = uc7.s1(yac.t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(yac.t0);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = s12.h1(j2);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new ql(s12, r2aVar2, (byte) 2));
    }

    public final void d1(int i, ArrayList arrayList) {
        long j;
        this.m2 = i;
        this.i2 = null;
        HashSet hashSet = this.a2;
        hashSet.clear();
        HashSet hashSet2 = this.Z1;
        hashSet2.clear();
        ArrayList arrayList2 = this.b2;
        arrayList2.clear();
        LinkedHashMap linkedHashMap = this.g2;
        linkedHashMap.clear();
        if (i != 1) {
            if (i == 2) {
                arrayList2.addAll(on0.f(this.l2.id));
            }
        } else {
            arrayList2.addAll(this.c2);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_inputPeerChat) {
                    j = -((TLRPC.TL_inputPeerChat) tLObject).chat_id;
                } else {
                    j = 0;
                }
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j));
                linkedHashMap.put(Long.valueOf(j), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        s2a s2aVar = this.T1;
        s2aVar.setText("");
        s2aVar.d.b(false);
        s2aVar.b(false, hashSet2, new o2a(this, (byte) 5), this.f2);
        k1();
        j1(false, true);
        this.V1.setText(K0());
        h1(false);
        f1(false);
    }

    @Override
    public final void dismiss() {
        zm0 zm0Var = this.n2;
        if (zm0Var != null) {
            zm0Var.run();
        }
    }

    public final void e1(boolean z) {
        dn0 dn0Var;
        HashSet hashSet = this.Z1;
        if (hashSet.size() != 0 || z) {
            byte b = this.m2;
            LinkedHashMap linkedHashMap = this.g2;
            if (b != 1) {
                if (b != 2) {
                    if (b == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f2;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                            if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                                arrayList.add(tL_help_country);
                            }
                        }
                        cn0 cn0Var = this.p2;
                        if (cn0Var != null) {
                            cn0Var.c.l1.F(0);
                            ao0 ao0Var = cn0Var.a;
                            ArrayList arrayList3 = ao0Var.Z1;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            ao0Var.g1(false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                cn0 cn0Var2 = this.p2;
                if (cn0Var2 != null) {
                    cn0Var2.c.l1.F(0);
                    ao0 ao0Var2 = cn0Var2.a;
                    ArrayList arrayList5 = ao0Var2.X1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    ao0Var2.g1(!dn0Var.d, true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList6.add(user);
                    }
                }
            }
            cn0 cn0Var3 = this.p2;
            if (cn0Var3 != null) {
                cn0Var3.c.l1.F(0);
                ao0 ao0Var3 = cn0Var3.a;
                ArrayList arrayList7 = ao0Var3.Y1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i2 = pn0.w;
                    ao0Var3.d2 = 0;
                } else {
                    int i3 = pn0.w;
                    ao0Var3.d2 = 1;
                }
                ao0Var3.i2 = 0;
                ao0Var3.g1(false, true);
                ao0Var3.f1(true);
                ao0Var3.X0();
            }
        }
    }

    public final void f1(boolean z) {
        d79 d79Var = this.n1;
        if (z) {
            z46 z46Var = new z46(getContext(), 2, 0.6f);
            z46Var.a = 1;
            z46Var.p = hl.L(38.0f);
            d79Var.getLayoutManager().v0(z46Var);
            return;
        }
        d79Var.x0(0);
    }

    public final void g1() {
        String M0;
        byte b = this.m2;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    M0 = "";
                } else {
                    M0 = ob6.G((int) on0.i(), "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                M0 = ob6.G((int) on0.g(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            M0 = ob6.M0(2131753265, null);
        }
        cn0 cn0Var = this.p2;
        if (cn0Var != null) {
            new d31(cn0Var.c.c, cn0Var.b).Q(2131623982, 36, M0).k(true);
        }
    }

    public final void h1(boolean z) {
        String M0;
        c51 c51Var = this.S1;
        boolean z2 = false;
        c51Var.setShowZero(false);
        byte b = this.m2;
        if (b != 1) {
            if (b != 2 && b != 3) {
                M0 = "";
            } else {
                M0 = ob6.M0(2131745674, null);
            }
        } else {
            M0 = ob6.M0(2131753282, null);
        }
        c51Var.i(M0, z, true);
        HashSet hashSet = this.Z1;
        c51Var.c(hashSet.size(), z);
        if (hashSet.size() > 0) {
            z2 = true;
        }
        c51Var.setEnabled(z2);
    }

    public final void i1(boolean z, boolean z2) {
        int i;
        n2a n2aVar;
        ArrayList arrayList = this.X1;
        arrayList.clear();
        ArrayList arrayList2 = this.Y1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.m2 == 1) {
            String M0 = ob6.M0(2131749323, null);
            m2a m2aVar = new m2a(9, false);
            m2aVar.h = (byte) 1;
            m2aVar.i = 2131231877;
            m2aVar.f = M0;
            arrayList2.add(m2aVar);
        }
        m2a m2aVar2 = new m2a(10, false);
        p55 p55Var = this.U1;
        m2aVar2.p = p55Var;
        arrayList2.add(m2aVar2);
        byte b = this.m2;
        HashSet hashSet = this.Z1;
        if (b == 3) {
            ArrayList arrayList3 = this.e2;
            int size = arrayList3.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.d2.get(str)) {
                    if (TextUtils.isEmpty(this.i2) || c1(tL_help_country, hl.I3(this.i2).toLowerCase())) {
                        i += hl.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        m2a m2aVar3 = new m2a(6, true);
                        m2aVar3.e = tL_help_country;
                        m2aVar3.j = contains;
                        arrayList4.add(m2aVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    m2a m2aVar4 = new m2a(7, false);
                    m2aVar4.f = upperCase;
                    arrayList2.add(m2aVar4);
                    arrayList2.addAll(arrayList4);
                    i = hl.L(32.0f) + i;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i = 0;
        }
        ArrayList arrayList6 = this.b2;
        int size2 = arrayList6.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList6.get(i3);
            i3++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i += hl.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(wf3.m(inputPeer)));
            m2a m2aVar5 = new m2a(3, true);
            m2aVar5.d = inputPeer;
            m2aVar5.c = null;
            m2aVar5.j = contains2;
            arrayList2.add(m2aVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new m2a(5, false));
            i += hl.L(150.0f);
        }
        int max = Math.max(0, ((int) (hl.q.y * 0.6f)) - i);
        m2a m2aVar6 = new m2a(-1, false);
        m2aVar6.k = max;
        arrayList2.add(m2aVar6);
        if (hashSet.size() > 0 && this.m2 != 3) {
            p55Var.a(ob6.M0(2131743285, null), new p2a(this, (byte) 0));
        } else if (z) {
            p55Var.setRightText(null);
        } else {
            si siVar = p55Var.b;
            siVar.c(null, false, true);
            siVar.setOnClickListener(null);
            siVar.setVisibility(0);
        }
        if (z2 && (n2aVar = this.j2) != null) {
            if (z) {
                n2aVar.E(arrayList, arrayList2);
            } else {
                n2aVar.f();
            }
        }
    }

    public final void j1(boolean z, boolean z2) {
        i1(z, z2);
        int i = 0;
        while (true) {
            d79 d79Var = this.n1;
            if (i < d79Var.getChildCount()) {
                View childAt = d79Var.getChildAt(i);
                if (childAt instanceof e3a) {
                    int S = RecyclerView.S(childAt) - 1;
                    if (S >= 0) {
                        ArrayList arrayList = this.Y1;
                        if (S < arrayList.size()) {
                            e3a e3aVar = (e3a) childAt;
                            e3aVar.c(((m2a) arrayList.get(S)).j, z);
                            e3aVar.i(z, 1.0f);
                        }
                    }
                    i++;
                }
                if (childAt instanceof v2a) {
                    v2a v2aVar = (v2a) childAt;
                    v2aVar.c(this.Z1.contains(Long.valueOf(v2aVar.getCountry().default_name.hashCode())), true);
                }
                i++;
            } else {
                h1(z);
                return;
            }
        }
    }

    public final void k1() {
        String str;
        String H;
        byte b = this.m2;
        p55 p55Var = this.U1;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    H = "";
                } else {
                    H = ob6.G((int) on0.i(), "BoostingSelectUpToCountriesPlural", new Object[0]);
                    p55Var.setLayerHeight(1);
                }
            } else {
                H = ob6.G((int) on0.g(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                p55Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.l2;
            if (xc2.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = ob6.H(',', str, Math.max(0, this.j2.F(chat) - 1));
            p55Var.setLayerHeight(32);
        }
        p55Var.setText(H);
    }
}
