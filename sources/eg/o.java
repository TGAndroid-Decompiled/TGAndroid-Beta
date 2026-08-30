package eg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.yh;
public final class o {
    public boolean f5380a;
    public float f5381b;
    public float f5382c;
    public int d;
    public StaticLayout e;
    public Bitmap f5383f;
    public int f5384g;
    public int h;
    public int f5385i;
    public long f5386j;
    public float f5387k;
    public float f5388l;
    public final p f5389m;

    public o(p pVar) {
        this.f5389m = pVar;
    }

    public final void a(int i10, boolean z4) {
        float f10;
        ArrayList arrayList;
        p pVar = this.f5389m;
        ArrayList arrayList2 = pVar.e;
        HashMap hashMap = (HashMap) pVar.f5418f;
        RectF rectF = (RectF) pVar.f5419g;
        this.f5386j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f5387k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = q.f5449a[yh.g(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f5387k *= 0.6f;
        } else if (str.length() > 5) {
            this.f5387k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, pVar.d, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f5385i = 0;
            this.h = 0;
            this.f5384g = 0;
        } else {
            this.f5384g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f5385i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f5383f = bitmap;
        if (bitmap == null) {
            this.f5383f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f5384g)), Math.max(1, this.f5385i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f5383f);
            canvas.translate(-this.f5384g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f5383f);
        }
        float f11 = this.h / 4.0f;
        float f12 = rectF.left + f11;
        float f13 = rectF.right - f11;
        if (i10 % 2 == 0) {
            f13 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f12 = rectF.centerX() + (this.h / 2.0f);
        }
        float f14 = f13 - f12;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % f14) + f12;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
        int i12 = 0;
        float f15 = 0.0f;
        while (i12 < 10) {
            float abs3 = Math.abs(Utilities.fastRandom.nextInt() % f14) + f12;
            float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f16 = 2.1474836E9f;
            while (i11 < arrayList2.size()) {
                o oVar = (o) arrayList2.get(i11);
                if (!oVar.f5380a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f5387k / pVar.f5415a) * oVar.h) * 1.1f) + oVar.f5381b) - abs3), Math.abs(oVar.f5381b - abs3));
                    float f17 = oVar.f5382c - abs4;
                    float f18 = (f17 * f17) + (min * min);
                    if (f18 < f16) {
                        f16 = f18;
                    }
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f16 > f15) {
                abs = abs3;
                f15 = f16;
                abs2 = abs4;
            }
            i12++;
            arrayList2 = arrayList3;
            i11 = 0;
        }
        this.f5381b = abs;
        this.f5382c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f5382c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z4) {
            f10 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f10 = 0.0f;
        }
        this.f5388l = f10;
        this.f5380a = true;
    }
}
