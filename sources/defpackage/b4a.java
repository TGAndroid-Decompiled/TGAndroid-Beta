package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class b4a extends fic {
    public boolean x0;
    public final g4a y0;
    public final g4a z0;

    public b4a(g4a g4aVar, Context context) {
        super(context);
        this.z0 = g4aVar;
        this.y0 = g4aVar;
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
        g4a g4aVar = this.z0;
        currentTopOffset = g4aVar.getCurrentTopOffset();
        if (y >= currentTopOffset) {
            currentTopOffset2 = g4aVar.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - g4aVar.d) > hl.L(1.0f)) {
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
        g4a g4aVar = this.z0;
        currentTopOffset = g4aVar.getCurrentTopOffset();
        if (y >= currentTopOffset) {
            currentTopOffset2 = g4aVar.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - g4aVar.d) > hl.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
