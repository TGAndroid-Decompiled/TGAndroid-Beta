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
public final class zy9 extends fy0 {
    public final u41 S1;
    public final yy9 T1;
    public final l35 U1;
    public final cz9 V1;
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
    public final lm h2;
    public String i2;
    public ty9 j2;
    public int k2;
    public final TLRPC.Chat l2;
    public byte m2;
    public zm0 n2;
    public int o2;
    public cn0 p2;
    public final bg7 q2;

    public zy9(d dVar, long j) {
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
        this.k2 = gl.L(134.0f);
        this.q2 = new bg7(this, (byte) 25);
        this.u0 = 0;
        this.l2 = na7.q1(this.a).K0(Long.valueOf(-j));
        ((ViewGroup) this.o1.getParent()).removeView(this.o1);
        ViewGroup viewGroup = this.b;
        s33 s33Var = s33.h;
        this.h2 = new lm(viewGroup, 0L, 350L, s33Var);
        cz9 cz9Var = new cz9(getContext(), this.J0);
        this.V1 = cz9Var;
        cz9Var.setOnCloseClickListener(new uy9(this, (byte) 7));
        cz9Var.setText(J0());
        cz9Var.setCloseImageVisible(true);
        cz9Var.f.c(false, 0.0f);
        yy9 yy9Var = new yy9(this, getContext(), this.J0);
        this.T1 = yy9Var;
        int i = bkb.g5;
        zkb.h(i, this.J0, yy9Var);
        yy9Var.setOnSearchTextChange(new wy9(this, (byte) 0));
        this.U1 = new l35(getContext(), this.J0);
        j1();
        ViewGroup viewGroup2 = this.b;
        int i2 = this.u0;
        viewGroup2.addView(cz9Var, nme.f(-2.0f, -1, 55, i2, 0, i2, 0));
        ViewGroup viewGroup3 = this.b;
        int i3 = this.u0;
        viewGroup3.addView(yy9Var, nme.f(-2.0f, -1, 55, i3, 0, i3, 0));
        dr0 dr0Var = new dr0(getContext(), this.J0, (o39) null);
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(10.0f));
        zkb.h(i, this.J0, dr0Var);
        u41 u41Var = new u41(this.J0, getContext(), true);
        this.S1 = u41Var;
        u41Var.setOnClickListener(new vy9(this, (byte) 1));
        dr0Var.addView(u41Var, nme.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i4 = this.u0;
        viewGroup4.addView(dr0Var, nme.f(-2.0f, -1, 87, i4, 0, i4, 0));
        ty9 ty9Var = this.j2;
        o39 o39Var = this.n1;
        ty9Var.n = arrayList;
        ty9Var.f = o39Var;
        int i5 = this.u0;
        o39Var.setPadding(i5, 0, i5, gl.L(60.0f));
        this.n1.j(new n58(this, (byte) 18));
        this.n1.setOnItemClickListener(new wh9(this, (byte) 12));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33Var);
        gb3Var.C = false;
        gb3Var.m = false;
        this.n1.setItemAnimator(gb3Var);
        this.n1.i(new kr(this, (byte) 9));
        i1(false, true);
        a1(1, null, true);
        a1(3, null, true);
    }

    public static boolean b1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (ug8.A(tL_help_country)) {
                String lowerCase = gl.J3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !de9.t(" ", str, lowerCase)) {
                    String lowerCase2 = gl.J3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || de9.t(" ", str, lowerCase2)) {
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
    public final n39 G0(o39 o39Var) {
        ty9 ty9Var = new ty9(this.J0, getContext(), true);
        this.j2 = ty9Var;
        return ty9Var;
    }

    @Override
    public final void I() {
        super.I();
        gl.r(this.q2);
    }

    @Override
    public final CharSequence J0() {
        byte b = this.m2;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    return "";
                }
                return k96.M0(2131753285, null);
            }
            return k96.M0(2131753600, null);
        }
        return k96.M0(2131749508, null);
    }

    @Override
    public final void M0(Canvas canvas, int i) {
        yy9 yy9Var;
        boolean z;
        this.o2 = i;
        cz9 cz9Var = this.V1;
        cz9Var.setTranslationY(Math.max(i, (((cz9Var.getMeasuredHeight() - gl.m) - gl.L(40.0f)) / 2.0f) + gl.m));
        float translationY = cz9Var.getTranslationY() + cz9Var.getMeasuredHeight();
        this.T1.setTranslationY(translationY);
        this.n1.setTranslationY((yy9Var.getMeasuredHeight() + cz9Var.getMeasuredHeight()) - gl.L(16.0f));
        int v0 = bkb.v0(bkb.g5, this.J0);
        Paint paint = this.W1;
        paint.setColor(v0);
        int max = Math.max(0, i);
        if (max < gl.m) {
            z = true;
        } else {
            z = false;
        }
        lm lmVar = this.h2;
        int U1 = gl.U1(lmVar.d(z), max, 0);
        RectF rectF = gl.P;
        rectF.set(this.u0, U1, this.b.getWidth() - this.u0, gl.L(14.0f) + this.b.getHeight());
        float L = (1.0f - lmVar.c) * gl.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    public final void Y0() {
        if (!TextUtils.isEmpty(this.i2)) {
            this.i2 = null;
            this.T1.setText("");
            gl.r(this.q2);
            ArrayList arrayList = this.b2;
            arrayList.clear();
            arrayList.addAll(on0.f(this.l2.id));
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
            Map.EL.forEach(hashMap, new tx2(this, (byte) 1));
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
                xy9 xy9Var = new xy9(this, z, (byte) 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (k96.D0().B != null) {
                    country = k96.D0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new uf(xy9Var, (byte) 4));
                return;
            }
            long j = chat.id;
            wy9 wy9Var = new wy9(this, (byte) 1);
            na7 q1 = na7.q1(y6c.t0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(y6c.t0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new w47(q1, j, wy9Var, (byte) 1));
            return;
        }
        long j2 = chat.id;
        xy9 xy9Var2 = new xy9(this, z, (byte) 0);
        na7 q12 = na7.q1(y6c.t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(y6c.t0);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = q12.f1(j2);
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
        connectionsManager3.sendRequest(tL_channels_getParticipants, new pl(q12, xy9Var2, (byte) 2));
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
        yy9 yy9Var = this.T1;
        yy9Var.setText("");
        yy9Var.d.b(false);
        yy9Var.b(false, hashSet2, new uy9(this, (byte) 4), this.f2);
        j1();
        i1(false, true);
        this.V1.setText(J0());
        g1(false);
        e1(false);
    }

    public final void d1(boolean z) {
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
                            cn0Var.c.l1.E(0);
                            ao0 ao0Var = cn0Var.a;
                            ArrayList arrayList3 = ao0Var.Z1;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            ao0Var.f1(false, true);
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
                    cn0Var2.c.l1.E(0);
                    ao0 ao0Var2 = cn0Var2.a;
                    ArrayList arrayList5 = ao0Var2.X1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    ao0Var2.f1(!dn0Var.d, true);
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
                cn0Var3.c.l1.E(0);
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
                ao0Var3.f1(false, true);
                ao0Var3.e1(true);
                ao0Var3.W0();
            }
        }
    }

    @Override
    public final void dismiss() {
        zm0 zm0Var = this.n2;
        if (zm0Var != null) {
            zm0Var.run();
        }
    }

    public final void e1(boolean z) {
        o39 o39Var = this.n1;
        if (z) {
            v26 v26Var = new v26(getContext(), 2, 0.6f);
            v26Var.a = 1;
            v26Var.p = gl.L(38.0f);
            o39Var.getLayoutManager().v0(v26Var);
            return;
        }
        o39Var.w0(0);
    }

    public final void f1() {
        String M0;
        byte b = this.m2;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    M0 = "";
                } else {
                    M0 = k96.G((int) on0.i(), "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                M0 = k96.G((int) on0.g(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            M0 = k96.M0(2131753269, null);
        }
        cn0 cn0Var = this.p2;
        if (cn0Var != null) {
            new u21(cn0Var.c.c, cn0Var.b).Q(2131623982, 36, M0).k(true);
        }
    }

    public final void g1(boolean z) {
        String M0;
        u41 u41Var = this.S1;
        boolean z2 = false;
        u41Var.setShowZero(false);
        byte b = this.m2;
        if (b != 1) {
            if (b != 2 && b != 3) {
                M0 = "";
            } else {
                M0 = k96.M0(2131745754, null);
            }
        } else {
            M0 = k96.M0(2131753286, null);
        }
        u41Var.i(M0, z, true);
        HashSet hashSet = this.Z1;
        u41Var.c(hashSet.size(), z);
        if (hashSet.size() > 0) {
            z2 = true;
        }
        u41Var.setEnabled(z2);
    }

    public final void h1(boolean z, boolean z2) {
        int i;
        ty9 ty9Var;
        ArrayList arrayList = this.X1;
        arrayList.clear();
        ArrayList arrayList2 = this.Y1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.m2 == 1) {
            String M0 = k96.M0(2131749377, null);
            sy9 sy9Var = new sy9(9, false);
            sy9Var.h = (byte) 1;
            sy9Var.i = 2131231877;
            sy9Var.f = M0;
            arrayList2.add(sy9Var);
        }
        sy9 sy9Var2 = new sy9(10, false);
        l35 l35Var = this.U1;
        sy9Var2.p = l35Var;
        arrayList2.add(sy9Var2);
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
                    if (TextUtils.isEmpty(this.i2) || b1(tL_help_country, gl.J3(this.i2).toLowerCase())) {
                        i += gl.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        sy9 sy9Var3 = new sy9(6, true);
                        sy9Var3.e = tL_help_country;
                        sy9Var3.j = contains;
                        arrayList4.add(sy9Var3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    sy9 sy9Var4 = new sy9(7, false);
                    sy9Var4.f = upperCase;
                    arrayList2.add(sy9Var4);
                    arrayList2.addAll(arrayList4);
                    i = gl.L(32.0f) + i;
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
            i += gl.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(cf3.m(inputPeer)));
            sy9 sy9Var5 = new sy9(3, true);
            sy9Var5.d = inputPeer;
            sy9Var5.c = null;
            sy9Var5.j = contains2;
            arrayList2.add(sy9Var5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new sy9(5, false));
            i += gl.L(150.0f);
        }
        int max = Math.max(0, ((int) (gl.q.y * 0.6f)) - i);
        sy9 sy9Var6 = new sy9(-1, false);
        sy9Var6.k = max;
        arrayList2.add(sy9Var6);
        if (hashSet.size() > 0 && this.m2 != 3) {
            l35Var.a(k96.M0(2131743391, null), new vy9(this, (byte) 0));
        } else if (z) {
            l35Var.setRightText(null);
        } else {
            ri riVar = l35Var.b;
            riVar.c(null, false, true);
            riVar.setOnClickListener(null);
            riVar.setVisibility(0);
        }
        if (z2 && (ty9Var = this.j2) != null) {
            if (z) {
                ty9Var.E(arrayList, arrayList2);
            } else {
                ty9Var.f();
            }
        }
    }

    public final void i1(boolean z, boolean z2) {
        h1(z, z2);
        int i = 0;
        while (true) {
            o39 o39Var = this.n1;
            if (i < o39Var.getChildCount()) {
                View childAt = o39Var.getChildAt(i);
                if (childAt instanceof kz9) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.Y1;
                        if (R < arrayList.size()) {
                            kz9 kz9Var = (kz9) childAt;
                            kz9Var.c(((sy9) arrayList.get(R)).j, z);
                            kz9Var.i(z, 1.0f);
                        }
                    }
                    i++;
                }
                if (childAt instanceof bz9) {
                    bz9 bz9Var = (bz9) childAt;
                    bz9Var.c(this.Z1.contains(Long.valueOf(bz9Var.getCountry().default_name.hashCode())), true);
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
        l35 l35Var = this.U1;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    H = "";
                } else {
                    H = k96.G((int) on0.i(), "BoostingSelectUpToCountriesPlural", new Object[0]);
                    l35Var.setLayerHeight(1);
                }
            } else {
                H = k96.G((int) on0.g(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                l35Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.l2;
            if (hc2.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = k96.H(',', str, Math.max(0, this.j2.F(chat) - 1));
            l35Var.setLayerHeight(32);
        }
        l35Var.setText(H);
    }
}
