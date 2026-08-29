package cg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.th;
public final class o {
    public boolean f3227a;
    public float f3228b;
    public float f3229c;
    public int d;
    public StaticLayout f3230e;
    public Bitmap f3231f;
    public int f3232g;
    public int h;
    public int f3233i;
    public long f3234j;
    public float f3235k;
    public float f3236l;
    public final p f3237m;

    public o(p pVar) {
        this.f3237m = pVar;
    }

    public final void a(int i10, boolean z10) {
        float f9;
        ArrayList arrayList;
        p pVar = this.f3237m;
        ArrayList arrayList2 = pVar.f3254e;
        HashMap hashMap = (HashMap) pVar.f3255f;
        RectF rectF = (RectF) pVar.f3256g;
        this.f3234j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f3235k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = q.f3281a[th.f(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f3235k *= 0.6f;
        } else if (str.length() > 5) {
            this.f3235k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, pVar.d, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3230e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f3233i = 0;
            this.h = 0;
            this.f3232g = 0;
        } else {
            this.f3232g = (int) this.f3230e.getLineLeft(0);
            this.h = (int) this.f3230e.getLineWidth(0);
            this.f3233i = this.f3230e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f3231f = bitmap;
        if (bitmap == null) {
            this.f3231f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f3232g)), Math.max(1, this.f3233i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f3231f);
            canvas.translate(-this.f3232g, 0.0f);
            this.f3230e.draw(canvas);
            hashMap.put(str, this.f3231f);
        }
        float f10 = this.h / 4.0f;
        float f11 = rectF.left + f10;
        float f12 = rectF.right - f10;
        if (i10 % 2 == 0) {
            f12 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f11 = rectF.centerX() + (this.h / 2.0f);
        }
        float f13 = f12 - f11;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % f13) + f11;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
        int i12 = 0;
        float f14 = 0.0f;
        while (i12 < 10) {
            float abs3 = Math.abs(Utilities.fastRandom.nextInt() % f13) + f11;
            float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f15 = 2.1474836E9f;
            while (i11 < arrayList2.size()) {
                o oVar = (o) arrayList2.get(i11);
                if (!oVar.f3227a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f3235k / pVar.f3251a) * oVar.h) * 1.1f) + oVar.f3228b) - abs3), Math.abs(oVar.f3228b - abs3));
                    float f16 = oVar.f3229c - abs4;
                    float f17 = (f16 * f16) + (min * min);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f15 > f14) {
                abs = abs3;
                f14 = f15;
                abs2 = abs4;
            }
            i12++;
            arrayList2 = arrayList3;
            i11 = 0;
        }
        this.f3228b = abs;
        this.f3229c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f3229c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f9 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f9 = 0.0f;
        }
        this.f3236l = f9;
        this.f3227a = true;
    }
}
