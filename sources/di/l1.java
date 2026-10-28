package di;

import a8.ee;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l1 extends FrameLayout {
    public final int f8750a;
    public Path f8751b;

    public l1(Context context, int i10) {
        super(context);
        this.f8750a = i10;
        switch (i10) {
            case 1:
                super(context);
                this.f8751b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8750a) {
            case 1:
                int save = canvas.save();
                canvas.clipPath(this.f8751b);
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
        switch (this.f8750a) {
            case 0:
                int action = motionEvent.getAction();
                o1 o1Var = o1.Z;
                if (o1Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(o1Var.G.getX(), o1Var.G.getY());
                    boolean dispatchTouchEvent = o1Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        o1Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = o1Var.f8864x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!o1Var.f8864x.isInProgress() && ((GestureDetector) o1Var.f8865y.f15827b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    o1Var.E = false;
                    o1Var.F = false;
                    o1.j jVar = o1Var.P;
                    if (!jVar.f18962f) {
                        float f10 = o1Var.N;
                        jVar.f18960b = f10;
                        jVar.f18961c = true;
                        o1.k kVar = jVar.f18968u;
                        int i10 = o1Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f18974i = dp;
                        o1Var.P.h();
                    }
                    o1.j jVar2 = o1Var.Q;
                    if (!jVar2.f18962f) {
                        jVar2.f18960b = o1Var.O;
                        jVar2.f18961c = true;
                        jVar2.f18968u.f18974i = ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
                        o1Var.Q.h();
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
        switch (this.f8750a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                o1 o1Var = o1.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(o1Var.f8857b, o1Var.d, o1Var.f8858c);
                o1Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f8750a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = this.f8751b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path2 = this.f8751b;
                float paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
                path2.rewind();
                path2.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path2.offset(getPaddingLeft(), getPaddingTop());
                return;
        }
    }
}
