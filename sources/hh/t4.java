package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

public final class t4 {

    public final e5 f10056a;

    public y4 f10057b;

    public y4 f10058c;
    public y4 d;
    public p4 h;

    public p4 f10062i;

    public p4 f10063j;

    public p4 f10064k;

    public TL_stars.TL_starGiftUnique f10065l;

    public long f10066m;

    public v1 f10071r;

    public v1 f10072s;

    public float f10073t;

    public boolean f10074u;
    public boolean v;

    public final ArrayList f10059e = new ArrayList();

    public final ArrayList f10060f = new ArrayList();

    public final ArrayList f10061g = new ArrayList();

    public float f10067n = 0.0f;

    public boolean f10068o = false;

    public boolean f10069p = false;

    public boolean f10070q = false;

    public t4(e5 e5Var) {
        this.f10056a = e5Var;
        e5Var.f9176c.addOnAttachStateChangeListener(new bf.b(this, 4));
    }

    public final void a() {
        this.f10068o = false;
        this.f10056a.f9176c.c();
        p4 p4Var = this.h;
        if (p4Var != null) {
            p4Var.a();
        }
        p4 p4Var2 = this.f10062i;
        if (p4Var2 != null) {
            p4Var2.a();
        }
        p4 p4Var3 = this.f10063j;
        if (p4Var3 != null) {
            p4Var3.a();
        }
        p4 p4Var4 = this.f10064k;
        if (p4Var4 != null) {
            p4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f10068o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new n4(this, 1));
        }
    }

    public final void c() {
        if (this.f10068o) {
            return;
        }
        ArrayList arrayList = this.f10059e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r4) obj).a();
        }
        arrayList.clear();
        this.f10060f.clear();
        this.f10061g.clear();
    }
}
