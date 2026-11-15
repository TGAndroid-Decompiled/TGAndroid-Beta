package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ld0;
public final class y5 implements Runnable {
    public final int f15422a;
    public final b6 f15423b;

    public y5(b6 b6Var, int i7) {
        this.f15422a = i7;
        this.f15423b = b6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        u8.n nVar;
        switch (this.f15422a) {
            case 0:
                b6 b6Var = this.f15423b;
                if (b6Var.f13931a.get() != null && b6Var.f13935f != null && !b6Var.f13932b.get()) {
                    TextureView textureView = b6Var.f13935f.getTextureView();
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
                        Bitmap bitmap = b6Var.f13936g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != b6Var.f13936g.getHeight()) {
                            b6Var.f13936g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(b6Var.f13936g);
                        Bitmap bitmap2 = b6Var.f13936g;
                        String str = b6Var.f13934e;
                        z5 z5Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) b6Var.f13931a.get()) != null && nVar.f57960b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            ld0 ld0Var = new ld0(18);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            ld0Var.d = bitmap2;
                            b7.d dVar = (b7.d) ld0Var.f48976b;
                            dVar.f2945a = width3;
                            dVar.f2946b = height3;
                            SparseArray e12 = nVar.e1(ld0Var);
                            for (int i7 = 0; i7 < e12.size(); i7++) {
                                u8.m mVar = (u8.m) e12.valueAt(i7);
                                String str2 = mVar.f57950b;
                                Point[] pointArr = mVar.f57952e;
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
                                    z5Var = new z5(trim, pointFArr);
                                }
                            }
                        }
                        z5 z5Var2 = b6Var.d;
                        if (z5Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z5Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (z5Var != null && z5Var2 != null) {
                                PointF[] pointFArr2 = z5Var.f15504b;
                                PointF[] pointFArr3 = z5Var2.f15504b;
                                if (TextUtils.equals(z5Var.f15503a, z5Var2.f15503a)) {
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
                        b6Var.d = z5Var;
                        org.telegram.messenger.g0.h3(new h4(6, b6Var, z5Var));
                    }
                    if (!b6Var.f13932b.get()) {
                        Utilities.f22416e.a(b6Var.h);
                        Utilities.f22416e.d(b6Var.h, b6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f15423b.f13933c.a(null);
                return;
        }
    }
}
