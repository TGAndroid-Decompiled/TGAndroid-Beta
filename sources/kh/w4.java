package kh;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w4 implements Runnable {
    public final int f16236a;
    public final g6 f16237b;
    public final yf.j f16238c;

    public w4(g6 g6Var, yf.j jVar, int i9) {
        this.f16236a = i9;
        this.f16237b = g6Var;
        this.f16238c = jVar;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        int i11;
        switch (this.f16236a) {
            case 0:
                this.f16237b.C0(this.f16238c);
                return;
            default:
                final g6 g6Var = this.f16237b;
                a6 a6Var = g6Var.N0;
                j5 j5Var = g6Var.K1;
                u5 u5Var = g6Var.C1;
                LinearLayout linearLayout = new LinearLayout(g6Var.getContext());
                linearLayout.setOrientation(0);
                final yf.j jVar = this.f16238c;
                boolean z10 = jVar instanceof yf.e1;
                if (!z10) {
                    TextView textView = new TextView(g6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, u5Var));
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
                            yf.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    yf.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof yf.b2;
                                    g6 g6Var2 = g6Var;
                                    if (z11) {
                                        mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                        if (mbVar != null) {
                                            mbVar.B();
                                        }
                                    } else {
                                        g6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        g6Var2.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yf.j jVar3 = jVar;
                                    g6 g6Var3 = g6Var;
                                    g6Var3.getClass();
                                    try {
                                        ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        g6Var3.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g6 g6Var4 = g6Var;
                                    g6Var4.D0(jVar, true);
                                    g6Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        g6Var4.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    g6 g6Var5 = g6Var;
                                    g6Var5.D0(null, true);
                                    yf.j jVar4 = jVar;
                                    g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        g6Var5.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    g6 g6Var6 = g6Var;
                                    g6Var6.D0(null, true);
                                    g6Var6.K0((yf.p0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        g6Var6.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    yf.j jVar5 = jVar;
                                    if (jVar5 instanceof yf.n2) {
                                        ((yf.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.a2) {
                                        ((yf.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.b2) {
                                        yf.b2 b2Var = (yf.b2) jVar5;
                                        b2Var.f49760n0 = !b2Var.f49760n0;
                                        b2Var.invalidate();
                                    } else {
                                        ((yf.x1) jVar5).r(true);
                                    }
                                    g6 g6Var7 = g6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        g6Var7.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    g6 g6Var8 = g6Var;
                                    g6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        g6Var8.D1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g6 g6Var9 = g6Var;
                                    a6 a6Var2 = g6Var9.N0;
                                    yf.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = g6Var9.Q0(jVar6);
                                        if (jVar6 instanceof yf.n2) {
                                            yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                            n2Var.setDelegate(g6Var9);
                                            a6Var2.addView(n2Var);
                                            g6Var9.g0();
                                            v2Var = n2Var;
                                        } else if (jVar6 instanceof yf.v2) {
                                            yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                            v2Var2.setDelegate(g6Var9);
                                            v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                            g6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        g6Var9.B0(v2Var);
                                        g6Var9.D0(null, true);
                                        g6Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        g6Var9.D1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, g7.e6.n(-2, 44));
                }
                if (jVar instanceof yf.v2) {
                    TextView textView2 = new TextView(g6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, u5Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((j5Var.c() && !j5Var.d) || g6Var.f15297p2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                yf.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        yf.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof yf.b2;
                                        g6 g6Var2 = g6Var;
                                        if (z11) {
                                            mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                            if (mbVar != null) {
                                                mbVar.B();
                                            }
                                        } else {
                                            g6Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            g6Var2.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        yf.j jVar3 = jVar;
                                        g6 g6Var3 = g6Var;
                                        g6Var3.getClass();
                                        try {
                                            ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            g6Var3.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        g6 g6Var4 = g6Var;
                                        g6Var4.D0(jVar, true);
                                        g6Var4.r0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            g6Var4.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        g6 g6Var5 = g6Var;
                                        g6Var5.D0(null, true);
                                        yf.j jVar4 = jVar;
                                        g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            g6Var5.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        g6 g6Var6 = g6Var;
                                        g6Var6.D0(null, true);
                                        g6Var6.K0((yf.p0) jVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            g6Var6.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        yf.j jVar5 = jVar;
                                        if (jVar5 instanceof yf.n2) {
                                            ((yf.n2) jVar5).r(true);
                                        } else if (jVar5 instanceof yf.a2) {
                                            ((yf.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof yf.b2) {
                                            yf.b2 b2Var = (yf.b2) jVar5;
                                            b2Var.f49760n0 = !b2Var.f49760n0;
                                            b2Var.invalidate();
                                        } else {
                                            ((yf.x1) jVar5).r(true);
                                        }
                                        g6 g6Var7 = g6Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            g6Var7.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        g6 g6Var8 = g6Var;
                                        g6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            g6Var8.D1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        g6 g6Var9 = g6Var;
                                        a6 a6Var2 = g6Var9.N0;
                                        yf.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = g6Var9.Q0(jVar6);
                                            if (jVar6 instanceof yf.n2) {
                                                yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                                n2Var.setDelegate(g6Var9);
                                                a6Var2.addView(n2Var);
                                                g6Var9.g0();
                                                v2Var = n2Var;
                                            } else if (jVar6 instanceof yf.v2) {
                                                yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                                v2Var2.setDelegate(g6Var9);
                                                v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                                a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                                g6Var9.g0();
                                                v2Var = v2Var2;
                                            }
                                            g6Var9.B0(v2Var);
                                            g6Var9.D0(null, true);
                                            g6Var9.d0(v2Var);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            g6Var9.D1.d(true);
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
                                yf.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        yf.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof yf.b2;
                                        g6 g6Var2 = g6Var;
                                        if (z11) {
                                            mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                            if (mbVar != null) {
                                                mbVar.B();
                                            }
                                        } else {
                                            g6Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            g6Var2.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        yf.j jVar3 = jVar;
                                        g6 g6Var3 = g6Var;
                                        g6Var3.getClass();
                                        try {
                                            ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            g6Var3.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        g6 g6Var4 = g6Var;
                                        g6Var4.D0(jVar, true);
                                        g6Var4.r0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            g6Var4.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        g6 g6Var5 = g6Var;
                                        g6Var5.D0(null, true);
                                        yf.j jVar4 = jVar;
                                        g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            g6Var5.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        g6 g6Var6 = g6Var;
                                        g6Var6.D0(null, true);
                                        g6Var6.K0((yf.p0) jVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            g6Var6.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        yf.j jVar5 = jVar;
                                        if (jVar5 instanceof yf.n2) {
                                            ((yf.n2) jVar5).r(true);
                                        } else if (jVar5 instanceof yf.a2) {
                                            ((yf.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof yf.b2) {
                                            yf.b2 b2Var = (yf.b2) jVar5;
                                            b2Var.f49760n0 = !b2Var.f49760n0;
                                            b2Var.invalidate();
                                        } else {
                                            ((yf.x1) jVar5).r(true);
                                        }
                                        g6 g6Var7 = g6Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            g6Var7.D1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        g6 g6Var8 = g6Var;
                                        g6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            g6Var8.D1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        g6 g6Var9 = g6Var;
                                        a6 a6Var2 = g6Var9.N0;
                                        yf.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = g6Var9.Q0(jVar6);
                                            if (jVar6 instanceof yf.n2) {
                                                yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                                n2Var.setDelegate(g6Var9);
                                                a6Var2.addView(n2Var);
                                                g6Var9.g0();
                                                v2Var = n2Var;
                                            } else if (jVar6 instanceof yf.v2) {
                                                yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                                v2Var2.setDelegate(g6Var9);
                                                v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                                a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                                g6Var9.g0();
                                                v2Var = v2Var2;
                                            }
                                            g6Var9.B0(v2Var);
                                            g6Var9.D0(null, true);
                                            g6Var9.d0(v2Var);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            g6Var9.D1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, g7.e6.n(-2, 44));
                } else if (jVar instanceof yf.s0) {
                    TextView h02 = g6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            yf.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    yf.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof yf.b2;
                                    g6 g6Var2 = g6Var;
                                    if (z11) {
                                        mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                        if (mbVar != null) {
                                            mbVar.B();
                                        }
                                    } else {
                                        g6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        g6Var2.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yf.j jVar3 = jVar;
                                    g6 g6Var3 = g6Var;
                                    g6Var3.getClass();
                                    try {
                                        ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        g6Var3.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g6 g6Var4 = g6Var;
                                    g6Var4.D0(jVar, true);
                                    g6Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        g6Var4.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    g6 g6Var5 = g6Var;
                                    g6Var5.D0(null, true);
                                    yf.j jVar4 = jVar;
                                    g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        g6Var5.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    g6 g6Var6 = g6Var;
                                    g6Var6.D0(null, true);
                                    g6Var6.K0((yf.p0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        g6Var6.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    yf.j jVar5 = jVar;
                                    if (jVar5 instanceof yf.n2) {
                                        ((yf.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.a2) {
                                        ((yf.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.b2) {
                                        yf.b2 b2Var = (yf.b2) jVar5;
                                        b2Var.f49760n0 = !b2Var.f49760n0;
                                        b2Var.invalidate();
                                    } else {
                                        ((yf.x1) jVar5).r(true);
                                    }
                                    g6 g6Var7 = g6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        g6Var7.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    g6 g6Var8 = g6Var;
                                    g6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        g6Var8.D1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g6 g6Var9 = g6Var;
                                    a6 a6Var2 = g6Var9.N0;
                                    yf.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = g6Var9.Q0(jVar6);
                                        if (jVar6 instanceof yf.n2) {
                                            yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                            n2Var.setDelegate(g6Var9);
                                            a6Var2.addView(n2Var);
                                            g6Var9.g0();
                                            v2Var = n2Var;
                                        } else if (jVar6 instanceof yf.v2) {
                                            yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                            v2Var2.setDelegate(g6Var9);
                                            v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                            g6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        g6Var9.B0(v2Var);
                                        g6Var9.D0(null, true);
                                        g6Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        g6Var9.D1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h02, g7.e6.n(-2, 44));
                } else if (jVar instanceof yf.p0) {
                    TextView h03 = g6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            yf.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    yf.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof yf.b2;
                                    g6 g6Var2 = g6Var;
                                    if (z11) {
                                        mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                        if (mbVar != null) {
                                            mbVar.B();
                                        }
                                    } else {
                                        g6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        g6Var2.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yf.j jVar3 = jVar;
                                    g6 g6Var3 = g6Var;
                                    g6Var3.getClass();
                                    try {
                                        ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        g6Var3.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g6 g6Var4 = g6Var;
                                    g6Var4.D0(jVar, true);
                                    g6Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        g6Var4.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    g6 g6Var5 = g6Var;
                                    g6Var5.D0(null, true);
                                    yf.j jVar4 = jVar;
                                    g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        g6Var5.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    g6 g6Var6 = g6Var;
                                    g6Var6.D0(null, true);
                                    g6Var6.K0((yf.p0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        g6Var6.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    yf.j jVar5 = jVar;
                                    if (jVar5 instanceof yf.n2) {
                                        ((yf.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.a2) {
                                        ((yf.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.b2) {
                                        yf.b2 b2Var = (yf.b2) jVar5;
                                        b2Var.f49760n0 = !b2Var.f49760n0;
                                        b2Var.invalidate();
                                    } else {
                                        ((yf.x1) jVar5).r(true);
                                    }
                                    g6 g6Var7 = g6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        g6Var7.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    g6 g6Var8 = g6Var;
                                    g6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        g6Var8.D1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g6 g6Var9 = g6Var;
                                    a6 a6Var2 = g6Var9.N0;
                                    yf.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = g6Var9.Q0(jVar6);
                                        if (jVar6 instanceof yf.n2) {
                                            yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                            n2Var.setDelegate(g6Var9);
                                            a6Var2.addView(n2Var);
                                            g6Var9.g0();
                                            v2Var = n2Var;
                                        } else if (jVar6 instanceof yf.v2) {
                                            yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                            v2Var2.setDelegate(g6Var9);
                                            v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                            g6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        g6Var9.B0(v2Var);
                                        g6Var9.D0(null, true);
                                        g6Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        g6Var9.D1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h03, g7.e6.n(-2, 44));
                }
                if ((jVar instanceof yf.n2) || (jVar instanceof yf.b2) || (jVar instanceof yf.x1) || (jVar instanceof yf.a2)) {
                    TextView h04 = g6Var.h0(4, LocaleController.getString(R.string.Flip));
                    h04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            yf.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    yf.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof yf.b2;
                                    g6 g6Var2 = g6Var;
                                    if (z11) {
                                        mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                        if (mbVar != null) {
                                            mbVar.B();
                                        }
                                    } else {
                                        g6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        g6Var2.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yf.j jVar3 = jVar;
                                    g6 g6Var3 = g6Var;
                                    g6Var3.getClass();
                                    try {
                                        ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        g6Var3.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g6 g6Var4 = g6Var;
                                    g6Var4.D0(jVar, true);
                                    g6Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        g6Var4.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    g6 g6Var5 = g6Var;
                                    g6Var5.D0(null, true);
                                    yf.j jVar4 = jVar;
                                    g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        g6Var5.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    g6 g6Var6 = g6Var;
                                    g6Var6.D0(null, true);
                                    g6Var6.K0((yf.p0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        g6Var6.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    yf.j jVar5 = jVar;
                                    if (jVar5 instanceof yf.n2) {
                                        ((yf.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.a2) {
                                        ((yf.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.b2) {
                                        yf.b2 b2Var = (yf.b2) jVar5;
                                        b2Var.f49760n0 = !b2Var.f49760n0;
                                        b2Var.invalidate();
                                    } else {
                                        ((yf.x1) jVar5).r(true);
                                    }
                                    g6 g6Var7 = g6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        g6Var7.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    g6 g6Var8 = g6Var;
                                    g6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        g6Var8.D1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g6 g6Var9 = g6Var;
                                    a6 a6Var2 = g6Var9.N0;
                                    yf.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = g6Var9.Q0(jVar6);
                                        if (jVar6 instanceof yf.n2) {
                                            yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                            n2Var.setDelegate(g6Var9);
                                            a6Var2.addView(n2Var);
                                            g6Var9.g0();
                                            v2Var = n2Var;
                                        } else if (jVar6 instanceof yf.v2) {
                                            yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                            v2Var2.setDelegate(g6Var9);
                                            v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                            g6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        g6Var9.B0(v2Var);
                                        g6Var9.D0(null, true);
                                        g6Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        g6Var9.D1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h04, g7.e6.n(-2, 44));
                }
                boolean z11 = jVar instanceof yf.x1;
                if (a6Var.indexOfChild(jVar) != a6Var.getChildCount() - 1 && !(jVar instanceof yf.a2)) {
                    TextView textView3 = new TextView(g6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, u5Var));
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
                            yf.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    yf.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof yf.b2;
                                    g6 g6Var2 = g6Var;
                                    if (z112) {
                                        mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                        if (mbVar != null) {
                                            mbVar.B();
                                        }
                                    } else {
                                        g6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        g6Var2.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yf.j jVar3 = jVar;
                                    g6 g6Var3 = g6Var;
                                    g6Var3.getClass();
                                    try {
                                        ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        g6Var3.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g6 g6Var4 = g6Var;
                                    g6Var4.D0(jVar, true);
                                    g6Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        g6Var4.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    g6 g6Var5 = g6Var;
                                    g6Var5.D0(null, true);
                                    yf.j jVar4 = jVar;
                                    g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        g6Var5.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    g6 g6Var6 = g6Var;
                                    g6Var6.D0(null, true);
                                    g6Var6.K0((yf.p0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        g6Var6.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    yf.j jVar5 = jVar;
                                    if (jVar5 instanceof yf.n2) {
                                        ((yf.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.a2) {
                                        ((yf.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.b2) {
                                        yf.b2 b2Var = (yf.b2) jVar5;
                                        b2Var.f49760n0 = !b2Var.f49760n0;
                                        b2Var.invalidate();
                                    } else {
                                        ((yf.x1) jVar5).r(true);
                                    }
                                    g6 g6Var7 = g6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        g6Var7.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    g6 g6Var8 = g6Var;
                                    g6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        g6Var8.D1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g6 g6Var9 = g6Var;
                                    a6 a6Var2 = g6Var9.N0;
                                    yf.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = g6Var9.Q0(jVar6);
                                        if (jVar6 instanceof yf.n2) {
                                            yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                            n2Var.setDelegate(g6Var9);
                                            a6Var2.addView(n2Var);
                                            g6Var9.g0();
                                            v2Var = n2Var;
                                        } else if (jVar6 instanceof yf.v2) {
                                            yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                            v2Var2.setDelegate(g6Var9);
                                            v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                            g6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        g6Var9.B0(v2Var);
                                        g6Var9.D0(null, true);
                                        g6Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        g6Var9.D1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, g7.e6.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof yf.b2) && !(jVar instanceof yf.s0) && !(jVar instanceof yf.w2) && !(jVar instanceof yf.p0) && !(jVar instanceof yf.a2)) {
                    TextView textView4 = new TextView(g6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, u5Var));
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
                            yf.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    yf.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof yf.b2;
                                    g6 g6Var2 = g6Var;
                                    if (z112) {
                                        mb mbVar = ((ya) g6Var2).f16412w2.Y0;
                                        if (mbVar != null) {
                                            mbVar.B();
                                        }
                                    } else {
                                        g6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = g6Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        g6Var2.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yf.j jVar3 = jVar;
                                    g6 g6Var3 = g6Var;
                                    g6Var3.getClass();
                                    try {
                                        ((yf.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = g6Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        g6Var3.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g6 g6Var4 = g6Var;
                                    g6Var4.D0(jVar, true);
                                    g6Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = g6Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        g6Var4.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    g6 g6Var5 = g6Var;
                                    g6Var5.D0(null, true);
                                    yf.j jVar4 = jVar;
                                    g6Var5.L0((yf.s0) jVar4, new bg.y0(8, g6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = g6Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        g6Var5.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    g6 g6Var6 = g6Var;
                                    g6Var6.D0(null, true);
                                    g6Var6.K0((yf.p0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = g6Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        g6Var6.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    yf.j jVar5 = jVar;
                                    if (jVar5 instanceof yf.n2) {
                                        ((yf.n2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.a2) {
                                        ((yf.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof yf.b2) {
                                        yf.b2 b2Var = (yf.b2) jVar5;
                                        b2Var.f49760n0 = !b2Var.f49760n0;
                                        b2Var.invalidate();
                                    } else {
                                        ((yf.x1) jVar5).r(true);
                                    }
                                    g6 g6Var7 = g6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = g6Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        g6Var7.D1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    g6 g6Var8 = g6Var;
                                    g6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = g6Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        g6Var8.D1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g6 g6Var9 = g6Var;
                                    a6 a6Var2 = g6Var9.N0;
                                    yf.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = g6Var9.Q0(jVar6);
                                        if (jVar6 instanceof yf.n2) {
                                            yf.j n2Var = new yf.n2(g6Var9.getContext(), (yf.n2) jVar6, Q0);
                                            n2Var.setDelegate(g6Var9);
                                            a6Var2.addView(n2Var);
                                            g6Var9.g0();
                                            v2Var = n2Var;
                                        } else if (jVar6 instanceof yf.v2) {
                                            yf.v2 v2Var2 = new yf.v2(g6Var9.getContext(), (yf.v2) jVar6, Q0);
                                            v2Var2.setDelegate(g6Var9);
                                            v2Var2.setMaxWidth(g6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            a6Var2.addView(v2Var2, g7.e6.c(-2.0f, -2));
                                            g6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        g6Var9.B0(v2Var);
                                        g6Var9.D0(null, true);
                                        g6Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = g6Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        g6Var9.D1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, g7.e6.n(-2, 44));
                }
                for (int i12 = 0; i12 < linearLayout.getChildCount(); i12++) {
                    View childAt = linearLayout.getChildAt(i12);
                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, u5Var);
                    int i13 = 8;
                    if (i12 == 0) {
                        i9 = 8;
                    } else {
                        i9 = 0;
                    }
                    if (i12 == linearLayout.getChildCount() - 1) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    if (i12 == linearLayout.getChildCount() - 1) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    if (i12 != 0) {
                        i13 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.f6.a0(v02, i9, i10, i11, i13));
                }
                g6Var.E1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
