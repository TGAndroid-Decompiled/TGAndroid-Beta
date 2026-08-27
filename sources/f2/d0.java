package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public final class d0 extends GestureDetector.SimpleOnGestureListener {

    public boolean f5640a = true;

    public final f0 f5641b;

    public d0(f0 f0Var) {
        this.f5641b = f0Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        o1 o1VarT;
        if (this.f5640a) {
            f0 f0Var = this.f5641b;
            View viewK = f0Var.k(motionEvent);
            c0 c0Var = f0Var.f5665x;
            if (viewK == null || (o1VarT = f0Var.D.T(viewK)) == null) {
                return;
            }
            RecyclerView recyclerView = f0Var.D;
            int iE = c0Var.e(recyclerView, o1VarT);
            WeakHashMap weakHashMap = r0.j0.f46605a;
            if ((c0Var.b(iE, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = f0Var.f5664w;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x8 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    f0Var.d = x8;
                    f0Var.f5659e = y10;
                    f0Var.f5662r = 0.0f;
                    f0Var.f5661n = 0.0f;
                    if (c0Var.k()) {
                        f0Var.p(o1VarT, 2);
                    }
                }
            }
        }
    }
}
