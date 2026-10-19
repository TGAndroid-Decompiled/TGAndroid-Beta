package ci;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m1 extends FrameLayout {
    public final int f5604a;
    public Path f5605b;

    public m1(Context context, int i10) {
        super(context);
        this.f5604a = i10;
        switch (i10) {
            case 1:
                super(context);
                this.f5605b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5604a) {
            case 1:
                int save = canvas.save();
                canvas.clipPath(this.f5605b);
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
        switch (this.f5604a) {
            case 0:
                int action = motionEvent.getAction();
                p1 p1Var = p1.Z;
                if (p1Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(p1Var.G.getX(), p1Var.G.getY());
                    boolean dispatchTouchEvent = p1Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        p1Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = p1Var.f5721x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!p1Var.f5721x.isInProgress() && ((GestureDetector) p1Var.f5722y.f16011b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    p1Var.E = false;
                    p1Var.F = false;
                    o1.k kVar = p1Var.P;
                    if (!kVar.f17554f) {
                        float f10 = p1Var.N;
                        kVar.f17552b = f10;
                        kVar.f17553c = true;
                        o1.l lVar = kVar.f17561u;
                        int i10 = p1Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f17567i = dp;
                        p1Var.P.h();
                    }
                    o1.k kVar2 = p1Var.Q;
                    if (!kVar2.f17554f) {
                        kVar2.f17552b = p1Var.O;
                        kVar2.f17553c = true;
                        kVar2.f17561u.f17567i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f));
                        p1Var.Q.h();
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
        switch (this.f5604a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                p1 p1Var = p1.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(p1Var.f5714b, p1Var.d, p1Var.f5715c);
                p1Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5604a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = this.f5605b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path2 = this.f5605b;
                float paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
                path2.rewind();
                path2.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path2.offset(getPaddingLeft(), getPaddingTop());
                return;
        }
    }
}
