package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class c0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f5741a = true;
    public final f0 f5742b;

    public c0(f0 f0Var) {
        this.f5742b = f0Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        m1 T;
        if (this.f5741a) {
            f0 f0Var = this.f5742b;
            View k10 = f0Var.k(motionEvent);
            b0 b0Var = f0Var.f5766x;
            if (k10 != null && (T = f0Var.E.T(k10)) != null) {
                RecyclerView recyclerView = f0Var.E;
                int e6 = b0Var.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.j0.f46469a;
                if ((b0Var.b(e6, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = f0Var.f5765w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        f0Var.d = x10;
                        f0Var.f5760e = y10;
                        f0Var.f5763r = 0.0f;
                        f0Var.f5762n = 0.0f;
                        if (b0Var.k()) {
                            f0Var.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
