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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n20;
public final class f9 extends FrameLayout implements View.OnClickListener, fs {
    public final org.telegram.ui.Cells.y3 E;
    public final s8 F;
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
    public int f14494a;
    public final k9 f14495a0;
    public final a0.h f14496b;
    public final ArrayList f14497c;
    public final HashMap d;
    public final FrameLayout f14498e;
    public final ek0 f14499f;
    public final v4.c0 h;
    public final b9 f14500n;
    public final d9 f14501r;
    public final View f14502s;
    public final e f14503w;
    public final e f14504x;
    public final y8 f14505y;

    public f9(k9 k9Var, Context context) {
        super(context);
        this.f14495a0 = k9Var;
        this.f14496b = new a0.h();
        this.f14497c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i7 = k9.Y1;
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, k9Var.J0);
        this.E = y3Var;
        y8 y8Var = new y8(this, context, k9Var.J0, new v8(this, 4));
        this.f14505y = y8Var;
        int i10 = org.telegram.ui.ActionBar.n6.f29524h5;
        org.telegram.ui.ActionBar.u6.h(i10, y8Var, k9Var.J0);
        y8Var.setOnSearchTextChange(new w8(this, 3));
        s8 s8Var = new s8(context, k9Var.J0);
        this.F = s8Var;
        s8Var.h = new v8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14498e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24220m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.na.e(-1, -1, 119));
        ek0 ek0Var = new ek0(context, k9Var.J0);
        this.f14499f = ek0Var;
        ek0Var.setClipToPadding(false);
        ek0Var.setTranslateSelector(true);
        b9 b9Var = new b9(this, context, k9Var.J0, y8Var, new fi.o3(k9Var, 2));
        this.f14500n = b9Var;
        ek0Var.setAdapter(b9Var);
        b9Var.h = ek0Var;
        v4.c0 c0Var = new v4.c0();
        this.h = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setOnScrollListener(new z8(0, this));
        ek0Var.setOnItemClickListener(new ab.g(18, this, context));
        frameLayout.addView(ek0Var, c8.na.c(-1.0f, -1));
        a9 a9Var = new a9(this);
        a9Var.n(350L);
        a9Var.o(kr.h);
        a9Var.C = false;
        a9Var.f59274m = false;
        ek0Var.setItemAnimator(a9Var);
        frameLayout.addView(y8Var, c8.na.e(-1, -2, 55));
        frameLayout.addView(y3Var, c8.na.e(-1, 32, 55));
        addView(s8Var, c8.na.e(-1, -2, 55));
        d9 d9Var = new d9(this, context);
        this.f14501r = d9Var;
        d9Var.setClickable(true);
        d9Var.setOrientation(1);
        d9Var.setPadding(org.telegram.messenger.g0.L(10.0f) + k9Var.f30261u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + k9Var.f30261u0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.u6.h(i10, d9Var, k9Var.J0);
        e eVar = new e(context, k9Var.J0, true);
        this.f14503w = eVar;
        eVar.setOnClickListener(new u8(this, 0));
        eVar.f();
        d9Var.addView(eVar, c8.na.r(-1, 48, 87));
        e eVar2 = new e(context, k9Var.J0, false);
        this.f14504x = eVar2;
        eVar2.setOnClickListener(new u8(this, 1));
        eVar2.f();
        d9Var.addView(eVar2, c8.na.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f14502s = view;
        org.telegram.ui.ActionBar.u6.h(i10, view, k9Var.J0);
        addView(view, c8.na.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(d9Var, c8.na.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = org.telegram.messenger.g0.M3(n10.q(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !i5.c.B(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.M3(n10.o(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !i5.c.B(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                TLRPC.TL_username tL_username = arrayList.get(i7);
                                if (tL_username.active && org.telegram.messenger.g0.M3(tL_username.username).toLowerCase().startsWith(str)) {
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
                String lowerCase3 = org.telegram.messenger.g0.M3(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str) && !i5.c.B(" ", str, lowerCase3)) {
                    String lowerCase4 = org.telegram.messenger.g0.M3(org.telegram.messenger.v3.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !i5.c.B(" ", str, lowerCase4)) {
                        ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                        if (arrayList2 != null) {
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                TLRPC.TL_username tL_username2 = arrayList2.get(i10);
                                if (tL_username2.active && org.telegram.messenger.g0.M3(tL_username2.username).toLowerCase().startsWith(str)) {
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
        if (this.f14494a == 6) {
            ArrayList arrayList = this.f14497c;
            arrayList.clear();
            int i7 = k9.Y1;
            arrayList.addAll(mp.u1(this.f14495a0.f30223a).R1().L);
            int i10 = 0;
            while (true) {
                a0.h hVar = this.f14496b;
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
        this.f14494a = i7;
        this.f14496b.b();
        ArrayList arrayList = this.f14497c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        k9 k9Var = this.f14495a0;
        if (i7 == 4) {
            arrayList.addAll(k9Var.f14788o1);
            hashMap.putAll(k9Var.f14789p1);
        } else if (i7 == 5) {
            arrayList.addAll(k9Var.E1);
        } else if (i7 == 1) {
            ArrayList K0 = k9.K0(k9Var);
            for (int i11 = 0; i11 < K0.size(); i11 = com.google.android.gms.internal.vision.e2.g(i11, 1, ((TLRPC.User) K0.get(i11)).f28641id, arrayList)) {
            }
        } else if (i7 == 2) {
            arrayList.addAll(k9Var.f14791r1);
        } else if (i7 == 3) {
            arrayList.addAll(k9Var.f14792s1);
            hashMap.putAll(k9Var.f14793t1);
        } else if (i7 == 6) {
            a(false);
        }
        this.f14500n.getClass();
        this.h.k1(false);
        j(false);
        y8 y8Var = this.f14505y;
        y8Var.setText("");
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        y8Var.setVisibility(i10);
        y8Var.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i12 = this.f14494a;
        ek0 ek0Var = this.f14499f;
        if (i12 != 0) {
            ek0Var.v0(0);
        }
        ek0Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i7 = 0;
        float f10 = -i5.c.d(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.f14505y.L), 0);
        while (true) {
            ek0 ek0Var = this.f14499f;
            if (i7 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i7);
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
        if (i7 == ks.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (t1Var = this.H) != null && this.I == chatFull.f28493id) {
            t1Var.c(350L);
            this.H = null;
            this.I = -1L;
            e(chatFull.f28493id, chatFull.participants);
        }
    }

    public final void e(long j3, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = this.f14494a;
        int i10 = 0;
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        k9 k9Var = this.f14495a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j10 = chatParticipants.participants.get(i11).user_id;
                int i12 = k9.Y1;
                TLRPC.User c22 = mp.u1(k9Var.f30223a).c2(Long.valueOf(j10));
                if (c22 != null && !n10.C(c22) && !c22.bot && c22.f28641id != 777000 && j10 != 0) {
                    if (z10 && !c22.contact) {
                        arrayList2.add(Long.valueOf(j10));
                    } else {
                        arrayList.add(Long.valueOf(j10));
                    }
                    this.f14497c.remove(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                int i13 = k9.Y1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, k9Var.J0);
                alertDialog$Builder.f28835a.U = gd.N0(2131744294, null);
                i5.c.y(null, 2131752577, alertDialog$Builder, null);
                return;
            }
            Context context2 = getContext();
            int i14 = k9.Y1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, k9Var.J0);
            alertDialog$Builder2.f28835a.U = gd.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
            alertDialog$Builder2.k(gd.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new di.h(this, j3, arrayList, 2));
            i5.c.y(null, 2131752577, alertDialog$Builder2, null);
            return;
        }
        this.d.put(Long.valueOf(j3), arrayList);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f14496b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        j(true);
        f(true);
        g(true);
        this.f14505y.M = true;
    }

    public final void f(boolean z10) {
        boolean z11;
        int i7;
        int i10 = this.f14494a;
        k9 k9Var = this.f14495a0;
        e eVar = this.f14504x;
        int i11 = 0;
        boolean z12 = false;
        e eVar2 = this.f14503w;
        if (i10 == 0) {
            eVar2.setShowZero(false);
            eVar2.setEnabled(true);
            eVar2.c(0, z10);
            if (k9Var.G1) {
                eVar2.i(gd.N0(2131744310, null), z10, true);
            } else if (k9Var.U1) {
                eVar2.i(gd.N0(2131744310, null), z10, true);
            } else {
                int i12 = k9Var.D1;
                if (i12 == 1) {
                    if (k9Var.F1) {
                        i7 = 2131744375;
                    } else {
                        i7 = 2131744314;
                    }
                    eVar2.i(gd.N0(i7, null), z10, true);
                } else {
                    eVar2.i(gd.H(',', "StoryPrivacyButtonPostMultiple", i12), z10, true);
                }
            }
            eVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f14497c;
        if (i10 == 1) {
            eVar2.setShowZero(false);
            eVar2.setEnabled(true);
            eVar2.i(gd.N0(2131744309, null), z10, true);
            eVar2.c(arrayList.size(), z10);
            eVar.setVisibility(8);
            return;
        }
        d9 d9Var = this.f14501r;
        if (i10 == 3) {
            int size = k9.S0(arrayList, this.d).size();
            k9Var.f14794u1 = size;
            eVar2.i(gd.N0(2131744310, null), z10, true);
            eVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            d9Var.b(z11, z10);
            eVar2.c(size, z10);
            if (size > 0) {
                z12 = true;
            }
            eVar2.setEnabled(z12);
            eVar.setVisibility(8);
        } else if (i10 == 2) {
            eVar2.setShowZero(false);
            eVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                eVar2.i(gd.N0(2131744310, null), z10, true);
                eVar2.c(0, z10);
            } else {
                eVar2.i(gd.N0(2131744315, null), z10, true);
                eVar2.c(arrayList.size(), z10);
            }
            eVar.setVisibility(8);
        } else if (i10 == 5) {
            eVar2.setShowZero(true);
            eVar2.setEnabled(!arrayList.isEmpty());
            eVar2.c(arrayList.size(), z10);
            eVar.setVisibility(8);
        } else if (i10 == 6) {
            eVar2.setShowZero(false);
            eVar2.setEnabled(true);
            eVar2.i(gd.N0(2131744309, null), z10, true);
            int i13 = k9.Y1;
            fi.p6 R1 = mp.u1(k9Var.f30223a).R1();
            if (!R1.O) {
                while (true) {
                    a0.h hVar = this.f14496b;
                    if (i11 >= hVar.m()) {
                        break;
                    }
                    long j3 = hVar.j(i11);
                    ((Boolean) hVar.n(i11)).getClass();
                    R1.L.contains(Long.valueOf(j3));
                    i11++;
                }
            } else {
                eVar2.c(arrayList.size(), z10);
            }
            eVar.setVisibility(8);
        } else if (i10 == 4) {
            int size2 = k9.S0(k9Var.f14788o1, k9Var.f14789p1).size();
            k9Var.f14790q1 = size2;
            eVar2.i(gd.N0(2131744310, null), z10, true);
            eVar2.setShowZero(false);
            d9Var.b(false, z10);
            eVar2.c(size2, z10);
            eVar2.setEnabled(true);
            eVar.setVisibility(8);
        }
    }

    public final void g(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        k9 k9Var = this.f14495a0;
        ArrayList arrayList2 = k9Var.E1;
        HashMap hashMap = k9Var.f14793t1;
        ArrayList arrayList3 = k9Var.f14792s1;
        ArrayList arrayList4 = k9Var.f14791r1;
        HashMap hashMap2 = k9Var.f14789p1;
        ArrayList arrayList5 = k9Var.f14788o1;
        int i7 = this.f14494a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f14497c;
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
        if (this.f14494a == 3 && (k9Var.I1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.S;
                if (i10 != -1) {
                    k9Var.I1 = i10;
                }
            } else {
                this.S = k9Var.I1;
                k9Var.I1 = 3;
            }
        }
        HashSet S0 = k9.S0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.M;
            boolean z12 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            t8 t8Var = (t8) arrayList.get(i11);
            if (t8Var != null) {
                int i12 = t8Var.f15447i;
                if (i12 > 0) {
                    if (k9Var.I1 != i12) {
                        z12 = false;
                    }
                    t8Var.f15449k = z12;
                    t8Var.f15450l = false;
                } else {
                    TLRPC.User user = t8Var.f15446g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f28641id));
                        t8Var.f15449k = contains;
                        if (contains || !S0.contains(Long.valueOf(t8Var.f15446g.f28641id))) {
                            z12 = false;
                        }
                        t8Var.f15450l = z12;
                    } else {
                        TLRPC.Chat chat = t8Var.h;
                        if (chat != null) {
                            t8Var.f15449k = hashMap3.containsKey(Long.valueOf(chat.f28492id));
                            t8Var.f15450l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            ek0 ek0Var = this.f14499f;
            if (i13 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i13);
                if ((childAt instanceof j9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    t8 t8Var2 = (t8) arrayList.get(R);
                    j9 j9Var = (j9) childAt;
                    if (!t8Var2.f15449k && !t8Var2.f15450l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    j9Var.c(z11, z10);
                    TLRPC.Chat chat2 = t8Var2.h;
                    float f10 = 1.0f;
                    if (chat2 != null) {
                        if (k9.L0(k9Var, chat2) > 200) {
                            f10 = 0.3f;
                        }
                        j9Var.b(z10, f10);
                    } else {
                        if (t8Var2.f15450l && !t8Var2.f15449k) {
                            f10 = 0.5f;
                        }
                        j9Var.b(z10, f10);
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
        throw new UnsupportedOperationException("Method not decompiled: hi.f9.h(boolean):void");
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.y3 y3Var = this.E;
        if (y3Var == null) {
            return;
        }
        if (k9.S0(this.f14497c, this.d).size() > 0) {
            y3Var.a(gd.N0(2131743383, null), new u8(this, 2));
        } else if (z10) {
            y3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.x3 x3Var = y3Var.f32554b;
            x3Var.c(null, false, true);
            x3Var.setOnClickListener(null);
            x3Var.setVisibility(0);
        }
    }

    public final void j(boolean z10) {
        y8 y8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object O0;
        HashSet S0 = k9.S0(this.f14497c, this.d);
        int i7 = this.f14494a;
        k9 k9Var = this.f14495a0;
        if (i7 == 3) {
            k9Var.f14794u1 = S0.size();
        } else if (i7 == 4) {
            k9Var.f14790q1 = S0.size();
        }
        mp u12 = mp.u1(k9Var.f30223a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        while (true) {
            y8Var = this.f14505y;
            ArrayList arrayList4 = y8Var.f14599e;
            arrayList = y8Var.f14599e;
            if (i10 >= arrayList4.size()) {
                break;
            }
            n20 n20Var = (n20) arrayList.get(i10);
            if (!S0.contains(Long.valueOf(n20Var.getUid()))) {
                arrayList2.add(n20Var);
            }
            i10++;
        }
        Iterator it = S0.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((n20) arrayList.get(i11)).getUid() == longValue) {
                        break;
                    }
                    i11++;
                } else {
                    if (longValue >= 0) {
                        O0 = u12.c2(l10);
                    } else {
                        O0 = u12.O0(l10);
                    }
                    Object obj = O0;
                    if (obj != null) {
                        n20 n20Var2 = new n20(getContext(), obj, null, true, k9Var.J0);
                        n20Var2.setOnClickListener(this);
                        arrayList3.add(n20Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ah.n nVar = y8Var.d;
        ArrayList arrayList5 = nVar.f1090e;
        ArrayList arrayList6 = nVar.d;
        ArrayList arrayList7 = nVar.f1091f;
        h9 h9Var = (h9) nVar.f1092n;
        h9Var.I = true;
        ArrayList arrayList8 = h9Var.f14599e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((n20) arrayList2.get(i12)).setOnClickListener(null);
        }
        nVar.c();
        if (z10) {
            nVar.f1089c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1088b = animatorSet;
            animatorSet.addListener(new g9(nVar, arrayList2, 0));
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
                n20 n20Var3 = (n20) arrayList2.get(i13);
                arrayList5.add(n20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(n20Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(n20Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(n20Var3, property, 1.0f, 0.0f));
                i13++;
            }
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                n20 n20Var4 = (n20) arrayList3.get(i14);
                arrayList6.add(n20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(n20Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(n20Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(n20Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                nVar.removeView((View) arrayList2.get(i15));
            }
            arrayList9.clear();
            nVar.f1088b = null;
            nVar.f1089c = false;
            h9Var.f14597b.setAllowDrawCursor(true);
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
        y8 y8Var = this.f14505y;
        if (!z10 && !this.V && getTranslationX() == 0.0f) {
            if (!this.O || Math.abs(this.P - c10) > 1.0f) {
                this.O = true;
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                float translationY = y8Var.getTranslationY();
                this.P = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new s3(this, 6));
                this.Q.addListener(new ai.g0(this, 26));
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
            y8Var.setTranslationY(c10);
        }
        boolean z12 = this.G;
        s8 s8Var = this.F;
        if (!z12) {
            s8Var.setVisibility(8);
            return;
        }
        s8Var.setVisibility(0);
        float f11 = -s8Var.getHeight();
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f14499f;
            if (i7 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i7);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f11 = this.f14498e.getPaddingTop() + childAt.getY();
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
            org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) s8Var.f15403e;
            if (z11 || this.f14494a != 0) {
                f10 = 0.0f;
            }
            x1Var.c(true, f10);
        }
        s8Var.setTranslationY(Math.max(org.telegram.messenger.g0.f24220m, f11));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = k9.Y1;
        ks.f(this.f14495a0.f30223a).c(this, ks.T);
    }

    @Override
    public final void onClick(View view) {
        y8 y8Var = this.f14505y;
        if (!y8Var.f14599e.contains(view)) {
            return;
        }
        n20 n20Var = (n20) view;
        if (n20Var.E) {
            y8Var.f14600f = null;
            ah.n nVar = y8Var.d;
            h9 h9Var = (h9) nVar.f1092n;
            h9Var.I = true;
            h9Var.f14599e.remove(n20Var);
            n20Var.setOnClickListener(null);
            nVar.c();
            nVar.f1089c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1088b = animatorSet;
            animatorSet.addListener(new ah.l(7, nVar, n20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(n20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.f1090e.clear();
            arrayList2.add(n20Var);
            ArrayList arrayList3 = nVar.f1091f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(n20Var, View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            long uid = n20Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f14497c;
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
            n20 n20Var2 = y8Var.f14600f;
            if (n20Var2 != null) {
                n20Var2.a();
                y8Var.f14600f = null;
            }
            y8Var.f14600f = n20Var;
            n20Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = k9.Y1;
        ks.f(this.f14495a0.f30223a).n(this, ks.T);
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
        int i13 = k9.Y1;
        k9 k9Var = this.f14495a0;
        int i14 = k9Var.f30237f;
        if (i14 > 0) {
            this.U = i14;
        }
        super.onMeasure(i7, i10);
        int i15 = org.telegram.messenger.g0.f24220m;
        if (this.f14494a == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(56.0f);
        }
        this.f14498e.setPadding(0, i15 + L, 0, 0);
        boolean z10 = this.W;
        boolean z11 = k9Var.d;
        ek0 ek0Var = this.f14499f;
        d9 d9Var = this.f14501r;
        if (z10 != z11) {
            float c10 = c();
            if (k9Var.d && c10 + Math.min(org.telegram.messenger.g0.L(150.0f), this.f14505y.L) > ek0Var.getPaddingTop()) {
                pi.l lVar = new pi.l(getContext(), 2, 0.7f);
                lVar.f59190a = 1;
                lVar.f55822p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(lVar);
            }
            int i16 = this.f14494a;
            View view = this.f14502s;
            float f11 = 0.0f;
            if (i16 == 0) {
                if (k9Var.d) {
                    f10 = this.U;
                } else {
                    f10 = 0.0f;
                }
                d9Var.setTranslationY(f10);
                if (k9Var.d) {
                    f11 = this.U;
                }
                view.setTranslationY(f11);
            } else {
                if (k9Var.d) {
                    i11 = this.U;
                } else {
                    i11 = -this.U;
                }
                float f12 = i11;
                ValueAnimator valueAnimator = d9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    d9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                d9Var.d = ofFloat;
                ofFloat.addUpdateListener(new c9(d9Var, 1));
                d9Var.d.addListener(new ai.g0(d9Var, 27));
                d9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = d9Var.d;
                kr krVar = org.telegram.ui.ActionBar.i1.f29066w;
                valueAnimator2.setInterpolator(krVar);
                d9Var.d.start();
                if (k9Var.d) {
                    i12 = this.U;
                } else {
                    i12 = -this.U;
                }
                view.setTranslationY(i12);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(krVar).withEndAction(new v8(this, 2)).start();
            }
            this.W = k9Var.d;
        }
        ek0Var.setPadding(0, 0, 0, d9Var.getMeasuredHeight());
    }
}
