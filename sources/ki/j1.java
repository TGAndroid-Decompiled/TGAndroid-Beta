package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import java.util.Date;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.RadioButton;
public final class j1 extends FrameLayout {
    public final String f18724a;
    public final RadioButton f18725b;
    public final boolean f18726c;

    public j1(k1 k1Var, boolean z10, Context context) {
        super(context);
        this.f18724a = k1Var.f18748a;
        RadioButton radioButton = new RadioButton(context);
        this.f18725b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        u6.O(radioButton, n6.D5, n6.E5, null);
        addView(radioButton, ma.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = va.b(context, 16.0f, n6.G6, true, null);
        b10.setText(k1Var.f18750c);
        addView(b10, ma.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = va.b(context, 14.0f, n6.f29786y6, false, null);
        b11.setText(gd.a0(null, null, 2131752982, gd.a0(null, null, 2131742525, gd.T(k1Var.d / 1000), gd.E0().p0().format(new Date(k1Var.d / 1000)))));
        addView(b11, ma.t(-1, -2, 7, 62, 32, 8, 0));
        this.f18726c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f18726c) {
            canvas.drawLine(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, n6.f29517k0);
        }
    }
}
