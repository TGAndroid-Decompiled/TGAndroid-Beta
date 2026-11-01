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
    public boolean f11190a;
    public float f11191b;
    public float f11192c;
    public int d;
    public StaticLayout e;
    public Bitmap f11193f;
    public int f11194g;
    public int h;
    public int f11195i;
    public long f11196j;
    public float f11197k;
    public float f11198l;
    public final o f11199m;

    public n(o oVar) {
        this.f11199m = oVar;
    }

    public final void a(int i10, boolean z10) {
        float f7;
        ArrayList arrayList;
        o oVar = this.f11199m;
        ArrayList arrayList2 = oVar.e;
        HashMap hashMap = (HashMap) oVar.f11206f;
        RectF rectF = (RectF) oVar.f11207g;
        d5.a aVar = Utilities.f14521c;
        this.f11196j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.f11197k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = p.f11213a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.f11197k *= 0.6f;
        } else if (str.length() > 5) {
            this.f11197k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, oVar.d, org.telegram.messenger.i0.f16172q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.f11195i = 0;
            this.h = 0;
            this.f11194g = 0;
        } else {
            this.f11194g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.f11195i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f11193f = bitmap;
        if (bitmap == null) {
            this.f11193f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.f11194g)), Math.max(1, this.f11195i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f11193f);
            canvas.translate(-this.f11194g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f11193f);
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
            d5.a aVar2 = Utilities.f14521c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f13) + f11;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f15 = 2.1474836E9f;
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                n nVar = (n) arrayList2.get(i12);
                if (!nVar.f11190a) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.f11197k / oVar.f11203a) * nVar.h) * 1.1f) + nVar.f11191b) - abs3), Math.abs(nVar.f11191b - abs3));
                    float f16 = nVar.f11192c - abs4;
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
        this.f11191b = abs;
        this.f11192c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.f11192c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        d5.a aVar3 = Utilities.f14521c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        if (z10) {
            f7 = Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f);
        } else {
            f7 = 0.0f;
        }
        this.f11198l = f7;
        this.f11190a = true;
    }
}
