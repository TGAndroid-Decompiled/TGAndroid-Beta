package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class tob {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final byte e;
    public boolean f;
    public float g;
    public float h;

    public tob(int i) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.d.add(new Object());
        }
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        sob sobVar;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            sob sobVar2 = (sob) arrayList.get(i2);
            paint.setAlpha((int) (sobVar2.f * 255.0f * f2));
            canvas.drawPoint(sobVar2.a, sobVar2.b, paint);
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
                sobVar = (sob) arrayList2.get(i);
            } else {
                sobVar = new Object();
            }
            if (this.b && this.f) {
                float f3 = (i3 + 1) / j;
                sobVar.a = gl.R1(this.g, centerX, f3);
                sobVar.b = gl.R1(this.h, centerY, f3);
            } else {
                sobVar.a = centerX;
                sobVar.b = centerY;
            }
            SecureRandom secureRandom = Utilities.b;
            double d3 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            sobVar.c = (float) ((Math.cos(nextInt) * d3) - (Math.sin(nextInt) * d2));
            double d4 = nextInt;
            sob sobVar3 = sobVar;
            sobVar3.d = (float) ug8.d(d4, d2, Math.sin(nextInt) * d3);
            sobVar3.f = 1.0f;
            sobVar3.h = 0.0f;
            if (this.b) {
                sobVar3.g = secureRandom.nextInt(200) + 600;
                sobVar3.e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                sobVar3.g = secureRandom.nextInt(100) + 400;
                sobVar3.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(sobVar3);
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
            sob sobVar4 = (sob) arrayList.get(i4);
            float f4 = sobVar4.h;
            float f5 = sobVar4.g;
            if (f4 >= f5) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(sobVar4);
                }
                arrayList.remove(i4);
                i4--;
                size2--;
            } else {
                sobVar4.f = 1.0f - gl.F.getInterpolation(f4 / f5);
                float f6 = sobVar4.a;
                float f7 = sobVar4.c;
                float f8 = sobVar4.e;
                float f9 = (float) min;
                sobVar4.a = ls6.d(f7 * f8, f9, 200.0f, f6);
                sobVar4.b = (((sobVar4.d * f8) * f9) / 200.0f) + sobVar4.b;
                sobVar4.h += f9;
            }
            i4++;
        }
        this.a = elapsedRealtime;
    }

    public tob() {
        this(40);
    }
}
