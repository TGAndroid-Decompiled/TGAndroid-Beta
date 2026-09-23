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
public final class e5 implements Runnable {
    public final int f4635a;
    public final q6 f4636b;
    public final qg.j f4637c;

    public e5(q6 q6Var, qg.j jVar, int i10) {
        this.f4635a = i10;
        this.f4636b = q6Var;
        this.f4637c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f4635a) {
            case 0:
                this.f4636b.C0(this.f4637c);
                return;
            default:
                final q6 q6Var = this.f4636b;
                j6 j6Var = q6Var.R0;
                s5 s5Var = q6Var.O1;
                d6 d6Var = q6Var.G1;
                LinearLayout linearLayout = new LinearLayout(q6Var.getContext());
                linearLayout.setOrientation(0);
                final qg.j jVar = this.f4637c;
                boolean z10 = jVar instanceof qg.h1;
                if (!z10) {
                    TextView textView = new TextView(q6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
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
                            qg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.e2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(jVar, true);
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
                                    qg.j jVar4 = jVar;
                                    q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.t0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.q2) {
                                        ((qg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.d2) {
                                        ((qg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.e2) {
                                        qg.e2 e2Var = (qg.e2) jVar5;
                                        e2Var.f41296r0 = !e2Var.f41296r0;
                                        e2Var.invalidate();
                                    } else {
                                        ((qg.a2) jVar5).r(true);
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
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    j6 j6Var2 = q6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.q2) {
                                            qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            j6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof qg.x2) {
                                            qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                if (jVar instanceof qg.x2) {
                    TextView textView2 = new TextView(q6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((s5Var.c() && !s5Var.d) || q6Var.f5368t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                qg.x2 x2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.e2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                            if (bcVar != null) {
                                                bcVar.B();
                                            }
                                        } else {
                                            q6Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            q6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        qg.j jVar3 = jVar;
                                        q6 q6Var3 = q6Var;
                                        q6Var3.getClass();
                                        try {
                                            ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            q6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        q6 q6Var4 = q6Var;
                                        q6Var4.D0(jVar, true);
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
                                        qg.j jVar4 = jVar;
                                        q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.D0(null, true);
                                        q6Var6.K0((qg.t0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.q2) {
                                            ((qg.q2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.d2) {
                                            ((qg.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.e2) {
                                            qg.e2 e2Var = (qg.e2) jVar5;
                                            e2Var.f41296r0 = !e2Var.f41296r0;
                                            e2Var.invalidate();
                                        } else {
                                            ((qg.a2) jVar5).r(true);
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
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            q6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        q6 q6Var9 = q6Var;
                                        j6 j6Var2 = q6Var9.R0;
                                        qg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = q6Var9.Q0(jVar6);
                                            if (jVar6 instanceof qg.q2) {
                                                qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                                q2Var.setDelegate(q6Var9);
                                                j6Var2.addView(q2Var);
                                                q6Var9.g0();
                                                x2Var = q2Var;
                                            } else if (jVar6 instanceof qg.x2) {
                                                qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                                x2Var2.setDelegate(q6Var9);
                                                x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                                qg.x2 x2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.e2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                            if (bcVar != null) {
                                                bcVar.B();
                                            }
                                        } else {
                                            q6Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            q6Var2.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        qg.j jVar3 = jVar;
                                        q6 q6Var3 = q6Var;
                                        q6Var3.getClass();
                                        try {
                                            ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            q6Var3.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        q6 q6Var4 = q6Var;
                                        q6Var4.D0(jVar, true);
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
                                        qg.j jVar4 = jVar;
                                        q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.D0(null, true);
                                        q6Var6.K0((qg.t0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.q2) {
                                            ((qg.q2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.d2) {
                                            ((qg.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.e2) {
                                            qg.e2 e2Var = (qg.e2) jVar5;
                                            e2Var.f41296r0 = !e2Var.f41296r0;
                                            e2Var.invalidate();
                                        } else {
                                            ((qg.a2) jVar5).r(true);
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
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            q6Var8.H1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        q6 q6Var9 = q6Var;
                                        j6 j6Var2 = q6Var9.R0;
                                        qg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = q6Var9.Q0(jVar6);
                                            if (jVar6 instanceof qg.q2) {
                                                qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                                q2Var.setDelegate(q6Var9);
                                                j6Var2.addView(q2Var);
                                                q6Var9.g0();
                                                x2Var = q2Var;
                                            } else if (jVar6 instanceof qg.x2) {
                                                qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                                x2Var2.setDelegate(q6Var9);
                                                x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                } else if (jVar instanceof qg.w0) {
                    TextView h02 = q6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.e2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(jVar, true);
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
                                    qg.j jVar4 = jVar;
                                    q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.t0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.q2) {
                                        ((qg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.d2) {
                                        ((qg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.e2) {
                                        qg.e2 e2Var = (qg.e2) jVar5;
                                        e2Var.f41296r0 = !e2Var.f41296r0;
                                        e2Var.invalidate();
                                    } else {
                                        ((qg.a2) jVar5).r(true);
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
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    j6 j6Var2 = q6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.q2) {
                                            qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            j6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof qg.x2) {
                                            qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                } else if (jVar instanceof qg.t0) {
                    TextView h03 = q6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.e2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(jVar, true);
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
                                    qg.j jVar4 = jVar;
                                    q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.t0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.q2) {
                                        ((qg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.d2) {
                                        ((qg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.e2) {
                                        qg.e2 e2Var = (qg.e2) jVar5;
                                        e2Var.f41296r0 = !e2Var.f41296r0;
                                        e2Var.invalidate();
                                    } else {
                                        ((qg.a2) jVar5).r(true);
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
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    j6 j6Var2 = q6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.q2) {
                                            qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            j6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof qg.x2) {
                                            qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                if ((jVar instanceof qg.q2) || (jVar instanceof qg.e2) || (jVar instanceof qg.a2) || (jVar instanceof qg.d2)) {
                    TextView h04 = q6Var.h0(4, LocaleController.getString(R.string.Flip));
                    h04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.e2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(jVar, true);
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
                                    qg.j jVar4 = jVar;
                                    q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.t0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.q2) {
                                        ((qg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.d2) {
                                        ((qg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.e2) {
                                        qg.e2 e2Var = (qg.e2) jVar5;
                                        e2Var.f41296r0 = !e2Var.f41296r0;
                                        e2Var.invalidate();
                                    } else {
                                        ((qg.a2) jVar5).r(true);
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
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    j6 j6Var2 = q6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.q2) {
                                            qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            j6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof qg.x2) {
                                            qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                boolean z11 = jVar instanceof qg.a2;
                if (j6Var.indexOfChild(jVar) != j6Var.getChildCount() - 1 && !(jVar instanceof qg.d2)) {
                    TextView textView3 = new TextView(q6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
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
                            qg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.e2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(jVar, true);
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
                                    qg.j jVar4 = jVar;
                                    q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.t0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.q2) {
                                        ((qg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.d2) {
                                        ((qg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.e2) {
                                        qg.e2 e2Var = (qg.e2) jVar5;
                                        e2Var.f41296r0 = !e2Var.f41296r0;
                                        e2Var.invalidate();
                                    } else {
                                        ((qg.a2) jVar5).r(true);
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
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    j6 j6Var2 = q6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.q2) {
                                            qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            j6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof qg.x2) {
                                            qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                } else if (!z11 && !z10 && !(jVar instanceof qg.e2) && !(jVar instanceof qg.w0) && !(jVar instanceof qg.y2) && !(jVar instanceof qg.t0) && !(jVar instanceof qg.d2)) {
                    TextView textView4 = new TextView(q6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
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
                            qg.x2 x2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.e2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        bc bcVar = ((nb) q6Var2).A2.f5035c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = q6Var2.H1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        q6Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qg.j jVar3 = jVar;
                                    q6 q6Var3 = q6Var;
                                    q6Var3.getClass();
                                    try {
                                        ((qg.x2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = q6Var3.H1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        q6Var3.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q6 q6Var4 = q6Var;
                                    q6Var4.D0(jVar, true);
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
                                    qg.j jVar4 = jVar;
                                    q6Var5.L0((qg.w0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.t0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.q2) {
                                        ((qg.q2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.d2) {
                                        ((qg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.e2) {
                                        qg.e2 e2Var = (qg.e2) jVar5;
                                        e2Var.f41296r0 = !e2Var.f41296r0;
                                        e2Var.invalidate();
                                    } else {
                                        ((qg.a2) jVar5).r(true);
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
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = q6Var8.H1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        q6Var8.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    q6 q6Var9 = q6Var;
                                    j6 j6Var2 = q6Var9.R0;
                                    qg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = q6Var9.Q0(jVar6);
                                        if (jVar6 instanceof qg.q2) {
                                            qg.j q2Var = new qg.q2(q6Var9.getContext(), (qg.q2) jVar6, Q0);
                                            q2Var.setDelegate(q6Var9);
                                            j6Var2.addView(q2Var);
                                            q6Var9.g0();
                                            x2Var = q2Var;
                                        } else if (jVar6 instanceof qg.x2) {
                                            qg.x2 x2Var2 = new qg.x2(q6Var9.getContext(), (qg.x2) jVar6, Q0);
                                            x2Var2.setDelegate(q6Var9);
                                            x2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(x2Var2, w7.x5.c(-2.0f, -2));
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
                    int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var);
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
                    childAt.setBackground(org.telegram.ui.ActionBar.h6.a0(v02, i10, i11, i12, i14));
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
