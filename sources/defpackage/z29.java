package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class z29 extends FrameLayout {
    public final tm a;
    public final a39 b;

    public z29(a39 a39Var, Context context) {
        super(context);
        this.b = a39Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.F6, a39Var.getResourceProvider());
        textView.setText(jb6.M0(2131751287, null));
        addView(textView, qoe.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new tm(gm.L(24.0f), this);
    }

    public final void a(boolean z) {
        int i;
        int i2;
        a39 a39Var = this.b;
        i = ((d) a39Var).currentAccount;
        String S = hs6.d0(i).S();
        tm tmVar = this.a;
        if (S != null && S.startsWith("animated_")) {
            try {
                tmVar.j(Long.parseLong(S.substring(9)), z);
                return;
            } catch (Exception unused) {
            }
        }
        i2 = ((d) a39Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i2).r.get(S);
        if (tL_availableReaction != null) {
            tmVar.i(tL_availableReaction.static_icon, z);
        }
    }

    public final void b() {
        int width = getWidth();
        tm tmVar = this.a;
        tmVar.setBounds((width - tmVar.s) - gm.L(21.0f), (getHeight() - tmVar.s) / 2, getWidth() - gm.L(21.0f), (getHeight() + tmVar.s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }
}
