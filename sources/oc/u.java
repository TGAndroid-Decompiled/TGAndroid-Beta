package oc;

import ci.f8;
import ci.u0;
import d2.t0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Wallet.w0;
public final class u {
    public final s f21007a;
    public final t0 f21008b;
    public final h f21009c;
    public final b4.n d;
    public final p f21010e;
    public final p f21011f;
    public y h;
    public z f21013i;
    public q f21014j;
    public b0 f21015k;
    public ArrayList f21016l;
    public boolean f21017m;
    public boolean f21019o;
    public boolean f21020p;
    public boolean f21021q;
    public boolean f21022r;
    public x f21023s;
    public x f21024t;
    public o f21025u;
    public final Object f21012g = new Object();
    public final Object f21018n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f21007a = sVar;
        ?? obj = new Object();
        obj.f8414b = 1;
        obj.f8413a = 1;
        this.f21008b = obj;
        ?? obj2 = new Object();
        obj2.f20978a = str;
        obj2.f20979b = str2;
        obj2.f20980c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f21009c = obj2;
        ?? obj3 = new Object();
        obj3.f2379c = new ArrayList();
        obj3.f2377a = true;
        obj3.f2378b = this;
        this.d = obj3;
        this.f21010e = new u0(this, "PingSender", new mb.b(16));
        this.f21011f = new u0(this, "PongSender", new mb.b(16));
    }

    public final void a() {
        synchronized (this.f21018n) {
            try {
                if (this.f21017m) {
                    return;
                }
                this.f21017m = true;
                b4.n nVar = this.d;
                ArrayList arrayList = (ArrayList) nVar.q();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    w0 w0Var = (w0) obj;
                    try {
                        try {
                            g0.h3(new f8(w0Var.f43306a, 5, w0Var.f43307b, w0Var, (u) nVar.f2378b));
                        } catch (Throwable unused) {
                            w0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        s sVar;
        synchronized (this.f21008b) {
            t0 t0Var = this.f21008b;
            if (t0Var.f8413a == 1) {
                t0Var.f8413a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.g();
        try {
            s sVar2 = this.f21007a;
            try {
                sVar2.a();
                h(sVar2.f21001g);
                ArrayList arrayList = this.f21016l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i3);
                        i3++;
                        w wVar = (w) obj;
                        if (wVar instanceof o) {
                            oVar = (o) wVar;
                            break;
                        }
                    }
                }
                this.f21025u = oVar;
                this.f21008b.f8413a = 3;
                this.d.g();
                i();
            } catch (v e10) {
                Socket socket = sVar.f21001g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.f21007a.f21001g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f21008b.f8413a = 5;
            this.d.g();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.f21008b) {
            try {
                int c2 = o1.g.c(this.f21008b.f8413a);
                if (c2 != 0) {
                    if (c2 != 2) {
                        return;
                    }
                    t0 t0Var = this.f21008b;
                    t0Var.f8413a = 4;
                    if (t0Var.f8414b == 1) {
                        t0Var.f8414b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.g();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                b4.n nVar = bVar.f20959a.d;
                if (nVar != null) {
                    ArrayList arrayList = (ArrayList) nVar.q();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        w0 w0Var = (w0) obj;
                        try {
                            try {
                                w0Var.getClass();
                            } catch (Throwable unused) {
                                w0Var.getClass();
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                bVar.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        boolean z10;
        this.f21010e.stop();
        this.f21011f.stop();
        Socket socket = this.f21007a.f21001g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f21008b) {
            this.f21008b.f8413a = 5;
        }
        this.d.g();
        b4.n nVar = this.d;
        x xVar = this.f21023s;
        x xVar2 = this.f21024t;
        int i3 = 0;
        if (this.f21008b.f8414b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) nVar.q();
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w0 w0Var = (w0) obj;
            try {
                try {
                    w0Var.a((u) nVar.f2378b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                w0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f21012g) {
            this.f21019o = true;
            z10 = this.f21020p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f21010e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f21011f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f21008b) {
            if (this.f21008b.f8413a == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            d();
        }
        super.finalize();
    }

    public final void g(x xVar) {
        if (xVar != null) {
            synchronized (this.f21008b) {
                try {
                    int i3 = this.f21008b.f8413a;
                    if (i3 != 3 && i3 != 4) {
                        return;
                    }
                    b0 b0Var = this.f21015k;
                    if (b0Var == null) {
                        return;
                    }
                    b0Var.f(xVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r18) {
        throw new UnsupportedOperationException("Method not decompiled: oc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        b0 b0Var = new b0(this);
        synchronized (this.f21012g) {
            this.f21014j = qVar;
            this.f21015k = b0Var;
        }
        b4.n nVar = qVar.f20959a.d;
        int i3 = 0;
        if (nVar != null) {
            ArrayList arrayList = (ArrayList) nVar.q();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                w0 w0Var = (w0) obj;
                try {
                    try {
                        w0Var.getClass();
                    } catch (Throwable unused) {
                        w0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        b4.n nVar2 = b0Var.f20959a.d;
        if (nVar2 != null) {
            ArrayList arrayList2 = (ArrayList) nVar2.q();
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                w0 w0Var2 = (w0) obj2;
                try {
                    try {
                        w0Var2.getClass();
                    } catch (Throwable unused3) {
                        w0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        b0Var.start();
    }

    public final void j() {
        q qVar;
        b0 b0Var;
        synchronized (this.f21012g) {
            qVar = this.f21014j;
            b0Var = this.f21015k;
            this.f21014j = null;
            this.f21015k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (b0Var != null) {
            b0Var.g();
        }
    }
}
