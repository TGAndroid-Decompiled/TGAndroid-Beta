package lg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import gf.m0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.k60;

public final class a implements pg.e, k60 {

    public final int f15575a;

    public final boolean f15576b;

    public final Object f15577c;

    public a(int i10, Object obj, boolean z10) {
        this.f15577c = obj;
        this.f15575a = i10;
        this.f15576b = z10;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, float[] fArr) {
        Paint paint;
        float f10;
        d dVar = (d) this.f15577c;
        float[] fArr2 = d.C;
        c cVar = dVar.h;
        Path path = new Path();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f15575a);
        float f11 = dVar.f15602l;
        if (f11 > 0.0f) {
            paint2.setShadowLayer(f11, 0.0f, dVar.f15603m, dVar.d);
        }
        canvas.drawPath(path, paint2);
        if (dVar.f15602l > 0.0f) {
            paint2.clearShadowLayer();
            canvas.drawPath(path, paint2);
        }
        if (this.f15576b) {
            float[] fArrCopyOf = Arrays.copyOf(cVar.f15581b, 8);
            boolean zC = m0.c(fArrCopyOf);
            float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
            Paint paint3 = new Paint(1);
            if (Color.alpha(dVar.f15597f) <= 0 || fArrCopyOf[0] <= 0.0f) {
                paint = paint3;
                f10 = 0.0f;
            } else {
                Arrays.fill(fArr2, 0.0f);
                fArr2[0] = fArrCopyOf[0];
                fArr2[1] = fArrCopyOf[1];
                fArr2[2] = fArrCopyOf[2];
                fArr2[3] = fArrCopyOf[3];
                if (zC && fArrCopyOf[0] > fMin) {
                    fArr2[3] = fMin;
                    fArr2[2] = fMin;
                    fArr2[1] = fMin;
                    fArr2[0] = fMin;
                }
                Path path2 = new Path();
                float f12 = rectF.left;
                float f13 = rectF.top;
                f10 = 0.0f;
                paint = paint3;
                path2.addRoundRect(f12, f13, rectF.right, Math.min(Math.max(fArrCopyOf[0], fArrCopyOf[2]) + f13, rectF.bottom), fArr2, direction);
                float f14 = rectF.left;
                float f15 = rectF.top;
                path2.addRoundRect(f14, cVar.f15586i + f15, rectF.right, Math.min(Math.max(fArrCopyOf[0], fArrCopyOf[2]) + f15, rectF.bottom), fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f15597f);
                canvas.drawPath(path2, paint);
            }
            if (Color.alpha(dVar.f15598g) <= 0 || fArrCopyOf[4] <= f10) {
                return;
            }
            Arrays.fill(fArr2, 0.0f);
            fArr2[4] = fArrCopyOf[4];
            fArr2[5] = fArrCopyOf[5];
            fArr2[6] = fArrCopyOf[6];
            fArr2[7] = fArrCopyOf[7];
            if (zC && fArrCopyOf[0] > fMin) {
                fArr2[7] = fMin;
                fArr2[6] = fMin;
                fArr2[5] = fMin;
                fArr2[4] = fMin;
            }
            Path path3 = new Path();
            path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(fArrCopyOf[4], fArrCopyOf[6]), rectF.top), rectF.right, rectF.bottom, fArr2, direction);
            path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(fArrCopyOf[4], fArrCopyOf[6]), rectF.top), rectF.right, rectF.bottom - cVar.f15587j, fArr2, Path.Direction.CCW);
            paint.setColor(dVar.f15598g);
            canvas.drawPath(path3, paint);
        }
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f15577c;
        boolean[] zArr = privacyControlActivity.A;
        int i10 = privacyControlActivity.P;
        int i11 = this.f15575a;
        boolean z12 = this.f15576b;
        int i12 = 0;
        if (i11 == i10) {
            privacyControlActivity.D = arrayList;
            zArr[privacyControlActivity.E] = z12 && z11;
            while (i12 < privacyControlActivity.D.size()) {
                privacyControlActivity.C.remove(privacyControlActivity.D.get(i12));
                i12++;
            }
        } else {
            boolean[] zArr2 = privacyControlActivity.f35907y;
            int i13 = privacyControlActivity.E;
            zArr2[i13 == 2 ? (char) 0 : (char) 1] = z10;
            zArr[i13] = z12 && z11;
            privacyControlActivity.C = arrayList;
            while (i12 < privacyControlActivity.C.size()) {
                privacyControlActivity.D.remove(privacyControlActivity.C.get(i12));
                i12++;
            }
        }
        privacyControlActivity.E0();
        privacyControlActivity.f35874a.l();
    }
}
