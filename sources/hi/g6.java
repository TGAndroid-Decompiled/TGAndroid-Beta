package hi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i61;
public final class g6 implements Runnable {
    public final int f14542a;
    public final j6 f14543b;

    public g6(j6 j6Var, int i7) {
        this.f14542a = i7;
        this.f14543b = j6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        u8.n nVar;
        switch (this.f14542a) {
            case 0:
                j6 j6Var = this.f14543b;
                if (j6Var.f14730a.get() != null && j6Var.f14734f != null && !j6Var.f14731b.get()) {
                    TextureView textureView = j6Var.f14734f.getTextureView();
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
                        Bitmap bitmap = j6Var.f14735g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != j6Var.f14735g.getHeight()) {
                            j6Var.f14735g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(j6Var.f14735g);
                        Bitmap bitmap2 = j6Var.f14735g;
                        String str = j6Var.f14733e;
                        h6 h6Var = null;
                        if (bitmap2 != null && (nVar = (u8.n) j6Var.f14730a.get()) != null && nVar.f58651b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            i61 i61Var = new i61(20);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            i61Var.d = bitmap2;
                            b7.d dVar = (b7.d) i61Var.f35958b;
                            dVar.f2914a = width3;
                            dVar.f2915b = height3;
                            SparseArray e12 = nVar.e1(i61Var);
                            for (int i7 = 0; i7 < e12.size(); i7++) {
                                u8.m mVar = (u8.m) e12.valueAt(i7);
                                String str2 = mVar.f58641b;
                                Point[] pointArr = mVar.f58643e;
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
                                    h6Var = new h6(trim, pointFArr);
                                }
                            }
                        }
                        h6 h6Var2 = j6Var.d;
                        if (h6Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (h6Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (h6Var != null && h6Var2 != null) {
                                PointF[] pointFArr2 = h6Var.f14584b;
                                PointF[] pointFArr3 = h6Var2.f14584b;
                                if (TextUtils.equals(h6Var.f14583a, h6Var2.f14583a)) {
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
                        j6Var.d = h6Var;
                        org.telegram.messenger.g0.g3(new c(11, j6Var, h6Var));
                    }
                    if (!j6Var.f14731b.get()) {
                        Utilities.f22877e.a(j6Var.h);
                        Utilities.f22877e.d(j6Var.h, j6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f14543b.f14732c.a(null);
                return;
        }
    }
}
