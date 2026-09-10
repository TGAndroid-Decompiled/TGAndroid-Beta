package bi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f8 implements Runnable {
    public final int f2715a;
    public final i8 f2716b;

    public f8(i8 i8Var, int i10) {
        this.f2715a = i10;
        this.f2716b = i8Var;
    }

    @Override
    public final void run() {
        boolean z10;
        r8.n nVar;
        switch (this.f2715a) {
            case 0:
                i8 i8Var = this.f2716b;
                if (i8Var.f2857a.get() != null && i8Var.f2860f != null && !i8Var.f2858b.get()) {
                    TextureView textureView = i8Var.f2860f.getTextureView();
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
                        Bitmap bitmap = i8Var.f2861g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != i8Var.f2861g.getHeight()) {
                            i8Var.f2861g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(i8Var.f2861g);
                        Bitmap bitmap2 = i8Var.f2861g;
                        String str = i8Var.e;
                        g8 g8Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) i8Var.f2857a.get()) != null && nVar.f41365b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            m.e3 e3Var = new m.e3(20);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            e3Var.d = bitmap2;
                            a3.l lVar = (a3.l) e3Var.f13001b;
                            lVar.f140a = width3;
                            lVar.f141b = height3;
                            SparseArray Z0 = nVar.Z0(e3Var);
                            for (int i10 = 0; i10 < Z0.size(); i10++) {
                                r8.m mVar = (r8.m) Z0.valueAt(i10);
                                String str2 = mVar.f41356b;
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
                                    g8Var = new g8(trim, pointFArr);
                                }
                            }
                        }
                        g8 g8Var2 = i8Var.d;
                        if (g8Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g8Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (g8Var != null && g8Var2 != null) {
                                PointF[] pointFArr2 = g8Var.f2751b;
                                PointF[] pointFArr3 = g8Var2.f2751b;
                                if (TextUtils.equals(g8Var.f2750a, g8Var2.f2750a)) {
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
                        i8Var.d = g8Var;
                        AndroidUtilities.runOnUIThread(new a1.e(19, i8Var, g8Var));
                    }
                    if (!i8Var.f2858b.get()) {
                        Utilities.globalQueue.cancelRunnable(i8Var.h);
                        Utilities.globalQueue.postRunnable(i8Var.h, i8Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f2716b.f2859c.run(null);
                return;
        }
    }
}
