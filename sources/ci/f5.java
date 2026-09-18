package ci;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f5 implements Runnable {
    public final int f4658a;
    public final r6 f4659b;
    public final qg.j f4660c;

    public f5(r6 r6Var, qg.j jVar, int i10) {
        this.f4658a = i10;
        this.f4659b = r6Var;
        this.f4660c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f4658a) {
            case 0:
                this.f4659b.C0(this.f4660c);
                return;
            default:
                final r6 r6Var = this.f4659b;
                k6 k6Var = r6Var.R0;
                t5 t5Var = r6Var.O1;
                e6 e6Var = r6Var.G1;
                LinearLayout linearLayout = new LinearLayout(r6Var.getContext());
                linearLayout.setOrientation(0);
                final qg.j jVar = this.f4660c;
                boolean z10 = jVar instanceof qg.e1;
                if (!z10) {
                    TextView textView = new TextView(r6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.u2 u2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    r6 r6Var2 = r6Var;
                                    if (z11) {
                                        ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                        if (ecVar != null) {
                                            ecVar.B();
                                        }
                                    } else {
                                        r6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        r6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    r6 r6Var3 = r6Var;
                                    r6Var3.getClass();
                                    try {
                                        ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        r6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r6 r6Var4 = r6Var;
                                    r6Var4.D0(jVar, true);
                                    r6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        r6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r6 r6Var5 = r6Var;
                                    r6Var5.D0(null, true);
                                    qg.j jVar4 = jVar;
                                    r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        r6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r6 r6Var6 = r6Var;
                                    r6Var6.D0(null, true);
                                    r6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        r6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.n2) {
                                        ((qg.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f41569r0 = !b2Var.f41569r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
                                    }
                                    r6 r6Var7 = r6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        r6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r6 r6Var8 = r6Var;
                                    r6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        r6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r6 r6Var9 = r6Var;
                                    k6 k6Var2 = r6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.n2) {
                                            qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                            n2Var.setDelegate(r6Var9);
                                            k6Var2.addView(n2Var);
                                            r6Var9.g0();
                                            u2Var = n2Var;
                                        } else if (jVar6 instanceof qg.u2) {
                                            qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                            u2Var2.setDelegate(r6Var9);
                                            u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                            r6Var9.g0();
                                            u2Var = u2Var2;
                                        }
                                        r6Var9.B0(u2Var);
                                        r6Var9.D0(null, true);
                                        r6Var9.d0(u2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        r6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.y5.n(-2, 44));
                }
                if (jVar instanceof qg.u2) {
                    TextView textView2 = new TextView(r6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((t5Var.c() && !t5Var.d) || r6Var.f5446t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                qg.u2 u2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.b2;
                                        r6 r6Var2 = r6Var;
                                        if (z11) {
                                            ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                            if (ecVar != null) {
                                                ecVar.B();
                                            }
                                        } else {
                                            r6Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            r6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        qg.j jVar3 = jVar;
                                        r6 r6Var3 = r6Var;
                                        r6Var3.getClass();
                                        try {
                                            ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            r6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        r6 r6Var4 = r6Var;
                                        r6Var4.D0(jVar, true);
                                        r6Var4.r0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            r6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        r6 r6Var5 = r6Var;
                                        r6Var5.D0(null, true);
                                        qg.j jVar4 = jVar;
                                        r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            r6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        r6 r6Var6 = r6Var;
                                        r6Var6.D0(null, true);
                                        r6Var6.K0((qg.q0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            r6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.n2) {
                                            ((qg.n2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.a2) {
                                            ((qg.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.b2) {
                                            qg.b2 b2Var = (qg.b2) jVar5;
                                            b2Var.f41569r0 = !b2Var.f41569r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((qg.x1) jVar5).r(true);
                                        }
                                        r6 r6Var7 = r6Var;
                                        org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                        if (n1Var6 != null && n1Var6.isShowing()) {
                                            r6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        r6 r6Var8 = r6Var;
                                        r6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            r6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        r6 r6Var9 = r6Var;
                                        k6 k6Var2 = r6Var9.R0;
                                        qg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = r6Var9.Q0(jVar6);
                                            if (jVar6 instanceof qg.n2) {
                                                qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                                n2Var.setDelegate(r6Var9);
                                                k6Var2.addView(n2Var);
                                                r6Var9.g0();
                                                u2Var = n2Var;
                                            } else if (jVar6 instanceof qg.u2) {
                                                qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                                u2Var2.setDelegate(r6Var9);
                                                u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                                r6Var9.g0();
                                                u2Var = u2Var2;
                                            }
                                            r6Var9.B0(u2Var);
                                            r6Var9.D0(null, true);
                                            r6Var9.d0(u2Var);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                        if (n1Var8 != null && n1Var8.isShowing()) {
                                            r6Var9.H1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                qg.u2 u2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.b2;
                                        r6 r6Var2 = r6Var;
                                        if (z11) {
                                            ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                            if (ecVar != null) {
                                                ecVar.B();
                                            }
                                        } else {
                                            r6Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            r6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        qg.j jVar3 = jVar;
                                        r6 r6Var3 = r6Var;
                                        r6Var3.getClass();
                                        try {
                                            ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            r6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        r6 r6Var4 = r6Var;
                                        r6Var4.D0(jVar, true);
                                        r6Var4.r0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            r6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        r6 r6Var5 = r6Var;
                                        r6Var5.D0(null, true);
                                        qg.j jVar4 = jVar;
                                        r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            r6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        r6 r6Var6 = r6Var;
                                        r6Var6.D0(null, true);
                                        r6Var6.K0((qg.q0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            r6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.n2) {
                                            ((qg.n2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.a2) {
                                            ((qg.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.b2) {
                                            qg.b2 b2Var = (qg.b2) jVar5;
                                            b2Var.f41569r0 = !b2Var.f41569r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((qg.x1) jVar5).r(true);
                                        }
                                        r6 r6Var7 = r6Var;
                                        org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                        if (n1Var6 != null && n1Var6.isShowing()) {
                                            r6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        r6 r6Var8 = r6Var;
                                        r6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            r6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        r6 r6Var9 = r6Var;
                                        k6 k6Var2 = r6Var9.R0;
                                        qg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = r6Var9.Q0(jVar6);
                                            if (jVar6 instanceof qg.n2) {
                                                qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                                n2Var.setDelegate(r6Var9);
                                                k6Var2.addView(n2Var);
                                                r6Var9.g0();
                                                u2Var = n2Var;
                                            } else if (jVar6 instanceof qg.u2) {
                                                qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                                u2Var2.setDelegate(r6Var9);
                                                u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                                r6Var9.g0();
                                                u2Var = u2Var2;
                                            }
                                            r6Var9.B0(u2Var);
                                            r6Var9.D0(null, true);
                                            r6Var9.d0(u2Var);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                        if (n1Var8 != null && n1Var8.isShowing()) {
                                            r6Var9.H1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.y5.n(-2, 44));
                } else if (jVar instanceof qg.t0) {
                    TextView h02 = r6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.u2 u2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    r6 r6Var2 = r6Var;
                                    if (z11) {
                                        ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                        if (ecVar != null) {
                                            ecVar.B();
                                        }
                                    } else {
                                        r6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        r6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    r6 r6Var3 = r6Var;
                                    r6Var3.getClass();
                                    try {
                                        ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        r6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r6 r6Var4 = r6Var;
                                    r6Var4.D0(jVar, true);
                                    r6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        r6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r6 r6Var5 = r6Var;
                                    r6Var5.D0(null, true);
                                    qg.j jVar4 = jVar;
                                    r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        r6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r6 r6Var6 = r6Var;
                                    r6Var6.D0(null, true);
                                    r6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        r6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.n2) {
                                        ((qg.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f41569r0 = !b2Var.f41569r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
                                    }
                                    r6 r6Var7 = r6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        r6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r6 r6Var8 = r6Var;
                                    r6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        r6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r6 r6Var9 = r6Var;
                                    k6 k6Var2 = r6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.n2) {
                                            qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                            n2Var.setDelegate(r6Var9);
                                            k6Var2.addView(n2Var);
                                            r6Var9.g0();
                                            u2Var = n2Var;
                                        } else if (jVar6 instanceof qg.u2) {
                                            qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                            u2Var2.setDelegate(r6Var9);
                                            u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                            r6Var9.g0();
                                            u2Var = u2Var2;
                                        }
                                        r6Var9.B0(u2Var);
                                        r6Var9.D0(null, true);
                                        r6Var9.d0(u2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        r6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h02, w7.y5.n(-2, 44));
                } else if (jVar instanceof qg.q0) {
                    TextView h03 = r6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.u2 u2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    r6 r6Var2 = r6Var;
                                    if (z11) {
                                        ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                        if (ecVar != null) {
                                            ecVar.B();
                                        }
                                    } else {
                                        r6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        r6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    r6 r6Var3 = r6Var;
                                    r6Var3.getClass();
                                    try {
                                        ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        r6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r6 r6Var4 = r6Var;
                                    r6Var4.D0(jVar, true);
                                    r6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        r6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r6 r6Var5 = r6Var;
                                    r6Var5.D0(null, true);
                                    qg.j jVar4 = jVar;
                                    r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        r6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r6 r6Var6 = r6Var;
                                    r6Var6.D0(null, true);
                                    r6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        r6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.n2) {
                                        ((qg.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f41569r0 = !b2Var.f41569r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
                                    }
                                    r6 r6Var7 = r6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        r6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r6 r6Var8 = r6Var;
                                    r6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        r6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r6 r6Var9 = r6Var;
                                    k6 k6Var2 = r6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.n2) {
                                            qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                            n2Var.setDelegate(r6Var9);
                                            k6Var2.addView(n2Var);
                                            r6Var9.g0();
                                            u2Var = n2Var;
                                        } else if (jVar6 instanceof qg.u2) {
                                            qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                            u2Var2.setDelegate(r6Var9);
                                            u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                            r6Var9.g0();
                                            u2Var = u2Var2;
                                        }
                                        r6Var9.B0(u2Var);
                                        r6Var9.D0(null, true);
                                        r6Var9.d0(u2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        r6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h03, w7.y5.n(-2, 44));
                }
                if ((jVar instanceof qg.n2) || (jVar instanceof qg.b2) || (jVar instanceof qg.x1) || (jVar instanceof qg.a2)) {
                    TextView h04 = r6Var.h0(4, LocaleController.getString(R.string.Flip));
                    h04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.u2 u2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    r6 r6Var2 = r6Var;
                                    if (z11) {
                                        ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                        if (ecVar != null) {
                                            ecVar.B();
                                        }
                                    } else {
                                        r6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        r6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    r6 r6Var3 = r6Var;
                                    r6Var3.getClass();
                                    try {
                                        ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        r6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r6 r6Var4 = r6Var;
                                    r6Var4.D0(jVar, true);
                                    r6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        r6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r6 r6Var5 = r6Var;
                                    r6Var5.D0(null, true);
                                    qg.j jVar4 = jVar;
                                    r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        r6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r6 r6Var6 = r6Var;
                                    r6Var6.D0(null, true);
                                    r6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        r6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.n2) {
                                        ((qg.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f41569r0 = !b2Var.f41569r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
                                    }
                                    r6 r6Var7 = r6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        r6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r6 r6Var8 = r6Var;
                                    r6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        r6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r6 r6Var9 = r6Var;
                                    k6 k6Var2 = r6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.n2) {
                                            qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                            n2Var.setDelegate(r6Var9);
                                            k6Var2.addView(n2Var);
                                            r6Var9.g0();
                                            u2Var = n2Var;
                                        } else if (jVar6 instanceof qg.u2) {
                                            qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                            u2Var2.setDelegate(r6Var9);
                                            u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                            r6Var9.g0();
                                            u2Var = u2Var2;
                                        }
                                        r6Var9.B0(u2Var);
                                        r6Var9.D0(null, true);
                                        r6Var9.d0(u2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        r6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h04, w7.y5.n(-2, 44));
                }
                boolean z11 = jVar instanceof qg.x1;
                if (k6Var.indexOfChild(jVar) != k6Var.getChildCount() - 1 && !(jVar instanceof qg.a2)) {
                    TextView textView3 = new TextView(r6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.u2 u2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.b2;
                                    r6 r6Var2 = r6Var;
                                    if (z112) {
                                        ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                        if (ecVar != null) {
                                            ecVar.B();
                                        }
                                    } else {
                                        r6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        r6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    r6 r6Var3 = r6Var;
                                    r6Var3.getClass();
                                    try {
                                        ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        r6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r6 r6Var4 = r6Var;
                                    r6Var4.D0(jVar, true);
                                    r6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        r6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r6 r6Var5 = r6Var;
                                    r6Var5.D0(null, true);
                                    qg.j jVar4 = jVar;
                                    r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        r6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r6 r6Var6 = r6Var;
                                    r6Var6.D0(null, true);
                                    r6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        r6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.n2) {
                                        ((qg.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f41569r0 = !b2Var.f41569r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
                                    }
                                    r6 r6Var7 = r6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        r6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r6 r6Var8 = r6Var;
                                    r6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        r6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r6 r6Var9 = r6Var;
                                    k6 k6Var2 = r6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.n2) {
                                            qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                            n2Var.setDelegate(r6Var9);
                                            k6Var2.addView(n2Var);
                                            r6Var9.g0();
                                            u2Var = n2Var;
                                        } else if (jVar6 instanceof qg.u2) {
                                            qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                            u2Var2.setDelegate(r6Var9);
                                            u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                            r6Var9.g0();
                                            u2Var = u2Var2;
                                        }
                                        r6Var9.B0(u2Var);
                                        r6Var9.D0(null, true);
                                        r6Var9.d0(u2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        r6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.y5.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof qg.b2) && !(jVar instanceof qg.t0) && !(jVar instanceof qg.v2) && !(jVar instanceof qg.q0) && !(jVar instanceof qg.a2)) {
                    TextView textView4 = new TextView(r6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.u2 u2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.b2;
                                    r6 r6Var2 = r6Var;
                                    if (z112) {
                                        ec ecVar = ((qb) r6Var2).A2.f5213c1;
                                        if (ecVar != null) {
                                            ecVar.B();
                                        }
                                    } else {
                                        r6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = r6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        r6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    r6 r6Var3 = r6Var;
                                    r6Var3.getClass();
                                    try {
                                        ((qg.u2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = r6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        r6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r6 r6Var4 = r6Var;
                                    r6Var4.D0(jVar, true);
                                    r6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = r6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        r6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r6 r6Var5 = r6Var;
                                    r6Var5.D0(null, true);
                                    qg.j jVar4 = jVar;
                                    r6Var5.L0((qg.t0) jVar4, new ai.m0(2, r6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = r6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        r6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r6 r6Var6 = r6Var;
                                    r6Var6.D0(null, true);
                                    r6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = r6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        r6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.n2) {
                                        ((qg.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f41569r0 = !b2Var.f41569r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
                                    }
                                    r6 r6Var7 = r6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = r6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        r6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r6 r6Var8 = r6Var;
                                    r6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = r6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        r6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r6 r6Var9 = r6Var;
                                    k6 k6Var2 = r6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.n2) {
                                            qg.j n2Var = new qg.n2(r6Var9.getContext(), (qg.n2) jVar6, Q0);
                                            n2Var.setDelegate(r6Var9);
                                            k6Var2.addView(n2Var);
                                            r6Var9.g0();
                                            u2Var = n2Var;
                                        } else if (jVar6 instanceof qg.u2) {
                                            qg.u2 u2Var2 = new qg.u2(r6Var9.getContext(), (qg.u2) jVar6, Q0);
                                            u2Var2.setDelegate(r6Var9);
                                            u2Var2.setMaxWidth(r6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(u2Var2, w7.y5.c(-2.0f, -2));
                                            r6Var9.g0();
                                            u2Var = u2Var2;
                                        }
                                        r6Var9.B0(u2Var);
                                        r6Var9.D0(null, true);
                                        r6Var9.d0(u2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = r6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        r6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, w7.y5.n(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19152i6, e6Var);
                    int i14 = 8;
                    if (i13 == 0) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    if (i13 == linearLayout.getChildCount() - 1) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    if (i13 == linearLayout.getChildCount() - 1) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    if (i13 != 0) {
                        i14 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.j6.a0(v02, i10, i11, i12, i14));
                }
                r6Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
