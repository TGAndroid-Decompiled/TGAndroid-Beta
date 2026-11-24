package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bvc {
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
    public rm1 l;
    public final ArrayList m = new ArrayList();

    public bvc(int i) {
        this.a = i;
    }

    public final void a() {
        rm1 rm1Var;
        if (!this.c) {
            this.c = true;
            if (!this.g) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
            }
            if (!this.i && (rm1Var = this.l) != null) {
                rm1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!gda.t0 && (webPage = this.h) != null) {
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

    public final void d(mw0 mw0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            dvc.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = mw0Var.getUrl();
        this.e = mw0Var.getProgress();
        this.f = mw0Var.b;
        rm1 rm1Var = this.l;
        if (rm1Var != null) {
            rm1Var.run();
        }
        this.l = dvc.e(mw0Var, new avc(this, (byte) 1));
    }
}
