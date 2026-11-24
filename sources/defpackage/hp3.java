package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class hp3 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public hp3(Context context, wjb wjbVar) {
        super(context);
        setOrientation(1);
        setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        ir2.t(textView, 1, 15.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        addView(textView, nme.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, bkb.x6, wjbVar);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, nme.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, 20, wjbVar);
        this.c = limitPreviewView;
        addView(limitPreviewView, nme.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(gp3 gp3Var) {
        this.a.setText(gp3Var.a);
        this.b.setText(gp3Var.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(gp3Var.d)));
        limitPreviewView.x.setText(String.format("%d", Integer.valueOf(gp3Var.c)));
    }
}
