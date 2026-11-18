package hi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
public final class h4 implements Runnable {
    public final int f14723a;
    public final l5 f14724b;
    public final tg.j f14725c;

    public h4(l5 l5Var, tg.j jVar, int i7) {
        this.f14723a = i7;
        this.f14724b = l5Var;
        this.f14725c = jVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11;
        int i12 = this.f14723a;
        final tg.j jVar = this.f14725c;
        final l5 l5Var = this.f14724b;
        switch (i12) {
            case 0:
                l5Var.z0(jVar);
                return;
            default:
                g5 g5Var = l5Var.B0;
                t4 t4Var = l5Var.f14940y1;
                d5 d5Var = l5Var.f14924q1;
                LinearLayout linearLayout = new LinearLayout(l5Var.getContext());
                linearLayout.setOrientation(0);
                boolean z10 = jVar instanceof tg.u0;
                if (!z10) {
                    TextView textView = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(gd.M0(2131747479, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.m2 m2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.f2) {
                                        ((tg.f2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f58107s0 = !r1Var.f58107s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            m2Var = f2Var;
                                        } else if (jVar5 instanceof tg.m2) {
                                            tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                            m2Var2.setDelegate(l5Var9);
                                            m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            m2Var = m2Var2;
                                        }
                                        l5Var9.y0(m2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(m2Var);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.ma.o(-2, 44));
                }
                if (jVar instanceof tg.m2) {
                    TextView textView2 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((t4Var.c() && !t4Var.d) || l5Var.d2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(gd.M0(2131747242, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.m2 m2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.r1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                        if (h1Var != null && h1Var.isShowing()) {
                                            l5Var2.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                        if (h1Var2 != null && h1Var2.isShowing()) {
                                            l5Var3.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                        if (h1Var3 != null && h1Var3.isShowing()) {
                                            l5Var4.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                        org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                        if (h1Var4 != null && h1Var4.isShowing()) {
                                            l5Var5.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                        if (h1Var5 != null && h1Var5.isShowing()) {
                                            l5Var6.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.f2) {
                                            ((tg.f2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.q1) {
                                            ((tg.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar4;
                                            r1Var.f58107s0 = !r1Var.f58107s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                        if (h1Var6 != null && h1Var6.isShowing()) {
                                            l5Var7.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                        if (h1Var7 != null && h1Var7.isShowing()) {
                                            l5Var8.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = l5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                                f2Var.setDelegate(l5Var9);
                                                g5Var2.addView(f2Var);
                                                l5Var9.d0();
                                                m2Var = f2Var;
                                            } else if (jVar5 instanceof tg.m2) {
                                                tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                                m2Var2.setDelegate(l5Var9);
                                                m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                                l5Var9.d0();
                                                m2Var = m2Var2;
                                            }
                                            l5Var9.y0(m2Var);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(m2Var);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                        if (h1Var8 != null && h1Var8.isShowing()) {
                                            l5Var9.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(gd.M0(2131747477, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.m2 m2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.r1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                        if (h1Var != null && h1Var.isShowing()) {
                                            l5Var2.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                        if (h1Var2 != null && h1Var2.isShowing()) {
                                            l5Var3.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                        if (h1Var3 != null && h1Var3.isShowing()) {
                                            l5Var4.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                        org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                        if (h1Var4 != null && h1Var4.isShowing()) {
                                            l5Var5.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                        if (h1Var5 != null && h1Var5.isShowing()) {
                                            l5Var6.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.f2) {
                                            ((tg.f2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.q1) {
                                            ((tg.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar4;
                                            r1Var.f58107s0 = !r1Var.f58107s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                        if (h1Var6 != null && h1Var6.isShowing()) {
                                            l5Var7.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                        if (h1Var7 != null && h1Var7.isShowing()) {
                                            l5Var8.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = l5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                                f2Var.setDelegate(l5Var9);
                                                g5Var2.addView(f2Var);
                                                l5Var9.d0();
                                                m2Var = f2Var;
                                            } else if (jVar5 instanceof tg.m2) {
                                                tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                                m2Var2.setDelegate(l5Var9);
                                                m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                                l5Var9.d0();
                                                m2Var = m2Var2;
                                            }
                                            l5Var9.y0(m2Var);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(m2Var);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                        if (h1Var8 != null && h1Var8.isShowing()) {
                                            l5Var9.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.ma.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof tg.n0) {
                    TextView e02 = l5Var.e0(1, gd.M0(2131747477, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.m2 m2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.f2) {
                                        ((tg.f2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f58107s0 = !r1Var.f58107s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            m2Var = f2Var;
                                        } else if (jVar5 instanceof tg.m2) {
                                            tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                            m2Var2.setDelegate(l5Var9);
                                            m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            m2Var = m2Var2;
                                        }
                                        l5Var9.y0(m2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(m2Var);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e02, c8.ma.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof tg.k0) {
                        TextView e03 = l5Var.e0(1, gd.M0(2131747477, null));
                        e03.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.m2 m2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.r1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                        if (h1Var != null && h1Var.isShowing()) {
                                            l5Var2.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                        if (h1Var2 != null && h1Var2.isShowing()) {
                                            l5Var3.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                        if (h1Var3 != null && h1Var3.isShowing()) {
                                            l5Var4.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                        org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                        if (h1Var4 != null && h1Var4.isShowing()) {
                                            l5Var5.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                        if (h1Var5 != null && h1Var5.isShowing()) {
                                            l5Var6.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.f2) {
                                            ((tg.f2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.q1) {
                                            ((tg.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar4;
                                            r1Var.f58107s0 = !r1Var.f58107s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                        if (h1Var6 != null && h1Var6.isShowing()) {
                                            l5Var7.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                        if (h1Var7 != null && h1Var7.isShowing()) {
                                            l5Var8.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = l5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                                f2Var.setDelegate(l5Var9);
                                                g5Var2.addView(f2Var);
                                                l5Var9.d0();
                                                m2Var = f2Var;
                                            } else if (jVar5 instanceof tg.m2) {
                                                tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                                m2Var2.setDelegate(l5Var9);
                                                m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                                l5Var9.d0();
                                                m2Var = m2Var2;
                                            }
                                            l5Var9.y0(m2Var);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(m2Var);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                        if (h1Var8 != null && h1Var8.isShowing()) {
                                            l5Var9.f14926r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        linearLayout.addView(e03, c8.ma.o(-2, 44));
                    }
                }
                if ((jVar instanceof tg.f2) || (jVar instanceof tg.r1) || (jVar instanceof tg.n1) || (jVar instanceof tg.q1)) {
                    TextView e04 = l5Var.e0(4, gd.M0(2131750674, null));
                    e04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.m2 m2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.f2) {
                                        ((tg.f2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f58107s0 = !r1Var.f58107s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            m2Var = f2Var;
                                        } else if (jVar5 instanceof tg.m2) {
                                            tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                            m2Var2.setDelegate(l5Var9);
                                            m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            m2Var = m2Var2;
                                        }
                                        l5Var9.y0(m2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(m2Var);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e04, c8.ma.o(-2, 44));
                }
                boolean z11 = jVar instanceof tg.n1;
                if (g5Var.indexOfChild(jVar) != g5Var.getChildCount() - 1 && !(jVar instanceof tg.q1)) {
                    TextView textView3 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(gd.M0(2131747482, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.m2 m2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z112) {
                                        ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.f2) {
                                        ((tg.f2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f58107s0 = !r1Var.f58107s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            m2Var = f2Var;
                                        } else if (jVar5 instanceof tg.m2) {
                                            tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                            m2Var2.setDelegate(l5Var9);
                                            m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            m2Var = m2Var2;
                                        }
                                        l5Var9.y0(m2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(m2Var);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.ma.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof tg.r1) && !(jVar instanceof tg.n0) && !(jVar instanceof tg.n2) && !(jVar instanceof tg.k0) && !(jVar instanceof tg.q1)) {
                    TextView textView4 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(gd.M0(2131747478, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.m2 m2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z112) {
                                        ja jaVar = ((v9) l5Var2).f15617k2.f15436d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.f14926r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.f14926r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.f14926r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.n0) jVar3, new bi.m6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.f14926r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.f14926r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.f2) {
                                        ((tg.f2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f58107s0 = !r1Var.f58107s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.f14926r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.f14926r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            m2Var = f2Var;
                                        } else if (jVar5 instanceof tg.m2) {
                                            tg.m2 m2Var2 = new tg.m2(l5Var9.getContext(), (tg.m2) jVar5, N0);
                                            m2Var2.setDelegate(l5Var9);
                                            m2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var2, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            m2Var = m2Var2;
                                        }
                                        l5Var9.y0(m2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(m2Var);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.f14926r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.f14926r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.ma.o(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int i14 = org.telegram.ui.ActionBar.n6.f29488i6;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i14, d5Var);
                    int i15 = 8;
                    if (i13 == 0) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    if (i13 == linearLayout.getChildCount() - 1) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    if (i13 == linearLayout.getChildCount() - 1) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    if (i13 != 0) {
                        i15 = 0;
                    }
                    org.telegram.ui.ActionBar.u6.Q(childAt, org.telegram.ui.ActionBar.n6.c0(w02, i7, i10, i11, i15), null, org.telegram.ui.ActionBar.u6.M(i14), d5Var);
                }
                l5Var.f14928s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
