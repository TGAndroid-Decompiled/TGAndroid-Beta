package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
public class jx2 extends Path {
    public static ArrayList g;
    public int e;
    public int f;
    public boolean b = false;
    public boolean c = true;
    public float d = 0.0f;
    public final ArrayList a = new ArrayList(1);

    public jx2(int i) {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 34 && this.c && !this.b) {
            b(this.a);
            this.b = true;
        }
    }

    @Override
    public final void addRect(RectF rectF, Path.Direction direction) {
        RectF rectF2;
        if (Build.VERSION.SDK_INT >= 34 && this.c) {
            ArrayList arrayList = this.a;
            if (arrayList.size() > 0 && ((RectF) c00.g(1, arrayList)).contains(rectF)) {
                return;
            }
            if (arrayList.size() > 0 && Math.abs(rectF.top - ((RectF) c00.g(1, arrayList)).top) <= this.d && Math.abs(rectF.bottom - ((RectF) c00.g(1, arrayList)).bottom) <= this.d) {
                ((RectF) c00.g(1, arrayList)).union(rectF);
            } else {
                ArrayList arrayList2 = g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    rectF2 = (RectF) g.remove(0);
                } else {
                    rectF2 = new RectF();
                }
                rectF2.set(rectF);
                arrayList.add(rectF2);
            }
            this.b = false;
            return;
        }
        float f = rectF.left;
        int i = this.e;
        float f2 = f - i;
        float f3 = rectF.top;
        int i2 = this.f;
        super.addRect(f2, f3 - i2, rectF.right + i, rectF.bottom + i2, direction);
    }

    public final void b(List list) {
        if (!list.isEmpty()) {
            boolean z = false;
            if (list.size() == 1) {
                super.addRect(((RectF) list.get(0)).left - this.e, ((RectF) list.get(0)).top - this.f, ((RectF) list.get(0)).right + this.e, ((RectF) list.get(0)).bottom + this.f, Path.Direction.CW);
                return;
            }
            RectF rectF = (RectF) list.get(0);
            int size = list.size() - 1;
            super.moveTo(rectF.left - this.e, rectF.top - this.f);
            for (int i = 1; i < list.size(); i++) {
                RectF rectF2 = (RectF) list.get(i);
                if (rectF2.width() != 0.0f) {
                    float f = rectF.bottom;
                    int i2 = this.f;
                    float f2 = f + i2;
                    float f3 = rectF2.top;
                    if (f2 >= f3 - i2) {
                        float f4 = rectF.left;
                        if (f4 <= rectF2.right) {
                            float f5 = rectF.right;
                            float f6 = rectF2.left;
                            if (f5 >= f6) {
                                if (f4 != f6) {
                                    super.lineTo(f4 - this.e, f3);
                                    super.lineTo(rectF2.left - this.e, rectF2.top);
                                }
                                rectF = rectF2;
                            }
                        }
                    }
                    z = true;
                    size = i;
                    break;
                }
            }
            super.lineTo(rectF.left - this.e, rectF.bottom + this.f);
            super.lineTo(rectF.right + this.e, rectF.bottom + this.f);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                RectF rectF3 = (RectF) list.get(i3);
                if (rectF3.width() != 0.0f) {
                    float f7 = rectF.right;
                    if (f7 != rectF3.right) {
                        super.lineTo(f7 + this.e, rectF.top);
                        super.lineTo(rectF3.right + this.e, rectF.top);
                    }
                    rectF = rectF3;
                }
            }
            super.lineTo(rectF.right + this.e, rectF.top - this.f);
            super.close();
            if (z) {
                b(list.subList(size, list.size()));
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        if (Build.VERSION.SDK_INT >= 34 && this.c) {
            ArrayList arrayList = g;
            ArrayList arrayList2 = this.a;
            if (arrayList == null) {
                arrayList = new ArrayList(arrayList2.size());
                g = arrayList;
            }
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.b = false;
        }
    }

    @Override
    public final void rewind() {
        super.rewind();
        if (Build.VERSION.SDK_INT >= 34 && this.c) {
            ArrayList arrayList = g;
            ArrayList arrayList2 = this.a;
            if (arrayList == null) {
                arrayList = new ArrayList(arrayList2.size());
                g = arrayList;
            }
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.b = false;
        }
    }

    public jx2() {
    }

    @Override
    public void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        RectF rectF;
        if (Build.VERSION.SDK_INT >= 34 && this.c) {
            ArrayList arrayList = this.a;
            if (arrayList.size() <= 0 || !((RectF) c00.g(1, arrayList)).contains(f, f2, f3, f4)) {
                if (arrayList.size() > 0 && Math.abs(f2 - ((RectF) c00.g(1, arrayList)).top) <= this.d && Math.abs(f4 - ((RectF) c00.g(1, arrayList)).bottom) <= this.d) {
                    ((RectF) c00.g(1, arrayList)).union(f, f2, f3, f4);
                } else {
                    ArrayList arrayList2 = g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        rectF = (RectF) g.remove(0);
                    } else {
                        rectF = new RectF();
                    }
                    rectF.set(f, f2, f3, f4);
                    arrayList.add(rectF);
                }
                this.b = false;
                return;
            }
            return;
        }
        int i = this.e;
        int i2 = this.f;
        super.addRect(f - i, f2 - i2, f3 + i, f4 + i2, direction);
    }
}
