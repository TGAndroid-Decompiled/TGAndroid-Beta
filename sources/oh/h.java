package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.hx;
public final class h extends sl0 {
    public final int U2;
    public final hx V2;

    public h(hx hxVar, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = hxVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        switch (this.U2) {
            case 1:
                hx hxVar = this.V2;
                ArrayList arrayList = hxVar.M;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    o oVar = (o) getChildAt(i11);
                    int R = RecyclerView.R(oVar);
                    oVar.f17519b = R;
                    boolean z10 = true;
                    oVar.f17518a = true;
                    if (R == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    oVar.d = z4;
                    if (R != hxVar.f17609y.size() - 1) {
                        z10 = false;
                    }
                    oVar.f17520c = z10;
                    arrayList.add(oVar);
                }
                Collections.sort(arrayList, hxVar.f17602t0);
                while (i10 < arrayList.size()) {
                    o oVar2 = (o) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(oVar2.getX(), oVar2.getY());
                    if (oVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (oVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(oVar2.getScaleX(), oVar2.getScaleY(), AndroidUtilities.dp(14.0f), oVar2.getCy());
                    oVar2.draw(canvas2);
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
                    hx hxVar = this.V2;
                    if (hxVar.W > 0.2f || hxVar.getAlpha() == 0.0f) {
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
                qh.e3 e3Var = this.V2.G;
                if (e3Var != null) {
                    e3Var.e(true);
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
