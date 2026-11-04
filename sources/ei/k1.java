package ei;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import b8.be;
public final class k1 extends FrameLayout {
    public final int f10560a;
    public Path f10561b;

    public k1(Context context, int i3) {
        super(context);
        this.f10560a = i3;
        switch (i3) {
            case 1:
                super(context);
                this.f10561b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10560a) {
            case 1:
                int save = canvas.save();
                canvas.clipPath(this.f10561b);
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
        float f10;
        int L;
        switch (this.f10560a) {
            case 0:
                int action = motionEvent.getAction();
                n1 n1Var = n1.f10647a0;
                if (n1Var.H != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(n1Var.H.getX(), n1Var.H.getY());
                    boolean dispatchTouchEvent = n1Var.H.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        n1Var.H = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = n1Var.f10658y.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!n1Var.f10658y.isInProgress() && ((GestureDetector) n1Var.E.f40562a).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    n1Var.F = false;
                    n1Var.G = false;
                    q1.g gVar = n1Var.Q;
                    if (!gVar.f53647f) {
                        float f11 = n1Var.O;
                        gVar.f53644b = f11;
                        gVar.f53645c = true;
                        q1.h hVar = gVar.f53653m;
                        int i3 = n1Var.K;
                        float f12 = (i3 / 2.0f) + f11;
                        int i10 = org.telegram.messenger.g0.f22608q.x;
                        if (f12 >= i10 / 2.0f) {
                            L = (i10 - i3) - org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(16.0f);
                        }
                        hVar.f53661i = L;
                        n1Var.Q.h();
                    }
                    q1.g gVar2 = n1Var.R;
                    if (!gVar2.f53647f) {
                        gVar2.f53644b = n1Var.P;
                        gVar2.f53645c = true;
                        gVar2.f53653m.f53661i = be.a(f10, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.f22608q.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f));
                        n1Var.R.h();
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
        switch (this.f10560a) {
            case 0:
                org.telegram.messenger.g0.v(getContext(), configuration);
                n1 n1Var = n1.f10647a0;
                org.telegram.messenger.g0.y3(n1Var.f10649b, n1Var.d, n1Var.f10650c);
                n1Var.a();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f10560a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                Path path = this.f10561b;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, i3, i10);
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                Path path2 = this.f10561b;
                float paddingLeft = (i3 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i10 - getPaddingTop()) - getPaddingBottom();
                path2.rewind();
                path2.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path2.offset(getPaddingLeft(), getPaddingTop());
                return;
        }
    }
}
