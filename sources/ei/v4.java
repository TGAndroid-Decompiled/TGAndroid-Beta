package ei;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v4 implements Runnable {
    public final int f9950a;
    public final f6 f9951b;
    public final rg.j f9952c;

    public v4(f6 f6Var, rg.j jVar, int i10) {
        this.f9950a = i10;
        this.f9951b = f6Var;
        this.f9952c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f9950a) {
            case 0:
                this.f9951b.A0(this.f9952c);
                return;
            default:
                final f6 f6Var = this.f9951b;
                z5 z5Var = f6Var.R0;
                i5 i5Var = f6Var.O1;
                t5 t5Var = f6Var.G1;
                LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                linearLayout.setOrientation(0);
                final rg.j jVar = this.f9952c;
                boolean z10 = jVar instanceof rg.f1;
                if (!z10) {
                    TextView textView = new TextView(f6Var.getContext());
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.E8, t5Var);
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
                            rg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.A0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.B0(jVar, true);
                                    f6Var4.p0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.B0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.B0(null, true);
                                    f6Var6.I0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.p2) {
                                        ((rg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f45740r0 = !d2Var.f45740r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF O0 = f6Var9.O0(jVar6);
                                        if (jVar6 instanceof rg.p2) {
                                            rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                            p2Var.setDelegate(f6Var9);
                                            z5Var2.addView(p2Var);
                                            f6Var9.e0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof rg.w2) {
                                            rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                            w2Var2.setDelegate(f6Var9);
                                            w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.e0();
                                            w2Var = w2Var2;
                                        }
                                        f6Var9.z0(w2Var);
                                        f6Var9.B0(null, true);
                                        f6Var9.c0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.z5.n(-2, 44));
                }
                if (jVar instanceof rg.w2) {
                    TextView textView2 = new TextView(f6Var.getContext());
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.E8, t5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((i5Var.c() && !i5Var.d) || f6Var.f9047t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rg.w2 w2Var;
                                switch (r3) {
                                    case 0:
                                        rg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof rg.d2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                            if (lbVar != null) {
                                                lbVar.B();
                                            }
                                        } else {
                                            f6Var2.A0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                        if (m1Var != null && m1Var.isShowing()) {
                                            f6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rg.j jVar3 = jVar;
                                        f6 f6Var3 = f6Var;
                                        f6Var3.getClass();
                                        try {
                                            ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                        if (m1Var2 != null && m1Var2.isShowing()) {
                                            f6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        f6 f6Var4 = f6Var;
                                        f6Var4.B0(jVar, true);
                                        f6Var4.p0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            f6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.B0(null, true);
                                        rg.j jVar4 = jVar;
                                        f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            f6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.B0(null, true);
                                        f6Var6.I0((rg.q0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            f6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.j jVar5 = jVar;
                                        if (jVar5 instanceof rg.p2) {
                                            ((rg.p2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.c2) {
                                            ((rg.c2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.d2) {
                                            rg.d2 d2Var = (rg.d2) jVar5;
                                            d2Var.f45740r0 = !d2Var.f45740r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((rg.z1) jVar5).r(true);
                                        }
                                        f6 f6Var7 = f6Var;
                                        org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                        if (m1Var6 != null && m1Var6.isShowing()) {
                                            f6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        f6 f6Var8 = f6Var;
                                        f6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                        if (m1Var7 != null && m1Var7.isShowing()) {
                                            f6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        f6 f6Var9 = f6Var;
                                        z5 z5Var2 = f6Var9.R0;
                                        rg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF O0 = f6Var9.O0(jVar6);
                                            if (jVar6 instanceof rg.p2) {
                                                rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                                p2Var.setDelegate(f6Var9);
                                                z5Var2.addView(p2Var);
                                                f6Var9.e0();
                                                w2Var = p2Var;
                                            } else if (jVar6 instanceof rg.w2) {
                                                rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                                w2Var2.setDelegate(f6Var9);
                                                w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                                f6Var9.e0();
                                                w2Var = w2Var2;
                                            }
                                            f6Var9.z0(w2Var);
                                            f6Var9.B0(null, true);
                                            f6Var9.c0(w2Var);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                        if (m1Var8 != null && m1Var8.isShowing()) {
                                            f6Var9.H1.d(true);
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
                                rg.w2 w2Var;
                                switch (r3) {
                                    case 0:
                                        rg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof rg.d2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                            if (lbVar != null) {
                                                lbVar.B();
                                            }
                                        } else {
                                            f6Var2.A0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                        if (m1Var != null && m1Var.isShowing()) {
                                            f6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rg.j jVar3 = jVar;
                                        f6 f6Var3 = f6Var;
                                        f6Var3.getClass();
                                        try {
                                            ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                        if (m1Var2 != null && m1Var2.isShowing()) {
                                            f6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        f6 f6Var4 = f6Var;
                                        f6Var4.B0(jVar, true);
                                        f6Var4.p0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            f6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.B0(null, true);
                                        rg.j jVar4 = jVar;
                                        f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            f6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.B0(null, true);
                                        f6Var6.I0((rg.q0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            f6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.j jVar5 = jVar;
                                        if (jVar5 instanceof rg.p2) {
                                            ((rg.p2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.c2) {
                                            ((rg.c2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.d2) {
                                            rg.d2 d2Var = (rg.d2) jVar5;
                                            d2Var.f45740r0 = !d2Var.f45740r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((rg.z1) jVar5).r(true);
                                        }
                                        f6 f6Var7 = f6Var;
                                        org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                        if (m1Var6 != null && m1Var6.isShowing()) {
                                            f6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        f6 f6Var8 = f6Var;
                                        f6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                        if (m1Var7 != null && m1Var7.isShowing()) {
                                            f6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        f6 f6Var9 = f6Var;
                                        z5 z5Var2 = f6Var9.R0;
                                        rg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF O0 = f6Var9.O0(jVar6);
                                            if (jVar6 instanceof rg.p2) {
                                                rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                                p2Var.setDelegate(f6Var9);
                                                z5Var2.addView(p2Var);
                                                f6Var9.e0();
                                                w2Var = p2Var;
                                            } else if (jVar6 instanceof rg.w2) {
                                                rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                                w2Var2.setDelegate(f6Var9);
                                                w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                                f6Var9.e0();
                                                w2Var = w2Var2;
                                            }
                                            f6Var9.z0(w2Var);
                                            f6Var9.B0(null, true);
                                            f6Var9.c0(w2Var);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                        if (m1Var8 != null && m1Var8.isShowing()) {
                                            f6Var9.H1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.z5.n(-2, 44));
                } else if (jVar instanceof rg.t0) {
                    TextView f02 = f6Var.f0(1, LocaleController.getString(R.string.PaintEdit));
                    f02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.A0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.B0(jVar, true);
                                    f6Var4.p0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.B0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.B0(null, true);
                                    f6Var6.I0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.p2) {
                                        ((rg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f45740r0 = !d2Var.f45740r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF O0 = f6Var9.O0(jVar6);
                                        if (jVar6 instanceof rg.p2) {
                                            rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                            p2Var.setDelegate(f6Var9);
                                            z5Var2.addView(p2Var);
                                            f6Var9.e0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof rg.w2) {
                                            rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                            w2Var2.setDelegate(f6Var9);
                                            w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.e0();
                                            w2Var = w2Var2;
                                        }
                                        f6Var9.z0(w2Var);
                                        f6Var9.B0(null, true);
                                        f6Var9.c0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(f02, w7.z5.n(-2, 44));
                } else if (jVar instanceof rg.q0) {
                    TextView f03 = f6Var.f0(1, LocaleController.getString(R.string.PaintEdit));
                    f03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.A0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.B0(jVar, true);
                                    f6Var4.p0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.B0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.B0(null, true);
                                    f6Var6.I0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.p2) {
                                        ((rg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f45740r0 = !d2Var.f45740r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF O0 = f6Var9.O0(jVar6);
                                        if (jVar6 instanceof rg.p2) {
                                            rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                            p2Var.setDelegate(f6Var9);
                                            z5Var2.addView(p2Var);
                                            f6Var9.e0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof rg.w2) {
                                            rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                            w2Var2.setDelegate(f6Var9);
                                            w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.e0();
                                            w2Var = w2Var2;
                                        }
                                        f6Var9.z0(w2Var);
                                        f6Var9.B0(null, true);
                                        f6Var9.c0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(f03, w7.z5.n(-2, 44));
                }
                if ((jVar instanceof rg.p2) || (jVar instanceof rg.d2) || (jVar instanceof rg.z1) || (jVar instanceof rg.c2)) {
                    TextView f04 = f6Var.f0(4, LocaleController.getString(R.string.Flip));
                    f04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.A0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.B0(jVar, true);
                                    f6Var4.p0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.B0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.B0(null, true);
                                    f6Var6.I0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.p2) {
                                        ((rg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f45740r0 = !d2Var.f45740r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF O0 = f6Var9.O0(jVar6);
                                        if (jVar6 instanceof rg.p2) {
                                            rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                            p2Var.setDelegate(f6Var9);
                                            z5Var2.addView(p2Var);
                                            f6Var9.e0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof rg.w2) {
                                            rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                            w2Var2.setDelegate(f6Var9);
                                            w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.e0();
                                            w2Var = w2Var2;
                                        }
                                        f6Var9.z0(w2Var);
                                        f6Var9.B0(null, true);
                                        f6Var9.c0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(f04, w7.z5.n(-2, 44));
                }
                boolean z11 = jVar instanceof rg.z1;
                if (z5Var.indexOfChild(jVar) != z5Var.getChildCount() - 1 && !(jVar instanceof rg.c2)) {
                    TextView textView3 = new TextView(f6Var.getContext());
                    org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.E8, t5Var);
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
                            rg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof rg.d2;
                                    f6 f6Var2 = f6Var;
                                    if (z112) {
                                        lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.A0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.B0(jVar, true);
                                    f6Var4.p0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.B0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.B0(null, true);
                                    f6Var6.I0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.p2) {
                                        ((rg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f45740r0 = !d2Var.f45740r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF O0 = f6Var9.O0(jVar6);
                                        if (jVar6 instanceof rg.p2) {
                                            rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                            p2Var.setDelegate(f6Var9);
                                            z5Var2.addView(p2Var);
                                            f6Var9.e0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof rg.w2) {
                                            rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                            w2Var2.setDelegate(f6Var9);
                                            w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.e0();
                                            w2Var = w2Var2;
                                        }
                                        f6Var9.z0(w2Var);
                                        f6Var9.B0(null, true);
                                        f6Var9.c0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.z5.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof rg.d2) && !(jVar instanceof rg.t0) && !(jVar instanceof rg.x2) && !(jVar instanceof rg.q0) && !(jVar instanceof rg.c2)) {
                    TextView textView4 = new TextView(f6Var.getContext());
                    org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.E8, t5Var);
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
                            rg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof rg.d2;
                                    f6 f6Var2 = f6Var;
                                    if (z112) {
                                        lb lbVar = ((xa) f6Var2).A2.f9973c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.A0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.B0(jVar, true);
                                    f6Var4.p0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.B0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.J0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.B0(null, true);
                                    f6Var6.I0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.p2) {
                                        ((rg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f45740r0 = !d2Var.f45740r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF O0 = f6Var9.O0(jVar6);
                                        if (jVar6 instanceof rg.p2) {
                                            rg.j p2Var = new rg.p2(f6Var9.getContext(), (rg.p2) jVar6, O0);
                                            p2Var.setDelegate(f6Var9);
                                            z5Var2.addView(p2Var);
                                            f6Var9.e0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof rg.w2) {
                                            rg.w2 w2Var2 = new rg.w2(f6Var9.getContext(), (rg.w2) jVar6, O0);
                                            w2Var2.setDelegate(f6Var9);
                                            w2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(w2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.e0();
                                            w2Var = w2Var2;
                                        }
                                        f6Var9.z0(w2Var);
                                        f6Var9.B0(null, true);
                                        f6Var9.c0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, w7.z5.n(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int i14 = org.telegram.ui.ActionBar.k6.f21273i6;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i14, t5Var);
                    int i15 = 8;
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
                        i15 = 0;
                    }
                    org.telegram.ui.ActionBar.r6.S(childAt, org.telegram.ui.ActionBar.k6.b0(w02, i10, i11, i12, i15), null, org.telegram.ui.ActionBar.r6.O(i14), t5Var);
                }
                f6Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
