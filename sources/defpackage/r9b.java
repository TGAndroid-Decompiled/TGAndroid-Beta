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
public final class r9b extends FrameLayout implements View.OnClickListener, fn7 {
    public final p55 E;
    public final az7 F;
    public boolean G;
    public id H;
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
    public final w9b a0;
    public final zh6 b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final d79 f;
    public final x46 h;
    public final n9b n;
    public final p9b r;
    public final View s;
    public final c51 w;
    public final c51 x;
    public final l9b y;

    public r9b(w9b w9bVar, Context context) {
        super(context);
        this.a0 = w9bVar;
        this.b = new zh6();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i = w9b.X1;
        p55 p55Var = new p55(context, w9bVar.J0);
        this.E = p55Var;
        l9b l9bVar = new l9b(this, context, w9bVar.J0, new i9b(this, (byte) 4));
        this.y = l9bVar;
        int i2 = aob.h5;
        yob.h(i2, w9bVar.J0, l9bVar);
        l9bVar.setOnSearchTextChange(new j9b(this, (byte) 3));
        az7 az7Var = new az7(context, w9bVar.J0);
        this.F = az7Var;
        az7Var.h = new i9b(this, (byte) 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, hl.L(56.0f) + hl.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, tre.e(-1, -1, 119));
        d79 d79Var = new d79(context, w9bVar.J0);
        this.f = d79Var;
        d79Var.setClipToPadding(false);
        d79Var.setTranslateSelector(true);
        n9b n9bVar = new n9b(this, context, w9bVar.J0, l9bVar, new c68(w9bVar, (byte) 2));
        this.n = n9bVar;
        d79Var.setAdapter(n9bVar);
        n9bVar.h = d79Var;
        x46 x46Var = new x46();
        this.h = x46Var;
        d79Var.setLayoutManager(x46Var);
        d79Var.setOnScrollListener(new n52(this, (byte) 2));
        d79Var.setOnItemClickListener(new yw9(this, context, (byte) 7));
        frameLayout.addView(d79Var, tre.c(-1.0f, -1));
        m9b m9bVar = new m9b(this);
        m9bVar.n(350L);
        m9bVar.o(k43.h);
        m9bVar.C = false;
        m9bVar.m = false;
        d79Var.setItemAnimator(m9bVar);
        frameLayout.addView(l9bVar, tre.e(-1, -2, 55));
        frameLayout.addView(p55Var, tre.e(-1, 32, 55));
        addView(az7Var, tre.e(-1, -2, 55));
        p9b p9bVar = new p9b(this, context);
        this.r = p9bVar;
        p9bVar.setClickable(true);
        p9bVar.setOrientation(1);
        p9bVar.setPadding(hl.L(10.0f) + w9bVar.u0, hl.L(10.0f), hl.L(10.0f) + w9bVar.u0, hl.L(10.0f));
        yob.h(i2, w9bVar.J0, p9bVar);
        c51 c51Var = new c51(w9bVar.J0, context, true);
        this.w = c51Var;
        c51Var.setOnClickListener(new k9b(this, (byte) 1));
        c51Var.f();
        p9bVar.addView(c51Var, tre.r(-1, 48, 87));
        c51 c51Var2 = new c51(w9bVar.J0, context, false);
        this.x = c51Var2;
        c51Var2.setOnClickListener(new k9b(this, (byte) 2));
        c51Var2.f();
        p9bVar.addView(c51Var2, tre.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        yob.h(i2, w9bVar.J0, view);
        addView(view, tre.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(p9bVar, tre.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = hl.I3(lbc.r(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !uh9.t(" ", str, lowerCase)) {
                    String lowerCase2 = hl.I3(lbc.p(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !uh9.t(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                TLRPC.TL_username tL_username = arrayList.get(i);
                                if (tL_username.active && hl.I3(tL_username.username).toLowerCase().startsWith(str)) {
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
                String lowerCase3 = hl.I3(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str) && !uh9.t(" ", str, lowerCase3)) {
                    String lowerCase4 = hl.I3(xc2.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !uh9.t(" ", str, lowerCase4)) {
                        ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                        if (arrayList2 != null) {
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                TLRPC.TL_username tL_username2 = arrayList2.get(i2);
                                if (tL_username2.active && hl.I3(tL_username2.username).toLowerCase().startsWith(str)) {
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
            int i = w9b.X1;
            arrayList.addAll(uc7.s1(this.a0.a).O1().L);
            int i2 = 0;
            while (true) {
                zh6 zh6Var = this.b;
                if (i2 >= zh6Var.m()) {
                    break;
                }
                long j = zh6Var.j(i2);
                if (((Boolean) zh6Var.n(i2)).booleanValue()) {
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
        w9b w9bVar = this.a0;
        if (i == 4) {
            arrayList.addAll(w9bVar.n1);
            hashMap.putAll(w9bVar.o1);
        } else if (i == 5) {
            arrayList.addAll(w9bVar.D1);
        } else if (i == 1) {
            int i3 = w9b.X1;
            ArrayList I0 = w9bVar.I0();
            for (int i4 = 0; i4 < I0.size(); i4 = dze.c(i4, 1, ((TLRPC.User) I0.get(i4)).id, arrayList)) {
            }
        } else if (i == 2) {
            arrayList.addAll(w9bVar.q1);
        } else if (i == 3) {
            arrayList.addAll(w9bVar.r1);
            hashMap.putAll(w9bVar.s1);
        } else if (i == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.j1(false);
        j(false);
        l9b l9bVar = this.y;
        l9bVar.setText("");
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        l9bVar.setVisibility(i2);
        l9bVar.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i5 = this.a;
        d79 d79Var = this.f;
        if (i5 != 0) {
            d79Var.x0(0);
        }
        d79Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i = 0;
        float f = -c00.d(150.0f, Math.min(hl.L(150.0f), this.y.L), 0);
        while (true) {
            d79 d79Var = this.f;
            if (i < d79Var.getChildCount()) {
                View childAt = d79Var.getChildAt(i);
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
        id idVar;
        if (i == jn7.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (idVar = this.H) != null && this.I == chatFull.id) {
            idVar.b(350L);
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
        w9b w9bVar = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                long j2 = chatParticipants.participants.get(i3).user_id;
                int i4 = w9b.X1;
                TLRPC.User X1 = uc7.s1(w9bVar.a).X1(Long.valueOf(j2));
                if (X1 != null && !lbc.D(X1) && !X1.bot && X1.id != 777000 && j2 != 0) {
                    if (z && !X1.contact) {
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
                int i5 = w9b.X1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, w9bVar.J0, context);
                alertDialog$Builder.a.U = ob6.M0(2131744192, null);
                ik8.y(null, 2131752570, alertDialog$Builder, null);
                return;
            }
            Context context2 = getContext();
            int i6 = w9b.X1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, w9bVar.J0, context2);
            alertDialog$Builder2.a.U = ob6.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
            alertDialog$Builder2.j(ob6.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new ps0(this, j, arrayList, (byte) 10));
            ik8.y(null, 2131752570, alertDialog$Builder2, null);
            return;
        }
        this.d.put(Long.valueOf(j), arrayList);
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.b.k(((Long) obj).longValue(), Boolean.TRUE);
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
        w9b w9bVar = this.a0;
        c51 c51Var = this.x;
        int i3 = 0;
        boolean z3 = false;
        c51 c51Var2 = this.w;
        if (i2 == 0) {
            c51Var2.setShowZero(false);
            c51Var2.setEnabled(true);
            c51Var2.c(0, z);
            if (w9bVar.F1) {
                c51Var2.i(ob6.M0(2131744208, null), z, true);
            } else if (w9bVar.T1) {
                c51Var2.i(ob6.M0(2131744208, null), z, true);
            } else {
                int i4 = w9bVar.C1;
                if (i4 == 1) {
                    if (w9bVar.E1) {
                        i = 2131744273;
                    } else {
                        i = 2131744212;
                    }
                    c51Var2.i(ob6.M0(i, null), z, true);
                } else {
                    c51Var2.i(ob6.H(',', "StoryPrivacyButtonPostMultiple", i4), z, true);
                }
            }
            c51Var.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i2 == 1) {
            c51Var2.setShowZero(false);
            c51Var2.setEnabled(true);
            c51Var2.i(ob6.M0(2131744207, null), z, true);
            c51Var2.c(arrayList.size(), z);
            c51Var.setVisibility(8);
            return;
        }
        p9b p9bVar = this.r;
        if (i2 == 3) {
            int size = w9b.N0(arrayList, this.d).size();
            w9bVar.t1 = size;
            c51Var2.i(ob6.M0(2131744208, null), z, true);
            c51Var2.setShowZero(false);
            if (size <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            p9bVar.a(z2, z);
            c51Var2.c(size, z);
            if (size > 0) {
                z3 = true;
            }
            c51Var2.setEnabled(z3);
            c51Var.setVisibility(8);
        } else if (i2 == 2) {
            c51Var2.setShowZero(false);
            c51Var2.setEnabled(true);
            if (arrayList.isEmpty()) {
                c51Var2.i(ob6.M0(2131744208, null), z, true);
                c51Var2.c(0, z);
            } else {
                c51Var2.i(ob6.M0(2131744213, null), z, true);
                c51Var2.c(arrayList.size(), z);
            }
            c51Var.setVisibility(8);
        } else if (i2 == 5) {
            c51Var2.setShowZero(true);
            c51Var2.setEnabled(!arrayList.isEmpty());
            c51Var2.c(arrayList.size(), z);
            c51Var.setVisibility(8);
        } else if (i2 == 6) {
            c51Var2.setShowZero(false);
            c51Var2.setEnabled(true);
            c51Var2.i(ob6.M0(2131744207, null), z, true);
            int i5 = w9b.X1;
            c6b O1 = uc7.s1(w9bVar.a).O1();
            if (!O1.O) {
                while (true) {
                    zh6 zh6Var = this.b;
                    if (i3 >= zh6Var.m()) {
                        break;
                    }
                    long j = zh6Var.j(i3);
                    ((Boolean) zh6Var.n(i3)).getClass();
                    O1.L.contains(Long.valueOf(j));
                    i3++;
                }
            } else {
                c51Var2.c(arrayList.size(), z);
            }
            c51Var.setVisibility(8);
        } else if (i2 == 4) {
            int size2 = w9b.N0(w9bVar.n1, w9bVar.o1).size();
            w9bVar.p1 = size2;
            c51Var2.i(ob6.M0(2131744208, null), z, true);
            c51Var2.setShowZero(false);
            p9bVar.a(false, z);
            c51Var2.c(size2, z);
            c51Var2.setEnabled(true);
            c51Var.setVisibility(8);
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        int S;
        boolean z2;
        w9b w9bVar = this.a0;
        ArrayList arrayList2 = w9bVar.D1;
        HashMap hashMap = w9bVar.s1;
        ArrayList arrayList3 = w9bVar.r1;
        ArrayList arrayList4 = w9bVar.q1;
        HashMap hashMap2 = w9bVar.o1;
        ArrayList arrayList5 = w9bVar.n1;
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
        if (this.a == 3 && (w9bVar.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i2 = this.S;
                if (i2 != -1) {
                    w9bVar.H1 = i2;
                }
            } else {
                this.S = w9bVar.H1;
                w9bVar.H1 = 3;
            }
        }
        HashSet N0 = w9b.N0(arrayList6, hashMap3);
        int i3 = 0;
        while (true) {
            arrayList = this.M;
            boolean z3 = true;
            if (i3 >= arrayList.size()) {
                break;
            }
            h9b h9bVar = (h9b) arrayList.get(i3);
            if (h9bVar != null) {
                byte b = h9bVar.i;
                if (b > 0) {
                    if (w9bVar.H1 != b) {
                        z3 = false;
                    }
                    h9bVar.k = z3;
                    h9bVar.l = false;
                } else {
                    TLRPC.User user = h9bVar.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        h9bVar.k = contains;
                        if (contains || !N0.contains(Long.valueOf(h9bVar.g.id))) {
                            z3 = false;
                        }
                        h9bVar.l = z3;
                    } else {
                        TLRPC.Chat chat = h9bVar.h;
                        if (chat != null) {
                            h9bVar.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            h9bVar.l = false;
                        }
                    }
                }
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            d79 d79Var = this.f;
            if (i4 < d79Var.getChildCount()) {
                View childAt = d79Var.getChildAt(i4);
                if ((childAt instanceof v9b) && (S = RecyclerView.S(childAt)) >= 0 && S < arrayList.size()) {
                    h9b h9bVar2 = (h9b) arrayList.get(S);
                    v9b v9bVar = (v9b) childAt;
                    if (!h9bVar2.k && !h9bVar2.l) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    v9bVar.c(z2, z);
                    TLRPC.Chat chat2 = h9bVar2.h;
                    float f = 1.0f;
                    if (chat2 != null) {
                        if (w9bVar.K0(chat2) > 200) {
                            f = 0.3f;
                        }
                        v9bVar.b(z, f);
                    } else {
                        if (h9bVar2.l && !h9bVar2.k) {
                            f = 0.5f;
                        }
                        v9bVar.b(z, f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9b.h(boolean):void");
    }

    public final void i(boolean z) {
        p55 p55Var = this.E;
        if (p55Var == null) {
            return;
        }
        if (w9b.N0(this.c, this.d).size() > 0) {
            p55Var.a(ob6.M0(2131743285, null), new k9b(this, (byte) 0));
        } else if (z) {
            p55Var.setRightText(null);
        } else {
            si siVar = p55Var.b;
            siVar.c(null, false, true);
            siVar.setOnClickListener(null);
            siVar.setVisibility(0);
        }
    }

    public final void j(boolean z) {
        l9b l9bVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        HashSet N0 = w9b.N0(this.c, this.d);
        int i = this.a;
        w9b w9bVar = this.a0;
        if (i == 3) {
            w9bVar.t1 = N0.size();
        } else if (i == 4) {
            w9bVar.p1 = N0.size();
        }
        uc7 s1 = uc7.s1(w9bVar.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (true) {
            l9bVar = this.y;
            ArrayList arrayList4 = l9bVar.e;
            arrayList = l9bVar.e;
            if (i2 >= arrayList4.size()) {
                break;
            }
            zc5 zc5Var = (zc5) arrayList.get(i2);
            if (!N0.contains(Long.valueOf(zc5Var.getUid()))) {
                arrayList2.add(zc5Var);
            }
            i2++;
        }
        Iterator it = N0.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            int i3 = 0;
            while (true) {
                if (i3 < arrayList.size()) {
                    if (((zc5) arrayList.get(i3)).getUid() != longValue) {
                        i3++;
                    }
                } else {
                    if (longValue >= 0) {
                        M0 = s1.X1(l);
                    } else {
                        M0 = s1.M0(l);
                    }
                    Object obj = M0;
                    if (obj != null) {
                        zc5 zc5Var2 = new zc5(getContext(), obj, null, true, w9bVar.J0);
                        zc5Var2.setOnClickListener(this);
                        arrayList3.add(zc5Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        a3a a3aVar = l9bVar.d;
        ArrayList arrayList5 = a3aVar.e;
        ArrayList arrayList6 = a3aVar.d;
        ArrayList arrayList7 = a3aVar.f;
        t9b t9bVar = (t9b) a3aVar.n;
        t9bVar.I = true;
        ArrayList arrayList8 = t9bVar.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = a3aVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            ((zc5) arrayList2.get(i4)).setOnClickListener(null);
        }
        a3aVar.c();
        if (z) {
            a3aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            a3aVar.b = animatorSet;
            animatorSet.addListener(new s9b(a3aVar, arrayList2, (byte) 0));
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
                zc5 zc5Var3 = (zc5) arrayList2.get(i5);
                arrayList5.add(zc5Var3);
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var3, property, 1.0f, 0.0f));
                i5++;
            }
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                zc5 zc5Var4 = (zc5) arrayList3.get(i6);
                arrayList6.add(zc5Var4);
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                a3aVar.removeView((View) arrayList2.get(i7));
            }
            arrayList9.clear();
            a3aVar.b = null;
            a3aVar.c = false;
            t9bVar.b.setAllowDrawCursor(true);
        }
        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
            a3aVar.addView((View) arrayList3.get(i8));
        }
        a3aVar.requestLayout();
    }

    public final void k() {
        float c = c();
        boolean z = this.N;
        boolean z2 = false;
        float f = 1.0f;
        l9b l9bVar = this.y;
        if (!z && !this.V && getTranslationX() == 0.0f) {
            if (!this.O || Math.abs(this.P - c) > 1.0f) {
                this.O = true;
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                float translationY = l9bVar.getTranslationY();
                this.P = c;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new ija(this, (byte) 19));
                this.Q.addListener(new po9(this, (byte) 27));
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
            l9bVar.setTranslationY(c);
        }
        boolean z3 = this.G;
        az7 az7Var = this.F;
        if (!z3) {
            az7Var.setVisibility(8);
            return;
        }
        az7Var.setVisibility(0);
        float f2 = -az7Var.getHeight();
        int i = 0;
        while (true) {
            d79 d79Var = this.f;
            if (i < d79Var.getChildCount()) {
                View childAt = d79Var.getChildAt(i);
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
            gd0 gd0Var = (gd0) az7Var.e;
            if (z2 || this.a != 0) {
                f = 0.0f;
            }
            gd0Var.c(true, f);
        }
        az7Var.setTranslationY(Math.max(hl.m, f2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = w9b.X1;
        jn7.f(this.a0.a).b(this, jn7.T);
    }

    @Override
    public final void onClick(View view) {
        l9b l9bVar = this.y;
        if (!l9bVar.e.contains(view)) {
            return;
        }
        zc5 zc5Var = (zc5) view;
        if (zc5Var.E) {
            l9bVar.f = null;
            a3a a3aVar = l9bVar.d;
            t9b t9bVar = (t9b) a3aVar.n;
            t9bVar.I = true;
            t9bVar.e.remove(zc5Var);
            zc5Var.setOnClickListener(null);
            a3aVar.c();
            a3aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            a3aVar.b = animatorSet;
            animatorSet.addListener(new wd8((Object) a3aVar, (Object) zc5Var, (byte) 18));
            ArrayList arrayList = a3aVar.h;
            arrayList.clear();
            arrayList.add(zc5Var);
            ArrayList arrayList2 = a3aVar.d;
            arrayList2.clear();
            a3aVar.e.clear();
            arrayList2.add(zc5Var);
            ArrayList arrayList3 = a3aVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(zc5Var, View.ALPHA, 1.0f, 0.0f));
            a3aVar.requestLayout();
            long uid = zc5Var.getUid();
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
            zc5 zc5Var2 = l9bVar.f;
            if (zc5Var2 != null) {
                zc5Var2.a();
                l9bVar.f = null;
            }
            l9bVar.f = zc5Var;
            zc5Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = w9b.X1;
        jn7.f(this.a0.a).n(this, jn7.T);
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
        int i3 = w9b.X1;
        w9b w9bVar = this.a0;
        int i4 = w9bVar.f;
        if (i4 > 0) {
            this.U = i4;
        }
        super.onMeasure(i, i2);
        int i5 = hl.m;
        if (this.a == 0) {
            L = 0;
        } else {
            L = hl.L(56.0f);
        }
        this.e.setPadding(0, i5 + L, 0, 0);
        boolean z = this.W;
        boolean z2 = w9bVar.d;
        p9b p9bVar = this.r;
        d79 d79Var = this.f;
        if (z != z2) {
            float c = c();
            if (w9bVar.d && c + Math.min(hl.L(150.0f), this.y.L) > d79Var.getPaddingTop()) {
                z46 z46Var = new z46(getContext(), 2, 0.7f);
                z46Var.a = 1;
                z46Var.p = -hl.L(56.0f);
                this.h.v0(z46Var);
            }
            int i6 = this.a;
            boolean z3 = w9bVar.d;
            View view = this.s;
            float f3 = 0.0f;
            if (i6 == 0) {
                if (z3) {
                    f2 = this.U;
                } else {
                    f2 = 0.0f;
                }
                p9bVar.setTranslationY(f2);
                if (w9bVar.d) {
                    f3 = this.U;
                }
                view.setTranslationY(f3);
            } else {
                int i7 = this.U;
                if (!z3) {
                    i7 = -i7;
                }
                float f4 = i7;
                ValueAnimator valueAnimator = p9bVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p9bVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, 0.0f);
                p9bVar.d = ofFloat;
                ofFloat.addUpdateListener(new o9b(p9bVar, (byte) 1));
                p9bVar.d.addListener(new po9(p9bVar, (byte) 28));
                p9bVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = p9bVar.d;
                k43 k43Var = hb.w;
                valueAnimator2.setInterpolator(k43Var);
                p9bVar.d.start();
                boolean z4 = w9bVar.d;
                int i8 = this.U;
                if (z4) {
                    f = i8;
                } else {
                    f = -i8;
                }
                view.setTranslationY(f);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(k43Var).withEndAction(new i9b(this, (byte) 0)).start();
            }
            this.W = w9bVar.d;
        }
        d79Var.setPadding(0, 0, 0, p9bVar.getMeasuredHeight());
    }
}
