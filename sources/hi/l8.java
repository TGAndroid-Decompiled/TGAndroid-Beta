package hi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.uj0;
public final class l8 extends FrameLayout implements View.OnClickListener, is {
    public final org.telegram.ui.Cells.x3 E;
    public final y7 F;
    public boolean G;
    public org.telegram.ui.ActionBar.t1 H;
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
    public int f14599a;
    public final q8 f14600a0;
    public final a0.h f14601b;
    public final ArrayList f14602c;
    public final HashMap d;
    public final FrameLayout f14603e;
    public final uj0 f14604f;
    public final v4.b0 h;
    public final h8 f14605n;
    public final j8 f14606r;
    public final View f14607s;
    public final d f14608w;
    public final d f14609x;
    public final e8 f14610y;

    public l8(q8 q8Var, Context context) {
        super(context);
        this.f14600a0 = q8Var;
        this.f14601b = new a0.h();
        this.f14602c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i7 = q8.Y1;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, q8Var.J0);
        this.E = x3Var;
        e8 e8Var = new e8(this, context, q8Var.J0, new b8(this, 4));
        this.f14610y = e8Var;
        int i10 = org.telegram.ui.ActionBar.j6.f28922h5;
        org.telegram.ui.ActionBar.q6.h(i10, e8Var, q8Var.J0);
        e8Var.setOnSearchTextChange(new c8(this, 3));
        y7 y7Var = new y7(context, q8Var.J0);
        this.F = y7Var;
        y7Var.h = new b8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14603e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f23603m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        uj0 uj0Var = new uj0(context, q8Var.J0);
        this.f14604f = uj0Var;
        uj0Var.setClipToPadding(false);
        uj0Var.setTranslateSelector(true);
        h8 h8Var = new h8(this, context, q8Var.J0, e8Var, new fi.q3(q8Var, 2));
        this.f14605n = h8Var;
        uj0Var.setAdapter(h8Var);
        h8Var.h = uj0Var;
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setOnScrollListener(new f8(0, this));
        uj0Var.setOnItemClickListener(new ab.g(20, this, context));
        frameLayout.addView(uj0Var, c8.ja.c(-1.0f, -1));
        g8 g8Var = new g8(this);
        g8Var.n(350L);
        g8Var.o(er.h);
        g8Var.C = false;
        g8Var.f58564m = false;
        uj0Var.setItemAnimator(g8Var);
        frameLayout.addView(e8Var, c8.ja.e(-1, -2, 55));
        frameLayout.addView(x3Var, c8.ja.e(-1, 32, 55));
        addView(y7Var, c8.ja.e(-1, -2, 55));
        j8 j8Var = new j8(this, context);
        this.f14606r = j8Var;
        j8Var.setClickable(true);
        j8Var.setOrientation(1);
        j8Var.setPadding(org.telegram.messenger.g0.L(10.0f) + q8Var.f29717u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + q8Var.f29717u0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.q6.h(i10, j8Var, q8Var.J0);
        d dVar = new d(context, q8Var.J0, true);
        this.f14608w = dVar;
        dVar.setOnClickListener(new a8(this, 0));
        dVar.f();
        j8Var.addView(dVar, c8.ja.r(-1, 48, 87));
        d dVar2 = new d(context, q8Var.J0, false);
        this.f14609x = dVar2;
        dVar2.setOnClickListener(new a8(this, 1));
        dVar2.f();
        j8Var.addView(dVar2, c8.ja.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f14607s = view;
        org.telegram.ui.ActionBar.q6.h(i10, view, q8Var.J0);
        addView(view, c8.ja.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(j8Var, c8.ja.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = org.telegram.messenger.g0.N3(q10.p(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !i5.c.A(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.N3(q10.n(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !i5.c.A(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                TLRPC.TL_username tL_username = arrayList.get(i7);
                                if (tL_username.active && org.telegram.messenger.g0.N3(tL_username.username).toLowerCase().startsWith(str)) {
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
                String lowerCase3 = org.telegram.messenger.g0.N3(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str) && !i5.c.A(" ", str, lowerCase3)) {
                    String lowerCase4 = org.telegram.messenger.g0.N3(org.telegram.messenger.t3.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !i5.c.A(" ", str, lowerCase4)) {
                        ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                        if (arrayList2 != null) {
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                TLRPC.TL_username tL_username2 = arrayList2.get(i10);
                                if (tL_username2.active && org.telegram.messenger.g0.N3(tL_username2.username).toLowerCase().startsWith(str)) {
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

    public final void a(boolean z10) {
        if (this.f14599a == 6) {
            ArrayList arrayList = this.f14602c;
            arrayList.clear();
            int i7 = q8.Y1;
            arrayList.addAll(np.s1(this.f14600a0.f29679a).P1().L);
            int i10 = 0;
            while (true) {
                a0.h hVar = this.f14601b;
                if (i10 >= hVar.m()) {
                    break;
                }
                long j3 = hVar.j(i10);
                if (((Boolean) hVar.n(i10)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j3))) {
                        arrayList.add(Long.valueOf(j3));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j3));
                }
                i10++;
            }
            if (z10) {
                h(true);
                f(true);
                g(true);
            }
        }
    }

    public final void b(int i7) {
        int i10;
        this.f14599a = i7;
        this.f14601b.b();
        ArrayList arrayList = this.f14602c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        q8 q8Var = this.f14600a0;
        if (i7 == 4) {
            arrayList.addAll(q8Var.f14919o1);
            hashMap.putAll(q8Var.f14920p1);
        } else if (i7 == 5) {
            arrayList.addAll(q8Var.E1);
        } else if (i7 == 1) {
            ArrayList J0 = q8.J0(q8Var);
            for (int i11 = 0; i11 < J0.size(); i11 = com.google.android.gms.internal.vision.e2.g(i11, 1, ((TLRPC.User) J0.get(i11)).f28200id, arrayList)) {
            }
        } else if (i7 == 2) {
            arrayList.addAll(q8Var.f14922r1);
        } else if (i7 == 3) {
            arrayList.addAll(q8Var.f14923s1);
            hashMap.putAll(q8Var.f14924t1);
        } else if (i7 == 6) {
            a(false);
        }
        this.f14605n.getClass();
        this.h.k1(false);
        j(false);
        e8 e8Var = this.f14610y;
        e8Var.setText("");
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        e8Var.setVisibility(i10);
        e8Var.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i12 = this.f14599a;
        uj0 uj0Var = this.f14604f;
        if (i12 != 0) {
            uj0Var.v0(0);
        }
        uj0Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i7 = 0;
        float f10 = -i5.c.d(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.f14610y.L), 0);
        while (true) {
            uj0 uj0Var = this.f14604f;
            if (i7 < uj0Var.getChildCount()) {
                View childAt = uj0Var.getChildAt(i7);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f10, childAt.getY());
                }
                i7++;
            } else {
                return f10;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.t1 t1Var;
        if (i7 == ns.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (t1Var = this.H) != null && this.I == chatFull.f28052id) {
            t1Var.c(350L);
            this.H = null;
            this.I = -1L;
            e(chatFull.f28052id, chatFull.participants);
        }
    }

    public final void e(long j3, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = this.f14599a;
        int i10 = 0;
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        q8 q8Var = this.f14600a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j10 = chatParticipants.participants.get(i11).user_id;
                int i12 = q8.Y1;
                TLRPC.User a22 = np.s1(q8Var.f29679a).a2(Long.valueOf(j10));
                if (a22 != null && !q10.B(a22) && !a22.bot && a22.f28200id != 777000 && j10 != 0) {
                    if (z10 && !a22.contact) {
                        arrayList2.add(Long.valueOf(j10));
                    } else {
                        arrayList.add(Long.valueOf(j10));
                    }
                    this.f14602c.remove(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                int i13 = q8.Y1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, q8Var.J0);
                alertDialog$Builder.f28392a.U = hd.M0(2131744538, null);
                i5.c.x(null, 2131752589, alertDialog$Builder, null);
                return;
            }
            Context context2 = getContext();
            int i14 = q8.Y1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, q8Var.J0);
            alertDialog$Builder2.f28392a.U = hd.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
            alertDialog$Builder2.k(hd.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new di.h(this, j3, arrayList, 2));
            i5.c.x(null, 2131752589, alertDialog$Builder2, null);
            return;
        }
        this.d.put(Long.valueOf(j3), arrayList);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f14601b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        j(true);
        f(true);
        g(true);
        this.f14610y.M = true;
    }

    public final void f(boolean z10) {
        boolean z11;
        int i7;
        int i10 = this.f14599a;
        q8 q8Var = this.f14600a0;
        d dVar = this.f14609x;
        int i11 = 0;
        boolean z12 = false;
        d dVar2 = this.f14608w;
        if (i10 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (q8Var.G1) {
                dVar2.i(hd.M0(2131744554, null), z10, true);
            } else if (q8Var.U1) {
                dVar2.i(hd.M0(2131744554, null), z10, true);
            } else {
                int i12 = q8Var.D1;
                if (i12 == 1) {
                    if (q8Var.F1) {
                        i7 = 2131744619;
                    } else {
                        i7 = 2131744558;
                    }
                    dVar2.i(hd.M0(i7, null), z10, true);
                } else {
                    dVar2.i(hd.H(',', "StoryPrivacyButtonPostMultiple", i12), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f14602c;
        if (i10 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(hd.M0(2131744553, null), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        j8 j8Var = this.f14606r;
        if (i10 == 3) {
            int size = q8.R0(arrayList, this.d).size();
            q8Var.f14925u1 = size;
            dVar2.i(hd.M0(2131744554, null), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j8Var.b(z11, z10);
            dVar2.c(size, z10);
            if (size > 0) {
                z12 = true;
            }
            dVar2.setEnabled(z12);
            dVar.setVisibility(8);
        } else if (i10 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(hd.M0(2131744554, null), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.i(hd.M0(2131744559, null), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i10 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
        } else if (i10 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(hd.M0(2131744553, null), z10, true);
            int i13 = q8.Y1;
            fi.s6 P1 = np.s1(q8Var.f29679a).P1();
            if (!P1.O) {
                while (true) {
                    a0.h hVar = this.f14601b;
                    if (i11 >= hVar.m()) {
                        break;
                    }
                    long j3 = hVar.j(i11);
                    ((Boolean) hVar.n(i11)).getClass();
                    P1.L.contains(Long.valueOf(j3));
                    i11++;
                }
            } else {
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i10 == 4) {
            int size2 = q8.R0(q8Var.f14919o1, q8Var.f14920p1).size();
            q8Var.f14921q1 = size2;
            dVar2.i(hd.M0(2131744554, null), z10, true);
            dVar2.setShowZero(false);
            j8Var.b(false, z10);
            dVar2.c(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void g(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        q8 q8Var = this.f14600a0;
        ArrayList arrayList2 = q8Var.E1;
        HashMap hashMap = q8Var.f14924t1;
        ArrayList arrayList3 = q8Var.f14923s1;
        ArrayList arrayList4 = q8Var.f14922r1;
        HashMap hashMap2 = q8Var.f14920p1;
        ArrayList arrayList5 = q8Var.f14919o1;
        int i7 = this.f14599a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f14602c;
        if (i7 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i7 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i7 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i7 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f14599a == 3 && (q8Var.I1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.S;
                if (i10 != -1) {
                    q8Var.I1 = i10;
                }
            } else {
                this.S = q8Var.I1;
                q8Var.I1 = 3;
            }
        }
        HashSet R0 = q8.R0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.M;
            boolean z12 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            z7 z7Var = (z7) arrayList.get(i11);
            if (z7Var != null) {
                int i12 = z7Var.f15512i;
                if (i12 > 0) {
                    if (q8Var.I1 != i12) {
                        z12 = false;
                    }
                    z7Var.f15514k = z12;
                    z7Var.f15515l = false;
                } else {
                    TLRPC.User user = z7Var.f15511g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f28200id));
                        z7Var.f15514k = contains;
                        if (contains || !R0.contains(Long.valueOf(z7Var.f15511g.f28200id))) {
                            z12 = false;
                        }
                        z7Var.f15515l = z12;
                    } else {
                        TLRPC.Chat chat = z7Var.h;
                        if (chat != null) {
                            z7Var.f15514k = hashMap3.containsKey(Long.valueOf(chat.f28051id));
                            z7Var.f15515l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            uj0 uj0Var = this.f14604f;
            if (i13 < uj0Var.getChildCount()) {
                View childAt = uj0Var.getChildAt(i13);
                if ((childAt instanceof p8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    z7 z7Var2 = (z7) arrayList.get(R);
                    p8 p8Var = (p8) childAt;
                    if (!z7Var2.f15514k && !z7Var2.f15515l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    p8Var.c(z11, z10);
                    TLRPC.Chat chat2 = z7Var2.h;
                    float f10 = 1.0f;
                    if (chat2 != null) {
                        if (q8.K0(q8Var, chat2) > 200) {
                            f10 = 0.3f;
                        }
                        p8Var.b(z10, f10);
                    } else {
                        if (z7Var2.f15515l && !z7Var2.f15514k) {
                            f10 = 0.5f;
                        }
                        p8Var.b(z10, f10);
                    }
                }
                i13++;
            } else {
                i(z10);
                return;
            }
        }
    }

    public final void h(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: hi.l8.h(boolean):void");
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.x3 x3Var = this.E;
        if (x3Var == null) {
            return;
        }
        if (q8.R0(this.f14602c, this.d).size() > 0) {
            x3Var.a(hd.M0(2131743630, null), new a8(this, 2));
        } else if (z10) {
            x3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.w3 w3Var = x3Var.f32026b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
    }

    public final void j(boolean z10) {
        e8 e8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        HashSet R0 = q8.R0(this.f14602c, this.d);
        int i7 = this.f14599a;
        q8 q8Var = this.f14600a0;
        if (i7 == 3) {
            q8Var.f14925u1 = R0.size();
        } else if (i7 == 4) {
            q8Var.f14921q1 = R0.size();
        }
        np s12 = np.s1(q8Var.f29679a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        while (true) {
            e8Var = this.f14610y;
            ArrayList arrayList4 = e8Var.f14771e;
            arrayList = e8Var.f14771e;
            if (i10 >= arrayList4.size()) {
                break;
            }
            f20 f20Var = (f20) arrayList.get(i10);
            if (!R0.contains(Long.valueOf(f20Var.getUid()))) {
                arrayList2.add(f20Var);
            }
            i10++;
        }
        Iterator it = R0.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((f20) arrayList.get(i11)).getUid() == longValue) {
                        break;
                    }
                    i11++;
                } else {
                    if (longValue >= 0) {
                        M0 = s12.a2(l10);
                    } else {
                        M0 = s12.M0(l10);
                    }
                    Object obj = M0;
                    if (obj != null) {
                        f20 f20Var2 = new f20(getContext(), obj, null, true, q8Var.J0);
                        f20Var2.setOnClickListener(this);
                        arrayList3.add(f20Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ah.n nVar = e8Var.d;
        ArrayList arrayList5 = nVar.f1091e;
        ArrayList arrayList6 = nVar.d;
        ArrayList arrayList7 = nVar.f1092f;
        n8 n8Var = (n8) nVar.f1093n;
        n8Var.I = true;
        ArrayList arrayList8 = n8Var.f14771e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((f20) arrayList2.get(i12)).setOnClickListener(null);
        }
        nVar.c();
        if (z10) {
            nVar.f1090c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1089b = animatorSet;
            animatorSet.addListener(new m8(nVar, arrayList2, 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i13 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i13 >= size) {
                    break;
                }
                f20 f20Var3 = (f20) arrayList2.get(i13);
                arrayList5.add(f20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(f20Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var3, property, 1.0f, 0.0f));
                i13++;
            }
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                f20 f20Var4 = (f20) arrayList3.get(i14);
                arrayList6.add(f20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(f20Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                nVar.removeView((View) arrayList2.get(i15));
            }
            arrayList9.clear();
            nVar.f1089b = null;
            nVar.f1090c = false;
            n8Var.f14769b.setAllowDrawCursor(true);
        }
        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
            nVar.addView((View) arrayList3.get(i16));
        }
        nVar.requestLayout();
    }

    public final void k() {
        float c10 = c();
        boolean z10 = this.N;
        boolean z11 = false;
        float f10 = 1.0f;
        e8 e8Var = this.f14610y;
        if (!z10 && !this.V && getTranslationX() == 0.0f) {
            if (!this.O || Math.abs(this.P - c10) > 1.0f) {
                this.O = true;
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                float translationY = e8Var.getTranslationY();
                this.P = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new j3(this, 6));
                this.Q.addListener(new ai.i0(this, 26));
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
            e8Var.setTranslationY(c10);
        }
        boolean z12 = this.G;
        y7 y7Var = this.F;
        if (!z12) {
            y7Var.setVisibility(8);
            return;
        }
        y7Var.setVisibility(0);
        float f11 = -y7Var.getHeight();
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.f14604f;
            if (i7 < uj0Var.getChildCount()) {
                View childAt = uj0Var.getChildAt(i7);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f11 = this.f14603e.getPaddingTop() + childAt.getY();
                    break;
                }
                i7++;
            } else {
                z11 = true;
                break;
            }
        }
        if (this.R != z11) {
            this.R = z11;
            org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) y7Var.f15430e;
            if (z11 || this.f14599a != 0) {
                f10 = 0.0f;
            }
            x1Var.c(true, f10);
        }
        y7Var.setTranslationY(Math.max(org.telegram.messenger.g0.f23603m, f11));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = q8.Y1;
        ns.f(this.f14600a0.f29679a).c(this, ns.T);
    }

    @Override
    public final void onClick(View view) {
        e8 e8Var = this.f14610y;
        if (!e8Var.f14771e.contains(view)) {
            return;
        }
        f20 f20Var = (f20) view;
        if (f20Var.E) {
            e8Var.f14772f = null;
            ah.n nVar = e8Var.d;
            n8 n8Var = (n8) nVar.f1093n;
            n8Var.I = true;
            n8Var.f14771e.remove(f20Var);
            f20Var.setOnClickListener(null);
            nVar.c();
            nVar.f1090c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1089b = animatorSet;
            animatorSet.addListener(new ah.l(7, nVar, f20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(f20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.f1091e.clear();
            arrayList2.add(f20Var);
            ArrayList arrayList3 = nVar.f1092f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            long uid = f20Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f14602c;
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
            f20 f20Var2 = e8Var.f14772f;
            if (f20Var2 != null) {
                f20Var2.a();
                e8Var.f14772f = null;
            }
            e8Var.f14772f = f20Var;
            f20Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = q8.Y1;
        ns.f(this.f14600a0.f29679a).n(this, ns.T);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int i11;
        int i12;
        float f10;
        int i13 = q8.Y1;
        q8 q8Var = this.f14600a0;
        int i14 = q8Var.f29693f;
        if (i14 > 0) {
            this.U = i14;
        }
        super.onMeasure(i7, i10);
        int i15 = org.telegram.messenger.g0.f23603m;
        if (this.f14599a == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(56.0f);
        }
        this.f14603e.setPadding(0, i15 + L, 0, 0);
        boolean z10 = this.W;
        boolean z11 = q8Var.d;
        uj0 uj0Var = this.f14604f;
        j8 j8Var = this.f14606r;
        if (z10 != z11) {
            float c10 = c();
            if (q8Var.d && c10 + Math.min(org.telegram.messenger.g0.L(150.0f), this.f14610y.L) > uj0Var.getPaddingTop()) {
                pi.l lVar = new pi.l(getContext(), 2, 0.7f);
                lVar.f58480a = 1;
                lVar.f55123p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(lVar);
            }
            int i16 = this.f14599a;
            View view = this.f14607s;
            float f11 = 0.0f;
            if (i16 == 0) {
                if (q8Var.d) {
                    f10 = this.U;
                } else {
                    f10 = 0.0f;
                }
                j8Var.setTranslationY(f10);
                if (q8Var.d) {
                    f11 = this.U;
                }
                view.setTranslationY(f11);
            } else {
                if (q8Var.d) {
                    i11 = this.U;
                } else {
                    i11 = -this.U;
                }
                float f12 = i11;
                ValueAnimator valueAnimator = j8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                j8Var.d = ofFloat;
                ofFloat.addUpdateListener(new i8(j8Var, 1));
                j8Var.d.addListener(new ai.i0(j8Var, 27));
                j8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = j8Var.d;
                er erVar = org.telegram.ui.ActionBar.i1.f28644w;
                valueAnimator2.setInterpolator(erVar);
                j8Var.d.start();
                if (q8Var.d) {
                    i12 = this.U;
                } else {
                    i12 = -this.U;
                }
                view.setTranslationY(i12);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(erVar).withEndAction(new b8(this, 2)).start();
            }
            this.W = q8Var.d;
        }
        uj0Var.setPadding(0, 0, 0, j8Var.getMeasuredHeight());
    }
}
