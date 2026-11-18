package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.md0;
public final class x5 implements Runnable {
    public final int f15729a;
    public final a6 f15730b;

    public x5(a6 a6Var, int i7) {
        this.f15729a = i7;
        this.f15730b = a6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        u8.n nVar;
        switch (this.f15729a) {
            case 0:
                a6 a6Var = this.f15730b;
                if (a6Var.f14235a.get() != null && a6Var.f14239f != null && !a6Var.f14236b.get()) {
                    TextureView textureView = a6Var.f14239f.getTextureView();
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
                        Bitmap bitmap = a6Var.f14240g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != a6Var.f14240g.getHeight()) {
                            a6Var.f14240g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(a6Var.f14240g);
                        Bitmap bitmap2 = a6Var.f14240g;
                        String str = a6Var.f14238e;
                        y5 y5Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) a6Var.f14235a.get()) != null && nVar.f58525b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            md0 md0Var = new md0(18);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            md0Var.d = bitmap2;
                            b7.d dVar = (b7.d) md0Var.f49838b;
                            dVar.f2942a = width3;
                            dVar.f2943b = height3;
                            SparseArray e12 = nVar.e1(md0Var);
                            for (int i7 = 0; i7 < e12.size(); i7++) {
                                u8.m mVar = (u8.m) e12.valueAt(i7);
                                String str2 = mVar.f58515b;
                                Point[] pointArr = mVar.f58517e;
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
                                    y5Var = new y5(trim, pointFArr);
                                }
                            }
                        }
                        y5 y5Var2 = a6Var.d;
                        if (y5Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (y5Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (y5Var != null && y5Var2 != null) {
                                PointF[] pointFArr2 = y5Var.f15771b;
                                PointF[] pointFArr3 = y5Var2.f15771b;
                                if (TextUtils.equals(y5Var.f15770a, y5Var2.f15770a)) {
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
                        a6Var.d = y5Var;
                        org.telegram.messenger.g0.g3(new r1(8, a6Var, y5Var));
                    }
                    if (!a6Var.f14236b.get()) {
                        Utilities.f22782e.a(a6Var.h);
                        Utilities.f22782e.d(a6Var.h, a6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f15730b.f14237c.a(null);
                return;
        }
    }
}
