package defpackage;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ltc implements Runnable {
    public final byte a;
    public final stc b;

    public ltc(stc stcVar, byte b) {
        this.a = b;
        this.b = stcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        stc stcVar = this.b;
        switch (b) {
            case 0:
                otc otcVar = stcVar.g0;
                lbc lbcVar = stcVar.a;
                if (lbcVar != null && lbcVar.c0()) {
                    otcVar.c((int) (lbcVar.S() / 1000));
                    otcVar.x = (int) (lbcVar.N() / 1000);
                    otcVar.invalidate();
                    gl.d3(stcVar.j0, 1000L);
                    return;
                }
                return;
            default:
                otc otcVar2 = stcVar.g0;
                ImageView imageView = stcVar.e;
                TextureView textureView = stcVar.d;
                stcVar.a0 = false;
                Bitmap bitmap = stcVar.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    stcVar.h = null;
                }
                stcVar.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap a = dc1.a(width, height);
                        stcVar.h = a;
                        textureView.getBitmap(a);
                    } catch (Throwable th) {
                        Bitmap bitmap2 = stcVar.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            stcVar.h = null;
                        }
                        fa4.g(th, true);
                    }
                    if (stcVar.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(stcVar.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                stcVar.V = true;
                stcVar.n();
                stcVar.o();
                stcVar.k();
                stcVar.m();
                ViewGroup viewGroup = (ViewGroup) otcVar2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(otcVar2);
                }
                ptc ptcVar = stcVar.w;
                otc otcVar3 = stcVar.g0;
                boolean z = stcVar.V;
                int i = stcVar.h0;
                int i2 = stcVar.i0;
                stcVar.c.getVideoRotation();
                TextureView f = ptcVar.f(otcVar3, z, i, i2, stcVar.J);
                stcVar.n = f;
                f.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                otcVar2.d(false, false);
                return;
        }
    }
}
