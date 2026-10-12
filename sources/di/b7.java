package di;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b7 implements Runnable {
    public final int f6659a;
    public final e7 f6660b;

    public b7(e7 e7Var, int i10) {
        this.f6659a = i10;
        this.f6660b = e7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        r8.n nVar;
        switch (this.f6659a) {
            case 0:
                e7 e7Var = this.f6660b;
                if (e7Var.f6893a.get() != null && e7Var.f6896f != null && !e7Var.f6894b.get()) {
                    TextureView textureView = e7Var.f6896f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f7 = width;
                            float f10 = height;
                            float min = Math.min(720.0f / f7, 720.0f / f10);
                            width = (int) (f7 * min);
                            height = (int) (f10 * min);
                        }
                        boolean z11 = true;
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = e7Var.f6897g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != e7Var.f6897g.getHeight()) {
                            e7Var.f6897g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(e7Var.f6897g);
                        Bitmap bitmap2 = e7Var.f6897g;
                        String str = e7Var.e;
                        c7 c7Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) e7Var.f6893a.get()) != null && nVar.f44028b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            li.k kVar = new li.k(23);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            kVar.d = bitmap2;
                            a3.l lVar = (a3.l) kVar.f14820b;
                            lVar.f139a = width3;
                            lVar.f140b = height3;
                            SparseArray e12 = nVar.e1(kVar);
                            for (int i10 = 0; i10 < e12.size(); i10++) {
                                r8.m mVar = (r8.m) e12.valueAt(i10);
                                String str2 = mVar.f44019b;
                                Point[] pointArr = mVar.e;
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!trim.startsWith(str)) {
                                        if (!trim.startsWith("https://" + str)) {
                                            if (!trim.startsWith("http://" + str)) {
                                            }
                                        }
                                    }
                                    PointF[] pointFArr = new PointF[pointArr.length];
                                    for (int i11 = 0; i11 < pointArr.length; i11++) {
                                        Point point = pointArr[i11];
                                        pointFArr[i11] = new PointF(point.x / width2, point.y / height2);
                                    }
                                    c7Var = new c7(trim, pointFArr);
                                }
                            }
                        }
                        c7 c7Var2 = e7Var.d;
                        if (c7Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c7Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (c7Var != null && c7Var2 != null) {
                                PointF[] pointFArr2 = c7Var.f6709b;
                                PointF[] pointFArr3 = c7Var2.f6709b;
                                if (TextUtils.equals(c7Var.f6708a, c7Var2.f6708a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            for (int i12 = 0; i12 < pointFArr2.length; i12++) {
                                                if (Math.abs(pointFArr2[i12].x - pointFArr3[i12].x) <= 0.001f && Math.abs(pointFArr2[i12].y - pointFArr3[i12].y) <= 0.001f) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e7Var.d = c7Var;
                        AndroidUtilities.runOnUIThread(new x6(4, e7Var, c7Var));
                    }
                    if (!e7Var.f6894b.get()) {
                        Utilities.globalQueue.cancelRunnable(e7Var.h);
                        Utilities.globalQueue.postRunnable(e7Var.h, e7Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f6660b.f6895c.run(null);
                return;
        }
    }
}
