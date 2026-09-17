package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.lx;
public final class m extends ll0 {
    public final int X2;
    public final lx Y2;

    public m(lx lxVar, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = lxVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.X2) {
            case 1:
                lx lxVar = this.Y2;
                ArrayList arrayList = lxVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    u uVar = (u) getChildAt(i11);
                    int R = RecyclerView.R(uVar);
                    uVar.f3769b = R;
                    boolean z11 = true;
                    uVar.f3767a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    uVar.d = z10;
                    if (R != lxVar.f3879y.size() - 1) {
                        z11 = false;
                    }
                    uVar.f3771c = z11;
                    arrayList.add(uVar);
                }
                Collections.sort(arrayList, lxVar.f3876w0);
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
        switch (this.X2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    lx lxVar = this.Y2;
                    if (lxVar.f3851c0 > 0.2f || lxVar.getAlpha() == 0.0f) {
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
        switch (this.X2) {
            case 0:
                if (this.Y2.P.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        switch (this.X2) {
            case 1:
                di.f4 f4Var = this.Y2.J;
                if (f4Var != null) {
                    f4Var.e(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 0:
                ArrayList arrayList = this.Y2.f3849b0;
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
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
