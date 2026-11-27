package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.PhotoViewer;
public final class ob2 extends OldVideoPlayerRewinder {
    public final byte a;
    public final Object b;

    public ob2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        xl4 xl4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wb2 wb2Var = (wb2) obj;
                wb2Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                wb2Var.ac.d(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.h1(obtain);
                photoViewer.A1.d(false);
                me8 me8Var = photoViewer.U8;
                if (me8Var != null && (xl4Var = me8Var.e) != null) {
                    xl4Var.I.d(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z) {
        xl4 xl4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wb2 wb2Var = (wb2) obj;
                rec recVar = wb2Var.ac;
                recVar.n = new wz4(this);
                recVar.c(false);
                wb2Var.ac.b(!z);
                wb2Var.ac.d(true);
                wb2Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.A1.c(false);
                boolean z2 = !z;
                photoViewer.A1.b(z2);
                photoViewer.A1.d(true);
                photoViewer.f0.invalidate();
                me8 me8Var = photoViewer.U8;
                if (me8Var != null && (xl4Var = me8Var.e) != null) {
                    rec recVar2 = xl4Var.I;
                    recVar2.c(false);
                    recVar2.b(z2);
                    recVar2.d(true);
                    vl4 vl4Var = xl4Var.q;
                    if (vl4Var != null) {
                        vl4Var.invalidate();
                    }
                    pl4 pl4Var = xl4Var.o;
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
        xl4 xl4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wb2 wb2Var = (wb2) obj;
                wb2Var.ac.e(Math.abs(j));
                if (z) {
                    wb2Var.Q5.b0 = f;
                    wb2Var.W3();
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
                me8 me8Var = photoViewer.U8;
                if (me8Var != null && (xl4Var = me8Var.e) != null) {
                    xl4Var.I.e(0L);
                    if (z) {
                        xl4Var.L = f;
                        vl4 vl4Var = xl4Var.q;
                        if (vl4Var != null) {
                            vl4Var.invalidate();
                        }
                        pl4 pl4Var = xl4Var.o;
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
