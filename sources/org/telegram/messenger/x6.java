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
import org.telegram.ui.Components.au0;
import org.telegram.ui.LaunchActivity;
public final class x6 {
    public static volatile x6[] f27819g = new x6[4];
    public static final Object[] h = new Object[4];
    public static org.telegram.ui.ActionBar.u1 f27820i;
    public final int f27821a;
    public final LongSparseArray f27822b = new LongSparseArray();
    public final LongSparseArray f27823c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a f27824e = new a(this, 7);
    public boolean f27825f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public x6(int i7) {
        this.f27821a = i7;
    }

    public static x6 b(int i7) {
        x6 x6Var;
        x6 x6Var2 = f27819g[i7];
        if (x6Var2 == null) {
            synchronized (h[i7]) {
                try {
                    x6Var = f27819g[i7];
                    if (x6Var == null) {
                        x6[] x6VarArr = f27819g;
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

    public final void a(fj fjVar, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (TextUtils.isEmpty(tL_textWithEntities.text)) {
            if (z10) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = mp.u1(this.f27821a).l1(fj.B0(fjVar.f23965k));
            tL_deleteFactCheck.msg_id = fjVar.e1();
            tL_editFactCheck = tL_deleteFactCheck;
        } else {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = mp.u1(this.f27821a).l1(fj.B0(fjVar.f23965k));
            tL_editFactCheck2.msg_id = fjVar.e1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = t0.f26913b;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        u1Var.r(320L);
        ConnectionsManager.getInstance(this.f27821a).sendRequest(tL_editFactCheck, new di.j3(this, tL_textWithEntities, z10, u1Var, 2));
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, fj fjVar) {
        final View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        Activity W = g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof au0) && ((au0) Q.getFragmentView()).Q() > g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        TextView[] textViewArr = new TextView[1];
        if (fjVar != null && (message = fjVar.f23965k) != null && message.factcheck != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        String M0 = gd.M0(2131750841, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f28744a;
        u1Var.S = M0;
        int i7 = this.f27821a;
        int i10 = mp.u1(i7).T5;
        final t6 t6Var = new t6(activity, i6Var, i10, i6Var);
        t6Var.f32936s0 = true;
        boolean z12 = z11;
        t6Var.setOnEditorActionListener(new u6(this, t6Var, i10, fjVar, z12, u1VarArr, view));
        ri.d0(i7).O(g0.G0(), true);
        t6Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(t6Var, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        org.telegram.ui.ActionBar.u6.l(t6Var, 34, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        t6Var.setHintText(gd.M0(2131750838, null));
        t6Var.setFocusable(true);
        t6Var.setInputType(147457);
        org.telegram.ui.ActionBar.u6.F(t6Var, org.telegram.ui.ActionBar.n6.f29523k6, org.telegram.ui.ActionBar.n6.f29541l6, org.telegram.ui.ActionBar.n6.f29615p7, i6Var);
        t6Var.setImeOptions(6);
        t6Var.setBackgroundDrawable(null);
        t6Var.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TLRPC.TL_factCheck R0 = fjVar.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            fj.b(valueOf, R0.text.entities, false, true, false, false, 0);
            t6Var.setText(valueOf);
        }
        t6Var.addTextChangedListener(new v6(i10, t6Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(t6Var, c8.ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.c();
        alertDialog$Builder2.o(linearLayout);
        u1Var.f30024a = g0.L(292.0f);
        alertDialog$Builder2.k(gd.M0(2131751343, null), new r6(this, t6Var, i10, fjVar, z12));
        alertDialog$Builder2.h(gd.M0(2131752578, "Cancel"), new n2.a0(20));
        if (z10) {
            f27820i = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f27820i = null;
                            view.requestFocus();
                            return;
                        default:
                            g0.v1((t6) view);
                            return;
                    }
                }
            });
            f27820i.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            t6 t6Var2 = t6Var;
                            t6Var2.requestFocus();
                            g0.I3(t6Var2);
                            return;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.I3(t6Var3);
                            return;
                    }
                }
            });
            f27820i.r(250L);
        } else {
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f27820i = null;
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
                            g0.I3(t6Var2);
                            return;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.I3(t6Var3);
                            return;
                    }
                }
            });
            u1VarArr[0].show();
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.f30049k0 = false;
        View d = u1Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        t6Var.setSelection(t6Var.getText().length());
    }
}
