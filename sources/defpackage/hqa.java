package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class hqa {
    public final rqa a;
    public mqa b;
    public mqa c;
    public mqa d;
    public dqa h;
    public dqa i;
    public dqa j;
    public dqa k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public nna r;
    public nna s;
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

    public hqa(rqa rqaVar) {
        this.a = rqaVar;
        rqaVar.c.addOnAttachStateChangeListener(new wc(this, (byte) 19));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        dqa dqaVar = this.h;
        if (dqaVar != null) {
            dqaVar.a();
        }
        dqa dqaVar2 = this.i;
        if (dqaVar2 != null) {
            dqaVar2.a();
        }
        dqa dqaVar3 = this.j;
        if (dqaVar3 != null) {
            dqaVar3.a();
        }
        dqa dqaVar4 = this.k;
        if (dqaVar4 != null) {
            dqaVar4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            gl.d3(new bqa(this, (byte) 1));
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
            ((fqa) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
