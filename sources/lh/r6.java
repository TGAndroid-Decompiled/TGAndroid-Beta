package lh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class r6 implements Runnable {

    public final int f16649a;

    public final u6 f16650b;

    public r6(u6 u6Var, int i10) {
        this.f16649a = i10;
        this.f16650b = u6Var;
    }

    @Override
    public final void run() {
        c8.n nVar;
        switch (this.f16649a) {
            case 0:
                u6 u6Var = this.f16650b;
                if (u6Var.f16907a.get() != null && u6Var.f16911f != null && !u6Var.f16908b.get()) {
                    TextureView textureView = u6Var.f16911f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f10 = width;
                            float f11 = height;
                            float fMin = Math.min(720.0f / f10, 720.0f / f11);
                            width = (int) (f10 * fMin);
                            height = (int) (f11 * fMin);
                        }
                        int iMax = Math.max(1, width);
                        int iMax2 = Math.max(1, height);
                        Bitmap bitmap = u6Var.f16912g;
                        if (bitmap == null || iMax != bitmap.getWidth() || iMax2 != u6Var.f16912g.getHeight()) {
                            u6Var.f16912g = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(u6Var.f16912g);
                        Bitmap bitmap2 = u6Var.f16912g;
                        String str = u6Var.f16910e;
                        s6 s6Var = null;
                        if (bitmap2 != null && (nVar = (c8.n) u6Var.f16907a.get()) != null && nVar.f2560b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            a5.n nVar2 = new a5.n(5);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            nVar2.d = bitmap2;
                            b8.b bVar = (b8.b) nVar2.f100b;
                            bVar.f2041a = width3;
                            bVar.f2042b = height3;
                            SparseArray sparseArrayQ = nVar.Q(nVar2);
                            int i10 = 0;
                            while (true) {
                                if (i10 < sparseArrayQ.size()) {
                                    c8.m mVar = (c8.m) sparseArrayQ.valueAt(i10);
                                    String str2 = mVar.f2550b;
                                    Point[] pointArr = mVar.f2552e;
                                    if (str2 != null) {
                                        String strTrim = str2.trim();
                                        if (!strTrim.startsWith(str)) {
                                            if (!strTrim.startsWith("https://" + str)) {
                                                if (!strTrim.startsWith("http://" + str)) {
                                                }
                                            }
                                        }
                                        PointF[] pointFArr = new PointF[pointArr.length];
                                        for (int i11 = 0; i11 < pointArr.length; i11++) {
                                            Point point = pointArr[i11];
                                            pointFArr[i11] = new PointF(point.x / width2, point.y / height2);
                                        }
                                        s6Var = new s6(strTrim, pointFArr);
                                    }
                                    i10++;
                                }
                            }
                        }
                        s6 s6Var2 = u6Var.d;
                        if ((s6Var2 != null) != (s6Var != null)) {
                            u6Var.d = s6Var;
                            AndroidUtilities.runOnUIThread(new jh.p6(27, u6Var, s6Var));
                        } else if (s6Var != null && s6Var2 != null) {
                            PointF[] pointFArr2 = s6Var.f16728b;
                            PointF[] pointFArr3 = s6Var2.f16728b;
                            if (!TextUtils.equals(s6Var.f16727a, s6Var2.f16727a)) {
                                u6Var.d = s6Var;
                                AndroidUtilities.runOnUIThread(new jh.p6(27, u6Var, s6Var));
                            } else if (pointFArr2 != pointFArr3) {
                                if (pointFArr2.length != pointFArr3.length) {
                                    u6Var.d = s6Var;
                                    AndroidUtilities.runOnUIThread(new jh.p6(27, u6Var, s6Var));
                                } else {
                                    for (int i12 = 0; i12 < pointFArr2.length; i12++) {
                                        if (Math.abs(pointFArr2[i12].x - pointFArr3[i12].x) > 0.001f || Math.abs(pointFArr2[i12].y - pointFArr3[i12].y) > 0.001f) {
                                            u6Var.d = s6Var;
                                            AndroidUtilities.runOnUIThread(new jh.p6(27, u6Var, s6Var));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!u6Var.f16908b.get()) {
                        Utilities.globalQueue.cancelRunnable(u6Var.h);
                        Utilities.globalQueue.postRunnable(u6Var.h, u6Var.b());
                    }
                    break;
                }
                break;
            default:
                this.f16650b.f16909c.run(null);
                break;
        }
    }
}
