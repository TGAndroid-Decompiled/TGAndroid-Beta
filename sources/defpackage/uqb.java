package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class uqb {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final byte e;
    public boolean f;
    public float g;
    public float h;

    public uqb(int i) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.d.add(new Object());
        }
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        tqb tqbVar;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            tqb tqbVar2 = (tqb) arrayList.get(i2);
            paint.setAlpha((int) (tqbVar2.f * 255.0f * f2));
            canvas.drawPoint(tqbVar2.a, tqbVar2.b, paint);
        }
        double d = (f - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d2 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d2) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z = true;
        int j = Utilities.j(arrayList2.size() / 12, 3, 1);
        int i3 = 0;
        while (i3 < j) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i);
                tqbVar = (tqb) arrayList2.get(i);
            } else {
                tqbVar = new Object();
            }
            if (this.b && this.f) {
                float f3 = (i3 + 1) / j;
                tqbVar.a = gm.R1(this.g, centerX, f3);
                tqbVar.b = gm.R1(this.h, centerY, f3);
            } else {
                tqbVar.a = centerX;
                tqbVar.b = centerY;
            }
            SecureRandom secureRandom = Utilities.b;
            double d3 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            tqbVar.c = (float) ((Math.cos(nextInt) * d3) - (Math.sin(nextInt) * d2));
            double d4 = nextInt;
            tqb tqbVar3 = tqbVar;
            tqbVar3.d = (float) wi8.d(d4, d2, Math.sin(nextInt) * d3);
            tqbVar3.f = 1.0f;
            tqbVar3.h = 0.0f;
            if (this.b) {
                tqbVar3.g = secureRandom.nextInt(200) + 600;
                tqbVar3.e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                tqbVar3.g = secureRandom.nextInt(100) + 400;
                tqbVar3.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(tqbVar3);
            i3++;
            sin = d3;
            i = 0;
            z = true;
        }
        this.f = z;
        this.g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.a);
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            tqb tqbVar4 = (tqb) arrayList.get(i4);
            float f4 = tqbVar4.h;
            float f5 = tqbVar4.g;
            if (f4 >= f5) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(tqbVar4);
                }
                arrayList.remove(i4);
                i4--;
                size2--;
            } else {
                tqbVar4.f = 1.0f - gm.F.getInterpolation(f4 / f5);
                float f6 = tqbVar4.a;
                float f7 = tqbVar4.c;
                float f8 = tqbVar4.e;
                float f9 = (float) min;
                tqbVar4.a = kt6.d(f7 * f8, f9, 200.0f, f6);
                tqbVar4.b = (((tqbVar4.d * f8) * f9) / 200.0f) + tqbVar4.b;
                tqbVar4.h += f9;
            }
            i4++;
        }
        this.a = elapsedRealtime;
    }

    public uqb() {
        this(40);
    }
}
