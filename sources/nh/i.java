package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.gx;
public final class i extends sl0 {
    public final int U2;
    public final gx V2;

    public i(gx gxVar, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = gxVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        switch (this.U2) {
            case 1:
                gx gxVar = this.V2;
                ArrayList arrayList = gxVar.M;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    p pVar = (p) getChildAt(i11);
                    int R = RecyclerView.R(pVar);
                    pVar.f15727b = R;
                    boolean z10 = true;
                    pVar.f15726a = true;
                    if (R == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    pVar.d = z4;
                    if (R != gxVar.f15787y.size() - 1) {
                        z10 = false;
                    }
                    pVar.f15728c = z10;
                    arrayList.add(pVar);
                }
                Collections.sort(arrayList, gxVar.f15780t0);
                while (i10 < arrayList.size()) {
                    p pVar2 = (p) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(pVar2.getX(), pVar2.getY());
                    if (pVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (pVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(pVar2.getScaleX(), pVar2.getScaleY(), AndroidUtilities.dp(14.0f), pVar2.getCy());
                    pVar2.draw(canvas2);
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
        switch (this.U2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    gx gxVar = this.V2;
                    if (gxVar.W > 0.2f || gxVar.getAlpha() == 0.0f) {
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
        switch (this.U2) {
            case 0:
                if (this.V2.M.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        switch (this.U2) {
            case 1:
                ph.f3 f3Var = this.V2.G;
                if (f3Var != null) {
                    f3Var.e(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.U2) {
            case 0:
                ArrayList arrayList = this.V2.V;
                super.onLayout(z4, i10, i11, i12, i13);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Runnable) arrayList.get(i14)).run();
                }
                arrayList.clear();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
