package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.im0;
import org.telegram.ui.vw;
public final class j extends im0 {
    public final int V2;
    public final vw W2;

    public j(vw vwVar, Context context, int i10) {
        super(context, null);
        this.V2 = i10;
        this.W2 = vwVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.V2) {
            case 1:
                vw vwVar = this.W2;
                ArrayList arrayList = vwVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    q qVar = (q) getChildAt(i11);
                    int R = RecyclerView.R(qVar);
                    qVar.f5740b = R;
                    boolean z11 = true;
                    qVar.f5738a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qVar.d = z10;
                    if (R != vwVar.f5900y.size() - 1) {
                        z11 = false;
                    }
                    qVar.f5742c = z11;
                    arrayList.add(qVar);
                }
                Collections.sort(arrayList, vwVar.f5897w0);
                while (i10 < arrayList.size()) {
                    q qVar2 = (q) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(qVar2.getX(), qVar2.getY());
                    if (qVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (qVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(qVar2.getScaleX(), qVar2.getScaleY(), AndroidUtilities.dp(14.0f), qVar2.getCy());
                    qVar2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i10++;
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
        switch (this.V2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    vw vwVar = this.W2;
                    if (vwVar.f5873c0 > 0.2f || vwVar.getAlpha() == 0.0f) {
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
        switch (this.V2) {
            case 0:
                if (this.W2.P.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        switch (this.V2) {
            case 1:
                ei.x3 x3Var = this.W2.J;
                if (x3Var != null) {
                    x3Var.e(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.V2) {
            case 0:
                ArrayList arrayList = this.W2.f5871b0;
                super.onLayout(z10, i10, i11, i12, i13);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Runnable) arrayList.get(i14)).run();
                }
                arrayList.clear();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
