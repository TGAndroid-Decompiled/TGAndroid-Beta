package kg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class n {
    public boolean f11189a;
    public float f11190b;
    public float f11191c;
    public int d;
    public StaticLayout e;
    public Bitmap f11192f;
    public int f11193g;
    public int h;
    public int f11194i;
    public long f11195j;
    public float f11196k;
    public float f11197l;
    public final o f11198m;

    public n(o oVar) {
        this.f11198m = oVar;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        o oVar = this.f11198m;
        ArrayList arrayList2 = oVar.e;
        HashMap hashMap = (HashMap) oVar.f11205f;
        RectF rectF = (RectF) oVar.f11206g;
        d5.a aVar = Utilities.f14520c;
        this.f11195j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.f11196k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = p.f11212a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.f11196k *= 0.6f;
        } else if (str.length() > 5) {
            this.f11196k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, oVar.d, org.telegram.messenger.i0.f16026q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.f11194i = 0;
            this.h = 0;
            this.f11193g = 0;
        } else {
            this.f11193g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f11194i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f11192f = bitmap;
        if (bitmap == null) {
            this.f11192f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f11193g)), Math.max(1, this.f11194i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f11192f);
            canvas.translate(-this.f11193g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f11192f);
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
        float abs = Math.abs(((int) aVar.nextLong()) % f13) + f11;
        float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
        int i11 = 0;
        float f14 = 0.0f;
        while (i11 < 10) {
            d5.a aVar2 = Utilities.f14520c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f13) + f11;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f15 = 2.1474836E9f;
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                n nVar = (n) arrayList2.get(i12);
                if (!nVar.f11189a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f11196k / oVar.f11202a) * nVar.h) * 1.1f) + nVar.f11190b) - abs3), Math.abs(nVar.f11190b - abs3));
                    float f16 = nVar.f11191c - abs4;
                    float f17 = (f16 * f16) + (min * min);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                }
                i12++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f15 > f14) {
                abs2 = abs4;
                f14 = f15;
                abs = abs3;
            }
            i11++;
            arrayList2 = arrayList3;
        }
        this.f11190b = abs;
        this.f11191c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f11191c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        d5.a aVar3 = Utilities.f14520c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f11197l = f7;
        this.f11189a = true;
    }
}
