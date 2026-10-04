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
    public final int f5018a;
    public final q6 f5019b;
    public final qg.j f5020c;

    public e5(q6 q6Var, qg.j jVar, int i10) {
        this.f5018a = i10;
        this.f5019b = q6Var;
        this.f5020c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f5018a) {
            case 0:
                this.f5019b.C0(this.f5020c);
                return;
            default:
                final q6 q6Var = this.f5019b;
                j6 j6Var = q6Var.R0;
                s5 s5Var = q6Var.O1;
                d6 d6Var = q6Var.G1;
                LinearLayout linearLayout = new LinearLayout(q6Var.getContext());
                linearLayout.setOrientation(0);
                final qg.j jVar = this.f5020c;
                boolean z10 = jVar instanceof qg.e1;
                if (!z10) {
                    TextView textView = new TextView(q6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var));
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
                            qg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        ac acVar = ((mb) q6Var2).A2.f5383c1;
                                        if (acVar != null) {
                                            acVar.B();
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
                                        ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.o2) {
                                        ((qg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f44985r0 = !b2Var.f44985r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
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
                                        if (jVar6 instanceof qg.o2) {
                                            qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                            o2Var.setDelegate(q6Var9);
                                            j6Var2.addView(o2Var);
                                            q6Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof qg.v2) {
                                            qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(q6Var9);
                                            v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        q6Var9.B0(v2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(v2Var);
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
                    linearLayout.addView(textView, w7.z5.n(-2, 44));
                }
                if (jVar instanceof qg.v2) {
                    TextView textView2 = new TextView(q6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((s5Var.c() && !s5Var.d) || q6Var.f5783t2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                qg.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.b2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            ac acVar = ((mb) q6Var2).A2.f5383c1;
                                            if (acVar != null) {
                                                acVar.B();
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
                                            ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                        q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.D0(null, true);
                                        q6Var6.K0((qg.q0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.o2) {
                                            ((qg.o2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.a2) {
                                            ((qg.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.b2) {
                                            qg.b2 b2Var = (qg.b2) jVar5;
                                            b2Var.f44985r0 = !b2Var.f44985r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((qg.x1) jVar5).r(true);
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
                                            if (jVar6 instanceof qg.o2) {
                                                qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                                o2Var.setDelegate(q6Var9);
                                                j6Var2.addView(o2Var);
                                                q6Var9.g0();
                                                v2Var = o2Var;
                                            } else if (jVar6 instanceof qg.v2) {
                                                qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                                v2Var2.setDelegate(q6Var9);
                                                v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                                q6Var9.g0();
                                                v2Var = v2Var2;
                                            }
                                            q6Var9.B0(v2Var);
                                            q6Var9.D0(null, true);
                                            q6Var9.d0(v2Var);
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
                                qg.v2 v2Var;
                                switch (r3) {
                                    case 0:
                                        qg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof qg.b2;
                                        q6 q6Var2 = q6Var;
                                        if (z11) {
                                            ac acVar = ((mb) q6Var2).A2.f5383c1;
                                            if (acVar != null) {
                                                acVar.B();
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
                                            ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                        q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            q6Var5.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        q6 q6Var6 = q6Var;
                                        q6Var6.D0(null, true);
                                        q6Var6.K0((qg.q0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            q6Var6.H1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        qg.j jVar5 = jVar;
                                        if (jVar5 instanceof qg.o2) {
                                            ((qg.o2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.a2) {
                                            ((qg.a2) jVar5).r(true);
                                        } else if (jVar5 instanceof qg.b2) {
                                            qg.b2 b2Var = (qg.b2) jVar5;
                                            b2Var.f44985r0 = !b2Var.f44985r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((qg.x1) jVar5).r(true);
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
                                            if (jVar6 instanceof qg.o2) {
                                                qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                                o2Var.setDelegate(q6Var9);
                                                j6Var2.addView(o2Var);
                                                q6Var9.g0();
                                                v2Var = o2Var;
                                            } else if (jVar6 instanceof qg.v2) {
                                                qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                                v2Var2.setDelegate(q6Var9);
                                                v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                                q6Var9.g0();
                                                v2Var = v2Var2;
                                            }
                                            q6Var9.B0(v2Var);
                                            q6Var9.D0(null, true);
                                            q6Var9.d0(v2Var);
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
                    linearLayout.addView(textView2, w7.z5.n(-2, 44));
                } else if (jVar instanceof qg.t0) {
                    TextView h02 = q6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        ac acVar = ((mb) q6Var2).A2.f5383c1;
                                        if (acVar != null) {
                                            acVar.B();
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
                                        ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.o2) {
                                        ((qg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f44985r0 = !b2Var.f44985r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
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
                                        if (jVar6 instanceof qg.o2) {
                                            qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                            o2Var.setDelegate(q6Var9);
                                            j6Var2.addView(o2Var);
                                            q6Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof qg.v2) {
                                            qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(q6Var9);
                                            v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        q6Var9.B0(v2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(v2Var);
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
                    linearLayout.addView(h02, w7.z5.n(-2, 44));
                } else if (jVar instanceof qg.q0) {
                    TextView h03 = q6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        ac acVar = ((mb) q6Var2).A2.f5383c1;
                                        if (acVar != null) {
                                            acVar.B();
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
                                        ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.o2) {
                                        ((qg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f44985r0 = !b2Var.f44985r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
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
                                        if (jVar6 instanceof qg.o2) {
                                            qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                            o2Var.setDelegate(q6Var9);
                                            j6Var2.addView(o2Var);
                                            q6Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof qg.v2) {
                                            qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(q6Var9);
                                            v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        q6Var9.B0(v2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(v2Var);
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
                    linearLayout.addView(h03, w7.z5.n(-2, 44));
                }
                if ((jVar instanceof qg.o2) || (jVar instanceof qg.b2) || (jVar instanceof qg.x1) || (jVar instanceof qg.a2)) {
                    TextView h04 = q6Var.h0(4, LocaleController.getString(R.string.Flip));
                    h04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            qg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof qg.b2;
                                    q6 q6Var2 = q6Var;
                                    if (z11) {
                                        ac acVar = ((mb) q6Var2).A2.f5383c1;
                                        if (acVar != null) {
                                            acVar.B();
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
                                        ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.o2) {
                                        ((qg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f44985r0 = !b2Var.f44985r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
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
                                        if (jVar6 instanceof qg.o2) {
                                            qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                            o2Var.setDelegate(q6Var9);
                                            j6Var2.addView(o2Var);
                                            q6Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof qg.v2) {
                                            qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(q6Var9);
                                            v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        q6Var9.B0(v2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(v2Var);
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
                    linearLayout.addView(h04, w7.z5.n(-2, 44));
                }
                boolean z11 = jVar instanceof qg.x1;
                if (j6Var.indexOfChild(jVar) != j6Var.getChildCount() - 1 && !(jVar instanceof qg.a2)) {
                    TextView textView3 = new TextView(q6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var));
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
                            qg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.b2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        ac acVar = ((mb) q6Var2).A2.f5383c1;
                                        if (acVar != null) {
                                            acVar.B();
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
                                        ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.o2) {
                                        ((qg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f44985r0 = !b2Var.f44985r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
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
                                        if (jVar6 instanceof qg.o2) {
                                            qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                            o2Var.setDelegate(q6Var9);
                                            j6Var2.addView(o2Var);
                                            q6Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof qg.v2) {
                                            qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(q6Var9);
                                            v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        q6Var9.B0(v2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(v2Var);
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
                    linearLayout.addView(textView3, w7.z5.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof qg.b2) && !(jVar instanceof qg.t0) && !(jVar instanceof qg.w2) && !(jVar instanceof qg.q0) && !(jVar instanceof qg.a2)) {
                    TextView textView4 = new TextView(q6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var));
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
                            qg.v2 v2Var;
                            switch (r3) {
                                case 0:
                                    qg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof qg.b2;
                                    q6 q6Var2 = q6Var;
                                    if (z112) {
                                        ac acVar = ((mb) q6Var2).A2.f5383c1;
                                        if (acVar != null) {
                                            acVar.B();
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
                                        ((qg.v2) jVar3).getEditText().onTextContextMenuItem(16908337);
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
                                    q6Var5.L0((qg.t0) jVar4, new ai.m0(2, q6Var5, jVar4));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = q6Var5.H1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        q6Var5.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    q6 q6Var6 = q6Var;
                                    q6Var6.D0(null, true);
                                    q6Var6.K0((qg.q0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = q6Var6.H1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        q6Var6.H1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    qg.j jVar5 = jVar;
                                    if (jVar5 instanceof qg.o2) {
                                        ((qg.o2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.a2) {
                                        ((qg.a2) jVar5).r(true);
                                    } else if (jVar5 instanceof qg.b2) {
                                        qg.b2 b2Var = (qg.b2) jVar5;
                                        b2Var.f44985r0 = !b2Var.f44985r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((qg.x1) jVar5).r(true);
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
                                        if (jVar6 instanceof qg.o2) {
                                            qg.j o2Var = new qg.o2(q6Var9.getContext(), (qg.o2) jVar6, Q0);
                                            o2Var.setDelegate(q6Var9);
                                            j6Var2.addView(o2Var);
                                            q6Var9.g0();
                                            v2Var = o2Var;
                                        } else if (jVar6 instanceof qg.v2) {
                                            qg.v2 v2Var2 = new qg.v2(q6Var9.getContext(), (qg.v2) jVar6, Q0);
                                            v2Var2.setDelegate(q6Var9);
                                            v2Var2.setMaxWidth(q6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j6Var2.addView(v2Var2, w7.z5.c(-2.0f, -2));
                                            q6Var9.g0();
                                            v2Var = v2Var2;
                                        }
                                        q6Var9.B0(v2Var);
                                        q6Var9.D0(null, true);
                                        q6Var9.d0(v2Var);
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
                    linearLayout.addView(textView4, w7.z5.n(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20913i6, d6Var);
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
                    childAt.setBackground(org.telegram.ui.ActionBar.i6.a0(v02, i10, i11, i12, i14));
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
