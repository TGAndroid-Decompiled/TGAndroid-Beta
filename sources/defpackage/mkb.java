package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class mkb extends Path {
    public static ArrayList d;
    public float a;
    public ArrayList b;
    public int c;

    @Override
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        RectF rectF;
        ArrayList arrayList = d;
        if (arrayList != null && arrayList.size() > 0) {
            rectF = (RectF) d.remove(0);
        } else {
            rectF = new RectF();
        }
        rectF.set(f, f2, f3, f4);
        this.b.add(rectF);
        this.c++;
        super.addRect(f, f2, f3, f4, direction);
        if (f4 > this.a) {
            this.a = f4;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.b;
        super.reset();
        ArrayList arrayList2 = d;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList(arrayList.size());
            d = arrayList2;
        }
        arrayList2.addAll(arrayList);
        arrayList.clear();
        this.c = 0;
        this.a = 0.0f;
    }
}
