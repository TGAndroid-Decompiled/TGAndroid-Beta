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
    public final int f9933a;
    public final f6 f9934b;
    public final rg.j f9935c;

    public v4(f6 f6Var, rg.j jVar, int i10) {
        this.f9933a = i10;
        this.f9934b = f6Var;
        this.f9935c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f9933a) {
            case 0:
                this.f9934b.B0(this.f9935c);
                return;
            default:
                final f6 f6Var = this.f9934b;
                z5 z5Var = f6Var.R0;
                i5 i5Var = f6Var.O1;
                t5 t5Var = f6Var.G1;
                LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                linearLayout.setOrientation(0);
                final rg.j jVar = this.f9935c;
                boolean z10 = jVar instanceof rg.e1;
                if (!z10) {
                    TextView textView = new TextView(f6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
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
                            rg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar2);
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
                                        ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.o2) {
                                        ((rg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.b2) {
                                        ((rg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        rg.c2 c2Var = (rg.c2) jVar5;
                                        c2Var.f45313r0 = !c2Var.f45313r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((rg.y1) jVar5).r(true);
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
                                        PointF P0 = f6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof rg.v2) {
                                            rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                            v2Var2.setDelegate(f6Var9);
                                            v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.f0();
                                            v2Var = v2Var2;
                                        }
                                        f6Var9.A0(v2Var);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(v2Var);
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
                if (jVar instanceof rg.v2) {
                    TextView textView2 = new TextView(f6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((i5Var.c() && !i5Var.d) || f6Var.f9036t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rg.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        rg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof rg.c2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                            if (lbVar != null) {
                                                lbVar.B();
                                            }
                                        } else {
                                            f6Var2.B0(jVar2);
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
                                            ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                        f6Var4.C0(jVar, true);
                                        f6Var4.q0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            f6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.C0(null, true);
                                        rg.j jVar4 = jVar;
                                        f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            f6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.C0(null, true);
                                        f6Var6.J0((rg.q0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            f6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.j jVar5 = jVar;
                                        if (jVar5 instanceof rg.o2) {
                                            ((rg.o2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.b2) {
                                            ((rg.b2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.c2) {
                                            rg.c2 c2Var = (rg.c2) jVar5;
                                            c2Var.f45313r0 = !c2Var.f45313r0;
                                            c2Var.invalidate();
                                        } else {
                                            ((rg.y1) jVar5).r(true);
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
                                            PointF P0 = f6Var9.P0(jVar6);
                                            if (jVar6 instanceof rg.o2) {
                                                rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                                o2Var.setDelegate(f6Var9);
                                                z5Var2.addView(o2Var);
                                                f6Var9.f0();
                                                v2Var = o2Var;
                                            } else if (jVar6 instanceof rg.v2) {
                                                rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                                v2Var2.setDelegate(f6Var9);
                                                v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                                f6Var9.f0();
                                                v2Var = v2Var2;
                                            }
                                            f6Var9.A0(v2Var);
                                            f6Var9.C0(null, true);
                                            f6Var9.d0(v2Var);
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
                                rg.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        rg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof rg.c2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                            if (lbVar != null) {
                                                lbVar.B();
                                            }
                                        } else {
                                            f6Var2.B0(jVar2);
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
                                            ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                        f6Var4.C0(jVar, true);
                                        f6Var4.q0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            f6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.C0(null, true);
                                        rg.j jVar4 = jVar;
                                        f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            f6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.C0(null, true);
                                        f6Var6.J0((rg.q0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            f6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.j jVar5 = jVar;
                                        if (jVar5 instanceof rg.o2) {
                                            ((rg.o2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.b2) {
                                            ((rg.b2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.c2) {
                                            rg.c2 c2Var = (rg.c2) jVar5;
                                            c2Var.f45313r0 = !c2Var.f45313r0;
                                            c2Var.invalidate();
                                        } else {
                                            ((rg.y1) jVar5).r(true);
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
                                            PointF P0 = f6Var9.P0(jVar6);
                                            if (jVar6 instanceof rg.o2) {
                                                rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                                o2Var.setDelegate(f6Var9);
                                                z5Var2.addView(o2Var);
                                                f6Var9.f0();
                                                v2Var = o2Var;
                                            } else if (jVar6 instanceof rg.v2) {
                                                rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                                v2Var2.setDelegate(f6Var9);
                                                v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                                f6Var9.f0();
                                                v2Var = v2Var2;
                                            }
                                            f6Var9.A0(v2Var);
                                            f6Var9.C0(null, true);
                                            f6Var9.d0(v2Var);
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
                    TextView g02 = f6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    g02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar2);
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
                                        ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.o2) {
                                        ((rg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.b2) {
                                        ((rg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        rg.c2 c2Var = (rg.c2) jVar5;
                                        c2Var.f45313r0 = !c2Var.f45313r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((rg.y1) jVar5).r(true);
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
                                        PointF P0 = f6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof rg.v2) {
                                            rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                            v2Var2.setDelegate(f6Var9);
                                            v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.f0();
                                            v2Var = v2Var2;
                                        }
                                        f6Var9.A0(v2Var);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(v2Var);
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
                    linearLayout.addView(g02, w7.z5.n(-2, 44));
                } else if (jVar instanceof rg.q0) {
                    TextView g03 = f6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    g03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar2);
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
                                        ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.o2) {
                                        ((rg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.b2) {
                                        ((rg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        rg.c2 c2Var = (rg.c2) jVar5;
                                        c2Var.f45313r0 = !c2Var.f45313r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((rg.y1) jVar5).r(true);
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
                                        PointF P0 = f6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof rg.v2) {
                                            rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                            v2Var2.setDelegate(f6Var9);
                                            v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.f0();
                                            v2Var = v2Var2;
                                        }
                                        f6Var9.A0(v2Var);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(v2Var);
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
                    linearLayout.addView(g03, w7.z5.n(-2, 44));
                }
                if ((jVar instanceof rg.o2) || (jVar instanceof rg.c2) || (jVar instanceof rg.y1) || (jVar instanceof rg.b2)) {
                    TextView g04 = f6Var.g0(4, LocaleController.getString(R.string.Flip));
                    g04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar2);
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
                                        ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.o2) {
                                        ((rg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.b2) {
                                        ((rg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        rg.c2 c2Var = (rg.c2) jVar5;
                                        c2Var.f45313r0 = !c2Var.f45313r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((rg.y1) jVar5).r(true);
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
                                        PointF P0 = f6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof rg.v2) {
                                            rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                            v2Var2.setDelegate(f6Var9);
                                            v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.f0();
                                            v2Var = v2Var2;
                                        }
                                        f6Var9.A0(v2Var);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(v2Var);
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
                    linearLayout.addView(g04, w7.z5.n(-2, 44));
                }
                boolean z11 = jVar instanceof rg.y1;
                if (z5Var.indexOfChild(jVar) != z5Var.getChildCount() - 1 && !(jVar instanceof rg.b2)) {
                    TextView textView3 = new TextView(f6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
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
                            rg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof rg.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z112) {
                                        lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar2);
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
                                        ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.o2) {
                                        ((rg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.b2) {
                                        ((rg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        rg.c2 c2Var = (rg.c2) jVar5;
                                        c2Var.f45313r0 = !c2Var.f45313r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((rg.y1) jVar5).r(true);
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
                                        PointF P0 = f6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof rg.v2) {
                                            rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                            v2Var2.setDelegate(f6Var9);
                                            v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.f0();
                                            v2Var = v2Var2;
                                        }
                                        f6Var9.A0(v2Var);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(v2Var);
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
                } else if (!z11 && !z10 && !(jVar instanceof rg.c2) && !(jVar instanceof rg.t0) && !(jVar instanceof rg.w2) && !(jVar instanceof rg.q0) && !(jVar instanceof rg.b2)) {
                    TextView textView4 = new TextView(f6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
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
                            rg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof rg.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z112) {
                                        lb lbVar = ((xa) f6Var2).A2.f9956c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar2);
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
                                        ((rg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    f6Var5.K0((rg.t0) jVar4, new ai.r5(6, f6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.o2) {
                                        ((rg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.b2) {
                                        ((rg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        rg.c2 c2Var = (rg.c2) jVar5;
                                        c2Var.f45313r0 = !c2Var.f45313r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((rg.y1) jVar5).r(true);
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
                                        PointF P0 = f6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar6, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof rg.v2) {
                                            rg.v2 v2Var2 = new rg.v2(f6Var9.getContext(), (rg.v2) jVar6, P0);
                                            v2Var2.setDelegate(f6Var9);
                                            v2Var2.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            f6Var9.f0();
                                            v2Var = v2Var2;
                                        }
                                        f6Var9.A0(v2Var);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(v2Var);
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
                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, t5Var);
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
                    childAt.setBackground(org.telegram.ui.ActionBar.h6.b0(w02, i10, i11, i12, i14));
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
