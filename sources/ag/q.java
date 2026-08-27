package ag;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.pa;

public final class q {

    public boolean f609a;

    public float f610b;

    public float f611c;
    public int d;

    public StaticLayout f612e;

    public Bitmap f613f;

    public int f614g;
    public int h;

    public int f615i;

    public long f616j;

    public float f617k;

    public float f618l;

    public final r f619m;

    public q(r rVar) {
        this.f619m = rVar;
    }

    public final void a(int i10, boolean z10) {
        ArrayList arrayList;
        r rVar = this.f619m;
        ArrayList arrayList2 = rVar.f630e;
        HashMap map = (HashMap) rVar.f631f;
        RectF rectF = (RectF) rVar.f632g;
        this.f616j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f617k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = s.f638a[pa.f(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f617k *= 0.6f;
        } else if (str.length() > 5) {
            this.f617k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, rVar.d, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f612e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f615i = 0;
            this.h = 0;
            this.f614g = 0;
        } else {
            this.f614g = (int) this.f612e.getLineLeft(0);
            this.h = (int) this.f612e.getLineWidth(0);
            this.f615i = this.f612e.getHeight();
        }
        Bitmap bitmap = (Bitmap) map.get(str);
        this.f613f = bitmap;
        if (bitmap == null) {
            this.f613f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f614g)), Math.max(1, this.f615i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f613f);
            canvas.translate(-this.f614g, 0.0f);
            this.f612e.draw(canvas);
            map.put(str, this.f613f);
        }
        float f10 = rectF.left;
        float f11 = this.h / 4.0f;
        float fCenterX = f10 + f11;
        float fCenterX2 = rectF.right - f11;
        if (i10 % 2 == 0) {
            fCenterX2 = rectF.centerX() - (this.h / 2.0f);
        } else {
            fCenterX = rectF.centerX() + (this.h / 2.0f);
        }
        float f12 = fCenterX2 - fCenterX;
        float fAbs = Math.abs(Utilities.fastRandom.nextInt() % f12) + fCenterX;
        float fAbs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
        int i12 = 0;
        float f13 = 0.0f;
        while (i12 < 10) {
            float fAbs3 = Math.abs(Utilities.fastRandom.nextInt() % f12) + fCenterX;
            float fAbs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f14 = 2.1474836E9f;
            while (i11 < arrayList2.size()) {
                q qVar = (q) arrayList2.get(i11);
                if (qVar.f609a) {
                    arrayList = arrayList2;
                    float fMin = Math.min(Math.abs(((((this.f617k / rVar.f627a) * qVar.h) * 1.1f) + qVar.f610b) - fAbs3), Math.abs(qVar.f610b - fAbs3));
                    float f15 = qVar.f611c - fAbs4;
                    float f16 = (f15 * f15) + (fMin * fMin);
                    if (f16 < f14) {
                        f14 = f16;
                    }
                } else {
                    arrayList = arrayList2;
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f14 > f13) {
                fAbs = fAbs3;
                f13 = f14;
                fAbs2 = fAbs4;
            }
            i12++;
            arrayList2 = arrayList3;
            i11 = 0;
        }
        this.f610b = fAbs;
        this.f611c = fAbs2;
        double dAtan2 = Math.atan2(fAbs - rectF.centerX(), this.f611c - rectF.centerY());
        Math.sin(dAtan2);
        Math.cos(dAtan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        this.f618l = z10 ? Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f) : 0.0f;
        this.f609a = true;
    }
}
