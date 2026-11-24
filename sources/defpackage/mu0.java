package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.ui.Components.RadioButton;
public final class mu0 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public mu0(nu0 nu0Var, boolean z, Context context) {
        super(context);
        this.a = nu0Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(gm.L(20.0f));
        anb.O(radioButton, cmb.C5, cmb.D5, null);
        addView(radioButton, qoe.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b = jxe.b(context, 16.0f, cmb.F6, true, null);
        b.setText(nu0Var.c);
        addView(b, qoe.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b2 = jxe.b(context, 14.0f, cmb.x6, false, null);
        b2.setText(jb6.a0(null, null, 2131752946, jb6.a0(null, null, 2131742446, jb6.T(nu0Var.d / 1000), jb6.D0().o0().format(new Date(nu0Var.d / 1000)))));
        addView(b2, qoe.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(gm.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
        }
    }
}
