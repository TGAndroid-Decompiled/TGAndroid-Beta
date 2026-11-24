package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class psc {
    public ag2 a;
    public hd b;
    public TextView c;

    public static void a(Context context, p8c p8cVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = k96.M0(2131743954, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        LinearLayout j = de9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        zkb.X(textView, bkb.i5, null);
        textView.setTextSize(1, 14.0f);
        j.addView(textView, nme.t(-1, -2, 0, 24, 0, 24, 0));
        ag2 ag2Var = new ag2(1, null, context);
        obj.a = ag2Var;
        ag2Var.getTextView().getLayoutParams().width = -1;
        obj.a.getTextView().setTextSize(1, 14.0f);
        j.addView(obj.a, nme.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(gl.S2(k96.M0(2131752907, null)));
        obj.a.e(gl.N2(k96.M0(2131752908, null), -1, 0, new vf1(context, (byte) 28), null), "", false, false, false);
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(k96.M0(2131751759, null), new ah((byte) 1, p8cVar, zArr));
        alertDialog$Builder.g(k96.M0(2131752577, null), new fyb((byte) 20));
        obj.b = hdVar;
        hdVar.show();
        TextView textView2 = (TextView) obj.b.c(-1);
        obj.c = textView2;
        textView2.setEnabled(false);
        obj.c.setAlpha(0.5f);
        obj.a.setOnClickListener(new osc(obj, (byte) 0));
        obj.a.setBackground(bkb.f0(bkb.w0(null, bkb.h6, false), 7, -1));
        obj.b.setOnDismissListener(new vf(zArr, runnable));
    }
}
