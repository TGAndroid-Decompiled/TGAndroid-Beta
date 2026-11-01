package lc;

import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.ui.Wallet.y0;
public final class v {
    public final t f11779a;
    public final ac.g f11780b;
    public final h f11781c;
    public final ac.a d;
    public final p e;
    public final p f11782f;
    public z h;
    public a0 f11784i;
    public q f11785j;
    public c0 f11786k;
    public ArrayList f11787l;
    public boolean f11788m;
    public boolean f11790o;
    public boolean f11791p;
    public boolean f11792q;
    public boolean f11793r;
    public y f11794s;
    public y f11795t;
    public o f11796u;
    public final Object f11783g = new Object();
    public final Object f11789n = new Object();

    public v(boolean z10, String str, String str2, String str3, t tVar) {
        String str4;
        this.f11779a = tVar;
        ?? obj = new Object();
        obj.f386b = 1;
        obj.f385a = 1;
        this.f11780b = obj;
        ?? obj2 = new Object();
        obj2.f11753a = str;
        obj2.f11754b = str2;
        obj2.f11755c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f11781c = obj2;
        ?? obj3 = new Object();
        obj3.f364c = new ArrayList();
        obj3.f362a = true;
        obj3.f363b = this;
        this.d = obj3;
        this.e = new b2.h(this, "PingSender", new t7.u(10));
        this.f11782f = new b2.h(this, "PongSender", new t7.u(10));
    }

    public final void a() {
        synchronized (this.f11789n) {
            try {
                if (this.f11788m) {
                    return;
                }
                this.f11788m = true;
                ac.a aVar = this.d;
                ArrayList arrayList = (ArrayList) aVar.o();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    y0 y0Var = (y0) obj;
                    try {
                        try {
                            i0.g3(new org.telegram.ui.z(y0Var.f35407a, 3, y0Var.f35408b, y0Var, (v) aVar.f363b));
                        } catch (Throwable unused) {
                            y0Var.getClass();
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
        t tVar;
        synchronized (this.f11780b) {
            ac.g gVar = this.f11780b;
            if (gVar.f385a == 1) {
                gVar.f385a = 2;
            } else {
                throw new w(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.f();
        try {
            t tVar2 = this.f11779a;
            try {
                tVar2.a();
                h(tVar2.f11774g);
                ArrayList arrayList = this.f11787l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        x xVar = (x) obj;
                        if (xVar instanceof o) {
                            oVar = (o) xVar;
                            break;
                        }
                    }
                }
                this.f11796u = oVar;
                this.f11780b.f385a = 3;
                this.d.f();
                i();
            } catch (w e) {
                Socket socket = tVar.f11774g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (w e7) {
            Socket socket2 = this.f11779a.f11774g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f11780b.f385a = 5;
            this.d.f();
            throw e7;
        }
    }

    public final void c() {
        synchronized (this.f11780b) {
            try {
                int c10 = m1.j.c(this.f11780b.f385a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    ac.g gVar = this.f11780b;
                    gVar.f385a = 4;
                    if (gVar.f386b == 1) {
                        gVar.f386b = 3;
                    }
                    g(y.a(1000, null));
                    this.d.f();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                ac.a aVar = bVar.f11740a.d;
                if (aVar != null) {
                    ArrayList arrayList = (ArrayList) aVar.o();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                y0Var.getClass();
                            } catch (Throwable unused) {
                                y0Var.getClass();
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
        this.e.stop();
        this.f11782f.stop();
        Socket socket = this.f11779a.f11774g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f11780b) {
            this.f11780b.f385a = 5;
        }
        this.d.f();
        ac.a aVar = this.d;
        y yVar = this.f11794s;
        y yVar2 = this.f11795t;
        int i10 = 0;
        if (this.f11780b.f386b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) aVar.o();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.a((v) aVar.f363b, yVar, yVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f11783g) {
            this.f11790o = true;
            z10 = this.f11791p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f11782f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f11780b) {
            if (this.f11780b.f385a == 1) {
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

    public final void g(y yVar) {
        if (yVar != null) {
            synchronized (this.f11780b) {
                try {
                    int i10 = this.f11780b.f385a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    c0 c0Var = this.f11786k;
                    if (c0Var == null) {
                        return;
                    }
                    c0Var.f(yVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r18) {
        throw new UnsupportedOperationException("Method not decompiled: lc.v.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        c0 c0Var = new c0(this);
        synchronized (this.f11783g) {
            this.f11785j = qVar;
            this.f11786k = c0Var;
        }
        ac.a aVar = qVar.f11740a.d;
        int i10 = 0;
        if (aVar != null) {
            ArrayList arrayList = (ArrayList) aVar.o();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                        y0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ac.a aVar2 = c0Var.f11740a.d;
        if (aVar2 != null) {
            ArrayList arrayList2 = (ArrayList) aVar2.o();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused3) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        c0Var.start();
    }

    public final void j() {
        q qVar;
        c0 c0Var;
        synchronized (this.f11783g) {
            qVar = this.f11785j;
            c0Var = this.f11786k;
            this.f11785j = null;
            this.f11786k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (c0Var != null) {
            c0Var.g();
        }
    }
}
