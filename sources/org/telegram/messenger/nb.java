package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
public final class nb {
    public final zb A;
    public Runnable f24341b;
    public boolean f24342c;
    public String d;
    public String f24343e;
    public String f24344f;
    public String f24345g;
    public wv h;
    public ac f24346i;
    public Object f24347j;
    public long f24348k;
    public int f24349l;
    public int f24350m;
    public int f24351n;
    public int f24352o;
    public File f24353p;
    public File f24354q;
    public File f24355r;
    public mb f24356s;
    public ub f24357t;
    public ob f24358u;
    public int f24340a = 1;
    public final ArrayList v = new ArrayList();
    public final ArrayList f24359w = new ArrayList();
    public final ArrayList f24360x = new ArrayList();
    public final ArrayList f24361y = new ArrayList();
    public final ArrayList f24362z = new ArrayList();

    public nb(zb zbVar) {
        this.A = zbVar;
    }

    public final void a(ImageReceiver imageReceiver, String str, String str2, int i3, int i10) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(imageReceiver);
        ArrayList arrayList2 = this.f24359w;
        if (indexOf >= 0 && Objects.equals(((ImageReceiver) arrayList.get(indexOf)).R, str)) {
            arrayList2.set(indexOf, Integer.valueOf(i10));
            return;
        }
        arrayList.add(imageReceiver);
        arrayList2.add(Integer.valueOf(i10));
        this.f24360x.add(str);
        this.f24361y.add(str2);
        this.f24362z.add(Integer.valueOf(i3));
        this.A.f26765k.put(imageReceiver.G(i3), this);
    }

    public final void b(ImageReceiver imageReceiver) {
        int i3 = this.f24350m;
        int i10 = 0;
        while (i10 < this.v.size()) {
            ImageReceiver imageReceiver2 = (ImageReceiver) this.v.get(i10);
            if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                this.v.remove(i10);
                this.f24359w.remove(i10);
                this.f24360x.remove(i10);
                this.f24361y.remove(i10);
                i3 = ((Integer) this.f24362z.remove(i10)).intValue();
                if (imageReceiver2 != null) {
                    this.A.f26765k.remove(imageReceiver2.G(i3));
                }
                i10--;
            }
            i10++;
        }
        if (this.v.isEmpty()) {
            if (this.f24346i != null && !this.A.f26776w.containsKey(this.d)) {
                ac acVar = this.f24346i;
                if (acVar.f21488f != null) {
                    w7.G(this.f24352o).e(null, null, null, this.f24346i.f21488f, this.f24345g, null);
                } else if (acVar.f21490i != null) {
                    w7.G(this.f24352o).f(this.f24346i.f21490i);
                } else if (acVar.h != null) {
                    w7.G(this.f24352o).e(null, this.f24346i.h, null, null, null, null);
                } else if (acVar.v != null) {
                    w7.G(this.f24352o).e(null, null, this.f24346i.v, null, null, null);
                }
            }
            ob obVar = this.f24358u;
            if (obVar != null) {
                if (i3 == 1) {
                    this.A.f26771q.a(obVar);
                } else {
                    ((lf.a) this.A.f26770p.f6882b).remove(obVar);
                    com.google.android.gms.internal.cast.c0 c0Var = this.A.f26770p;
                    Runnable runnable = this.f24341b;
                    if (runnable == null) {
                        c0Var.getClass();
                    } else {
                        ((lf.a) c0Var.f6882b).remove(runnable);
                    }
                }
                ob obVar2 = this.f24358u;
                synchronized (obVar2.f24517b) {
                    try {
                        obVar2.d = true;
                        Thread thread = obVar2.f24516a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f24358u = null;
            }
            ub ubVar = this.f24357t;
            if (ubVar != null) {
                this.A.f26768n.remove(ubVar);
                this.f24357t.cancel(true);
                this.f24357t = null;
            }
            mb mbVar = this.f24356s;
            if (mbVar != null) {
                this.A.f26769o.remove(mbVar);
                this.f24356s.cancel(true);
                this.f24356s = null;
            }
            String str = this.f24343e;
            if (str != null) {
                this.A.f26762g.remove(str);
            }
            String str2 = this.f24343e;
            if (str2 != null) {
                this.A.h.remove(str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                this.A.f26763i.remove(str3);
                this.A.f26764j.remove(zb.n(this.d));
            }
        }
    }

    public final void c(Drawable drawable, String str) {
        nb nbVar;
        zb zbVar;
        ArrayList arrayList = this.f24359w;
        ArrayList arrayList2 = this.v;
        if (drawable != null) {
            nbVar = this;
            g0.h3(new cn(nbVar, drawable, new ArrayList(arrayList2), new ArrayList(arrayList), str, 3));
        } else {
            nbVar = this;
        }
        int i3 = 0;
        while (true) {
            int size = arrayList2.size();
            zbVar = nbVar.A;
            if (i3 >= size) {
                break;
            }
            zbVar.f26765k.remove(((ImageReceiver) arrayList2.get(i3)).G(nbVar.f24350m));
            i3++;
        }
        arrayList2.clear();
        arrayList.clear();
        String str2 = nbVar.f24343e;
        if (str2 != null) {
            zbVar.f26762g.remove(str2);
        }
        String str3 = nbVar.f24343e;
        if (str3 != null) {
            zbVar.h.remove(str3);
        }
        String str4 = nbVar.d;
        if (str4 != null) {
            zbVar.f26763i.remove(str4);
            zbVar.f26764j.remove(zb.n(nbVar.d));
        }
    }
}
