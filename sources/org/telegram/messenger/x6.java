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
import org.telegram.ui.Components.tt0;
import org.telegram.ui.LaunchActivity;
public final class x6 {
    public static volatile x6[] f26444g = new x6[4];
    public static final Object[] h = new Object[4];
    public static org.telegram.ui.ActionBar.u1 f26445i;
    public final int f26446a;
    public final LongSparseArray f26447b = new LongSparseArray();
    public final LongSparseArray f26448c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a f26449e = new a(this, 7);
    public boolean f26450f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public x6(int i7) {
        this.f26446a = i7;
    }

    public static x6 b(int i7) {
        x6 x6Var;
        x6 x6Var2 = f26444g[i7];
        if (x6Var2 == null) {
            synchronized (h[i7]) {
                try {
                    x6Var = f26444g[i7];
                    if (x6Var == null) {
                        x6[] x6VarArr = f26444g;
                        x6 x6Var3 = new x6(i7);
                        x6VarArr[i7] = x6Var3;
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

    public final void a(ij ijVar, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (TextUtils.isEmpty(tL_textWithEntities.text)) {
            if (z9) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = qp.s1(this.f26446a).j1(ij.B0(ijVar.f23262k));
            tL_deleteFactCheck.msg_id = ijVar.e1();
            tL_editFactCheck = tL_deleteFactCheck;
        } else {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = qp.s1(this.f26446a).j1(ij.B0(ijVar.f23262k));
            tL_editFactCheck2.msg_id = ijVar.e1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        }
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = t0.f25566b;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        u1Var.r(320L);
        ConnectionsManager.getInstance(this.f26446a).sendRequest(tL_editFactCheck, new bi.d4(this, tL_textWithEntities, z9, u1Var, 2));
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ij ijVar) {
        final View view;
        boolean z9;
        AlertDialog$Builder alertDialog$Builder;
        boolean z10;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        Activity W = g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof tt0) && ((tt0) Q.getFragmentView()).Q() > g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, g6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        TextView[] textViewArr = new TextView[1];
        if (ijVar != null && (message = ijVar.f23262k) != null && message.factcheck != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        String M0 = id.M0(2131750852, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27296a;
        u1Var.R = M0;
        int i7 = this.f26446a;
        int i10 = qp.s1(i7).Q5;
        final t6 t6Var = new t6(activity, g6Var, i10, g6Var);
        t6Var.f31366r0 = true;
        boolean z11 = z10;
        t6Var.setOnEditorActionListener(new u6(this, t6Var, i10, ijVar, z11, u1VarArr, view));
        ui.b0(i7).M(g0.G0(), true);
        t6Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.s6.U(t6Var, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
        org.telegram.ui.ActionBar.s6.l(t6Var, 34, org.telegram.ui.ActionBar.l6.Li, g6Var);
        t6Var.setHintText(id.M0(2131750849, null));
        t6Var.setFocusable(true);
        t6Var.setInputType(147457);
        org.telegram.ui.ActionBar.s6.F(t6Var, org.telegram.ui.ActionBar.l6.f27994k6, org.telegram.ui.ActionBar.l6.f28012l6, org.telegram.ui.ActionBar.l6.f28086p7, g6Var);
        t6Var.setImeOptions(6);
        t6Var.setBackgroundDrawable(null);
        t6Var.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TLRPC.TL_factCheck R0 = ijVar.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            ij.b(valueOf, R0.text.entities, false, true, false, false, 0);
            t6Var.setText(valueOf);
        }
        t6Var.addTextChangedListener(new v6(i10, t6Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(t6Var, c8.ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.c();
        alertDialog$Builder2.o(linearLayout);
        u1Var.f28542a = g0.L(292.0f);
        alertDialog$Builder2.k(id.M0(2131751354, null), new r6(this, t6Var, i10, ijVar, z11));
        alertDialog$Builder2.h(id.M0(2131752589, "Cancel"), new ni.a(15));
        if (z9) {
            f26445i = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f26445i = null;
                            view.requestFocus();
                            return;
                        default:
                            g0.v1((t6) view);
                            return;
                    }
                }
            });
            f26445i.setOnShowListener(new DialogInterface.OnShowListener() {
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
            f26445i.r(250L);
        } else {
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f26445i = null;
                            t6Var.requestFocus();
                            return;
                        default:
                            g0.v1((t6) t6Var);
                            return;
                    }
                }
            });
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
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
            u1VarArr[0].show();
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.f28565j0 = false;
        View d = u1Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        t6Var.setSelection(t6Var.getText().length());
    }
}
