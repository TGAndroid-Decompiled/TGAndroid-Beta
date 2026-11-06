package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import c8.qa;
import java.util.Date;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
public final class k1 extends FrameLayout {
    public final String f14759a;
    public final RadioButton f14760b;
    public final boolean f14761c;

    public k1(l1 l1Var, boolean z9, Context context) {
        super(context);
        this.f14759a = l1Var.f14775a;
        RadioButton radioButton = new RadioButton(context);
        this.f14760b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        r6.P(radioButton, k6.D5, k6.E5, null);
        addView(radioButton, ha.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = qa.b(context, 16.0f, k6.G6, true, null);
        b10.setText(l1Var.f14777c);
        addView(b10, ha.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = qa.b(context, 14.0f, k6.f28241y6, false, null);
        b11.setText(hd.a0(null, null, 2131752993, hd.a0(null, null, 2131742784, hd.T(l1Var.d / 1000), hd.E0().p0().format(new Date(l1Var.d / 1000)))));
        addView(b11, ha.t(-1, -2, 7, 62, 32, 8, 0));
        this.f14761c = z9;
        setWillNotDraw(!z9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f14761c) {
            canvas.drawLine(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, k6.f27972k0);
        }
    }
}
