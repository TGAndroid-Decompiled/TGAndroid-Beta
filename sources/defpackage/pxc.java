package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pxc {
    public final int a;
    public boolean b;
    public boolean c;
    public String d;
    public float e;
    public boolean f;
    public boolean g;
    public TLRPC.WebPage h;
    public boolean i;
    public TLRPC.TL_webPage j;
    public int k;
    public om1 l;
    public final ArrayList m = new ArrayList();

    public pxc(int i) {
        this.a = i;
    }

    public final void a() {
        om1 om1Var;
        if (!this.c) {
            this.c = true;
            if (!this.g) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
            }
            if (!this.i && (om1Var = this.l) != null) {
                om1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!xea.t0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    public final void d(nv0 nv0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            rxc.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = nv0Var.getUrl();
        this.e = nv0Var.getProgress();
        this.f = nv0Var.b;
        om1 om1Var = this.l;
        if (om1Var != null) {
            om1Var.run();
        }
        this.l = rxc.e(nv0Var, new oxc(this, (byte) 1));
    }
}
