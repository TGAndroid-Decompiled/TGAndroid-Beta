package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class wm5 {
    public final in5 A;
    public Runnable b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public oy9 h;
    public jn5 i;
    public Object j;
    public long k;
    public byte l;
    public int m;
    public int n;
    public int o;
    public File p;
    public File q;
    public File r;
    public vm5 s;
    public dn5 t;
    public xm5 u;
    public boolean a = true;
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    public wm5(in5 in5Var) {
        this.A = in5Var;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i, int i2) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i2));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i2));
        this.x.add(str);
        this.y.add(str2);
        this.z.add(Integer.valueOf(i));
        this.A.k.put(imageReceiver.A(i), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        ArrayList arrayList;
        int i = this.m;
        int i2 = 0;
        while (true) {
            int size = this.v.size();
            arrayList = this.v;
            if (i2 >= size) {
                break;
            }
            ImageReceiver imageReceiver2 = (ImageReceiver) arrayList.get(i2);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i2);
                this.w.remove(i2);
                this.x.remove(i2);
                this.y.remove(i2);
                i = ((Integer) this.z.remove(i2)).intValue();
                if (imageReceiver2 != null) {
                    this.A.k.remove(imageReceiver2.A(i));
                }
                i2--;
            }
            i2++;
        }
        if (arrayList.isEmpty()) {
            if (this.i != null && !this.A.w.containsKey(this.d)) {
                jn5 jn5Var = this.i;
                if (jn5Var.f != null) {
                    xb4.G(this.o).e(null, null, null, this.i.f, this.g, null);
                } else if (jn5Var.i != null) {
                    xb4.G(this.o).f(this.i.i);
                } else if (jn5Var.h != null) {
                    xb4.G(this.o).e(null, this.i.h, null, null, null, null);
                } else if (jn5Var.v != null) {
                    xb4.G(this.o).e(null, null, this.i.v, null, null, null);
                }
            }
            xm5 xm5Var = this.u;
            if (xm5Var != null) {
                in5 in5Var = this.A;
                if (i == 1) {
                    in5Var.q.a(xm5Var);
                } else {
                    ((wo3) in5Var.p.b).remove(xm5Var);
                    sw2 sw2Var = this.A.p;
                    Runnable runnable = this.b;
                    if (runnable == null) {
                        sw2Var.getClass();
                    } else {
                        ((wo3) sw2Var.b).remove(runnable);
                    }
                }
                xm5 xm5Var2 = this.u;
                synchronized (xm5Var2.b) {
                    try {
                        xm5Var2.d = true;
                        Thread thread = xm5Var2.a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.u = null;
            }
            dn5 dn5Var = this.t;
            if (dn5Var != null) {
                this.A.n.remove(dn5Var);
                this.t.cancel(true);
                this.t = null;
            }
            vm5 vm5Var = this.s;
            if (vm5Var != null) {
                this.A.o.remove(vm5Var);
                this.s.cancel(true);
                this.s = null;
            }
            String str = this.e;
            if (str != null) {
                this.A.g.remove(str);
            }
            String str2 = this.e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.i.remove(str3);
                this.A.j.remove(in5.j(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        wm5 wm5Var;
        in5 in5Var;
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            wm5Var = this;
            hl.c3(new tw4(wm5Var, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, (byte) 8));
        } else {
            wm5Var = this;
        }
        int i = 0;
        while (true) {
            int size = arrayList2.size();
            in5Var = wm5Var.A;
            if (i >= size) {
                break;
            }
            in5Var.k.remove(((ImageReceiver) arrayList2.get(i)).A(wm5Var.m));
            i++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = wm5Var.e;
        if (str2 != null) {
            in5Var.g.remove(str2);
        }
        String str3 = wm5Var.e;
        if (str3 != null) {
            in5Var.h.remove(str3);
        }
        String str4 = wm5Var.d;
        if (str4 != null) {
            in5Var.i.remove(str4);
            in5Var.j.remove(in5.j(wm5Var.d));
        }
    }
}
