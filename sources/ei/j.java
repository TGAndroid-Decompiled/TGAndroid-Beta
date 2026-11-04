package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.mv;
public final class j extends tj0 {
    public final int f10430f3;
    public final mv f10431g3;

    public j(mv mvVar, Context context, int i3) {
        super(context, null);
        this.f10430f3 = i3;
        this.f10431g3 = mvVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f10430f3) {
            case 1:
                mv mvVar = this.f10431g3;
                ArrayList arrayList = mvVar.Q;
                arrayList.clear();
                int i3 = 0;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    q qVar = (q) getChildAt(i10);
                    int R = RecyclerView.R(qVar);
                    qVar.f10782b = R;
                    boolean z11 = true;
                    qVar.f10780a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qVar.d = z10;
                    if (R != mvVar.E.size() - 1) {
                        z11 = false;
                    }
                    qVar.f10784c = z11;
                    arrayList.add(qVar);
                }
                Collections.sort(arrayList, mvVar.f10854x0);
                while (i3 < arrayList.size()) {
                    q qVar2 = (q) arrayList.get(i3);
                    int save = canvas.save();
                    canvas.translate(qVar2.getX(), qVar2.getY());
                    if (qVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), (int) (qVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(qVar2.getScaleX(), qVar2.getScaleY(), org.telegram.messenger.g0.L(14.0f), qVar2.getCy());
                    qVar2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i3++;
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
        switch (this.f10430f3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    mv mvVar = this.f10431g3;
                    if (mvVar.f10828d0 > 0.2f || mvVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f10430f3) {
            case 0:
                if (this.f10431g3.Q.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void l0(int i3) {
        switch (this.f10430f3) {
            case 1:
                gi.l3 l3Var = this.f10431g3.K;
                if (l3Var != null) {
                    l3Var.f(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f10430f3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f10430f3) {
            case 0:
                ArrayList arrayList = this.f10431g3.f10827c0;
                super.onLayout(z10, i3, i10, i11, i12);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((Runnable) arrayList.get(i13)).run();
                }
                arrayList.clear();
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f10430f3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
