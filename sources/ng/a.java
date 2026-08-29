package ng;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import jf.l0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.i60;
public final class a implements rg.e, i60 {
    public final int f17321a;
    public final boolean f17322b;
    public final Object f17323c;

    public a(int i10, Object obj, boolean z10) {
        this.f17323c = obj;
        this.f17321a = i10;
        this.f17322b = z10;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, float[] fArr) {
        Paint paint;
        Path.Direction direction;
        float f9;
        d dVar = (d) this.f17323c;
        float[] fArr2 = d.C;
        c cVar = dVar.h;
        Path path = new Path();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction2);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f17321a);
        float f10 = dVar.f17348l;
        if (f10 > 0.0f) {
            paint2.setShadowLayer(f10, 0.0f, dVar.f17349m, dVar.d);
        }
        canvas.drawPath(path, paint2);
        if (dVar.f17348l > 0.0f) {
            paint2.clearShadowLayer();
            canvas.drawPath(path, paint2);
        }
        if (this.f17322b) {
            float[] copyOf = Arrays.copyOf(cVar.f17327b, 8);
            boolean c3 = l0.c(copyOf);
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            Paint paint3 = new Paint(1);
            if (Color.alpha(dVar.f17343f) > 0 && copyOf[0] > 0.0f) {
                Arrays.fill(fArr2, 0.0f);
                fArr2[0] = copyOf[0];
                fArr2[1] = copyOf[1];
                fArr2[2] = copyOf[2];
                fArr2[3] = copyOf[3];
                if (c3 && copyOf[0] > min) {
                    fArr2[3] = min;
                    fArr2[2] = min;
                    fArr2[1] = min;
                    fArr2[0] = min;
                }
                Path path2 = new Path();
                float f11 = rectF.left;
                float f12 = rectF.top;
                f9 = 0.0f;
                paint = paint3;
                path2.addRoundRect(f11, f12, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f12, rectF.bottom), fArr2, direction2);
                direction = direction2;
                float f13 = rectF.left;
                float f14 = rectF.top;
                path2.addRoundRect(f13, cVar.f17332i + f14, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f14, rectF.bottom), fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f17343f);
                canvas.drawPath(path2, paint);
            } else {
                paint = paint3;
                direction = direction2;
                f9 = 0.0f;
            }
            if (Color.alpha(dVar.f17344g) > 0 && copyOf[4] > f9) {
                Arrays.fill(fArr2, 0.0f);
                fArr2[4] = copyOf[4];
                fArr2[5] = copyOf[5];
                fArr2[6] = copyOf[6];
                fArr2[7] = copyOf[7];
                if (c3 && copyOf[0] > min) {
                    fArr2[7] = min;
                    fArr2[6] = min;
                    fArr2[5] = min;
                    fArr2[4] = min;
                }
                Path path3 = new Path();
                path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom, fArr2, direction);
                path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom - cVar.f17333j, fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f17344g);
                canvas.drawPath(path3, paint);
            }
        }
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        char c3;
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f17323c;
        boolean[] zArr = privacyControlActivity.A;
        int i10 = privacyControlActivity.P;
        int i11 = this.f17321a;
        boolean z12 = this.f17322b;
        int i12 = 0;
        boolean z13 = true;
        if (i11 == i10) {
            privacyControlActivity.D = arrayList;
            zArr[privacyControlActivity.E] = (z12 && z11) ? false : false;
            while (i12 < privacyControlActivity.D.size()) {
                privacyControlActivity.C.remove(privacyControlActivity.D.get(i12));
                i12++;
            }
        } else {
            boolean[] zArr2 = privacyControlActivity.f35970y;
            int i13 = privacyControlActivity.E;
            if (i13 == 2) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            zArr2[c3] = z10;
            zArr[i13] = (z12 && z11) ? false : false;
            privacyControlActivity.C = arrayList;
            while (i12 < privacyControlActivity.C.size()) {
                privacyControlActivity.D.remove(privacyControlActivity.C.get(i12));
                i12++;
            }
        }
        privacyControlActivity.E0();
        privacyControlActivity.f35937a.l();
    }
}
