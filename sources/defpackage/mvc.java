package defpackage;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class mvc implements Runnable {
    public final byte a;
    public final tvc b;

    public mvc(tvc tvcVar, byte b) {
        this.a = b;
        this.b = tvcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tvc tvcVar = this.b;
        switch (b) {
            case 0:
                pvc pvcVar = tvcVar.g0;
                ndc ndcVar = tvcVar.a;
                if (ndcVar != null && ndcVar.c0()) {
                    pvcVar.c((int) (ndcVar.S() / 1000));
                    pvcVar.x = (int) (ndcVar.N() / 1000);
                    pvcVar.invalidate();
                    gm.d3(tvcVar.j0, 1000L);
                    return;
                }
                return;
            default:
                pvc pvcVar2 = tvcVar.g0;
                ImageView imageView = tvcVar.e;
                TextureView textureView = tvcVar.d;
                tvcVar.a0 = false;
                Bitmap bitmap = tvcVar.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    tvcVar.h = null;
                }
                tvcVar.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap a = ld1.a(width, height);
                        tvcVar.h = a;
                        textureView.getBitmap(a);
                    } catch (Throwable th) {
                        Bitmap bitmap2 = tvcVar.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            tvcVar.h = null;
                        }
                        fc4.g(th, true);
                    }
                    if (tvcVar.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(tvcVar.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                tvcVar.V = true;
                tvcVar.n();
                tvcVar.o();
                tvcVar.k();
                tvcVar.m();
                ViewGroup viewGroup = (ViewGroup) pvcVar2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(pvcVar2);
                }
                qvc qvcVar = tvcVar.w;
                pvc pvcVar3 = tvcVar.g0;
                boolean z = tvcVar.V;
                int i = tvcVar.h0;
                int i2 = tvcVar.i0;
                tvcVar.c.getVideoRotation();
                TextureView f = qvcVar.f(pvcVar3, z, i, i2, tvcVar.J);
                tvcVar.n = f;
                f.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                pvcVar2.d(false, false);
                return;
        }
    }
}
