package nh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f17705a;
    public final j6 f17706b;

    public g6(j6 j6Var, int i10) {
        this.f17705a = i10;
        this.f17706b = j6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        d8.n nVar;
        switch (this.f17705a) {
            case 0:
                j6 j6Var = this.f17706b;
                if (j6Var.f17958a.get() != null && j6Var.f17962f != null && !j6Var.f17959b.get()) {
                    TextureView textureView = j6Var.f17962f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f9 = width;
                            float f10 = height;
                            float min = Math.min(720.0f / f9, 720.0f / f10);
                            width = (int) (f9 * min);
                            height = (int) (f10 * min);
                        }
                        boolean z11 = true;
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = j6Var.f17963g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != j6Var.f17963g.getHeight()) {
                            j6Var.f17963g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(j6Var.f17963g);
                        Bitmap bitmap2 = j6Var.f17963g;
                        String str = j6Var.f17961e;
                        h6 h6Var = null;
                        if (bitmap2 != null && (nVar = (d8.n) j6Var.f17958a.get()) != null && nVar.f5528b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            androidx.biometric.e eVar = new androidx.biometric.e(5);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            eVar.d = bitmap2;
                            c8.a aVar = (c8.a) eVar.f1030b;
                            aVar.f3002a = width3;
                            aVar.f3003b = height3;
                            SparseArray Q = nVar.Q(eVar);
                            for (int i10 = 0; i10 < Q.size(); i10++) {
                                d8.m mVar = (d8.m) Q.valueAt(i10);
                                String str2 = mVar.f5518b;
                                Point[] pointArr = mVar.f5520e;
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
                                PointF[] pointFArr2 = h6Var.f17845b;
                                PointF[] pointFArr3 = h6Var2.f17845b;
                                if (TextUtils.equals(h6Var.f17844a, h6Var2.f17844a)) {
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
                        j6Var.d = h6Var;
                        AndroidUtilities.runOnUIThread(new b6(4, j6Var, h6Var));
                    }
                    if (!j6Var.f17959b.get()) {
                        Utilities.globalQueue.cancelRunnable(j6Var.h);
                        Utilities.globalQueue.postRunnable(j6Var.h, j6Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f17706b.f17960c.run(null);
                return;
        }
    }
}
