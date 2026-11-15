package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class tb {
    public final fc A;
    public Runnable f26635b;
    public boolean f26636c;
    public String d;
    public String f26637e;
    public String f26638f;
    public String f26639g;
    public cw h;
    public gc f26640i;
    public Object f26641j;
    public long f26642k;
    public int f26643l;
    public int f26644m;
    public int f26645n;
    public int f26646o;
    public File f26647p;
    public File f26648q;
    public File f26649r;
    public sb f26650s;
    public ac f26651t;
    public ub f26652u;
    public int f26634a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f26653w = new ArrayList();
    public final ArrayList f26654x = new ArrayList();
    public final ArrayList f26655y = new ArrayList();
    public final ArrayList f26656z = new ArrayList();

    public tb(fc fcVar) {
        this.A = fcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f26653w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f26654x.add(str);
        this.f26655y.add(str2);
        this.f26656z.add(Integer.valueOf(i7));
        this.A.f23468k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f26644m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f26653w.remove(i10);
                this.f26654x.remove(i10);
                this.f26655y.remove(i10);
                i7 = ((Integer) this.f26656z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23468k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26640i != null && !this.A.f23479w.containsKey(this.d)) {
                gc gcVar = this.f26640i;
                if (gcVar.f23715f != null) {
                    w7.G(this.f26646o).e(null, null, null, this.f26640i.f23715f, this.f26639g, null);
                } else if (gcVar.f23717i != null) {
                    w7.G(this.f26646o).f(this.f26640i.f23717i);
                } else if (gcVar.h != null) {
                    w7.G(this.f26646o).e(null, this.f26640i.h, null, null, null, null);
                } else if (gcVar.v != null) {
                    w7.G(this.f26646o).e(null, null, this.f26640i.v, null, null, null);
                }
            }
            ub ubVar = this.f26652u;
            if (ubVar != null) {
                if (i7 == 1) {
                    this.A.f23474q.a(ubVar);
                } else {
                    ((of.a) this.A.f23473p.f6203b).remove(ubVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23473p;
                    Runnable runnable = this.f26635b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6203b).remove(runnable);
                    }
                }
                ub ubVar2 = this.f26652u;
                synchronized (ubVar2.f26797b) {
                    try {
                        ubVar2.d = true;
                        Thread thread = ubVar2.f26796a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f26652u = null;
            }
            ac acVar = this.f26651t;
            if (acVar != null) {
                this.A.f23471n.remove(acVar);
                this.f26651t.cancel(true);
                this.f26651t = null;
            }
            sb sbVar = this.f26650s;
            if (sbVar != null) {
                this.A.f23472o.remove(sbVar);
                this.f26650s.cancel(true);
                this.f26650s = null;
            }
            String str = this.f26637e;
            if (str != null) {
                this.A.f23465g.remove(str);
            }
            String str2 = this.f26637e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23466i.remove(str3);
                this.A.f23467j.remove(fc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        tb tbVar;
        fc fcVar;
        ArrayList arrayList = this.f26653w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            tbVar = this;
            g0.h3(new jn(tbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
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
            fcVar.f23468k.remove(((ImageReceiver) arrayList2.get(i7)).G(tbVar.f26644m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = tbVar.f26637e;
        if (str2 != null) {
            fcVar.f23465g.remove(str2);
        }
        String str3 = tbVar.f26637e;
        if (str3 != null) {
            fcVar.h.remove(str3);
        }
        String str4 = tbVar.d;
        if (str4 != null) {
            fcVar.f23466i.remove(str4);
            fcVar.f23467j.remove(fc.n(tbVar.d));
        }
    }
}
