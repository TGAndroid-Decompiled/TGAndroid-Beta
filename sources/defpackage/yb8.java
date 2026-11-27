package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
import org.telegram.ui.PhotoViewer;
public final class yb8 extends VideoPlayerRewinder {
    public final PhotoViewer a;

    public yb8(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        xl4 xl4Var;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        photoViewer.h1(obtain);
        photoViewer.A1.d(false);
        me8 me8Var = photoViewer.U8;
        if (me8Var != null && (xl4Var = me8Var.e) != null) {
            xl4Var.I.d(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z) {
        xl4 xl4Var;
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.c(false);
        boolean z2 = !z;
        photoViewer.A1.b(z2);
        photoViewer.A1.d(true);
        photoViewer.f0.invalidate();
        me8 me8Var = photoViewer.U8;
        if (me8Var != null && (xl4Var = me8Var.e) != null) {
            rec recVar = xl4Var.I;
            recVar.c(false);
            recVar.b(z2);
            recVar.d(true);
            vl4 vl4Var = xl4Var.q;
            if (vl4Var != null) {
                vl4Var.invalidate();
            }
            pl4 pl4Var = xl4Var.o;
            if (pl4Var != null) {
                pl4Var.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j, float f, boolean z) {
        xl4 xl4Var;
        PhotoViewer photoViewer = this.a;
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
                }
            }
        }
    }
}
