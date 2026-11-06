package fi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
public final class l4 implements Runnable {
    public final int f12316a;
    public final o5 f12317b;
    public final tg.j f12318c;

    public l4(o5 o5Var, tg.j jVar, int i7) {
        this.f12316a = i7;
        this.f12317b = o5Var;
        this.f12318c = jVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11;
        int i12 = this.f12316a;
        final tg.j jVar = this.f12318c;
        final o5 o5Var = this.f12317b;
        switch (i12) {
            case 0:
                o5Var.z0(jVar);
                return;
            default:
                j5 j5Var = o5Var.A0;
                x4 x4Var = o5Var.f12556x1;
                g5 g5Var = o5Var.f12540p1;
                LinearLayout linearLayout = new LinearLayout(o5Var.getContext());
                linearLayout.setOrientation(0);
                boolean z9 = jVar instanceof tg.u0;
                if (!z9) {
                    TextView textView = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(hd.M0(2131747671, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.k2 k2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z10 = jVar2 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z10) {
                                        la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.d2) {
                                        ((tg.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f55812r0 = !r1Var.f55812r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = o5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            k2Var = d2Var;
                                        } else if (jVar5 instanceof tg.k2) {
                                            tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                            k2Var2.setDelegate(o5Var9);
                                            k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            k2Var = k2Var2;
                                        }
                                        o5Var9.y0(k2Var);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(k2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.ha.o(-2, 44));
                }
                if (jVar instanceof tg.k2) {
                    TextView textView2 = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((x4Var.c() && !x4Var.d) || o5Var.f12519c2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(hd.M0(2131747434, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.k2 k2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z10 = jVar2 instanceof tg.r1;
                                        o5 o5Var2 = o5Var;
                                        if (z10) {
                                            la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            o5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            o5Var2.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        o5 o5Var3 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            o5Var3.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        o5 o5Var4 = o5Var;
                                        o5Var4.A0(jVar, true);
                                        o5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            o5Var4.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        o5 o5Var5 = o5Var;
                                        o5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            o5Var5.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        o5 o5Var6 = o5Var;
                                        o5Var6.A0(null, true);
                                        o5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            o5Var6.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.d2) {
                                            ((tg.d2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.q1) {
                                            ((tg.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar4;
                                            r1Var.f55812r0 = !r1Var.f55812r0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        o5 o5Var7 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            o5Var7.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        o5 o5Var8 = o5Var;
                                        o5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            o5Var8.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        o5 o5Var9 = o5Var;
                                        j5 j5Var2 = o5Var9.A0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = o5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.d2) {
                                                tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                                d2Var.setDelegate(o5Var9);
                                                j5Var2.addView(d2Var);
                                                o5Var9.d0();
                                                k2Var = d2Var;
                                            } else if (jVar5 instanceof tg.k2) {
                                                tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                                k2Var2.setDelegate(o5Var9);
                                                k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                                j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                                o5Var9.d0();
                                                k2Var = k2Var2;
                                            }
                                            o5Var9.y0(k2Var);
                                            o5Var9.A0(null, true);
                                            o5Var9.b0(k2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            o5Var9.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(hd.M0(2131747669, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.k2 k2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z10 = jVar2 instanceof tg.r1;
                                        o5 o5Var2 = o5Var;
                                        if (z10) {
                                            la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            o5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            o5Var2.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        o5 o5Var3 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            o5Var3.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        o5 o5Var4 = o5Var;
                                        o5Var4.A0(jVar, true);
                                        o5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            o5Var4.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        o5 o5Var5 = o5Var;
                                        o5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            o5Var5.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        o5 o5Var6 = o5Var;
                                        o5Var6.A0(null, true);
                                        o5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            o5Var6.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.d2) {
                                            ((tg.d2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.q1) {
                                            ((tg.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar4;
                                            r1Var.f55812r0 = !r1Var.f55812r0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        o5 o5Var7 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            o5Var7.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        o5 o5Var8 = o5Var;
                                        o5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            o5Var8.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        o5 o5Var9 = o5Var;
                                        j5 j5Var2 = o5Var9.A0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = o5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.d2) {
                                                tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                                d2Var.setDelegate(o5Var9);
                                                j5Var2.addView(d2Var);
                                                o5Var9.d0();
                                                k2Var = d2Var;
                                            } else if (jVar5 instanceof tg.k2) {
                                                tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                                k2Var2.setDelegate(o5Var9);
                                                k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                                j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                                o5Var9.d0();
                                                k2Var = k2Var2;
                                            }
                                            o5Var9.y0(k2Var);
                                            o5Var9.A0(null, true);
                                            o5Var9.b0(k2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            o5Var9.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.ha.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof tg.n0) {
                    TextView e02 = o5Var.e0(1, hd.M0(2131747669, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.k2 k2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z10 = jVar2 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z10) {
                                        la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.d2) {
                                        ((tg.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f55812r0 = !r1Var.f55812r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = o5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            k2Var = d2Var;
                                        } else if (jVar5 instanceof tg.k2) {
                                            tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                            k2Var2.setDelegate(o5Var9);
                                            k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            k2Var = k2Var2;
                                        }
                                        o5Var9.y0(k2Var);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(k2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e02, c8.ha.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof tg.k0) {
                        TextView e03 = o5Var.e0(1, hd.M0(2131747669, null));
                        e03.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.k2 k2Var;
                                switch (r3) {
                                    case 0:
                                        tg.j jVar2 = jVar;
                                        boolean z10 = jVar2 instanceof tg.r1;
                                        o5 o5Var2 = o5Var;
                                        if (z10) {
                                            la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            o5Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            o5Var2.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        o5 o5Var3 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            o5Var3.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        o5 o5Var4 = o5Var;
                                        o5Var4.A0(jVar, true);
                                        o5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            o5Var4.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        o5 o5Var5 = o5Var;
                                        o5Var5.A0(null, true);
                                        tg.j jVar3 = jVar;
                                        o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            o5Var5.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        o5 o5Var6 = o5Var;
                                        o5Var6.A0(null, true);
                                        o5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            o5Var6.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.j jVar4 = jVar;
                                        if (jVar4 instanceof tg.d2) {
                                            ((tg.d2) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.q1) {
                                            ((tg.q1) jVar4).r(true);
                                        } else if (jVar4 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar4;
                                            r1Var.f55812r0 = !r1Var.f55812r0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar4).r(true);
                                        }
                                        o5 o5Var7 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            o5Var7.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        o5 o5Var8 = o5Var;
                                        o5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            o5Var8.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        o5 o5Var9 = o5Var;
                                        j5 j5Var2 = o5Var9.A0;
                                        tg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = o5Var9.N0(jVar5);
                                            if (jVar5 instanceof tg.d2) {
                                                tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                                d2Var.setDelegate(o5Var9);
                                                j5Var2.addView(d2Var);
                                                o5Var9.d0();
                                                k2Var = d2Var;
                                            } else if (jVar5 instanceof tg.k2) {
                                                tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                                k2Var2.setDelegate(o5Var9);
                                                k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                                j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                                o5Var9.d0();
                                                k2Var = k2Var2;
                                            }
                                            o5Var9.y0(k2Var);
                                            o5Var9.A0(null, true);
                                            o5Var9.b0(k2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            o5Var9.f12542q1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        linearLayout.addView(e03, c8.ha.o(-2, 44));
                    }
                }
                if ((jVar instanceof tg.d2) || (jVar instanceof tg.r1) || (jVar instanceof tg.n1) || (jVar instanceof tg.q1)) {
                    TextView e04 = o5Var.e0(4, hd.M0(2131750691, null));
                    e04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.k2 k2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z10 = jVar2 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z10) {
                                        la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.d2) {
                                        ((tg.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f55812r0 = !r1Var.f55812r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = o5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            k2Var = d2Var;
                                        } else if (jVar5 instanceof tg.k2) {
                                            tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                            k2Var2.setDelegate(o5Var9);
                                            k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            k2Var = k2Var2;
                                        }
                                        o5Var9.y0(k2Var);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(k2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e04, c8.ha.o(-2, 44));
                }
                boolean z10 = jVar instanceof tg.n1;
                if (j5Var.indexOfChild(jVar) != j5Var.getChildCount() - 1 && !(jVar instanceof tg.q1)) {
                    TextView textView3 = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(hd.M0(2131747674, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.k2 k2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z102 = jVar2 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z102) {
                                        la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.d2) {
                                        ((tg.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f55812r0 = !r1Var.f55812r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = o5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            k2Var = d2Var;
                                        } else if (jVar5 instanceof tg.k2) {
                                            tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                            k2Var2.setDelegate(o5Var9);
                                            k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            k2Var = k2Var2;
                                        }
                                        o5Var9.y0(k2Var);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(k2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.ha.o(-2, 44));
                } else if (!z10 && !z9 && !(jVar instanceof tg.r1) && !(jVar instanceof tg.n0) && !(jVar instanceof tg.l2) && !(jVar instanceof tg.k0) && !(jVar instanceof tg.q1)) {
                    TextView textView4 = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(hd.M0(2131747670, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.k2 k2Var;
                            switch (r3) {
                                case 0:
                                    tg.j jVar2 = jVar;
                                    boolean z102 = jVar2 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z102) {
                                        la laVar = ((x9) o5Var2).f13102j2.f12944c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.f12542q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.f12542q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.f12542q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar3 = jVar;
                                    o5Var5.I0((tg.n0) jVar3, new bi.p5(6, o5Var5, jVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.f12542q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.f12542q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.j jVar4 = jVar;
                                    if (jVar4 instanceof tg.d2) {
                                        ((tg.d2) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.q1) {
                                        ((tg.q1) jVar4).r(true);
                                    } else if (jVar4 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar4;
                                        r1Var.f55812r0 = !r1Var.f55812r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar4).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.f12542q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.f12542q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = o5Var9.N0(jVar5);
                                        if (jVar5 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar5, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            k2Var = d2Var;
                                        } else if (jVar5 instanceof tg.k2) {
                                            tg.k2 k2Var2 = new tg.k2(o5Var9.getContext(), (tg.k2) jVar5, N0);
                                            k2Var2.setDelegate(o5Var9);
                                            k2Var2.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var2, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            k2Var = k2Var2;
                                        }
                                        o5Var9.y0(k2Var);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(k2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.f12542q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.f12542q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.ha.o(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int i14 = org.telegram.ui.ActionBar.k6.f27940i6;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i14, g5Var);
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
                    org.telegram.ui.ActionBar.r6.R(childAt, org.telegram.ui.ActionBar.k6.c0(w02, i7, i10, i11, i15), null, org.telegram.ui.ActionBar.r6.N(i14), g5Var);
                }
                o5Var.f12544r1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
