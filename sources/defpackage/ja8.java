package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
import org.telegram.ui.PhotoViewer;
public final class ja8 extends VideoPlayerRewinder {
    public final PhotoViewer a;

    public ja8(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        tl4 tl4Var;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        photoViewer.h1(obtain);
        photoViewer.A1.d(false);
        ad8 ad8Var = photoViewer.U8;
        if (ad8Var != null && (tl4Var = ad8Var.e) != null) {
            tl4Var.F.d(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z) {
        tl4 tl4Var;
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.c(false);
        boolean z2 = !z;
        photoViewer.A1.b(z2);
        photoViewer.A1.d(true);
        photoViewer.f0.invalidate();
        ad8 ad8Var = photoViewer.U8;
        if (ad8Var != null && (tl4Var = ad8Var.e) != null) {
            ucc uccVar = tl4Var.F;
            uccVar.c(false);
            uccVar.b(z2);
            uccVar.d(true);
            yc ycVar = tl4Var.o;
            if (ycVar != null) {
                ycVar.invalidate();
            }
            pl4 pl4Var = tl4Var.m;
            if (pl4Var != null) {
                pl4Var.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j, float f, boolean z) {
        tl4 tl4Var;
        PhotoViewer photoViewer = this.a;
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
                }
            }
        }
    }
}
