package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.PhotoViewer;
public final class ya2 extends OldVideoPlayerRewinder {
    public final byte a;
    public final Object b;

    public ya2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        sj4 sj4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gb2 gb2Var = (gb2) obj;
                gb2Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                gb2Var.ac.d(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.g1(obtain);
                photoViewer.A1.d(false);
                xa8 xa8Var = photoViewer.V8;
                if (xa8Var != null && (sj4Var = xa8Var.e) != null) {
                    sj4Var.F.d(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z) {
        sj4 sj4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gb2 gb2Var = (gb2) obj;
                rac racVar = gb2Var.ac;
                racVar.n = new lj9(this, (byte) 20);
                racVar.c(false);
                gb2Var.ac.b(!z);
                gb2Var.ac.d(true);
                gb2Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.A1.c(false);
                boolean z2 = !z;
                photoViewer.A1.b(z2);
                photoViewer.A1.d(true);
                photoViewer.f0.invalidate();
                xa8 xa8Var = photoViewer.V8;
                if (xa8Var != null && (sj4Var = xa8Var.e) != null) {
                    rac racVar2 = sj4Var.F;
                    racVar2.c(false);
                    racVar2.b(z2);
                    racVar2.d(true);
                    rj4 rj4Var = sj4Var.o;
                    if (rj4Var != null) {
                        rj4Var.invalidate();
                    }
                    lj4 lj4Var = sj4Var.m;
                    if (lj4Var != null) {
                        lj4Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j, float f, boolean z) {
        sj4 sj4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gb2 gb2Var = (gb2) obj;
                gb2Var.ac.e(Math.abs(j));
                if (z) {
                    gb2Var.Q5.b0 = f;
                    gb2Var.W3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.A1.e(Math.abs(j));
                if (z) {
                    photoViewer.q3.h(false, f);
                    photoViewer.r3.invalidate();
                }
                xa8 xa8Var = photoViewer.V8;
                if (xa8Var != null && (sj4Var = xa8Var.e) != null) {
                    sj4Var.F.e(0L);
                    if (z) {
                        sj4Var.I = f;
                        rj4 rj4Var = sj4Var.o;
                        if (rj4Var != null) {
                            rj4Var.invalidate();
                        }
                        lj4 lj4Var = sj4Var.m;
                        if (lj4Var != null) {
                            lj4Var.invalidate();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
