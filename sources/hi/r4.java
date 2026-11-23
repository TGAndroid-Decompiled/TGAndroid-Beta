package hi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
public final class r4 implements Runnable {
    public final int f15290a;
    public final v5 f15291b;
    public final tg.n f15292c;

    public r4(v5 v5Var, tg.n nVar, int i7) {
        this.f15290a = i7;
        this.f15291b = v5Var;
        this.f15292c = nVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11;
        int i12 = this.f15290a;
        final tg.n nVar = this.f15292c;
        final v5 v5Var = this.f15291b;
        switch (i12) {
            case 0:
                v5Var.B0(nVar);
                return;
            default:
                q5 q5Var = v5Var.B0;
                e5 e5Var = v5Var.f15601y1;
                n5 n5Var = v5Var.f15585q1;
                LinearLayout linearLayout = new LinearLayout(v5Var.getContext());
                linearLayout.setOrientation(0);
                boolean z10 = nVar instanceof tg.z0;
                if (!z10) {
                    TextView textView = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(gd.N0(2131747478, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.q2 q2Var;
                            switch (r3) {
                                case 0:
                                    tg.n nVar2 = nVar;
                                    boolean z11 = nVar2 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z11) {
                                        db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar3 = nVar;
                                    v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.n nVar4 = nVar;
                                    if (nVar4 instanceof tg.j2) {
                                        ((tg.j2) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.v1) {
                                        ((tg.v1) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar4;
                                        w1Var.f58279t0 = !w1Var.f58279t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar4).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar5 = nVar;
                                    if (nVar5 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar5);
                                        if (nVar5 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            q2Var = j2Var;
                                        } else if (nVar5 instanceof tg.q2) {
                                            tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                            q2Var2.setDelegate(v5Var9);
                                            q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            q2Var = q2Var2;
                                        }
                                        v5Var9.A0(q2Var);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(q2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.na.o(-2, 44));
                }
                if (nVar instanceof tg.q2) {
                    TextView textView2 = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((e5Var.c() && !e5Var.d) || v5Var.f15567h2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(gd.N0(2131747241, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.q2 q2Var;
                                switch (r3) {
                                    case 0:
                                        tg.n nVar2 = nVar;
                                        boolean z11 = nVar2 instanceof tg.w1;
                                        v5 v5Var2 = v5Var;
                                        if (z11) {
                                            db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                            if (dbVar != null) {
                                                dbVar.B();
                                            }
                                        } else {
                                            v5Var2.B0(nVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            v5Var2.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        v5 v5Var3 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            v5Var3.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        v5 v5Var4 = v5Var;
                                        v5Var4.D0(nVar, true);
                                        v5Var4.q0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            v5Var4.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        v5 v5Var5 = v5Var;
                                        v5Var5.D0(null, true);
                                        tg.n nVar3 = nVar;
                                        v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            v5Var5.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        v5 v5Var6 = v5Var;
                                        v5Var6.D0(null, true);
                                        v5Var6.K0((tg.p0) nVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            v5Var6.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.n nVar4 = nVar;
                                        if (nVar4 instanceof tg.j2) {
                                            ((tg.j2) nVar4).r(true);
                                        } else if (nVar4 instanceof tg.v1) {
                                            ((tg.v1) nVar4).r(true);
                                        } else if (nVar4 instanceof tg.w1) {
                                            tg.w1 w1Var = (tg.w1) nVar4;
                                            w1Var.f58279t0 = !w1Var.f58279t0;
                                            w1Var.invalidate();
                                        } else {
                                            ((tg.s1) nVar4).r(true);
                                        }
                                        v5 v5Var7 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            v5Var7.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        v5 v5Var8 = v5Var;
                                        v5Var8.getClass();
                                        nVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            v5Var8.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        v5 v5Var9 = v5Var;
                                        q5 q5Var2 = v5Var9.B0;
                                        tg.n nVar5 = nVar;
                                        if (nVar5 != null) {
                                            PointF Q0 = v5Var9.Q0(nVar5);
                                            if (nVar5 instanceof tg.j2) {
                                                tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                                j2Var.setDelegate(v5Var9);
                                                q5Var2.addView(j2Var);
                                                v5Var9.e0();
                                                q2Var = j2Var;
                                            } else if (nVar5 instanceof tg.q2) {
                                                tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                                q2Var2.setDelegate(v5Var9);
                                                q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                                v5Var9.e0();
                                                q2Var = q2Var2;
                                            }
                                            v5Var9.A0(q2Var);
                                            v5Var9.D0(null, true);
                                            v5Var9.c0(q2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            v5Var9.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(gd.N0(2131747476, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.q2 q2Var;
                                switch (r3) {
                                    case 0:
                                        tg.n nVar2 = nVar;
                                        boolean z11 = nVar2 instanceof tg.w1;
                                        v5 v5Var2 = v5Var;
                                        if (z11) {
                                            db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                            if (dbVar != null) {
                                                dbVar.B();
                                            }
                                        } else {
                                            v5Var2.B0(nVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            v5Var2.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        v5 v5Var3 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            v5Var3.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        v5 v5Var4 = v5Var;
                                        v5Var4.D0(nVar, true);
                                        v5Var4.q0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            v5Var4.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        v5 v5Var5 = v5Var;
                                        v5Var5.D0(null, true);
                                        tg.n nVar3 = nVar;
                                        v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            v5Var5.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        v5 v5Var6 = v5Var;
                                        v5Var6.D0(null, true);
                                        v5Var6.K0((tg.p0) nVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            v5Var6.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.n nVar4 = nVar;
                                        if (nVar4 instanceof tg.j2) {
                                            ((tg.j2) nVar4).r(true);
                                        } else if (nVar4 instanceof tg.v1) {
                                            ((tg.v1) nVar4).r(true);
                                        } else if (nVar4 instanceof tg.w1) {
                                            tg.w1 w1Var = (tg.w1) nVar4;
                                            w1Var.f58279t0 = !w1Var.f58279t0;
                                            w1Var.invalidate();
                                        } else {
                                            ((tg.s1) nVar4).r(true);
                                        }
                                        v5 v5Var7 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            v5Var7.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        v5 v5Var8 = v5Var;
                                        v5Var8.getClass();
                                        nVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            v5Var8.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        v5 v5Var9 = v5Var;
                                        q5 q5Var2 = v5Var9.B0;
                                        tg.n nVar5 = nVar;
                                        if (nVar5 != null) {
                                            PointF Q0 = v5Var9.Q0(nVar5);
                                            if (nVar5 instanceof tg.j2) {
                                                tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                                j2Var.setDelegate(v5Var9);
                                                q5Var2.addView(j2Var);
                                                v5Var9.e0();
                                                q2Var = j2Var;
                                            } else if (nVar5 instanceof tg.q2) {
                                                tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                                q2Var2.setDelegate(v5Var9);
                                                q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                                v5Var9.e0();
                                                q2Var = q2Var2;
                                            }
                                            v5Var9.A0(q2Var);
                                            v5Var9.D0(null, true);
                                            v5Var9.c0(q2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            v5Var9.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.na.o(-2, 44));
                    f10 = 14.0f;
                } else if (nVar instanceof tg.s0) {
                    TextView f02 = v5Var.f0(1, gd.N0(2131747476, null));
                    f10 = 14.0f;
                    f02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.q2 q2Var;
                            switch (r3) {
                                case 0:
                                    tg.n nVar2 = nVar;
                                    boolean z11 = nVar2 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z11) {
                                        db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar3 = nVar;
                                    v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.n nVar4 = nVar;
                                    if (nVar4 instanceof tg.j2) {
                                        ((tg.j2) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.v1) {
                                        ((tg.v1) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar4;
                                        w1Var.f58279t0 = !w1Var.f58279t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar4).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar5 = nVar;
                                    if (nVar5 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar5);
                                        if (nVar5 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            q2Var = j2Var;
                                        } else if (nVar5 instanceof tg.q2) {
                                            tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                            q2Var2.setDelegate(v5Var9);
                                            q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            q2Var = q2Var2;
                                        }
                                        v5Var9.A0(q2Var);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(q2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(f02, c8.na.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (nVar instanceof tg.p0) {
                        TextView f03 = v5Var.f0(1, gd.N0(2131747476, null));
                        f03.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                tg.q2 q2Var;
                                switch (r3) {
                                    case 0:
                                        tg.n nVar2 = nVar;
                                        boolean z11 = nVar2 instanceof tg.w1;
                                        v5 v5Var2 = v5Var;
                                        if (z11) {
                                            db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                            if (dbVar != null) {
                                                dbVar.B();
                                            }
                                        } else {
                                            v5Var2.B0(nVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            v5Var2.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        v5 v5Var3 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            v5Var3.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        v5 v5Var4 = v5Var;
                                        v5Var4.D0(nVar, true);
                                        v5Var4.q0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            v5Var4.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        v5 v5Var5 = v5Var;
                                        v5Var5.D0(null, true);
                                        tg.n nVar3 = nVar;
                                        v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            v5Var5.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        v5 v5Var6 = v5Var;
                                        v5Var6.D0(null, true);
                                        v5Var6.K0((tg.p0) nVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            v5Var6.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        tg.n nVar4 = nVar;
                                        if (nVar4 instanceof tg.j2) {
                                            ((tg.j2) nVar4).r(true);
                                        } else if (nVar4 instanceof tg.v1) {
                                            ((tg.v1) nVar4).r(true);
                                        } else if (nVar4 instanceof tg.w1) {
                                            tg.w1 w1Var = (tg.w1) nVar4;
                                            w1Var.f58279t0 = !w1Var.f58279t0;
                                            w1Var.invalidate();
                                        } else {
                                            ((tg.s1) nVar4).r(true);
                                        }
                                        v5 v5Var7 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            v5Var7.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        v5 v5Var8 = v5Var;
                                        v5Var8.getClass();
                                        nVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            v5Var8.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        v5 v5Var9 = v5Var;
                                        q5 q5Var2 = v5Var9.B0;
                                        tg.n nVar5 = nVar;
                                        if (nVar5 != null) {
                                            PointF Q0 = v5Var9.Q0(nVar5);
                                            if (nVar5 instanceof tg.j2) {
                                                tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                                j2Var.setDelegate(v5Var9);
                                                q5Var2.addView(j2Var);
                                                v5Var9.e0();
                                                q2Var = j2Var;
                                            } else if (nVar5 instanceof tg.q2) {
                                                tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                                q2Var2.setDelegate(v5Var9);
                                                q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                                v5Var9.e0();
                                                q2Var = q2Var2;
                                            }
                                            v5Var9.A0(q2Var);
                                            v5Var9.D0(null, true);
                                            v5Var9.c0(q2Var);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            v5Var9.f15587r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        linearLayout.addView(f03, c8.na.o(-2, 44));
                    }
                }
                if ((nVar instanceof tg.j2) || (nVar instanceof tg.w1) || (nVar instanceof tg.s1) || (nVar instanceof tg.v1)) {
                    TextView f04 = v5Var.f0(4, gd.N0(2131750673, null));
                    f04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.q2 q2Var;
                            switch (r3) {
                                case 0:
                                    tg.n nVar2 = nVar;
                                    boolean z11 = nVar2 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z11) {
                                        db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar3 = nVar;
                                    v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.n nVar4 = nVar;
                                    if (nVar4 instanceof tg.j2) {
                                        ((tg.j2) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.v1) {
                                        ((tg.v1) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar4;
                                        w1Var.f58279t0 = !w1Var.f58279t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar4).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar5 = nVar;
                                    if (nVar5 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar5);
                                        if (nVar5 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            q2Var = j2Var;
                                        } else if (nVar5 instanceof tg.q2) {
                                            tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                            q2Var2.setDelegate(v5Var9);
                                            q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            q2Var = q2Var2;
                                        }
                                        v5Var9.A0(q2Var);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(q2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(f04, c8.na.o(-2, 44));
                }
                boolean z11 = nVar instanceof tg.s1;
                if (q5Var.indexOfChild(nVar) != q5Var.getChildCount() - 1 && !(nVar instanceof tg.v1)) {
                    TextView textView3 = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(gd.N0(2131747481, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.q2 q2Var;
                            switch (r3) {
                                case 0:
                                    tg.n nVar2 = nVar;
                                    boolean z112 = nVar2 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z112) {
                                        db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar3 = nVar;
                                    v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.n nVar4 = nVar;
                                    if (nVar4 instanceof tg.j2) {
                                        ((tg.j2) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.v1) {
                                        ((tg.v1) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar4;
                                        w1Var.f58279t0 = !w1Var.f58279t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar4).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar5 = nVar;
                                    if (nVar5 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar5);
                                        if (nVar5 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            q2Var = j2Var;
                                        } else if (nVar5 instanceof tg.q2) {
                                            tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                            q2Var2.setDelegate(v5Var9);
                                            q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            q2Var = q2Var2;
                                        }
                                        v5Var9.A0(q2Var);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(q2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.na.o(-2, 44));
                } else if (!(nVar instanceof tg.d) && !z11 && !z10 && !(nVar instanceof tg.w1) && !(nVar instanceof tg.s0) && !(nVar instanceof tg.r2) && !(nVar instanceof tg.p0) && !(nVar instanceof tg.v1)) {
                    TextView textView4 = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(gd.N0(2131747477, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            tg.q2 q2Var;
                            switch (r3) {
                                case 0:
                                    tg.n nVar2 = nVar;
                                    boolean z112 = nVar2 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z112) {
                                        db dbVar = ((pa) v5Var2).f15198o2.f15067d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.f15587r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.f15587r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.f15587r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar3 = nVar;
                                    v5Var5.L0((tg.s0) nVar3, new bi.r6(9, v5Var5, nVar3));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.f15587r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.f15587r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    tg.n nVar4 = nVar;
                                    if (nVar4 instanceof tg.j2) {
                                        ((tg.j2) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.v1) {
                                        ((tg.v1) nVar4).r(true);
                                    } else if (nVar4 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar4;
                                        w1Var.f58279t0 = !w1Var.f58279t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar4).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.f15587r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.f15587r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.f15587r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar5 = nVar;
                                    if (nVar5 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar5);
                                        if (nVar5 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar5, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            q2Var = j2Var;
                                        } else if (nVar5 instanceof tg.q2) {
                                            tg.q2 q2Var2 = new tg.q2(v5Var9.getContext(), (tg.q2) nVar5, Q0);
                                            q2Var2.setDelegate(v5Var9);
                                            q2Var2.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var2, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            q2Var = q2Var2;
                                        }
                                        v5Var9.A0(q2Var);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(q2Var);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.f15587r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.f15587r1.d(true);
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
                    int i14 = org.telegram.ui.ActionBar.n6.f29543i6;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i14, n5Var);
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
                    org.telegram.ui.ActionBar.u6.Q(childAt, org.telegram.ui.ActionBar.n6.c0(w02, i7, i10, i11, i15), null, org.telegram.ui.ActionBar.u6.M(i14), n5Var);
                }
                v5Var.f15589s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
