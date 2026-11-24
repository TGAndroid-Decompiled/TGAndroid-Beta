package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class k2a extends ggc {
    public boolean x0;
    public final p2a y0;
    public final p2a z0;

    public k2a(p2a p2aVar, Context context) {
        super(context);
        this.z0 = p2aVar;
        this.y0 = p2aVar;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.x0 = true;
        }
        if (this.x0 && this.y0.y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.x0 = true;
        }
        if (this.x0 && this.y0.y <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y = motionEvent.getY();
        currentTopOffset = this.z0.getCurrentTopOffset();
        if (y < currentTopOffset && motionEvent.getAction() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        p2a p2aVar = this.z0;
        currentTopOffset = p2aVar.getCurrentTopOffset();
        if (y >= currentTopOffset) {
            currentTopOffset2 = p2aVar.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - p2aVar.d) > gm.L(1.0f)) {
                return false;
            }
            return A(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        p2a p2aVar = this.z0;
        currentTopOffset = p2aVar.getCurrentTopOffset();
        if (y >= currentTopOffset) {
            currentTopOffset2 = p2aVar.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - p2aVar.d) > gm.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
