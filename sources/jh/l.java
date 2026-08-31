package jh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l implements Runnable {
    public final int f10156a;
    public final m f10157b;
    public final int f10158c;

    public l(m mVar, int i10, int i11) {
        this.f10156a = i11;
        this.f10157b = mVar;
        this.f10158c = i10;
    }

    @Override
    public final void run() {
        switch (this.f10156a) {
            case 0:
                m mVar = this.f10157b;
                int i10 = mVar.f10168k;
                f7.b[] bVarArr = mVar.f10162c;
                int i11 = this.f10158c;
                if (bVarArr[i11] == null) {
                    bVarArr[i11] = new f7.b(i10);
                }
                Bitmap bitmap = mVar.f10163e;
                if (bitmap == null) {
                    mVar.f10163e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    mVar.f10164f = new Canvas(mVar.f10163e);
                } else {
                    bitmap.eraseColor(0);
                }
                mVar.a(mVar.f10164f, mVar.f10172o);
                Utilities.copyBitmaps(mVar.f10163e, (Bitmap) bVarArr[i11].f6120b);
                AndroidUtilities.runOnUIThread(new l(mVar, i11, 1));
                return;
            default:
                m mVar2 = this.f10157b;
                int i12 = this.f10158c;
                mVar2.d = i12;
                mVar2.f10165g.setShader((BitmapShader) mVar2.f10162c[i12].f6121c);
                mVar2.f10167j = false;
                mVar2.f10173p = true;
                return;
        }
    }
}
