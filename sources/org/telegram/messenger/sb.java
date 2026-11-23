package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class sb {
    public final ec A;
    public Runnable f26864b;
    public boolean f26865c;
    public String d;
    public String f26866e;
    public String f26867f;
    public String f26868g;
    public yv h;
    public fc f26869i;
    public Object f26870j;
    public long f26871k;
    public int f26872l;
    public int f26873m;
    public int f26874n;
    public int f26875o;
    public File f26876p;
    public File f26877q;
    public File f26878r;
    public rb f26879s;
    public zb f26880t;
    public tb f26881u;
    public int f26863a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f26882w = new ArrayList();
    public final ArrayList f26883x = new ArrayList();
    public final ArrayList f26884y = new ArrayList();
    public final ArrayList f26885z = new ArrayList();

    public sb(ec ecVar) {
        this.A = ecVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f26882w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f26883x.add(str);
        this.f26884y.add(str2);
        this.f26885z.add(Integer.valueOf(i7));
        this.A.f23789k.put(imageReceiver.H(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f26873m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f26882w.remove(i10);
                this.f26883x.remove(i10);
                this.f26884y.remove(i10);
                i7 = ((Integer) this.f26885z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23789k.remove(imageReceiver2.H(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26869i != null && !this.A.f23800w.containsKey(this.d)) {
                fc fcVar = this.f26869i;
                if (fcVar.f23976f != null) {
                    w7.G(this.f26875o).e(null, null, null, this.f26869i.f23976f, this.f26868g, null);
                } else if (fcVar.f23978i != null) {
                    w7.G(this.f26875o).f(this.f26869i.f23978i);
                } else if (fcVar.h != null) {
                    w7.G(this.f26875o).e(null, this.f26869i.h, null, null, null, null);
                } else if (fcVar.v != null) {
                    w7.G(this.f26875o).e(null, null, this.f26869i.v, null, null, null);
                }
            }
            tb tbVar = this.f26881u;
            if (tbVar != null) {
                if (i7 == 1) {
                    this.A.f23795q.a(tbVar);
                } else {
                    ((of.a) this.A.f23794p.f6480b).remove(tbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23794p;
                    Runnable runnable = this.f26864b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6480b).remove(runnable);
                    }
                }
                tb tbVar2 = this.f26881u;
                synchronized (tbVar2.f27073b) {
                    try {
                        tbVar2.d = true;
                        Thread thread = tbVar2.f27072a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f26881u = null;
            }
            zb zbVar = this.f26880t;
            if (zbVar != null) {
                this.A.f23792n.remove(zbVar);
                this.f26880t.cancel(true);
                this.f26880t = null;
            }
            rb rbVar = this.f26879s;
            if (rbVar != null) {
                this.A.f23793o.remove(rbVar);
                this.f26879s.cancel(true);
                this.f26879s = null;
            }
            String str = this.f26866e;
            if (str != null) {
                this.A.f23786g.remove(str);
            }
            String str2 = this.f26866e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23787i.remove(str3);
                this.A.f23788j.remove(ec.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        sb sbVar;
        ec ecVar;
        ArrayList arrayList = this.f26882w;
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
            ecVar.f23789k.remove(((ImageReceiver) arrayList2.get(i7)).H(sbVar.f26873m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = sbVar.f26866e;
        if (str2 != null) {
            ecVar.f23786g.remove(str2);
        }
        String str3 = sbVar.f26866e;
        if (str3 != null) {
            ecVar.h.remove(str3);
        }
        String str4 = sbVar.d;
        if (str4 != null) {
            ecVar.f23787i.remove(str4);
            ecVar.f23788j.remove(ec.n(sbVar.d));
        }
    }
}
