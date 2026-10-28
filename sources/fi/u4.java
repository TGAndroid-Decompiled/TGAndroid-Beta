package fi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kb1;
public final class u4 implements Runnable {
    public final int f11748a;
    public final e6 f11749b;
    public final sg.j f11750c;

    public u4(e6 e6Var, sg.j jVar, int i10) {
        this.f11748a = i10;
        this.f11749b = e6Var;
        this.f11750c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f11748a) {
            case 0:
                this.f11749b.z0(this.f11750c);
                return;
            default:
                final e6 e6Var = this.f11749b;
                y5 y5Var = e6Var.G0;
                h5 h5Var = e6Var.D1;
                s5 s5Var = e6Var.f10818v1;
                LinearLayout linearLayout = new LinearLayout(e6Var.getContext());
                linearLayout.setOrientation(0);
                final sg.j jVar = this.f11750c;
                boolean z10 = jVar instanceof sg.f1;
                if (!z10) {
                    TextView textView = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.E8, s5Var);
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
                            sg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    sg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof sg.c2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    sg.j jVar3 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar4 = jVar;
                                    e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.q0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    sg.j jVar5 = jVar;
                                    if (jVar5 instanceof sg.p2) {
                                        ((sg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.b2) {
                                        ((sg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.c2) {
                                        sg.c2 c2Var = (sg.c2) jVar5;
                                        c2Var.f48205r0 = !c2Var.f48205r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((sg.y1) jVar5).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = e6Var9.N0(jVar6);
                                        if (jVar6 instanceof sg.p2) {
                                            sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                            p2Var.setDelegate(e6Var9);
                                            y5Var2.addView(p2Var);
                                            e6Var9.d0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof sg.w2) {
                                            sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                            w2Var2.setDelegate(e6Var9);
                                            w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            w2Var = w2Var2;
                                        }
                                        e6Var9.y0(w2Var);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, kb1.r(-2, 44));
                }
                if (jVar instanceof sg.w2) {
                    TextView textView2 = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.E8, s5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((h5Var.c() && !h5Var.d) || e6Var.f10794i2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                sg.w2 w2Var;
                                switch (r3) {
                                    case 0:
                                        sg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof sg.c2;
                                        e6 e6Var2 = e6Var;
                                        if (z11) {
                                            ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                            if (ibVar != null) {
                                                ibVar.B();
                                            }
                                        } else {
                                            e6Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            e6Var2.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        sg.j jVar3 = jVar;
                                        e6 e6Var3 = e6Var;
                                        e6Var3.getClass();
                                        try {
                                            ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            e6Var3.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        e6 e6Var4 = e6Var;
                                        e6Var4.A0(jVar, true);
                                        e6Var4.o0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            e6Var4.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        e6 e6Var5 = e6Var;
                                        e6Var5.A0(null, true);
                                        sg.j jVar4 = jVar;
                                        e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            e6Var5.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        e6 e6Var6 = e6Var;
                                        e6Var6.A0(null, true);
                                        e6Var6.H0((sg.q0) jVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            e6Var6.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        sg.j jVar5 = jVar;
                                        if (jVar5 instanceof sg.p2) {
                                            ((sg.p2) jVar5).r(true);
                                        } else if (jVar5 instanceof sg.b2) {
                                            ((sg.b2) jVar5).r(true);
                                        } else if (jVar5 instanceof sg.c2) {
                                            sg.c2 c2Var = (sg.c2) jVar5;
                                            c2Var.f48205r0 = !c2Var.f48205r0;
                                            c2Var.invalidate();
                                        } else {
                                            ((sg.y1) jVar5).r(true);
                                        }
                                        e6 e6Var7 = e6Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            e6Var7.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        e6 e6Var8 = e6Var;
                                        e6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            e6Var8.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        e6 e6Var9 = e6Var;
                                        y5 y5Var2 = e6Var9.G0;
                                        sg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = e6Var9.N0(jVar6);
                                            if (jVar6 instanceof sg.p2) {
                                                sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                                p2Var.setDelegate(e6Var9);
                                                y5Var2.addView(p2Var);
                                                e6Var9.d0();
                                                w2Var = p2Var;
                                            } else if (jVar6 instanceof sg.w2) {
                                                sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                                w2Var2.setDelegate(e6Var9);
                                                w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                                y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                                e6Var9.d0();
                                                w2Var = w2Var2;
                                            }
                                            e6Var9.y0(w2Var);
                                            e6Var9.A0(null, true);
                                            e6Var9.b0(w2Var);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            e6Var9.f10820w1.d(true);
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
                                sg.w2 w2Var;
                                switch (r3) {
                                    case 0:
                                        sg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof sg.c2;
                                        e6 e6Var2 = e6Var;
                                        if (z11) {
                                            ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                            if (ibVar != null) {
                                                ibVar.B();
                                            }
                                        } else {
                                            e6Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            e6Var2.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        sg.j jVar3 = jVar;
                                        e6 e6Var3 = e6Var;
                                        e6Var3.getClass();
                                        try {
                                            ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            e6Var3.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        e6 e6Var4 = e6Var;
                                        e6Var4.A0(jVar, true);
                                        e6Var4.o0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            e6Var4.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        e6 e6Var5 = e6Var;
                                        e6Var5.A0(null, true);
                                        sg.j jVar4 = jVar;
                                        e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            e6Var5.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        e6 e6Var6 = e6Var;
                                        e6Var6.A0(null, true);
                                        e6Var6.H0((sg.q0) jVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            e6Var6.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        sg.j jVar5 = jVar;
                                        if (jVar5 instanceof sg.p2) {
                                            ((sg.p2) jVar5).r(true);
                                        } else if (jVar5 instanceof sg.b2) {
                                            ((sg.b2) jVar5).r(true);
                                        } else if (jVar5 instanceof sg.c2) {
                                            sg.c2 c2Var = (sg.c2) jVar5;
                                            c2Var.f48205r0 = !c2Var.f48205r0;
                                            c2Var.invalidate();
                                        } else {
                                            ((sg.y1) jVar5).r(true);
                                        }
                                        e6 e6Var7 = e6Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            e6Var7.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        e6 e6Var8 = e6Var;
                                        e6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            e6Var8.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        e6 e6Var9 = e6Var;
                                        y5 y5Var2 = e6Var9.G0;
                                        sg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = e6Var9.N0(jVar6);
                                            if (jVar6 instanceof sg.p2) {
                                                sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                                p2Var.setDelegate(e6Var9);
                                                y5Var2.addView(p2Var);
                                                e6Var9.d0();
                                                w2Var = p2Var;
                                            } else if (jVar6 instanceof sg.w2) {
                                                sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                                w2Var2.setDelegate(e6Var9);
                                                w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                                y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                                e6Var9.d0();
                                                w2Var = w2Var2;
                                            }
                                            e6Var9.y0(w2Var);
                                            e6Var9.A0(null, true);
                                            e6Var9.b0(w2Var);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            e6Var9.f10820w1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, kb1.r(-2, 44));
                } else if (jVar instanceof sg.t0) {
                    TextView e02 = e6Var.e0(1, LocaleController.getString(R.string.PaintEdit));
                    e02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            sg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    sg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof sg.c2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    sg.j jVar3 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar4 = jVar;
                                    e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.q0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    sg.j jVar5 = jVar;
                                    if (jVar5 instanceof sg.p2) {
                                        ((sg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.b2) {
                                        ((sg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.c2) {
                                        sg.c2 c2Var = (sg.c2) jVar5;
                                        c2Var.f48205r0 = !c2Var.f48205r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((sg.y1) jVar5).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = e6Var9.N0(jVar6);
                                        if (jVar6 instanceof sg.p2) {
                                            sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                            p2Var.setDelegate(e6Var9);
                                            y5Var2.addView(p2Var);
                                            e6Var9.d0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof sg.w2) {
                                            sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                            w2Var2.setDelegate(e6Var9);
                                            w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            w2Var = w2Var2;
                                        }
                                        e6Var9.y0(w2Var);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e02, kb1.r(-2, 44));
                } else if (jVar instanceof sg.q0) {
                    TextView e03 = e6Var.e0(1, LocaleController.getString(R.string.PaintEdit));
                    e03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            sg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    sg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof sg.c2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    sg.j jVar3 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar4 = jVar;
                                    e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.q0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    sg.j jVar5 = jVar;
                                    if (jVar5 instanceof sg.p2) {
                                        ((sg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.b2) {
                                        ((sg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.c2) {
                                        sg.c2 c2Var = (sg.c2) jVar5;
                                        c2Var.f48205r0 = !c2Var.f48205r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((sg.y1) jVar5).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = e6Var9.N0(jVar6);
                                        if (jVar6 instanceof sg.p2) {
                                            sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                            p2Var.setDelegate(e6Var9);
                                            y5Var2.addView(p2Var);
                                            e6Var9.d0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof sg.w2) {
                                            sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                            w2Var2.setDelegate(e6Var9);
                                            w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            w2Var = w2Var2;
                                        }
                                        e6Var9.y0(w2Var);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e03, kb1.r(-2, 44));
                }
                if ((jVar instanceof sg.p2) || (jVar instanceof sg.c2) || (jVar instanceof sg.y1) || (jVar instanceof sg.b2)) {
                    TextView e04 = e6Var.e0(4, LocaleController.getString(R.string.Flip));
                    e04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            sg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    sg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof sg.c2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    sg.j jVar3 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar4 = jVar;
                                    e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.q0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    sg.j jVar5 = jVar;
                                    if (jVar5 instanceof sg.p2) {
                                        ((sg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.b2) {
                                        ((sg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.c2) {
                                        sg.c2 c2Var = (sg.c2) jVar5;
                                        c2Var.f48205r0 = !c2Var.f48205r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((sg.y1) jVar5).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = e6Var9.N0(jVar6);
                                        if (jVar6 instanceof sg.p2) {
                                            sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                            p2Var.setDelegate(e6Var9);
                                            y5Var2.addView(p2Var);
                                            e6Var9.d0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof sg.w2) {
                                            sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                            w2Var2.setDelegate(e6Var9);
                                            w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            w2Var = w2Var2;
                                        }
                                        e6Var9.y0(w2Var);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e04, kb1.r(-2, 44));
                }
                boolean z11 = jVar instanceof sg.y1;
                if (y5Var.indexOfChild(jVar) != y5Var.getChildCount() - 1 && !(jVar instanceof sg.b2)) {
                    TextView textView3 = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.E8, s5Var);
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
                            sg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    sg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof sg.c2;
                                    e6 e6Var2 = e6Var;
                                    if (z112) {
                                        ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    sg.j jVar3 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar4 = jVar;
                                    e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.q0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    sg.j jVar5 = jVar;
                                    if (jVar5 instanceof sg.p2) {
                                        ((sg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.b2) {
                                        ((sg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.c2) {
                                        sg.c2 c2Var = (sg.c2) jVar5;
                                        c2Var.f48205r0 = !c2Var.f48205r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((sg.y1) jVar5).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = e6Var9.N0(jVar6);
                                        if (jVar6 instanceof sg.p2) {
                                            sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                            p2Var.setDelegate(e6Var9);
                                            y5Var2.addView(p2Var);
                                            e6Var9.d0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof sg.w2) {
                                            sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                            w2Var2.setDelegate(e6Var9);
                                            w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            w2Var = w2Var2;
                                        }
                                        e6Var9.y0(w2Var);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, kb1.r(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof sg.c2) && !(jVar instanceof sg.t0) && !(jVar instanceof sg.x2) && !(jVar instanceof sg.q0) && !(jVar instanceof sg.b2)) {
                    TextView textView4 = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.E8, s5Var);
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
                            sg.w2 w2Var;
                            switch (r3) {
                                case 0:
                                    sg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof sg.c2;
                                    e6 e6Var2 = e6Var;
                                    if (z112) {
                                        ib ibVar = ((ta) e6Var2).f11724p2.f11613c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.f10820w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    sg.j jVar3 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.w2) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.f10820w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.f10820w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar4 = jVar;
                                    e6Var5.I0((sg.t0) jVar4, new bi.m5(6, e6Var5, jVar4));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.f10820w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.q0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.f10820w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    sg.j jVar5 = jVar;
                                    if (jVar5 instanceof sg.p2) {
                                        ((sg.p2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.b2) {
                                        ((sg.b2) jVar5).r(true);
                                    } else if (jVar5 instanceof sg.c2) {
                                        sg.c2 c2Var = (sg.c2) jVar5;
                                        c2Var.f48205r0 = !c2Var.f48205r0;
                                        c2Var.invalidate();
                                    } else {
                                        ((sg.y1) jVar5).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.f10820w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.f10820w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = e6Var9.N0(jVar6);
                                        if (jVar6 instanceof sg.p2) {
                                            sg.j p2Var = new sg.p2(e6Var9.getContext(), (sg.p2) jVar6, N0);
                                            p2Var.setDelegate(e6Var9);
                                            y5Var2.addView(p2Var);
                                            e6Var9.d0();
                                            w2Var = p2Var;
                                        } else if (jVar6 instanceof sg.w2) {
                                            sg.w2 w2Var2 = new sg.w2(e6Var9.getContext(), (sg.w2) jVar6, N0);
                                            w2Var2.setDelegate(e6Var9);
                                            w2Var2.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(w2Var2, kb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            w2Var = w2Var2;
                                        }
                                        e6Var9.y0(w2Var);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(w2Var);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.f10820w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.f10820w1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, kb1.r(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int i14 = org.telegram.ui.ActionBar.y6.f23449i6;
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i14, s5Var);
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
                    org.telegram.ui.ActionBar.f7.R(childAt, org.telegram.ui.ActionBar.y6.b0(w02, i10, i11, i12, i15), null, org.telegram.ui.ActionBar.f7.N(i14), s5Var);
                }
                e6Var.f10822x1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
