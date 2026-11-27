package defpackage;

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class q84 {
    public static volatile q84[] g = new q84[4];
    public static final Object[] h = new Object[4];
    public static id i;
    public final int a;
    public final LongSparseArray b = new LongSparseArray();
    public final LongSparseArray c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final lw3 e = new lw3(this, (byte) 12);
    public boolean f;

    static {
        for (int i2 = 0; i2 < 4; i2++) {
            h[i2] = new Object();
        }
    }

    public q84(int i2) {
        this.a = i2;
    }

    public static q84 b(int i2) {
        q84 q84Var;
        q84 q84Var2 = g[i2];
        if (q84Var2 == null) {
            synchronized (h[i2]) {
                q84Var = g[i2];
                if (q84Var == null) {
                    q84[] q84VarArr = g;
                    q84 q84Var3 = new q84(i2);
                    q84VarArr[i2] = q84Var3;
                    q84Var = q84Var3;
                }
            }
            return q84Var;
        }
        return q84Var2;
    }

    public final void a(r47 r47Var, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (TextUtils.isEmpty(tL_textWithEntities.text)) {
            if (z) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = uc7.s1(this.a).j1(r47.B0(r47Var.k));
            tL_deleteFactCheck.msg_id = r47Var.e1();
            tL_editFactCheck = tL_deleteFactCheck;
        } else {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = uc7.s1(this.a).j1(r47.B0(r47Var.k));
            tL_editFactCheck2.msg_id = r47Var.e1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        id idVar = new id(3, null, context);
        idVar.q(320L);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_editFactCheck, new si1(this, tL_textWithEntities, z, idVar, (byte) 6));
    }

    public final void c(Activity activity, vnb vnbVar, r47 r47Var) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        boolean z2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        e Q = LaunchActivity.Q();
        Activity W = hl.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof wma) && ((wma) Q.getFragmentView()).Q() > hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        id[] idVarArr = new id[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        TextView[] textViewArr = new TextView[1];
        if (r47Var != null && (message = r47Var.k) != null && message.factcheck != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        String M0 = ob6.M0(2131750817, null);
        id idVar = alertDialog$Builder2.a;
        idVar.S = M0;
        int i2 = this.a;
        int f = uc7.s1(i2).k4.e3.f();
        final m84 m84Var = new m84(activity, vnbVar, f, vnbVar);
        m84Var.s0 = true;
        boolean z3 = z2;
        m84Var.setOnEditorActionListener(new n84(this, m84Var, f, r47Var, z3, idVarArr, view));
        ls6.d0(i2).O(hl.F0(), true);
        m84Var.setTextSize(1, 18.0f);
        yob.X(m84Var, aob.j5, vnbVar);
        yob.l(m84Var, 34, aob.Oi, vnbVar);
        m84Var.setHintText(ob6.M0(2131750814, null));
        m84Var.setFocusable(true);
        m84Var.setInputType(147457);
        yob.F(m84Var, aob.k6, aob.l6, aob.p7, vnbVar);
        m84Var.setImeOptions(6);
        m84Var.setBackgroundDrawable(null);
        m84Var.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        TLRPC.TL_factCheck R0 = r47Var.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            r47.b(valueOf, R0.text.entities, false, true, false, false, 0);
            m84Var.setText(valueOf);
        }
        m84Var.addTextChangedListener(new o84(f, m84Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(m84Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.b();
        alertDialog$Builder2.n(linearLayout);
        idVar.a = hl.L(292.0f);
        alertDialog$Builder2.j(ob6.M0(2131751319, null), new tu1(this, m84Var, f, r47Var, z3));
        alertDialog$Builder2.g(ob6.M0(2131752570, "Cancel"), new su3((byte) 18));
        if (z) {
            i = idVar;
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new i41(view, (byte) 1));
            i.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    m84 m84Var2 = m84Var;
                    switch (b) {
                        case 0:
                            m84Var2.requestFocus();
                            hl.E3(m84Var2);
                            return;
                        default:
                            m84Var2.requestFocus();
                            hl.E3(m84Var2);
                            return;
                    }
                }
            });
            i.q(250L);
        } else {
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new o1(m84Var, (byte) 20));
            idVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    m84 m84Var2 = m84Var;
                    switch (b) {
                        case 0:
                            m84Var2.requestFocus();
                            hl.E3(m84Var2);
                            return;
                        default:
                            m84Var2.requestFocus();
                            hl.E3(m84Var2);
                            return;
                    }
                }
            });
            idVarArr[0].show();
        }
        id idVar2 = idVarArr[0];
        idVar2.k0 = false;
        View c = idVar2.c(-1);
        if (c instanceof TextView) {
            textViewArr[0] = (TextView) c;
        }
        m84Var.setSelection(m84Var.getText().length());
    }
}
