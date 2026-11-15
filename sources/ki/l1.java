package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import c8.sa;
import java.util.Date;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.RadioButton;
public final class l1 extends FrameLayout {
    public final String f18423a;
    public final RadioButton f18424b;
    public final boolean f18425c;

    public l1(m1 m1Var, boolean z10, Context context) {
        super(context);
        this.f18423a = m1Var.f18447a;
        RadioButton radioButton = new RadioButton(context);
        this.f18424b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        q6.O(radioButton, j6.D5, j6.E5, null);
        addView(radioButton, ja.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = sa.b(context, 16.0f, j6.G6, true, null);
        b10.setText(m1Var.f18449c);
        addView(b10, ja.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = sa.b(context, 14.0f, j6.f29241y6, false, null);
        b11.setText(hd.a0(null, null, 2131752993, hd.a0(null, null, 2131742783, hd.T(m1Var.d / 1000), hd.E0().p0().format(new Date(m1Var.d / 1000)))));
        addView(b11, ja.t(-1, -2, 7, 62, 32, 8, 0));
        this.f18425c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f18425c) {
            canvas.drawLine(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, j6.f28972k0);
        }
    }
}
