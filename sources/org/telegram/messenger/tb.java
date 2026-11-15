package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class tb {
    public final fc A;
    public Runnable f26644b;
    public boolean f26645c;
    public String d;
    public String f26646e;
    public String f26647f;
    public String f26648g;
    public cw h;
    public gc f26649i;
    public Object f26650j;
    public long f26651k;
    public int f26652l;
    public int f26653m;
    public int f26654n;
    public int f26655o;
    public File f26656p;
    public File f26657q;
    public File f26658r;
    public sb f26659s;
    public ac f26660t;
    public ub f26661u;
    public int f26643a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f26662w = new ArrayList();
    public final ArrayList f26663x = new ArrayList();
    public final ArrayList f26664y = new ArrayList();
    public final ArrayList f26665z = new ArrayList();

    public tb(fc fcVar) {
        this.A = fcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f26662w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f26663x.add(str);
        this.f26664y.add(str2);
        this.f26665z.add(Integer.valueOf(i7));
        this.A.f23471k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f26653m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f26662w.remove(i10);
                this.f26663x.remove(i10);
                this.f26664y.remove(i10);
                i7 = ((Integer) this.f26665z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23471k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26649i != null && !this.A.f23482w.containsKey(this.d)) {
                gc gcVar = this.f26649i;
                if (gcVar.f23717f != null) {
                    w7.G(this.f26655o).e(null, null, null, this.f26649i.f23717f, this.f26648g, null);
                } else if (gcVar.f23719i != null) {
                    w7.G(this.f26655o).f(this.f26649i.f23719i);
                } else if (gcVar.h != null) {
                    w7.G(this.f26655o).e(null, this.f26649i.h, null, null, null, null);
                } else if (gcVar.v != null) {
                    w7.G(this.f26655o).e(null, null, this.f26649i.v, null, null, null);
                }
            }
            ub ubVar = this.f26661u;
            if (ubVar != null) {
                if (i7 == 1) {
                    this.A.f23477q.a(ubVar);
                } else {
                    ((of.a) this.A.f23476p.f6206b).remove(ubVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23476p;
                    Runnable runnable = this.f26644b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6206b).remove(runnable);
                    }
                }
                ub ubVar2 = this.f26661u;
                synchronized (ubVar2.f26799b) {
                    try {
                        ubVar2.d = true;
                        Thread thread = ubVar2.f26798a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f26661u = null;
            }
            ac acVar = this.f26660t;
            if (acVar != null) {
                this.A.f23474n.remove(acVar);
                this.f26660t.cancel(true);
                this.f26660t = null;
            }
            sb sbVar = this.f26659s;
            if (sbVar != null) {
                this.A.f23475o.remove(sbVar);
                this.f26659s.cancel(true);
                this.f26659s = null;
            }
            String str = this.f26646e;
            if (str != null) {
                this.A.f23468g.remove(str);
            }
            String str2 = this.f26646e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23469i.remove(str3);
                this.A.f23470j.remove(fc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        tb tbVar;
        fc fcVar;
        ArrayList arrayList = this.f26662w;
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
            fcVar.f23471k.remove(((ImageReceiver) arrayList2.get(i7)).G(tbVar.f26653m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = tbVar.f26646e;
        if (str2 != null) {
            fcVar.f23468g.remove(str2);
        }
        String str3 = tbVar.f26646e;
        if (str3 != null) {
            fcVar.h.remove(str3);
        }
        String str4 = tbVar.d;
        if (str4 != null) {
            fcVar.f23469i.remove(str4);
            fcVar.f23470j.remove(fc.n(tbVar.d));
        }
    }
}
