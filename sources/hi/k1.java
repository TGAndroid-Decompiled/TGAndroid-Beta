package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import c8.qa;
import java.util.Date;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
public final class k1 extends FrameLayout {
    public final String f14764a;
    public final RadioButton f14765b;
    public final boolean f14766c;

    public k1(l1 l1Var, boolean z9, Context context) {
        super(context);
        this.f14764a = l1Var.f14780a;
        RadioButton radioButton = new RadioButton(context);
        this.f14765b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        t6.O(radioButton, m6.D5, m6.E5, null);
        addView(radioButton, ha.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = qa.b(context, 16.0f, m6.G6, true, null);
        b10.setText(l1Var.f14782c);
        addView(b10, ha.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = qa.b(context, 14.0f, m6.f28282y6, false, null);
        b11.setText(id.a0(null, null, 2131752993, id.a0(null, null, 2131742783, id.T(l1Var.d / 1000), id.E0().p0().format(new Date(l1Var.d / 1000)))));
        addView(b11, ha.t(-1, -2, 7, 62, 32, 8, 0));
        this.f14766c = z9;
        setWillNotDraw(!z9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f14766c) {
            canvas.drawLine(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, m6.f28013k0);
        }
    }
}
