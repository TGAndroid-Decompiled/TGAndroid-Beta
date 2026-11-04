package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.LaunchActivity;
public final class x6 {
    public static volatile x6[] f26345g = new x6[4];
    public static final Object[] h = new Object[4];
    public static org.telegram.ui.ActionBar.s1 f26346i;
    public final int f26347a;
    public final LongSparseArray f26348b = new LongSparseArray();
    public final LongSparseArray f26349c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a f26350e = new a(this, 7);
    public boolean f26351f;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            h[i3] = new Object();
        }
    }

    public x6(int i3) {
        this.f26347a = i3;
    }

    public static x6 b(int i3) {
        x6 x6Var;
        x6 x6Var2 = f26345g[i3];
        if (x6Var2 == null) {
            synchronized (h[i3]) {
                try {
                    x6Var = f26345g[i3];
                    if (x6Var == null) {
                        x6[] x6VarArr = f26345g;
                        x6 x6Var3 = new x6(i3);
                        x6VarArr[i3] = x6Var3;
                        x6Var = x6Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return x6Var;
        }
        return x6Var2;
    }

    public final void a(zi ziVar, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (TextUtils.isEmpty(tL_textWithEntities.text)) {
            if (z10) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = hp.s1(this.f26347a).j1(zi.B0(ziVar.f26868k));
            tL_deleteFactCheck.msg_id = ziVar.f1();
            tL_editFactCheck = tL_deleteFactCheck;
        } else {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = hp.s1(this.f26347a).j1(zi.B0(ziVar.f26868k));
            tL_editFactCheck2.msg_id = ziVar.f1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        }
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = t0.f25457b;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        s1Var.r(320L);
        ConnectionsManager.getInstance(this.f26347a).sendRequest(tL_editFactCheck, new ci.o3(this, tL_textWithEntities, z10, s1Var, 2));
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, zi ziVar) {
        final View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        Activity W = g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof qt0) && ((qt0) Q.getFragmentView()).Q() > g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        TextView[] textViewArr = new TextView[1];
        if (ziVar != null && (message = ziVar.f26868k) != null && message.factcheck != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        String M0 = bd.M0(2131750853, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
        s1Var.S = M0;
        int i3 = this.f26347a;
        int i10 = hp.s1(i3).Q5;
        final t6 t6Var = new t6(activity, e6Var, i10, e6Var);
        t6Var.f31433s0 = true;
        boolean z12 = z11;
        t6Var.setOnEditorActionListener(new u6(this, t6Var, i10, ziVar, z12, s1VarArr, view));
        li.b0(i3).M(g0.G0(), true);
        t6Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(t6Var, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        org.telegram.ui.ActionBar.r6.m(t6Var, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        t6Var.setHintText(bd.M0(2131750850, null));
        t6Var.setFocusable(true);
        t6Var.setInputType(147457);
        org.telegram.ui.ActionBar.r6.G(t6Var, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, e6Var);
        t6Var.setImeOptions(6);
        t6Var.setBackgroundDrawable(null);
        t6Var.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TLRPC.TL_factCheck R0 = ziVar.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            zi.b(valueOf, R0.text.entities, false, true, false, false, 0);
            t6Var.setText(valueOf);
        }
        t6Var.addTextChangedListener(new v6(i10, t6Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(t6Var, b8.mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.c();
        alertDialog$Builder2.o(linearLayout);
        s1Var.f28523a = g0.L(292.0f);
        alertDialog$Builder2.k(bd.M0(2131751355, null), new r6(this, t6Var, i10, ziVar, z12));
        alertDialog$Builder2.h(bd.M0(2131752589, "Cancel"), new o4.v0(12));
        if (z10) {
            f26346i = s1Var;
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f26346i = null;
                            view.requestFocus();
                            return;
                        default:
                            g0.v1((t6) view);
                            return;
                    }
                }
            });
            f26346i.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            t6 t6Var2 = t6Var;
                            t6Var2.requestFocus();
                            g0.K3(t6Var2);
                            return;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.K3(t6Var3);
                            return;
                    }
                }
            });
            f26346i.r(250L);
        } else {
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f26346i = null;
                            t6Var.requestFocus();
                            return;
                        default:
                            g0.v1((t6) t6Var);
                            return;
                    }
                }
            });
            s1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            t6 t6Var2 = t6Var;
                            t6Var2.requestFocus();
                            g0.K3(t6Var2);
                            return;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.K3(t6Var3);
                            return;
                    }
                }
            });
            s1VarArr[0].show();
        }
        org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
        s1Var2.f28548k0 = false;
        View d = s1Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        t6Var.setSelection(t6Var.getText().length());
    }
}
