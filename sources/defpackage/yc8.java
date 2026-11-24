package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.LaunchActivity;
public final class yc8 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public final PipRoundVideoView e;

    public yc8(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wn9 wn9Var = cmb.j3;
        if (wn9Var != null) {
            wn9Var.setAlpha((int) (getAlpha() * 255.0f));
            cmb.j3.setBounds(gm.L(1.0f), gm.L(2.0f), gm.L(125.0f), gm.L(125.0f));
            cmb.j3.draw(canvas);
            cmb.R1.setColor(cmb.w0(null, cmb.qa, false));
            cmb.R1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(gm.L(63.0f), gm.L(63.0f), gm.L(59.5f), cmb.R1);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.a = motionEvent.getRawX();
            this.b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc8.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
