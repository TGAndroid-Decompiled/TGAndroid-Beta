package mg;

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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.l10;
import w7.b6;
public final class v1 extends ha {
    public final vh.d P1;
    public final t1 Q1;
    public final z3 R1;
    public final qg.c S1;
    public final Paint T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final HashSet W1;
    public final HashSet X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashMap a2;
    public final ArrayList f13250b2;
    public final ArrayList f13251c2;
    public final LinkedHashMap f13252d2;
    public final t5 f13253e2;
    public String f13254f2;
    public ng.i f13255g2;
    public int f13256h2;
    public final TLRPC.Chat f13257i2;
    public int f13258j2;
    public q f13259k2;
    public int f13260l2;
    public t f13261m2;
    public final androidx.activity.i f13262n2;

    public v1(k2 k2Var, long j10) {
        super(k2Var, false);
        this.T1 = new Paint(1);
        this.U1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        this.W1 = new HashSet();
        this.X1 = new HashSet();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new HashMap();
        this.f13250b2 = new ArrayList();
        this.f13251c2 = new ArrayList();
        this.f13252d2 = new LinkedHashMap();
        this.f13256h2 = org.telegram.messenger.i0.L(134.0f);
        this.f13262n2 = new androidx.activity.i(this, 29);
        this.f21616t0 = 0;
        this.f13257i2 = wp.r1(this.f21584a).L0(Long.valueOf(-j10));
        ((ViewGroup) this.l1.getParent()).removeView(this.l1);
        ViewGroup viewGroup = this.f21587b;
        gr grVar = gr.h;
        this.f13253e2 = new t5(viewGroup, 0L, 350L, grVar);
        qg.c cVar = new qg.c(getContext(), this.I0);
        this.S1 = cVar;
        cVar.setOnCloseClickListener(new p1(this, 7));
        cVar.setText(O0());
        cVar.setCloseImageVisible(true);
        cVar.f45539f.c(false, 0.0f);
        t1 t1Var = new t1(this, getContext(), this.I0);
        this.Q1 = t1Var;
        int i10 = t6.f21002h5;
        a7.i(i10, t1Var, this.I0);
        t1Var.setOnSearchTextChange(new r1(this, 0));
        this.R1 = new z3(getContext(), this.I0);
        o1();
        ViewGroup viewGroup2 = this.f21587b;
        int i11 = this.f21616t0;
        viewGroup2.addView(cVar, b6.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.f21587b;
        int i12 = this.f21616t0;
        viewGroup3.addView(t1Var, b6.f(-2.0f, -1, 55, i12, 0, i12, 0));
        l10 l10Var = new l10(getContext(), this.I0, (uk0) null);
        l10Var.setClickable(true);
        l10Var.setOrientation(1);
        l10Var.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        a7.i(i10, l10Var, this.I0);
        vh.d dVar = new vh.d(getContext(), this.I0, true);
        this.P1 = dVar;
        dVar.setOnClickListener(new q1(this, 1));
        l10Var.addView(dVar, b6.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f21587b;
        int i13 = this.f21616t0;
        viewGroup4.addView(l10Var, b6.f(-2.0f, -1, 87, i13, 0, i13, 0));
        ng.i iVar = this.f13255g2;
        uk0 uk0Var = this.f26724k1;
        iVar.f13795n = arrayList;
        iVar.f13794f = uk0Var;
        int i14 = this.f21616t0;
        uk0Var.setPadding(i14, 0, i14, org.telegram.messenger.i0.L(60.0f));
        this.f26724k1.j(new ag.u(this, 6));
        this.f26724k1.setOnItemClickListener(new l(this, 1));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(grVar);
        jVar.C = false;
        jVar.f47938m = false;
        this.f26724k1.setItemAnimator(jVar);
        this.f26724k1.i(new u1(this, 0));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static void d1(v1 v1Var, boolean z10, Pair pair) {
        HashMap hashMap = v1Var.a2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            v1Var.f13250b2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new lh.c(v1Var, 1));
        }
        if (v1Var.f13258j2 == 3) {
            v1Var.n1(true, true);
            v1Var.j1(true);
        }
    }

    public static boolean g1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (c3.i0.t(tL_help_country)) {
                String lowerCase = org.telegram.messenger.i0.N3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !sc.e.y(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.i0.N3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || sc.e.y(" ", str, lowerCase2)) {
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
    public final void L() {
        super.L();
        org.telegram.messenger.i0.r(this.f13262n2);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        ng.i iVar = new ng.i(getContext(), this.I0, true);
        this.f13255g2 = iVar;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        int i10 = this.f13258j2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "";
                }
                return dd.L0(2131753288, null);
            }
            return dd.L0(2131753603, null);
        }
        return dd.L0(2131749689, null);
    }

    @Override
    public final void R0(Canvas canvas, int i10) {
        t1 t1Var;
        boolean z10;
        this.f13260l2 = i10;
        qg.c cVar = this.S1;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(40.0f)) / 2.0f) + org.telegram.messenger.i0.f16166m));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Q1.setTranslationY(translationY);
        this.f26724k1.setTranslationY((t1Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - org.telegram.messenger.i0.L(16.0f));
        int w02 = t6.w0(t6.f21002h5, this.I0);
        Paint paint = this.T1;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        if (max < org.telegram.messenger.i0.f16166m) {
            z10 = true;
        } else {
            z10 = false;
        }
        t5 t5Var = this.f13253e2;
        int W1 = org.telegram.messenger.i0.W1(t5Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(this.f21616t0, W1, this.f21587b.getWidth() - this.f21616t0, org.telegram.messenger.i0.L(14.0f) + this.f21587b.getHeight());
        float L = (1.0f - t5Var.f30530c) * org.telegram.messenger.i0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override
    public final void dismiss() {
        q qVar = this.f13259k2;
        if (qVar != null) {
            qVar.run();
        }
    }

    public final void e1() {
        if (!TextUtils.isEmpty(this.f13254f2)) {
            this.f13254f2 = null;
            this.Q1.setText("");
            org.telegram.messenger.i0.r(this.f13262n2);
            ArrayList arrayList = this.Y1;
            arrayList.clear();
            arrayList.addAll(k0.e(this.f13257i2.f19794id));
            n1(false, false);
            n1(true, true);
        }
    }

    public final void f1(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f13257i2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                s1 s1Var = new s1(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e20.f15506s0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (dd.D0().B != null) {
                    country = dd.D0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ag.c(s1Var, 8));
                return;
            }
            long j10 = chat.f19794id;
            r1 r1Var = new r1(this, 1);
            wp r12 = wp.r1(e20.f15506s0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(e20.f15506s0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f19840q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new x(r12, j10, r1Var, 0));
            return;
        }
        long j11 = chat.f19794id;
        s1 s1Var2 = new s1(this, z10, 0);
        wp r13 = wp.r1(e20.f15506s0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(e20.f15506s0);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = r13.g1(j11);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f19793q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new ag.k0(4, r13, s1Var2));
    }

    public final void h1(int i10, List list) {
        long j10;
        this.f13258j2 = i10;
        this.f13254f2 = null;
        HashSet hashSet = this.X1;
        hashSet.clear();
        HashSet hashSet2 = this.W1;
        hashSet2.clear();
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f13252d2;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(k0.e(this.f13257i2.f19794id));
            }
        } else {
            arrayList.addAll(this.Z1);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (tLObject instanceof TLRPC.TL_inputPeerChat) {
                    j10 = -((TLRPC.TL_inputPeerChat) tLObject).chat_id;
                } else {
                    j10 = 0;
                }
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).f19794id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f19943id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        t1 t1Var = this.Q1;
        t1Var.setText("");
        t1Var.d.b(false);
        t1Var.b(false, hashSet2, new p1(this, 4), this.f13251c2);
        o1();
        n1(false, true);
        this.S1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z10) {
        v vVar;
        HashSet hashSet = this.W1;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f13258j2;
            LinkedHashMap linkedHashMap = this.f13252d2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f13251c2;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                            if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                                arrayList.add(tL_help_country);
                            }
                        }
                        t tVar = this.f13261m2;
                        if (tVar != null) {
                            tVar.f13237c.f13247i1.E(0);
                            w0 w0Var = tVar.f13235a;
                            ArrayList arrayList3 = w0Var.W1;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            w0Var.k1(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f19794id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                t tVar2 = this.f13261m2;
                if (tVar2 != null) {
                    tVar2.f13237c.f13247i1.E(0);
                    w0 w0Var2 = tVar2.f13235a;
                    ArrayList arrayList5 = w0Var2.U1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    w0Var2.k1(!vVar.d, true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f19943id))) {
                        arrayList6.add(user);
                    }
                }
            }
            t tVar3 = this.f13261m2;
            if (tVar3 != null) {
                tVar3.f13237c.f13247i1.E(0);
                w0 w0Var3 = tVar3.f13235a;
                ArrayList arrayList7 = w0Var3.V1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = og.e.f14185w;
                    w0Var3.a2 = 0;
                } else {
                    int i13 = og.e.f14185w;
                    w0Var3.a2 = 1;
                }
                w0Var3.f13270f2 = 0;
                w0Var3.k1(false, true);
                w0Var3.j1(true);
                w0Var3.b1();
            }
        }
    }

    public final void j1(boolean z10) {
        uk0 uk0Var = this.f26724k1;
        if (z10) {
            ci.p pVar = new ci.p(getContext(), 2, 0.6f);
            pVar.f48056a = 1;
            pVar.f4253p = org.telegram.messenger.i0.L(38.0f);
            uk0Var.getLayoutManager().w0(pVar);
            return;
        }
        uk0Var.v0(0);
    }

    public final void k1() {
        String L0;
        int i10 = this.f13258j2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    L0 = "";
                } else {
                    L0 = dd.G((int) wp.r1(e20.f15506s0).f19210p0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                L0 = dd.G((int) k0.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            L0 = dd.L0(2131753272, null);
        }
        t tVar = this.f13261m2;
        if (tVar != null) {
            new cc(tVar.f13237c.f21590c, tVar.f13236b).Q(2131623981, 36, L0).k(true);
        }
    }

    public final void l1(boolean z10) {
        String L0;
        vh.d dVar = this.P1;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f13258j2;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                L0 = "";
            } else {
                L0 = dd.L0(2131745963, null);
            }
        } else {
            L0 = dd.L0(2131753289, null);
        }
        dVar.i(L0, z10, true);
        HashSet hashSet = this.W1;
        dVar.c(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void m1(boolean z10, boolean z11) {
        int i10;
        ng.i iVar;
        ArrayList arrayList = this.U1;
        arrayList.clear();
        ArrayList arrayList2 = this.V1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f13258j2 == 1) {
            String L0 = dd.L0(2131749561, null);
            ng.h hVar = new ng.h(9, false);
            hVar.f13784i = 1;
            hVar.f13785j = 2131231872;
            hVar.f13783g = L0;
            arrayList2.add(hVar);
        }
        ng.h hVar2 = new ng.h(10, false);
        z3 z3Var = this.R1;
        hVar2.f13792q = z3Var;
        arrayList2.add(hVar2);
        int i11 = this.f13258j2;
        HashSet hashSet = this.W1;
        if (i11 == 3) {
            ArrayList arrayList3 = this.f13250b2;
            int size = arrayList3.size();
            i10 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.a2.get(str)) {
                    if (TextUtils.isEmpty(this.f13254f2) || g1(tL_help_country, org.telegram.messenger.i0.N3(this.f13254f2).toLowerCase())) {
                        i10 += org.telegram.messenger.i0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        ng.h hVar3 = new ng.h(6, true);
                        hVar3.f13782f = tL_help_country;
                        hVar3.f13786k = contains;
                        arrayList4.add(hVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    ng.h hVar4 = new ng.h(7, false);
                    hVar4.f13783g = upperCase;
                    arrayList2.add(hVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = org.telegram.messenger.i0.L(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.Y1;
        int size2 = arrayList6.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList6.get(i13);
            i13++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += org.telegram.messenger.i0.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(o5.n(inputPeer)));
            ng.h hVar5 = new ng.h(3, true);
            hVar5.d = inputPeer;
            hVar5.f13781c = null;
            hVar5.e = null;
            hVar5.f13786k = contains2;
            arrayList2.add(hVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ng.h(5, false));
            i10 += org.telegram.messenger.i0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.i0.f16172q.y * 0.6f)) - i10);
        ng.h hVar6 = new ng.h(-1, false);
        hVar6.f13787l = max;
        arrayList2.add(hVar6);
        if (hashSet.size() > 0 && this.f13258j2 != 3) {
            z3Var.a(dd.L0(2131743656, null), new q1(this, 0));
        } else if (z10) {
            z3Var.setRightText(null);
        } else {
            y3 y3Var = z3Var.f23640b;
            y3Var.c(null, false, true);
            y3Var.setOnClickListener(null);
            y3Var.setVisibility(0);
        }
        if (z11 && (iVar = this.f13255g2) != null) {
            if (z10) {
                iVar.E(arrayList, arrayList2);
            } else {
                iVar.f();
            }
        }
    }

    public final void n1(boolean z10, boolean z11) {
        m1(z10, z11);
        int i10 = 0;
        while (true) {
            uk0 uk0Var = this.f26724k1;
            if (i10 < uk0Var.getChildCount()) {
                View childAt = uk0Var.getChildAt(i10);
                if (childAt instanceof qg.k) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.V1;
                        if (R < arrayList.size()) {
                            ng.h hVar = (ng.h) arrayList.get(R);
                            qg.k kVar = (qg.k) childAt;
                            kVar.c(hVar.f13786k, z10);
                            TLRPC.Chat chat = hVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f13255g2.F(chat) > 200) {
                                    f7 = 0.3f;
                                }
                                kVar.i(z10, f7);
                            } else {
                                kVar.i(z10, 1.0f);
                            }
                        }
                    }
                    i10++;
                }
                if (childAt instanceof qg.b) {
                    qg.b bVar = (qg.b) childAt;
                    bVar.c(this.W1.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                l1(z10);
                return;
            }
        }
    }

    public final void o1() {
        String str;
        String H;
        int i10 = this.f13258j2;
        z3 z3Var = this.R1;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    H = "";
                } else {
                    H = dd.G((int) wp.r1(e20.f15506s0).f19210p0, "BoostingSelectUpToCountriesPlural", new Object[0]);
                    z3Var.setLayerHeight(1);
                }
            } else {
                H = dd.G((int) k0.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                z3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f13257i2;
            if (w3.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = dd.H(',', str, Math.max(0, this.f13255g2.F(chat) - 1));
            z3Var.setLayerHeight(32);
        }
        z3Var.setText(H);
    }
}
