package gi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public final class i4 implements Runnable {
    public final int f12966a;
    public final m5 f12967b;
    public final ug.j f12968c;

    public i4(m5 m5Var, ug.j jVar, int i3) {
        this.f12966a = i3;
        this.f12967b = m5Var;
        this.f12968c = jVar;
    }

    @Override
    public final void run() {
        float f10;
        int i3;
        int i10;
        int i11;
        int i12 = this.f12966a;
        final ug.j jVar = this.f12968c;
        final m5 m5Var = this.f12967b;
        switch (i12) {
            case 0:
                m5Var.z0(jVar);
                return;
            default:
                h5 h5Var = m5Var.B0;
                v4 v4Var = m5Var.f13240y1;
                e5 e5Var = m5Var.f13224q1;
                LinearLayout linearLayout = new LinearLayout(m5Var.getContext());
                linearLayout.setOrientation(0);
                boolean z10 = jVar instanceof ug.t0;
                if (!z10) {
                    TextView textView = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(bd.M0(2131747680, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ug.l2 l2Var;
                            switch (r3) {
                                case 0:
                                    ug.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar3 = jVar;
                                    m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    ug.j jVar4 = jVar;
                                    if (jVar4 instanceof ug.d2) {
                                        ((ug.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.q1) {
                                        ((ug.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar4;
                                        r1Var.f56237s0 = !r1Var.f56237s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            l2Var = d2Var;
                                        } else if (jVar5 instanceof ug.l2) {
                                            ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                            l2Var2.setDelegate(m5Var9);
                                            l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            l2Var = l2Var2;
                                        }
                                        m5Var9.y0(l2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(l2Var);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, mf.o(-2, 44));
                }
                if (jVar instanceof ug.l2) {
                    TextView textView2 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((v4Var.c() && !v4Var.d) || m5Var.f13202d2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(bd.M0(2131747443, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                ug.l2 l2Var;
                                switch (r3) {
                                    case 0:
                                        ug.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof ug.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                        if (f1Var != null && f1Var.isShowing()) {
                                            m5Var2.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                        if (f1Var2 != null && f1Var2.isShowing()) {
                                            m5Var3.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                        if (f1Var3 != null && f1Var3.isShowing()) {
                                            m5Var4.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        ug.j jVar3 = jVar;
                                        m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                        org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                        if (f1Var4 != null && f1Var4.isShowing()) {
                                            m5Var5.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((ug.j0) jVar);
                                        org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                        if (f1Var5 != null && f1Var5.isShowing()) {
                                            m5Var6.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        ug.j jVar4 = jVar;
                                        if (jVar4 instanceof ug.d2) {
                                            ((ug.d2) jVar4).r(true);
                                        } else if (jVar4 instanceof ug.q1) {
                                            ((ug.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof ug.r1) {
                                            ug.r1 r1Var = (ug.r1) jVar4;
                                            r1Var.f56237s0 = !r1Var.f56237s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((ug.n1) jVar4).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                        if (f1Var6 != null && f1Var6.isShowing()) {
                                            m5Var7.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                        if (f1Var7 != null && f1Var7.isShowing()) {
                                            m5Var8.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        ug.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = m5Var9.N0(jVar5);
                                            if (jVar5 instanceof ug.d2) {
                                                ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                                d2Var.setDelegate(m5Var9);
                                                h5Var2.addView(d2Var);
                                                m5Var9.d0();
                                                l2Var = d2Var;
                                            } else if (jVar5 instanceof ug.l2) {
                                                ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                                l2Var2.setDelegate(m5Var9);
                                                l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                                m5Var9.d0();
                                                l2Var = l2Var2;
                                            }
                                            m5Var9.y0(l2Var);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(l2Var);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                        if (f1Var8 != null && f1Var8.isShowing()) {
                                            m5Var9.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(bd.M0(2131747678, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                ug.l2 l2Var;
                                switch (r3) {
                                    case 0:
                                        ug.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof ug.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                        if (f1Var != null && f1Var.isShowing()) {
                                            m5Var2.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                        if (f1Var2 != null && f1Var2.isShowing()) {
                                            m5Var3.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                        if (f1Var3 != null && f1Var3.isShowing()) {
                                            m5Var4.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        ug.j jVar3 = jVar;
                                        m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                        org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                        if (f1Var4 != null && f1Var4.isShowing()) {
                                            m5Var5.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((ug.j0) jVar);
                                        org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                        if (f1Var5 != null && f1Var5.isShowing()) {
                                            m5Var6.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        ug.j jVar4 = jVar;
                                        if (jVar4 instanceof ug.d2) {
                                            ((ug.d2) jVar4).r(true);
                                        } else if (jVar4 instanceof ug.q1) {
                                            ((ug.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof ug.r1) {
                                            ug.r1 r1Var = (ug.r1) jVar4;
                                            r1Var.f56237s0 = !r1Var.f56237s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((ug.n1) jVar4).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                        if (f1Var6 != null && f1Var6.isShowing()) {
                                            m5Var7.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                        if (f1Var7 != null && f1Var7.isShowing()) {
                                            m5Var8.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        ug.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = m5Var9.N0(jVar5);
                                            if (jVar5 instanceof ug.d2) {
                                                ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                                d2Var.setDelegate(m5Var9);
                                                h5Var2.addView(d2Var);
                                                m5Var9.d0();
                                                l2Var = d2Var;
                                            } else if (jVar5 instanceof ug.l2) {
                                                ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                                l2Var2.setDelegate(m5Var9);
                                                l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                                m5Var9.d0();
                                                l2Var = l2Var2;
                                            }
                                            m5Var9.y0(l2Var);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(l2Var);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                        if (f1Var8 != null && f1Var8.isShowing()) {
                                            m5Var9.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, mf.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof ug.m0) {
                    TextView e02 = m5Var.e0(1, bd.M0(2131747678, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ug.l2 l2Var;
                            switch (r3) {
                                case 0:
                                    ug.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar3 = jVar;
                                    m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    ug.j jVar4 = jVar;
                                    if (jVar4 instanceof ug.d2) {
                                        ((ug.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.q1) {
                                        ((ug.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar4;
                                        r1Var.f56237s0 = !r1Var.f56237s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            l2Var = d2Var;
                                        } else if (jVar5 instanceof ug.l2) {
                                            ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                            l2Var2.setDelegate(m5Var9);
                                            l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            l2Var = l2Var2;
                                        }
                                        m5Var9.y0(l2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(l2Var);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e02, mf.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof ug.j0) {
                        TextView e03 = m5Var.e0(1, bd.M0(2131747678, null));
                        e03.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                ug.l2 l2Var;
                                switch (r3) {
                                    case 0:
                                        ug.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof ug.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                        if (f1Var != null && f1Var.isShowing()) {
                                            m5Var2.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                        if (f1Var2 != null && f1Var2.isShowing()) {
                                            m5Var3.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                        if (f1Var3 != null && f1Var3.isShowing()) {
                                            m5Var4.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        ug.j jVar3 = jVar;
                                        m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                        org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                        if (f1Var4 != null && f1Var4.isShowing()) {
                                            m5Var5.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((ug.j0) jVar);
                                        org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                        if (f1Var5 != null && f1Var5.isShowing()) {
                                            m5Var6.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        ug.j jVar4 = jVar;
                                        if (jVar4 instanceof ug.d2) {
                                            ((ug.d2) jVar4).r(true);
                                        } else if (jVar4 instanceof ug.q1) {
                                            ((ug.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof ug.r1) {
                                            ug.r1 r1Var = (ug.r1) jVar4;
                                            r1Var.f56237s0 = !r1Var.f56237s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((ug.n1) jVar4).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                        if (f1Var6 != null && f1Var6.isShowing()) {
                                            m5Var7.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                        if (f1Var7 != null && f1Var7.isShowing()) {
                                            m5Var8.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        ug.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = m5Var9.N0(jVar5);
                                            if (jVar5 instanceof ug.d2) {
                                                ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                                d2Var.setDelegate(m5Var9);
                                                h5Var2.addView(d2Var);
                                                m5Var9.d0();
                                                l2Var = d2Var;
                                            } else if (jVar5 instanceof ug.l2) {
                                                ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                                l2Var2.setDelegate(m5Var9);
                                                l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                                m5Var9.d0();
                                                l2Var = l2Var2;
                                            }
                                            m5Var9.y0(l2Var);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(l2Var);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                        if (f1Var8 != null && f1Var8.isShowing()) {
                                            m5Var9.f13226r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        linearLayout.addView(e03, mf.o(-2, 44));
                    }
                }
                if ((jVar instanceof ug.d2) || (jVar instanceof ug.r1) || (jVar instanceof ug.n1) || (jVar instanceof ug.q1)) {
                    TextView e04 = m5Var.e0(4, bd.M0(2131750691, null));
                    e04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ug.l2 l2Var;
                            switch (r3) {
                                case 0:
                                    ug.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar3 = jVar;
                                    m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    ug.j jVar4 = jVar;
                                    if (jVar4 instanceof ug.d2) {
                                        ((ug.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.q1) {
                                        ((ug.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar4;
                                        r1Var.f56237s0 = !r1Var.f56237s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            l2Var = d2Var;
                                        } else if (jVar5 instanceof ug.l2) {
                                            ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                            l2Var2.setDelegate(m5Var9);
                                            l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            l2Var = l2Var2;
                                        }
                                        m5Var9.y0(l2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(l2Var);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e04, mf.o(-2, 44));
                }
                boolean z11 = jVar instanceof ug.n1;
                if (h5Var.indexOfChild(jVar) != h5Var.getChildCount() - 1 && !(jVar instanceof ug.q1)) {
                    TextView textView3 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(bd.M0(2131747683, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ug.l2 l2Var;
                            switch (r3) {
                                case 0:
                                    ug.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar3 = jVar;
                                    m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    ug.j jVar4 = jVar;
                                    if (jVar4 instanceof ug.d2) {
                                        ((ug.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.q1) {
                                        ((ug.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar4;
                                        r1Var.f56237s0 = !r1Var.f56237s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            l2Var = d2Var;
                                        } else if (jVar5 instanceof ug.l2) {
                                            ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                            l2Var2.setDelegate(m5Var9);
                                            l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            l2Var = l2Var2;
                                        }
                                        m5Var9.y0(l2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(l2Var);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, mf.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof ug.r1) && !(jVar instanceof ug.m0) && !(jVar instanceof ug.m2) && !(jVar instanceof ug.j0) && !(jVar instanceof ug.q1)) {
                    TextView textView4 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(bd.M0(2131747679, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ug.l2 l2Var;
                            switch (r3) {
                                case 0:
                                    ug.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        la laVar = ((x9) m5Var2).f13872k2.f13710d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.f13226r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.f13226r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.f13226r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar3 = jVar;
                                    m5Var5.I0((ug.m0) jVar3, new ai.q4(7, m5Var5, jVar3));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.f13226r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.f13226r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    ug.j jVar4 = jVar;
                                    if (jVar4 instanceof ug.d2) {
                                        ((ug.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.q1) {
                                        ((ug.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar4;
                                        r1Var.f56237s0 = !r1Var.f56237s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar4).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.f13226r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.f13226r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = m5Var9.N0(jVar5);
                                        if (jVar5 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar5, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            l2Var = d2Var;
                                        } else if (jVar5 instanceof ug.l2) {
                                            ug.l2 l2Var2 = new ug.l2(m5Var9.getContext(), (ug.l2) jVar5, N0);
                                            l2Var2.setDelegate(m5Var9);
                                            l2Var2.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var2, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            l2Var = l2Var2;
                                        }
                                        m5Var9.y0(l2Var);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(l2Var);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.f13226r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.f13226r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, mf.o(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int i14 = org.telegram.ui.ActionBar.k6.f27972i6;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i14, e5Var);
                    int i15 = 8;
                    if (i13 == 0) {
                        i3 = 8;
                    } else {
                        i3 = 0;
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
                    org.telegram.ui.ActionBar.r6.R(childAt, org.telegram.ui.ActionBar.k6.c0(w02, i3, i10, i11, i15), null, org.telegram.ui.ActionBar.r6.N(i14), e5Var);
                }
                m5Var.f13228s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
