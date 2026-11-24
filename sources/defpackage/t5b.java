package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t5b extends FrameLayout implements View.OnClickListener, gk7 {
    public final l35 E;
    public final tv7 F;
    public boolean G;
    public hd H;
    public long I;
    public String J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public float P;
    public ValueAnimator Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public int a;
    public final y5b a0;
    public final vf6 b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final o39 f;
    public final t26 h;
    public final p5b n;
    public final r5b r;
    public final View s;
    public final u41 w;
    public final u41 x;
    public final n5b y;

    public t5b(y5b y5bVar, Context context) {
        super(context);
        this.a0 = y5bVar;
        this.b = new vf6();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i = y5b.X1;
        l35 l35Var = new l35(context, y5bVar.J0);
        this.E = l35Var;
        n5b n5bVar = new n5b(this, context, y5bVar.J0, new l5b(this, (byte) 4));
        this.y = n5bVar;
        int i2 = bkb.g5;
        zkb.h(i2, y5bVar.J0, n5bVar);
        n5bVar.setOnSearchTextChange(new m5b(this, (byte) 3));
        tv7 tv7Var = new tv7(context, y5bVar.J0);
        this.F = tv7Var;
        tv7Var.h = new l5b(this, (byte) 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, gl.L(56.0f) + gl.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, nme.e(-1, -1, 119));
        o39 o39Var = new o39(context, y5bVar.J0);
        this.f = o39Var;
        o39Var.setClipToPadding(false);
        o39Var.setTranslateSelector(true);
        p5b p5bVar = new p5b(this, context, y5bVar.J0, n5bVar, new p28(y5bVar, (byte) 2));
        this.n = p5bVar;
        o39Var.setAdapter(p5bVar);
        p5bVar.h = o39Var;
        t26 t26Var = new t26();
        this.h = t26Var;
        o39Var.setLayoutManager(t26Var);
        o39Var.setOnScrollListener(new x42(this, (byte) 2));
        o39Var.setOnItemClickListener(new kq8(this, context, (byte) 21));
        frameLayout.addView(o39Var, nme.c(-1.0f, -1));
        o5b o5bVar = new o5b(this);
        o5bVar.n(350L);
        o5bVar.o(s33.h);
        o5bVar.C = false;
        o5bVar.m = false;
        o39Var.setItemAnimator(o5bVar);
        frameLayout.addView(n5bVar, nme.e(-1, -2, 55));
        frameLayout.addView(l35Var, nme.e(-1, 32, 55));
        addView(tv7Var, nme.e(-1, -2, 55));
        r5b r5bVar = new r5b(this, context);
        this.r = r5bVar;
        r5bVar.setClickable(true);
        r5bVar.setOrientation(1);
        r5bVar.setPadding(gl.L(10.0f) + y5bVar.u0, gl.L(10.0f), gl.L(10.0f) + y5bVar.u0, gl.L(10.0f));
        zkb.h(i2, y5bVar.J0, r5bVar);
        u41 u41Var = new u41(y5bVar.J0, context, true);
        this.w = u41Var;
        u41Var.setOnClickListener(new k5b(this, (byte) 0));
        u41Var.f();
        r5bVar.addView(u41Var, nme.r(-1, 48, 87));
        u41 u41Var2 = new u41(y5bVar.J0, context, false);
        this.x = u41Var2;
        u41Var2.setOnClickListener(new k5b(this, (byte) 1));
        u41Var2.f();
        r5bVar.addView(u41Var2, nme.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        zkb.h(i2, y5bVar.J0, view);
        addView(view, nme.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(r5bVar, nme.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = gl.J3(l7c.q(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !de9.t(" ", str, lowerCase)) {
                    String lowerCase2 = gl.J3(l7c.o(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !de9.t(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                TLRPC.TL_username tL_username = arrayList.get(i);
                                if (tL_username.active && gl.J3(tL_username.username).toLowerCase().startsWith(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                String lowerCase3 = gl.J3(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str) && !de9.t(" ", str, lowerCase3)) {
                    String lowerCase4 = gl.J3(hc2.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !de9.t(" ", str, lowerCase4)) {
                        ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                        if (arrayList2 != null) {
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                TLRPC.TL_username tL_username2 = arrayList2.get(i2);
                                if (tL_username2.active && gl.J3(tL_username2.username).toLowerCase().startsWith(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void a(boolean z) {
        if (this.a == 6) {
            ArrayList arrayList = this.c;
            arrayList.clear();
            int i = y5b.X1;
            arrayList.addAll(na7.q1(this.a0.a).M1().L);
            int i2 = 0;
            while (true) {
                vf6 vf6Var = this.b;
                if (i2 >= vf6Var.m()) {
                    break;
                }
                long j = vf6Var.j(i2);
                if (((Boolean) vf6Var.n(i2)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j))) {
                        arrayList.add(Long.valueOf(j));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j));
                }
                i2++;
            }
            if (z) {
                h(true);
                f(true);
                g(true);
            }
        }
    }

    public final void b(int i) {
        int i2;
        this.a = i;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        y5b y5bVar = this.a0;
        if (i == 4) {
            arrayList.addAll(y5bVar.n1);
            hashMap.putAll(y5bVar.o1);
        } else if (i == 5) {
            arrayList.addAll(y5bVar.D1);
        } else if (i == 1) {
            int i3 = y5b.X1;
            ArrayList H0 = y5bVar.H0();
            for (int i4 = 0; i4 < H0.size(); i4 = mue.c(i4, 1, ((TLRPC.User) H0.get(i4)).id, arrayList)) {
            }
        } else if (i == 2) {
            arrayList.addAll(y5bVar.q1);
        } else if (i == 3) {
            arrayList.addAll(y5bVar.r1);
            hashMap.putAll(y5bVar.s1);
        } else if (i == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.j1(false);
        j(false);
        n5b n5bVar = this.y;
        n5bVar.setText("");
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        n5bVar.setVisibility(i2);
        n5bVar.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i5 = this.a;
        o39 o39Var = this.f;
        if (i5 != 0) {
            o39Var.w0(0);
        }
        o39Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i = 0;
        float f = -b00.c(150.0f, Math.min(gl.L(150.0f), this.y.L), 0);
        while (true) {
            o39 o39Var = this.f;
            if (i < o39Var.getChildCount()) {
                View childAt = o39Var.getChildAt(i);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f, childAt.getY());
                }
                i++;
            } else {
                return f;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        hd hdVar;
        if (i == kk7.S && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (hdVar = this.H) != null && this.I == chatFull.id) {
            hdVar.b(350L);
            this.H = null;
            this.I = -1L;
            e(chatFull.id, chatFull.participants);
        }
    }

    public final void e(long j, TLRPC.ChatParticipants chatParticipants) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = this.a;
        int i2 = 0;
        if (i != 1 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        y5b y5bVar = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                long j2 = chatParticipants.participants.get(i3).user_id;
                int i4 = y5b.X1;
                TLRPC.User V1 = na7.q1(y5bVar.a).V1(Long.valueOf(j2));
                if (V1 != null && !l7c.C(V1) && !V1.bot && V1.id != 777000 && j2 != 0) {
                    if (z && !V1.contact) {
                        arrayList2.add(Long.valueOf(j2));
                    } else {
                        arrayList.add(Long.valueOf(j2));
                    }
                    this.c.remove(Long.valueOf(j2));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                int i5 = y5b.X1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, y5bVar.J0, context);
                alertDialog$Builder.a.U = k96.M0(2131744298, null);
                ug8.y(null, 2131752577, alertDialog$Builder, null);
                return;
            }
            Context context2 = getContext();
            int i6 = y5b.X1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, y5bVar.J0, context2);
            alertDialog$Builder2.a.U = k96.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
            alertDialog$Builder2.j(k96.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new hs0(this, j, arrayList, (byte) 9));
            ug8.y(null, 2131752577, alertDialog$Builder2, null);
            return;
        }
        this.d.put(Long.valueOf(j), arrayList);
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        j(true);
        f(true);
        g(true);
        this.y.M = true;
    }

    public final void f(boolean z) {
        boolean z2;
        int i;
        int i2 = this.a;
        y5b y5bVar = this.a0;
        u41 u41Var = this.x;
        int i3 = 0;
        boolean z3 = false;
        u41 u41Var2 = this.w;
        if (i2 == 0) {
            u41Var2.setShowZero(false);
            u41Var2.setEnabled(true);
            u41Var2.c(0, z);
            if (y5bVar.F1) {
                u41Var2.i(k96.M0(2131744314, null), z, true);
            } else if (y5bVar.T1) {
                u41Var2.i(k96.M0(2131744314, null), z, true);
            } else {
                int i4 = y5bVar.C1;
                if (i4 == 1) {
                    if (y5bVar.E1) {
                        i = 2131744379;
                    } else {
                        i = 2131744318;
                    }
                    u41Var2.i(k96.M0(i, null), z, true);
                } else {
                    u41Var2.i(k96.H(',', "StoryPrivacyButtonPostMultiple", i4), z, true);
                }
            }
            u41Var.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i2 == 1) {
            u41Var2.setShowZero(false);
            u41Var2.setEnabled(true);
            u41Var2.i(k96.M0(2131744313, null), z, true);
            u41Var2.c(arrayList.size(), z);
            u41Var.setVisibility(8);
            return;
        }
        r5b r5bVar = this.r;
        if (i2 == 3) {
            int size = y5b.M0(arrayList, this.d).size();
            y5bVar.t1 = size;
            u41Var2.i(k96.M0(2131744314, null), z, true);
            u41Var2.setShowZero(false);
            if (size <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            r5bVar.a(z2, z);
            u41Var2.c(size, z);
            if (size > 0) {
                z3 = true;
            }
            u41Var2.setEnabled(z3);
            u41Var.setVisibility(8);
        } else if (i2 == 2) {
            u41Var2.setShowZero(false);
            u41Var2.setEnabled(true);
            if (arrayList.isEmpty()) {
                u41Var2.i(k96.M0(2131744314, null), z, true);
                u41Var2.c(0, z);
            } else {
                u41Var2.i(k96.M0(2131744319, null), z, true);
                u41Var2.c(arrayList.size(), z);
            }
            u41Var.setVisibility(8);
        } else if (i2 == 5) {
            u41Var2.setShowZero(true);
            u41Var2.setEnabled(!arrayList.isEmpty());
            u41Var2.c(arrayList.size(), z);
            u41Var.setVisibility(8);
        } else if (i2 == 6) {
            u41Var2.setShowZero(false);
            u41Var2.setEnabled(true);
            u41Var2.i(k96.M0(2131744313, null), z, true);
            int i5 = y5b.X1;
            g2b M1 = na7.q1(y5bVar.a).M1();
            if (!M1.O) {
                while (true) {
                    vf6 vf6Var = this.b;
                    if (i3 >= vf6Var.m()) {
                        break;
                    }
                    long j = vf6Var.j(i3);
                    ((Boolean) vf6Var.n(i3)).getClass();
                    M1.L.contains(Long.valueOf(j));
                    i3++;
                }
            } else {
                u41Var2.c(arrayList.size(), z);
            }
            u41Var.setVisibility(8);
        } else if (i2 == 4) {
            int size2 = y5b.M0(y5bVar.n1, y5bVar.o1).size();
            y5bVar.p1 = size2;
            u41Var2.i(k96.M0(2131744314, null), z, true);
            u41Var2.setShowZero(false);
            r5bVar.a(false, z);
            u41Var2.c(size2, z);
            u41Var2.setEnabled(true);
            u41Var.setVisibility(8);
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        int R;
        boolean z2;
        y5b y5bVar = this.a0;
        ArrayList arrayList2 = y5bVar.D1;
        HashMap hashMap = y5bVar.s1;
        ArrayList arrayList3 = y5bVar.r1;
        ArrayList arrayList4 = y5bVar.q1;
        HashMap hashMap2 = y5bVar.o1;
        ArrayList arrayList5 = y5bVar.n1;
        int i = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (y5bVar.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i2 = this.S;
                if (i2 != -1) {
                    y5bVar.H1 = i2;
                }
            } else {
                this.S = y5bVar.H1;
                y5bVar.H1 = 3;
            }
        }
        HashSet M0 = y5b.M0(arrayList6, hashMap3);
        int i3 = 0;
        while (true) {
            arrayList = this.M;
            boolean z3 = true;
            if (i3 >= arrayList.size()) {
                break;
            }
            j5b j5bVar = (j5b) arrayList.get(i3);
            if (j5bVar != null) {
                byte b = j5bVar.i;
                if (b > 0) {
                    if (y5bVar.H1 != b) {
                        z3 = false;
                    }
                    j5bVar.k = z3;
                    j5bVar.l = false;
                } else {
                    TLRPC.User user = j5bVar.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        j5bVar.k = contains;
                        if (contains || !M0.contains(Long.valueOf(j5bVar.g.id))) {
                            z3 = false;
                        }
                        j5bVar.l = z3;
                    } else {
                        TLRPC.Chat chat = j5bVar.h;
                        if (chat != null) {
                            j5bVar.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            j5bVar.l = false;
                        }
                    }
                }
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            o39 o39Var = this.f;
            if (i4 < o39Var.getChildCount()) {
                View childAt = o39Var.getChildAt(i4);
                if ((childAt instanceof x5b) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    j5b j5bVar2 = (j5b) arrayList.get(R);
                    x5b x5bVar = (x5b) childAt;
                    if (!j5bVar2.k && !j5bVar2.l) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    x5bVar.c(z2, z);
                    TLRPC.Chat chat2 = j5bVar2.h;
                    float f = 1.0f;
                    if (chat2 != null) {
                        if (y5bVar.J0(chat2) > 200) {
                            f = 0.3f;
                        }
                        x5bVar.b(z, f);
                    } else {
                        if (j5bVar2.l && !j5bVar2.k) {
                            f = 0.5f;
                        }
                        x5bVar.b(z, f);
                    }
                }
                i4++;
            } else {
                i(z);
                return;
            }
        }
    }

    public final void h(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t5b.h(boolean):void");
    }

    public final void i(boolean z) {
        l35 l35Var = this.E;
        if (l35Var == null) {
            return;
        }
        if (y5b.M0(this.c, this.d).size() > 0) {
            l35Var.a(k96.M0(2131743391, null), new k5b(this, (byte) 2));
        } else if (z) {
            l35Var.setRightText(null);
        } else {
            ri riVar = l35Var.b;
            riVar.c(null, false, true);
            riVar.setOnClickListener(null);
            riVar.setVisibility(0);
        }
    }

    public final void j(boolean z) {
        n5b n5bVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object K0;
        HashSet M0 = y5b.M0(this.c, this.d);
        int i = this.a;
        y5b y5bVar = this.a0;
        if (i == 3) {
            y5bVar.t1 = M0.size();
        } else if (i == 4) {
            y5bVar.p1 = M0.size();
        }
        na7 q1 = na7.q1(y5bVar.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (true) {
            n5bVar = this.y;
            ArrayList arrayList4 = n5bVar.e;
            arrayList = n5bVar.e;
            if (i2 >= arrayList4.size()) {
                break;
            }
            ya5 ya5Var = (ya5) arrayList.get(i2);
            if (!M0.contains(Long.valueOf(ya5Var.getUid()))) {
                arrayList2.add(ya5Var);
            }
            i2++;
        }
        Iterator it = M0.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            int i3 = 0;
            while (true) {
                if (i3 < arrayList.size()) {
                    if (((ya5) arrayList.get(i3)).getUid() != longValue) {
                        i3++;
                    }
                } else {
                    if (longValue >= 0) {
                        K0 = q1.V1(l);
                    } else {
                        K0 = q1.K0(l);
                    }
                    Object obj = K0;
                    if (obj != null) {
                        ya5 ya5Var2 = new ya5(getContext(), obj, null, true, y5bVar.J0);
                        ya5Var2.setOnClickListener(this);
                        arrayList3.add(ya5Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        gz9 gz9Var = n5bVar.d;
        ArrayList arrayList5 = gz9Var.e;
        ArrayList arrayList6 = gz9Var.d;
        ArrayList arrayList7 = gz9Var.f;
        v5b v5bVar = (v5b) gz9Var.n;
        v5bVar.I = true;
        ArrayList arrayList8 = v5bVar.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = gz9Var.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            ((ya5) arrayList2.get(i4)).setOnClickListener(null);
        }
        gz9Var.c();
        if (z) {
            gz9Var.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gz9Var.b = animatorSet;
            animatorSet.addListener(new u5b(gz9Var, arrayList2, (byte) 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i5 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i5 >= size) {
                    break;
                }
                ya5 ya5Var3 = (ya5) arrayList2.get(i5);
                arrayList5.add(ya5Var3);
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var3, property, 1.0f, 0.0f));
                i5++;
            }
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                ya5 ya5Var4 = (ya5) arrayList3.get(i6);
                arrayList6.add(ya5Var4);
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                gz9Var.removeView((View) arrayList2.get(i7));
            }
            arrayList9.clear();
            gz9Var.b = null;
            gz9Var.c = false;
            v5bVar.b.setAllowDrawCursor(true);
        }
        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
            gz9Var.addView((View) arrayList3.get(i8));
        }
        gz9Var.requestLayout();
    }

    public final void k() {
        float c = c();
        boolean z = this.N;
        boolean z2 = false;
        float f = 1.0f;
        n5b n5bVar = this.y;
        if (!z && !this.V && getTranslationX() == 0.0f) {
            if (!this.O || Math.abs(this.P - c) > 1.0f) {
                this.O = true;
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                float translationY = n5bVar.getTranslationY();
                this.P = c;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new gja(this, (byte) 17));
                this.Q.addListener(new ng9(this, (byte) 28));
                this.Q.setInterpolator(new LinearInterpolator());
                this.Q.setDuration(180L);
                this.Q.start();
            }
        } else {
            this.O = false;
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.Q = null;
            }
            n5bVar.setTranslationY(c);
        }
        boolean z3 = this.G;
        tv7 tv7Var = this.F;
        if (!z3) {
            tv7Var.setVisibility(8);
            return;
        }
        tv7Var.setVisibility(0);
        float f2 = -tv7Var.getHeight();
        int i = 0;
        while (true) {
            o39 o39Var = this.f;
            if (i < o39Var.getChildCount()) {
                View childAt = o39Var.getChildAt(i);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f2 = this.e.getPaddingTop() + childAt.getY();
                    break;
                }
                i++;
            } else {
                z2 = true;
                break;
            }
        }
        if (this.R != z2) {
            this.R = z2;
            ed0 ed0Var = (ed0) tv7Var.e;
            if (z2 || this.a != 0) {
                f = 0.0f;
            }
            ed0Var.c(true, f);
        }
        tv7Var.setTranslationY(Math.max(gl.m, f2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = y5b.X1;
        kk7.f(this.a0.a).b(this, kk7.S);
    }

    @Override
    public final void onClick(View view) {
        n5b n5bVar = this.y;
        if (!n5bVar.e.contains(view)) {
            return;
        }
        ya5 ya5Var = (ya5) view;
        if (ya5Var.E) {
            n5bVar.f = null;
            gz9 gz9Var = n5bVar.d;
            v5b v5bVar = (v5b) gz9Var.n;
            v5bVar.I = true;
            v5bVar.e.remove(ya5Var);
            ya5Var.setOnClickListener(null);
            gz9Var.c();
            gz9Var.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gz9Var.b = animatorSet;
            animatorSet.addListener(new eh8((Object) gz9Var, (Object) ya5Var, (byte) 17));
            ArrayList arrayList = gz9Var.h;
            arrayList.clear();
            arrayList.add(ya5Var);
            ArrayList arrayList2 = gz9Var.d;
            arrayList2.clear();
            gz9Var.e.clear();
            arrayList2.add(ya5Var);
            ArrayList arrayList3 = gz9Var.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(ya5Var, View.ALPHA, 1.0f, 0.0f));
            gz9Var.requestLayout();
            long uid = ya5Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.c;
                if (hasNext) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                        it.remove();
                        arrayList4.addAll((Collection) entry.getValue());
                        arrayList4.remove(Long.valueOf(uid));
                    }
                } else {
                    arrayList4.remove(Long.valueOf(uid));
                    g(true);
                    f(true);
                    return;
                }
            }
        } else {
            ya5 ya5Var2 = n5bVar.f;
            if (ya5Var2 != null) {
                ya5Var2.a();
                n5bVar.f = null;
            }
            n5bVar.f = ya5Var;
            ya5Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = y5b.X1;
        kk7.f(this.a0.a).n(this, kk7.S);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        float f;
        float f2;
        int i3 = y5b.X1;
        y5b y5bVar = this.a0;
        int i4 = y5bVar.f;
        if (i4 > 0) {
            this.U = i4;
        }
        super.onMeasure(i, i2);
        int i5 = gl.m;
        if (this.a == 0) {
            L = 0;
        } else {
            L = gl.L(56.0f);
        }
        this.e.setPadding(0, i5 + L, 0, 0);
        boolean z = this.W;
        boolean z2 = y5bVar.d;
        r5b r5bVar = this.r;
        o39 o39Var = this.f;
        if (z != z2) {
            float c = c();
            if (y5bVar.d && c + Math.min(gl.L(150.0f), this.y.L) > o39Var.getPaddingTop()) {
                v26 v26Var = new v26(getContext(), 2, 0.7f);
                v26Var.a = 1;
                v26Var.p = -gl.L(56.0f);
                this.h.v0(v26Var);
            }
            int i6 = this.a;
            boolean z3 = y5bVar.d;
            View view = this.s;
            float f3 = 0.0f;
            if (i6 == 0) {
                if (z3) {
                    f2 = this.U;
                } else {
                    f2 = 0.0f;
                }
                r5bVar.setTranslationY(f2);
                if (y5bVar.d) {
                    f3 = this.U;
                }
                view.setTranslationY(f3);
            } else {
                int i7 = this.U;
                if (!z3) {
                    i7 = -i7;
                }
                float f4 = i7;
                ValueAnimator valueAnimator = r5bVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    r5bVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, 0.0f);
                r5bVar.d = ofFloat;
                ofFloat.addUpdateListener(new q5b(r5bVar, (byte) 1));
                r5bVar.d.addListener(new ng9(r5bVar, (byte) 29));
                r5bVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = r5bVar.d;
                s33 s33Var = gb.w;
                valueAnimator2.setInterpolator(s33Var);
                r5bVar.d.start();
                boolean z4 = y5bVar.d;
                int i8 = this.U;
                if (z4) {
                    f = i8;
                } else {
                    f = -i8;
                }
                view.setTranslationY(f);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(s33Var).withEndAction(new l5b(this, (byte) 2)).start();
            }
            this.W = y5bVar.d;
        }
        o39Var.setPadding(0, 0, 0, r5bVar.getMeasuredHeight());
    }
}
