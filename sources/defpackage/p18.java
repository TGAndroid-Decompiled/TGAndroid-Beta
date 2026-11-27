package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
public final class p18 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f) {
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        try {
            ?? obj = new Object();
            obj.a = new ArrayList();
            obj.b = f * this.f;
            String[] split = str.split(" ");
            int i = 0;
            while (i < split.length) {
                char charAt = split[i].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                            i += 2;
                            obj2.b = (Float.parseFloat(split[i]) + f2) * f4;
                            obj.a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                        i += 2;
                        obj3.b = (Float.parseFloat(split[i]) + f2) * f4;
                        obj.a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.c = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    obj4.d = (Float.parseFloat(split[i + 2]) + f2) * f4;
                    obj4.e = (Float.parseFloat(split[i + 3]) + f3) * f4;
                    obj4.f = (Float.parseFloat(split[i + 4]) + f2) * f4;
                    obj4.a = (Float.parseFloat(split[i + 5]) + f3) * f4;
                    i += 6;
                    obj4.b = (Float.parseFloat(split[i]) + f2) * f4;
                    obj.a.add(obj4);
                }
                i++;
            }
            this.g.add(obj);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void b(android.graphics.Canvas r18, android.graphics.Paint r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p18.b(android.graphics.Canvas, android.graphics.Paint, float):void");
    }
}
