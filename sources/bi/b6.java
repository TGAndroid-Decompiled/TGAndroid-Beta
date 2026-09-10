package bi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b6 implements Runnable {
    public final int f2366a;
    public final r7 f2367b;
    public final pg.j f2368c;

    public b6(r7 r7Var, pg.j jVar, int i10) {
        this.f2366a = i10;
        this.f2367b = r7Var;
        this.f2368c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f2366a) {
            case 0:
                this.f2367b.C0(this.f2368c);
                return;
            default:
                final r7 r7Var = this.f2367b;
                j7 j7Var = r7Var.R0;
                r6 r6Var = r7Var.O1;
                d7 d7Var = r7Var.G1;
                LinearLayout linearLayout = new LinearLayout(r7Var.getContext());
                linearLayout.setOrientation(0);
                final pg.j jVar = this.f2368c;
                boolean z10 = jVar instanceof pg.e1;
                if (!z10) {
                    TextView textView = new TextView(r7Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
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
                            pg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    pg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    pg.j jVar3 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar4 = jVar;
                                    r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    pg.j jVar5 = jVar;
                                    if (jVar5 instanceof pg.o2) {
                                        ((pg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.a2) {
                                        ((pg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar5;
                                        b2Var.f39955r0 = !b2Var.f39955r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar5).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar6);
                                        if (jVar6 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof pg.v2) {
                                            pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(r7Var9);
                                            v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        r7Var9.B0(v2Var);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.a6.n(-2, 44));
                }
                if (jVar instanceof pg.v2) {
                    TextView textView2 = new TextView(r7Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((r6Var.c() && !r6Var.d) || r7Var.f3537t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                pg.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        pg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof pg.b2;
                                        r7 r7Var2 = r7Var;
                                        if (z11) {
                                            qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                            if (qdVar != null) {
                                                qdVar.B();
                                            }
                                        } else {
                                            r7Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            r7Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        pg.j jVar3 = jVar;
                                        r7 r7Var3 = r7Var;
                                        r7Var3.getClass();
                                        try {
                                            ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            r7Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        r7 r7Var4 = r7Var;
                                        r7Var4.D0(jVar, true);
                                        r7Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            r7Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        r7 r7Var5 = r7Var;
                                        r7Var5.D0(null, true);
                                        pg.j jVar4 = jVar;
                                        r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            r7Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        r7 r7Var6 = r7Var;
                                        r7Var6.D0(null, true);
                                        r7Var6.K0((pg.q0) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            r7Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        pg.j jVar5 = jVar;
                                        if (jVar5 instanceof pg.o2) {
                                            ((pg.o2) jVar5).r(true);
                                        } else if (jVar5 instanceof pg.a2) {
                                            ((pg.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof pg.b2) {
                                            pg.b2 b2Var = (pg.b2) jVar5;
                                            b2Var.f39955r0 = !b2Var.f39955r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((pg.x1) jVar5).r(true);
                                        }
                                        r7 r7Var7 = r7Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            r7Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        r7 r7Var8 = r7Var;
                                        r7Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            r7Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        r7 r7Var9 = r7Var;
                                        j7 j7Var2 = r7Var9.R0;
                                        pg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = r7Var9.Q0(jVar6);
                                            if (jVar6 instanceof pg.o2) {
                                                pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                                o2Var.setDelegate(r7Var9);
                                                j7Var2.addView(o2Var);
                                                r7Var9.g0();
                                                v2Var = o2Var;
                                            } else if (jVar6 instanceof pg.v2) {
                                                pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                                v2Var2.setDelegate(r7Var9);
                                                v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                                r7Var9.g0();
                                                v2Var = v2Var2;
                                            }
                                            r7Var9.B0(v2Var);
                                            r7Var9.D0(null, true);
                                            r7Var9.d0(v2Var);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            r7Var9.H1.d(true);
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
                                pg.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        pg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof pg.b2;
                                        r7 r7Var2 = r7Var;
                                        if (z11) {
                                            qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                            if (qdVar != null) {
                                                qdVar.B();
                                            }
                                        } else {
                                            r7Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            r7Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        pg.j jVar3 = jVar;
                                        r7 r7Var3 = r7Var;
                                        r7Var3.getClass();
                                        try {
                                            ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            r7Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        r7 r7Var4 = r7Var;
                                        r7Var4.D0(jVar, true);
                                        r7Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            r7Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        r7 r7Var5 = r7Var;
                                        r7Var5.D0(null, true);
                                        pg.j jVar4 = jVar;
                                        r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            r7Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        r7 r7Var6 = r7Var;
                                        r7Var6.D0(null, true);
                                        r7Var6.K0((pg.q0) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            r7Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        pg.j jVar5 = jVar;
                                        if (jVar5 instanceof pg.o2) {
                                            ((pg.o2) jVar5).r(true);
                                        } else if (jVar5 instanceof pg.a2) {
                                            ((pg.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof pg.b2) {
                                            pg.b2 b2Var = (pg.b2) jVar5;
                                            b2Var.f39955r0 = !b2Var.f39955r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((pg.x1) jVar5).r(true);
                                        }
                                        r7 r7Var7 = r7Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            r7Var7.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        r7 r7Var8 = r7Var;
                                        r7Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            r7Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        r7 r7Var9 = r7Var;
                                        j7 j7Var2 = r7Var9.R0;
                                        pg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = r7Var9.Q0(jVar6);
                                            if (jVar6 instanceof pg.o2) {
                                                pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                                o2Var.setDelegate(r7Var9);
                                                j7Var2.addView(o2Var);
                                                r7Var9.g0();
                                                v2Var = o2Var;
                                            } else if (jVar6 instanceof pg.v2) {
                                                pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                                v2Var2.setDelegate(r7Var9);
                                                v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                                r7Var9.g0();
                                                v2Var = v2Var2;
                                            }
                                            r7Var9.B0(v2Var);
                                            r7Var9.D0(null, true);
                                            r7Var9.d0(v2Var);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            r7Var9.H1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.a6.n(-2, 44));
                } else if (jVar instanceof pg.t0) {
                    TextView h02 = r7Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            pg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    pg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    pg.j jVar3 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar4 = jVar;
                                    r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    pg.j jVar5 = jVar;
                                    if (jVar5 instanceof pg.o2) {
                                        ((pg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.a2) {
                                        ((pg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar5;
                                        b2Var.f39955r0 = !b2Var.f39955r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar5).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar6);
                                        if (jVar6 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof pg.v2) {
                                            pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(r7Var9);
                                            v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        r7Var9.B0(v2Var);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h02, w7.a6.n(-2, 44));
                } else if (jVar instanceof pg.q0) {
                    TextView h03 = r7Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            pg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    pg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    pg.j jVar3 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar4 = jVar;
                                    r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    pg.j jVar5 = jVar;
                                    if (jVar5 instanceof pg.o2) {
                                        ((pg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.a2) {
                                        ((pg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar5;
                                        b2Var.f39955r0 = !b2Var.f39955r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar5).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar6);
                                        if (jVar6 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof pg.v2) {
                                            pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(r7Var9);
                                            v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        r7Var9.B0(v2Var);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h03, w7.a6.n(-2, 44));
                }
                if ((jVar instanceof pg.o2) || (jVar instanceof pg.b2) || (jVar instanceof pg.x1) || (jVar instanceof pg.a2)) {
                    TextView h04 = r7Var.h0(4, LocaleController.getString(R.string.Flip));
                    h04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            pg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    pg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    pg.j jVar3 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar4 = jVar;
                                    r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    pg.j jVar5 = jVar;
                                    if (jVar5 instanceof pg.o2) {
                                        ((pg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.a2) {
                                        ((pg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar5;
                                        b2Var.f39955r0 = !b2Var.f39955r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar5).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar6);
                                        if (jVar6 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof pg.v2) {
                                            pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(r7Var9);
                                            v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        r7Var9.B0(v2Var);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h04, w7.a6.n(-2, 44));
                }
                boolean z11 = jVar instanceof pg.x1;
                if (j7Var.indexOfChild(jVar) != j7Var.getChildCount() - 1 && !(jVar instanceof pg.a2)) {
                    TextView textView3 = new TextView(r7Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
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
                            pg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    pg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z112) {
                                        qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    pg.j jVar3 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar4 = jVar;
                                    r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    pg.j jVar5 = jVar;
                                    if (jVar5 instanceof pg.o2) {
                                        ((pg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.a2) {
                                        ((pg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar5;
                                        b2Var.f39955r0 = !b2Var.f39955r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar5).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar6);
                                        if (jVar6 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof pg.v2) {
                                            pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(r7Var9);
                                            v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        r7Var9.B0(v2Var);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.a6.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof pg.b2) && !(jVar instanceof pg.t0) && !(jVar instanceof pg.w2) && !(jVar instanceof pg.q0) && !(jVar instanceof pg.a2)) {
                    TextView textView4 = new TextView(r7Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
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
                            pg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    pg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z112) {
                                        qd qdVar = ((ad) r7Var2).A2.f2439c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    pg.j jVar3 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar4 = jVar;
                                    r7Var5.L0((pg.t0) jVar4, new k6(0, r7Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    pg.j jVar5 = jVar;
                                    if (jVar5 instanceof pg.o2) {
                                        ((pg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.a2) {
                                        ((pg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar5;
                                        b2Var.f39955r0 = !b2Var.f39955r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar5).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar6);
                                        if (jVar6 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar6, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof pg.v2) {
                                            pg.v2 v2Var2 = new pg.v2(r7Var9.getContext(), (pg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(r7Var9);
                                            v2Var2.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var2, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        r7Var9.B0(v2Var);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(v2Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
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
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, d7Var);
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
                r7Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
