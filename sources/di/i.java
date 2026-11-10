package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.sv;
public final class i extends pj0 {
    public final int f9096e3;
    public final sv f9097f3;

    public i(sv svVar, Context context, int i7) {
        super(context, null);
        this.f9096e3 = i7;
        this.f9097f3 = svVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9;
        switch (this.f9096e3) {
            case 1:
                sv svVar = this.f9097f3;
                ArrayList arrayList = svVar.P;
                arrayList.clear();
                int i7 = 0;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    p pVar = (p) getChildAt(i10);
                    int R = RecyclerView.R(pVar);
                    pVar.f9478b = R;
                    boolean z10 = true;
                    pVar.f9476a = true;
                    if (R == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    pVar.d = z9;
                    if (R != svVar.D.size() - 1) {
                        z10 = false;
                    }
                    pVar.f9480c = z10;
                    arrayList.add(pVar);
                }
                Collections.sort(arrayList, svVar.f9561w0);
                while (i7 < arrayList.size()) {
                    p pVar2 = (p) arrayList.get(i7);
                    int save = canvas.save();
                    canvas.translate(pVar2.getX(), pVar2.getY());
                    if (pVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), (int) (pVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(pVar2.getScaleX(), pVar2.getScaleY(), org.telegram.messenger.g0.L(14.0f), pVar2.getCy());
                    pVar2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i7++;
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
        switch (this.f9096e3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    sv svVar = this.f9097f3;
                    if (svVar.f9536c0 > 0.2f || svVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f9096e3) {
            case 0:
                if (this.f9097f3.P.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void l0(int i7) {
        switch (this.f9096e3) {
            case 1:
                fi.m3 m3Var = this.f9097f3.J;
                if (m3Var != null) {
                    m3Var.f(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f9096e3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f9096e3) {
            case 0:
                ArrayList arrayList = this.f9097f3.f9534b0;
                super.onLayout(z9, i7, i10, i11, i12);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((Runnable) arrayList.get(i13)).run();
                }
                arrayList.clear();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f9096e3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
