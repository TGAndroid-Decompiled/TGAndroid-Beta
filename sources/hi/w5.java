package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.md0;
public final class w5 implements Runnable {
    public final int f15706a;
    public final z5 f15707b;

    public w5(z5 z5Var, int i7) {
        this.f15706a = i7;
        this.f15707b = z5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        u8.n nVar;
        switch (this.f15706a) {
            case 0:
                z5 z5Var = this.f15707b;
                if (z5Var.f15853a.get() != null && z5Var.f15857f != null && !z5Var.f15854b.get()) {
                    TextureView textureView = z5Var.f15857f.getTextureView();
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
                        Bitmap bitmap = z5Var.f15858g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != z5Var.f15858g.getHeight()) {
                            z5Var.f15858g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(z5Var.f15858g);
                        Bitmap bitmap2 = z5Var.f15858g;
                        String str = z5Var.f15856e;
                        x5 x5Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) z5Var.f15853a.get()) != null && nVar.f58567b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            md0 md0Var = new md0(18);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            md0Var.d = bitmap2;
                            b7.d dVar = (b7.d) md0Var.f49853b;
                            dVar.f2955a = width3;
                            dVar.f2956b = height3;
                            SparseArray e12 = nVar.e1(md0Var);
                            for (int i7 = 0; i7 < e12.size(); i7++) {
                                u8.m mVar = (u8.m) e12.valueAt(i7);
                                String str2 = mVar.f58557b;
                                Point[] pointArr = mVar.f58559e;
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
                                    x5Var = new x5(trim, pointFArr);
                                }
                            }
                        }
                        x5 x5Var2 = z5Var.d;
                        if (x5Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (x5Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (x5Var != null && x5Var2 != null) {
                                PointF[] pointFArr2 = x5Var.f15748b;
                                PointF[] pointFArr3 = x5Var2.f15748b;
                                if (TextUtils.equals(x5Var.f15747a, x5Var2.f15747a)) {
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
                        z5Var.d = x5Var;
                        org.telegram.messenger.g0.g3(new c(10, z5Var, x5Var));
                    }
                    if (!z5Var.f15854b.get()) {
                        Utilities.f22807e.a(z5Var.h);
                        Utilities.f22807e.d(z5Var.h, z5Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f15707b.f15855c.a(null);
                return;
        }
    }
}
