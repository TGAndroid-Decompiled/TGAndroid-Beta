package gi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
public final class z5 implements Runnable {
    public final int f14029a;
    public final c6 f14030b;

    public z5(c6 c6Var, int i3) {
        this.f14029a = i3;
        this.f14030b = c6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        t8.n nVar;
        switch (this.f14029a) {
            case 0:
                c6 c6Var = this.f14030b;
                if (c6Var.f12492a.get() != null && c6Var.f12496f != null && !c6Var.f12493b.get()) {
                    TextureView textureView = c6Var.f12496f.getTextureView();
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
                        Bitmap bitmap = c6Var.f12497g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != c6Var.f12497g.getHeight()) {
                            c6Var.f12497g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(c6Var.f12497g);
                        Bitmap bitmap2 = c6Var.f12497g;
                        String str = c6Var.f12495e;
                        a6 a6Var = null;
                        if (bitmap2 != null && (nVar = (t8.n) c6Var.f12492a.get()) != null && nVar.f55040b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            p7.d dVar = new p7.d(11);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            dVar.f53346c = bitmap2;
                            a7.d dVar2 = (a7.d) dVar.f53345b;
                            dVar2.f138a = width3;
                            dVar2.f139b = height3;
                            SparseArray e12 = nVar.e1(dVar);
                            for (int i3 = 0; i3 < e12.size(); i3++) {
                                t8.m mVar = (t8.m) e12.valueAt(i3);
                                String str2 = mVar.f55030b;
                                Point[] pointArr = mVar.f55032e;
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
                                    a6Var = new a6(trim, pointFArr);
                                }
                            }
                        }
                        a6 a6Var2 = c6Var.d;
                        if (a6Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (a6Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (a6Var != null && a6Var2 != null) {
                                PointF[] pointFArr2 = a6Var.f12391b;
                                PointF[] pointFArr3 = a6Var2.f12391b;
                                if (TextUtils.equals(a6Var.f12390a, a6Var2.f12390a)) {
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
                        c6Var.d = a6Var;
                        org.telegram.messenger.g0.h3(new g2.c(17, c6Var, a6Var));
                    }
                    if (!c6Var.f12493b.get()) {
                        Utilities.f21387e.a(c6Var.h);
                        Utilities.f21387e.e(c6Var.h, c6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f14030b.f12494c.a(null);
                return;
        }
    }
}
