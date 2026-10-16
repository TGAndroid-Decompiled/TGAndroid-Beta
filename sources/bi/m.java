package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.px;
public final class m extends mm0 {
    public final int V2;
    public final px W2;

    public m(px pxVar, Context context, int i10) {
        super(context, null);
        this.V2 = i10;
        this.W2 = pxVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.V2) {
            case 1:
                px pxVar = this.W2;
                ArrayList arrayList = pxVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    u uVar = (u) getChildAt(i11);
                    int R = RecyclerView.R(uVar);
                    uVar.f3764b = R;
                    boolean z11 = true;
                    uVar.f3762a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    uVar.d = z10;
                    if (R != pxVar.f3847y.size() - 1) {
                        z11 = false;
                    }
                    uVar.f3766c = z11;
                    arrayList.add(uVar);
                }
                Collections.sort(arrayList, pxVar.f3844w0);
                while (i10 < arrayList.size()) {
                    u uVar2 = (u) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(uVar2.getX(), uVar2.getY());
                    if (uVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (uVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(uVar2.getScaleX(), uVar2.getScaleY(), AndroidUtilities.dp(14.0f), uVar2.getCy());
                    uVar2.draw(canvas2);
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
                    px pxVar = this.W2;
                    if (pxVar.f3820c0 > 0.2f || pxVar.getAlpha() == 0.0f) {
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
                di.d4 d4Var = this.W2.J;
                if (d4Var != null) {
                    d4Var.e(true);
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
                ArrayList arrayList = this.W2.f3818b0;
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
