package fg;

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
    public boolean f6437a;
    public float f6438b;
    public float f6439c;
    public int d;
    public StaticLayout f6440e;
    public Bitmap f6441f;
    public int f6442g;
    public int h;
    public int f6443i;
    public long f6444j;
    public float f6445k;
    public float f6446l;
    public final p f6447m;

    public o(p pVar) {
        this.f6447m = pVar;
    }

    public final void a(int i10, boolean z4) {
        float f10;
        ArrayList arrayList;
        p pVar = this.f6447m;
        ArrayList arrayList2 = pVar.f6477e;
        HashMap hashMap = (HashMap) pVar.f6478f;
        RectF rectF = (RectF) pVar.f6479g;
        this.f6444j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.f6445k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = q.f6506a[yh.f(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.f6445k *= 0.6f;
        } else if (str.length() > 5) {
            this.f6445k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, pVar.d, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f6440e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.f6443i = 0;
            this.h = 0;
            this.f6442g = 0;
        } else {
            this.f6442g = (int) this.f6440e.getLineLeft(0);
            this.h = (int) this.f6440e.getLineWidth(0);
            this.f6443i = this.f6440e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f6441f = bitmap;
        if (bitmap == null) {
            this.f6441f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f6442g)), Math.max(1, this.f6443i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f6441f);
            canvas.translate(-this.f6442g, 0.0f);
            this.f6440e.draw(canvas);
            hashMap.put(str, this.f6441f);
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
                if (!oVar.f6437a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f6445k / pVar.f6474a) * oVar.h) * 1.1f) + oVar.f6438b) - abs3), Math.abs(oVar.f6438b - abs3));
                    float f17 = oVar.f6439c - abs4;
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
        this.f6438b = abs;
        this.f6439c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f6439c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z4) {
            f10 = Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f);
        } else {
            f10 = 0.0f;
        }
        this.f6446l = f10;
        this.f6437a = true;
    }
}
