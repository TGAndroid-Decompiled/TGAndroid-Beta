package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.o31;
public final class t8 extends org.telegram.ui.ActionBar.t2 implements cs {
    public static final int V1 = 0;
    public int A1;
    public final ArrayList B1;
    public boolean C1;
    public boolean D1;
    public int E1;
    public int F1;
    public boolean G1;
    public HashMap H1;
    public int I1;
    public final Paint J1;
    public ArrayList K1;
    public x7 L1;
    public u10 M1;
    public d8 N1;
    public u10 O1;
    public w8 P1;
    public final boolean Q1;
    public boolean R1;
    public boolean S1;
    public BitmapDrawable T1;
    public v8 U1;
    public g1 f13621j1;
    public TLRPC.InputPeer k1;
    public final ArrayList f13622l1;
    public final HashMap m1;
    public int f13623n1;
    public final ArrayList f13624o1;
    public final ArrayList f13625p1;
    public final HashMap f13626q1;
    public int f13627r1;
    public final HashSet f13628s1;
    public boolean f13629t1;
    public boolean f13630u1;
    public boolean f13631v1;
    public boolean f13632w1;
    public boolean f13633x1;
    public boolean f13634y1;
    public int f13635z1;

    public t8(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        boolean z10;
        char c2;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        this.f13622l1 = arrayList;
        HashMap hashMap = new HashMap();
        this.m1 = hashMap;
        char c10 = 0;
        this.f13623n1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.f13624o1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f13625p1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f13626q1 = hashMap2;
        this.f13627r1 = 0;
        this.f13628s1 = new HashSet();
        this.f13629t1 = true;
        this.f13630u1 = true;
        this.f13631v1 = false;
        this.f13632w1 = true;
        this.f13633x1 = true;
        this.f13634y1 = false;
        this.f13635z1 = 0;
        this.A1 = 1;
        this.B1 = new ArrayList();
        this.E1 = 1;
        this.F1 = 4;
        this.H1 = new HashMap();
        this.I1 = 86400;
        this.J1 = new Paint(1);
        this.Q1 = true;
        this.R1 = false;
        this.I1 = i3;
        String string = hp.s1(this.f28583a).f22999e7.getString("story_prv_contacts", null);
        if (string != null) {
            String[] split = string.split(",");
            arrayList3.clear();
            for (String str : split) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = hp.s1(this.f28583a).f22999e7.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i10 = 0;
            while (i10 < split2.length) {
                String[] split3 = split2[i10].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c10]);
                        z10 = z11;
                        ArrayList arrayList4 = new ArrayList();
                        c2 = c10;
                        for (int i11 = z10; i11 < split3.length; i11++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i11])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i10++;
                    c10 = c2;
                    z11 = z10;
                }
                z10 = z11;
                c2 = c10;
                i10++;
                c10 = c2;
                z11 = z10;
            }
        }
        boolean z12 = z11;
        ?? r23 = c10;
        String string3 = hp.s1(this.f28583a).f22999e7.getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (int i12 = r23 == true ? 1 : 0; i12 < split4.length; i12++) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(split4[i12])));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = hp.s1(this.f28583a).f22999e7.getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i13 = r23 == true ? 1 : 0; i13 < split5.length; i13++) {
                String[] split6 = split5[i13].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i14 = z12; i14 < split6.length; i14++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i14])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = hp.s1(this.f28583a).f22999e7.getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (int i15 = r23 == true ? 1 : 0; i15 < split7.length; i15++) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(split7[i15])));
                } catch (Exception unused5) {
                }
            }
        }
        this.f13627r1 = R0(arrayList3, hashMap2).size();
        this.f13623n1 = R0(arrayList, hashMap).size();
        this.f13630u1 = !hp.s1(this.f28583a).f22999e7.getBoolean("story_noforwards", r23);
        this.f13631v1 = hp.s1(this.f28583a).f22999e7.getBoolean("story_keep", z12);
        P0(context);
        this.f13621j1.setAdapter(new q7(this, context, 0));
        qr a02 = qr.a0(this.f28583a);
        a02.f24934a.c(new g2.c(24, this, a02));
        hp.s1(this.f28583a).P1().S();
        hp.s1(this.f28583a).P1().U();
    }

    public static ArrayList J0(t8 t8Var) {
        ArrayList O0 = t8Var.O0();
        int i3 = 0;
        while (i3 < O0.size()) {
            TLObject tLObject = (TLObject) O0.get(i3);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                O0.remove(i3);
                i3--;
            }
            i3++;
        }
        return O0;
    }

    public static int K0(t8 t8Var, TLRPC.Chat chat) {
        Integer num;
        int i3;
        TLRPC.ChatFull N0 = hp.s1(t8Var.f28583a).N0(chat.f27001id);
        if (N0 != null && (i3 = N0.participants_count) > 0) {
            return i3;
        }
        HashMap hashMap = t8Var.H1;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f27001id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public static HashSet R0(ArrayList arrayList, HashMap hashMap) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (hashMap != null) {
            for (ArrayList arrayList2 : hashMap.values()) {
                hashSet.addAll(arrayList2);
            }
        }
        return hashSet;
    }

    @Override
    public final boolean G() {
        View currentView = this.f13621j1.getCurrentView();
        if (currentView instanceof o8) {
            return ((o8) currentView).T;
        }
        return true;
    }

    @Override
    public final void K() {
        hs.f(this.f28583a).n(this, hs.O);
        hs.f(this.f28583a).n(this, hs.f23199a3);
        hs.f(this.f28583a).n(this, hs.f23210c3);
        super.K();
    }

    public final void L0(boolean z10) {
        View[] viewPages;
        this.f13632w1 = z10;
        g1 g1Var = this.f13621j1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof o8) {
                    ((o8) view).f(false);
                }
            }
        }
    }

    public final void M0() {
        View[] viewPages;
        f8 f8Var;
        for (View view : this.f13621j1.getViewPages()) {
            if ((view instanceof o8) && (f8Var = ((o8) view).f13350y) != null) {
                org.telegram.messenger.g0.v1(f8Var.f13440b);
            }
        }
    }

    public final void N0(r8 r8Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.K1 != null) {
            hp s12 = hp.s1(this.f28583a);
            for (int i3 = 0; i3 < this.K1.size(); i3++) {
                String str = (String) this.K1.get(i3);
                TLObject f22 = s12.f2(str);
                if (f22 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) f22;
                    TLRPC.User a22 = s12.a2(Long.valueOf(user.f27150id));
                    if (a22 != null) {
                        user = a22;
                    }
                    if (!user.bot && !r8Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        d dVar = null;
        if (!arrayList.isEmpty() && !z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < Math.min(2, arrayList.size()); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i10)));
                spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String M0 = bd.M0(2131744499, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.K2(bd.M0(2131744498, null), spannableStringBuilder, "%s");
            alertDialog$Builder.k(bd.M0(2131746751, null), new aa.a(this, r8Var, runnable, 7));
            k2.p1.v(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        View view = this.f13621j1.getViewPages()[0];
        if (view instanceof o8) {
            dVar = ((o8) view).f13348w;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        x7 x7Var = this.L1;
        if (x7Var != null) {
            x7Var.c(r8Var, this.f13629t1, this.f13630u1, this.f13631v1, this.f13634y1, this.k1, this.f13635z1, new g2.c(26, dVar, runnable), new f6(dVar, 2));
        } else {
            runnable.run();
        }
    }

    public final ArrayList O0() {
        TLRPC.User a22;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = org.telegram.messenger.g5.r(this.f28583a).f22653f0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            org.telegram.messenger.g5.r(this.f28583a).A(0L, false);
        }
        hp s12 = hp.s1(this.f28583a);
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i3);
                if (tL_contact != null && (a22 = s12.a2(Long.valueOf(tL_contact.user_id))) != null && !l10.B(a22) && !a22.bot && a22.f27150id != 777000) {
                    arrayList.add(a22);
                }
            }
        }
        return arrayList;
    }

    public final void P0(Context context) {
        ac.a(this.f28589c, new ai.y(1));
        hs.f(this.f28583a).c(this, hs.O);
        hs.f(this.f28583a).c(this, hs.f23199a3);
        hs.f(this.f28583a).c(this, hs.f23210c3);
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        this.J1.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
        P(i3);
        this.f28586b = new w7(this, context);
        g1 g1Var = new g1(1, context, this);
        this.f13621j1 = g1Var;
        int i10 = this.f28618u0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.f28586b.addView(this.f13621j1, mf.e(-1, -1, 119));
    }

    public final void Q0(boolean z10) {
        View[] viewPages;
        this.R1 = z10;
        g1 g1Var = this.f13621j1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof o8) {
                    o8 o8Var = (o8) view;
                    o8Var.h(false);
                    o8Var.f(false);
                }
            }
        }
    }

    public final void S0(int i3) {
        View[] viewPages;
        this.A1 = i3;
        g1 g1Var = this.f13621j1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof o8) {
                    ((o8) view).f(false);
                }
            }
        }
    }

    public final void T0(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View[] viewPages;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(bitmap);
        }
        this.T1 = bitmapDrawable;
        g1 g1Var = this.f13621j1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof o8) {
                    o8 o8Var = (o8) view;
                    o8Var.h(false);
                    o8Var.f(false);
                }
            }
        }
    }

    public final void U0() {
        this.C1 = true;
        View[] viewPages = this.f13621j1.getViewPages();
        View view = viewPages[0];
        if (view instanceof o8) {
            o8 o8Var = (o8) view;
            o8Var.b(o8Var.f13339a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof o8) {
            o8 o8Var2 = (o8) view2;
            o8Var2.b(o8Var2.f13339a);
        }
    }

    public final void V0(TLRPC.InputPeer inputPeer) {
        this.k1 = inputPeer;
        this.f13628s1.clear();
        View[] viewPages = this.f13621j1.getViewPages();
        View view = viewPages[0];
        if (view instanceof o8) {
            o8 o8Var = (o8) view;
            o8Var.b(o8Var.f13339a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof o8) {
            o8 o8Var2 = (o8) view2;
            o8Var2.b(o8Var2.f13339a);
        }
    }

    public final void W0(r8 r8Var) {
        if (r8Var != null) {
            HashMap hashMap = r8Var.d;
            int i3 = r8Var.f13526a;
            ArrayList arrayList = r8Var.f13528c;
            this.F1 = i3;
            if (i3 == 2) {
                ArrayList arrayList2 = this.f13624o1;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i3 == 3) {
                ArrayList arrayList3 = this.f13625p1;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f13626q1;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f13627r1 = R0(arrayList3, hashMap2).size();
            } else if (i3 == 4) {
                ArrayList arrayList4 = this.f13622l1;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.m1;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f13623n1 = R0(arrayList4, hashMap3).size();
            }
            if (i3 == 5) {
                this.G1 = true;
                this.E1 = 5;
                ArrayList arrayList5 = this.B1;
                arrayList5.clear();
                arrayList5.addAll(r8Var.f13530f);
                this.f13621j1.setPosition(1);
            }
            View[] viewPages = this.f13621j1.getViewPages();
            View view = viewPages[0];
            if (view instanceof o8) {
                o8 o8Var = (o8) view;
                o8Var.b(o8Var.f13339a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof o8) {
                o8 o8Var2 = (o8) view2;
                o8Var2.b(o8Var2.f13339a);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        g1 g1Var = this.f13621j1;
        if (g1Var != null) {
            int i11 = 0;
            if (i3 == hs.O) {
                View[] viewPages = g1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof o8) {
                    ((o8) view).h(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof o8) {
                    ((o8) view2).h(true);
                }
            } else if (i3 == hs.f23199a3) {
                View[] viewPages2 = g1Var.getViewPages();
                while (i11 < viewPages2.length) {
                    View view3 = viewPages2[i11];
                    if (view3 instanceof o8) {
                        o8 o8Var = (o8) view3;
                        int i12 = o8Var.f13339a;
                        if (i12 == 6) {
                            o8Var.a(true);
                        } else if (i12 == 0) {
                            o8Var.h(true);
                        }
                    }
                    i11++;
                }
            } else if (i3 == hs.f23210c3) {
                View[] viewPages3 = g1Var.getViewPages();
                while (i11 < viewPages3.length) {
                    View view4 = viewPages3[i11];
                    if (view4 instanceof o8) {
                        o8 o8Var2 = (o8) view4;
                        if (o8Var2.f13339a == 0) {
                            o8Var2.h(true);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        r8 r8Var;
        u10 u10Var = this.M1;
        ArrayList arrayList = this.f13624o1;
        HashMap hashMap = this.m1;
        ArrayList arrayList2 = this.f13622l1;
        HashMap hashMap2 = this.f13626q1;
        ArrayList arrayList3 = this.f13625p1;
        if (u10Var != null) {
            int i3 = this.F1;
            if (i3 == 3) {
                r8Var = new r8(this.F1, this.f28583a, new ArrayList(R0(arrayList3, hashMap2)));
                ArrayList arrayList4 = r8Var.f13528c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = r8Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i3 == 4) {
                r8Var = new r8(this.F1, this.f28583a, new ArrayList(R0(arrayList2, hashMap)));
                ArrayList arrayList5 = r8Var.f13528c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = r8Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i3 == 2) {
                r8Var = new r8(i3, this.f28583a, arrayList);
            } else {
                r8Var = new r8(i3, this.f28583a, (ArrayList) null);
            }
            this.M1.a(r8Var);
            this.M1 = null;
        }
        ac.h(this.f28589c);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb3.length() > 0) {
                sb3.append(";");
            }
            sb3.append(entry2.getKey());
            sb3.append(",");
            sb3.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        hp.s1(this.f28583a).f22999e7.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f13630u1).putBoolean("story_keep", this.f13631v1).apply();
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        if (this.f13621j1.getCurrentPosition() > 0) {
            M0();
            g1 g1Var = this.f13621j1;
            g1Var.D(g1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            this.J1.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0));
            ViewGroup viewGroup = this.f28586b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public t8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        this.f13622l1 = new ArrayList();
        this.m1 = new HashMap();
        this.f13623n1 = 0;
        this.f13624o1 = new ArrayList();
        this.f13625p1 = new ArrayList();
        this.f13626q1 = new HashMap();
        this.f13627r1 = 0;
        this.f13628s1 = new HashSet();
        this.f13629t1 = true;
        this.f13630u1 = true;
        this.f13631v1 = false;
        this.f13632w1 = true;
        this.f13633x1 = true;
        this.f13634y1 = false;
        this.f13635z1 = 0;
        this.A1 = 1;
        this.B1 = new ArrayList();
        this.E1 = 1;
        this.F1 = 4;
        this.H1 = new HashMap();
        this.I1 = 86400;
        this.J1 = new Paint(1);
        this.Q1 = true;
        this.R1 = false;
        P0(context);
        this.f13621j1.setAdapter(new q7(this, context, 1));
    }
}
