package eh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class l implements Runnable {

    public final int f5534a;

    public final m f5535b;

    public final int f5536c;

    public l(m mVar, int i10, int i11) {
        this.f5534a = i11;
        this.f5535b = mVar;
        this.f5536c = i10;
    }

    @Override
    public final void run() {
        switch (this.f5534a) {
            case 0:
                m mVar = this.f5535b;
                int i10 = mVar.f5546k;
                xe.b[] bVarArr = mVar.f5540c;
                int i11 = this.f5536c;
                if (bVarArr[i11] == null) {
                    bVarArr[i11] = new xe.b(i10);
                }
                Bitmap bitmap = mVar.f5541e;
                if (bitmap == null) {
                    mVar.f5541e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    mVar.f5542f = new Canvas(mVar.f5541e);
                } else {
                    bitmap.eraseColor(0);
                }
                mVar.a(mVar.f5542f, mVar.f5550o);
                Utilities.copyBitmaps(mVar.f5541e, (Bitmap) bVarArr[i11].f49392b);
                AndroidUtilities.runOnUIThread(new l(mVar, i11, 1));
                break;
            default:
                m mVar2 = this.f5535b;
                int i12 = this.f5536c;
                mVar2.d = i12;
                mVar2.f5543g.setShader((BitmapShader) mVar2.f5540c[i12].f49393c);
                mVar2.f5545j = false;
                mVar2.f5551p = true;
                break;
        }
    }
}
