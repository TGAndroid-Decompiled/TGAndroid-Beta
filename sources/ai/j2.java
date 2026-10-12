package ai;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j2 extends FrameLayout {
    public final int f1174a;
    public Path f1175b;

    public j2(Context context, int i10) {
        super(context);
        this.f1174a = i10;
        switch (i10) {
            case 1:
                super(context);
                this.f1175b = new Path();
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1174a) {
            case 1:
                int save = canvas.save();
                Path path = this.f1175b;
                w7.f6.a(path, getWidth(), getHeight());
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        int dp;
        switch (this.f1174a) {
            case 0:
                int action = motionEvent.getAction();
                n2 n2Var = n2.Z;
                if (n2Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(n2Var.G.getX(), n2Var.G.getY());
                    boolean dispatchTouchEvent = n2Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        n2Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = n2Var.f1453x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!n2Var.f1453x.isInProgress() && ((GestureDetector) n2Var.f1454y.f16326a).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    n2Var.E = false;
                    n2Var.F = false;
                    o1.k kVar = n2Var.P;
                    if (!kVar.f16684f) {
                        float f10 = n2Var.N;
                        kVar.f16681b = f10;
                        kVar.f16682c = true;
                        o1.l lVar = kVar.f16691u;
                        int i10 = n2Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16698i = dp;
                        n2Var.P.h();
                    }
                    o1.k kVar2 = n2Var.Q;
                    if (!kVar2.f16684f) {
                        kVar2.f16681b = n2Var.O;
                        kVar2.f16682c = true;
                        kVar2.f16691u.f16698i = w7.n.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - n2Var.K) - AndroidUtilities.dp(16.0f));
                        n2Var.Q.h();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f1174a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                n2 n2Var = n2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(n2Var.f1445b, n2Var.d, n2Var.f1446c);
                n2Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1174a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = this.f1175b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
