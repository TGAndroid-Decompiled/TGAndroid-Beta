package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;
public final class ga8 extends AnimatorListenerAdapter {
    public final byte a;
    public final View b;
    public final PhotoViewer c;

    public ga8(PhotoViewer photoViewer, View view, byte b) {
        this.a = b;
        this.c = photoViewer;
        this.b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.b;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 0:
                photoViewer.B3 = false;
                photoViewer.i4.run();
                gm.d3(new a18(this, view, (byte) 10), 100L);
                return;
            default:
                photoViewer.B3 = false;
                view.setOutlineProvider(null);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                kb8 kb8Var = photoViewer.F2;
                if (kb8Var != null) {
                    kb8Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
