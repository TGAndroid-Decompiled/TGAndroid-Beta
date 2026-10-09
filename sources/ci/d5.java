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
public final class d5 implements Runnable {
    public final int f4938a;
    public final q6 f4939b;
    public final qg.j f4940c;

    public d5(q6 q6Var, qg.j jVar, int i10) {
        this.f4938a = i10;
        this.f4939b = q6Var;
        this.f4940c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f4938a) {
            case 0:
                this.f4939b.B0(this.f4940c);
                return;
            default:
                final q6 q6Var = this.f4939b;
                j6 j6Var = q6Var.R0;
                r5 r5Var = q6Var.O1;
                d6 d6Var = q6Var.G1;
                LinearLayout linearLayout = new LinearLayout(q6Var.getContext());
                linearLayout.setOrientation(0);
                final qg.j jVar = this.f4940c;
                boolean z10 = jVar instanceof qg.e1;
                if (!z10) {
                    TextView textView = new TextView(q6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, d6Var));
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
                            qg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.c2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.B0(jVar2);
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
                                        ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var4.C0(jVar, true);
                                    q6Var4.q0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.C0(null, true);
                                    qg.j jVar4 = jVar;
                                    q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.C0(null, true);
                                    q6Var6.J0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.p2) {
                                        ((qg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        ((qg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.c2) {
                                        qg.c2 c2Var = (qg.c2) jVar5;
                                        c2Var.f46202r0 = !c2Var.f46202r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((qg.y1) jVar5).r(true);
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
                                        PointF P0 = q6Var9.P0(jVar6);
                                        if (jVar6 instanceof qg.p2) {
                                            qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                            p2Var.setDelegate(q6Var9);
                                            j6Var2.addView(p2Var);
                                            q6Var9.f0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof qg.w2) {
                                            qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                            w2Var2.setDelegate(q6Var9);
                                            w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                            q6Var9.f0();
                                            w2Var = w2Var2;
                                        }
                                        q6Var9.A0(w2Var);
                                        q6Var9.C0(null, true);
                                        q6Var9.d0(w2Var);
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
                if (jVar instanceof qg.w2) {
                    TextView textView2 = new TextView(q6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, d6Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((r5Var.c() && !r5Var.d) || q6Var.f5827t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                qg.w2 w2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.c2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                            if (bcVar != null) {
                                                bcVar.B();
                                            }
                                        } else {
                                            q6Var2.B0(jVar2);
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
                                            ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                        q6Var4.C0(jVar, true);
                                        q6Var4.q0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            q6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        q6 q6Var5 = q6Var;
                                        q6Var5.C0(null, true);
                                        qg.j jVar4 = jVar;
                                        q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.C0(null, true);
                                        q6Var6.J0((qg.q0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.p2) {
                                            ((qg.p2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.b2) {
                                            ((qg.b2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.c2) {
                                            qg.c2 c2Var = (qg.c2) jVar5;
                                            c2Var.f46202r0 = !c2Var.f46202r0;
                                            c2Var.invalidate();
                                        } else {
                                            ((qg.y1) jVar5).r(true);
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
                                            PointF P0 = q6Var9.P0(jVar6);
                                            if (jVar6 instanceof qg.p2) {
                                                qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                                p2Var.setDelegate(q6Var9);
                                                j6Var2.addView(p2Var);
                                                q6Var9.f0();
                                                w2Var = p2Var;
                                            } else if (jVar6 instanceof qg.w2) {
                                                qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                                w2Var2.setDelegate(q6Var9);
                                                w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                                q6Var9.f0();
                                                w2Var = w2Var2;
                                            }
                                            q6Var9.A0(w2Var);
                                            q6Var9.C0(null, true);
                                            q6Var9.d0(w2Var);
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
                                qg.w2 w2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.c2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                            if (bcVar != null) {
                                                bcVar.B();
                                            }
                                        } else {
                                            q6Var2.B0(jVar2);
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
                                            ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                        q6Var4.C0(jVar, true);
                                        q6Var4.q0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            q6Var4.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        q6 q6Var5 = q6Var;
                                        q6Var5.C0(null, true);
                                        qg.j jVar4 = jVar;
                                        q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.C0(null, true);
                                        q6Var6.J0((qg.q0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.p2) {
                                            ((qg.p2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.b2) {
                                            ((qg.b2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.c2) {
                                            qg.c2 c2Var = (qg.c2) jVar5;
                                            c2Var.f46202r0 = !c2Var.f46202r0;
                                            c2Var.invalidate();
                                        } else {
                                            ((qg.y1) jVar5).r(true);
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
                                            PointF P0 = q6Var9.P0(jVar6);
                                            if (jVar6 instanceof qg.p2) {
                                                qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                                p2Var.setDelegate(q6Var9);
                                                j6Var2.addView(p2Var);
                                                q6Var9.f0();
                                                w2Var = p2Var;
                                            } else if (jVar6 instanceof qg.w2) {
                                                qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                                w2Var2.setDelegate(q6Var9);
                                                w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                                q6Var9.f0();
                                                w2Var = w2Var2;
                                            }
                                            q6Var9.A0(w2Var);
                                            q6Var9.C0(null, true);
                                            q6Var9.d0(w2Var);
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
                } else if (jVar instanceof qg.t0) {
                    TextView g02 = q6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    g02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.c2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.B0(jVar2);
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
                                        ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var4.C0(jVar, true);
                                    q6Var4.q0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.C0(null, true);
                                    qg.j jVar4 = jVar;
                                    q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.C0(null, true);
                                    q6Var6.J0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.p2) {
                                        ((qg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        ((qg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.c2) {
                                        qg.c2 c2Var = (qg.c2) jVar5;
                                        c2Var.f46202r0 = !c2Var.f46202r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((qg.y1) jVar5).r(true);
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
                                        PointF P0 = q6Var9.P0(jVar6);
                                        if (jVar6 instanceof qg.p2) {
                                            qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                            p2Var.setDelegate(q6Var9);
                                            j6Var2.addView(p2Var);
                                            q6Var9.f0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof qg.w2) {
                                            qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                            w2Var2.setDelegate(q6Var9);
                                            w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                            q6Var9.f0();
                                            w2Var = w2Var2;
                                        }
                                        q6Var9.A0(w2Var);
                                        q6Var9.C0(null, true);
                                        q6Var9.d0(w2Var);
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
                    linearLayout.addView(g02, w7.x5.n(-2, 44));
                } else if (jVar instanceof qg.q0) {
                    TextView g03 = q6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    g03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.c2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.B0(jVar2);
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
                                        ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var4.C0(jVar, true);
                                    q6Var4.q0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.C0(null, true);
                                    qg.j jVar4 = jVar;
                                    q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.C0(null, true);
                                    q6Var6.J0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.p2) {
                                        ((qg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        ((qg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.c2) {
                                        qg.c2 c2Var = (qg.c2) jVar5;
                                        c2Var.f46202r0 = !c2Var.f46202r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((qg.y1) jVar5).r(true);
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
                                        PointF P0 = q6Var9.P0(jVar6);
                                        if (jVar6 instanceof qg.p2) {
                                            qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                            p2Var.setDelegate(q6Var9);
                                            j6Var2.addView(p2Var);
                                            q6Var9.f0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof qg.w2) {
                                            qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                            w2Var2.setDelegate(q6Var9);
                                            w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                            q6Var9.f0();
                                            w2Var = w2Var2;
                                        }
                                        q6Var9.A0(w2Var);
                                        q6Var9.C0(null, true);
                                        q6Var9.d0(w2Var);
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
                    linearLayout.addView(g03, w7.x5.n(-2, 44));
                }
                if ((jVar instanceof qg.p2) || (jVar instanceof qg.c2) || (jVar instanceof qg.y1) || (jVar instanceof qg.b2)) {
                    TextView g04 = q6Var.g0(4, LocaleController.getString(R.string.Flip));
                    g04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.c2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.B0(jVar2);
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
                                        ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var4.C0(jVar, true);
                                    q6Var4.q0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.C0(null, true);
                                    qg.j jVar4 = jVar;
                                    q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.C0(null, true);
                                    q6Var6.J0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.p2) {
                                        ((qg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        ((qg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.c2) {
                                        qg.c2 c2Var = (qg.c2) jVar5;
                                        c2Var.f46202r0 = !c2Var.f46202r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((qg.y1) jVar5).r(true);
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
                                        PointF P0 = q6Var9.P0(jVar6);
                                        if (jVar6 instanceof qg.p2) {
                                            qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                            p2Var.setDelegate(q6Var9);
                                            j6Var2.addView(p2Var);
                                            q6Var9.f0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof qg.w2) {
                                            qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                            w2Var2.setDelegate(q6Var9);
                                            w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                            q6Var9.f0();
                                            w2Var = w2Var2;
                                        }
                                        q6Var9.A0(w2Var);
                                        q6Var9.C0(null, true);
                                        q6Var9.d0(w2Var);
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
                    linearLayout.addView(g04, w7.x5.n(-2, 44));
                }
                boolean z11 = jVar instanceof qg.y1;
                if (j6Var.indexOfChild(jVar) != j6Var.getChildCount() - 1 && !(jVar instanceof qg.b2)) {
                    TextView textView3 = new TextView(q6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, d6Var));
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
                            qg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.c2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.B0(jVar2);
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
                                        ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var4.C0(jVar, true);
                                    q6Var4.q0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.C0(null, true);
                                    qg.j jVar4 = jVar;
                                    q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.C0(null, true);
                                    q6Var6.J0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.p2) {
                                        ((qg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        ((qg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.c2) {
                                        qg.c2 c2Var = (qg.c2) jVar5;
                                        c2Var.f46202r0 = !c2Var.f46202r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((qg.y1) jVar5).r(true);
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
                                        PointF P0 = q6Var9.P0(jVar6);
                                        if (jVar6 instanceof qg.p2) {
                                            qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                            p2Var.setDelegate(q6Var9);
                                            j6Var2.addView(p2Var);
                                            q6Var9.f0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof qg.w2) {
                                            qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                            w2Var2.setDelegate(q6Var9);
                                            w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                            q6Var9.f0();
                                            w2Var = w2Var2;
                                        }
                                        q6Var9.A0(w2Var);
                                        q6Var9.C0(null, true);
                                        q6Var9.d0(w2Var);
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
                } else if (!z11 && !z10 && !(jVar instanceof qg.c2) && !(jVar instanceof qg.t0) && !(jVar instanceof qg.x2) && !(jVar instanceof qg.q0) && !(jVar instanceof qg.b2)) {
                    TextView textView4 = new TextView(q6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, d6Var));
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
                            qg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.c2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        bc bcVar = ((nb) q6Var2).A2.f5467c1;
                                        if (bcVar != null) {
                                            bcVar.B();
                                        }
                                    } else {
                                        q6Var2.B0(jVar2);
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
                                        ((qg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var4.C0(jVar, true);
                                    q6Var4.q0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = q6Var4.H1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        q6Var4.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    q6 q6Var5 = q6Var;
                                    q6Var5.C0(null, true);
                                    qg.j jVar4 = jVar;
                                    q6Var5.K0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.C0(null, true);
                                    q6Var6.J0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.p2) {
                                        ((qg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        ((qg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.c2) {
                                        qg.c2 c2Var = (qg.c2) jVar5;
                                        c2Var.f46202r0 = !c2Var.f46202r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((qg.y1) jVar5).r(true);
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
                                        PointF P0 = q6Var9.P0(jVar6);
                                        if (jVar6 instanceof qg.p2) {
                                            qg.j p2Var = new qg.p2(q6Var9.getContext(), (qg.p2) jVar6, P0);
                                            p2Var.setDelegate(q6Var9);
                                            j6Var2.addView(p2Var);
                                            q6Var9.f0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof qg.w2) {
                                            qg.w2 w2Var2 = new qg.w2(q6Var9.getContext(), (qg.w2) jVar6, P0);
                                            w2Var2.setDelegate(q6Var9);
                                            w2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(w2Var2, w7.x5.d(-2.0f, -2));
                                            q6Var9.f0();
                                            w2Var = w2Var2;
                                        }
                                        q6Var9.A0(w2Var);
                                        q6Var9.C0(null, true);
                                        q6Var9.d0(w2Var);
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
                    int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, d6Var);
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
                    childAt.setBackground(org.telegram.ui.ActionBar.i6.b0(w02, i10, i11, i12, i14));
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
