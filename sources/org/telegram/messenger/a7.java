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
import org.telegram.ui.Components.uu0;
import org.telegram.ui.LaunchActivity;
public final class a7 {
    public static volatile a7[] f14583g = new a7[4];
    public static final Object[] h = new Object[4];
    public static org.telegram.ui.ActionBar.x1 f14584i;
    public final int f14585a;
    public final LongSparseArray f14586b = new LongSparseArray();
    public final LongSparseArray f14587c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a e = new a(this, 7);
    public boolean f14588f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public a7(int i10) {
        this.f14585a = i10;
    }

    public static a7 b(int i10) {
        a7 a7Var;
        a7 a7Var2 = f14583g[i10];
        if (a7Var2 == null) {
            synchronized (h[i10]) {
                try {
                    a7Var = f14583g[i10];
                    if (a7Var == null) {
                        a7[] a7VarArr = f14583g;
                        a7 a7Var3 = new a7(i10);
                        a7VarArr[i10] = a7Var3;
                        a7Var = a7Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a7Var;
        }
        return a7Var2;
    }

    public final void a(jj jjVar, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (TextUtils.isEmpty(tL_textWithEntities.text)) {
            if (z10) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = vp.r1(this.f14585a).i1(jj.B0(jjVar.f16337k));
            tL_deleteFactCheck.msg_id = jjVar.f1();
            tL_editFactCheck = tL_deleteFactCheck;
        } else {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = vp.r1(this.f14585a).i1(jj.B0(jjVar.f16337k));
            tL_editFactCheck2.msg_id = jjVar.f1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        }
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = w0.f19025b;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        x1Var.r(320L);
        ConnectionsManager.getInstance(this.f14585a).sendRequest(tL_editFactCheck, new s6(this, tL_textWithEntities, z10, x1Var, 0));
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, jj jjVar) {
        final View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = i0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof uu0) && ((uu0) Q.getFragmentView()).Q() > i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        TextView[] textViewArr = new TextView[1];
        if (jjVar != null && (message = jjVar.f16337k) != null && message.factcheck != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        String L0 = cd.L0(2131750853, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20134a;
        x1Var.R = L0;
        int i10 = this.f14585a;
        int i11 = vp.r1(i10).R5;
        final w6 w6Var = new w6(activity, p6Var, i11, p6Var);
        w6Var.f24014r0 = true;
        boolean z12 = z11;
        w6Var.setOnEditorActionListener(new x6(this, w6Var, i11, jjVar, z12, x1VarArr, view));
        ui.b0(i10).M(i0.G0(), true);
        w6Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(w6Var, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        org.telegram.ui.ActionBar.a7.m(w6Var, 34, org.telegram.ui.ActionBar.t6.Li, p6Var);
        w6Var.setHintText(cd.L0(2131750850, null));
        w6Var.setFocusable(true);
        w6Var.setInputType(147457);
        org.telegram.ui.ActionBar.a7.G(w6Var, org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, p6Var);
        w6Var.setImeOptions(6);
        w6Var.setBackgroundDrawable(null);
        w6Var.setPadding(0, i0.L(6.0f), 0, i0.L(6.0f));
        TLRPC.TL_factCheck R0 = jjVar.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            jj.b(valueOf, R0.text.entities, false, true, false, false, 0);
            w6Var.setText(valueOf);
        }
        w6Var.addTextChangedListener(new y6(i11, w6Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(w6Var, w7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.c();
        alertDialog$Builder2.o(linearLayout);
        x1Var.f21468a = i0.L(292.0f);
        alertDialog$Builder2.k(cd.L0(2131751355, null), new u6(this, w6Var, i11, jjVar, z12));
        alertDialog$Builder2.h(cd.L0(2131752589, "Cancel"), new m4.v0(29));
        if (z10) {
            f14584i = x1Var;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            a7.f14584i = null;
                            view.requestFocus();
                            return;
                        default:
                            i0.v1((w6) view);
                            return;
                    }
                }
            });
            f14584i.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            w6 w6Var2 = w6Var;
                            w6Var2.requestFocus();
                            i0.J3(w6Var2);
                            return;
                        default:
                            w6 w6Var3 = w6Var;
                            w6Var3.requestFocus();
                            i0.J3(w6Var3);
                            return;
                    }
                }
            });
            f14584i.r(250L);
        } else {
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            a7.f14584i = null;
                            w6Var.requestFocus();
                            return;
                        default:
                            i0.v1((w6) w6Var);
                            return;
                    }
                }
            });
            x1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            w6 w6Var2 = w6Var;
                            w6Var2.requestFocus();
                            i0.J3(w6Var2);
                            return;
                        default:
                            w6 w6Var3 = w6Var;
                            w6Var3.requestFocus();
                            i0.J3(w6Var3);
                            return;
                    }
                }
            });
            x1VarArr[0].show();
        }
        org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
        x1Var2.f21490j0 = false;
        View d = x1Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        w6Var.setSelection(w6Var.getText().length());
    }
}
