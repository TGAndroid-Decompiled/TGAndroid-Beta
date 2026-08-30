package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class c0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f5672a = true;
    public final e0 f5673b;

    public c0(e0 e0Var) {
        this.f5673b = e0Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        l1 T;
        if (this.f5672a) {
            e0 e0Var = this.f5673b;
            View k10 = e0Var.k(motionEvent);
            b0 b0Var = e0Var.f5689x;
            if (k10 != null && (T = e0Var.E.T(k10)) != null) {
                RecyclerView recyclerView = e0Var.E;
                int e = b0Var.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.j0.f43118a;
                if ((b0Var.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = e0Var.f5688w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        e0Var.d = x10;
                        e0Var.e = y10;
                        e0Var.f5686r = 0.0f;
                        e0Var.f5685n = 0.0f;
                        if (b0Var.k()) {
                            e0Var.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
