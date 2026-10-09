package ch;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.y60;
import yf.e0;
public final class a implements gh.f, y60 {
    public final int f4660a;
    public final boolean f4661b;
    public final Object f4662c;

    public a(int i10, Object obj, boolean z10) {
        this.f4662c = obj;
        this.f4660a = i10;
        this.f4661b = z10;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, float[] fArr) {
        Paint paint;
        float f7;
        Path.Direction direction;
        d dVar = (d) this.f4662c;
        float[] fArr2 = d.E;
        c cVar = dVar.f4685j;
        Path path = new Path();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction2);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f4660a);
        float f10 = dVar.f4689n;
        if (f10 > 0.0f) {
            paint2.setShadowLayer(f10, 0.0f, dVar.f4690o, dVar.d);
        }
        canvas.drawPath(path, paint2);
        if (dVar.f4689n > 0.0f) {
            paint2.clearShadowLayer();
            canvas.drawPath(path, paint2);
        }
        if (this.f4661b) {
            float[] copyOf = Arrays.copyOf(cVar.f4666b, 8);
            boolean c10 = e0.c(copyOf);
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            Paint paint3 = new Paint(1);
            if (Color.alpha(dVar.f4682f) > 0 && copyOf[0] > 0.0f) {
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
                float f11 = rectF.left;
                float f12 = rectF.top;
                f7 = 0.0f;
                paint = paint3;
                path2.addRoundRect(f11, f12, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f12, rectF.bottom), fArr2, direction2);
                direction = direction2;
                float f13 = rectF.left;
                float f14 = rectF.top;
                path2.addRoundRect(f13, cVar.f4671i + f14, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f14, rectF.bottom), fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f4682f);
                canvas.drawPath(path2, paint);
            } else {
                paint = paint3;
                f7 = 0.0f;
                direction = direction2;
            }
            if (Color.alpha(dVar.f4683g) > 0 && copyOf[4] > f7) {
                Arrays.fill(fArr2, f7);
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
                path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom - cVar.f4672j, fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f4683g);
                canvas.drawPath(path3, paint);
            }
        }
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        char c10;
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f4662c;
        boolean[] zArr = privacyControlActivity.E;
        int i10 = privacyControlActivity.T;
        int i11 = this.f4660a;
        boolean z12 = this.f4661b;
        int i12 = 0;
        boolean z13 = true;
        if (i11 == i10) {
            privacyControlActivity.H = arrayList;
            int i13 = privacyControlActivity.I;
            if (!z12 || !z11) {
                z13 = false;
            }
            zArr[i13] = z13;
            while (i12 < privacyControlActivity.H.size()) {
                privacyControlActivity.G.remove(privacyControlActivity.H.get(i12));
                i12++;
            }
        } else {
            boolean[] zArr2 = privacyControlActivity.f34194y;
            int i14 = privacyControlActivity.I;
            if (i14 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            zArr2[c10] = z10;
            if (!z12 || !z11) {
                z13 = false;
            }
            zArr[i14] = z13;
            privacyControlActivity.G = arrayList;
            while (i12 < privacyControlActivity.G.size()) {
                privacyControlActivity.H.remove(privacyControlActivity.G.get(i12));
                i12++;
            }
        }
        privacyControlActivity.E0();
        privacyControlActivity.f34161a.l();
    }
}
