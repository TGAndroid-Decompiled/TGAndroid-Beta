package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.ui.Components.RadioButton;
public final class et0 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public et0(ft0 ft0Var, boolean z, Context context) {
        super(context);
        this.a = ft0Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.C5, bkb.D5, null);
        addView(radioButton, nme.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b = hve.b(context, 16.0f, bkb.F6, true, null);
        b.setText(ft0Var.c);
        addView(b, nme.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b2 = hve.b(context, 14.0f, bkb.x6, false, null);
        b2.setText(k96.a0(null, null, 2131752981, k96.a0(null, null, 2131742520, k96.T(ft0Var.d / 1000), k96.D0().o0().format(new Date(ft0Var.d / 1000)))));
        addView(b2, nme.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(gl.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
        }
    }
}
