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
import org.telegram.ui.ActionBar.d;
public final class b1a extends mz0 {
    public final b61 S1;
    public final a1a T1;
    public final l55 U1;
    public final e1a V1;
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
    public final ln h2;
    public String i2;
    public v0a j2;
    public int k2;
    public final TLRPC.Chat l2;
    public byte m2;
    public zn0 n2;
    public int o2;
    public co0 p2;
    public final ei7 q2;

    public b1a(d dVar, long j) {
        super(dVar, false);
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
        this.k2 = gm.L(134.0f);
        this.q2 = new ei7(this, (byte) 25);
        this.u0 = 0;
        this.l2 = oc7.r1(this.a).L0(Long.valueOf(-j));
        ((ViewGroup) this.o1.getParent()).removeView(this.o1);
        ViewGroup viewGroup = this.b;
        d53 d53Var = d53.h;
        this.h2 = new ln(viewGroup, 0L, 350L, d53Var);
        e1a e1aVar = new e1a(getContext(), this.J0);
        this.V1 = e1aVar;
        e1aVar.setOnCloseClickListener(new w0a(this, (byte) 7));
        e1aVar.setText(J0());
        e1aVar.setCloseImageVisible(true);
        e1aVar.f.c(false, 0.0f);
        a1a a1aVar = new a1a(this, getContext(), this.J0);
        this.T1 = a1aVar;
        int i = cmb.g5;
        anb.h(i, this.J0, a1aVar);
        a1aVar.setOnSearchTextChange(new y0a(this, (byte) 0));
        this.U1 = new l55(getContext(), this.J0);
        j1();
        ViewGroup viewGroup2 = this.b;
        int i2 = this.u0;
        viewGroup2.addView(e1aVar, qoe.f(-2.0f, -1, 55, i2, 0, i2, 0));
        ViewGroup viewGroup3 = this.b;
        int i3 = this.u0;
        viewGroup3.addView(a1aVar, qoe.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ds0 ds0Var = new ds0(getContext(), this.J0, (r59) null);
        ds0Var.setClickable(true);
        ds0Var.setOrientation(1);
        ds0Var.setPadding(gm.L(10.0f), gm.L(10.0f), gm.L(10.0f), gm.L(10.0f));
        anb.h(i, this.J0, ds0Var);
        b61 b61Var = new b61(this.J0, getContext(), true);
        this.S1 = b61Var;
        b61Var.setOnClickListener(new x0a(this, (byte) 1));
        ds0Var.addView(b61Var, qoe.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i4 = this.u0;
        viewGroup4.addView(ds0Var, qoe.f(-2.0f, -1, 87, i4, 0, i4, 0));
        v0a v0aVar = this.j2;
        r59 r59Var = this.n1;
        v0aVar.n = arrayList;
        v0aVar.f = r59Var;
        int i5 = this.u0;
        r59Var.setPadding(i5, 0, i5, gm.L(60.0f));
        this.n1.j(new so7(this, (byte) 19));
        this.n1.setOnItemClickListener(new yf9(this, (byte) 16));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53Var);
        sc3Var.C = false;
        sc3Var.m = false;
        this.n1.setItemAnimator(sc3Var);
        this.n1.i(new ks(this, (byte) 9));
        i1(false, true);
        a1(1, null, true);
        a1(3, null, true);
    }

    public static boolean b1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (wi8.A(tL_help_country)) {
                String lowerCase = gm.I3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !hg9.s(" ", str, lowerCase)) {
                    String lowerCase2 = gm.I3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || hg9.s(" ", str, lowerCase2)) {
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
    public final q59 G0(r59 r59Var) {
        v0a v0aVar = new v0a(this.J0, getContext(), true);
        this.j2 = v0aVar;
        return v0aVar;
    }

    @Override
    public final void H() {
        super.H();
        gm.r(this.q2);
    }

    @Override
    public final CharSequence J0() {
        byte b = this.m2;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    return "";
                }
                return jb6.M0(2131753253, null);
            }
            return jb6.M0(2131753568, null);
        }
        return jb6.M0(2131749457, null);
    }

    @Override
    public final void M0(Canvas canvas, int i) {
        a1a a1aVar;
        boolean z;
        this.o2 = i;
        e1a e1aVar = this.V1;
        e1aVar.setTranslationY(Math.max(i, (((e1aVar.getMeasuredHeight() - gm.m) - gm.L(40.0f)) / 2.0f) + gm.m));
        float translationY = e1aVar.getTranslationY() + e1aVar.getMeasuredHeight();
        this.T1.setTranslationY(translationY);
        this.n1.setTranslationY((a1aVar.getMeasuredHeight() + e1aVar.getMeasuredHeight()) - gm.L(16.0f));
        int v0 = cmb.v0(cmb.g5, this.J0);
        Paint paint = this.W1;
        paint.setColor(v0);
        int max = Math.max(0, i);
        if (max < gm.m) {
            z = true;
        } else {
            z = false;
        }
        ln lnVar = this.h2;
        int U1 = gm.U1(lnVar.d(z), max, 0);
        RectF rectF = gm.P;
        rectF.set(this.u0, U1, this.b.getWidth() - this.u0, gm.L(14.0f) + this.b.getHeight());
        float L = (1.0f - lnVar.c) * gm.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    public final void Y0() {
        if (!TextUtils.isEmpty(this.i2)) {
            this.i2 = null;
            this.T1.setText("");
            gm.r(this.q2);
            ArrayList arrayList = this.b2;
            arrayList.clear();
            arrayList.addAll(oo0.f(this.l2.id));
            i1(false, false);
            i1(true, true);
        }
    }

    @Override
    public final void Z(Configuration configuration) {
        h1(false, true);
    }

    public final void Z0(boolean z, Pair pair) {
        if (z) {
            HashMap hashMap = this.d2;
            hashMap.putAll((Map) pair.first);
            this.e2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new dz2(this, (byte) 1));
        }
        if (this.m2 == 3) {
            i1(true, true);
            e1(true);
        }
    }

    public final void a1(int i, String str, boolean z) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.l2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                z0a z0aVar = new z0a(this, z, (byte) 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (jb6.D0().B != null) {
                    country = jb6.D0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new tg(z0aVar, (byte) 4));
                return;
            }
            long j = chat.id;
            y0a y0aVar = new y0a(this, (byte) 1);
            oc7 r1 = oc7.r1(z8c.t0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(z8c.t0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new jb7(r1, j, y0aVar, (byte) 1));
            return;
        }
        long j2 = chat.id;
        z0a z0aVar2 = new z0a(this, z, (byte) 0);
        oc7 r12 = oc7.r1(z8c.t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(z8c.t0);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = r12.g1(j2);
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
        connectionsManager3.sendRequest(tL_channels_getParticipants, new pm(r12, z0aVar2, (byte) 2));
    }

    public final void c1(int i, ArrayList arrayList) {
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
                arrayList2.addAll(oo0.f(this.l2.id));
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
        a1a a1aVar = this.T1;
        a1aVar.setText("");
        a1aVar.d.b(false);
        a1aVar.b(false, hashSet2, new w0a(this, (byte) 4), this.f2);
        j1();
        i1(false, true);
        this.V1.setText(J0());
        g1(false);
        e1(false);
    }

    public final void d1(boolean z) {
        do0 do0Var;
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
                        co0 co0Var = this.p2;
                        if (co0Var != null) {
                            co0Var.c.l1.E(0);
                            ap0 ap0Var = co0Var.a;
                            ArrayList arrayList3 = ap0Var.Z1;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            ap0Var.f1(false, true);
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
                co0 co0Var2 = this.p2;
                if (co0Var2 != null) {
                    co0Var2.c.l1.E(0);
                    ap0 ap0Var2 = co0Var2.a;
                    ArrayList arrayList5 = ap0Var2.X1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    ap0Var2.f1(!do0Var.d, true);
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
            co0 co0Var3 = this.p2;
            if (co0Var3 != null) {
                co0Var3.c.l1.E(0);
                ap0 ap0Var3 = co0Var3.a;
                ArrayList arrayList7 = ap0Var3.Y1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i2 = po0.w;
                    ap0Var3.d2 = 0;
                } else {
                    int i3 = po0.w;
                    ap0Var3.d2 = 1;
                }
                ap0Var3.i2 = 0;
                ap0Var3.f1(false, true);
                ap0Var3.e1(true);
                ap0Var3.W0();
            }
        }
    }

    @Override
    public final void dismiss() {
        zn0 zn0Var = this.n2;
        if (zn0Var != null) {
            zn0Var.run();
        }
    }

    public final void e1(boolean z) {
        r59 r59Var = this.n1;
        if (z) {
            w46 w46Var = new w46(getContext(), 2, 0.6f);
            w46Var.a = 1;
            w46Var.p = gm.L(38.0f);
            r59Var.getLayoutManager().v0(w46Var);
            return;
        }
        r59Var.w0(0);
    }

    public final void f1() {
        String M0;
        byte b = this.m2;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    M0 = "";
                } else {
                    M0 = jb6.G((int) oo0.i(), "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                M0 = jb6.G((int) oo0.g(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            M0 = jb6.M0(2131753237, null);
        }
        co0 co0Var = this.p2;
        if (co0Var != null) {
            new c41(co0Var.c.c, co0Var.b).Q(2131623982, 36, M0).k(true);
        }
    }

    public final void g1(boolean z) {
        String M0;
        b61 b61Var = this.S1;
        boolean z2 = false;
        b61Var.setShowZero(false);
        byte b = this.m2;
        if (b != 1) {
            if (b != 2 && b != 3) {
                M0 = "";
            } else {
                M0 = jb6.M0(2131745680, null);
            }
        } else {
            M0 = jb6.M0(2131753254, null);
        }
        b61Var.i(M0, z, true);
        HashSet hashSet = this.Z1;
        b61Var.c(hashSet.size(), z);
        if (hashSet.size() > 0) {
            z2 = true;
        }
        b61Var.setEnabled(z2);
    }

    public final void h1(boolean z, boolean z2) {
        int i;
        v0a v0aVar;
        ArrayList arrayList = this.X1;
        arrayList.clear();
        ArrayList arrayList2 = this.Y1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.m2 == 1) {
            String M0 = jb6.M0(2131749326, null);
            u0a u0aVar = new u0a(9, false);
            u0aVar.h = (byte) 1;
            u0aVar.i = 2131231878;
            u0aVar.f = M0;
            arrayList2.add(u0aVar);
        }
        u0a u0aVar2 = new u0a(10, false);
        l55 l55Var = this.U1;
        u0aVar2.p = l55Var;
        arrayList2.add(u0aVar2);
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
                    if (TextUtils.isEmpty(this.i2) || b1(tL_help_country, gm.I3(this.i2).toLowerCase())) {
                        i += gm.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        u0a u0aVar3 = new u0a(6, true);
                        u0aVar3.e = tL_help_country;
                        u0aVar3.j = contains;
                        arrayList4.add(u0aVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    u0a u0aVar4 = new u0a(7, false);
                    u0aVar4.f = upperCase;
                    arrayList2.add(u0aVar4);
                    arrayList2.addAll(arrayList4);
                    i = gm.L(32.0f) + i;
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
            i += gm.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(pg3.m(inputPeer)));
            u0a u0aVar5 = new u0a(3, true);
            u0aVar5.d = inputPeer;
            u0aVar5.c = null;
            u0aVar5.j = contains2;
            arrayList2.add(u0aVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new u0a(5, false));
            i += gm.L(150.0f);
        }
        int max = Math.max(0, ((int) (gm.q.y * 0.6f)) - i);
        u0a u0aVar6 = new u0a(-1, false);
        u0aVar6.k = max;
        arrayList2.add(u0aVar6);
        if (hashSet.size() > 0 && this.m2 != 3) {
            l55Var.a(jb6.M0(2131743317, null), new x0a(this, (byte) 0));
        } else if (z) {
            l55Var.setRightText(null);
        } else {
            rj rjVar = l55Var.b;
            rjVar.c(null, false, true);
            rjVar.setOnClickListener(null);
            rjVar.setVisibility(0);
        }
        if (z2 && (v0aVar = this.j2) != null) {
            if (z) {
                v0aVar.E(arrayList, arrayList2);
            } else {
                v0aVar.f();
            }
        }
    }

    public final void i1(boolean z, boolean z2) {
        h1(z, z2);
        int i = 0;
        while (true) {
            r59 r59Var = this.n1;
            if (i < r59Var.getChildCount()) {
                View childAt = r59Var.getChildAt(i);
                if (childAt instanceof m1a) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.Y1;
                        if (R < arrayList.size()) {
                            m1a m1aVar = (m1a) childAt;
                            m1aVar.c(((u0a) arrayList.get(R)).j, z);
                            m1aVar.i(z, 1.0f);
                        }
                    }
                    i++;
                }
                if (childAt instanceof d1a) {
                    d1a d1aVar = (d1a) childAt;
                    d1aVar.c(this.Z1.contains(Long.valueOf(d1aVar.getCountry().default_name.hashCode())), true);
                }
                i++;
            } else {
                g1(z);
                return;
            }
        }
    }

    public final void j1() {
        String str;
        String H;
        byte b = this.m2;
        l55 l55Var = this.U1;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    H = "";
                } else {
                    H = jb6.G((int) oo0.i(), "BoostingSelectUpToCountriesPlural", new Object[0]);
                    l55Var.setLayerHeight(1);
                }
            } else {
                H = jb6.G((int) oo0.g(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                l55Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.l2;
            if (sd2.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = jb6.H(',', str, Math.max(0, this.j2.F(chat) - 1));
            l55Var.setLayerHeight(32);
        }
        l55Var.setText(H);
    }
}
