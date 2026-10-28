package fi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f11438a;
    public final s6 f11439b;

    public p6(s6 s6Var, int i10) {
        this.f11438a = i10;
        this.f11439b = s6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        s8.n nVar;
        switch (this.f11438a) {
            case 0:
                s6 s6Var = this.f11439b;
                if (s6Var.f11587a.get() != null && s6Var.f11590f != null && !s6Var.f11588b.get()) {
                    TextureView textureView = s6Var.f11590f.getTextureView();
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
                        Bitmap bitmap = s6Var.f11591g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != s6Var.f11591g.getHeight()) {
                            s6Var.f11591g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(s6Var.f11591g);
                        Bitmap bitmap2 = s6Var.f11591g;
                        String str = s6Var.e;
                        q6 q6Var = null;
                        if (bitmap2 != null && (nVar = (s8.n) s6Var.f11587a.get()) != null && nVar.f48017b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            k6.c cVar = new k6.c(28);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            cVar.d = bitmap2;
                            a3.l lVar = (a3.l) cVar.f16405b;
                            lVar.f139a = width3;
                            lVar.f140b = height3;
                            SparseArray e12 = nVar.e1(cVar);
                            for (int i10 = 0; i10 < e12.size(); i10++) {
                                s8.m mVar = (s8.m) e12.valueAt(i10);
                                String str2 = mVar.f48008b;
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
                                    q6Var = new q6(trim, pointFArr);
                                }
                            }
                        }
                        q6 q6Var2 = s6Var.d;
                        if (q6Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (q6Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (q6Var != null && q6Var2 != null) {
                                PointF[] pointFArr2 = q6Var.f11486b;
                                PointF[] pointFArr3 = q6Var2.f11486b;
                                if (TextUtils.equals(q6Var.f11485a, q6Var2.f11485a)) {
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
                        s6Var.d = q6Var;
                        AndroidUtilities.runOnUIThread(new e2.q0(13, s6Var, q6Var));
                    }
                    if (!s6Var.f11588b.get()) {
                        Utilities.globalQueue.cancelRunnable(s6Var.h);
                        Utilities.globalQueue.postRunnable(s6Var.h, s6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f11439b.f11589c.run(null);
                return;
        }
    }
}
