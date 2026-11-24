package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class hsa {
    public final ssa a;
    public msa b;
    public msa c;
    public msa d;
    public dsa h;
    public dsa i;
    public dsa j;
    public dsa k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public npa r;
    public npa s;
    public float t;
    public boolean u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public float n = 0.0f;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    public hsa(ssa ssaVar) {
        this.a = ssaVar;
        ssaVar.c.addOnAttachStateChangeListener(new wd(this, (byte) 19));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        dsa dsaVar = this.h;
        if (dsaVar != null) {
            dsaVar.a();
        }
        dsa dsaVar2 = this.i;
        if (dsaVar2 != null) {
            dsaVar2.a();
        }
        dsa dsaVar3 = this.j;
        if (dsaVar3 != null) {
            dsaVar3.a();
        }
        dsa dsaVar4 = this.k;
        if (dsaVar4 != null) {
            dsaVar4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            gm.c3(new bsa(this, (byte) 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fsa) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
