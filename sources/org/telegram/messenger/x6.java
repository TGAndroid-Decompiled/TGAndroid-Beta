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
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
public final class x6 {
    public static volatile x6[] f27465g = new x6[4];
    public static final Object[] h = new Object[4];
    public static org.telegram.ui.ActionBar.t1 f27466i;
    public final int f27467a;
    public final LongSparseArray f27468b = new LongSparseArray();
    public final LongSparseArray f27469c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a f27470e = new a(this, 7);
    public boolean f27471f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public x6(int i7) {
        this.f27467a = i7;
    }

    public static x6 b(int i7) {
        x6 x6Var;
        x6 x6Var2 = f27465g[i7];
        if (x6Var2 == null) {
            synchronized (h[i7]) {
                try {
                    x6Var = f27465g[i7];
                    if (x6Var == null) {
                        x6[] x6VarArr = f27465g;
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

    public final void a(gj gjVar, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (TextUtils.isEmpty(tL_textWithEntities.text)) {
            if (z10) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = np.s1(this.f27467a).j1(gj.B0(gjVar.f23819k));
            tL_deleteFactCheck.msg_id = gjVar.e1();
            tL_editFactCheck = tL_deleteFactCheck;
        } else {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = np.s1(this.f27467a).j1(gj.B0(gjVar.f23819k));
            tL_editFactCheck2.msg_id = gjVar.e1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = t0.f26609b;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        t1Var.r(320L);
        ConnectionsManager.getInstance(this.f27467a).sendRequest(tL_editFactCheck, new di.f3(this, tL_textWithEntities, z10, t1Var, 2));
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, gj gjVar) {
        final View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        Activity W = g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        TextView[] textViewArr = new TextView[1];
        if (gjVar != null && (message = gjVar.f23819k) != null && message.factcheck != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        String M0 = hd.M0(2131750852, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
        t1Var.S = M0;
        int i7 = this.f27467a;
        int i10 = np.s1(i7).R5;
        final t6 t6Var = new t6(activity, e6Var, i10, e6Var);
        t6Var.f32539s0 = true;
        boolean z12 = z11;
        t6Var.setOnEditorActionListener(new u6(this, t6Var, i10, gjVar, z12, t1VarArr, view));
        si.b0(i7).M(g0.G0(), true);
        t6Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(t6Var, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        org.telegram.ui.ActionBar.q6.l(t6Var, 34, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        t6Var.setHintText(hd.M0(2131750849, null));
        t6Var.setFocusable(true);
        t6Var.setInputType(147457);
        org.telegram.ui.ActionBar.q6.F(t6Var, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, e6Var);
        t6Var.setImeOptions(6);
        t6Var.setBackgroundDrawable(null);
        t6Var.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TLRPC.TL_factCheck R0 = gjVar.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            gj.b(valueOf, R0.text.entities, false, true, false, false, 0);
            t6Var.setText(valueOf);
        }
        t6Var.addTextChangedListener(new v6(i10, t6Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(t6Var, c8.ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.c();
        alertDialog$Builder2.o(linearLayout);
        t1Var.f29614a = g0.L(292.0f);
        alertDialog$Builder2.k(hd.M0(2131751354, null), new r6(this, t6Var, i10, gjVar, z12));
        alertDialog$Builder2.h(hd.M0(2131752589, "Cancel"), new n2.a0(19));
        if (z10) {
            f27466i = t1Var;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f27466i = null;
                            view.requestFocus();
                            return;
                        default:
                            g0.v1((t6) view);
                            return;
                    }
                }
            });
            f27466i.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            t6 t6Var2 = t6Var;
                            t6Var2.requestFocus();
                            g0.J3(t6Var2);
                            return;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.J3(t6Var3);
                            return;
                    }
                }
            });
            f27466i.r(250L);
        } else {
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            x6.f27466i = null;
                            t6Var.requestFocus();
                            return;
                        default:
                            g0.v1((t6) t6Var);
                            return;
                    }
                }
            });
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            t6 t6Var2 = t6Var;
                            t6Var2.requestFocus();
                            g0.J3(t6Var2);
                            return;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.J3(t6Var3);
                            return;
                    }
                }
            });
            t1VarArr[0].show();
        }
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.f29639k0 = false;
        View d = t1Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        t6Var.setSelection(t6Var.getText().length());
    }
}
