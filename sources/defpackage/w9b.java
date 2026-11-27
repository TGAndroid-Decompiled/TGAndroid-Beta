package defpackage;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w9b extends nx0 implements fn7 {
    public static final int X1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public final ArrayList D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public int H1;
    public boolean I1;
    public HashMap J1;
    public int K1;
    public final Paint L1;
    public ArrayList M1;
    public f9b N1;
    public pcc O1;
    public j9b P1;
    public pcc Q1;
    public dab R1;
    public final boolean S1;
    public boolean T1;
    public boolean U1;
    public BitmapDrawable V1;
    public bab W1;
    public ir1 l1;
    public TLRPC.InputPeer m1;
    public final ArrayList n1;
    public final HashMap o1;
    public int p1;
    public final ArrayList q1;
    public final ArrayList r1;
    public final HashMap s1;
    public int t1;
    public final HashSet u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    public w9b(Context context, int i, x53 x53Var) {
        super(1, (vnb) x53Var, context, true);
        boolean z;
        char c;
        boolean z2 = true;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        HashMap hashMap = new HashMap();
        this.o1 = hashMap;
        char c2 = 0;
        this.p1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.q1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.r1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.s1 = hashMap2;
        this.t1 = 0;
        this.u1 = new HashSet();
        this.v1 = true;
        this.w1 = true;
        this.x1 = false;
        this.y1 = true;
        this.z1 = true;
        this.A1 = false;
        this.B1 = 0;
        this.C1 = 1;
        this.D1 = new ArrayList();
        this.G1 = 1;
        this.H1 = 4;
        this.J1 = new HashMap();
        this.K1 = 86400;
        this.L1 = new Paint(1);
        this.S1 = true;
        this.T1 = false;
        this.K1 = i;
        String string = uc7.s1(this.a).Y3.getString("story_prv_contacts", null);
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
        String string2 = uc7.s1(this.a).Y3.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i2 = 0;
            while (i2 < split2.length) {
                String[] split3 = split2[i2].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c2]);
                        z = z2;
                        ArrayList arrayList4 = new ArrayList();
                        c = c2;
                        for (int i3 = z; i3 < split3.length; i3++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i3])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i2++;
                    c2 = c;
                    z2 = z;
                }
                z = z2;
                c = c2;
                i2++;
                c2 = c;
                z2 = z;
            }
        }
        boolean z3 = z2;
        ?? r23 = c2;
        String string3 = uc7.s1(this.a).Y3.getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (int i4 = r23 == true ? 1 : 0; i4 < split4.length; i4++) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(split4[i4])));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = uc7.s1(this.a).Y3.getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i5 = r23 == true ? 1 : 0; i5 < split5.length; i5++) {
                String[] split6 = split5[i5].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i6 = z3; i6 < split6.length; i6++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i6])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = uc7.s1(this.a).Y3.getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (int i7 = r23 == true ? 1 : 0; i7 < split7.length; i7++) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(split7[i7])));
                } catch (Exception unused5) {
                }
            }
        }
        this.t1 = N0(arrayList3, hashMap2).size();
        this.p1 = N0(arrayList, hashMap).size();
        this.w1 = !uc7.s1(this.a).Y3.getBoolean("story_noforwards", r23);
        this.x1 = uc7.s1(this.a).Y3.getBoolean("story_keep", z3);
        L0(context);
        this.l1.setAdapter(new z8b(this, context, (byte) 0));
        kf7 a0 = kf7.a0(this.a);
        a0.a.c(new n3b(this, a0, (byte) 26));
        uc7.s1(this.a).O1().R();
        uc7.s1(this.a).O1().T();
    }

    public static HashSet N0(ArrayList arrayList, HashMap hashMap) {
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
    public final boolean D() {
        View currentView = this.l1.getCurrentView();
        if (currentView instanceof r9b) {
            return ((r9b) currentView).T;
        }
        return true;
    }

    public final void F0(boolean z) {
        View[] viewPages;
        this.y1 = z;
        ir1 ir1Var = this.l1;
        if (ir1Var != null) {
            for (View view : ir1Var.getViewPages()) {
                if (view instanceof r9b) {
                    ((r9b) view).f(false);
                }
            }
        }
    }

    public final void G0() {
        View[] viewPages;
        l9b l9bVar;
        for (View view : this.l1.getViewPages()) {
            if ((view instanceof r9b) && (l9bVar = ((r9b) view).y) != null) {
                hl.t1(l9bVar.b);
            }
        }
    }

    @Override
    public final void H() {
        jn7.f(this.a).n(this, jn7.N);
        jn7.f(this.a).n(this, jn7.c3);
        jn7.f(this.a).n(this, jn7.e3);
        super.H();
    }

    public final void H0(u9b u9bVar, Runnable runnable, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.M1 != null) {
            uc7 s1 = uc7.s1(this.a);
            for (int i = 0; i < this.M1.size(); i++) {
                String str = (String) this.M1.get(i);
                TLObject c2 = s1.c2(str);
                if (c2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) c2;
                    TLRPC.User X12 = s1.X1(Long.valueOf(user.id));
                    if (X12 != null) {
                        user = X12;
                    }
                    if (!user.bot && !u9bVar.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        c51 c51Var = null;
        if (!arrayList.isEmpty() && !z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < Math.min(2, arrayList.size()); i2++) {
                if (i2 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i2)));
                spannableString.setSpan(new y7c(hl.o()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            String M0 = ob6.M0(2131744143, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.G2(ob6.M0(2131744142, null), spannableStringBuilder, "%s");
            alertDialog$Builder.j(ob6.M0(2131746472, null), new o48(this, u9bVar, runnable, (byte) 16));
            ik8.y(null, 2131752570, alertDialog$Builder, null);
            return;
        }
        View view = this.l1.getViewPages()[0];
        if (view instanceof r9b) {
            c51Var = ((r9b) view).w;
        }
        if (c51Var != null) {
            c51Var.setLoading(true);
        }
        f9b f9bVar = this.N1;
        if (f9bVar != null) {
            f9bVar.c(u9bVar, this.v1, this.w1, this.x1, this.A1, this.m1, this.B1, new n3b(c51Var, runnable, (byte) 28), new s8b(c51Var, (byte) 1));
        } else {
            runnable.run();
        }
    }

    public final ArrayList I0() {
        ArrayList J0 = J0();
        int i = 0;
        while (i < J0.size()) {
            TLObject tLObject = (TLObject) J0.get(i);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                J0.remove(i);
                i--;
            }
            i++;
        }
        return J0;
    }

    public final ArrayList J0() {
        TLRPC.User X12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = lv2.r(this.a).f0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            lv2.r(this.a).A(0L, false);
        }
        uc7 s1 = uc7.s1(this.a);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i);
                if (tL_contact != null && (X12 = s1.X1(Long.valueOf(tL_contact.user_id))) != null && !lbc.D(X12) && !X12.bot && X12.id != 777000) {
                    arrayList.add(X12);
                }
            }
        }
        return arrayList;
    }

    public final int K0(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull N0 = uc7.s1(this.a).N0(chat.id);
        if (N0 != null && (i = N0.participants_count) > 0) {
            return i;
        }
        HashMap hashMap = this.J1;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void L0(Context context) {
        v21.a(this.c, new py((byte) 13));
        jn7.f(this.a).b(this, jn7.N);
        jn7.f(this.a).b(this, jn7.c3);
        jn7.f(this.a).b(this, jn7.e3);
        int i = aob.h5;
        this.L1.setColor(aob.v0(i, this.J0));
        L(i);
        this.b = new so2(this, context);
        ir1 ir1Var = new ir1((byte) 8, context, this);
        this.l1 = ir1Var;
        int i2 = this.u0;
        ir1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(this.l1, tre.e(-1, -1, 119));
    }

    public final void M0(boolean z) {
        View[] viewPages;
        this.T1 = z;
        ir1 ir1Var = this.l1;
        if (ir1Var != null) {
            for (View view : ir1Var.getViewPages()) {
                if (view instanceof r9b) {
                    r9b r9bVar = (r9b) view;
                    r9bVar.h(false);
                    r9bVar.f(false);
                }
            }
        }
    }

    public final void O0(int i) {
        View[] viewPages;
        this.C1 = i;
        ir1 ir1Var = this.l1;
        if (ir1Var != null) {
            for (View view : ir1Var.getViewPages()) {
                if (view instanceof r9b) {
                    ((r9b) view).f(false);
                }
            }
        }
    }

    public final void P0(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View[] viewPages;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(bitmap);
        }
        this.V1 = bitmapDrawable;
        ir1 ir1Var = this.l1;
        if (ir1Var != null) {
            for (View view : ir1Var.getViewPages()) {
                if (view instanceof r9b) {
                    r9b r9bVar = (r9b) view;
                    r9bVar.h(false);
                    r9bVar.f(false);
                }
            }
        }
    }

    public final void Q0() {
        this.E1 = true;
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof r9b) {
            r9b r9bVar = (r9b) view;
            r9bVar.b(r9bVar.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof r9b) {
            r9b r9bVar2 = (r9b) view2;
            r9bVar2.b(r9bVar2.a);
        }
    }

    public final void R0(TLRPC.InputPeer inputPeer) {
        this.m1 = inputPeer;
        this.u1.clear();
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof r9b) {
            r9b r9bVar = (r9b) view;
            r9bVar.b(r9bVar.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof r9b) {
            r9b r9bVar2 = (r9b) view2;
            r9bVar2.b(r9bVar2.a);
        }
    }

    public final void S0(u9b u9bVar) {
        if (u9bVar != null) {
            HashMap hashMap = u9bVar.d;
            int i = u9bVar.a;
            ArrayList arrayList = u9bVar.c;
            this.H1 = i;
            if (i == 2) {
                ArrayList arrayList2 = this.q1;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i == 3) {
                ArrayList arrayList3 = this.r1;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.s1;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.t1 = N0(arrayList3, hashMap2).size();
            } else if (i == 4) {
                ArrayList arrayList4 = this.n1;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.o1;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.p1 = N0(arrayList4, hashMap3).size();
            }
            if (i == 5) {
                this.I1 = true;
                this.G1 = 5;
                ArrayList arrayList5 = this.D1;
                arrayList5.clear();
                arrayList5.addAll(u9bVar.f);
                this.l1.setPosition(1);
            }
            View[] viewPages = this.l1.getViewPages();
            View view = viewPages[0];
            if (view instanceof r9b) {
                r9b r9bVar = (r9b) view;
                r9bVar.b(r9bVar.a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof r9b) {
                r9b r9bVar2 = (r9b) view2;
                r9bVar2.b(r9bVar2.a);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ir1 ir1Var = this.l1;
        if (ir1Var != null) {
            int i3 = 0;
            if (i == jn7.N) {
                View[] viewPages = ir1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof r9b) {
                    ((r9b) view).h(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof r9b) {
                    ((r9b) view2).h(true);
                }
            } else if (i == jn7.c3) {
                View[] viewPages2 = ir1Var.getViewPages();
                while (i3 < viewPages2.length) {
                    View view3 = viewPages2[i3];
                    if (view3 instanceof r9b) {
                        r9b r9bVar = (r9b) view3;
                        int i4 = r9bVar.a;
                        if (i4 == 6) {
                            r9bVar.a(true);
                        } else if (i4 == 0) {
                            r9bVar.h(true);
                        }
                    }
                    i3++;
                }
            } else if (i == jn7.e3) {
                View[] viewPages3 = ir1Var.getViewPages();
                while (i3 < viewPages3.length) {
                    View view4 = viewPages3[i3];
                    if (view4 instanceof r9b) {
                        r9b r9bVar2 = (r9b) view4;
                        if (r9bVar2.a == 0) {
                            r9bVar2.h(true);
                        }
                    }
                    i3++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        u9b u9bVar;
        u9b u9bVar2;
        pcc pccVar = this.O1;
        ArrayList arrayList = this.q1;
        HashMap hashMap = this.o1;
        ArrayList arrayList2 = this.n1;
        HashMap hashMap2 = this.s1;
        ArrayList arrayList3 = this.r1;
        if (pccVar != null) {
            int i = this.H1;
            if (i == 3) {
                u9bVar2 = new u9b(this.H1, this.a, new ArrayList(N0(arrayList3, hashMap2)));
                ArrayList arrayList4 = u9bVar2.c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = u9bVar2.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i == 4) {
                u9bVar2 = new u9b(this.H1, this.a, new ArrayList(N0(arrayList2, hashMap)));
                ArrayList arrayList5 = u9bVar2.c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = u9bVar2.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else {
                int i2 = this.a;
                if (i == 2) {
                    u9bVar = new u9b(i, i2, arrayList);
                } else {
                    u9bVar = new u9b(i, i2, (ArrayList) null);
                }
                u9bVar2 = u9bVar;
            }
            this.O1.a(u9bVar2);
            this.O1 = null;
        }
        v21.h(this.c);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        uc7.s1(this.a).Y3.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb2.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.w1).putBoolean("story_keep", this.x1).apply();
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        if (this.l1.getCurrentPosition() > 0) {
            G0();
            ir1 ir1Var = this.l1;
            ir1Var.F(ir1Var.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            this.L1.setColor(aob.v0(aob.h5, this.J0));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public w9b(Context context, vnb vnbVar) {
        super(1, vnbVar, context, true);
        this.n1 = new ArrayList();
        this.o1 = new HashMap();
        this.p1 = 0;
        this.q1 = new ArrayList();
        this.r1 = new ArrayList();
        this.s1 = new HashMap();
        this.t1 = 0;
        this.u1 = new HashSet();
        this.v1 = true;
        this.w1 = true;
        this.x1 = false;
        this.y1 = true;
        this.z1 = true;
        this.A1 = false;
        this.B1 = 0;
        this.C1 = 1;
        this.D1 = new ArrayList();
        this.G1 = 1;
        this.H1 = 4;
        this.J1 = new HashMap();
        this.K1 = 86400;
        this.L1 = new Paint(1);
        this.S1 = true;
        this.T1 = false;
        L0(context);
        this.l1.setAdapter(new z8b(this, context, (byte) 1));
    }
}
