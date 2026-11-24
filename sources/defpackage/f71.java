package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class f71 extends FrameLayout {
    public final wf2 a;
    public final FrameLayout b;
    public final TextView c;
    public boolean d;
    public byte e;
    public final byte f;
    public final b71 h;

    public f71(b71 b71Var, Context context, byte b) {
        super(context);
        this.f = b;
        this.h = b71Var;
        wf2 wf2Var = new wf2(21, null, context);
        this.a = wf2Var;
        wf2Var.setDrawBackgroundAsArc(14);
        wf2Var.b(bkb.h7, bkb.f7, bkb.j7);
        View view = new View(getContext());
        view.setOnClickListener(new j1(this, (byte) 27));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        zkb.X(textView, bkb.m6, null);
        if (k96.a0) {
            addView(wf2Var, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, nme.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, nme.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, nme.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(wf2Var, nme.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, nme.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, nme.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, nme.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (k96.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - gl.L(48.0f), getMeasuredHeight() - 1, bkb.j0);
            } else {
                canvas.drawLine(getMeasuredWidth() - gl.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
            }
        }
    }
}
