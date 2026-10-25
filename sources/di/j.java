package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.qw;
public final class j extends mm0 {
    public final int f8690f3;
    public final qw f8691g3;

    public j(qw qwVar, Context context, int i10) {
        super(context, null);
        this.f8690f3 = i10;
        this.f8691g3 = qwVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f8690f3) {
            case 1:
                qw qwVar = this.f8691g3;
                ArrayList arrayList = qwVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    q qVar = (q) getChildAt(i11);
                    int R = RecyclerView.R(qVar);
                    qVar.f8937b = R;
                    boolean z11 = true;
                    qVar.f8935a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qVar.d = z10;
                    if (R != qwVar.f9103y.size() - 1) {
                        z11 = false;
                    }
                    qVar.f8939c = z11;
                    arrayList.add(qVar);
                }
                Collections.sort(arrayList, qwVar.f9100w0);
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
        switch (this.f8690f3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    qw qwVar = this.f8691g3;
                    if (qwVar.f9076c0 > 0.2f || qwVar.getAlpha() == 0.0f) {
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
        switch (this.f8690f3) {
            case 0:
                if (this.f8691g3.P.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void l0(int i10) {
        switch (this.f8690f3) {
            case 1:
                fi.v3 v3Var = this.f8691g3.J;
                if (v3Var != null) {
                    v3Var.e(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f8690f3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f8690f3) {
            case 0:
                ArrayList arrayList = this.f8691g3.f9074b0;
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
        switch (this.f8690f3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
