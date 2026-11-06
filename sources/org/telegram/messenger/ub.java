package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class ub {
    public final gc A;
    public Runnable f25742b;
    public boolean f25743c;
    public String d;
    public String f25744e;
    public String f25745f;
    public String f25746g;
    public ew h;
    public hc f25747i;
    public Object f25748j;
    public long f25749k;
    public int f25750l;
    public int f25751m;
    public int f25752n;
    public int f25753o;
    public File f25754p;
    public File f25755q;
    public File f25756r;
    public tb f25757s;
    public bc f25758t;
    public vb f25759u;
    public int f25741a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f25760w = new ArrayList();
    public final ArrayList f25761x = new ArrayList();
    public final ArrayList f25762y = new ArrayList();
    public final ArrayList f25763z = new ArrayList();

    public ub(gc gcVar) {
        this.A = gcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f25760w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f25761x.add(str);
        this.f25762y.add(str2);
        this.f25763z.add(Integer.valueOf(i7));
        this.A.f22624k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f25751m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f25760w.remove(i10);
                this.f25761x.remove(i10);
                this.f25762y.remove(i10);
                i7 = ((Integer) this.f25763z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f22624k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f25747i != null && !this.A.f22635w.containsKey(this.d)) {
                hc hcVar = this.f25747i;
                if (hcVar.f22863f != null) {
                    w7.G(this.f25753o).e(null, null, null, this.f25747i.f22863f, this.f25746g, null);
                } else if (hcVar.f22865i != null) {
                    w7.G(this.f25753o).f(this.f25747i.f22865i);
                } else if (hcVar.h != null) {
                    w7.G(this.f25753o).e(null, this.f25747i.h, null, null, null, null);
                } else if (hcVar.v != null) {
                    w7.G(this.f25753o).e(null, null, this.f25747i.v, null, null, null);
                }
            }
            vb vbVar = this.f25759u;
            if (vbVar != null) {
                if (i7 == 1) {
                    this.A.f22630q.a(vbVar);
                } else {
                    ((of.a) this.A.f22629p.f6814b).remove(vbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f22629p;
                    Runnable runnable = this.f25742b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6814b).remove(runnable);
                    }
                }
                vb vbVar2 = this.f25759u;
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
                this.f25759u = null;
            }
            bc bcVar = this.f25758t;
            if (bcVar != null) {
                this.A.f22627n.remove(bcVar);
                this.f25758t.cancel(true);
                this.f25758t = null;
            }
            tb tbVar = this.f25757s;
            if (tbVar != null) {
                this.A.f22628o.remove(tbVar);
                this.f25757s.cancel(true);
                this.f25757s = null;
            }
            String str = this.f25744e;
            if (str != null) {
                this.A.f22621g.remove(str);
            }
            String str2 = this.f25744e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f22622i.remove(str3);
                this.A.f22623j.remove(gc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        ub ubVar;
        gc gcVar;
        ArrayList arrayList = this.f25760w;
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
            gcVar.f22624k.remove(((ImageReceiver) arrayList2.get(i7)).G(ubVar.f25751m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = ubVar.f25744e;
        if (str2 != null) {
            gcVar.f22621g.remove(str2);
        }
        String str3 = ubVar.f25744e;
        if (str3 != null) {
            gcVar.h.remove(str3);
        }
        String str4 = ubVar.d;
        if (str4 != null) {
            gcVar.f22622i.remove(str4);
            gcVar.f22623j.remove(gc.n(ubVar.d));
        }
    }
}
