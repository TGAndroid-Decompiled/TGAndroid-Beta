package eh;

import a8.w0;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.n60;
public final class a implements ih.f, n60 {
    public final int f9944a;
    public final boolean f9945b;
    public final Object f9946c;

    public a(int i10, Object obj, boolean z10) {
        this.f9946c = obj;
        this.f9944a = i10;
        this.f9945b = z10;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, float[] fArr) {
        Paint paint;
        float f7;
        Path.Direction direction;
        d dVar = (d) this.f9946c;
        float[] fArr2 = d.W;
        c cVar = dVar.f9966x;
        Path path = new Path();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction2);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f9944a);
        float f10 = dVar.F;
        if (f10 > 0.0f) {
            paint2.setShadowLayer(f10, 0.0f, dVar.G, dVar.f9961f);
        }
        canvas.drawPath(path, paint2);
        if (dVar.F > 0.0f) {
            paint2.clearShadowLayer();
            canvas.drawPath(path, paint2);
        }
        if (this.f9945b) {
            float[] copyOf = Arrays.copyOf(cVar.f9950b, 8);
            boolean a2 = w0.a(copyOf);
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            Paint paint3 = new Paint(1);
            if (Color.alpha(dVar.f9962n) > 0 && copyOf[0] > 0.0f) {
                Arrays.fill(fArr2, 0.0f);
                fArr2[0] = copyOf[0];
                fArr2[1] = copyOf[1];
                fArr2[2] = copyOf[2];
                fArr2[3] = copyOf[3];
                if (a2 && copyOf[0] > min) {
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
                path2.addRoundRect(f13, cVar.f9954i + f14, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f14, rectF.bottom), fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f9962n);
                canvas.drawPath(path2, paint);
            } else {
                paint = paint3;
                f7 = 0.0f;
                direction = direction2;
            }
            if (Color.alpha(dVar.f9963r) > 0 && copyOf[4] > f7) {
                Arrays.fill(fArr2, f7);
                fArr2[4] = copyOf[4];
                fArr2[5] = copyOf[5];
                fArr2[6] = copyOf[6];
                fArr2[7] = copyOf[7];
                if (a2 && copyOf[0] > min) {
                    fArr2[7] = min;
                    fArr2[6] = min;
                    fArr2[5] = min;
                    fArr2[4] = min;
                }
                Path path3 = new Path();
                path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom, fArr2, direction);
                path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom - cVar.f9955j, fArr2, Path.Direction.CCW);
                paint.setColor(dVar.f9963r);
                canvas.drawPath(path3, paint);
            }
        }
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        char c10;
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f9946c;
        boolean[] zArr = privacyControlActivity.f35929y;
        int i10 = privacyControlActivity.S;
        int i11 = this.f9944a;
        boolean z12 = this.f9945b;
        int i12 = 0;
        boolean z13 = true;
        if (i11 == i10) {
            privacyControlActivity.G = arrayList;
            int i13 = privacyControlActivity.H;
            if (!z12 || !z11) {
                z13 = false;
            }
            zArr[i13] = z13;
            while (i12 < privacyControlActivity.G.size()) {
                privacyControlActivity.F.remove(privacyControlActivity.G.get(i12));
                i12++;
            }
        } else {
            boolean[] zArr2 = privacyControlActivity.f35927x;
            int i14 = privacyControlActivity.H;
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
            privacyControlActivity.F = arrayList;
            while (i12 < privacyControlActivity.F.size()) {
                privacyControlActivity.G.remove(privacyControlActivity.F.get(i12));
                i12++;
            }
        }
        privacyControlActivity.F0();
        privacyControlActivity.f35897a.l();
    }
}
