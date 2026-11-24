package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.LaunchActivity;
public final class va8 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public final PipRoundVideoView e;

    public va8(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = pipRoundVideoView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wl9 wl9Var = bkb.j3;
        if (wl9Var != null) {
            wl9Var.setAlpha((int) (getAlpha() * 255.0f));
            bkb.j3.setBounds(gl.L(1.0f), gl.L(2.0f), gl.L(125.0f), gl.L(125.0f));
            bkb.j3.draw(canvas);
            bkb.R1.setColor(bkb.w0(null, bkb.qa, false));
            bkb.R1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(gl.L(63.0f), gl.L(63.0f), gl.L(59.5f), bkb.R1);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va8.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
