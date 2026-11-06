package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class ub {
    public final gc A;
    public Runnable f25734b;
    public boolean f25735c;
    public String d;
    public String f25736e;
    public String f25737f;
    public String f25738g;
    public ew h;
    public hc f25739i;
    public Object f25740j;
    public long f25741k;
    public int f25742l;
    public int f25743m;
    public int f25744n;
    public int f25745o;
    public File f25746p;
    public File f25747q;
    public File f25748r;
    public tb f25749s;
    public bc f25750t;
    public vb f25751u;
    public int f25733a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f25752w = new ArrayList();
    public final ArrayList f25753x = new ArrayList();
    public final ArrayList f25754y = new ArrayList();
    public final ArrayList f25755z = new ArrayList();

    public ub(gc gcVar) {
        this.A = gcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i7, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f25752w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f25753x.add(str);
        this.f25754y.add(str2);
        this.f25755z.add(Integer.valueOf(i7));
        this.A.f22617k.put(imageReceiver.G(i7), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i7 = this.f25743m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f25752w.remove(i10);
                this.f25753x.remove(i10);
                this.f25754y.remove(i10);
                i7 = ((Integer) this.f25755z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f22617k.remove(imageReceiver2.G(i7));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f25739i != null && !this.A.f22628w.containsKey(this.d)) {
                hc hcVar = this.f25739i;
                if (hcVar.f22856f != null) {
                    w7.G(this.f25745o).e(null, null, null, this.f25739i.f22856f, this.f25738g, null);
                } else if (hcVar.f22858i != null) {
                    w7.G(this.f25745o).f(this.f25739i.f22858i);
                } else if (hcVar.h != null) {
                    w7.G(this.f25745o).e(null, this.f25739i.h, null, null, null, null);
                } else if (hcVar.v != null) {
                    w7.G(this.f25745o).e(null, null, this.f25739i.v, null, null, null);
                }
            }
            vb vbVar = this.f25751u;
            if (vbVar != null) {
                if (i7 == 1) {
                    this.A.f22623q.a(vbVar);
                } else {
                    ((of.a) this.A.f22622p.f6814b).remove(vbVar);
                    com.google.android.gms.internal.cast.b0 b0Var = this.A.f22622p;
                    Runnable runnable = this.f25734b;
                    if (runnable == null) {
                        b0Var.getClass();
                    } else {
                        ((of.a) b0Var.f6814b).remove(runnable);
                    }
                }
                vb vbVar2 = this.f25751u;
                synchronized (vbVar2.f25953b) {
                    try {
                        vbVar2.d = true;
                        Thread thread = vbVar2.f25952a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f25751u = null;
            }
            bc bcVar = this.f25750t;
            if (bcVar != null) {
                this.A.f22620n.remove(bcVar);
                this.f25750t.cancel(true);
                this.f25750t = null;
            }
            tb tbVar = this.f25749s;
            if (tbVar != null) {
                this.A.f22621o.remove(tbVar);
                this.f25749s.cancel(true);
                this.f25749s = null;
            }
            String str = this.f25736e;
            if (str != null) {
                this.A.f22614g.remove(str);
            }
            String str2 = this.f25736e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f22615i.remove(str3);
                this.A.f22616j.remove(gc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        ub ubVar;
        gc gcVar;
        ArrayList arrayList = this.f25752w;
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
            gcVar.f22617k.remove(((ImageReceiver) arrayList2.get(i7)).G(ubVar.f25743m));
            i7++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = ubVar.f25736e;
        if (str2 != null) {
            gcVar.f22614g.remove(str2);
        }
        String str3 = ubVar.f25736e;
        if (str3 != null) {
            gcVar.h.remove(str3);
        }
        String str4 = ubVar.d;
        if (str4 != null) {
            gcVar.f22615i.remove(str4);
            gcVar.f22616j.remove(gc.n(ubVar.d));
        }
    }
}
