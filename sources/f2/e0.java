package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class e0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f5344a = true;
    public final h0 f5345b;

    public e0(h0 h0Var) {
        this.f5345b = h0Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        q1 T;
        if (this.f5344a) {
            h0 h0Var = this.f5345b;
            View k10 = h0Var.k(motionEvent);
            d0 d0Var = h0Var.f5377x;
            if (k10 != null && (T = h0Var.D.T(k10)) != null) {
                RecyclerView recyclerView = h0Var.D;
                int e10 = d0Var.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.j0.f46915a;
                if ((d0Var.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i9 = h0Var.f5376w;
                    if (pointerId == i9) {
                        int findPointerIndex = motionEvent.findPointerIndex(i9);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        h0Var.d = x10;
                        h0Var.f5371e = y10;
                        h0Var.f5374r = 0.0f;
                        h0Var.f5373n = 0.0f;
                        if (d0Var.k()) {
                            h0Var.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
