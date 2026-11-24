package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
public final class av8 implements Runnable {
    public final byte a;
    public final dv8 b;

    public av8(dv8 dv8Var, byte b) {
        this.a = b;
        this.b = dv8Var;
    }

    @Override
    public final void run() {
        boolean z;
        ye0 ye0Var;
        byte b = this.a;
        bv8 bv8Var = null;
        dv8 dv8Var = this.b;
        switch (b) {
            case 0:
                if (dv8Var.a.get() != null && ((y6b) dv8Var.f) != null && !((AtomicBoolean) dv8Var.b).get()) {
                    TextureView textureView = ((y6b) dv8Var.f).getTextureView();
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
                        Bitmap bitmap = (Bitmap) dv8Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != ((Bitmap) dv8Var.g).getHeight()) {
                            dv8Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap((Bitmap) dv8Var.g);
                        Bitmap bitmap2 = (Bitmap) dv8Var.g;
                        String str = (String) dv8Var.e;
                        if (bitmap2 != null && (ye0Var = (ye0) dv8Var.a.get()) != null && ye0Var.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            xl3 xl3Var = new xl3((byte) 4);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            xl3Var.d = bitmap2;
                            pc0 pc0Var = (pc0) xl3Var.b;
                            pc0Var.a = width3;
                            pc0Var.b = height3;
                            SparseArray h = ye0Var.h(xl3Var);
                            for (int i = 0; i < h.size(); i++) {
                                xe0 xe0Var = (xe0) h.valueAt(i);
                                String str2 = xe0Var.b;
                                Point[] pointArr = xe0Var.e;
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
                                    bv8Var = new bv8(trim, pointFArr);
                                }
                            }
                        }
                        bv8 bv8Var2 = (bv8) dv8Var.d;
                        if (bv8Var2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bv8Var == null) {
                            z2 = false;
                        }
                        if (z == z2) {
                            if (bv8Var != null && bv8Var2 != null) {
                                PointF[] pointFArr2 = bv8Var.b;
                                PointF[] pointFArr3 = bv8Var2.b;
                                if (TextUtils.equals(bv8Var.a, bv8Var2.a)) {
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
                        dv8Var.d = bv8Var;
                        gl.d3(new ll8(dv8Var, bv8Var, (byte) 21));
                    }
                    if (!((AtomicBoolean) dv8Var.b).get()) {
                        Utilities.e.a((av8) dv8Var.h);
                        Utilities.e.d((av8) dv8Var.h, dv8Var.d());
                        return;
                    }
                    return;
                }
                return;
            default:
                ((e6b) dv8Var.c).a(null);
                return;
        }
    }
}
