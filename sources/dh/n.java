package dh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n implements Runnable {
    public final int f4638a;
    public final o f4639b;
    public final int f4640c;

    public n(o oVar, int i9, int i10) {
        this.f4638a = i10;
        this.f4639b = oVar;
        this.f4640c = i9;
    }

    @Override
    public final void run() {
        switch (this.f4638a) {
            case 0:
                o oVar = this.f4639b;
                int i9 = oVar.f4650k;
                we.b[] bVarArr = oVar.f4644c;
                int i10 = this.f4640c;
                if (bVarArr[i10] == null) {
                    bVarArr[i10] = new we.b(i9);
                }
                Bitmap bitmap = oVar.f4645e;
                if (bitmap == null) {
                    oVar.f4645e = Bitmap.createBitmap(i9, i9, Bitmap.Config.ALPHA_8);
                    oVar.f4646f = new Canvas(oVar.f4645e);
                } else {
                    bitmap.eraseColor(0);
                }
                oVar.a(oVar.f4646f, oVar.f4654o);
                Utilities.copyBitmaps(oVar.f4645e, (Bitmap) bVarArr[i10].f48793b);
                AndroidUtilities.runOnUIThread(new n(oVar, i10, 1));
                return;
            default:
                o oVar2 = this.f4639b;
                int i11 = this.f4640c;
                oVar2.d = i11;
                oVar2.f4647g.setShader((BitmapShader) oVar2.f4644c[i11].f48794c);
                oVar2.f4649j = false;
                oVar2.f4655p = true;
                return;
        }
    }
}
