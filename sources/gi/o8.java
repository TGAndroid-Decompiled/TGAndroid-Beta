package gi;

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
import b8.mf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;
public final class o8 extends FrameLayout implements View.OnClickListener, cs {
    public final org.telegram.ui.Cells.x3 E;
    public final z7 F;
    public boolean G;
    public org.telegram.ui.ActionBar.s1 H;
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
    public int f13339a;
    public final t8 f13340a0;
    public final a0.h f13341b;
    public final ArrayList f13342c;
    public final HashMap d;
    public final FrameLayout f13343e;
    public final tj0 f13344f;
    public final u4.b0 h;
    public final k8 f13345n;
    public final m8 f13346r;
    public final View f13347s;
    public final d f13348w;
    public final d f13349x;
    public final f8 f13350y;

    public o8(t8 t8Var, Context context) {
        super(context);
        this.f13340a0 = t8Var;
        this.f13341b = new a0.h();
        this.f13342c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i3 = t8.V1;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, t8Var.J0);
        this.E = x3Var;
        f8 f8Var = new f8(this, context, t8Var.J0, new c8(this, 4));
        this.f13350y = f8Var;
        int i10 = org.telegram.ui.ActionBar.k6.f27954h5;
        org.telegram.ui.ActionBar.r6.i(i10, f8Var, t8Var.J0);
        f8Var.setOnSearchTextChange(new d8(this, 3));
        z7 z7Var = new z7(context, t8Var.J0);
        this.F = z7Var;
        z7Var.h = new c8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13343e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22602m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, mf.e(-1, -1, 119));
        tj0 tj0Var = new tj0(context, t8Var.J0);
        this.f13344f = tj0Var;
        tj0Var.setClipToPadding(false);
        tj0Var.setTranslateSelector(true);
        k8 k8Var = new k8(this, context, t8Var.J0, f8Var, new ei.y3(t8Var, 2));
        this.f13345n = k8Var;
        tj0Var.setAdapter(k8Var);
        k8Var.h = tj0Var;
        u4.b0 b0Var = new u4.b0();
        this.h = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setOnScrollListener(new g8(0, this));
        tj0Var.setOnItemClickListener(new ai.n(17, this, context));
        frameLayout.addView(tj0Var, mf.c(-1.0f, -1));
        h8 h8Var = new h8(this);
        h8Var.n(350L);
        h8Var.o(xq.h);
        h8Var.C = false;
        h8Var.f55567m = false;
        tj0Var.setItemAnimator(h8Var);
        frameLayout.addView(f8Var, mf.e(-1, -2, 55));
        frameLayout.addView(x3Var, mf.e(-1, 32, 55));
        addView(z7Var, mf.e(-1, -2, 55));
        m8 m8Var = new m8(this, context);
        this.f13346r = m8Var;
        m8Var.setClickable(true);
        m8Var.setOrientation(1);
        m8Var.setPadding(org.telegram.messenger.g0.L(10.0f) + t8Var.f28618u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + t8Var.f28618u0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i10, m8Var, t8Var.J0);
        d dVar = new d(context, t8Var.J0, true);
        this.f13348w = dVar;
        dVar.setOnClickListener(new b8(this, 0));
        dVar.f();
        m8Var.addView(dVar, mf.r(-1, 48, 87));
        d dVar2 = new d(context, t8Var.J0, false);
        this.f13349x = dVar2;
        dVar2.setOnClickListener(new b8(this, 1));
        dVar2.f();
        m8Var.addView(dVar2, mf.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f13347s = view;
        org.telegram.ui.ActionBar.r6.i(i10, view, t8Var.J0);
        addView(view, mf.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(m8Var, mf.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = org.telegram.messenger.g0.O3(l10.p(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !k2.p1.z(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.O3(l10.n(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !k2.p1.z(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                TLRPC.TL_username tL_username = arrayList.get(i3);
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
                if (!lowerCase3.startsWith(str) && !k2.p1.z(" ", str, lowerCase3)) {
                    String lowerCase4 = org.telegram.messenger.g0.O3(org.telegram.messenger.t3.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !k2.p1.z(" ", str, lowerCase4)) {
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

    public final void a(boolean z10) {
        if (this.f13339a == 6) {
            ArrayList arrayList = this.f13342c;
            arrayList.clear();
            int i3 = t8.V1;
            arrayList.addAll(hp.s1(this.f13340a0.f28583a).P1().L);
            int i10 = 0;
            while (true) {
                a0.h hVar = this.f13341b;
                if (i10 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i10);
                if (((Boolean) hVar.n(i10)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        arrayList.add(Long.valueOf(j10));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j10));
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

    public final void b(int i3) {
        int i10;
        this.f13339a = i3;
        this.f13341b.b();
        ArrayList arrayList = this.f13342c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        t8 t8Var = this.f13340a0;
        if (i3 == 4) {
            arrayList.addAll(t8Var.f13622l1);
            hashMap.putAll(t8Var.m1);
        } else if (i3 == 5) {
            arrayList.addAll(t8Var.B1);
        } else if (i3 == 1) {
            ArrayList J0 = t8.J0(t8Var);
            for (int i11 = 0; i11 < J0.size(); i11 = a1.g.h(i11, 1, ((TLRPC.User) J0.get(i11)).f27150id, arrayList)) {
            }
        } else if (i3 == 2) {
            arrayList.addAll(t8Var.f13624o1);
        } else if (i3 == 3) {
            arrayList.addAll(t8Var.f13625p1);
            hashMap.putAll(t8Var.f13626q1);
        } else if (i3 == 6) {
            a(false);
        }
        this.f13345n.getClass();
        this.h.k1(false);
        j(false);
        f8 f8Var = this.f13350y;
        f8Var.setText("");
        if (i3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f8Var.setVisibility(i10);
        f8Var.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i12 = this.f13339a;
        tj0 tj0Var = this.f13344f;
        if (i12 != 0) {
            tj0Var.v0(0);
        }
        tj0Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i3 = 0;
        float f10 = -k2.p1.d(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.f13350y.L), 0);
        while (true) {
            tj0 tj0Var = this.f13344f;
            if (i3 < tj0Var.getChildCount()) {
                View childAt = tj0Var.getChildAt(i3);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f10, childAt.getY());
                }
                i3++;
            } else {
                return f10;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.s1 s1Var;
        if (i3 == hs.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (s1Var = this.H) != null && this.I == chatFull.f27002id) {
            s1Var.c(350L);
            this.H = null;
            this.I = -1L;
            e(chatFull.f27002id, chatFull.participants);
        }
    }

    public final void e(long j10, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = this.f13339a;
        int i10 = 0;
        if (i3 != 1 && i3 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        t8 t8Var = this.f13340a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j11 = chatParticipants.participants.get(i11).user_id;
                int i12 = t8.V1;
                TLRPC.User a22 = hp.s1(t8Var.f28583a).a2(Long.valueOf(j11));
                if (a22 != null && !l10.B(a22) && !a22.bot && a22.f27150id != 777000 && j11 != 0) {
                    if (z10 && !a22.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f13342c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                int i13 = t8.V1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, t8Var.J0);
                alertDialog$Builder.f27343a.U = bd.M0(2131744548, null);
                k2.p1.v(null, 2131752589, alertDialog$Builder, null);
                return;
            }
            Context context2 = getContext();
            int i14 = t8.V1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, t8Var.J0);
            alertDialog$Builder2.f27343a.U = bd.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
            alertDialog$Builder2.k(bd.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new ci.i(this, j10, arrayList, 2));
            k2.p1.v(null, 2131752589, alertDialog$Builder2, null);
            return;
        }
        this.d.put(Long.valueOf(j10), arrayList);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f13341b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        j(true);
        f(true);
        g(true);
        this.f13350y.M = true;
    }

    public final void f(boolean z10) {
        boolean z11;
        int i3;
        int i10 = this.f13339a;
        t8 t8Var = this.f13340a0;
        d dVar = this.f13349x;
        int i11 = 0;
        boolean z12 = false;
        d dVar2 = this.f13348w;
        if (i10 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (t8Var.D1) {
                dVar2.i(bd.M0(2131744564, null), z10, true);
            } else if (t8Var.R1) {
                dVar2.i(bd.M0(2131744564, null), z10, true);
            } else {
                int i12 = t8Var.A1;
                if (i12 == 1) {
                    if (t8Var.C1) {
                        i3 = 2131744629;
                    } else {
                        i3 = 2131744568;
                    }
                    dVar2.i(bd.M0(i3, null), z10, true);
                } else {
                    dVar2.i(bd.H(',', "StoryPrivacyButtonPostMultiple", i12), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f13342c;
        if (i10 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(bd.M0(2131744563, null), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        m8 m8Var = this.f13346r;
        if (i10 == 3) {
            int size = t8.R0(arrayList, this.d).size();
            t8Var.f13627r1 = size;
            dVar2.i(bd.M0(2131744564, null), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m8Var.b(z11, z10);
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
                dVar2.i(bd.M0(2131744564, null), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.i(bd.M0(2131744569, null), z10, true);
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
            dVar2.i(bd.M0(2131744563, null), z10, true);
            int i13 = t8.V1;
            ei.z6 P1 = hp.s1(t8Var.f28583a).P1();
            if (!P1.O) {
                while (true) {
                    a0.h hVar = this.f13341b;
                    if (i11 >= hVar.m()) {
                        break;
                    }
                    long j10 = hVar.j(i11);
                    ((Boolean) hVar.n(i11)).getClass();
                    P1.L.contains(Long.valueOf(j10));
                    i11++;
                }
            } else {
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i10 == 4) {
            int size2 = t8.R0(t8Var.f13622l1, t8Var.m1).size();
            t8Var.f13623n1 = size2;
            dVar2.i(bd.M0(2131744564, null), z10, true);
            dVar2.setShowZero(false);
            m8Var.b(false, z10);
            dVar2.c(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void g(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        t8 t8Var = this.f13340a0;
        ArrayList arrayList2 = t8Var.B1;
        HashMap hashMap = t8Var.f13626q1;
        ArrayList arrayList3 = t8Var.f13625p1;
        ArrayList arrayList4 = t8Var.f13624o1;
        HashMap hashMap2 = t8Var.m1;
        ArrayList arrayList5 = t8Var.f13622l1;
        int i3 = this.f13339a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f13342c;
        if (i3 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i3 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i3 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i3 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f13339a == 3 && (t8Var.F1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.S;
                if (i10 != -1) {
                    t8Var.F1 = i10;
                }
            } else {
                this.S = t8Var.F1;
                t8Var.F1 = 3;
            }
        }
        HashSet R0 = t8.R0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.M;
            boolean z12 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            a8 a8Var = (a8) arrayList.get(i11);
            if (a8Var != null) {
                int i12 = a8Var.f12400i;
                if (i12 > 0) {
                    if (t8Var.F1 != i12) {
                        z12 = false;
                    }
                    a8Var.f12402k = z12;
                    a8Var.f12403l = false;
                } else {
                    TLRPC.User user = a8Var.f12399g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f27150id));
                        a8Var.f12402k = contains;
                        if (contains || !R0.contains(Long.valueOf(a8Var.f12399g.f27150id))) {
                            z12 = false;
                        }
                        a8Var.f12403l = z12;
                    } else {
                        TLRPC.Chat chat = a8Var.h;
                        if (chat != null) {
                            a8Var.f12402k = hashMap3.containsKey(Long.valueOf(chat.f27001id));
                            a8Var.f12403l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            tj0 tj0Var = this.f13344f;
            if (i13 < tj0Var.getChildCount()) {
                View childAt = tj0Var.getChildAt(i13);
                if ((childAt instanceof s8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    a8 a8Var2 = (a8) arrayList.get(R);
                    s8 s8Var = (s8) childAt;
                    if (!a8Var2.f12402k && !a8Var2.f12403l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s8Var.c(z11, z10);
                    TLRPC.Chat chat2 = a8Var2.h;
                    float f10 = 1.0f;
                    if (chat2 != null) {
                        if (t8.K0(t8Var, chat2) > 200) {
                            f10 = 0.3f;
                        }
                        s8Var.b(z10, f10);
                    } else {
                        if (a8Var2.f12403l && !a8Var2.f12402k) {
                            f10 = 0.5f;
                        }
                        s8Var.b(z10, f10);
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
        throw new UnsupportedOperationException("Method not decompiled: gi.o8.h(boolean):void");
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.x3 x3Var = this.E;
        if (x3Var == null) {
            return;
        }
        if (t8.R0(this.f13342c, this.d).size() > 0) {
            x3Var.a(bd.M0(2131743640, null), new b8(this, 2));
        } else if (z10) {
            x3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.w3 w3Var = x3Var.f30950b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
    }

    public final void j(boolean z10) {
        f8 f8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        HashSet R0 = t8.R0(this.f13342c, this.d);
        int i3 = this.f13339a;
        t8 t8Var = this.f13340a0;
        if (i3 == 3) {
            t8Var.f13627r1 = R0.size();
        } else if (i3 == 4) {
            t8Var.f13623n1 = R0.size();
        }
        hp s12 = hp.s1(t8Var.f28583a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        while (true) {
            f8Var = this.f13350y;
            ArrayList arrayList4 = f8Var.f13442e;
            arrayList = f8Var.f13442e;
            if (i10 >= arrayList4.size()) {
                break;
            }
            y10 y10Var = (y10) arrayList.get(i10);
            if (!R0.contains(Long.valueOf(y10Var.getUid()))) {
                arrayList2.add(y10Var);
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
                    if (((y10) arrayList.get(i11)).getUid() == longValue) {
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
                        y10 y10Var2 = new y10(getContext(), obj, null, true, t8Var.J0);
                        y10Var2.setOnClickListener(this);
                        arrayList3.add(y10Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        bh.l lVar = f8Var.d;
        ArrayList arrayList5 = lVar.f3330e;
        ArrayList arrayList6 = lVar.d;
        ArrayList arrayList7 = lVar.f3331f;
        q8 q8Var = (q8) lVar.f3332n;
        q8Var.I = true;
        ArrayList arrayList8 = q8Var.f13442e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = lVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((y10) arrayList2.get(i12)).setOnClickListener(null);
        }
        lVar.c();
        if (z10) {
            lVar.f3329c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.f3328b = animatorSet;
            animatorSet.addListener(new p8(lVar, arrayList2, 0));
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
                y10 y10Var3 = (y10) arrayList2.get(i13);
                arrayList5.add(y10Var3);
                arrayList7.add(ObjectAnimator.ofFloat(y10Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var3, property, 1.0f, 0.0f));
                i13++;
            }
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                y10 y10Var4 = (y10) arrayList3.get(i14);
                arrayList6.add(y10Var4);
                arrayList7.add(ObjectAnimator.ofFloat(y10Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                lVar.removeView((View) arrayList2.get(i15));
            }
            arrayList9.clear();
            lVar.f3328b = null;
            lVar.f3329c = false;
            q8Var.f13440b.setAllowDrawCursor(true);
        }
        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
            lVar.addView((View) arrayList3.get(i16));
        }
        lVar.requestLayout();
    }

    public final void k() {
        float c2 = c();
        boolean z10 = this.N;
        boolean z11 = false;
        float f10 = 1.0f;
        f8 f8Var = this.f13350y;
        if (!z10 && !this.V && getTranslationX() == 0.0f) {
            if (!this.O || Math.abs(this.P - c2) > 1.0f) {
                this.O = true;
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                float translationY = f8Var.getTranslationY();
                this.P = c2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c2);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new j3(this, 6));
                this.Q.addListener(new ai.e1(this, 26));
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
            f8Var.setTranslationY(c2);
        }
        boolean z12 = this.G;
        z7 z7Var = this.F;
        if (!z12) {
            z7Var.setVisibility(8);
            return;
        }
        z7Var.setVisibility(0);
        float f11 = -z7Var.getHeight();
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.f13344f;
            if (i3 < tj0Var.getChildCount()) {
                View childAt = tj0Var.getChildAt(i3);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f11 = this.f13343e.getPaddingTop() + childAt.getY();
                    break;
                }
                i3++;
            } else {
                z11 = true;
                break;
            }
        }
        if (this.R != z11) {
            this.R = z11;
            org.telegram.ui.ActionBar.w1 w1Var = (org.telegram.ui.ActionBar.w1) z7Var.f14045e;
            if (z11 || this.f13339a != 0) {
                f10 = 0.0f;
            }
            w1Var.c(true, f10);
        }
        z7Var.setTranslationY(Math.max(org.telegram.messenger.g0.f22602m, f11));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = t8.V1;
        hs.f(this.f13340a0.f28583a).c(this, hs.T);
    }

    @Override
    public final void onClick(View view) {
        f8 f8Var = this.f13350y;
        if (!f8Var.f13442e.contains(view)) {
            return;
        }
        y10 y10Var = (y10) view;
        if (y10Var.E) {
            f8Var.f13443f = null;
            bh.l lVar = f8Var.d;
            q8 q8Var = (q8) lVar.f3332n;
            q8Var.I = true;
            q8Var.f13442e.remove(y10Var);
            y10Var.setOnClickListener(null);
            lVar.c();
            lVar.f3329c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.f3328b = animatorSet;
            animatorSet.addListener(new bh.j(7, lVar, y10Var));
            ArrayList arrayList = lVar.h;
            arrayList.clear();
            arrayList.add(y10Var);
            ArrayList arrayList2 = lVar.d;
            arrayList2.clear();
            lVar.f3330e.clear();
            arrayList2.add(y10Var);
            ArrayList arrayList3 = lVar.f3331f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, View.ALPHA, 1.0f, 0.0f));
            lVar.requestLayout();
            long uid = y10Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f13342c;
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
            y10 y10Var2 = f8Var.f13443f;
            if (y10Var2 != null) {
                y10Var2.a();
                f8Var.f13443f = null;
            }
            f8Var.f13443f = y10Var;
            y10Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = t8.V1;
        hs.f(this.f13340a0.f28583a).n(this, hs.T);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int L;
        int i11;
        int i12;
        float f10;
        int i13 = t8.V1;
        t8 t8Var = this.f13340a0;
        int i14 = t8Var.f28597f;
        if (i14 > 0) {
            this.U = i14;
        }
        super.onMeasure(i3, i10);
        int i15 = org.telegram.messenger.g0.f22602m;
        if (this.f13339a == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(56.0f);
        }
        this.f13343e.setPadding(0, i15 + L, 0, 0);
        boolean z10 = this.W;
        boolean z11 = t8Var.d;
        tj0 tj0Var = this.f13344f;
        m8 m8Var = this.f13346r;
        if (z10 != z11) {
            float c2 = c();
            if (t8Var.d && c2 + Math.min(org.telegram.messenger.g0.L(150.0f), this.f13350y.L) > tj0Var.getPaddingTop()) {
                ni.m mVar = new ni.m(getContext(), 2, 0.7f);
                mVar.f55704a = 1;
                mVar.f20461p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(mVar);
            }
            int i16 = this.f13339a;
            View view = this.f13347s;
            float f11 = 0.0f;
            if (i16 == 0) {
                if (t8Var.d) {
                    f10 = this.U;
                } else {
                    f10 = 0.0f;
                }
                m8Var.setTranslationY(f10);
                if (t8Var.d) {
                    f11 = this.U;
                }
                view.setTranslationY(f11);
            } else {
                if (t8Var.d) {
                    i11 = this.U;
                } else {
                    i11 = -this.U;
                }
                float f12 = i11;
                ValueAnimator valueAnimator = m8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                m8Var.d = ofFloat;
                ofFloat.addUpdateListener(new l8(m8Var, 1));
                m8Var.d.addListener(new ai.e1(m8Var, 27));
                m8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = m8Var.d;
                xq xqVar = org.telegram.ui.ActionBar.h1.f27551w;
                valueAnimator2.setInterpolator(xqVar);
                m8Var.d.start();
                if (t8Var.d) {
                    i12 = this.U;
                } else {
                    i12 = -this.U;
                }
                view.setTranslationY(i12);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(xqVar).withEndAction(new c8(this, 2)).start();
            }
            this.W = t8Var.d;
        }
        tj0Var.setPadding(0, 0, 0, m8Var.getMeasuredHeight());
    }
}
