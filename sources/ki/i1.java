package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import c8.wa;
import java.util.Date;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.RadioButton;
public final class i1 extends FrameLayout {
    public final String f18808a;
    public final RadioButton f18809b;
    public final boolean f18810c;

    public i1(j1 j1Var, boolean z10, Context context) {
        super(context);
        this.f18808a = j1Var.f18826a;
        RadioButton radioButton = new RadioButton(context);
        this.f18809b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        u6.O(radioButton, n6.D5, n6.E5, null);
        addView(radioButton, na.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = wa.b(context, 16.0f, n6.G6, true, null);
        b10.setText(j1Var.f18828c);
        addView(b10, na.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = wa.b(context, 14.0f, n6.f29843y6, false, null);
        b11.setText(gd.a0(null, null, 2131752981, gd.a0(null, null, 2131742512, gd.T(j1Var.d / 1000), gd.E0().p0().format(new Date(j1Var.d / 1000)))));
        addView(b11, na.t(-1, -2, 7, 62, 32, 8, 0));
        this.f18810c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f18810c) {
            canvas.drawLine(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, n6.f29574k0);
        }
    }
}
