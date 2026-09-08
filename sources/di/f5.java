package di;

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
    public final int f7258a;
    public final q6 f7259b;
    public final rg.k f7260c;

    public f5(q6 q6Var, rg.k kVar, int i10) {
        this.f7258a = i10;
        this.f7259b = q6Var;
        this.f7260c = kVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f7258a) {
            case 0:
                this.f7259b.C0(this.f7260c);
                return;
            default:
                final q6 q6Var = this.f7259b;
                k6 k6Var = q6Var.R0;
                t5 t5Var = q6Var.O1;
                e6 e6Var = q6Var.G1;
                LinearLayout linearLayout = new LinearLayout(q6Var.getContext());
                linearLayout.setOrientation(0);
                final rg.k kVar = this.f7260c;
                boolean z10 = kVar instanceof rg.g1;
                if (!z10) {
                    TextView textView = new TextView(q6Var.getContext());
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
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.k kVar2 = kVar;
                                    boolean z11 = kVar2 instanceof rg.d2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                        if (fcVar != null) {
                                            fcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.k kVar3 = kVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(kVar, true);
                                    q6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.D0(null, true);
                                    rg.k kVar4 = kVar;
                                    q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((rg.s0) kVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.k kVar5 = kVar;
                                    if (kVar5 instanceof rg.q2) {
                                        ((rg.q2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.c2) {
                                        ((rg.c2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) kVar5;
                                        d2Var.f45189r0 = !d2Var.f45189r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) kVar5).r(true);
                                    }
                                    q6 q6Var7 = q6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        q6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    q6 q6Var8 = q6Var;
                                    q6Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    k6 k6Var2 = q6Var9.R0;
                                    rg.k kVar6 = kVar;
                                    if (kVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(kVar6);
                                        if (kVar6 instanceof rg.q2) {
                                            rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            k6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (kVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            x2Var = x2Var2;
                                        }
                                        q6Var9.B0(x2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        q6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.x5.n(-2, 44));
                }
                if (kVar instanceof rg.x2) {
                    TextView textView2 = new TextView(q6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((t5Var.c() && !t5Var.d) || q6Var.f8018t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rg.x2 x2Var;
                                switch (r3) {
                                    case 0:
                                        rg.k kVar2 = kVar;
                                        boolean z11 = kVar2 instanceof rg.d2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                            if (fcVar != null) {
                                                fcVar.B();
                                            }
                                        } else {
                                            q6Var2.C0(kVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            q6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rg.k kVar3 = kVar;
                                        q6 q6Var3 = q6Var;
                                        q6Var3.getClass();
                                        try {
                                            ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            q6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        q6 q6Var4 = q6Var;
                                        q6Var4.D0(kVar, true);
                                        q6Var4.r0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            q6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        q6 q6Var5 = q6Var;
                                        q6Var5.D0(null, true);
                                        rg.k kVar4 = kVar;
                                        q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.D0(null, true);
                                        q6Var6.K0((rg.s0) kVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.k kVar5 = kVar;
                                        if (kVar5 instanceof rg.q2) {
                                            ((rg.q2) kVar5).r(true);
                                        } else if (kVar5 instanceof rg.c2) {
                                            ((rg.c2) kVar5).r(true);
                                        } else if (kVar5 instanceof rg.d2) {
                                            rg.d2 d2Var = (rg.d2) kVar5;
                                            d2Var.f45189r0 = !d2Var.f45189r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((rg.z1) kVar5).r(true);
                                        }
                                        q6 q6Var7 = q6Var;
                                        org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                        if (n1Var6 != null && n1Var6.isShowing()) {
                                            q6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        q6 q6Var8 = q6Var;
                                        q6Var8.getClass();
                                        kVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            q6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        q6 q6Var9 = q6Var;
                                        k6 k6Var2 = q6Var9.R0;
                                        rg.k kVar6 = kVar;
                                        if (kVar6 != null) {
                                            PointF Q0 = q6Var9.Q0(kVar6);
                                            if (kVar6 instanceof rg.q2) {
                                                rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                                q2Var.setDelegate(q6Var9);
                                                k6Var2.addView(q2Var);
                                                q6Var9.g0();
                                                x2Var = q2Var;
                                            } else if (kVar6 instanceof rg.x2) {
                                                rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                                x2Var2.setDelegate(q6Var9);
                                                x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                                q6Var9.g0();
                                                x2Var = x2Var2;
                                            }
                                            q6Var9.B0(x2Var);
                                            q6Var9.D0(null, true);
                                            q6Var9.d0(x2Var);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                        if (n1Var8 != null && n1Var8.isShowing()) {
                                            q6Var9.H1.d(true);
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
                                rg.x2 x2Var;
                                switch (r3) {
                                    case 0:
                                        rg.k kVar2 = kVar;
                                        boolean z11 = kVar2 instanceof rg.d2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                            if (fcVar != null) {
                                                fcVar.B();
                                            }
                                        } else {
                                            q6Var2.C0(kVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            q6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rg.k kVar3 = kVar;
                                        q6 q6Var3 = q6Var;
                                        q6Var3.getClass();
                                        try {
                                            ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            q6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        q6 q6Var4 = q6Var;
                                        q6Var4.D0(kVar, true);
                                        q6Var4.r0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            q6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        q6 q6Var5 = q6Var;
                                        q6Var5.D0(null, true);
                                        rg.k kVar4 = kVar;
                                        q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.D0(null, true);
                                        q6Var6.K0((rg.s0) kVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.k kVar5 = kVar;
                                        if (kVar5 instanceof rg.q2) {
                                            ((rg.q2) kVar5).r(true);
                                        } else if (kVar5 instanceof rg.c2) {
                                            ((rg.c2) kVar5).r(true);
                                        } else if (kVar5 instanceof rg.d2) {
                                            rg.d2 d2Var = (rg.d2) kVar5;
                                            d2Var.f45189r0 = !d2Var.f45189r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((rg.z1) kVar5).r(true);
                                        }
                                        q6 q6Var7 = q6Var;
                                        org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                        if (n1Var6 != null && n1Var6.isShowing()) {
                                            q6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        q6 q6Var8 = q6Var;
                                        q6Var8.getClass();
                                        kVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            q6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        q6 q6Var9 = q6Var;
                                        k6 k6Var2 = q6Var9.R0;
                                        rg.k kVar6 = kVar;
                                        if (kVar6 != null) {
                                            PointF Q0 = q6Var9.Q0(kVar6);
                                            if (kVar6 instanceof rg.q2) {
                                                rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                                q2Var.setDelegate(q6Var9);
                                                k6Var2.addView(q2Var);
                                                q6Var9.g0();
                                                x2Var = q2Var;
                                            } else if (kVar6 instanceof rg.x2) {
                                                rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                                x2Var2.setDelegate(q6Var9);
                                                x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                                q6Var9.g0();
                                                x2Var = x2Var2;
                                            }
                                            q6Var9.B0(x2Var);
                                            q6Var9.D0(null, true);
                                            q6Var9.d0(x2Var);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                        if (n1Var8 != null && n1Var8.isShowing()) {
                                            q6Var9.H1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.x5.n(-2, 44));
                } else if (kVar instanceof rg.v0) {
                    TextView h02 = q6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.k kVar2 = kVar;
                                    boolean z11 = kVar2 instanceof rg.d2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                        if (fcVar != null) {
                                            fcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.k kVar3 = kVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(kVar, true);
                                    q6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.D0(null, true);
                                    rg.k kVar4 = kVar;
                                    q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((rg.s0) kVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.k kVar5 = kVar;
                                    if (kVar5 instanceof rg.q2) {
                                        ((rg.q2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.c2) {
                                        ((rg.c2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) kVar5;
                                        d2Var.f45189r0 = !d2Var.f45189r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) kVar5).r(true);
                                    }
                                    q6 q6Var7 = q6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        q6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    q6 q6Var8 = q6Var;
                                    q6Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    k6 k6Var2 = q6Var9.R0;
                                    rg.k kVar6 = kVar;
                                    if (kVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(kVar6);
                                        if (kVar6 instanceof rg.q2) {
                                            rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            k6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (kVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            x2Var = x2Var2;
                                        }
                                        q6Var9.B0(x2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        q6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h02, w7.x5.n(-2, 44));
                } else if (kVar instanceof rg.s0) {
                    TextView h03 = q6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.k kVar2 = kVar;
                                    boolean z11 = kVar2 instanceof rg.d2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                        if (fcVar != null) {
                                            fcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.k kVar3 = kVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(kVar, true);
                                    q6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.D0(null, true);
                                    rg.k kVar4 = kVar;
                                    q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((rg.s0) kVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.k kVar5 = kVar;
                                    if (kVar5 instanceof rg.q2) {
                                        ((rg.q2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.c2) {
                                        ((rg.c2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) kVar5;
                                        d2Var.f45189r0 = !d2Var.f45189r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) kVar5).r(true);
                                    }
                                    q6 q6Var7 = q6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        q6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    q6 q6Var8 = q6Var;
                                    q6Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    k6 k6Var2 = q6Var9.R0;
                                    rg.k kVar6 = kVar;
                                    if (kVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(kVar6);
                                        if (kVar6 instanceof rg.q2) {
                                            rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            k6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (kVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            x2Var = x2Var2;
                                        }
                                        q6Var9.B0(x2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        q6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h03, w7.x5.n(-2, 44));
                }
                if ((kVar instanceof rg.q2) || (kVar instanceof rg.d2) || (kVar instanceof rg.z1) || (kVar instanceof rg.c2)) {
                    TextView h04 = q6Var.h0(4, LocaleController.getString(R.string.Flip));
                    h04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.k kVar2 = kVar;
                                    boolean z11 = kVar2 instanceof rg.d2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                        if (fcVar != null) {
                                            fcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.k kVar3 = kVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(kVar, true);
                                    q6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.D0(null, true);
                                    rg.k kVar4 = kVar;
                                    q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((rg.s0) kVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.k kVar5 = kVar;
                                    if (kVar5 instanceof rg.q2) {
                                        ((rg.q2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.c2) {
                                        ((rg.c2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) kVar5;
                                        d2Var.f45189r0 = !d2Var.f45189r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) kVar5).r(true);
                                    }
                                    q6 q6Var7 = q6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        q6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    q6 q6Var8 = q6Var;
                                    q6Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    k6 k6Var2 = q6Var9.R0;
                                    rg.k kVar6 = kVar;
                                    if (kVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(kVar6);
                                        if (kVar6 instanceof rg.q2) {
                                            rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            k6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (kVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            x2Var = x2Var2;
                                        }
                                        q6Var9.B0(x2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        q6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h04, w7.x5.n(-2, 44));
                }
                boolean z11 = kVar instanceof rg.z1;
                if (k6Var.indexOfChild(kVar) != k6Var.getChildCount() - 1 && !(kVar instanceof rg.c2)) {
                    TextView textView3 = new TextView(q6Var.getContext());
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
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.k kVar2 = kVar;
                                    boolean z112 = kVar2 instanceof rg.d2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                        if (fcVar != null) {
                                            fcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.k kVar3 = kVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(kVar, true);
                                    q6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.D0(null, true);
                                    rg.k kVar4 = kVar;
                                    q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((rg.s0) kVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.k kVar5 = kVar;
                                    if (kVar5 instanceof rg.q2) {
                                        ((rg.q2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.c2) {
                                        ((rg.c2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) kVar5;
                                        d2Var.f45189r0 = !d2Var.f45189r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) kVar5).r(true);
                                    }
                                    q6 q6Var7 = q6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        q6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    q6 q6Var8 = q6Var;
                                    q6Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    k6 k6Var2 = q6Var9.R0;
                                    rg.k kVar6 = kVar;
                                    if (kVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(kVar6);
                                        if (kVar6 instanceof rg.q2) {
                                            rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            k6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (kVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            x2Var = x2Var2;
                                        }
                                        q6Var9.B0(x2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        q6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.x5.n(-2, 44));
                } else if (!z11 && !z10 && !(kVar instanceof rg.d2) && !(kVar instanceof rg.v0) && !(kVar instanceof rg.y2) && !(kVar instanceof rg.s0) && !(kVar instanceof rg.c2)) {
                    TextView textView4 = new TextView(q6Var.getContext());
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
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.k kVar2 = kVar;
                                    boolean z112 = kVar2 instanceof rg.d2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        fc fcVar = ((rb) q6Var2).A2.f7878c1;
                                        if (fcVar != null) {
                                            fcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.k kVar3 = kVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((rg.x2) kVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(kVar, true);
                                    q6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.D0(null, true);
                                    rg.k kVar4 = kVar;
                                    q6Var5.L0((rg.v0) kVar4, new bi.f0(2, q6Var5, kVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((rg.s0) kVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.k kVar5 = kVar;
                                    if (kVar5 instanceof rg.q2) {
                                        ((rg.q2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.c2) {
                                        ((rg.c2) kVar5).r(true);
                                    } else if (kVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) kVar5;
                                        d2Var.f45189r0 = !d2Var.f45189r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) kVar5).r(true);
                                    }
                                    q6 q6Var7 = q6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = q6Var7.H1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        q6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    q6 q6Var8 = q6Var;
                                    q6Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    k6 k6Var2 = q6Var9.R0;
                                    rg.k kVar6 = kVar;
                                    if (kVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(kVar6);
                                        if (kVar6 instanceof rg.q2) {
                                            rg.k q2Var = new rg.q2(q6Var9.getContext(), (rg.q2) kVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            k6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (kVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(q6Var9.getContext(), (rg.x2) kVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            k6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            x2Var = x2Var2;
                                        }
                                        q6Var9.B0(x2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = q6Var9.H1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        q6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, w7.x5.n(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20780i6, e6Var);
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
                q6Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
