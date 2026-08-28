package kg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import ff.m0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.g60;
public final class a implements og.f, g60 {
    public final int f14797a;
    public final boolean f14798b;
    public final Object f14799c;

    public a(int i9, Object obj, boolean z10) {
        this.f14799c = obj;
        this.f14797a = i9;
        this.f14798b = z10;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, float[] fArr) {
        Paint paint;
        Path.Direction direction;
        float f10;
        d dVar = (d) this.f14799c;
        float[] fArr2 = d.C;
        c cVar = dVar.h;
        Path path = new Path();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction2);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f14797a);
        float f11 = dVar.f14824l;
        if (f11 > 0.0f) {
            paint2.setShadowLayer(f11, 0.0f, dVar.f14825m, dVar.d);
        }
        canvas.drawPath(path, paint2);
        if (dVar.f14824l > 0.0f) {
            paint2.clearShadowLayer();
            canvas.drawPath(path, paint2);
        }
        if (this.f14798b) {
            float[] copyOf = Arrays.copyOf(cVar.f14803b, 8);
            boolean c10 = m0.c(copyOf);
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            Paint paint3 = new Paint(1);
            if (Color.alpha(dVar.f14819f) > 0 && copyOf[0] > 0.0f) {
                Arrays.fill(fArr2, 0.0f);
                fArr2[0] = copyOf[0];
                fArr2[1] = copyOf[1];
                fArr2[2] = copyOf[2];
                fArr2[3] = copyOf[3];
                if (c10 && copyOf[0] > min) {
                    fArr2[3] = min;
                    fArr2[2] = min;
                    fArr2[1] = min;
                    fArr2[0] = min;
                }
                Path path2 = new Path();
                float f12 = rectF.left;
                float f13 = rectF.top;
                f10 = 0.0f;
                paint = paint3;
                path2.addRoundRect(f12, f13, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f13, rectF.bottom), fArr2, direction2);
                direction = direction2;
                float f14 = rectF.left;
                float f15 = rectF.top;
                path2.addRoundRect(f14, cVar.f14808i + f15, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f15, rectF.bottom), fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f14819f);
                canvas.drawPath(path2, paint);
            } else {
                paint = paint3;
                direction = direction2;
                f10 = 0.0f;
            }
            if (Color.alpha(dVar.f14820g) > 0 && copyOf[4] > f10) {
                Arrays.fill(fArr2, 0.0f);
                fArr2[4] = copyOf[4];
                fArr2[5] = copyOf[5];
                fArr2[6] = copyOf[6];
                fArr2[7] = copyOf[7];
                if (c10 && copyOf[0] > min) {
                    fArr2[7] = min;
                    fArr2[6] = min;
                    fArr2[5] = min;
                    fArr2[4] = min;
                }
                Path path3 = new Path();
                path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom, fArr2, direction);
                path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom - cVar.f14809j, fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f14820g);
                canvas.drawPath(path3, paint);
            }
        }
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        char c10;
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f14799c;
        boolean[] zArr = privacyControlActivity.A;
        int i9 = privacyControlActivity.P;
        int i10 = this.f14797a;
        boolean z12 = this.f14798b;
        int i11 = 0;
        boolean z13 = true;
        if (i10 == i9) {
            privacyControlActivity.D = arrayList;
            zArr[privacyControlActivity.E] = (z12 && z11) ? false : false;
            while (i11 < privacyControlActivity.D.size()) {
                privacyControlActivity.C.remove(privacyControlActivity.D.get(i11));
                i11++;
            }
        } else {
            boolean[] zArr2 = privacyControlActivity.f35904y;
            int i12 = privacyControlActivity.E;
            if (i12 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            zArr2[c10] = z10;
            zArr[i12] = (z12 && z11) ? false : false;
            privacyControlActivity.C = arrayList;
            while (i11 < privacyControlActivity.C.size()) {
                privacyControlActivity.D.remove(privacyControlActivity.C.get(i11));
                i11++;
            }
        }
        privacyControlActivity.D0();
        privacyControlActivity.f35871a.l();
    }
}
