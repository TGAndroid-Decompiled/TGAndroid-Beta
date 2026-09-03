package ih;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l implements Runnable {
    public final int f7607a;
    public final m f7608b;
    public final int f7609c;

    public l(m mVar, int i10, int i11) {
        this.f7607a = i11;
        this.f7608b = mVar;
        this.f7609c = i10;
    }

    @Override
    public final void run() {
        switch (this.f7607a) {
            case 0:
                m mVar = this.f7608b;
                int i10 = mVar.f7618k;
                f7.b[] bVarArr = mVar.f7613c;
                int i11 = this.f7609c;
                if (bVarArr[i11] == null) {
                    bVarArr[i11] = new f7.b(i10);
                }
                Bitmap bitmap = mVar.e;
                if (bitmap == null) {
                    mVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    mVar.f7614f = new Canvas(mVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                mVar.a(mVar.f7614f, mVar.f7622o);
                Utilities.copyBitmaps(mVar.e, (Bitmap) bVarArr[i11].f6001b);
                AndroidUtilities.runOnUIThread(new l(mVar, i11, 1));
                return;
            default:
                m mVar2 = this.f7608b;
                int i12 = this.f7609c;
                mVar2.d = i12;
                mVar2.f7615g.setShader((BitmapShader) mVar2.f7613c[i12].f6002c);
                mVar2.f7617j = false;
                mVar2.f7623p = true;
                return;
        }
    }
}
