package kh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f16031a;
    public final v6 f16032b;

    public s6(v6 v6Var, int i9) {
        this.f16031a = i9;
        this.f16032b = v6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        b8.n nVar;
        switch (this.f16031a) {
            case 0:
                v6 v6Var = this.f16032b;
                if (v6Var.f16197a.get() != null && v6Var.f16201f != null && !v6Var.f16198b.get()) {
                    TextureView textureView = v6Var.f16201f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f10 = width;
                            float f11 = height;
                            float min = Math.min(720.0f / f10, 720.0f / f11);
                            width = (int) (f10 * min);
                            height = (int) (f11 * min);
                        }
                        boolean z11 = true;
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = v6Var.f16202g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != v6Var.f16202g.getHeight()) {
                            v6Var.f16202g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(v6Var.f16202g);
                        Bitmap bitmap2 = v6Var.f16202g;
                        String str = v6Var.f16200e;
                        t6 t6Var = null;
                        if (bitmap2 != null && (nVar = (b8.n) v6Var.f16197a.get()) != null && nVar.f1654b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            a5.m mVar = new a5.m(1);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            mVar.d = bitmap2;
                            a8.b bVar = (a8.b) mVar.f98b;
                            bVar.f109a = width3;
                            bVar.f110b = height3;
                            SparseArray Q = nVar.Q(mVar);
                            for (int i9 = 0; i9 < Q.size(); i9++) {
                                b8.m mVar2 = (b8.m) Q.valueAt(i9);
                                String str2 = mVar2.f1644b;
                                Point[] pointArr = mVar2.f1646e;
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!trim.startsWith(str)) {
                                        if (!trim.startsWith("https://" + str)) {
                                            if (!trim.startsWith("http://" + str)) {
                                            }
                                        }
                                    }
                                    PointF[] pointFArr = new PointF[pointArr.length];
                                    for (int i10 = 0; i10 < pointArr.length; i10++) {
                                        Point point = pointArr[i10];
                                        pointFArr[i10] = new PointF(point.x / width2, point.y / height2);
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
                                PointF[] pointFArr2 = t6Var.f16090b;
                                PointF[] pointFArr3 = t6Var2.f16090b;
                                if (TextUtils.equals(t6Var.f16089a, t6Var2.f16089a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            for (int i11 = 0; i11 < pointFArr2.length; i11++) {
                                                if (Math.abs(pointFArr2[i11].x - pointFArr3[i11].x) <= 0.001f && Math.abs(pointFArr2[i11].y - pointFArr3[i11].y) <= 0.001f) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        v6Var.d = t6Var;
                        AndroidUtilities.runOnUIThread(new ih.j7(21, v6Var, t6Var));
                    }
                    if (!v6Var.f16198b.get()) {
                        Utilities.globalQueue.cancelRunnable(v6Var.h);
                        Utilities.globalQueue.postRunnable(v6Var.h, v6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f16032b.f16199c.run(null);
                return;
        }
    }
}
