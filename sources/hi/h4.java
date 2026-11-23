package hi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
public final class h4 implements Runnable {
    public final int f14679a;
    public final l5 f14680b;
    public final tg.j f14681c;

    public h4(l5 l5Var, tg.j jVar, int i7) {
        this.f14679a = i7;
        this.f14680b = l5Var;
        this.f14681c = jVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11;
        int i12 = this.f14679a;
        final tg.j jVar = this.f14681c;
        final l5 l5Var = this.f14680b;
        switch (i12) {
            case 0:
                l5Var.z0(jVar);
                return;
            default:
                g5 g5Var = l5Var.B0;
                u4 u4Var = l5Var.f14927y1;
                d5 d5Var = l5Var.f14911q1;
                LinearLayout linearLayout = new LinearLayout(l5Var.getContext());
                linearLayout.setOrientation(0);
                boolean z10 = jVar instanceof tg.v0;
                if (!z10) {
                    TextView textView = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, d5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(hd.N0(2131747478, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.t1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        l5Var2.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        l5Var3.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        l5Var4.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        l5Var5.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.l0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        l5Var6.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.g2) {
                                        ((tg.g2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.s1) {
                                        ((tg.s1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.t1) {
                                        tg.t1 t1Var = (tg.t1) jVar4;
                                        t1Var.f58143s0 = !t1Var.f58143s0;
                                        t1Var.invalidate();
                                    } else {
                                        ((tg.p1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        l5Var7.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        l5Var8.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                            g2Var.setDelegate(l5Var9);
                                            g5Var2.addView(g2Var);
                                            l5Var9.d0();
                                            n2Var = g2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(l5Var9);
                                            n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                            l5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        l5Var9.y0(n2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        l5Var9.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.na.o(-2, 44));
                }
                if (jVar instanceof tg.n2) {
                    TextView textView2 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.E8, d5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((u4Var.c() && !u4Var.d) || l5Var.d2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(hd.N0(2131747241, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.n2 n2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.t1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            l5Var2.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            l5Var3.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            l5Var4.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            l5Var5.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.l0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            l5Var6.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.g2) {
                                            ((tg.g2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.s1) {
                                            ((tg.s1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.t1) {
                                            tg.t1 t1Var = (tg.t1) jVar4;
                                            t1Var.f58143s0 = !t1Var.f58143s0;
                                            t1Var.invalidate();
                                        } else {
                                            ((tg.p1) jVar4).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            l5Var7.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            l5Var8.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = l5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.g2) {
                                                tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                                g2Var.setDelegate(l5Var9);
                                                g5Var2.addView(g2Var);
                                                l5Var9.d0();
                                                n2Var = g2Var;
                                            } else if (jVar5 instanceof tg.n2) {
                                                tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                                n2Var2.setDelegate(l5Var9);
                                                n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                                l5Var9.d0();
                                                n2Var = n2Var2;
                                            }
                                            l5Var9.y0(n2Var);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(n2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            l5Var9.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(hd.N0(2131747476, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.n2 n2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.t1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            l5Var2.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            l5Var3.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            l5Var4.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            l5Var5.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.l0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            l5Var6.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.g2) {
                                            ((tg.g2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.s1) {
                                            ((tg.s1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.t1) {
                                            tg.t1 t1Var = (tg.t1) jVar4;
                                            t1Var.f58143s0 = !t1Var.f58143s0;
                                            t1Var.invalidate();
                                        } else {
                                            ((tg.p1) jVar4).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            l5Var7.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            l5Var8.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = l5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.g2) {
                                                tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                                g2Var.setDelegate(l5Var9);
                                                g5Var2.addView(g2Var);
                                                l5Var9.d0();
                                                n2Var = g2Var;
                                            } else if (jVar5 instanceof tg.n2) {
                                                tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                                n2Var2.setDelegate(l5Var9);
                                                n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                                l5Var9.d0();
                                                n2Var = n2Var2;
                                            }
                                            l5Var9.y0(n2Var);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(n2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            l5Var9.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.na.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof tg.o0) {
                    TextView e02 = l5Var.e0(1, hd.N0(2131747476, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.t1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        l5Var2.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        l5Var3.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        l5Var4.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        l5Var5.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.l0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        l5Var6.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.g2) {
                                        ((tg.g2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.s1) {
                                        ((tg.s1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.t1) {
                                        tg.t1 t1Var = (tg.t1) jVar4;
                                        t1Var.f58143s0 = !t1Var.f58143s0;
                                        t1Var.invalidate();
                                    } else {
                                        ((tg.p1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        l5Var7.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        l5Var8.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                            g2Var.setDelegate(l5Var9);
                                            g5Var2.addView(g2Var);
                                            l5Var9.d0();
                                            n2Var = g2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(l5Var9);
                                            n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                            l5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        l5Var9.y0(n2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        l5Var9.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e02, c8.na.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof tg.l0) {
                        TextView e03 = l5Var.e0(1, hd.N0(2131747476, null));
                        e03.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.n2 n2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.t1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            l5Var2.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            l5Var3.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            l5Var4.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            l5Var5.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.l0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            l5Var6.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.g2) {
                                            ((tg.g2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.s1) {
                                            ((tg.s1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.t1) {
                                            tg.t1 t1Var = (tg.t1) jVar4;
                                            t1Var.f58143s0 = !t1Var.f58143s0;
                                            t1Var.invalidate();
                                        } else {
                                            ((tg.p1) jVar4).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            l5Var7.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            l5Var8.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = l5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.g2) {
                                                tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                                g2Var.setDelegate(l5Var9);
                                                g5Var2.addView(g2Var);
                                                l5Var9.d0();
                                                n2Var = g2Var;
                                            } else if (jVar5 instanceof tg.n2) {
                                                tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                                n2Var2.setDelegate(l5Var9);
                                                n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                                l5Var9.d0();
                                                n2Var = n2Var2;
                                            }
                                            l5Var9.y0(n2Var);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(n2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            l5Var9.f14913r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        linearLayout.addView(e03, c8.na.o(-2, 44));
                    }
                }
                if ((jVar instanceof tg.g2) || (jVar instanceof tg.t1) || (jVar instanceof tg.p1) || (jVar instanceof tg.s1)) {
                    TextView e04 = l5Var.e0(4, hd.N0(2131750673, null));
                    e04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.t1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        l5Var2.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        l5Var3.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        l5Var4.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        l5Var5.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.l0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        l5Var6.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.g2) {
                                        ((tg.g2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.s1) {
                                        ((tg.s1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.t1) {
                                        tg.t1 t1Var = (tg.t1) jVar4;
                                        t1Var.f58143s0 = !t1Var.f58143s0;
                                        t1Var.invalidate();
                                    } else {
                                        ((tg.p1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        l5Var7.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        l5Var8.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                            g2Var.setDelegate(l5Var9);
                                            g5Var2.addView(g2Var);
                                            l5Var9.d0();
                                            n2Var = g2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(l5Var9);
                                            n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                            l5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        l5Var9.y0(n2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        l5Var9.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e04, c8.na.o(-2, 44));
                }
                boolean z11 = jVar instanceof tg.p1;
                if (g5Var.indexOfChild(jVar) != g5Var.getChildCount() - 1 && !(jVar instanceof tg.s1)) {
                    TextView textView3 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.E8, d5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(hd.N0(2131747481, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof tg.t1;
                                    l5 l5Var2 = l5Var;
                                    if (z112) {
                                        ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        l5Var2.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        l5Var3.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        l5Var4.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        l5Var5.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.l0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        l5Var6.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.g2) {
                                        ((tg.g2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.s1) {
                                        ((tg.s1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.t1) {
                                        tg.t1 t1Var = (tg.t1) jVar4;
                                        t1Var.f58143s0 = !t1Var.f58143s0;
                                        t1Var.invalidate();
                                    } else {
                                        ((tg.p1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        l5Var7.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        l5Var8.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                            g2Var.setDelegate(l5Var9);
                                            g5Var2.addView(g2Var);
                                            l5Var9.d0();
                                            n2Var = g2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(l5Var9);
                                            n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                            l5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        l5Var9.y0(n2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        l5Var9.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.na.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof tg.t1) && !(jVar instanceof tg.o0) && !(jVar instanceof tg.o2) && !(jVar instanceof tg.l0) && !(jVar instanceof tg.s1)) {
                    TextView textView4 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.E8, d5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(hd.N0(2131747477, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof tg.t1;
                                    l5 l5Var2 = l5Var;
                                    if (z112) {
                                        ja jaVar = ((v9) l5Var2).f15569k2.f15400d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = l5Var2.f14913r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        l5Var2.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = l5Var3.f14913r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        l5Var3.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = l5Var4.f14913r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        l5Var4.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    l5Var5.I0((tg.o0) jVar3, new bi.r6(9, l5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = l5Var5.f14913r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        l5Var5.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.l0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = l5Var6.f14913r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        l5Var6.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.g2) {
                                        ((tg.g2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.s1) {
                                        ((tg.s1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.t1) {
                                        tg.t1 t1Var = (tg.t1) jVar4;
                                        t1Var.f58143s0 = !t1Var.f58143s0;
                                        t1Var.invalidate();
                                    } else {
                                        ((tg.p1) jVar4).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = l5Var7.f14913r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        l5Var7.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = l5Var8.f14913r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        l5Var8.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = l5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(l5Var9.getContext(), (tg.g2) jVar5, N0);
                                            g2Var.setDelegate(l5Var9);
                                            g5Var2.addView(g2Var);
                                            l5Var9.d0();
                                            n2Var = g2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(l5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(l5Var9);
                                            n2Var2.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(n2Var2, c8.na.c(-2.0f, -2));
                                            l5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        l5Var9.y0(n2Var);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = l5Var9.f14913r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        l5Var9.f14913r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.na.o(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int i14 = org.telegram.ui.ActionBar.m6.f29439i6;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i14, d5Var);
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
                    org.telegram.ui.ActionBar.t6.Q(childAt, org.telegram.ui.ActionBar.m6.c0(w02, i7, i10, i11, i15), null, org.telegram.ui.ActionBar.t6.M(i14), d5Var);
                }
                l5Var.f14915s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
