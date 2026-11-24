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
public final class v7b extends FrameLayout implements View.OnClickListener, jm7 {
    public final l55 E;
    public final wx7 F;
    public boolean G;
    public he H;
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
    public final a8b a0;
    public final vh6 b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final r59 f;
    public final u46 h;
    public final r7b n;
    public final t7b r;
    public final View s;
    public final b61 w;
    public final b61 x;
    public final o7b y;

    public v7b(a8b a8bVar, Context context) {
        super(context);
        this.a0 = a8bVar;
        this.b = new vh6();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i = a8b.X1;
        l55 l55Var = new l55(context, a8bVar.J0);
        this.E = l55Var;
        o7b o7bVar = new o7b(this, context, a8bVar.J0, new m7b(this, (byte) 4));
        this.y = o7bVar;
        int i2 = cmb.g5;
        anb.h(i2, a8bVar.J0, o7bVar);
        o7bVar.setOnSearchTextChange(new n7b(this, (byte) 3));
        wx7 wx7Var = new wx7(context, a8bVar.J0);
        this.F = wx7Var;
        wx7Var.h = new m7b(this, (byte) 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, gm.L(56.0f) + gm.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, qoe.e(-1, -1, 119));
        r59 r59Var = new r59(context, a8bVar.J0);
        this.f = r59Var;
        r59Var.setClipToPadding(false);
        r59Var.setTranslateSelector(true);
        r7b r7bVar = new r7b(this, context, a8bVar.J0, o7bVar, new s48(a8bVar, (byte) 2));
        this.n = r7bVar;
        r59Var.setAdapter(r7bVar);
        r7bVar.h = r59Var;
        u46 u46Var = new u46();
        this.h = u46Var;
        r59Var.setLayoutManager(u46Var);
        r59Var.setOnScrollListener(new i62(this, (byte) 2));
        r59Var.setOnItemClickListener(new xr8(this, context, (byte) 22));
        frameLayout.addView(r59Var, qoe.c(-1.0f, -1));
        p7b p7bVar = new p7b(this);
        p7bVar.n(350L);
        p7bVar.o(d53.h);
        p7bVar.C = false;
        p7bVar.m = false;
        r59Var.setItemAnimator(p7bVar);
        frameLayout.addView(o7bVar, qoe.e(-1, -2, 55));
        frameLayout.addView(l55Var, qoe.e(-1, 32, 55));
        addView(wx7Var, qoe.e(-1, -2, 55));
        t7b t7bVar = new t7b(this, context);
        this.r = t7bVar;
        t7bVar.setClickable(true);
        t7bVar.setOrientation(1);
        t7bVar.setPadding(gm.L(10.0f) + a8bVar.u0, gm.L(10.0f), gm.L(10.0f) + a8bVar.u0, gm.L(10.0f));
        anb.h(i2, a8bVar.J0, t7bVar);
        b61 b61Var = new b61(a8bVar.J0, context, true);
        this.w = b61Var;
        b61Var.setOnClickListener(new l7b(this, (byte) 0));
        b61Var.f();
        t7bVar.addView(b61Var, qoe.r(-1, 48, 87));
        b61 b61Var2 = new b61(a8bVar.J0, context, false);
        this.x = b61Var2;
        b61Var2.setOnClickListener(new l7b(this, (byte) 1));
        b61Var2.f();
        t7bVar.addView(b61Var2, qoe.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        anb.h(i2, a8bVar.J0, view);
        addView(view, qoe.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(t7bVar, qoe.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = gm.I3(m9c.r(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !hg9.s(" ", str, lowerCase)) {
                    String lowerCase2 = gm.I3(m9c.p(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !hg9.s(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                TLRPC.TL_username tL_username = arrayList.get(i);
                                if (tL_username.active && gm.I3(tL_username.username).toLowerCase().startsWith(str)) {
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
                String lowerCase3 = gm.I3(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str) && !hg9.s(" ", str, lowerCase3)) {
                    String lowerCase4 = gm.I3(sd2.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !hg9.s(" ", str, lowerCase4)) {
                        ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                        if (arrayList2 != null) {
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                TLRPC.TL_username tL_username2 = arrayList2.get(i2);
                                if (tL_username2.active && gm.I3(tL_username2.username).toLowerCase().startsWith(str)) {
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
            int i = a8b.X1;
            arrayList.addAll(oc7.r1(this.a0.a).N1().L);
            int i2 = 0;
            while (true) {
                vh6 vh6Var = this.b;
                if (i2 >= vh6Var.m()) {
                    break;
                }
                long j = vh6Var.j(i2);
                if (((Boolean) vh6Var.n(i2)).booleanValue()) {
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
        a8b a8bVar = this.a0;
        if (i == 4) {
            arrayList.addAll(a8bVar.n1);
            hashMap.putAll(a8bVar.o1);
        } else if (i == 5) {
            arrayList.addAll(a8bVar.D1);
        } else if (i == 1) {
            int i3 = a8b.X1;
            ArrayList H0 = a8bVar.H0();
            for (int i4 = 0; i4 < H0.size(); i4 = mle.c(i4, 1, ((TLRPC.User) H0.get(i4)).id, arrayList)) {
            }
        } else if (i == 2) {
            arrayList.addAll(a8bVar.q1);
        } else if (i == 3) {
            arrayList.addAll(a8bVar.r1);
            hashMap.putAll(a8bVar.s1);
        } else if (i == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.j1(false);
        j(false);
        o7b o7bVar = this.y;
        o7bVar.setText("");
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        o7bVar.setVisibility(i2);
        o7bVar.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i5 = this.a;
        r59 r59Var = this.f;
        if (i5 != 0) {
            r59Var.w0(0);
        }
        r59Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i = 0;
        float f = -b10.c(150.0f, Math.min(gm.L(150.0f), this.y.L), 0);
        while (true) {
            r59 r59Var = this.f;
            if (i < r59Var.getChildCount()) {
                View childAt = r59Var.getChildAt(i);
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
        he heVar;
        if (i == nm7.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (heVar = this.H) != null && this.I == chatFull.id) {
            heVar.b(350L);
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
        a8b a8bVar = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                long j2 = chatParticipants.participants.get(i3).user_id;
                int i4 = a8b.X1;
                TLRPC.User W1 = oc7.r1(a8bVar.a).W1(Long.valueOf(j2));
                if (W1 != null && !m9c.D(W1) && !W1.bot && W1.id != 777000 && j2 != 0) {
                    if (z && !W1.contact) {
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
                int i5 = a8b.X1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, a8bVar.J0, context);
                alertDialog$Builder.a.U = jb6.M0(2131744224, null);
                wi8.y(null, 2131752542, alertDialog$Builder, null);
                return;
            }
            Context context2 = getContext();
            int i6 = a8b.X1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, a8bVar.J0, context2);
            alertDialog$Builder2.a.U = jb6.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
            alertDialog$Builder2.j(jb6.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new pt0(this, j, arrayList, (byte) 9));
            wi8.y(null, 2131752542, alertDialog$Builder2, null);
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
        a8b a8bVar = this.a0;
        b61 b61Var = this.x;
        int i3 = 0;
        boolean z3 = false;
        b61 b61Var2 = this.w;
        if (i2 == 0) {
            b61Var2.setShowZero(false);
            b61Var2.setEnabled(true);
            b61Var2.c(0, z);
            if (a8bVar.F1) {
                b61Var2.i(jb6.M0(2131744240, null), z, true);
            } else if (a8bVar.T1) {
                b61Var2.i(jb6.M0(2131744240, null), z, true);
            } else {
                int i4 = a8bVar.C1;
                if (i4 == 1) {
                    if (a8bVar.E1) {
                        i = 2131744305;
                    } else {
                        i = 2131744244;
                    }
                    b61Var2.i(jb6.M0(i, null), z, true);
                } else {
                    b61Var2.i(jb6.H(',', "StoryPrivacyButtonPostMultiple", i4), z, true);
                }
            }
            b61Var.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i2 == 1) {
            b61Var2.setShowZero(false);
            b61Var2.setEnabled(true);
            b61Var2.i(jb6.M0(2131744239, null), z, true);
            b61Var2.c(arrayList.size(), z);
            b61Var.setVisibility(8);
            return;
        }
        t7b t7bVar = this.r;
        if (i2 == 3) {
            int size = a8b.M0(arrayList, this.d).size();
            a8bVar.t1 = size;
            b61Var2.i(jb6.M0(2131744240, null), z, true);
            b61Var2.setShowZero(false);
            if (size <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            t7bVar.a(z2, z);
            b61Var2.c(size, z);
            if (size > 0) {
                z3 = true;
            }
            b61Var2.setEnabled(z3);
            b61Var.setVisibility(8);
        } else if (i2 == 2) {
            b61Var2.setShowZero(false);
            b61Var2.setEnabled(true);
            if (arrayList.isEmpty()) {
                b61Var2.i(jb6.M0(2131744240, null), z, true);
                b61Var2.c(0, z);
            } else {
                b61Var2.i(jb6.M0(2131744245, null), z, true);
                b61Var2.c(arrayList.size(), z);
            }
            b61Var.setVisibility(8);
        } else if (i2 == 5) {
            b61Var2.setShowZero(true);
            b61Var2.setEnabled(!arrayList.isEmpty());
            b61Var2.c(arrayList.size(), z);
            b61Var.setVisibility(8);
        } else if (i2 == 6) {
            b61Var2.setShowZero(false);
            b61Var2.setEnabled(true);
            b61Var2.i(jb6.M0(2131744239, null), z, true);
            int i5 = a8b.X1;
            h4b N1 = oc7.r1(a8bVar.a).N1();
            if (!N1.O) {
                while (true) {
                    vh6 vh6Var = this.b;
                    if (i3 >= vh6Var.m()) {
                        break;
                    }
                    long j = vh6Var.j(i3);
                    ((Boolean) vh6Var.n(i3)).getClass();
                    N1.L.contains(Long.valueOf(j));
                    i3++;
                }
            } else {
                b61Var2.c(arrayList.size(), z);
            }
            b61Var.setVisibility(8);
        } else if (i2 == 4) {
            int size2 = a8b.M0(a8bVar.n1, a8bVar.o1).size();
            a8bVar.p1 = size2;
            b61Var2.i(jb6.M0(2131744240, null), z, true);
            b61Var2.setShowZero(false);
            t7bVar.a(false, z);
            b61Var2.c(size2, z);
            b61Var2.setEnabled(true);
            b61Var.setVisibility(8);
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        int R;
        boolean z2;
        a8b a8bVar = this.a0;
        ArrayList arrayList2 = a8bVar.D1;
        HashMap hashMap = a8bVar.s1;
        ArrayList arrayList3 = a8bVar.r1;
        ArrayList arrayList4 = a8bVar.q1;
        HashMap hashMap2 = a8bVar.o1;
        ArrayList arrayList5 = a8bVar.n1;
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
        if (this.a == 3 && (a8bVar.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i2 = this.S;
                if (i2 != -1) {
                    a8bVar.H1 = i2;
                }
            } else {
                this.S = a8bVar.H1;
                a8bVar.H1 = 3;
            }
        }
        HashSet M0 = a8b.M0(arrayList6, hashMap3);
        int i3 = 0;
        while (true) {
            arrayList = this.M;
            boolean z3 = true;
            if (i3 >= arrayList.size()) {
                break;
            }
            k7b k7bVar = (k7b) arrayList.get(i3);
            if (k7bVar != null) {
                byte b = k7bVar.i;
                if (b > 0) {
                    if (a8bVar.H1 != b) {
                        z3 = false;
                    }
                    k7bVar.k = z3;
                    k7bVar.l = false;
                } else {
                    TLRPC.User user = k7bVar.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        k7bVar.k = contains;
                        if (contains || !M0.contains(Long.valueOf(k7bVar.g.id))) {
                            z3 = false;
                        }
                        k7bVar.l = z3;
                    } else {
                        TLRPC.Chat chat = k7bVar.h;
                        if (chat != null) {
                            k7bVar.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            k7bVar.l = false;
                        }
                    }
                }
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            r59 r59Var = this.f;
            if (i4 < r59Var.getChildCount()) {
                View childAt = r59Var.getChildAt(i4);
                if ((childAt instanceof z7b) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    k7b k7bVar2 = (k7b) arrayList.get(R);
                    z7b z7bVar = (z7b) childAt;
                    if (!k7bVar2.k && !k7bVar2.l) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z7bVar.c(z2, z);
                    TLRPC.Chat chat2 = k7bVar2.h;
                    float f = 1.0f;
                    if (chat2 != null) {
                        if (a8bVar.J0(chat2) > 200) {
                            f = 0.3f;
                        }
                        z7bVar.b(z, f);
                    } else {
                        if (k7bVar2.l && !k7bVar2.k) {
                            f = 0.5f;
                        }
                        z7bVar.b(z, f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7b.h(boolean):void");
    }

    public final void i(boolean z) {
        l55 l55Var = this.E;
        if (l55Var == null) {
            return;
        }
        if (a8b.M0(this.c, this.d).size() > 0) {
            l55Var.a(jb6.M0(2131743317, null), new l7b(this, (byte) 2));
        } else if (z) {
            l55Var.setRightText(null);
        } else {
            rj rjVar = l55Var.b;
            rjVar.c(null, false, true);
            rjVar.setOnClickListener(null);
            rjVar.setVisibility(0);
        }
    }

    public final void j(boolean z) {
        o7b o7bVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object L0;
        HashSet M0 = a8b.M0(this.c, this.d);
        int i = this.a;
        a8b a8bVar = this.a0;
        if (i == 3) {
            a8bVar.t1 = M0.size();
        } else if (i == 4) {
            a8bVar.p1 = M0.size();
        }
        oc7 r1 = oc7.r1(a8bVar.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (true) {
            o7bVar = this.y;
            ArrayList arrayList4 = o7bVar.e;
            arrayList = o7bVar.e;
            if (i2 >= arrayList4.size()) {
                break;
            }
            wc5 wc5Var = (wc5) arrayList.get(i2);
            if (!M0.contains(Long.valueOf(wc5Var.getUid()))) {
                arrayList2.add(wc5Var);
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
                    if (((wc5) arrayList.get(i3)).getUid() != longValue) {
                        i3++;
                    }
                } else {
                    if (longValue >= 0) {
                        L0 = r1.W1(l);
                    } else {
                        L0 = r1.L0(l);
                    }
                    Object obj = L0;
                    if (obj != null) {
                        wc5 wc5Var2 = new wc5(getContext(), obj, null, true, a8bVar.J0);
                        wc5Var2.setOnClickListener(this);
                        arrayList3.add(wc5Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        i1a i1aVar = o7bVar.d;
        ArrayList arrayList5 = i1aVar.e;
        ArrayList arrayList6 = i1aVar.d;
        ArrayList arrayList7 = i1aVar.f;
        x7b x7bVar = (x7b) i1aVar.n;
        x7bVar.I = true;
        ArrayList arrayList8 = x7bVar.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = i1aVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            ((wc5) arrayList2.get(i4)).setOnClickListener(null);
        }
        i1aVar.c();
        if (z) {
            i1aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            i1aVar.b = animatorSet;
            animatorSet.addListener(new w7b(i1aVar, arrayList2, (byte) 0));
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
                wc5 wc5Var3 = (wc5) arrayList2.get(i5);
                arrayList5.add(wc5Var3);
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var3, property, 1.0f, 0.0f));
                i5++;
            }
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                wc5 wc5Var4 = (wc5) arrayList3.get(i6);
                arrayList6.add(wc5Var4);
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                i1aVar.removeView((View) arrayList2.get(i7));
            }
            arrayList9.clear();
            i1aVar.b = null;
            i1aVar.c = false;
            x7bVar.b.setAllowDrawCursor(true);
        }
        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
            i1aVar.addView((View) arrayList3.get(i8));
        }
        i1aVar.requestLayout();
    }

    public final void k() {
        float c = c();
        boolean z = this.N;
        boolean z2 = false;
        float f = 1.0f;
        o7b o7bVar = this.y;
        if (!z && !this.V && getTranslationX() == 0.0f) {
            if (!this.O || Math.abs(this.P - c) > 1.0f) {
                this.O = true;
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                float translationY = o7bVar.getTranslationY();
                this.P = c;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new rha(this, (byte) 19));
                this.Q.addListener(new q7b(this, (byte) 0));
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
            o7bVar.setTranslationY(c);
        }
        boolean z3 = this.G;
        wx7 wx7Var = this.F;
        if (!z3) {
            wx7Var.setVisibility(8);
            return;
        }
        wx7Var.setVisibility(0);
        float f2 = -wx7Var.getHeight();
        int i = 0;
        while (true) {
            r59 r59Var = this.f;
            if (i < r59Var.getChildCount()) {
                View childAt = r59Var.getChildAt(i);
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
            ee0 ee0Var = (ee0) wx7Var.e;
            if (z2 || this.a != 0) {
                f = 0.0f;
            }
            ee0Var.c(true, f);
        }
        wx7Var.setTranslationY(Math.max(gm.m, f2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = a8b.X1;
        nm7.f(this.a0.a).b(this, nm7.T);
    }

    @Override
    public final void onClick(View view) {
        o7b o7bVar = this.y;
        if (!o7bVar.e.contains(view)) {
            return;
        }
        wc5 wc5Var = (wc5) view;
        if (wc5Var.E) {
            o7bVar.f = null;
            i1a i1aVar = o7bVar.d;
            x7b x7bVar = (x7b) i1aVar.n;
            x7bVar.I = true;
            x7bVar.e.remove(wc5Var);
            wc5Var.setOnClickListener(null);
            i1aVar.c();
            i1aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            i1aVar.b = animatorSet;
            animatorSet.addListener(new ic8((Object) i1aVar, (Object) wc5Var, (byte) 18));
            ArrayList arrayList = i1aVar.h;
            arrayList.clear();
            arrayList.add(wc5Var);
            ArrayList arrayList2 = i1aVar.d;
            arrayList2.clear();
            i1aVar.e.clear();
            arrayList2.add(wc5Var);
            ArrayList arrayList3 = i1aVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(wc5Var, View.ALPHA, 1.0f, 0.0f));
            i1aVar.requestLayout();
            long uid = wc5Var.getUid();
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
            wc5 wc5Var2 = o7bVar.f;
            if (wc5Var2 != null) {
                wc5Var2.a();
                o7bVar.f = null;
            }
            o7bVar.f = wc5Var;
            wc5Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = a8b.X1;
        nm7.f(this.a0.a).n(this, nm7.T);
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
        int i3 = a8b.X1;
        a8b a8bVar = this.a0;
        int i4 = a8bVar.f;
        if (i4 > 0) {
            this.U = i4;
        }
        super.onMeasure(i, i2);
        int i5 = gm.m;
        if (this.a == 0) {
            L = 0;
        } else {
            L = gm.L(56.0f);
        }
        this.e.setPadding(0, i5 + L, 0, 0);
        boolean z = this.W;
        boolean z2 = a8bVar.d;
        t7b t7bVar = this.r;
        r59 r59Var = this.f;
        if (z != z2) {
            float c = c();
            if (a8bVar.d && c + Math.min(gm.L(150.0f), this.y.L) > r59Var.getPaddingTop()) {
                w46 w46Var = new w46(getContext(), 2, 0.7f);
                w46Var.a = 1;
                w46Var.p = -gm.L(56.0f);
                this.h.v0(w46Var);
            }
            int i6 = this.a;
            boolean z3 = a8bVar.d;
            View view = this.s;
            float f3 = 0.0f;
            if (i6 == 0) {
                if (z3) {
                    f2 = this.U;
                } else {
                    f2 = 0.0f;
                }
                t7bVar.setTranslationY(f2);
                if (a8bVar.d) {
                    f3 = this.U;
                }
                view.setTranslationY(f3);
            } else {
                int i7 = this.U;
                if (!z3) {
                    i7 = -i7;
                }
                float f4 = i7;
                ValueAnimator valueAnimator = t7bVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    t7bVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, 0.0f);
                t7bVar.d = ofFloat;
                ofFloat.addUpdateListener(new s7b(t7bVar, (byte) 1));
                t7bVar.d.addListener(new q7b(t7bVar, (byte) 1));
                t7bVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = t7bVar.d;
                d53 d53Var = gb.w;
                valueAnimator2.setInterpolator(d53Var);
                t7bVar.d.start();
                boolean z4 = a8bVar.d;
                int i8 = this.U;
                if (z4) {
                    f = i8;
                } else {
                    f = -i8;
                }
                view.setTranslationY(f);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(d53Var).withEndAction(new m7b(this, (byte) 2)).start();
            }
            this.W = a8bVar.d;
        }
        r59Var.setPadding(0, 0, 0, t7bVar.getMeasuredHeight());
    }
}
