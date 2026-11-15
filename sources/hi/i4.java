package hi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
public final class i4 implements Runnable {
    public final int f14417a;
    public final m5 f14418b;
    public final tg.j f14419c;

    public i4(m5 m5Var, tg.j jVar, int i7) {
        this.f14417a = i7;
        this.f14418b = m5Var;
        this.f14419c = jVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11;
        int i12 = this.f14417a;
        final tg.j jVar = this.f14419c;
        final m5 m5Var = this.f14418b;
        switch (i12) {
            case 0:
                m5Var.z0(jVar);
                return;
            default:
                h5 h5Var = m5Var.B0;
                v4 v4Var = m5Var.f14701y1;
                e5 e5Var = m5Var.f14685q1;
                LinearLayout linearLayout = new LinearLayout(m5Var.getContext());
                linearLayout.setOrientation(0);
                boolean z10 = jVar instanceof tg.u0;
                if (!z10) {
                    TextView textView = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(hd.M0(2131747672, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.f14687r1.d(true);
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
                                        r1Var.f57540s0 = !r1Var.f57540s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(m5Var9);
                                            h5Var2.addView(f2Var);
                                            m5Var9.d0();
                                            n2Var = f2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(m5Var9);
                                            n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        m5Var9.y0(n2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.ja.o(-2, 44));
                }
                if (jVar instanceof tg.n2) {
                    TextView textView2 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((v4Var.c() && !v4Var.d) || m5Var.d2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(hd.M0(2131747435, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.n2 n2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                            if (iaVar != null) {
                                                iaVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            m5Var2.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            m5Var3.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            m5Var4.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            m5Var5.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            m5Var6.f14687r1.d(true);
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
                                            r1Var.f57540s0 = !r1Var.f57540s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            m5Var7.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            m5Var8.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = m5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                                f2Var.setDelegate(m5Var9);
                                                h5Var2.addView(f2Var);
                                                m5Var9.d0();
                                                n2Var = f2Var;
                                            } else if (jVar5 instanceof tg.n2) {
                                                tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                                n2Var2.setDelegate(m5Var9);
                                                n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                                m5Var9.d0();
                                                n2Var = n2Var2;
                                            }
                                            m5Var9.y0(n2Var);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(n2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            m5Var9.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(hd.M0(2131747670, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.n2 n2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                            if (iaVar != null) {
                                                iaVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            m5Var2.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            m5Var3.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            m5Var4.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            m5Var5.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            m5Var6.f14687r1.d(true);
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
                                            r1Var.f57540s0 = !r1Var.f57540s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            m5Var7.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            m5Var8.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = m5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                                f2Var.setDelegate(m5Var9);
                                                h5Var2.addView(f2Var);
                                                m5Var9.d0();
                                                n2Var = f2Var;
                                            } else if (jVar5 instanceof tg.n2) {
                                                tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                                n2Var2.setDelegate(m5Var9);
                                                n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                                m5Var9.d0();
                                                n2Var = n2Var2;
                                            }
                                            m5Var9.y0(n2Var);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(n2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            m5Var9.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.ja.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof tg.n0) {
                    TextView e02 = m5Var.e0(1, hd.M0(2131747670, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.f14687r1.d(true);
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
                                        r1Var.f57540s0 = !r1Var.f57540s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(m5Var9);
                                            h5Var2.addView(f2Var);
                                            m5Var9.d0();
                                            n2Var = f2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(m5Var9);
                                            n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        m5Var9.y0(n2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e02, c8.ja.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof tg.k0) {
                        TextView e03 = m5Var.e0(1, hd.M0(2131747670, null));
                        e03.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.n2 n2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof tg.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                            if (iaVar != null) {
                                                iaVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            m5Var2.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            m5Var3.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            m5Var4.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            m5Var5.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            m5Var6.f14687r1.d(true);
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
                                            r1Var.f57540s0 = !r1Var.f57540s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            m5Var7.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            m5Var8.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = m5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                                f2Var.setDelegate(m5Var9);
                                                h5Var2.addView(f2Var);
                                                m5Var9.d0();
                                                n2Var = f2Var;
                                            } else if (jVar5 instanceof tg.n2) {
                                                tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                                n2Var2.setDelegate(m5Var9);
                                                n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                                m5Var9.d0();
                                                n2Var = n2Var2;
                                            }
                                            m5Var9.y0(n2Var);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(n2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            m5Var9.f14687r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        linearLayout.addView(e03, c8.ja.o(-2, 44));
                    }
                }
                if ((jVar instanceof tg.f2) || (jVar instanceof tg.r1) || (jVar instanceof tg.n1) || (jVar instanceof tg.q1)) {
                    TextView e04 = m5Var.e0(4, hd.M0(2131750690, null));
                    e04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.f14687r1.d(true);
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
                                        r1Var.f57540s0 = !r1Var.f57540s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(m5Var9);
                                            h5Var2.addView(f2Var);
                                            m5Var9.d0();
                                            n2Var = f2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(m5Var9);
                                            n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        m5Var9.y0(n2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e04, c8.ja.o(-2, 44));
                }
                boolean z11 = jVar instanceof tg.n1;
                if (h5Var.indexOfChild(jVar) != h5Var.getChildCount() - 1 && !(jVar instanceof tg.q1)) {
                    TextView textView3 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(hd.M0(2131747675, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.f14687r1.d(true);
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
                                        r1Var.f57540s0 = !r1Var.f57540s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(m5Var9);
                                            h5Var2.addView(f2Var);
                                            m5Var9.d0();
                                            n2Var = f2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(m5Var9);
                                            n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        m5Var9.y0(n2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.ja.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof tg.r1) && !(jVar instanceof tg.n0) && !(jVar instanceof tg.o2) && !(jVar instanceof tg.k0) && !(jVar instanceof tg.q1)) {
                    TextView textView4 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(hd.M0(2131747671, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.n2 n2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        ia iaVar = ((u9) m5Var2).f15200k2.f15048d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.f14687r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.n2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.f14687r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.f14687r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    m5Var5.I0((tg.n0) jVar3, new bi.e4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.f14687r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.f14687r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.f14687r1.d(true);
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
                                        r1Var.f57540s0 = !r1Var.f57540s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.f14687r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.f14687r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(m5Var9.getContext(), (tg.f2) jVar5, N0);
                                            f2Var.setDelegate(m5Var9);
                                            h5Var2.addView(f2Var);
                                            m5Var9.d0();
                                            n2Var = f2Var;
                                        } else if (jVar5 instanceof tg.n2) {
                                            tg.n2 n2Var2 = new tg.n2(m5Var9.getContext(), (tg.n2) jVar5, N0);
                                            n2Var2.setDelegate(m5Var9);
                                            n2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(n2Var2, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            n2Var = n2Var2;
                                        }
                                        m5Var9.y0(n2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(n2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.f14687r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.f14687r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.ja.o(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int i14 = org.telegram.ui.ActionBar.j6.f28941i6;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i14, e5Var);
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
                    org.telegram.ui.ActionBar.q6.Q(childAt, org.telegram.ui.ActionBar.j6.c0(w02, i7, i10, i11, i15), null, org.telegram.ui.ActionBar.q6.M(i14), e5Var);
                }
                m5Var.f14689s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
