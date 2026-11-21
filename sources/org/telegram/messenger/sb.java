package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class sb {
    public final ec A;
    public Runnable f26791b;
    public boolean f26792c;
    public String d;
    public String f26793e;
    public String f26794f;
    public String f26795g;
    public yv h;
    public fc f26796i;
    public Object f26797j;
    public long f26798k;
    public int f26799l;
    public int f26800m;
    public int f26801n;
    public int f26802o;
    public File f26803p;
    public File f26804q;
    public File f26805r;
    public rb f26806s;
    public zb f26807t;
    public tb f26808u;
    public int f26790a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f26809w = new ArrayList();
    public final ArrayList f26810x = new ArrayList();
    public final ArrayList f26811y = new ArrayList();
    public final ArrayList f26812z = new ArrayList();

    public sb(ec ecVar) {
        this.A = ecVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f26809w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f26810x.add(str);
        this.f26811y.add(str2);
        this.f26812z.add(Integer.valueOf(i7));
        this.A.f23712k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f26800m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f26809w.remove(i10);
                this.f26810x.remove(i10);
                this.f26811y.remove(i10);
                i7 = ((Integer) this.f26812z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23712k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26796i != null && !this.A.f23723w.containsKey(this.d)) {
                fc fcVar = this.f26796i;
                if (fcVar.f23896f != null) {
                    w7.G(this.f26802o).e(null, null, null, this.f26796i.f23896f, this.f26795g, null);
                } else if (fcVar.f23898i != null) {
                    w7.G(this.f26802o).f(this.f26796i.f23898i);
                } else if (fcVar.h != null) {
                    w7.G(this.f26802o).e(null, this.f26796i.h, null, null, null, null);
                } else if (fcVar.v != null) {
                    w7.G(this.f26802o).e(null, null, this.f26796i.v, null, null, null);
                }
            }
            tb tbVar = this.f26808u;
            if (tbVar != null) {
                if (i7 == 1) {
                    this.A.f23718q.a(tbVar);
                } else {
                    ((of.a) this.A.f23717p.f6515b).remove(tbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23717p;
                    Runnable runnable = this.f26791b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6515b).remove(runnable);
                    }
                }
                tb tbVar2 = this.f26808u;
                synchronized (tbVar2.f27004b) {
                    try {
                        tbVar2.d = true;
                        Thread thread = tbVar2.f27003a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f26808u = null;
            }
            zb zbVar = this.f26807t;
            if (zbVar != null) {
                this.A.f23715n.remove(zbVar);
                this.f26807t.cancel(true);
                this.f26807t = null;
            }
            rb rbVar = this.f26806s;
            if (rbVar != null) {
                this.A.f23716o.remove(rbVar);
                this.f26806s.cancel(true);
                this.f26806s = null;
            }
            String str = this.f26793e;
            if (str != null) {
                this.A.f23709g.remove(str);
            }
            String str2 = this.f26793e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23710i.remove(str3);
                this.A.f23711j.remove(ec.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        sb sbVar;
        ec ecVar;
        ArrayList arrayList = this.f26809w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            sbVar = this;
            g0.g3(new fn(sbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            sbVar = this;
        }
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            ecVar = sbVar.A;
            if (i7 >= size) {
                break;
            }
            ecVar.f23712k.remove(((ImageReceiver) arrayList2.get(i7)).G(sbVar.f26800m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = sbVar.f26793e;
        if (str2 != null) {
            ecVar.f23709g.remove(str2);
        }
        String str3 = sbVar.f26793e;
        if (str3 != null) {
            ecVar.h.remove(str3);
        }
        String str4 = sbVar.d;
        if (str4 != null) {
            ecVar.f23710i.remove(str4);
            ecVar.f23711j.remove(ec.n(sbVar.d));
        }
    }
}
