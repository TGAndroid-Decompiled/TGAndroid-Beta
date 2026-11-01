package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class wb {
    public final ic A;
    public Runnable f19010b;
    public boolean f19011c;
    public String d;
    public String e;
    public String f19012f;
    public String f19013g;
    public qw h;
    public jc f19014i;
    public Object f19015j;
    public long f19016k;
    public int f19017l;
    public int f19018m;
    public int f19019n;
    public int f19020o;
    public File f19021p;
    public File f19022q;
    public File f19023r;
    public vb f19024s;
    public dc f19025t;
    public xb f19026u;
    public int f19009a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f19027w = new ArrayList();
    public final ArrayList f19028x = new ArrayList();
    public final ArrayList f19029y = new ArrayList();
    public final ArrayList f19030z = new ArrayList();

    public wb(ic icVar) {
        this.A = icVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i10, int i11) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f19027w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i11));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i11));
        this.f19028x.add(str);
        this.f19029y.add(str2);
        this.f19030z.add(Integer.valueOf(i10));
        this.A.f16253k.put(imageReceiver.G(i10), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i10 = this.f19018m;
        int i11 = 0;
        while (i11 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i11);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i11);
                this.f19027w.remove(i11);
                this.f19028x.remove(i11);
                this.f19029y.remove(i11);
                i10 = ((Integer) this.f19030z.remove(i11)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f16253k.remove(imageReceiver2.G(i10));
                }
                i11--;
            }
            i11++;
        }
        if (this.v.isEmpty()) {
            if (this.f19014i != null && !this.A.f16264w.containsKey(this.d)) {
                jc jcVar = this.f19014i;
                if (jcVar.f16435f != null) {
                    b8.G(this.f19020o).e(null, null, null, this.f19014i.f16435f, this.f19013g, null);
                } else if (jcVar.f16437i != null) {
                    b8.G(this.f19020o).f(this.f19014i.f16437i);
                } else if (jcVar.h != null) {
                    b8.G(this.f19020o).e(null, this.f19014i.h, null, null, null, null);
                } else if (jcVar.v != null) {
                    b8.G(this.f19020o).e(null, null, this.f19014i.v, null, null, null);
                }
            }
            xb xbVar = this.f19026u;
            if (xbVar != null) {
                if (i10 == 1) {
                    this.A.f16259q.a(xbVar);
                } else {
                    ((ze.a) this.A.f16258p.f4585b).remove(xbVar);
                    com.google.android.gms.internal.cast.c0 c0Var = this.A.f16258p;
                    Runnable runnable = this.f19010b;
                    if (runnable == null) {
                        c0Var.getClass();
                    } else {
                        ((ze.a) c0Var.f4585b).remove(runnable);
                    }
                }
                xb xbVar2 = this.f19026u;
                synchronized (xbVar2.f19421b) {
                    try {
                        xbVar2.d = true;
                        Thread thread = xbVar2.f19420a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f19026u = null;
            }
            dc dcVar = this.f19025t;
            if (dcVar != null) {
                this.A.f16256n.remove(dcVar);
                this.f19025t.cancel(true);
                this.f19025t = null;
            }
            vb vbVar = this.f19024s;
            if (vbVar != null) {
                this.A.f16257o.remove(vbVar);
                this.f19024s.cancel(true);
                this.f19024s = null;
            }
            String str = this.e;
            if (str != null) {
                this.A.f16250g.remove(str);
            }
            String str2 = this.e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f16251i.remove(str3);
                this.A.f16252j.remove(ic.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        wb wbVar;
        ic icVar;
        ArrayList arrayList = this.f19027w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            wbVar = this;
            i0.g3(new dn(wbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            wbVar = this;
        }
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            icVar = wbVar.A;
            if (i10 >= size) {
                break;
            }
            icVar.f16253k.remove(((ImageReceiver) arrayList2.get(i10)).G(wbVar.f19018m));
            i10++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = wbVar.e;
        if (str2 != null) {
            icVar.f16250g.remove(str2);
        }
        String str3 = wbVar.e;
        if (str3 != null) {
            icVar.h.remove(str3);
        }
        String str4 = wbVar.d;
        if (str4 != null) {
            icVar.f16251i.remove(str4);
            icVar.f16252j.remove(ic.n(wbVar.d));
        }
    }
}
