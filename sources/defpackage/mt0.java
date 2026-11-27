package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.ui.Components.RadioButton;
public final class mt0 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public mt0(nt0 nt0Var, boolean z, Context context) {
        super(context);
        this.a = nt0Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, aob.D5, aob.E5, null);
        addView(radioButton, tre.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b = zze.b(context, 16.0f, aob.G6, true, null);
        b.setText(nt0Var.c);
        addView(b, tre.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b2 = zze.b(context, 14.0f, aob.y6, false, null);
        b2.setText(ob6.a0(null, null, 2131752974, ob6.a0(null, null, 2131742414, ob6.T(nt0Var.d / 1000), ob6.D0().o0().format(new Date(nt0Var.d / 1000)))));
        addView(b2, tre.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(hl.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
        }
    }
}
