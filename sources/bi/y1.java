package bi;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y1 extends FrameLayout {
    public final int f4005a;
    public Path f4006b;

    public y1(Context context, int i10) {
        super(context);
        this.f4005a = i10;
        switch (i10) {
            case 1:
                super(context);
                this.f4006b = new Path();
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4005a) {
            case 1:
                int save = canvas.save();
                Path path = this.f4006b;
                w7.i6.a(path, getWidth(), getHeight());
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
        switch (this.f4005a) {
            case 0:
                int action = motionEvent.getAction();
                b2 b2Var = b2.Z;
                if (b2Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(b2Var.G.getX(), b2Var.G.getY());
                    boolean dispatchTouchEvent = b2Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        b2Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = b2Var.f2865x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!b2Var.f2865x.isInProgress() && ((GestureDetector) b2Var.f2866y.f13315b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    b2Var.E = false;
                    b2Var.F = false;
                    o1.k kVar = b2Var.P;
                    if (!kVar.f16154f) {
                        float f10 = b2Var.N;
                        kVar.f16152b = f10;
                        kVar.f16153c = true;
                        o1.l lVar = kVar.f16161u;
                        int i10 = b2Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16167i = dp;
                        b2Var.P.h();
                    }
                    o1.k kVar2 = b2Var.Q;
                    if (!kVar2.f16154f) {
                        kVar2.f16152b = b2Var.O;
                        kVar2.f16153c = true;
                        kVar2.f16161u.f16167i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - b2Var.K) - AndroidUtilities.dp(16.0f));
                        b2Var.Q.h();
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
        switch (this.f4005a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                b2 b2Var = b2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(b2Var.f2858b, b2Var.d, b2Var.f2859c);
                b2Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f4005a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = this.f4006b;
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
