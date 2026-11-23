package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k41;
public final class k9 extends org.telegram.ui.ActionBar.w2 implements fs {
    public static final int Y1 = 0;
    public boolean A1;
    public boolean B1;
    public int C1;
    public int D1;
    public final ArrayList E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public int I1;
    public boolean J1;
    public HashMap K1;
    public int L1;
    public final Paint M1;
    public ArrayList N1;
    public q8 O1;
    public w10 P1;
    public w8 Q1;
    public w10 R1;
    public n9 S1;
    public final boolean T1;
    public boolean U1;
    public boolean V1;
    public BitmapDrawable W1;
    public m9 X1;
    public q1 f14787m1;
    public TLRPC.InputPeer n1;
    public final ArrayList f14788o1;
    public final HashMap f14789p1;
    public int f14790q1;
    public final ArrayList f14791r1;
    public final ArrayList f14792s1;
    public final HashMap f14793t1;
    public int f14794u1;
    public final HashSet f14795v1;
    public boolean f14796w1;
    public boolean f14797x1;
    public boolean f14798y1;
    public boolean f14799z1;

    public k9(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        boolean z10;
        char c10;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        this.f14788o1 = arrayList;
        HashMap hashMap = new HashMap();
        this.f14789p1 = hashMap;
        char c11 = 0;
        this.f14790q1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.f14791r1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f14792s1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f14793t1 = hashMap2;
        this.f14794u1 = 0;
        this.f14795v1 = new HashSet();
        this.f14796w1 = true;
        this.f14797x1 = true;
        this.f14798y1 = false;
        this.f14799z1 = true;
        this.A1 = true;
        this.B1 = false;
        this.C1 = 0;
        this.D1 = 1;
        this.E1 = new ArrayList();
        this.H1 = 1;
        this.I1 = 4;
        this.K1 = new HashMap();
        this.L1 = 86400;
        this.M1 = new Paint(1);
        this.T1 = true;
        this.U1 = false;
        this.L1 = i7;
        String string = mp.u1(this.f30223a).h7.getString("story_prv_contacts", null);
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
        String string2 = mp.u1(this.f30223a).h7.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i10 = 0;
            while (i10 < split2.length) {
                String[] split3 = split2[i10].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c11]);
                        z10 = z11;
                        ArrayList arrayList4 = new ArrayList();
                        c10 = c11;
                        for (int i11 = z10; i11 < split3.length; i11++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i11])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i10++;
                    c11 = c10;
                    z11 = z10;
                }
                z10 = z11;
                c10 = c11;
                i10++;
                c11 = c10;
                z11 = z10;
            }
        }
        boolean z12 = z11;
        ?? r23 = c11;
        String string3 = mp.u1(this.f30223a).h7.getString("story_prv_everyoneexcept", null);
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
        String string4 = mp.u1(this.f30223a).h7.getString("story_prv_grpeveryoneexcept", null);
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
        String string5 = mp.u1(this.f30223a).h7.getString("story_prv_excluded", null);
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
        this.f14794u1 = S0(arrayList3, hashMap2).size();
        this.f14790q1 = S0(arrayList, hashMap).size();
        this.f14797x1 = !mp.u1(this.f30223a).h7.getBoolean("story_noforwards", r23);
        this.f14798y1 = mp.u1(this.f30223a).h7.getBoolean("story_keep", z12);
        Q0(context);
        this.f14787m1.setAdapter(new j8(this, context, 0));
        tr a02 = tr.a0(this.f30223a);
        a02.f27149a.c(new c(19, this, a02));
        mp.u1(this.f30223a).R1().S();
        mp.u1(this.f30223a).R1().U();
    }

    public static ArrayList K0(k9 k9Var) {
        ArrayList P0 = k9Var.P0();
        int i7 = 0;
        while (i7 < P0.size()) {
            TLObject tLObject = (TLObject) P0.get(i7);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                P0.remove(i7);
                i7--;
            }
            i7++;
        }
        return P0;
    }

    public static int L0(k9 k9Var, TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = mp.u1(k9Var.f30223a).P0(chat.f28492id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = k9Var.K1;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f28492id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public static HashSet S0(ArrayList arrayList, HashMap hashMap) {
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
    public final boolean F() {
        View currentView = this.f14787m1.getCurrentView();
        if (currentView instanceof f9) {
            return ((f9) currentView).T;
        }
        return true;
    }

    @Override
    public final void L() {
        ks.f(this.f30223a).n(this, ks.O);
        ks.f(this.f30223a).n(this, ks.f25195c3);
        ks.f(this.f30223a).n(this, ks.f25206e3);
        super.L();
    }

    public final void M0(boolean z10) {
        View[] viewPages;
        this.f14799z1 = z10;
        q1 q1Var = this.f14787m1;
        if (q1Var != null) {
            for (View view : q1Var.getViewPages()) {
                if (view instanceof f9) {
                    ((f9) view).f(false);
                }
            }
        }
    }

    public final void N0() {
        View[] viewPages;
        y8 y8Var;
        for (View view : this.f14787m1.getViewPages()) {
            if ((view instanceof f9) && (y8Var = ((f9) view).f14505y) != null) {
                org.telegram.messenger.g0.v1(y8Var.f14597b);
            }
        }
    }

    public final void O0(i9 i9Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.N1 != null) {
            mp u12 = mp.u1(this.f30223a);
            for (int i7 = 0; i7 < this.N1.size(); i7++) {
                String str = (String) this.N1.get(i7);
                TLObject h22 = u12.h2(str);
                if (h22 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) h22;
                    TLRPC.User c22 = u12.c2(Long.valueOf(user.f28641id));
                    if (c22 != null) {
                        user = c22;
                    }
                    if (!user.bot && !i9Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        e eVar = null;
        if (!arrayList.isEmpty() && !z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < Math.min(2, arrayList.size()); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i10)));
                spannableString.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String N0 = gd.N0(2131744245, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.K2(gd.N0(2131744244, null), spannableStringBuilder, "%s");
            alertDialog$Builder.k(gd.N0(2131746549, null), new a3.h(this, i9Var, runnable, 11));
            i5.c.y(null, 2131752577, alertDialog$Builder, null);
            return;
        }
        View view = this.f14787m1.getViewPages()[0];
        if (view instanceof f9) {
            eVar = ((f9) view).f14503w;
        }
        if (eVar != null) {
            eVar.setLoading(true);
        }
        q8 q8Var = this.O1;
        if (q8Var != null) {
            q8Var.h(i9Var, this.f14796w1, this.f14797x1, this.f14798y1, this.B1, this.n1, this.C1, new c(21, eVar, runnable), new w(eVar, 16));
        } else {
            runnable.run();
        }
    }

    public final ArrayList P0() {
        TLRPC.User c22;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = org.telegram.messenger.i5.r(this.f30223a).f24693f0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            org.telegram.messenger.i5.r(this.f30223a).A(0L, false);
        }
        mp u12 = mp.u1(this.f30223a);
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i7);
                if (tL_contact != null && (c22 = u12.c2(Long.valueOf(tL_contact.user_id))) != null && !n10.C(c22) && !c22.bot && c22.f28641id != 777000) {
                    arrayList.add(c22);
                }
            }
        }
        return arrayList;
    }

    public final void Q0(Context context) {
        org.telegram.ui.Components.fc.a(this.f30229c, new bi.t(1));
        ks.f(this.f30223a).c(this, ks.O);
        ks.f(this.f30223a).c(this, ks.f25195c3);
        ks.f(this.f30223a).c(this, ks.f25206e3);
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        this.M1.setColor(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        Q(i7);
        this.f30226b = new p8(this, context);
        q1 q1Var = new q1(1, context, this);
        this.f14787m1 = q1Var;
        int i10 = this.f30261u0;
        q1Var.setPadding(i10, 0, i10, 0);
        this.f30226b.addView(this.f14787m1, c8.na.e(-1, -1, 119));
    }

    public final void R0(boolean z10) {
        View[] viewPages;
        this.U1 = z10;
        q1 q1Var = this.f14787m1;
        if (q1Var != null) {
            for (View view : q1Var.getViewPages()) {
                if (view instanceof f9) {
                    f9 f9Var = (f9) view;
                    f9Var.h(false);
                    f9Var.f(false);
                }
            }
        }
    }

    public final void T0(int i7) {
        View[] viewPages;
        this.D1 = i7;
        q1 q1Var = this.f14787m1;
        if (q1Var != null) {
            for (View view : q1Var.getViewPages()) {
                if (view instanceof f9) {
                    ((f9) view).f(false);
                }
            }
        }
    }

    public final void U0(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View[] viewPages;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(bitmap);
        }
        this.W1 = bitmapDrawable;
        q1 q1Var = this.f14787m1;
        if (q1Var != null) {
            for (View view : q1Var.getViewPages()) {
                if (view instanceof f9) {
                    f9 f9Var = (f9) view;
                    f9Var.h(false);
                    f9Var.f(false);
                }
            }
        }
    }

    public final void V0() {
        this.F1 = true;
        View[] viewPages = this.f14787m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof f9) {
            f9 f9Var = (f9) view;
            f9Var.b(f9Var.f14494a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof f9) {
            f9 f9Var2 = (f9) view2;
            f9Var2.b(f9Var2.f14494a);
        }
    }

    public final void W0(TLRPC.InputPeer inputPeer) {
        this.n1 = inputPeer;
        this.f14795v1.clear();
        View[] viewPages = this.f14787m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof f9) {
            f9 f9Var = (f9) view;
            f9Var.b(f9Var.f14494a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof f9) {
            f9 f9Var2 = (f9) view2;
            f9Var2.b(f9Var2.f14494a);
        }
    }

    public final void X0(i9 i9Var) {
        if (i9Var != null) {
            HashMap hashMap = i9Var.d;
            int i7 = i9Var.f14701a;
            ArrayList arrayList = i9Var.f14703c;
            this.I1 = i7;
            if (i7 == 2) {
                ArrayList arrayList2 = this.f14791r1;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i7 == 3) {
                ArrayList arrayList3 = this.f14792s1;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f14793t1;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f14794u1 = S0(arrayList3, hashMap2).size();
            } else if (i7 == 4) {
                ArrayList arrayList4 = this.f14788o1;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.f14789p1;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f14790q1 = S0(arrayList4, hashMap3).size();
            }
            if (i7 == 5) {
                this.J1 = true;
                this.H1 = 5;
                ArrayList arrayList5 = this.E1;
                arrayList5.clear();
                arrayList5.addAll(i9Var.f14705f);
                this.f14787m1.setPosition(1);
            }
            View[] viewPages = this.f14787m1.getViewPages();
            View view = viewPages[0];
            if (view instanceof f9) {
                f9 f9Var = (f9) view;
                f9Var.b(f9Var.f14494a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof f9) {
                f9 f9Var2 = (f9) view2;
                f9Var2.b(f9Var2.f14494a);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        q1 q1Var = this.f14787m1;
        if (q1Var != null) {
            int i11 = 0;
            if (i7 == ks.O) {
                View[] viewPages = q1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof f9) {
                    ((f9) view).h(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof f9) {
                    ((f9) view2).h(true);
                }
            } else if (i7 == ks.f25195c3) {
                View[] viewPages2 = q1Var.getViewPages();
                while (i11 < viewPages2.length) {
                    View view3 = viewPages2[i11];
                    if (view3 instanceof f9) {
                        f9 f9Var = (f9) view3;
                        int i12 = f9Var.f14494a;
                        if (i12 == 6) {
                            f9Var.a(true);
                        } else if (i12 == 0) {
                            f9Var.h(true);
                        }
                    }
                    i11++;
                }
            } else if (i7 == ks.f25206e3) {
                View[] viewPages3 = q1Var.getViewPages();
                while (i11 < viewPages3.length) {
                    View view4 = viewPages3[i11];
                    if (view4 instanceof f9) {
                        f9 f9Var2 = (f9) view4;
                        if (f9Var2.f14494a == 0) {
                            f9Var2.h(true);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        i9 i9Var;
        w10 w10Var = this.P1;
        ArrayList arrayList = this.f14791r1;
        HashMap hashMap = this.f14789p1;
        ArrayList arrayList2 = this.f14788o1;
        HashMap hashMap2 = this.f14793t1;
        ArrayList arrayList3 = this.f14792s1;
        if (w10Var != null) {
            int i7 = this.I1;
            if (i7 == 3) {
                i9Var = new i9(this.I1, this.f30223a, new ArrayList(S0(arrayList3, hashMap2)));
                ArrayList arrayList4 = i9Var.f14703c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = i9Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i7 == 4) {
                i9Var = new i9(this.I1, this.f30223a, new ArrayList(S0(arrayList2, hashMap)));
                ArrayList arrayList5 = i9Var.f14703c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = i9Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i7 == 2) {
                i9Var = new i9(i7, this.f30223a, arrayList);
            } else {
                i9Var = new i9(i7, this.f30223a, (ArrayList) null);
            }
            this.P1.a(i9Var);
            this.P1 = null;
        }
        org.telegram.ui.Components.fc.h(this.f30229c);
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
        mp.u1(this.f30223a).h7.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f14797x1).putBoolean("story_keep", this.f14798y1).apply();
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        if (this.f14787m1.getCurrentPosition() > 0) {
            N0();
            q1 q1Var = this.f14787m1;
            q1Var.C(q1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            this.M1.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0));
            ViewGroup viewGroup = this.f30226b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public k9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        this.f14788o1 = new ArrayList();
        this.f14789p1 = new HashMap();
        this.f14790q1 = 0;
        this.f14791r1 = new ArrayList();
        this.f14792s1 = new ArrayList();
        this.f14793t1 = new HashMap();
        this.f14794u1 = 0;
        this.f14795v1 = new HashSet();
        this.f14796w1 = true;
        this.f14797x1 = true;
        this.f14798y1 = false;
        this.f14799z1 = true;
        this.A1 = true;
        this.B1 = false;
        this.C1 = 0;
        this.D1 = 1;
        this.E1 = new ArrayList();
        this.H1 = 1;
        this.I1 = 4;
        this.K1 = new HashMap();
        this.L1 = 86400;
        this.M1 = new Paint(1);
        this.T1 = true;
        this.U1 = false;
        Q0(context);
        this.f14787m1.setAdapter(new j8(this, context, 1));
    }
}
