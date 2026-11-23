package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class tb {
    public final fc A;
    public Runnable f26991b;
    public boolean f26992c;
    public String d;
    public String f26993e;
    public String f26994f;
    public String f26995g;
    public zv h;
    public gc f26996i;
    public Object f26997j;
    public long f26998k;
    public int f26999l;
    public int f27000m;
    public int f27001n;
    public int f27002o;
    public File f27003p;
    public File f27004q;
    public File f27005r;
    public sb f27006s;
    public ac f27007t;
    public ub f27008u;
    public int f26990a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f27009w = new ArrayList();
    public final ArrayList f27010x = new ArrayList();
    public final ArrayList f27011y = new ArrayList();
    public final ArrayList f27012z = new ArrayList();

    public tb(fc fcVar) {
        this.A = fcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f27009w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f27010x.add(str);
        this.f27011y.add(str2);
        this.f27012z.add(Integer.valueOf(i7));
        this.A.f23893k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f27000m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f27009w.remove(i10);
                this.f27010x.remove(i10);
                this.f27011y.remove(i10);
                i7 = ((Integer) this.f27012z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23893k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26996i != null && !this.A.f23904w.containsKey(this.d)) {
                gc gcVar = this.f26996i;
                if (gcVar.f24116f != null) {
                    w7.G(this.f27002o).e(null, null, null, this.f26996i.f24116f, this.f26995g, null);
                } else if (gcVar.f24118i != null) {
                    w7.G(this.f27002o).f(this.f26996i.f24118i);
                } else if (gcVar.h != null) {
                    w7.G(this.f27002o).e(null, this.f26996i.h, null, null, null, null);
                } else if (gcVar.v != null) {
                    w7.G(this.f27002o).e(null, null, this.f26996i.v, null, null, null);
                }
            }
            ub ubVar = this.f27008u;
            if (ubVar != null) {
                if (i7 == 1) {
                    this.A.f23899q.a(ubVar);
                } else {
                    ((of.a) this.A.f23898p.f6518b).remove(ubVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23898p;
                    Runnable runnable = this.f26991b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6518b).remove(runnable);
                    }
                }
                ub ubVar2 = this.f27008u;
                synchronized (ubVar2.f27174b) {
                    try {
                        ubVar2.d = true;
                        Thread thread = ubVar2.f27173a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f27008u = null;
            }
            ac acVar = this.f27007t;
            if (acVar != null) {
                this.A.f23896n.remove(acVar);
                this.f27007t.cancel(true);
                this.f27007t = null;
            }
            sb sbVar = this.f27006s;
            if (sbVar != null) {
                this.A.f23897o.remove(sbVar);
                this.f27006s.cancel(true);
                this.f27006s = null;
            }
            String str = this.f26993e;
            if (str != null) {
                this.A.f23890g.remove(str);
            }
            String str2 = this.f26993e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23891i.remove(str3);
                this.A.f23892j.remove(fc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        tb tbVar;
        fc fcVar;
        ArrayList arrayList = this.f27009w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            tbVar = this;
            g0.g3(new gn(tbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            tbVar = this;
        }
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            fcVar = tbVar.A;
            if (i7 >= size) {
                break;
            }
            fcVar.f23893k.remove(((ImageReceiver) arrayList2.get(i7)).G(tbVar.f27000m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = tbVar.f26993e;
        if (str2 != null) {
            fcVar.f23890g.remove(str2);
        }
        String str3 = tbVar.f26993e;
        if (str3 != null) {
            fcVar.h.remove(str3);
        }
        String str4 = tbVar.d;
        if (str4 != null) {
            fcVar.f23891i.remove(str4);
            fcVar.f23892j.remove(fc.n(tbVar.d));
        }
    }
}
