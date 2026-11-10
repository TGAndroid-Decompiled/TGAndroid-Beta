package fi;

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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;
public final class n8 extends FrameLayout implements View.OnClickListener, ls {
    public final org.telegram.ui.Cells.x3 D;
    public final a8 E;
    public boolean F;
    public org.telegram.ui.ActionBar.u1 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final s8 W;
    public int f12489a;
    public final a0.h f12490b;
    public final ArrayList f12491c;
    public final HashMap d;
    public final FrameLayout f12492e;
    public final pj0 f12493f;
    public final v4.b0 h;
    public final j8 f12494n;
    public final l8 f12495r;
    public final View f12496s;
    public final d f12497w;
    public final d f12498x;
    public final g8 f12499y;

    public n8(s8 s8Var, Context context) {
        super(context);
        this.W = s8Var;
        this.f12490b = new a0.h();
        this.f12491c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        int i7 = s8.X1;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, s8Var.I0);
        this.D = x3Var;
        g8 g8Var = new g8(this, context, s8Var.I0, new d8(this, 4));
        this.f12499y = g8Var;
        int i10 = org.telegram.ui.ActionBar.m6.f27963h5;
        org.telegram.ui.ActionBar.t6.h(i10, g8Var, s8Var.I0);
        g8Var.setOnSearchTextChange(new e8(this, 3));
        a8 a8Var = new a8(context, s8Var.I0);
        this.E = a8Var;
        a8Var.h = new d8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12492e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22561m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        pj0 pj0Var = new pj0(context, s8Var.I0);
        this.f12493f = pj0Var;
        pj0Var.setClipToPadding(false);
        pj0Var.setTranslateSelector(true);
        j8 j8Var = new j8(this, context, s8Var.I0, g8Var, new di.x3(s8Var, 2));
        this.f12494n = j8Var;
        pj0Var.setAdapter(j8Var);
        j8Var.h = pj0Var;
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setOnScrollListener(new h8(0, this));
        pj0Var.setOnItemClickListener(new ab.g(14, this, context));
        frameLayout.addView(pj0Var, c8.ha.c(-1.0f, -1));
        i8 i8Var = new i8(this);
        i8Var.n(350L);
        i8Var.o(wq.h);
        i8Var.C = false;
        i8Var.f57079m = false;
        pj0Var.setItemAnimator(i8Var);
        frameLayout.addView(g8Var, c8.ha.e(-1, -2, 55));
        frameLayout.addView(x3Var, c8.ha.e(-1, 32, 55));
        addView(a8Var, c8.ha.e(-1, -2, 55));
        l8 l8Var = new l8(this, context);
        this.f12495r = l8Var;
        l8Var.setClickable(true);
        l8Var.setOrientation(1);
        l8Var.setPadding(org.telegram.messenger.g0.L(10.0f) + s8Var.f28705t0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + s8Var.f28705t0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.t6.h(i10, l8Var, s8Var.I0);
        d dVar = new d(context, s8Var.I0, true);
        this.f12497w = dVar;
        dVar.setOnClickListener(new c8(this, 0));
        dVar.f();
        l8Var.addView(dVar, c8.ha.r(-1, 48, 87));
        d dVar2 = new d(context, s8Var.I0, false);
        this.f12498x = dVar2;
        dVar2.setOnClickListener(new c8(this, 1));
        dVar2.f();
        l8Var.addView(dVar2, c8.ha.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f12496s = view;
        org.telegram.ui.ActionBar.t6.h(i10, view, s8Var.I0);
        addView(view, c8.ha.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(l8Var, c8.ha.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = org.telegram.messenger.g0.O3(t10.p(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !jg.g.A(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.O3(t10.n(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !jg.g.A(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                TLRPC.TL_username tL_username = arrayList.get(i7);
                                if (tL_username.active && org.telegram.messenger.g0.O3(tL_username.username).toLowerCase().startsWith(str)) {
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
                String lowerCase3 = org.telegram.messenger.g0.O3(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str) && !jg.g.A(" ", str, lowerCase3)) {
                    String lowerCase4 = org.telegram.messenger.g0.O3(org.telegram.messenger.t3.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !jg.g.A(" ", str, lowerCase4)) {
                        ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                        if (arrayList2 != null) {
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                TLRPC.TL_username tL_username2 = arrayList2.get(i10);
                                if (tL_username2.active && org.telegram.messenger.g0.O3(tL_username2.username).toLowerCase().startsWith(str)) {
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

    public final void a(boolean z9) {
        if (this.f12489a == 6) {
            ArrayList arrayList = this.f12491c;
            arrayList.clear();
            int i7 = s8.X1;
            arrayList.addAll(qp.s1(this.W.f28669a).P1().L);
            int i10 = 0;
            while (true) {
                a0.h hVar = this.f12490b;
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
            if (z9) {
                h(true);
                f(true);
                g(true);
            }
        }
    }

    public final void b(int i7) {
        int i10;
        this.f12489a = i7;
        this.f12490b.b();
        ArrayList arrayList = this.f12491c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        s8 s8Var = this.W;
        if (i7 == 4) {
            arrayList.addAll(s8Var.n1);
            hashMap.putAll(s8Var.f12807o1);
        } else if (i7 == 5) {
            arrayList.addAll(s8Var.D1);
        } else if (i7 == 1) {
            ArrayList J0 = s8.J0(s8Var);
            for (int i11 = 0; i11 < J0.size(); i11 = com.google.android.recaptcha.internal.a.g(i11, 1, ((TLRPC.User) J0.get(i11)).f27109id, arrayList)) {
            }
        } else if (i7 == 2) {
            arrayList.addAll(s8Var.f12809q1);
        } else if (i7 == 3) {
            arrayList.addAll(s8Var.f12810r1);
            hashMap.putAll(s8Var.f12811s1);
        } else if (i7 == 6) {
            a(false);
        }
        this.f12494n.getClass();
        this.h.k1(false);
        j(false);
        g8 g8Var = this.f12499y;
        g8Var.setText("");
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        g8Var.setVisibility(i10);
        g8Var.L = true;
        this.I = null;
        h(false);
        f(false);
        g(false);
        int i12 = this.f12489a;
        pj0 pj0Var = this.f12493f;
        if (i12 != 0) {
            pj0Var.v0(0);
        }
        pj0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i7 = 0;
        float f10 = -jg.g.e(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.f12499y.K), 0);
        while (true) {
            pj0 pj0Var = this.f12493f;
            if (i7 < pj0Var.getChildCount()) {
                View childAt = pj0Var.getChildAt(i7);
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
        org.telegram.ui.ActionBar.u1 u1Var;
        if (i7 == qs.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (u1Var = this.G) != null && this.H == chatFull.f26961id) {
            u1Var.c(350L);
            this.G = null;
            this.H = -1L;
            e(chatFull.f26961id, chatFull.participants);
        }
    }

    public final void e(long j3, TLRPC.ChatParticipants chatParticipants) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = this.f12489a;
        int i10 = 0;
        if (i7 != 1 && i7 != 2) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8 s8Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j10 = chatParticipants.participants.get(i11).user_id;
                int i12 = s8.X1;
                TLRPC.User a22 = qp.s1(s8Var.f28669a).a2(Long.valueOf(j10));
                if (a22 != null && !t10.B(a22) && !a22.bot && a22.f27109id != 777000 && j10 != 0) {
                    if (z9 && !a22.contact) {
                        arrayList2.add(Long.valueOf(j10));
                    } else {
                        arrayList.add(Long.valueOf(j10));
                    }
                    this.f12491c.remove(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                int i13 = s8.X1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, s8Var.I0);
                alertDialog$Builder.f27300a.T = id.M0(2131744538, null);
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
            }
            Context context2 = getContext();
            int i14 = s8.X1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, s8Var.I0);
            alertDialog$Builder2.f27300a.T = id.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
            alertDialog$Builder2.k(id.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new bi.i(this, j3, arrayList, 2));
            jg.g.w(null, 2131752589, alertDialog$Builder2, null);
            return;
        }
        this.d.put(Long.valueOf(j3), arrayList);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f12490b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        j(true);
        f(true);
        g(true);
        this.f12499y.L = true;
    }

    public final void f(boolean z9) {
        boolean z10;
        int i7;
        int i10 = this.f12489a;
        s8 s8Var = this.W;
        d dVar = this.f12498x;
        int i11 = 0;
        boolean z11 = false;
        d dVar2 = this.f12497w;
        if (i10 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z9);
            if (s8Var.F1) {
                dVar2.i(id.M0(2131744554, null), z9, true);
            } else if (s8Var.T1) {
                dVar2.i(id.M0(2131744554, null), z9, true);
            } else {
                int i12 = s8Var.C1;
                if (i12 == 1) {
                    if (s8Var.E1) {
                        i7 = 2131744619;
                    } else {
                        i7 = 2131744558;
                    }
                    dVar2.i(id.M0(i7, null), z9, true);
                } else {
                    dVar2.i(id.H(',', "StoryPrivacyButtonPostMultiple", i12), z9, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f12491c;
        if (i10 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(id.M0(2131744553, null), z9, true);
            dVar2.c(arrayList.size(), z9);
            dVar.setVisibility(8);
            return;
        }
        l8 l8Var = this.f12495r;
        if (i10 == 3) {
            int size = s8.R0(arrayList, this.d).size();
            s8Var.f12812t1 = size;
            dVar2.i(id.M0(2131744554, null), z9, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l8Var.b(z10, z9);
            dVar2.c(size, z9);
            if (size > 0) {
                z11 = true;
            }
            dVar2.setEnabled(z11);
            dVar.setVisibility(8);
        } else if (i10 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(id.M0(2131744554, null), z9, true);
                dVar2.c(0, z9);
            } else {
                dVar2.i(id.M0(2131744559, null), z9, true);
                dVar2.c(arrayList.size(), z9);
            }
            dVar.setVisibility(8);
        } else if (i10 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z9);
            dVar.setVisibility(8);
        } else if (i10 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(id.M0(2131744553, null), z9, true);
            int i13 = s8.X1;
            di.z6 P1 = qp.s1(s8Var.f28669a).P1();
            if (!P1.O) {
                while (true) {
                    a0.h hVar = this.f12490b;
                    if (i11 >= hVar.m()) {
                        break;
                    }
                    long j3 = hVar.j(i11);
                    ((Boolean) hVar.n(i11)).getClass();
                    P1.L.contains(Long.valueOf(j3));
                    i11++;
                }
            } else {
                dVar2.c(arrayList.size(), z9);
            }
            dVar.setVisibility(8);
        } else if (i10 == 4) {
            int size2 = s8.R0(s8Var.n1, s8Var.f12807o1).size();
            s8Var.f12808p1 = size2;
            dVar2.i(id.M0(2131744554, null), z9, true);
            dVar2.setShowZero(false);
            l8Var.b(false, z9);
            dVar2.c(size2, z9);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void g(boolean z9) {
        ArrayList arrayList;
        int R;
        boolean z10;
        s8 s8Var = this.W;
        ArrayList arrayList2 = s8Var.D1;
        HashMap hashMap = s8Var.f12811s1;
        ArrayList arrayList3 = s8Var.f12810r1;
        ArrayList arrayList4 = s8Var.f12809q1;
        HashMap hashMap2 = s8Var.f12807o1;
        ArrayList arrayList5 = s8Var.n1;
        int i7 = this.f12489a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f12491c;
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
        if (this.f12489a == 3 && (s8Var.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.R;
                if (i10 != -1) {
                    s8Var.H1 = i10;
                }
            } else {
                this.R = s8Var.H1;
                s8Var.H1 = 3;
            }
        }
        HashSet R0 = s8.R0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.L;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            b8 b8Var = (b8) arrayList.get(i11);
            if (b8Var != null) {
                int i12 = b8Var.f11700i;
                if (i12 > 0) {
                    if (s8Var.H1 != i12) {
                        z11 = false;
                    }
                    b8Var.f11702k = z11;
                    b8Var.f11703l = false;
                } else {
                    TLRPC.User user = b8Var.f11699g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f27109id));
                        b8Var.f11702k = contains;
                        if (contains || !R0.contains(Long.valueOf(b8Var.f11699g.f27109id))) {
                            z11 = false;
                        }
                        b8Var.f11703l = z11;
                    } else {
                        TLRPC.Chat chat = b8Var.h;
                        if (chat != null) {
                            b8Var.f11702k = hashMap3.containsKey(Long.valueOf(chat.f26960id));
                            b8Var.f11703l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            pj0 pj0Var = this.f12493f;
            if (i13 < pj0Var.getChildCount()) {
                View childAt = pj0Var.getChildAt(i13);
                if ((childAt instanceof r8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    b8 b8Var2 = (b8) arrayList.get(R);
                    r8 r8Var = (r8) childAt;
                    if (!b8Var2.f11702k && !b8Var2.f11703l) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    r8Var.c(z10, z9);
                    TLRPC.Chat chat2 = b8Var2.h;
                    float f10 = 1.0f;
                    if (chat2 != null) {
                        if (s8.K0(s8Var, chat2) > 200) {
                            f10 = 0.3f;
                        }
                        r8Var.b(z9, f10);
                    } else {
                        if (b8Var2.f11703l && !b8Var2.f11702k) {
                            f10 = 0.5f;
                        }
                        r8Var.b(z9, f10);
                    }
                }
                i13++;
            } else {
                i(z9);
                return;
            }
        }
    }

    public final void h(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: fi.n8.h(boolean):void");
    }

    public final void i(boolean z9) {
        org.telegram.ui.Cells.x3 x3Var = this.D;
        if (x3Var == null) {
            return;
        }
        if (s8.R0(this.f12491c, this.d).size() > 0) {
            x3Var.a(id.M0(2131743630, null), new c8(this, 2));
        } else if (z9) {
            x3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.w3 w3Var = x3Var.f30892b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
    }

    public final void j(boolean z9) {
        g8 g8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        HashSet R0 = s8.R0(this.f12491c, this.d);
        int i7 = this.f12489a;
        s8 s8Var = this.W;
        if (i7 == 3) {
            s8Var.f12812t1 = R0.size();
        } else if (i7 == 4) {
            s8Var.f12808p1 = R0.size();
        }
        qp s12 = qp.s1(s8Var.f28669a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        while (true) {
            g8Var = this.f12499y;
            ArrayList arrayList4 = g8Var.f12616e;
            arrayList = g8Var.f12616e;
            if (i10 >= arrayList4.size()) {
                break;
            }
            c20 c20Var = (c20) arrayList.get(i10);
            if (!R0.contains(Long.valueOf(c20Var.getUid()))) {
                arrayList2.add(c20Var);
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
                    if (((c20) arrayList.get(i11)).getUid() == longValue) {
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
                        c20 c20Var2 = new c20(getContext(), obj, null, true, s8Var.I0);
                        c20Var2.setOnClickListener(this);
                        arrayList3.add(c20Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ah.n nVar = g8Var.d;
        ArrayList arrayList5 = nVar.f1093e;
        ArrayList arrayList6 = nVar.d;
        ArrayList arrayList7 = nVar.f1094f;
        p8 p8Var = (p8) nVar.f1095n;
        p8Var.H = true;
        ArrayList arrayList8 = p8Var.f12616e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((c20) arrayList2.get(i12)).setOnClickListener(null);
        }
        nVar.c();
        if (z9) {
            nVar.f1092c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1091b = animatorSet;
            animatorSet.addListener(new o8(nVar, arrayList2, 0));
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
                c20 c20Var3 = (c20) arrayList2.get(i13);
                arrayList5.add(c20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(c20Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var3, property, 1.0f, 0.0f));
                i13++;
            }
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                c20 c20Var4 = (c20) arrayList3.get(i14);
                arrayList6.add(c20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(c20Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                nVar.removeView((View) arrayList2.get(i15));
            }
            arrayList9.clear();
            nVar.f1091b = null;
            nVar.f1092c = false;
            p8Var.f12614b.setAllowDrawCursor(true);
        }
        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
            nVar.addView((View) arrayList3.get(i16));
        }
        nVar.requestLayout();
    }

    public final void k() {
        float c10 = c();
        boolean z9 = this.M;
        boolean z10 = false;
        float f10 = 1.0f;
        g8 g8Var = this.f12499y;
        if (!z9 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = g8Var.getTranslationY();
                this.O = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.P = ofFloat;
                ofFloat.addUpdateListener(new v3(this, 5));
                this.P.addListener(new bi.t5(this, 24));
                this.P.setInterpolator(new LinearInterpolator());
                this.P.setDuration(180L);
                this.P.start();
            }
        } else {
            this.N = false;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            g8Var.setTranslationY(c10);
        }
        boolean z11 = this.F;
        a8 a8Var = this.E;
        if (!z11) {
            a8Var.setVisibility(8);
            return;
        }
        a8Var.setVisibility(0);
        float f11 = -a8Var.getHeight();
        int i7 = 0;
        while (true) {
            pj0 pj0Var = this.f12493f;
            if (i7 < pj0Var.getChildCount()) {
                View childAt = pj0Var.getChildAt(i7);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f11 = this.f12492e.getPaddingTop() + childAt.getY();
                    break;
                }
                i7++;
            } else {
                z10 = true;
                break;
            }
        }
        if (this.Q != z10) {
            this.Q = z10;
            org.telegram.ui.ActionBar.y1 y1Var = (org.telegram.ui.ActionBar.y1) a8Var.f11619e;
            if (z10 || this.f12489a != 0) {
                f10 = 0.0f;
            }
            y1Var.c(true, f10);
        }
        a8Var.setTranslationY(Math.max(org.telegram.messenger.g0.f22561m, f11));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = s8.X1;
        qs.f(this.W.f28669a).c(this, qs.T);
    }

    @Override
    public final void onClick(View view) {
        g8 g8Var = this.f12499y;
        if (!g8Var.f12616e.contains(view)) {
            return;
        }
        c20 c20Var = (c20) view;
        if (c20Var.D) {
            g8Var.f12617f = null;
            ah.n nVar = g8Var.d;
            p8 p8Var = (p8) nVar.f1095n;
            p8Var.H = true;
            p8Var.f12616e.remove(c20Var);
            c20Var.setOnClickListener(null);
            nVar.c();
            nVar.f1092c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1091b = animatorSet;
            animatorSet.addListener(new ah.l(7, nVar, c20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(c20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.f1093e.clear();
            arrayList2.add(c20Var);
            ArrayList arrayList3 = nVar.f1094f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            long uid = c20Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f12491c;
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
            c20 c20Var2 = g8Var.f12617f;
            if (c20Var2 != null) {
                c20Var2.a();
                g8Var.f12617f = null;
            }
            g8Var.f12617f = c20Var;
            c20Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = s8.X1;
        qs.f(this.W.f28669a).n(this, qs.T);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int i11;
        int i12;
        float f10;
        int i13 = s8.X1;
        s8 s8Var = this.W;
        int i14 = s8Var.f28683f;
        if (i14 > 0) {
            this.T = i14;
        }
        super.onMeasure(i7, i10);
        int i15 = org.telegram.messenger.g0.f22561m;
        if (this.f12489a == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(56.0f);
        }
        this.f12492e.setPadding(0, i15 + L, 0, 0);
        boolean z9 = this.V;
        boolean z10 = s8Var.d;
        pj0 pj0Var = this.f12493f;
        l8 l8Var = this.f12495r;
        if (z9 != z10) {
            float c10 = c();
            if (s8Var.d && c10 + Math.min(org.telegram.messenger.g0.L(150.0f), this.f12499y.K) > pj0Var.getPaddingTop()) {
                mi.m mVar = new mi.m(getContext(), 2, 0.7f);
                mVar.f57221a = 1;
                mVar.f20116p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(mVar);
            }
            int i16 = this.f12489a;
            View view = this.f12496s;
            float f11 = 0.0f;
            if (i16 == 0) {
                if (s8Var.d) {
                    f10 = this.T;
                } else {
                    f10 = 0.0f;
                }
                l8Var.setTranslationY(f10);
                if (s8Var.d) {
                    f11 = this.T;
                }
                view.setTranslationY(f11);
            } else {
                if (s8Var.d) {
                    i11 = this.T;
                } else {
                    i11 = -this.T;
                }
                float f12 = i11;
                ValueAnimator valueAnimator = l8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    l8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                l8Var.d = ofFloat;
                ofFloat.addUpdateListener(new k8(l8Var, 1));
                l8Var.d.addListener(new bi.t5(l8Var, 25));
                l8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = l8Var.d;
                wq wqVar = org.telegram.ui.ActionBar.i1.f27527w;
                valueAnimator2.setInterpolator(wqVar);
                l8Var.d.start();
                if (s8Var.d) {
                    i12 = this.T;
                } else {
                    i12 = -this.T;
                }
                view.setTranslationY(i12);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(wqVar).withEndAction(new d8(this, 2)).start();
            }
            this.V = s8Var.d;
        }
        pj0Var.setPadding(0, 0, 0, l8Var.getMeasuredHeight());
    }
}
