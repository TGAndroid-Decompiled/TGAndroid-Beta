package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class atc {
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
    public il1 l;
    public final ArrayList m = new ArrayList();

    public atc(int i) {
        this.a = i;
    }

    public final void a() {
        il1 il1Var;
        if (!this.c) {
            this.c = true;
            if (!this.g) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
            }
            if (!this.i && (il1Var = this.l) != null) {
                il1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!gba.t0 && (webPage = this.h) != null) {
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

    public final void d(cv0 cv0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            ctc.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = cv0Var.getUrl();
        this.e = cv0Var.getProgress();
        this.f = cv0Var.b;
        il1 il1Var = this.l;
        if (il1Var != null) {
            il1Var.run();
        }
        this.l = ctc.e(cv0Var, new zsc(this, (byte) 1));
    }
}
