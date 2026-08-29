package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class c0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f6284a = true;
    public final e0 f6285b;

    public c0(e0 e0Var) {
        this.f6285b = e0Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        n1 T;
        if (this.f6284a) {
            e0 e0Var = this.f6285b;
            View k9 = e0Var.k(motionEvent);
            b0 b0Var = e0Var.f6308x;
            if (k9 != null && (T = e0Var.D.T(k9)) != null) {
                RecyclerView recyclerView = e0Var.D;
                int e10 = b0Var.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.j0.f46829a;
                if ((b0Var.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = e0Var.f6307w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x4 = motionEvent.getX(findPointerIndex);
                        float y8 = motionEvent.getY(findPointerIndex);
                        e0Var.d = x4;
                        e0Var.f6302e = y8;
                        e0Var.f6305r = 0.0f;
                        e0Var.f6304n = 0.0f;
                        if (b0Var.k()) {
                            e0Var.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
