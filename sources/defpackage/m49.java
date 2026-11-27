package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class m49 extends FrameLayout {
    public final ul a;
    public final n49 b;

    public m49(n49 n49Var, Context context) {
        super(context);
        this.b = n49Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, n49Var.getResourceProvider());
        textView.setText(ob6.M0(2131751315, null));
        addView(textView, tre.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new ul(hl.L(24.0f), this);
    }

    public final void a(boolean z) {
        n49 n49Var = this.b;
        String S = ls6.d0(n49.b0(n49Var)).S();
        ul ulVar = this.a;
        if (S != null && S.startsWith("animated_")) {
            try {
                ulVar.j(Long.parseLong(S.substring(9)), z);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(n49.c0(n49Var)).r.get(S);
        if (tL_availableReaction != null) {
            ulVar.i(tL_availableReaction.static_icon, z);
        }
    }

    public final void b() {
        int width = getWidth();
        ul ulVar = this.a;
        ulVar.setBounds((width - ulVar.s) - hl.L(21.0f), (getHeight() - ulVar.s) / 2, getWidth() - hl.L(21.0f), (getHeight() + ulVar.s) / 2);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }
}
