package ih;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l implements Runnable {
    public final int f7625a;
    public final m f7626b;
    public final int f7627c;

    public l(m mVar, int i10, int i11) {
        this.f7625a = i11;
        this.f7626b = mVar;
        this.f7627c = i10;
    }

    @Override
    public final void run() {
        switch (this.f7625a) {
            case 0:
                m mVar = this.f7626b;
                int i10 = mVar.f7636k;
                f7.b[] bVarArr = mVar.f7631c;
                int i11 = this.f7627c;
                if (bVarArr[i11] == null) {
                    bVarArr[i11] = new f7.b(i10);
                }
                Bitmap bitmap = mVar.e;
                if (bitmap == null) {
                    mVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    mVar.f7632f = new Canvas(mVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                mVar.a(mVar.f7632f, mVar.f7640o);
                Utilities.copyBitmaps(mVar.e, (Bitmap) bVarArr[i11].f6012b);
                AndroidUtilities.runOnUIThread(new l(mVar, i11, 1));
                return;
            default:
                m mVar2 = this.f7626b;
                int i12 = this.f7627c;
                mVar2.d = i12;
                mVar2.f7633g.setShader((BitmapShader) mVar2.f7631c[i12].f6013c);
                mVar2.f7635j = false;
                mVar2.f7641p = true;
                return;
        }
    }
}
