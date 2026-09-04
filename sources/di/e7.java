package di;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e7 implements Runnable {
    public final int f7168a;
    public final h7 f7169b;

    public e7(h7 h7Var, int i10) {
        this.f7168a = i10;
        this.f7169b = h7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        r8.n nVar;
        switch (this.f7168a) {
            case 0:
                h7 h7Var = this.f7169b;
                if (h7Var.f7321a.get() != null && h7Var.f7325f != null && !h7Var.f7322b.get()) {
                    TextureView textureView = h7Var.f7325f.getTextureView();
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
                        Bitmap bitmap = h7Var.f7326g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != h7Var.f7326g.getHeight()) {
                            h7Var.f7326g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(h7Var.f7326g);
                        Bitmap bitmap2 = h7Var.f7326g;
                        String str = h7Var.f7324e;
                        f7 f7Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) h7Var.f7321a.get()) != null && nVar.f45030b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            m2.t tVar = new m2.t(20);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            tVar.d = bitmap2;
                            a3.k kVar = (a3.k) tVar.f15817b;
                            kVar.f129a = width3;
                            kVar.f130b = height3;
                            SparseArray Z0 = nVar.Z0(tVar);
                            for (int i10 = 0; i10 < Z0.size(); i10++) {
                                r8.m mVar = (r8.m) Z0.valueAt(i10);
                                String str2 = mVar.f45020b;
                                Point[] pointArr = mVar.f45022e;
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
                                    f7Var = new f7(trim, pointFArr);
                                }
                            }
                        }
                        f7 f7Var2 = h7Var.d;
                        if (f7Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (f7Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (f7Var != null && f7Var2 != null) {
                                PointF[] pointFArr2 = f7Var.f7235b;
                                PointF[] pointFArr3 = f7Var2.f7235b;
                                if (TextUtils.equals(f7Var.f7234a, f7Var2.f7234a)) {
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
                        h7Var.d = f7Var;
                        AndroidUtilities.runOnUIThread(new b7(2, h7Var, f7Var));
                    }
                    if (!h7Var.f7322b.get()) {
                        Utilities.globalQueue.cancelRunnable(h7Var.h);
                        Utilities.globalQueue.postRunnable(h7Var.h, h7Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f7169b.f7323c.run(null);
                return;
        }
    }
}
