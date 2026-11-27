package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class n71 extends FrameLayout {
    public final og2 a;
    public final FrameLayout b;
    public final TextView c;
    public boolean d;
    public byte e;
    public final byte f;
    public final j71 h;

    public n71(j71 j71Var, Context context, byte b) {
        super(context);
        this.f = b;
        this.h = j71Var;
        og2 og2Var = new og2(21, null, context);
        this.a = og2Var;
        og2Var.setDrawBackgroundAsArc(14);
        og2Var.b(aob.i7, aob.g7, aob.k7);
        View view = new View(getContext());
        view.setOnClickListener(new k1(this, (byte) 29));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        yob.X(textView, aob.n6, null);
        if (ob6.a0) {
            addView(og2Var, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, tre.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, tre.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, tre.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(og2Var, tre.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, tre.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, tre.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, tre.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (ob6.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - hl.L(48.0f), getMeasuredHeight() - 1, aob.j0);
            } else {
                canvas.drawLine(getMeasuredWidth() - hl.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
            }
        }
    }
}
