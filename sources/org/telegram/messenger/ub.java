package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class ub {
    public final gc A;
    public Runnable f25752b;
    public boolean f25753c;
    public String d;
    public String f25754e;
    public String f25755f;
    public String f25756g;
    public ew h;
    public hc f25757i;
    public Object f25758j;
    public long f25759k;
    public int f25760l;
    public int f25761m;
    public int f25762n;
    public int f25763o;
    public File f25764p;
    public File f25765q;
    public File f25766r;
    public tb f25767s;
    public bc f25768t;
    public vb f25769u;
    public int f25751a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f25770w = new ArrayList();
    public final ArrayList f25771x = new ArrayList();
    public final ArrayList f25772y = new ArrayList();
    public final ArrayList f25773z = new ArrayList();

    public ub(gc gcVar) {
        this.A = gcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f25770w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f25771x.add(str);
        this.f25772y.add(str2);
        this.f25773z.add(Integer.valueOf(i7));
        this.A.f22647k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f25761m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f25770w.remove(i10);
                this.f25771x.remove(i10);
                this.f25772y.remove(i10);
                i7 = ((Integer) this.f25773z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f22647k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f25757i != null && !this.A.f22658w.containsKey(this.d)) {
                hc hcVar = this.f25757i;
                if (hcVar.f22873f != null) {
                    w7.G(this.f25763o).e(null, null, null, this.f25757i.f22873f, this.f25756g, null);
                } else if (hcVar.f22875i != null) {
                    w7.G(this.f25763o).f(this.f25757i.f22875i);
                } else if (hcVar.h != null) {
                    w7.G(this.f25763o).e(null, this.f25757i.h, null, null, null, null);
                } else if (hcVar.v != null) {
                    w7.G(this.f25763o).e(null, null, this.f25757i.v, null, null, null);
                }
            }
            vb vbVar = this.f25769u;
            if (vbVar != null) {
                if (i7 == 1) {
                    this.A.f22653q.a(vbVar);
                } else {
                    ((of.a) this.A.f22652p.f6817b).remove(vbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f22652p;
                    Runnable runnable = this.f25752b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6817b).remove(runnable);
                    }
                }
                vb vbVar2 = this.f25769u;
                synchronized (vbVar2.f25965b) {
                    try {
                        vbVar2.d = true;
                        Thread thread = vbVar2.f25964a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f25769u = null;
            }
            bc bcVar = this.f25768t;
            if (bcVar != null) {
                this.A.f22650n.remove(bcVar);
                this.f25768t.cancel(true);
                this.f25768t = null;
            }
            tb tbVar = this.f25767s;
            if (tbVar != null) {
                this.A.f22651o.remove(tbVar);
                this.f25767s.cancel(true);
                this.f25767s = null;
            }
            String str = this.f25754e;
            if (str != null) {
                this.A.f22644g.remove(str);
            }
            String str2 = this.f25754e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f22645i.remove(str3);
                this.A.f22646j.remove(gc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        ub ubVar;
        gc gcVar;
        ArrayList arrayList = this.f25770w;
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
            gcVar.f22647k.remove(((ImageReceiver) arrayList2.get(i7)).G(ubVar.f25761m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = ubVar.f25754e;
        if (str2 != null) {
            gcVar.f22644g.remove(str2);
        }
        String str3 = ubVar.f25754e;
        if (str3 != null) {
            gcVar.h.remove(str3);
        }
        String str4 = ubVar.d;
        if (str4 != null) {
            gcVar.f22645i.remove(str4);
            gcVar.f22646j.remove(gc.n(ubVar.d));
        }
    }
}
