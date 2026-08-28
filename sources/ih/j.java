package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.vw;
public final class j extends wk0 {
    public final int T2;
    public final vw U2;

    public j(vw vwVar, Context context, int i9) {
        super(context, null);
        this.T2 = i9;
        this.U2 = vwVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.T2) {
            case 1:
                vw vwVar = this.U2;
                ArrayList arrayList = vwVar.L;
                arrayList.clear();
                int i9 = 0;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    q qVar = (q) getChildAt(i10);
                    int R = RecyclerView.R(qVar);
                    qVar.f11980b = R;
                    boolean z11 = true;
                    qVar.f11979a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qVar.d = z10;
                    if (R != vwVar.f12051y.size() - 1) {
                        z11 = false;
                    }
                    qVar.f11981c = z11;
                    arrayList.add(qVar);
                }
                Collections.sort(arrayList, vwVar.f12043s0);
                while (i9 < arrayList.size()) {
                    q qVar2 = (q) arrayList.get(i9);
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
                    i9++;
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
        switch (this.T2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    vw vwVar = this.U2;
                    if (vwVar.V > 0.2f || vwVar.getAlpha() == 0.0f) {
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
        switch (this.T2) {
            case 0:
                if (this.U2.L.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void k0(int i9, int i10) {
        switch (this.T2) {
            case 1:
                kh.x3 x3Var = this.U2.F;
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
        switch (this.T2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.T2) {
            case 0:
                ArrayList arrayList = this.U2.U;
                super.onLayout(z10, i9, i10, i11, i12);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((Runnable) arrayList.get(i13)).run();
                }
                arrayList.clear();
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
