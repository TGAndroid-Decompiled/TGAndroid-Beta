package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class vb {
    public final hc A;
    public Runnable f18488b;
    public boolean f18489c;
    public String d;
    public String e;
    public String f18490f;
    public String f18491g;
    public pw h;
    public ic f18492i;
    public Object f18493j;
    public long f18494k;
    public int f18495l;
    public int f18496m;
    public int f18497n;
    public int f18498o;
    public File f18499p;
    public File f18500q;
    public File f18501r;
    public ub f18502s;
    public cc f18503t;
    public wb f18504u;
    public int f18487a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f18505w = new ArrayList();
    public final ArrayList f18506x = new ArrayList();
    public final ArrayList f18507y = new ArrayList();
    public final ArrayList f18508z = new ArrayList();

    public vb(hc hcVar) {
        this.A = hcVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i10, int i11) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f18505w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).Q, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i11));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i11));
        this.f18506x.add(str);
        this.f18507y.add(str2);
        this.f18508z.add(Integer.valueOf(i10));
        this.A.f15860k.put(imageReceiver.G(i10), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i10 = this.f18496m;
        int i11 = 0;
        while (i11 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i11);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i11);
                this.f18505w.remove(i11);
                this.f18506x.remove(i11);
                this.f18507y.remove(i11);
                i10 = ((Integer) this.f18508z.remove(i11)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f15860k.remove(imageReceiver2.G(i10));
                }
                i11--;
            }
            i11++;
        }
        if (this.v.isEmpty()) {
            if (this.f18492i != null && !this.A.f15871w.containsKey(this.d)) {
                ic icVar = this.f18492i;
                if (icVar.f16100f != null) {
                    b8.G(this.f18498o).e(null, null, null, this.f18492i.f16100f, this.f18491g, null);
                } else if (icVar.f16102i != null) {
                    b8.G(this.f18498o).f(this.f18492i.f16102i);
                } else if (icVar.h != null) {
                    b8.G(this.f18498o).e(null, this.f18492i.h, null, null, null, null);
                } else if (icVar.v != null) {
                    b8.G(this.f18498o).e(null, null, this.f18492i.v, null, null, null);
                }
            }
            wb wbVar = this.f18504u;
            if (wbVar != null) {
                if (i10 == 1) {
                    this.A.f15866q.a(wbVar);
                } else {
                    ((ze.a) this.A.f15865p.f4585b).remove(wbVar);
                    com.google.android.gms.internal.cast.c0 c0Var = this.A.f15865p;
                    Runnable runnable = this.f18488b;
                    if (runnable == null) {
                        c0Var.getClass();
                    } else {
                        ((ze.a) c0Var.f4585b).remove(runnable);
                    }
                }
                wb wbVar2 = this.f18504u;
                synchronized (wbVar2.f19078b) {
                    try {
                        wbVar2.d = true;
                        Thread thread = wbVar2.f19077a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f18504u = null;
            }
            cc ccVar = this.f18503t;
            if (ccVar != null) {
                this.A.f15863n.remove(ccVar);
                this.f18503t.cancel(true);
                this.f18503t = null;
            }
            ub ubVar = this.f18502s;
            if (ubVar != null) {
                this.A.f15864o.remove(ubVar);
                this.f18502s.cancel(true);
                this.f18502s = null;
            }
            String str = this.e;
            if (str != null) {
                this.A.f15857g.remove(str);
            }
            String str2 = this.e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f15858i.remove(str3);
                this.A.f15859j.remove(hc.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        vb vbVar;
        hc hcVar;
        ArrayList arrayList = this.f18505w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            vbVar = this;
            i0.g3(new cn(vbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            vbVar = this;
        }
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            hcVar = vbVar.A;
            if (i10 >= size) {
                break;
            }
            hcVar.f15860k.remove(((ImageReceiver) arrayList2.get(i10)).G(vbVar.f18496m));
            i10++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = vbVar.e;
        if (str2 != null) {
            hcVar.f15857g.remove(str2);
        }
        String str3 = vbVar.e;
        if (str3 != null) {
            hcVar.h.remove(str3);
        }
        String str4 = vbVar.d;
        if (str4 != null) {
            hcVar.f15858i.remove(str4);
            hcVar.f15859j.remove(hc.n(vbVar.d));
        }
    }
}
