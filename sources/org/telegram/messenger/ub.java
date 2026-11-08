package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class ub {
    public final gc A;
    public Runnable f25748b;
    public boolean f25749c;
    public String d;
    public String f25750e;
    public String f25751f;
    public String f25752g;
    public ew h;
    public hc f25753i;
    public Object f25754j;
    public long f25755k;
    public int f25756l;
    public int f25757m;
    public int f25758n;
    public int f25759o;
    public File f25760p;
    public File f25761q;
    public File f25762r;
    public tb f25763s;
    public bc f25764t;
    public vb f25765u;
    public int f25747a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f25766w = new ArrayList();
    public final ArrayList f25767x = new ArrayList();
    public final ArrayList f25768y = new ArrayList();
    public final ArrayList f25769z = new ArrayList();

    public ub(gc gcVar) {
        this.A = gcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f25766w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f25767x.add(str);
        this.f25768y.add(str2);
        this.f25769z.add(Integer.valueOf(i7));
        this.A.f22643k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f25757m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f25766w.remove(i10);
                this.f25767x.remove(i10);
                this.f25768y.remove(i10);
                i7 = ((Integer) this.f25769z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f22643k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f25753i != null && !this.A.f22654w.containsKey(this.d)) {
                hc hcVar = this.f25753i;
                if (hcVar.f22869f != null) {
                    w7.G(this.f25759o).e(null, null, null, this.f25753i.f22869f, this.f25752g, null);
                } else if (hcVar.f22871i != null) {
                    w7.G(this.f25759o).f(this.f25753i.f22871i);
                } else if (hcVar.h != null) {
                    w7.G(this.f25759o).e(null, this.f25753i.h, null, null, null, null);
                } else if (hcVar.v != null) {
                    w7.G(this.f25759o).e(null, null, this.f25753i.v, null, null, null);
                }
            }
            vb vbVar = this.f25765u;
            if (vbVar != null) {
                if (i7 == 1) {
                    this.A.f22649q.a(vbVar);
                } else {
                    ((of.a) this.A.f22648p.f6814b).remove(vbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f22648p;
                    Runnable runnable = this.f25748b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6814b).remove(runnable);
                    }
                }
                vb vbVar2 = this.f25765u;
                synchronized (vbVar2.f25961b) {
                    try {
                        vbVar2.d = true;
                        Thread thread = vbVar2.f25960a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f25765u = null;
            }
            bc bcVar = this.f25764t;
            if (bcVar != null) {
                this.A.f22646n.remove(bcVar);
                this.f25764t.cancel(true);
                this.f25764t = null;
            }
            tb tbVar = this.f25763s;
            if (tbVar != null) {
                this.A.f22647o.remove(tbVar);
                this.f25763s.cancel(true);
                this.f25763s = null;
            }
            String str = this.f25750e;
            if (str != null) {
                this.A.f22640g.remove(str);
            }
            String str2 = this.f25750e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f22641i.remove(str3);
                this.A.f22642j.remove(gc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        ub ubVar;
        gc gcVar;
        ArrayList arrayList = this.f25766w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            ubVar = this;
            g0.h3(new mn(ubVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            ubVar = this;
        }
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            gcVar = ubVar.A;
            if (i7 >= size) {
                break;
            }
            gcVar.f22643k.remove(((ImageReceiver) arrayList2.get(i7)).G(ubVar.f25757m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = ubVar.f25750e;
        if (str2 != null) {
            gcVar.f22640g.remove(str2);
        }
        String str3 = ubVar.f25750e;
        if (str3 != null) {
            gcVar.h.remove(str3);
        }
        String str4 = ubVar.d;
        if (str4 != null) {
            gcVar.f22641i.remove(str4);
            gcVar.f22642j.remove(gc.n(ubVar.d));
        }
    }
}
