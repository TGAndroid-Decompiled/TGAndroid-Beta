package mg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.j20;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m10;
import org.telegram.ui.t10;
import w7.b6;
import w7.e6;
public class i2 extends ha implements us {
    public static b2 B2;
    public int A2;
    public final int P1;
    public final g2 Q1;
    public final f2 R1;
    public final bi.t0 S1;
    public final e2 T1;
    public final ep U1;
    public final m10 V1;
    public final FrameLayout W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList a2;
    public final ArrayList f13138b2;
    public final ArrayList f13139c2;
    public final HashMap f13140d2;
    public final ArrayList f13141e2;
    public final LinkedHashMap f13142f2;
    public String f13143g2;
    public ng.i f13144h2;
    public int f13145i2;
    public final ArrayList f13146j2;
    public boolean f13147k2;
    public float f13148l2;
    public d2 f13149m2;
    public final org.telegram.messenger.w1 f13150n2;
    public final c2 f13151o2;
    public int f13152p2;
    public eq f13153q2;
    public String f13154r2;
    public t10 f13155s2;
    public q20 f13156t2;
    public final HashSet f13157u2;
    public j20 f13158v2;
    public eq f13159w2;
    public eq f13160x2;
    public boolean f13161y2;
    public boolean f13162z2;

    public i2(Context context, int i10, org.telegram.messenger.w1 w1Var, int i11, p6 p6Var) {
        super(context, null, true, false, p6Var);
        int i12;
        float f7;
        float f10;
        boolean z10;
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Z1 = hashSet;
        this.a2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f13138b2 = arrayList2;
        this.f13139c2 = new ArrayList();
        this.f13140d2 = new HashMap();
        this.f13141e2 = new ArrayList();
        this.f13142f2 = new LinkedHashMap();
        this.f13145i2 = org.telegram.messenger.i0.L(120.0f);
        this.f13146j2 = new ArrayList();
        this.f13147k2 = false;
        this.f13151o2 = new c2(this, 0);
        this.f13152p2 = -1;
        this.f13157u2 = new HashSet();
        this.f21583a = i10;
        int i13 = t6.f21001h5;
        Q(i13);
        this.f21613s = false;
        this.P1 = i11;
        this.f13150n2 = w1Var;
        ng.i iVar = this.f13144h2;
        if (iVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            iVar.f13799y = z10;
        }
        e2 e2Var = new e2(0, getContext(), p6Var);
        this.T1 = e2Var;
        e2Var.setOnCloseClickListener(new w1(this, 11));
        e2Var.setText(O0());
        e2Var.setCloseImageVisible(false);
        e2Var.f45528f.c(false, 0.0f);
        this.f13149m2 = new d2(this, 0);
        f2 f2Var = new f2(this, getContext(), p6Var, 0);
        this.R1 = f2Var;
        a7.i(i13, f2Var, p6Var);
        f2Var.setOnSearchTextChange(new x1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = 2131749659;
        } else {
            i12 = 2131745853;
        }
        f2Var.f45543b.r(cd.L0(i12, null), false);
        bi.t0 t0Var = new bi.t0(this, getContext(), 4);
        this.S1 = t0Var;
        ViewGroup viewGroup = this.f21586b;
        int i14 = this.f21615t0;
        viewGroup.addView(e2Var, 0, b6.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.f21586b;
        int i15 = this.f21615t0;
        viewGroup2.addView(f2Var, b6.f(-2.0f, -1, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.f21586b;
        int i16 = this.f21615t0;
        viewGroup3.addView(t0Var, b6.f(1.0f, -1, 55, i16, 0, i16, 0));
        m10 m10Var = new m10(getContext(), p6Var, (tk0) null);
        this.V1 = m10Var;
        m10Var.setClickable(true);
        m10Var.setOrientation(1);
        m10Var.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        a7.i(i13, m10Var, p6Var);
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i17 = t6.f21020i6;
            org.telegram.ui.Cells.y a02 = t6.a0(t6.w0(i17, this.I0), 6, 6);
            w6 N = a7.N(i17);
            linearLayout.setBackground(a02);
            a7.k(linearLayout, a02, null, N, p6Var);
            ep epVar = new ep(24, context, p6Var);
            this.U1 = epVar;
            epVar.b(t6.Ci, t6.f21039j7, t6.f21059k7);
            epVar.setDrawUnchecked(true);
            epVar.a(false, false);
            epVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(epVar, b6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            a7.V(textView, t6.f21037j5, p6Var);
            sc.e.u(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, b6.t(-2, -2, 16, 9, 0, 0, 0));
            e6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final i2 f13070b;

                {
                    this.f13070b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ep epVar2 = this.f13070b.U1;
                            epVar2.a(!epVar2.f25836a.f23919q, true);
                            return;
                        default:
                            this.f13070b.k1();
                            return;
                    }
                }
            });
            m10Var.addView(linearLayout, b6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        g2 g2Var = new g2(this, getContext(), p6Var, 0);
        this.Q1 = g2Var;
        if (i11 == 4) {
            f7 = 0.0f;
            m10Var.setAlpha(0.0f);
            m10Var.setVisibility(8);
        } else {
            f7 = 0.0f;
        }
        g2Var.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f13070b;

            {
                this.f13070b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ep epVar2 = this.f13070b.U1;
                        epVar2.a(!epVar2.f25836a.f23919q, true);
                        return;
                    default:
                        this.f13070b.k1();
                        return;
                }
            }
        });
        m10Var.addView(g2Var, b6.r(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.f21586b;
            int i18 = this.f21615t0;
            viewGroup4.addView(m10Var, b6.f(-2.0f, -1, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W1 = frameLayout;
        ViewGroup viewGroup5 = this.f21586b;
        int i19 = this.f21615t0;
        viewGroup5.addView(frameLayout, b6.f(300.0f, -1, 87, i19, 0, i19, org.telegram.messenger.i0.L(68.0f)));
        ng.i iVar2 = this.f13144h2;
        tk0 tk0Var = this.f26666k1;
        iVar2.f13794n = arrayList;
        iVar2.f13793f = tk0Var;
        int i20 = this.f21615t0;
        if (i11 != 1) {
            f10 = 60.0f;
        } else {
            f10 = f7;
        }
        tk0Var.setPadding(i20, 0, i20, org.telegram.messenger.i0.L(f10));
        this.f26666k1.j(new ag.u(this, 7));
        this.f26666k1.setOnItemClickListener(new m4.s0(this, i11, p6Var, i10));
        if (i11 == 4) {
            this.f26666k1.setOnItemLongClickListener((jk0) new i2.q(this, i11, 4));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.f26666k1.setItemAnimator(jVar);
        this.f26666k1.i(new u1(this, 1));
        f2Var.setText("");
        f2Var.d.b(false);
        f2Var.b(false, hashSet, new w1(this, 12), null);
        e2Var.setText(O0());
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ui.b0(this.f21583a).f18325i1);
        }
        p1(false, true);
        if (i11 == 0 || i11 == 2) {
            k0.j(i10, null, new x1(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        rh.e6.y(i10, false).U();
    }

    public static boolean i1(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        l1(0, null);
                        return true;
                    }
                }
            } else {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    l1(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static i2 l1(int i10, org.telegram.messenger.w1 w1Var) {
        k2 Q = LaunchActivity.Q();
        if (Q == 0) {
            return null;
        }
        b2 b2Var = B2;
        if (b2Var != null) {
            return b2Var;
        }
        ?? i2Var = new i2(Q.getContext(), Q.getCurrentAccount(), w1Var, i10, Q.getResourceProvider());
        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(Q)) {
            i2Var.a0(Q);
        }
        Q.showDialog(i2Var);
        B2 = i2Var;
        return i2Var;
    }

    @Override
    public final void L() {
        super.L();
        B2 = null;
        org.telegram.messenger.i0.r(this.f13151o2);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        ng.i iVar = new ng.i(getContext(), this.I0, false);
        this.f13144h2 = iVar;
        iVar.f13796s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        String str = this.f13154r2;
        if (str != null) {
            return str;
        }
        int i10 = this.P1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        return cd.L0(2131749609, null);
                    }
                    return cd.L0(2131743451, null);
                }
            } else {
                return cd.L0(2131749616, null);
            }
        }
        return cd.L0(2131749610, null);
    }

    @Override
    public final void R0(Canvas canvas, int i10) {
        float max = Math.max(i10, org.telegram.messenger.i0.f16020m - org.telegram.messenger.i0.L(8.0f)) + org.telegram.messenger.i0.L(8.0f);
        e2 e2Var = this.T1;
        e2Var.setTranslationY(max);
        float translationY = e2Var.getTranslationY() + e2Var.getMeasuredHeight();
        f2 f2Var = this.R1;
        f2Var.setTranslationY(translationY);
        float translationY2 = f2Var.getTranslationY() + f2Var.getMeasuredHeight();
        bi.t0 t0Var = this.S1;
        t0Var.setTranslationY(translationY2);
        int measuredHeight = f2Var.getMeasuredHeight() + e2Var.getMeasuredHeight();
        this.f26666k1.setTranslationY((t0Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.i0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        o1(false, true);
    }

    public final int d1(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !h20.A(user.f19942id)) {
                long j10 = user.f19942id;
                if (j10 != 0 && !this.f13157u2.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f19942id);
                    HashSet hashSet = this.Z1;
                    hashSet.contains(valueOf);
                    i10 += org.telegram.messenger.i0.L(56.0f);
                    ng.h c10 = ng.h.c(user, hashSet.contains(Long.valueOf(user.f19942id)));
                    g1(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int L = org.telegram.messenger.i0.L(32.0f) + i10;
        arrayList.add(ng.h.b(str));
        arrayList.addAll(arrayList3);
        return L;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.S2) {
            dismiss();
        } else if (i10 == zs.O) {
            org.telegram.messenger.i0.g3(new w1(this, 0));
        } else if (i10 == zs.S0) {
            org.telegram.messenger.i0.g3(new w1(this, 6));
        } else if (i10 == zs.E0) {
            org.telegram.messenger.i0.g3(new w1(this, 10));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.i0.v1(this.R1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i10;
        if (this.Z1.isEmpty() && (i10 = this.P1) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f13147k2) {
                this.f13147k2 = false;
                org.telegram.messenger.i0.h3(new w1(this, 4), 10L);
            }
        } else if (!this.f13147k2) {
            this.f13147k2 = true;
            org.telegram.messenger.i0.h3(new w1(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f13143g2)) {
            this.f13143g2 = null;
            this.R1.setText("");
            org.telegram.messenger.i0.r(this.f13151o2);
            o1(true, true);
        }
    }

    public final ng.h g1(ng.h hVar) {
        ag.t0 t0Var;
        int i10 = this.P1;
        if (i10 == 4) {
            TLRPC.User user = hVar.f13780c;
            if (user == null) {
                return hVar;
            }
            final long j10 = user.f19942id;
            ?? r22 = new View.OnClickListener(this) {
                public final i2 f13294b;

                {
                    this.f13294b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            i2 i2Var = this.f13294b;
                            HashSet hashSet = i2Var.Z1;
                            hashSet.add(Long.valueOf(j10));
                            j20 j20Var = i2Var.f13158v2;
                            if (j20Var != null) {
                                j20Var.a(Boolean.FALSE, hashSet);
                                i2Var.f13158v2 = null;
                            }
                            i2Var.dismiss();
                            return;
                        default:
                            i2 i2Var2 = this.f13294b;
                            HashSet hashSet2 = i2Var2.Z1;
                            hashSet2.add(Long.valueOf(j10));
                            j20 j20Var2 = i2Var2.f13158v2;
                            if (j20Var2 != null) {
                                j20Var2.a(Boolean.TRUE, hashSet2);
                                i2Var2.f13158v2 = null;
                            }
                            i2Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final i2 f13294b;

                {
                    this.f13294b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            i2 i2Var = this.f13294b;
                            HashSet hashSet = i2Var.Z1;
                            hashSet.add(Long.valueOf(j10));
                            j20 j20Var = i2Var.f13158v2;
                            if (j20Var != null) {
                                j20Var.a(Boolean.FALSE, hashSet);
                                i2Var.f13158v2 = null;
                            }
                            i2Var.dismiss();
                            return;
                        default:
                            i2 i2Var2 = this.f13294b;
                            HashSet hashSet2 = i2Var2.Z1;
                            hashSet2.add(Long.valueOf(j10));
                            j20 j20Var2 = i2Var2.f13158v2;
                            if (j20Var2 != null) {
                                j20Var2.a(Boolean.TRUE, hashSet2);
                                i2Var2.f13158v2 = null;
                            }
                            i2Var2.dismiss();
                            return;
                    }
                }
            };
            hVar.f13789o = r22;
            hVar.f13790p = r32;
            return hVar;
        }
        TLRPC.User user2 = hVar.f13780c;
        if (i10 == 3) {
            t0Var = null;
        } else {
            t0Var = new ag.t0(10, this, user2);
        }
        hVar.f13788n = t0Var;
        return hVar;
    }

    public final int h1() {
        if (this.P1 == 4) {
            return Math.max(0, (vp.r1(this.f21583a).Q6 - this.f13157u2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z10) {
        ArrayList arrayList = this.a2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(i5.r(this.f21583a).f16065e0);
            this.f13140d2.putAll(i5.r(this.f21583a).f16068g0);
            this.f13141e2.addAll(i5.r(this.f21583a).f16069h0);
            if (z10) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.Z1;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f13146j2;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.P1;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f13142f2.values()) {
                    if (hashSet.contains(Long.valueOf(user.f19942id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.i0.v1(this.R1.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        j20 j20Var = this.f13158v2;
                        if (j20Var != null) {
                            ep epVar = this.U1;
                            j20Var.a(Boolean.valueOf((epVar == null || !epVar.f25836a.f23919q) ? false : false), hashSet);
                            this.f13158v2 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = k0.c(k0.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f19942id;
                        if (h20.b(vp.r1(d20.f15147s0).a2(j10))) {
                            z20.s(cd.a0(null, null, 2131743768, o5.t(j10)), new cc(this.f21589c, this.I0), 2131624011, 36);
                            return;
                        }
                        ph.l1 l1Var = new ph.l1(getContext(), this.f21583a, j10, c10, new x1(this, 1));
                        org.telegram.messenger.w1 w1Var = this.f13150n2;
                        l1Var.e1((w1Var == null || !w1Var.a(j10)) ? false : false);
                        l1Var.show();
                    }
                }
            }
        }
    }

    public final void m1() {
        String L0;
        if (this.P1 == 4) {
            L0 = cd.H(',', "UserSelectorLimit", h1());
        } else {
            L0 = cd.L0(2131753272, null);
        }
        p6 p6Var = this.I0;
        p2 p2Var = this.f21589c;
        new cc(p2Var, p6Var).Q(2131623981, 36, L0).k(true);
        try {
            p2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z10) {
        g2 g2Var = this.Q1;
        boolean z11 = false;
        g2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.P1;
        HashSet hashSet = this.Z1;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) cd.L0(2131752623, null));
        } else if (hashSet.size() == 0) {
            if (cd.X) {
                spannableStringBuilder.append((CharSequence) cd.L0(2131749683, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f13149m2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f13149m2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) cd.L0(2131749683, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) cd.L0(2131749670, "GiftPremiumProceedBtn"));
        }
        g2Var.c(hashSet.size(), true);
        g2Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        g2Var.setEnabled(z11);
    }

    public final void o1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: mg.i2.o1(boolean, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f21583a).c(this, zs.S2);
        zs.f(this.f21583a).c(this, zs.E0);
        zs.f(this.f21583a).c(this, zs.O);
        zs.f(this.f21583a).c(this, zs.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f21583a).n(this, zs.S2);
        zs.f(this.f21583a).n(this, zs.E0);
        zs.f(this.f21583a).n(this, zs.O);
        zs.f(this.f21583a).n(this, zs.S0);
    }

    public final void p1(boolean z10, boolean z11) {
        int R;
        int R2;
        o1(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            tk0 tk0Var = this.f26666k1;
            if (i11 >= tk0Var.getChildCount()) {
                break;
            }
            View childAt = tk0Var.getChildAt(i11);
            if ((childAt instanceof qg.k) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.Y1;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    ng.h hVar = (ng.h) arrayList.get(R2);
                    qg.k kVar = (qg.k) childAt;
                    kVar.c(hVar.f13785k, z10);
                    TLRPC.Chat chat = hVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f13144h2.F(chat) > 200) {
                            f7 = 0.3f;
                        }
                        kVar.i(z10, f7);
                    } else {
                        kVar.i(z10, 1.0f);
                    }
                    i12 = R;
                }
            }
            i11++;
        }
        if (z10) {
            this.f13144h2.k(0, i10);
            ng.i iVar = this.f13144h2;
            iVar.k(i12, iVar.b() - i12);
        }
        n1(z10);
    }

    @Override
    public final void s0() {
        boolean z10;
        boolean z11;
        super.s0();
        try {
            int w02 = t6.w0(t6.Ci, this.I0);
            eq eqVar = this.f13160x2;
            if (eqVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                t6.C1(w02, eqVar.f25839a);
            }
            eq eqVar2 = this.f13159w2;
            if (eqVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                t6.C1(w02, eqVar2.f25839a);
            }
            tk0 tk0Var = this.f26666k1;
            if (tk0Var != null) {
                for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                    tk0Var.getChildAt(i10).invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
