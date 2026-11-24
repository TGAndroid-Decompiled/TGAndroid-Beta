package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.PhotoViewer;
public final class jc2 extends OldVideoPlayerRewinder {
    public final byte a;
    public final Object b;

    public jc2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        tl4 tl4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rc2 rc2Var = (rc2) obj;
                rc2Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                rc2Var.ac.d(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.h1(obtain);
                photoViewer.A1.d(false);
                ad8 ad8Var = photoViewer.U8;
                if (ad8Var != null && (tl4Var = ad8Var.e) != null) {
                    tl4Var.F.d(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z) {
        tl4 tl4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rc2 rc2Var = (rc2) obj;
                ucc uccVar = rc2Var.ac;
                uccVar.n = new sz4(this);
                uccVar.c(false);
                rc2Var.ac.b(!z);
                rc2Var.ac.d(true);
                rc2Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.A1.c(false);
                boolean z2 = !z;
                photoViewer.A1.b(z2);
                photoViewer.A1.d(true);
                photoViewer.f0.invalidate();
                ad8 ad8Var = photoViewer.U8;
                if (ad8Var != null && (tl4Var = ad8Var.e) != null) {
                    ucc uccVar2 = tl4Var.F;
                    uccVar2.c(false);
                    uccVar2.b(z2);
                    uccVar2.d(true);
                    yc ycVar = tl4Var.o;
                    if (ycVar != null) {
                        ycVar.invalidate();
                    }
                    pl4 pl4Var = tl4Var.m;
                    if (pl4Var != null) {
                        pl4Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j, float f, boolean z) {
        tl4 tl4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rc2 rc2Var = (rc2) obj;
                rc2Var.ac.e(Math.abs(j));
                if (z) {
                    rc2Var.Q5.b0 = f;
                    rc2Var.W3();
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
                ad8 ad8Var = photoViewer.U8;
                if (ad8Var != null && (tl4Var = ad8Var.e) != null) {
                    tl4Var.F.e(0L);
                    if (z) {
                        tl4Var.I = f;
                        yc ycVar = tl4Var.o;
                        if (ycVar != null) {
                            ycVar.invalidate();
                        }
                        pl4 pl4Var = tl4Var.m;
                        if (pl4Var != null) {
                            pl4Var.invalidate();
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
