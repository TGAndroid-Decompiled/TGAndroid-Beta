package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lc0 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final b76 c = new b76(new wz4(this), k43.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = 255;

    public lc0(int i, View view, int i2, int i3, float f) {
        this.b = i;
        this.a = view;
        this.e = i2;
        this.f = i3;
        this.g = f;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kc0 kc0Var = (kc0) obj;
                if (kc0Var.c != 0 && !kc0Var.d) {
                    kc0Var.d = true;
                    kc0Var.a.I();
                }
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kc0 kc0Var = (kc0) obj;
                if (kc0Var.d) {
                    kc0Var.d = false;
                    kc0Var.a.K();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.i != 0) {
            float f = bounds.left;
            float f2 = bounds.top;
            b76 b76Var = this.c;
            canvas.saveLayer(f, f2, f + b76Var.d.f.a, f2 + this.e, null);
            for (int size = b76Var.b.size() - 1; size >= 0; size--) {
                y66 i = b76Var.i(size);
                RectF b = i.b();
                Object obj = i.a;
                float f3 = i.f.a;
                float c = i.c();
                float width = b.width() - f3;
                float f4 = f + b.left + f3;
                float f5 = width / 2.0f;
                float f6 = f4 + f5;
                float f7 = f2 + f5;
                canvas.save();
                canvas.scale(c, c, f6, f7);
                canvas.drawCircle(f6, f7, f5 + this.g, aob.Gm);
                kc0 kc0Var = (kc0) obj;
                kc0Var.a.i0(f4, f2, width, width);
                kc0Var.a.setAlpha((this.i / 255.0f) * i.c());
                kc0Var.a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z) {
        kc0 kc0Var;
        b76 b76Var = this.c;
        if (list != null && !list.isEmpty()) {
            if (!z) {
                b76Var.m(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long n = wf3.n((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        kc0Var = (kc0) obj;
                        if (kc0Var.c == n) {
                            break;
                        }
                    } else {
                        kc0Var = null;
                        break;
                    }
                }
                if (kc0Var == null) {
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            kc0Var = (kc0) obj2;
                            if (kc0Var.c == 0) {
                                break;
                            }
                        } else {
                            kc0Var = null;
                            break;
                        }
                    }
                }
                if (kc0Var == null) {
                    kc0Var = new kc0(this, this.a);
                    arrayList2.add(kc0Var);
                }
                kc0 kc0Var2 = kc0Var;
                ImageReceiver imageReceiver = kc0Var2.a;
                rb0 rb0Var = kc0Var2.b;
                if (kc0Var2.c != n) {
                    kc0Var2.c = n;
                    TLObject b2 = uc7.s1(this.b).b2(n);
                    if (b2 != null) {
                        rb0Var.o(b2);
                        imageReceiver.U(b2, rb0Var, null);
                    } else {
                        rb0Var.j(n, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(kc0Var2);
                if (this.d && !kc0Var2.d) {
                    kc0Var2.d = true;
                    imageReceiver.I();
                }
            }
            b76Var.m(arrayList, z);
            return;
        }
        b76Var.m(null, z);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
        this.i = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
