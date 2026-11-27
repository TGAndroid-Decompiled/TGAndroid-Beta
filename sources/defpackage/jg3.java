package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class jg3 extends d79 {
    public final byte f3;
    public final ii3 g3;

    public jg3(ii3 ii3Var, Context context, byte b) {
        super(context, null);
        this.f3 = b;
        this.g3 = ii3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        switch (this.f3) {
            case 1:
                ii3 ii3Var = this.g3;
                ArrayList arrayList = ii3Var.Q;
                arrayList.clear();
                int i = 0;
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    og3 og3Var = (og3) getChildAt(i2);
                    int S = RecyclerView.S(og3Var);
                    og3Var.b = S;
                    boolean z2 = true;
                    og3Var.a = true;
                    if (S == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    og3Var.d = z;
                    if (S != ii3Var.E.size() - 1) {
                        z2 = false;
                    }
                    og3Var.c = z2;
                    arrayList.add(og3Var);
                }
                Collections.sort(arrayList, ii3Var.x0);
                while (i < arrayList.size()) {
                    og3 og3Var2 = (og3) arrayList.get(i);
                    int save = canvas.save();
                    canvas.translate(og3Var2.getX(), og3Var2.getY());
                    if (og3Var2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-hl.L(4.0f), -hl.L(4.0f), hl.L(50.0f), hl.L(50.0f), (int) (og3Var2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(og3Var2.getScaleX(), og3Var2.getScaleY(), hl.L(14.0f), og3Var2.getCy());
                    og3Var2.draw(canvas2);
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
                    ii3 ii3Var = this.g3;
                    if (ii3Var.d0 > 0.2f || ii3Var.getAlpha() == 0.0f) {
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
    public final void n0(int i) {
        switch (this.f3) {
            case 1:
                kg5 kg5Var = this.g3.K;
                if (kg5Var != null) {
                    kg5Var.f(true);
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
