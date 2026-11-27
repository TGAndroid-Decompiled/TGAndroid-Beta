package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class ly8 implements Runnable {
    public final byte a;
    public final oy8 b;

    public ly8(oy8 oy8Var, byte b) {
        this.a = b;
        this.b = oy8Var;
    }

    @Override
    public final void run() {
        boolean z;
        af0 af0Var;
        byte b = this.a;
        my8 my8Var = null;
        oy8 oy8Var = this.b;
        switch (b) {
            case 0:
                if (oy8Var.a.get() != null && ((xab) oy8Var.f) != null && !((AtomicBoolean) oy8Var.b).get()) {
                    TextureView textureView = ((xab) oy8Var.f).getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f = width;
                            float f2 = height;
                            float min = Math.min(720.0f / f, 720.0f / f2);
                            width = (int) (f * min);
                            height = (int) (f2 * min);
                        }
                        boolean z2 = true;
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = (Bitmap) oy8Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != ((Bitmap) oy8Var.g).getHeight()) {
                            oy8Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap((Bitmap) oy8Var.g);
                        Bitmap bitmap2 = (Bitmap) oy8Var.g;
                        String str = (String) oy8Var.e;
                        if (bitmap2 != null && (af0Var = (af0) oy8Var.a.get()) != null && af0Var.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            pm3 pm3Var = new pm3((byte) 4);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            pm3Var.d = bitmap2;
                            rc0 rc0Var = (rc0) pm3Var.b;
                            rc0Var.a = width3;
                            rc0Var.b = height3;
                            SparseArray h = af0Var.h(pm3Var);
                            for (int i = 0; i < h.size(); i++) {
                                ze0 ze0Var = (ze0) h.valueAt(i);
                                String str2 = ze0Var.b;
                                Point[] pointArr = ze0Var.e;
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!trim.startsWith(str)) {
                                        if (!trim.startsWith("https://" + str)) {
                                            if (!trim.startsWith("http://" + str)) {
                                            }
                                        }
                                    }
                                    PointF[] pointFArr = new PointF[pointArr.length];
                                    for (int i2 = 0; i2 < pointArr.length; i2++) {
                                        Point point = pointArr[i2];
                                        pointFArr[i2] = new PointF(point.x / width2, point.y / height2);
                                    }
                                    my8Var = new my8(trim, pointFArr);
                                }
                            }
                        }
                        my8 my8Var2 = (my8) oy8Var.d;
                        if (my8Var2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (my8Var == null) {
                            z2 = false;
                        }
                        if (z == z2) {
                            if (my8Var != null && my8Var2 != null) {
                                PointF[] pointFArr2 = my8Var.b;
                                PointF[] pointFArr3 = my8Var2.b;
                                if (TextUtils.equals(my8Var.a, my8Var2.a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            for (int i3 = 0; i3 < pointFArr2.length; i3++) {
                                                if (Math.abs(pointFArr2[i3].x - pointFArr3[i3].x) <= 0.001f && Math.abs(pointFArr2[i3].y - pointFArr3[i3].y) <= 0.001f) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        oy8Var.d = my8Var;
                        hl.c3(new ep8(oy8Var, my8Var, (byte) 20));
                    }
                    if (!((AtomicBoolean) oy8Var.b).get()) {
                        Utilities.e.a((ly8) oy8Var.h);
                        Utilities.e.d((ly8) oy8Var.h, oy8Var.d());
                        return;
                    }
                    return;
                }
                return;
            default:
                ((dab) oy8Var.c).a(null);
                return;
        }
    }
}
