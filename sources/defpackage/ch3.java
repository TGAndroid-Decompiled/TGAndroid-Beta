package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class ch3 extends r59 {
    public final byte f3;
    public final aj3 g3;

    public ch3(aj3 aj3Var, Context context, byte b) {
        super(context, null);
        this.f3 = b;
        this.g3 = aj3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        switch (this.f3) {
            case 1:
                aj3 aj3Var = this.g3;
                ArrayList arrayList = aj3Var.Q;
                arrayList.clear();
                int i = 0;
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    hh3 hh3Var = (hh3) getChildAt(i2);
                    int R = RecyclerView.R(hh3Var);
                    hh3Var.b = R;
                    boolean z2 = true;
                    hh3Var.a = true;
                    if (R == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hh3Var.d = z;
                    if (R != aj3Var.E.size() - 1) {
                        z2 = false;
                    }
                    hh3Var.c = z2;
                    arrayList.add(hh3Var);
                }
                Collections.sort(arrayList, aj3Var.x0);
                while (i < arrayList.size()) {
                    hh3 hh3Var2 = (hh3) arrayList.get(i);
                    int save = canvas.save();
                    canvas.translate(hh3Var2.getX(), hh3Var2.getY());
                    if (hh3Var2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-gm.L(4.0f), -gm.L(4.0f), gm.L(50.0f), gm.L(50.0f), (int) (hh3Var2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(hh3Var2.getScaleX(), hh3Var2.getScaleY(), gm.L(14.0f), hh3Var2.getCy());
                    hh3Var2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i++;
                    canvas = canvas2;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    aj3 aj3Var = this.g3;
                    if (aj3Var.d0 > 0.2f || aj3Var.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.f3) {
            case 0:
                if (this.g3.Q.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void m0(int i) {
        switch (this.f3) {
            case 1:
                hg5 hg5Var = this.g3.K;
                if (hg5Var != null) {
                    hg5Var.f(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 0:
                ArrayList arrayList = this.g3.c0;
                super.onLayout(z, i, i2, i3, i4);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((Runnable) arrayList.get(i5)).run();
                }
                arrayList.clear();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
