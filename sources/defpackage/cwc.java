package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
public final class cwc {
    public final ema a;
    public final az8 b;
    public final e7a c;
    public final yh4 d;
    public final qc8 e;
    public final qc8 f;
    public li6 h;
    public hwc i;
    public q39 j;
    public x0d k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public gwc s;
    public gwc t;
    public f58 u;
    public final Object g = new Object();
    public final Object n = new Object();

    public cwc(boolean z, String str, String str2, String str3, ema emaVar) {
        String str4;
        this.a = emaVar;
        az8 az8Var = new az8((byte) 6);
        az8Var.c = 1;
        az8Var.b = 1;
        this.b = az8Var;
        ?? obj = new Object();
        obj.a = str;
        obj.b = str2;
        obj.c = str3;
        if (z) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.c = obj;
        ?? obj2 = new Object();
        obj2.c = new ArrayList();
        obj2.a = true;
        obj2.b = this;
        this.d = obj2;
        this.e = new x23(this, "PingSender", new nf5((byte) 16));
        this.f = new x23(this, "PongSender", new nf5((byte) 16));
    }

    public final void a() {
        synchronized (this.n) {
            if (this.m) {
                return;
            }
            this.m = true;
            yh4 yh4Var = this.d;
            ArrayList arrayList = (ArrayList) yh4Var.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        gm.c3(new o77(o35Var, (cwc) yh4Var.b, o35Var.a, o35Var.b, (byte) 5));
                    } catch (Throwable unused) {
                        o35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b() {
        ema emaVar;
        synchronized (this.b) {
            az8 az8Var = this.b;
            if (az8Var.b == 1) {
                az8Var.b = 2;
            } else {
                throw new dwc(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.g();
        try {
            ema emaVar2 = this.a;
            try {
                emaVar2.a();
                h(emaVar2.g);
                ArrayList arrayList = this.l;
                f58 f58Var = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        ewc ewcVar = (ewc) obj;
                        if (ewcVar instanceof f58) {
                            f58Var = (f58) ewcVar;
                            break;
                        }
                    }
                }
                this.u = f58Var;
                this.b.b = 3;
                this.d.g();
                i();
            } catch (dwc e) {
                Socket socket = emaVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (dwc e2) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.b = 5;
            this.d.g();
            throw e2;
        }
    }

    public final void c() {
        synchronized (this.b) {
            int F = wi8.F(this.b.b);
            if (F != 0) {
                if (F != 2) {
                    return;
                }
                az8 az8Var = this.b;
                az8Var.b = 4;
                if (az8Var.c == 1) {
                    az8Var.c = 3;
                }
                g(gwc.a(1000, null));
                this.d.g();
                j();
                return;
            }
            it2 it2Var = new it2("FinishThread", this, 4, (byte) 1);
            yh4 yh4Var = it2Var.a.d;
            if (yh4Var != null) {
                ArrayList arrayList = (ArrayList) yh4Var.u();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    o35 o35Var = (o35) obj;
                    try {
                        try {
                            o35Var.getClass();
                        } catch (Throwable unused) {
                            o35Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            it2Var.start();
        }
    }

    public final void d() {
        boolean z;
        this.e.g();
        this.f.g();
        Socket socket = this.a.g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.b) {
            this.b.b = 5;
        }
        this.d.g();
        yh4 yh4Var = this.d;
        gwc gwcVar = this.s;
        gwc gwcVar2 = this.t;
        int i = 0;
        if (this.b.c == 2) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = (ArrayList) yh4Var.u();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o35 o35Var = (o35) obj;
            try {
                try {
                    o35Var.a((cwc) yh4Var.b, gwcVar, gwcVar2, z);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                o35Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z;
        synchronized (this.g) {
            this.o = true;
            z = this.p;
        }
        a();
        if (z) {
            f();
        }
    }

    public final void f() {
        qc8 qc8Var = this.e;
        synchronized (qc8Var) {
        }
        qc8Var.e();
        this.f.f();
    }

    public final void finalize() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.b.b != 1) {
                z = false;
            }
        }
        if (z) {
            d();
        }
        super.finalize();
    }

    public final void g(gwc gwcVar) {
        if (gwcVar != null) {
            synchronized (this.b) {
                int i = this.b.b;
                if (i != 3 && i != 4) {
                    return;
                }
                x0d x0dVar = this.k;
                if (x0dVar == null) {
                    return;
                }
                x0dVar.e(gwcVar);
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwc.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q39 q39Var = new q39(this);
        x0d x0dVar = new x0d(this);
        synchronized (this.g) {
            this.j = q39Var;
            this.k = x0dVar;
        }
        yh4 yh4Var = q39Var.a.d;
        int i = 0;
        if (yh4Var != null) {
            ArrayList arrayList = (ArrayList) yh4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        o35Var.getClass();
                    } catch (Throwable unused) {
                        o35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        yh4 yh4Var2 = x0dVar.a.d;
        if (yh4Var2 != null) {
            ArrayList arrayList2 = (ArrayList) yh4Var2.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o35 o35Var2 = (o35) obj2;
                try {
                    try {
                        o35Var2.getClass();
                    } catch (Throwable unused3) {
                        o35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        q39Var.start();
        x0dVar.start();
    }

    public final void j() {
        q39 q39Var;
        x0d x0dVar;
        synchronized (this.g) {
            q39Var = this.j;
            x0dVar = this.k;
            this.j = null;
            this.k = null;
        }
        if (q39Var != null) {
            q39Var.h();
        }
        if (x0dVar != null) {
            x0dVar.f();
        }
    }
}
