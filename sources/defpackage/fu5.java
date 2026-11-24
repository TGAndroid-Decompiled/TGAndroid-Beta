package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class fu5 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final hu5 b;

    public fu5(hu5 hu5Var) {
        this.b = hu5Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        u69 T;
        if (this.a) {
            hu5 hu5Var = this.b;
            View m = hu5Var.m(motionEvent);
            eu5 eu5Var = hu5Var.y;
            if (m != null && (T = hu5Var.I.T(m)) != null) {
                RecyclerView recyclerView = hu5Var.I;
                int f = eu5Var.f(recyclerView, T);
                WeakHashMap weakHashMap = kfc.a;
                if ((eu5Var.b(f, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i = hu5Var.x;
                    if (pointerId == i) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        hu5Var.d = x;
                        hu5Var.e = y;
                        hu5Var.r = 0.0f;
                        hu5Var.n = 0.0f;
                        if (eu5Var.l()) {
                            hu5Var.q(T, 2);
                        }
                    }
                }
            }
        }
    }
}
