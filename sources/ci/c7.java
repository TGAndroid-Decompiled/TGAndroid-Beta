package ci;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class c7 implements Runnable {
    public final int f4809a;
    public final f7 f4810b;

    public c7(f7 f7Var, int i10) {
        this.f4809a = i10;
        this.f4810b = f7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        r8.n nVar;
        switch (this.f4809a) {
            case 0:
                f7 f7Var = this.f4810b;
                if (f7Var.f5076a.get() != null && f7Var.f5080f != null && !f7Var.f5077b.get()) {
                    TextureView textureView = f7Var.f5080f.getTextureView();
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
                        Bitmap bitmap = f7Var.f5081g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != f7Var.f5081g.getHeight()) {
                            f7Var.f5081g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(f7Var.f5081g);
                        Bitmap bitmap2 = f7Var.f5081g;
                        String str = f7Var.f5079e;
                        d7 d7Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) f7Var.f5076a.get()) != null && nVar.f45938b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            la.h hVar = new la.h(22);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            hVar.d = bitmap2;
                            a3.l lVar = (a3.l) hVar.f15399b;
                            lVar.f155a = width3;
                            lVar.f156b = height3;
                            SparseArray Z0 = nVar.Z0(hVar);
                            for (int i10 = 0; i10 < Z0.size(); i10++) {
                                r8.m mVar = (r8.m) Z0.valueAt(i10);
                                String str2 = mVar.f45928b;
                                Point[] pointArr = mVar.f45930e;
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
                                    d7Var = new d7(trim, pointFArr);
                                }
                            }
                        }
                        d7 d7Var2 = f7Var.d;
                        if (d7Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (d7Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (d7Var != null && d7Var2 != null) {
                                PointF[] pointFArr2 = d7Var.f4912b;
                                PointF[] pointFArr3 = d7Var2.f4912b;
                                if (TextUtils.equals(d7Var.f4911a, d7Var2.f4911a)) {
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
                        f7Var.d = d7Var;
                        AndroidUtilities.runOnUIThread(new ai.ba(23, f7Var, d7Var));
                    }
                    if (!f7Var.f5077b.get()) {
                        Utilities.globalQueue.cancelRunnable(f7Var.h);
                        Utilities.globalQueue.postRunnable(f7Var.h, f7Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f4810b.f5078c.run(null);
                return;
        }
    }
}
