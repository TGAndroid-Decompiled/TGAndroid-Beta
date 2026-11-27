package defpackage;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ayc implements Runnable {
    public final byte a;
    public final hyc b;

    public ayc(hyc hycVar, byte b) {
        this.a = b;
        this.b = hycVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hyc hycVar = this.b;
        switch (b) {
            case 0:
                dyc dycVar = hycVar.g0;
                kfc kfcVar = hycVar.a;
                if (kfcVar != null && kfcVar.c0()) {
                    dycVar.c((int) (kfcVar.S() / 1000));
                    dycVar.x = (int) (kfcVar.N() / 1000);
                    dycVar.invalidate();
                    hl.d3(hycVar.j0, 1000L);
                    return;
                }
                return;
            default:
                dyc dycVar2 = hycVar.g0;
                ImageView imageView = hycVar.e;
                TextureView textureView = hycVar.d;
                hycVar.a0 = false;
                Bitmap bitmap = hycVar.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    hycVar.h = null;
                }
                hycVar.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap a = lc1.a(width, height);
                        hycVar.h = a;
                        textureView.getBitmap(a);
                    } catch (Throwable th) {
                        Bitmap bitmap2 = hycVar.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            hycVar.h = null;
                        }
                        cc4.g(th, true);
                    }
                    if (hycVar.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(hycVar.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                hycVar.V = true;
                hycVar.n();
                hycVar.o();
                hycVar.k();
                hycVar.m();
                ViewGroup viewGroup = (ViewGroup) dycVar2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(dycVar2);
                }
                eyc eycVar = hycVar.w;
                dyc dycVar3 = hycVar.g0;
                boolean z = hycVar.V;
                int i = hycVar.h0;
                int i2 = hycVar.i0;
                hycVar.c.getVideoRotation();
                TextureView f = eycVar.f(dycVar3, z, i, i2, hycVar.J);
                hycVar.n = f;
                f.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                dycVar2.d(false, false);
                return;
        }
    }
}
