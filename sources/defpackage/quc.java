package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class quc {
    public oh2 a;
    public he b;
    public TextView c;

    public static void a(Context context, qac qacVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = jb6.M0(2131743880, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        LinearLayout i = hg9.i(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        anb.X(textView, cmb.i5, null);
        textView.setTextSize(1, 14.0f);
        i.addView(textView, qoe.t(-1, -2, 0, 24, 0, 24, 0));
        oh2 oh2Var = new oh2(1, null, context);
        obj.a = oh2Var;
        oh2Var.getTextView().getLayoutParams().width = -1;
        obj.a.getTextView().setTextSize(1, 14.0f);
        i.addView(obj.a, qoe.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(gm.S2(jb6.M0(2131752872, null)));
        obj.a.e(gm.N2(jb6.M0(2131752873, null), -1, 0, new dh1(context, (byte) 28), null), "", false, false, false);
        alertDialog$Builder.n(i);
        alertDialog$Builder.j(jb6.M0(2131751708, null), new ai((byte) 1, qacVar, zArr));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 26));
        obj.b = heVar;
        heVar.show();
        TextView textView2 = (TextView) obj.b.c(-1);
        obj.c = textView2;
        textView2.setEnabled(false);
        obj.c.setAlpha(0.5f);
        obj.a.setOnClickListener(new kpc(obj, (byte) 3));
        obj.a.setBackground(cmb.f0(cmb.w0(null, cmb.h6, false), 7, -1));
        obj.b.setOnDismissListener(new vg(zArr, runnable));
    }
}
