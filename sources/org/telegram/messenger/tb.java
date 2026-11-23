package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class tb {
    public final fc A;
    public Runnable f26955b;
    public boolean f26956c;
    public String d;
    public String f26957e;
    public String f26958f;
    public String f26959g;
    public zv h;
    public gc f26960i;
    public Object f26961j;
    public long f26962k;
    public int f26963l;
    public int f26964m;
    public int f26965n;
    public int f26966o;
    public File f26967p;
    public File f26968q;
    public File f26969r;
    public sb f26970s;
    public ac f26971t;
    public ub f26972u;
    public int f26954a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f26973w = new ArrayList();
    public final ArrayList f26974x = new ArrayList();
    public final ArrayList f26975y = new ArrayList();
    public final ArrayList f26976z = new ArrayList();

    public tb(fc fcVar) {
        this.A = fcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f26973w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f26974x.add(str);
        this.f26975y.add(str2);
        this.f26976z.add(Integer.valueOf(i7));
        this.A.f23857k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f26964m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f26973w.remove(i10);
                this.f26974x.remove(i10);
                this.f26975y.remove(i10);
                i7 = ((Integer) this.f26976z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f23857k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f26960i != null && !this.A.f23868w.containsKey(this.d)) {
                gc gcVar = this.f26960i;
                if (gcVar.f24080f != null) {
                    w7.G(this.f26966o).e(null, null, null, this.f26960i.f24080f, this.f26959g, null);
                } else if (gcVar.f24082i != null) {
                    w7.G(this.f26966o).f(this.f26960i.f24082i);
                } else if (gcVar.h != null) {
                    w7.G(this.f26966o).e(null, this.f26960i.h, null, null, null, null);
                } else if (gcVar.v != null) {
                    w7.G(this.f26966o).e(null, null, this.f26960i.v, null, null, null);
                }
            }
            ub ubVar = this.f26972u;
            if (ubVar != null) {
                if (i7 == 1) {
                    this.A.f23863q.a(ubVar);
                } else {
                    ((of.a) this.A.f23862p.f6481b).remove(ubVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f23862p;
                    Runnable runnable = this.f26955b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6481b).remove(runnable);
                    }
                }
                ub ubVar2 = this.f26972u;
                synchronized (ubVar2.f27138b) {
                    try {
                        ubVar2.d = true;
                        Thread thread = ubVar2.f27137a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f26972u = null;
            }
            ac acVar = this.f26971t;
            if (acVar != null) {
                this.A.f23860n.remove(acVar);
                this.f26971t.cancel(true);
                this.f26971t = null;
            }
            sb sbVar = this.f26970s;
            if (sbVar != null) {
                this.A.f23861o.remove(sbVar);
                this.f26970s.cancel(true);
                this.f26970s = null;
            }
            String str = this.f26957e;
            if (str != null) {
                this.A.f23854g.remove(str);
            }
            String str2 = this.f26957e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f23855i.remove(str3);
                this.A.f23856j.remove(fc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        tb tbVar;
        fc fcVar;
        ArrayList arrayList = this.f26973w;
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
            fcVar.f23857k.remove(((ImageReceiver) arrayList2.get(i7)).G(tbVar.f26964m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = tbVar.f26957e;
        if (str2 != null) {
            fcVar.f23854g.remove(str2);
        }
        String str3 = tbVar.f26957e;
        if (str3 != null) {
            fcVar.h.remove(str3);
        }
        String str4 = tbVar.d;
        if (str4 != null) {
            fcVar.f23855i.remove(str4);
            fcVar.f23856j.remove(fc.n(tbVar.d));
        }
    }
}
