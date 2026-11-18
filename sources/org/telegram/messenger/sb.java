package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class sb {
    public final ec A;
    public Runnable f26765b;
    public boolean f26766c;
    public String d;
    public String f26767e;
    public String f26768f;
    public String f26769g;
    public yv h;
    public fc f26770i;
    public Object f26771j;
    public long f26772k;
    public int f26773l;
    public int f26774m;
    public int f26775n;
    public int f26776o;
    public File f26777p;
    public File f26778q;
    public File f26779r;
    public rb f26780s;
    public zb f26781t;
    public tb f26782u;
    public int f26764a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f26783w = new ArrayList();
    public final ArrayList f26784x = new ArrayList();
    public final ArrayList f26785y = new ArrayList();
    public final ArrayList f26786z = new ArrayList();

    public sb(ec ecVar) {
        this.A = ecVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f26783w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f26784x.add(str);
        this.f26785y.add(str2);
        this.f26786z.add(Integer.valueOf(i7));
        this.A.f23687k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f26774m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f26783w.remove(i10);
                this.f26784x.remove(i10);
                this.f26785y.remove(i10);
                i7 = ((Integer) this.f26786z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23687k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26770i != null && !this.A.f23698w.containsKey(this.d)) {
                fc fcVar = this.f26770i;
                if (fcVar.f23871f != null) {
                    w7.G(this.f26776o).e(null, null, null, this.f26770i.f23871f, this.f26769g, null);
                } else if (fcVar.f23873i != null) {
                    w7.G(this.f26776o).f(this.f26770i.f23873i);
                } else if (fcVar.h != null) {
                    w7.G(this.f26776o).e(null, this.f26770i.h, null, null, null, null);
                } else if (fcVar.v != null) {
                    w7.G(this.f26776o).e(null, null, this.f26770i.v, null, null, null);
                }
            }
            tb tbVar = this.f26782u;
            if (tbVar != null) {
                if (i7 == 1) {
                    this.A.f23693q.a(tbVar);
                } else {
                    ((of.a) this.A.f23692p.f6489b).remove(tbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23692p;
                    Runnable runnable = this.f26765b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6489b).remove(runnable);
                    }
                }
                tb tbVar2 = this.f26782u;
                synchronized (tbVar2.f26978b) {
                    try {
                        tbVar2.d = true;
                        Thread thread = tbVar2.f26977a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f26782u = null;
            }
            zb zbVar = this.f26781t;
            if (zbVar != null) {
                this.A.f23690n.remove(zbVar);
                this.f26781t.cancel(true);
                this.f26781t = null;
            }
            rb rbVar = this.f26780s;
            if (rbVar != null) {
                this.A.f23691o.remove(rbVar);
                this.f26780s.cancel(true);
                this.f26780s = null;
            }
            String str = this.f26767e;
            if (str != null) {
                this.A.f23684g.remove(str);
            }
            String str2 = this.f26767e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23685i.remove(str3);
                this.A.f23686j.remove(ec.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        sb sbVar;
        ec ecVar;
        ArrayList arrayList = this.f26783w;
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
            ecVar.f23687k.remove(((ImageReceiver) arrayList2.get(i7)).G(sbVar.f26774m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = sbVar.f26767e;
        if (str2 != null) {
            ecVar.f23684g.remove(str2);
        }
        String str3 = sbVar.f26767e;
        if (str3 != null) {
            ecVar.h.remove(str3);
        }
        String str4 = sbVar.d;
        if (str4 != null) {
            ecVar.f23685i.remove(str4);
            ecVar.f23686j.remove(ec.n(sbVar.d));
        }
    }
}
