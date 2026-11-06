package fi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.t31;
public final class s8 extends org.telegram.ui.ActionBar.v2 implements ls {
    public static final int U1 = 0;
    public final ArrayList A1;
    public boolean B1;
    public boolean C1;
    public int D1;
    public int E1;
    public boolean F1;
    public HashMap G1;
    public int H1;
    public final Paint I1;
    public ArrayList J1;
    public y7 K1;
    public c20 L1;
    public e8 M1;
    public c20 N1;
    public v8 O1;
    public final boolean P1;
    public boolean Q1;
    public boolean R1;
    public BitmapDrawable S1;
    public u8 T1;
    public g1 f12803i1;
    public TLRPC.InputPeer f12804j1;
    public final ArrayList f12805k1;
    public final HashMap l1;
    public int f12806m1;
    public final ArrayList n1;
    public final ArrayList f12807o1;
    public final HashMap f12808p1;
    public int f12809q1;
    public final HashSet f12810r1;
    public boolean f12811s1;
    public boolean f12812t1;
    public boolean f12813u1;
    public boolean f12814v1;
    public boolean f12815w1;
    public boolean f12816x1;
    public int f12817y1;
    public int f12818z1;

    public s8(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        boolean z9;
        char c10;
        boolean z10 = true;
        ArrayList arrayList = new ArrayList();
        this.f12805k1 = arrayList;
        HashMap hashMap = new HashMap();
        this.l1 = hashMap;
        char c11 = 0;
        this.f12806m1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.n1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f12807o1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f12808p1 = hashMap2;
        this.f12809q1 = 0;
        this.f12810r1 = new HashSet();
        this.f12811s1 = true;
        this.f12812t1 = true;
        this.f12813u1 = false;
        this.f12814v1 = true;
        this.f12815w1 = true;
        this.f12816x1 = false;
        this.f12817y1 = 0;
        this.f12818z1 = 1;
        this.A1 = new ArrayList();
        this.D1 = 1;
        this.E1 = 4;
        this.G1 = new HashMap();
        this.H1 = 86400;
        this.I1 = new Paint(1);
        this.P1 = true;
        this.Q1 = false;
        this.H1 = i7;
        String string = qp.s1(this.f28612a).f24759e7.getString("story_prv_contacts", null);
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
        String string2 = qp.s1(this.f28612a).f24759e7.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i10 = 0;
            while (i10 < split2.length) {
                String[] split3 = split2[i10].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c11]);
                        z9 = z10;
                        ArrayList arrayList4 = new ArrayList();
                        c10 = c11;
                        for (int i11 = z9; i11 < split3.length; i11++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i11])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i10++;
                    c11 = c10;
                    z10 = z9;
                }
                z9 = z10;
                c10 = c11;
                i10++;
                c11 = c10;
                z10 = z9;
            }
        }
        boolean z11 = z10;
        ?? r23 = c11;
        String string3 = qp.s1(this.f28612a).f24759e7.getString("story_prv_everyoneexcept", null);
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
        String string4 = qp.s1(this.f28612a).f24759e7.getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i13 = r23 == true ? 1 : 0; i13 < split5.length; i13++) {
                String[] split6 = split5[i13].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i14 = z11; i14 < split6.length; i14++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i14])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = qp.s1(this.f28612a).f24759e7.getString("story_prv_excluded", null);
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
        this.f12809q1 = R0(arrayList3, hashMap2).size();
        this.f12806m1 = R0(arrayList, hashMap).size();
        this.f12812t1 = !qp.s1(this.f28612a).f24759e7.getBoolean("story_noforwards", r23);
        this.f12813u1 = qp.s1(this.f28612a).f24759e7.getBoolean("story_keep", z11);
        P0(context);
        this.f12803i1.setAdapter(new q7(this, context, 0));
        yr a02 = yr.a0(this.f28612a);
        a02.f26688a.c(new f2.h(18, this, a02));
        qp.s1(this.f28612a).P1().S();
        qp.s1(this.f28612a).P1().U();
    }

    public static ArrayList J0(s8 s8Var) {
        ArrayList O0 = s8Var.O0();
        int i7 = 0;
        while (i7 < O0.size()) {
            TLObject tLObject = (TLObject) O0.get(i7);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                O0.remove(i7);
                i7--;
            }
            i7++;
        }
        return O0;
    }

    public static int K0(s8 s8Var, TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(s8Var.f28612a).N0(chat.f26952id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = s8Var.G1;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f26952id))) != null) {
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
        View currentView = this.f12803i1.getCurrentView();
        if (currentView instanceof n8) {
            return ((n8) currentView).S;
        }
        return true;
    }

    @Override
    public final void K() {
        qs.f(this.f28612a).n(this, qs.O);
        qs.f(this.f28612a).n(this, qs.f24953a3);
        qs.f(this.f28612a).n(this, qs.f24965c3);
        super.K();
    }

    public final void L0(boolean z9) {
        View[] viewPages;
        this.f12814v1 = z9;
        g1 g1Var = this.f12803i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    ((n8) view).f(false);
                }
            }
        }
    }

    public final void M0() {
        View[] viewPages;
        g8 g8Var;
        for (View view : this.f12803i1.getViewPages()) {
            if ((view instanceof n8) && (g8Var = ((n8) view).f12495y) != null) {
                org.telegram.messenger.g0.v1(g8Var.f12612b);
            }
        }
    }

    public final void N0(q8 q8Var, Runnable runnable, boolean z9) {
        ArrayList arrayList = new ArrayList();
        if (this.J1 != null) {
            qp s12 = qp.s1(this.f28612a);
            for (int i7 = 0; i7 < this.J1.size(); i7++) {
                String str = (String) this.J1.get(i7);
                TLObject f22 = s12.f2(str);
                if (f22 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) f22;
                    TLRPC.User a22 = s12.a2(Long.valueOf(user.f27101id));
                    if (a22 != null) {
                        user = a22;
                    }
                    if (!user.bot && !q8Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        d dVar = null;
        if (!arrayList.isEmpty() && !z9) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < Math.min(2, arrayList.size()); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i10)));
                spannableString.setSpan(new t31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String M0 = hd.M0(2131744490, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.K2(hd.M0(2131744489, null), spannableStringBuilder, "%s");
            alertDialog$Builder.k(hd.M0(2131746742, null), new a3.h(this, q8Var, runnable, 9));
            jg.g.w(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        View view = this.f12803i1.getViewPages()[0];
        if (view instanceof n8) {
            dVar = ((n8) view).f12493w;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        y7 y7Var = this.K1;
        if (y7Var != null) {
            y7Var.l(q8Var, this.f12811s1, this.f12812t1, this.f12813u1, this.f12816x1, this.f12804j1, this.f12817y1, new f2.h(20, dVar, runnable), new di.s7(dVar, 28));
        } else {
            runnable.run();
        }
    }

    public final ArrayList O0() {
        TLRPC.User a22;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = org.telegram.messenger.g5.r(this.f28612a).f22582e0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            org.telegram.messenger.g5.r(this.f28612a).A(0L, false);
        }
        qp s12 = qp.s1(this.f28612a);
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i7);
                if (tL_contact != null && (a22 = s12.a2(Long.valueOf(tL_contact.user_id))) != null && !t10.B(a22) && !a22.bot && a22.f27101id != 777000) {
                    arrayList.add(a22);
                }
            }
        }
        return arrayList;
    }

    public final void P0(Context context) {
        cc.a(this.f28618c, new r7(0));
        qs.f(this.f28612a).c(this, qs.O);
        qs.f(this.f28612a).c(this, qs.f24953a3);
        qs.f(this.f28612a).c(this, qs.f24965c3);
        int i7 = org.telegram.ui.ActionBar.k6.f27921h5;
        this.I1.setColor(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        P(i7);
        this.f28615b = new x7(this, context);
        g1 g1Var = new g1(1, context, this);
        this.f12803i1 = g1Var;
        int i10 = this.f28645t0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.f28615b.addView(this.f12803i1, c8.ha.e(-1, -1, 119));
    }

    public final void Q0(boolean z9) {
        View[] viewPages;
        this.Q1 = z9;
        g1 g1Var = this.f12803i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    n8 n8Var = (n8) view;
                    n8Var.h(false);
                    n8Var.f(false);
                }
            }
        }
    }

    public final void S0(int i7) {
        View[] viewPages;
        this.f12818z1 = i7;
        g1 g1Var = this.f12803i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    ((n8) view).f(false);
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
        this.S1 = bitmapDrawable;
        g1 g1Var = this.f12803i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    n8 n8Var = (n8) view;
                    n8Var.h(false);
                    n8Var.f(false);
                }
            }
        }
    }

    public final void U0() {
        this.B1 = true;
        View[] viewPages = this.f12803i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof n8) {
            n8 n8Var = (n8) view;
            n8Var.b(n8Var.f12485a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof n8) {
            n8 n8Var2 = (n8) view2;
            n8Var2.b(n8Var2.f12485a);
        }
    }

    public final void V0(TLRPC.InputPeer inputPeer) {
        this.f12804j1 = inputPeer;
        this.f12810r1.clear();
        View[] viewPages = this.f12803i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof n8) {
            n8 n8Var = (n8) view;
            n8Var.b(n8Var.f12485a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof n8) {
            n8 n8Var2 = (n8) view2;
            n8Var2.b(n8Var2.f12485a);
        }
    }

    public final void W0(q8 q8Var) {
        if (q8Var != null) {
            HashMap hashMap = q8Var.d;
            int i7 = q8Var.f12678a;
            ArrayList arrayList = q8Var.f12680c;
            this.E1 = i7;
            if (i7 == 2) {
                ArrayList arrayList2 = this.n1;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i7 == 3) {
                ArrayList arrayList3 = this.f12807o1;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f12808p1;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f12809q1 = R0(arrayList3, hashMap2).size();
            } else if (i7 == 4) {
                ArrayList arrayList4 = this.f12805k1;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.l1;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f12806m1 = R0(arrayList4, hashMap3).size();
            }
            if (i7 == 5) {
                this.F1 = true;
                this.D1 = 5;
                ArrayList arrayList5 = this.A1;
                arrayList5.clear();
                arrayList5.addAll(q8Var.f12682f);
                this.f12803i1.setPosition(1);
            }
            View[] viewPages = this.f12803i1.getViewPages();
            View view = viewPages[0];
            if (view instanceof n8) {
                n8 n8Var = (n8) view;
                n8Var.b(n8Var.f12485a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof n8) {
                n8 n8Var2 = (n8) view2;
                n8Var2.b(n8Var2.f12485a);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g1 g1Var = this.f12803i1;
        if (g1Var != null) {
            int i11 = 0;
            if (i7 == qs.O) {
                View[] viewPages = g1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof n8) {
                    ((n8) view).h(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof n8) {
                    ((n8) view2).h(true);
                }
            } else if (i7 == qs.f24953a3) {
                View[] viewPages2 = g1Var.getViewPages();
                while (i11 < viewPages2.length) {
                    View view3 = viewPages2[i11];
                    if (view3 instanceof n8) {
                        n8 n8Var = (n8) view3;
                        int i12 = n8Var.f12485a;
                        if (i12 == 6) {
                            n8Var.a(true);
                        } else if (i12 == 0) {
                            n8Var.h(true);
                        }
                    }
                    i11++;
                }
            } else if (i7 == qs.f24965c3) {
                View[] viewPages3 = g1Var.getViewPages();
                while (i11 < viewPages3.length) {
                    View view4 = viewPages3[i11];
                    if (view4 instanceof n8) {
                        n8 n8Var2 = (n8) view4;
                        if (n8Var2.f12485a == 0) {
                            n8Var2.h(true);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        q8 q8Var;
        c20 c20Var = this.L1;
        ArrayList arrayList = this.n1;
        HashMap hashMap = this.l1;
        ArrayList arrayList2 = this.f12805k1;
        HashMap hashMap2 = this.f12808p1;
        ArrayList arrayList3 = this.f12807o1;
        if (c20Var != null) {
            int i7 = this.E1;
            if (i7 == 3) {
                q8Var = new q8(this.E1, this.f28612a, new ArrayList(R0(arrayList3, hashMap2)));
                ArrayList arrayList4 = q8Var.f12680c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = q8Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i7 == 4) {
                q8Var = new q8(this.E1, this.f28612a, new ArrayList(R0(arrayList2, hashMap)));
                ArrayList arrayList5 = q8Var.f12680c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = q8Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i7 == 2) {
                q8Var = new q8(i7, this.f28612a, arrayList);
            } else {
                q8Var = new q8(i7, this.f28612a, (ArrayList) null);
            }
            this.L1.a(q8Var);
            this.L1 = null;
        }
        cc.h(this.f28618c);
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
        qp.s1(this.f28612a).f24759e7.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f12812t1).putBoolean("story_keep", this.f12813u1).apply();
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        if (this.f12803i1.getCurrentPosition() > 0) {
            M0();
            g1 g1Var = this.f12803i1;
            g1Var.E(g1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            this.I1.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0));
            ViewGroup viewGroup = this.f28615b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public s8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.f12805k1 = new ArrayList();
        this.l1 = new HashMap();
        this.f12806m1 = 0;
        this.n1 = new ArrayList();
        this.f12807o1 = new ArrayList();
        this.f12808p1 = new HashMap();
        this.f12809q1 = 0;
        this.f12810r1 = new HashSet();
        this.f12811s1 = true;
        this.f12812t1 = true;
        this.f12813u1 = false;
        this.f12814v1 = true;
        this.f12815w1 = true;
        this.f12816x1 = false;
        this.f12817y1 = 0;
        this.f12818z1 = 1;
        this.A1 = new ArrayList();
        this.D1 = 1;
        this.E1 = 4;
        this.G1 = new HashMap();
        this.H1 = 86400;
        this.I1 = new Paint(1);
        this.P1 = true;
        this.Q1 = false;
        P0(context);
        this.f12803i1.setAdapter(new q7(this, context, 1));
    }
}
