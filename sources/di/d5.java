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
public final class d5 implements Runnable {
    public final int f6821a;
    public final o6 f6822b;
    public final rg.j f6823c;

    public d5(o6 o6Var, rg.j jVar, int i10) {
        this.f6821a = i10;
        this.f6822b = o6Var;
        this.f6823c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f6821a) {
            case 0:
                this.f6822b.B0(this.f6823c);
                return;
            default:
                final o6 o6Var = this.f6822b;
                i6 i6Var = o6Var.R0;
                r5 r5Var = o6Var.O1;
                c6 c6Var = o6Var.G1;
                LinearLayout linearLayout = new LinearLayout(o6Var.getContext());
                linearLayout.setOrientation(0);
                final rg.j jVar = this.f6823c;
                boolean z10 = jVar instanceof rg.g1;
                if (!z10) {
                    TextView textView = new TextView(o6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var));
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
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    o6 o6Var2 = o6Var;
                                    if (z11) {
                                        ac acVar = ((mb) o6Var2).A2.f7243c1;
                                        if (acVar != null) {
                                            acVar.B();
                                        }
                                    } else {
                                        o6Var2.B0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        o6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    o6 o6Var3 = o6Var;
                                    o6Var3.getClass();
                                    try {
                                        ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        o6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o6 o6Var4 = o6Var;
                                    o6Var4.C0(jVar, true);
                                    o6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        o6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o6 o6Var5 = o6Var;
                                    o6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        o6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o6 o6Var6 = o6Var;
                                    o6Var6.C0(null, true);
                                    o6Var6.J0((rg.s0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        o6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.q2) {
                                        ((rg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f44230r0 = !d2Var.f44230r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    o6 o6Var7 = o6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        o6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o6 o6Var8 = o6Var;
                                    o6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        o6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o6 o6Var9 = o6Var;
                                    i6 i6Var2 = o6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF P0 = o6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.q2) {
                                            rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                            q2Var.setDelegate(o6Var9);
                                            i6Var2.addView(q2Var);
                                            o6Var9.f0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                            x2Var2.setDelegate(o6Var9);
                                            x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                            o6Var9.f0();
                                            x2Var = x2Var2;
                                        }
                                        o6Var9.A0(x2Var);
                                        o6Var9.C0(null, true);
                                        o6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        o6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.a6.n(-2, 44));
                }
                if (jVar instanceof rg.x2) {
                    TextView textView2 = new TextView(o6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((r5Var.c() && !r5Var.d) || o6Var.f7549t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rg.x2 x2Var;
                                switch (r3) {
                                    case 0:
                                        rg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof rg.d2;
                                        o6 o6Var2 = o6Var;
                                        if (z11) {
                                            ac acVar = ((mb) o6Var2).A2.f7243c1;
                                            if (acVar != null) {
                                                acVar.B();
                                            }
                                        } else {
                                            o6Var2.B0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                        if (m1Var != null && m1Var.isShowing()) {
                                            o6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rg.j jVar3 = jVar;
                                        o6 o6Var3 = o6Var;
                                        o6Var3.getClass();
                                        try {
                                            ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                        if (m1Var2 != null && m1Var2.isShowing()) {
                                            o6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        o6 o6Var4 = o6Var;
                                        o6Var4.C0(jVar, true);
                                        o6Var4.q0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            o6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        o6 o6Var5 = o6Var;
                                        o6Var5.C0(null, true);
                                        rg.j jVar4 = jVar;
                                        o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            o6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        o6 o6Var6 = o6Var;
                                        o6Var6.C0(null, true);
                                        o6Var6.J0((rg.s0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            o6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.j jVar5 = jVar;
                                        if (jVar5 instanceof rg.q2) {
                                            ((rg.q2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.c2) {
                                            ((rg.c2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.d2) {
                                            rg.d2 d2Var = (rg.d2) jVar5;
                                            d2Var.f44230r0 = !d2Var.f44230r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((rg.z1) jVar5).r(true);
                                        }
                                        o6 o6Var7 = o6Var;
                                        org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                        if (m1Var6 != null && m1Var6.isShowing()) {
                                            o6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        o6 o6Var8 = o6Var;
                                        o6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                        if (m1Var7 != null && m1Var7.isShowing()) {
                                            o6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        o6 o6Var9 = o6Var;
                                        i6 i6Var2 = o6Var9.R0;
                                        rg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF P0 = o6Var9.P0(jVar6);
                                            if (jVar6 instanceof rg.q2) {
                                                rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                                q2Var.setDelegate(o6Var9);
                                                i6Var2.addView(q2Var);
                                                o6Var9.f0();
                                                x2Var = q2Var;
                                            } else if (jVar6 instanceof rg.x2) {
                                                rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                                x2Var2.setDelegate(o6Var9);
                                                x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                                o6Var9.f0();
                                                x2Var = x2Var2;
                                            }
                                            o6Var9.A0(x2Var);
                                            o6Var9.C0(null, true);
                                            o6Var9.d0(x2Var);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                        if (m1Var8 != null && m1Var8.isShowing()) {
                                            o6Var9.H1.d(true);
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
                                        rg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof rg.d2;
                                        o6 o6Var2 = o6Var;
                                        if (z11) {
                                            ac acVar = ((mb) o6Var2).A2.f7243c1;
                                            if (acVar != null) {
                                                acVar.B();
                                            }
                                        } else {
                                            o6Var2.B0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                        if (m1Var != null && m1Var.isShowing()) {
                                            o6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rg.j jVar3 = jVar;
                                        o6 o6Var3 = o6Var;
                                        o6Var3.getClass();
                                        try {
                                            ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                        if (m1Var2 != null && m1Var2.isShowing()) {
                                            o6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        o6 o6Var4 = o6Var;
                                        o6Var4.C0(jVar, true);
                                        o6Var4.q0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            o6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        o6 o6Var5 = o6Var;
                                        o6Var5.C0(null, true);
                                        rg.j jVar4 = jVar;
                                        o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            o6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        o6 o6Var6 = o6Var;
                                        o6Var6.C0(null, true);
                                        o6Var6.J0((rg.s0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            o6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        rg.j jVar5 = jVar;
                                        if (jVar5 instanceof rg.q2) {
                                            ((rg.q2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.c2) {
                                            ((rg.c2) jVar5).r(true);
                                        } else if (jVar5 instanceof rg.d2) {
                                            rg.d2 d2Var = (rg.d2) jVar5;
                                            d2Var.f44230r0 = !d2Var.f44230r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((rg.z1) jVar5).r(true);
                                        }
                                        o6 o6Var7 = o6Var;
                                        org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                        if (m1Var6 != null && m1Var6.isShowing()) {
                                            o6Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        o6 o6Var8 = o6Var;
                                        o6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                        if (m1Var7 != null && m1Var7.isShowing()) {
                                            o6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        o6 o6Var9 = o6Var;
                                        i6 i6Var2 = o6Var9.R0;
                                        rg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF P0 = o6Var9.P0(jVar6);
                                            if (jVar6 instanceof rg.q2) {
                                                rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                                q2Var.setDelegate(o6Var9);
                                                i6Var2.addView(q2Var);
                                                o6Var9.f0();
                                                x2Var = q2Var;
                                            } else if (jVar6 instanceof rg.x2) {
                                                rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                                x2Var2.setDelegate(o6Var9);
                                                x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                                o6Var9.f0();
                                                x2Var = x2Var2;
                                            }
                                            o6Var9.A0(x2Var);
                                            o6Var9.C0(null, true);
                                            o6Var9.d0(x2Var);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                        if (m1Var8 != null && m1Var8.isShowing()) {
                                            o6Var9.H1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.a6.n(-2, 44));
                } else if (jVar instanceof rg.v0) {
                    TextView g02 = o6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    g02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    o6 o6Var2 = o6Var;
                                    if (z11) {
                                        ac acVar = ((mb) o6Var2).A2.f7243c1;
                                        if (acVar != null) {
                                            acVar.B();
                                        }
                                    } else {
                                        o6Var2.B0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        o6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    o6 o6Var3 = o6Var;
                                    o6Var3.getClass();
                                    try {
                                        ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        o6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o6 o6Var4 = o6Var;
                                    o6Var4.C0(jVar, true);
                                    o6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        o6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o6 o6Var5 = o6Var;
                                    o6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        o6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o6 o6Var6 = o6Var;
                                    o6Var6.C0(null, true);
                                    o6Var6.J0((rg.s0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        o6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.q2) {
                                        ((rg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f44230r0 = !d2Var.f44230r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    o6 o6Var7 = o6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        o6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o6 o6Var8 = o6Var;
                                    o6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        o6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o6 o6Var9 = o6Var;
                                    i6 i6Var2 = o6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF P0 = o6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.q2) {
                                            rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                            q2Var.setDelegate(o6Var9);
                                            i6Var2.addView(q2Var);
                                            o6Var9.f0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                            x2Var2.setDelegate(o6Var9);
                                            x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                            o6Var9.f0();
                                            x2Var = x2Var2;
                                        }
                                        o6Var9.A0(x2Var);
                                        o6Var9.C0(null, true);
                                        o6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        o6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(g02, w7.a6.n(-2, 44));
                } else if (jVar instanceof rg.s0) {
                    TextView g03 = o6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    g03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    o6 o6Var2 = o6Var;
                                    if (z11) {
                                        ac acVar = ((mb) o6Var2).A2.f7243c1;
                                        if (acVar != null) {
                                            acVar.B();
                                        }
                                    } else {
                                        o6Var2.B0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        o6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    o6 o6Var3 = o6Var;
                                    o6Var3.getClass();
                                    try {
                                        ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        o6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o6 o6Var4 = o6Var;
                                    o6Var4.C0(jVar, true);
                                    o6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        o6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o6 o6Var5 = o6Var;
                                    o6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        o6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o6 o6Var6 = o6Var;
                                    o6Var6.C0(null, true);
                                    o6Var6.J0((rg.s0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        o6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.q2) {
                                        ((rg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f44230r0 = !d2Var.f44230r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    o6 o6Var7 = o6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        o6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o6 o6Var8 = o6Var;
                                    o6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        o6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o6 o6Var9 = o6Var;
                                    i6 i6Var2 = o6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF P0 = o6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.q2) {
                                            rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                            q2Var.setDelegate(o6Var9);
                                            i6Var2.addView(q2Var);
                                            o6Var9.f0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                            x2Var2.setDelegate(o6Var9);
                                            x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                            o6Var9.f0();
                                            x2Var = x2Var2;
                                        }
                                        o6Var9.A0(x2Var);
                                        o6Var9.C0(null, true);
                                        o6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        o6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(g03, w7.a6.n(-2, 44));
                }
                if ((jVar instanceof rg.q2) || (jVar instanceof rg.d2) || (jVar instanceof rg.z1) || (jVar instanceof rg.c2)) {
                    TextView g04 = o6Var.g0(4, LocaleController.getString(R.string.Flip));
                    g04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    rg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof rg.d2;
                                    o6 o6Var2 = o6Var;
                                    if (z11) {
                                        ac acVar = ((mb) o6Var2).A2.f7243c1;
                                        if (acVar != null) {
                                            acVar.B();
                                        }
                                    } else {
                                        o6Var2.B0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        o6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    o6 o6Var3 = o6Var;
                                    o6Var3.getClass();
                                    try {
                                        ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        o6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o6 o6Var4 = o6Var;
                                    o6Var4.C0(jVar, true);
                                    o6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        o6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o6 o6Var5 = o6Var;
                                    o6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        o6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o6 o6Var6 = o6Var;
                                    o6Var6.C0(null, true);
                                    o6Var6.J0((rg.s0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        o6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.q2) {
                                        ((rg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f44230r0 = !d2Var.f44230r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    o6 o6Var7 = o6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        o6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o6 o6Var8 = o6Var;
                                    o6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        o6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o6 o6Var9 = o6Var;
                                    i6 i6Var2 = o6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF P0 = o6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.q2) {
                                            rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                            q2Var.setDelegate(o6Var9);
                                            i6Var2.addView(q2Var);
                                            o6Var9.f0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                            x2Var2.setDelegate(o6Var9);
                                            x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                            o6Var9.f0();
                                            x2Var = x2Var2;
                                        }
                                        o6Var9.A0(x2Var);
                                        o6Var9.C0(null, true);
                                        o6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        o6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(g04, w7.a6.n(-2, 44));
                }
                boolean z11 = jVar instanceof rg.z1;
                if (i6Var.indexOfChild(jVar) != i6Var.getChildCount() - 1 && !(jVar instanceof rg.c2)) {
                    TextView textView3 = new TextView(o6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var));
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
                                    rg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof rg.d2;
                                    o6 o6Var2 = o6Var;
                                    if (z112) {
                                        ac acVar = ((mb) o6Var2).A2.f7243c1;
                                        if (acVar != null) {
                                            acVar.B();
                                        }
                                    } else {
                                        o6Var2.B0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        o6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    o6 o6Var3 = o6Var;
                                    o6Var3.getClass();
                                    try {
                                        ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        o6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o6 o6Var4 = o6Var;
                                    o6Var4.C0(jVar, true);
                                    o6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        o6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o6 o6Var5 = o6Var;
                                    o6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        o6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o6 o6Var6 = o6Var;
                                    o6Var6.C0(null, true);
                                    o6Var6.J0((rg.s0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        o6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.q2) {
                                        ((rg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f44230r0 = !d2Var.f44230r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    o6 o6Var7 = o6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        o6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o6 o6Var8 = o6Var;
                                    o6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        o6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o6 o6Var9 = o6Var;
                                    i6 i6Var2 = o6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF P0 = o6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.q2) {
                                            rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                            q2Var.setDelegate(o6Var9);
                                            i6Var2.addView(q2Var);
                                            o6Var9.f0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                            x2Var2.setDelegate(o6Var9);
                                            x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                            o6Var9.f0();
                                            x2Var = x2Var2;
                                        }
                                        o6Var9.A0(x2Var);
                                        o6Var9.C0(null, true);
                                        o6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        o6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.a6.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof rg.d2) && !(jVar instanceof rg.v0) && !(jVar instanceof rg.y2) && !(jVar instanceof rg.s0) && !(jVar instanceof rg.c2)) {
                    TextView textView4 = new TextView(o6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var));
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
                                    rg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof rg.d2;
                                    o6 o6Var2 = o6Var;
                                    if (z112) {
                                        ac acVar = ((mb) o6Var2).A2.f7243c1;
                                        if (acVar != null) {
                                            acVar.B();
                                        }
                                    } else {
                                        o6Var2.B0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = o6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        o6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    rg.j jVar3 = jVar;
                                    o6 o6Var3 = o6Var;
                                    o6Var3.getClass();
                                    try {
                                        ((rg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = o6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        o6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    o6 o6Var4 = o6Var;
                                    o6Var4.C0(jVar, true);
                                    o6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = o6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        o6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    o6 o6Var5 = o6Var;
                                    o6Var5.C0(null, true);
                                    rg.j jVar4 = jVar;
                                    o6Var5.K0((rg.v0) jVar4, new bi.f0(2, o6Var5, jVar4));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = o6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        o6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    o6 o6Var6 = o6Var;
                                    o6Var6.C0(null, true);
                                    o6Var6.J0((rg.s0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = o6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        o6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    rg.j jVar5 = jVar;
                                    if (jVar5 instanceof rg.q2) {
                                        ((rg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.c2) {
                                        ((rg.c2) jVar5).r(true);
                                    } else if (jVar5 instanceof rg.d2) {
                                        rg.d2 d2Var = (rg.d2) jVar5;
                                        d2Var.f44230r0 = !d2Var.f44230r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((rg.z1) jVar5).r(true);
                                    }
                                    o6 o6Var7 = o6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = o6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        o6Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    o6 o6Var8 = o6Var;
                                    o6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = o6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        o6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o6 o6Var9 = o6Var;
                                    i6 i6Var2 = o6Var9.R0;
                                    rg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF P0 = o6Var9.P0(jVar6);
                                        if (jVar6 instanceof rg.q2) {
                                            rg.j q2Var = new rg.q2(o6Var9.getContext(), (rg.q2) jVar6, P0);
                                            q2Var.setDelegate(o6Var9);
                                            i6Var2.addView(q2Var);
                                            o6Var9.f0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof rg.x2) {
                                            rg.x2 x2Var2 = new rg.x2(o6Var9.getContext(), (rg.x2) jVar6, P0);
                                            x2Var2.setDelegate(o6Var9);
                                            x2Var2.setMaxWidth(o6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            i6Var2.addView(x2Var2, w7.a6.d(-2.0f, -2));
                                            o6Var9.f0();
                                            x2Var = x2Var2;
                                        }
                                        o6Var9.A0(x2Var);
                                        o6Var9.C0(null, true);
                                        o6Var9.d0(x2Var);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = o6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        o6Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, w7.a6.n(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var);
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
                    childAt.setBackground(org.telegram.ui.ActionBar.g6.b0(w02, i10, i11, i12, i14));
                }
                o6Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
