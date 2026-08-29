package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l implements Runnable {
    public final int f7426a;
    public final m f7427b;
    public final int f7428c;

    public l(m mVar, int i10, int i11) {
        this.f7426a = i11;
        this.f7427b = mVar;
        this.f7428c = i10;
    }

    @Override
    public final void run() {
        switch (this.f7426a) {
            case 0:
                m mVar = this.f7427b;
                int i10 = mVar.f7438k;
                g9.l[] lVarArr = mVar.f7432c;
                int i11 = this.f7428c;
                if (lVarArr[i11] == null) {
                    lVarArr[i11] = new g9.l(i10);
                }
                Bitmap bitmap = mVar.f7433e;
                if (bitmap == null) {
                    mVar.f7433e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    mVar.f7434f = new Canvas(mVar.f7433e);
                } else {
                    bitmap.eraseColor(0);
                }
                mVar.a(mVar.f7434f, mVar.f7442o);
                Utilities.copyBitmaps(mVar.f7433e, (Bitmap) lVarArr[i11].f7168b);
                AndroidUtilities.runOnUIThread(new l(mVar, i11, 1));
                return;
            default:
                m mVar2 = this.f7427b;
                int i12 = this.f7428c;
                mVar2.d = i12;
                mVar2.f7435g.setShader((BitmapShader) mVar2.f7432c[i12].f7169c);
                mVar2.f7437j = false;
                mVar2.f7443p = true;
                return;
        }
    }
}
