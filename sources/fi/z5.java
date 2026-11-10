package fi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ly0;
public final class z5 implements Runnable {
    public final int f13248a;
    public final c6 f13249b;

    public z5(c6 c6Var, int i7) {
        this.f13248a = i7;
        this.f13249b = c6Var;
    }

    @Override
    public final void run() {
        boolean z9;
        u8.n nVar;
        switch (this.f13248a) {
            case 0:
                c6 c6Var = this.f13249b;
                if (c6Var.f11735a.get() != null && c6Var.f11739f != null && !c6Var.f11736b.get()) {
                    TextureView textureView = c6Var.f11739f.getTextureView();
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
                        boolean z10 = true;
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = c6Var.f11740g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != c6Var.f11740g.getHeight()) {
                            c6Var.f11740g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(c6Var.f11740g);
                        Bitmap bitmap2 = c6Var.f11740g;
                        String str = c6Var.f11738e;
                        a6 a6Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) c6Var.f11735a.get()) != null && nVar.f56461b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            ly0 ly0Var = new ly0(17);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            ly0Var.d = bitmap2;
                            b7.d dVar = (b7.d) ly0Var.f47746b;
                            dVar.f2991a = width3;
                            dVar.f2992b = height3;
                            SparseArray e12 = nVar.e1(ly0Var);
                            for (int i7 = 0; i7 < e12.size(); i7++) {
                                u8.m mVar = (u8.m) e12.valueAt(i7);
                                String str2 = mVar.f56451b;
                                Point[] pointArr = mVar.f56453e;
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
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (a6Var == null) {
                            z10 = false;
                        }
                        if (z9 == z10) {
                            if (a6Var != null && a6Var2 != null) {
                                PointF[] pointFArr2 = a6Var.f11612b;
                                PointF[] pointFArr3 = a6Var2.f11612b;
                                if (TextUtils.equals(a6Var.f11611a, a6Var2.f11611a)) {
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
                        org.telegram.messenger.g0.h3(new f2.h(11, c6Var, a6Var));
                    }
                    if (!c6Var.f11736b.get()) {
                        Utilities.f21341e.a(c6Var.h);
                        Utilities.f21341e.d(c6Var.h, c6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f13249b.f11737c.a(null);
                return;
        }
    }
}
