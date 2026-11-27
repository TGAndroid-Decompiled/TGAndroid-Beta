package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class iua {
    public final sua a;
    public nua b;
    public nua c;
    public nua d;
    public eua h;
    public eua i;
    public eua j;
    public eua k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public jra r;
    public jra s;
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

    public iua(sua suaVar) {
        this.a = suaVar;
        suaVar.c.addOnAttachStateChangeListener(new xc(this, (byte) 20));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        eua euaVar = this.h;
        if (euaVar != null) {
            euaVar.a();
        }
        eua euaVar2 = this.i;
        if (euaVar2 != null) {
            euaVar2.a();
        }
        eua euaVar3 = this.j;
        if (euaVar3 != null) {
            euaVar3.a();
        }
        eua euaVar4 = this.k;
        if (euaVar4 != null) {
            euaVar4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            hl.c3(new cua(this, (byte) 1));
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
            ((gua) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
