package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class sb {
    public final ec A;
    public Runnable f26763b;
    public boolean f26764c;
    public String d;
    public String f26765e;
    public String f26766f;
    public String f26767g;
    public yv h;
    public fc f26768i;
    public Object f26769j;
    public long f26770k;
    public int f26771l;
    public int f26772m;
    public int f26773n;
    public int f26774o;
    public File f26775p;
    public File f26776q;
    public File f26777r;
    public rb f26778s;
    public zb f26779t;
    public tb f26780u;
    public int f26762a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f26781w = new ArrayList();
    public final ArrayList f26782x = new ArrayList();
    public final ArrayList f26783y = new ArrayList();
    public final ArrayList f26784z = new ArrayList();

    public sb(ec ecVar) {
        this.A = ecVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f26781w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f26782x.add(str);
        this.f26783y.add(str2);
        this.f26784z.add(Integer.valueOf(i7));
        this.A.f23684k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f26772m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f26781w.remove(i10);
                this.f26782x.remove(i10);
                this.f26783y.remove(i10);
                i7 = ((Integer) this.f26784z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23684k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26768i != null && !this.A.f23695w.containsKey(this.d)) {
                fc fcVar = this.f26768i;
                if (fcVar.f23868f != null) {
                    w7.G(this.f26774o).e(null, null, null, this.f26768i.f23868f, this.f26767g, null);
                } else if (fcVar.f23870i != null) {
                    w7.G(this.f26774o).f(this.f26768i.f23870i);
                } else if (fcVar.h != null) {
                    w7.G(this.f26774o).e(null, this.f26768i.h, null, null, null, null);
                } else if (fcVar.v != null) {
                    w7.G(this.f26774o).e(null, null, this.f26768i.v, null, null, null);
                }
            }
            tb tbVar = this.f26780u;
            if (tbVar != null) {
                if (i7 == 1) {
                    this.A.f23690q.a(tbVar);
                } else {
                    ((of.a) this.A.f23689p.f6486b).remove(tbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23689p;
                    Runnable runnable = this.f26763b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6486b).remove(runnable);
                    }
                }
                tb tbVar2 = this.f26780u;
                synchronized (tbVar2.f26976b) {
                    try {
                        tbVar2.d = true;
                        Thread thread = tbVar2.f26975a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f26780u = null;
            }
            zb zbVar = this.f26779t;
            if (zbVar != null) {
                this.A.f23687n.remove(zbVar);
                this.f26779t.cancel(true);
                this.f26779t = null;
            }
            rb rbVar = this.f26778s;
            if (rbVar != null) {
                this.A.f23688o.remove(rbVar);
                this.f26778s.cancel(true);
                this.f26778s = null;
            }
            String str = this.f26765e;
            if (str != null) {
                this.A.f23681g.remove(str);
            }
            String str2 = this.f26765e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23682i.remove(str3);
                this.A.f23683j.remove(ec.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        sb sbVar;
        ec ecVar;
        ArrayList arrayList = this.f26781w;
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
            ecVar.f23684k.remove(((ImageReceiver) arrayList2.get(i7)).G(sbVar.f26772m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = sbVar.f26765e;
        if (str2 != null) {
            ecVar.f23681g.remove(str2);
        }
        String str3 = sbVar.f26765e;
        if (str3 != null) {
            ecVar.h.remove(str3);
        }
        String str4 = sbVar.d;
        if (str4 != null) {
            ecVar.f23682i.remove(str4);
            ecVar.f23683j.remove(ec.n(sbVar.d));
        }
    }
}
