package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;
public final class d88 extends AnimatorListenerAdapter {
    public final byte a;
    public final View b;
    public final PhotoViewer c;

    public d88(PhotoViewer photoViewer, View view, byte b) {
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
                gl.d3(new h18(this, view, (byte) 9), 100L);
                return;
            default:
                photoViewer.B3 = false;
                view.setOutlineProvider(null);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                j98 j98Var = photoViewer.F2;
                if (j98Var != null) {
                    j98Var.setOutlineProvider(null);
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
