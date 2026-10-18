package ei;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f9790a;
    public final v6 f9791b;

    public s6(v6 v6Var, int i10) {
        this.f9790a = i10;
        this.f9791b = v6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        r8.n nVar;
        switch (this.f9790a) {
            case 0:
                v6 v6Var = this.f9791b;
                if (v6Var.f9937a.get() != null && v6Var.f9940f != null && !v6Var.f9938b.get()) {
                    TextureView textureView = v6Var.f9940f.getTextureView();
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
                        Bitmap bitmap = v6Var.f9941g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != v6Var.f9941g.getHeight()) {
                            v6Var.f9941g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(v6Var.f9941g);
                        Bitmap bitmap2 = v6Var.f9941g;
                        String str = v6Var.e;
                        t6 t6Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) v6Var.f9937a.get()) != null && nVar.f45117b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            m.g3 g3Var = new m.g3(22);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            g3Var.d = bitmap2;
                            a3.l lVar = (a3.l) g3Var.f16201b;
                            lVar.f139a = width3;
                            lVar.f140b = height3;
                            SparseArray e12 = nVar.e1(g3Var);
                            for (int i10 = 0; i10 < e12.size(); i10++) {
                                r8.m mVar = (r8.m) e12.valueAt(i10);
                                String str2 = mVar.f45108b;
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
                                    t6Var = new t6(trim, pointFArr);
                                }
                            }
                        }
                        t6 t6Var2 = v6Var.d;
                        if (t6Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (t6Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (t6Var != null && t6Var2 != null) {
                                PointF[] pointFArr2 = t6Var.f9853b;
                                PointF[] pointFArr3 = t6Var2.f9853b;
                                if (TextUtils.equals(t6Var.f9852a, t6Var2.f9852a)) {
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
                        v6Var.d = t6Var;
                        AndroidUtilities.runOnUIThread(new p6(2, v6Var, t6Var));
                    }
                    if (!v6Var.f9938b.get()) {
                        Utilities.globalQueue.cancelRunnable(v6Var.h);
                        Utilities.globalQueue.postRunnable(v6Var.h, v6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f9791b.f9939c.run(null);
                return;
        }
    }
}
