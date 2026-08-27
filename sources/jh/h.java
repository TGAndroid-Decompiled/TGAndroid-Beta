package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.yw;

public final class h extends zk0 {
    public final int T2;
    public final yw U2;

    public h(yw ywVar, Context context, int i10) {
        super(context, null);
        this.T2 = i10;
        this.U2 = ywVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.T2) {
            case 1:
                yw ywVar = this.U2;
                ArrayList arrayList = ywVar.L;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    o oVar = (o) getChildAt(i11);
                    int iR = RecyclerView.R(oVar);
                    oVar.f13721b = iR;
                    boolean z10 = true;
                    oVar.f13720a = true;
                    oVar.d = iR == 0;
                    if (iR != ywVar.f13804y.size() - 1) {
                        z10 = false;
                    }
                    oVar.f13722c = z10;
                    arrayList.add(oVar);
                }
                Collections.sort(arrayList, ywVar.f13796s0);
                while (i10 < arrayList.size()) {
                    o oVar2 = (o) arrayList.get(i10);
                    int iSave = canvas.save();
                    canvas.translate(oVar2.getX(), oVar2.getY());
                    if (oVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (oVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(oVar2.getScaleX(), oVar2.getScaleY(), AndroidUtilities.dp(14.0f), oVar2.getCy());
                    oVar2.draw(canvas2);
                    canvas2.restoreToCount(iSave);
                    i10++;
                    canvas = canvas2;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    yw ywVar = this.U2;
                    if (ywVar.V > 0.2f || ywVar.getAlpha() == 0.0f) {
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
    public void k0(int i10, int i11) {
        switch (this.T2) {
            case 1:
                lh.w3 w3Var = this.U2.F;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                break;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T2) {
            case 0:
                ArrayList arrayList = this.U2.U;
                super.onLayout(z10, i10, i11, i12, i13);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Runnable) arrayList.get(i14)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
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
