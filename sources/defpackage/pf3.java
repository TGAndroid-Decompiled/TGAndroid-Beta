package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class pf3 extends o39 {
    public final byte f3;
    public final oh3 g3;

    public pf3(oh3 oh3Var, Context context, byte b) {
        super(context, null);
        this.f3 = b;
        this.g3 = oh3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        switch (this.f3) {
            case 1:
                oh3 oh3Var = this.g3;
                ArrayList arrayList = oh3Var.Q;
                arrayList.clear();
                int i = 0;
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    uf3 uf3Var = (uf3) getChildAt(i2);
                    int R = RecyclerView.R(uf3Var);
                    uf3Var.b = R;
                    boolean z2 = true;
                    uf3Var.a = true;
                    if (R == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    uf3Var.d = z;
                    if (R != oh3Var.E.size() - 1) {
                        z2 = false;
                    }
                    uf3Var.c = z2;
                    arrayList.add(uf3Var);
                }
                Collections.sort(arrayList, oh3Var.x0);
                while (i < arrayList.size()) {
                    uf3 uf3Var2 = (uf3) arrayList.get(i);
                    int save = canvas.save();
                    canvas.translate(uf3Var2.getX(), uf3Var2.getY());
                    if (uf3Var2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-gl.L(4.0f), -gl.L(4.0f), gl.L(50.0f), gl.L(50.0f), (int) (uf3Var2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(uf3Var2.getScaleX(), uf3Var2.getScaleY(), gl.L(14.0f), uf3Var2.getCy());
                    uf3Var2.draw(canvas2);
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
                    oh3 oh3Var = this.g3;
                    if (oh3Var.d0 > 0.2f || oh3Var.getAlpha() == 0.0f) {
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
                je5 je5Var = this.g3.K;
                if (je5Var != null) {
                    je5Var.f(true);
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
