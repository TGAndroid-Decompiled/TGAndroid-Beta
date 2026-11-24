package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class tk5 {
    public final fl5 A;
    public Runnable b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public uu9 h;
    public gl5 i;
    public Object j;
    public long k;
    public byte l;
    public int m;
    public int n;
    public int o;
    public File p;
    public File q;
    public File r;
    public sk5 s;
    public al5 t;
    public uk5 u;
    public boolean a = true;
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    public tk5(fl5 fl5Var) {
        this.A = fl5Var;
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
                gl5 gl5Var = this.i;
                if (gl5Var.f != null) {
                    ba4.G(this.o).e(null, null, null, this.i.f, this.g, null);
                } else if (gl5Var.i != null) {
                    ba4.G(this.o).f(this.i.i);
                } else if (gl5Var.h != null) {
                    ba4.G(this.o).e(null, this.i.h, null, null, null, null);
                } else if (gl5Var.v != null) {
                    ba4.G(this.o).e(null, null, this.i.v, null, null, null);
                }
            }
            uk5 uk5Var = this.u;
            if (uk5Var != null) {
                fl5 fl5Var = this.A;
                if (i == 1) {
                    fl5Var.q.a(uk5Var);
                } else {
                    ((fo3) fl5Var.p.b).remove(uk5Var);
                    yv2 yv2Var = this.A.p;
                    Runnable runnable = this.b;
                    if (runnable == null) {
                        yv2Var.getClass();
                    } else {
                        ((fo3) yv2Var.b).remove(runnable);
                    }
                }
                uk5 uk5Var2 = this.u;
                synchronized (uk5Var2.b) {
                    try {
                        uk5Var2.d = true;
                        Thread thread = uk5Var2.a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.u = null;
            }
            al5 al5Var = this.t;
            if (al5Var != null) {
                this.A.n.remove(al5Var);
                this.t.cancel(true);
                this.t = null;
            }
            sk5 sk5Var = this.s;
            if (sk5Var != null) {
                this.A.o.remove(sk5Var);
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
                this.A.j.remove(fl5.j(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        tk5 tk5Var;
        fl5 fl5Var;
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            tk5Var = this;
            gl.d3(new vz4(tk5Var, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, (byte) 7));
        } else {
            tk5Var = this;
        }
        int i = 0;
        while (true) {
            int size = arrayList2.size();
            fl5Var = tk5Var.A;
            if (i >= size) {
                break;
            }
            fl5Var.k.remove(((ImageReceiver) arrayList2.get(i)).A(tk5Var.m));
            i++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = tk5Var.e;
        if (str2 != null) {
            fl5Var.g.remove(str2);
        }
        String str3 = tk5Var.e;
        if (str3 != null) {
            fl5Var.h.remove(str3);
        }
        String str4 = tk5Var.d;
        if (str4 != null) {
            fl5Var.i.remove(str4);
            fl5Var.j.remove(fl5.j(tk5Var.d));
        }
    }
}
