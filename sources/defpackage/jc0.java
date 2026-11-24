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
public final class jc0 extends Drawable {
    public final View a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final x46 c = new x46(new qx4(this), s33.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = 255;

    public jc0(int i, View view, int i2, int i3, float f) {
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
                ic0 ic0Var = (ic0) obj;
                if (ic0Var.c != 0 && !ic0Var.d) {
                    ic0Var.d = true;
                    ic0Var.a.I();
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
                ic0 ic0Var = (ic0) obj;
                if (ic0Var.d) {
                    ic0Var.d = false;
                    ic0Var.a.K();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.i != 0) {
            float f = bounds.left;
            float f2 = bounds.top;
            x46 x46Var = this.c;
            canvas.saveLayer(f, f2, f + x46Var.d.f.a, f2 + this.e, null);
            for (int size = x46Var.b.size() - 1; size >= 0; size--) {
                u46 i = x46Var.i(size);
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
                canvas.drawCircle(f6, f7, f5 + this.g, bkb.Fm);
                ic0 ic0Var = (ic0) obj;
                ic0Var.a.i0(f4, f2, width, width);
                ic0Var.a.setAlpha((this.i / 255.0f) * i.c());
                ic0Var.a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z) {
        ic0 ic0Var;
        x46 x46Var = this.c;
        if (list != null && !list.isEmpty()) {
            if (!z) {
                x46Var.m(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long n = cf3.n((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ic0Var = (ic0) obj;
                        if (ic0Var.c == n) {
                            break;
                        }
                    } else {
                        ic0Var = null;
                        break;
                    }
                }
                if (ic0Var == null) {
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            ic0Var = (ic0) obj2;
                            if (ic0Var.c == 0) {
                                break;
                            }
                        } else {
                            ic0Var = null;
                            break;
                        }
                    }
                }
                if (ic0Var == null) {
                    ic0Var = new ic0(this, this.a);
                    arrayList2.add(ic0Var);
                }
                ic0 ic0Var2 = ic0Var;
                ImageReceiver imageReceiver = ic0Var2.a;
                pb0 pb0Var = ic0Var2.b;
                if (ic0Var2.c != n) {
                    ic0Var2.c = n;
                    TLObject Z1 = na7.q1(this.b).Z1(n);
                    if (Z1 != null) {
                        pb0Var.o(Z1);
                        imageReceiver.U(Z1, pb0Var, null);
                    } else {
                        pb0Var.j(n, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(ic0Var2);
                if (this.d && !ic0Var2.d) {
                    ic0Var2.d = true;
                    imageReceiver.I();
                }
            }
            x46Var.m(arrayList, z);
            return;
        }
        x46Var.m(null, z);
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
