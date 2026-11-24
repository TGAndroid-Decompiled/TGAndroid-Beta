package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
public final class buc {
    public final dka a;
    public final zw8 b;
    public final c5a c;
    public final xf4 d;
    public final na8 e;
    public final na8 f;
    public lg6 h;
    public guc i;
    public n19 j;
    public wyc k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public fuc s;
    public fuc t;
    public d38 u;
    public final Object g = new Object();
    public final Object n = new Object();

    public buc(boolean z, String str, String str2, String str3, dka dkaVar) {
        this.a = dkaVar;
        zw8 zw8Var = new zw8((byte) 6);
        zw8Var.c = 1;
        zw8Var.b = 1;
        this.b = zw8Var;
        this.c = new c5a(str, str2, str3, z);
        ?? obj = new Object();
        obj.c = new ArrayList();
        obj.a = true;
        obj.b = this;
        this.d = obj;
        this.e = new l13(this, "PingSender", new pd5((byte) 16));
        this.f = new l13(this, "PongSender", new pd5((byte) 16));
    }

    public final void a() {
        synchronized (this.n) {
            if (this.m) {
                return;
            }
            this.m = true;
            xf4 xf4Var = this.d;
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        gl.c3(new o57(o15Var, (buc) xf4Var.b, o15Var.a, o15Var.b, (byte) 5));
                    } catch (Throwable unused) {
                        o15Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b() {
        dka dkaVar;
        synchronized (this.b) {
            zw8 zw8Var = this.b;
            if (zw8Var.b == 1) {
                zw8Var.b = 2;
            } else {
                throw new cuc(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.g();
        try {
            dka dkaVar2 = this.a;
            try {
                dkaVar2.a();
                h(dkaVar2.g);
                ArrayList arrayList = this.l;
                d38 d38Var = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        duc ducVar = (duc) obj;
                        if (ducVar instanceof d38) {
                            d38Var = (d38) ducVar;
                            break;
                        }
                    }
                }
                this.u = d38Var;
                this.b.b = 3;
                this.d.g();
                i();
            } catch (cuc e) {
                Socket socket = dkaVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (cuc e2) {
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
            int F = ug8.F(this.b.b);
            if (F != 0) {
                if (F != 2) {
                    return;
                }
                zw8 zw8Var = this.b;
                zw8Var.b = 4;
                if (zw8Var.c == 1) {
                    zw8Var.c = 3;
                }
                g(fuc.a(1000, null));
                this.d.g();
                j();
                return;
            }
            xr2 xr2Var = new xr2("FinishThread", this, 4, (byte) 1);
            xf4 xf4Var = xr2Var.a.d;
            if (xf4Var != null) {
                ArrayList arrayList = (ArrayList) xf4Var.u();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    o15 o15Var = (o15) obj;
                    try {
                        try {
                            o15Var.getClass();
                        } catch (Throwable unused) {
                            o15Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            xr2Var.start();
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
        xf4 xf4Var = this.d;
        fuc fucVar = this.s;
        fuc fucVar2 = this.t;
        int i = 0;
        if (this.b.c == 2) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = (ArrayList) xf4Var.u();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o15 o15Var = (o15) obj;
            try {
                try {
                    o15Var.a((buc) xf4Var.b, fucVar, fucVar2, z);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                o15Var.getClass();
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
        na8 na8Var = this.e;
        synchronized (na8Var) {
        }
        na8Var.e();
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

    public final void g(fuc fucVar) {
        if (fucVar != null) {
            synchronized (this.b) {
                int i = this.b.b;
                if (i != 3 && i != 4) {
                    return;
                }
                wyc wycVar = this.k;
                if (wycVar == null) {
                    return;
                }
                wycVar.e(fucVar);
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buc.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        n19 n19Var = new n19(this);
        wyc wycVar = new wyc(this);
        synchronized (this.g) {
            this.j = n19Var;
            this.k = wycVar;
        }
        xf4 xf4Var = n19Var.a.d;
        int i = 0;
        if (xf4Var != null) {
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.getClass();
                    } catch (Throwable unused) {
                        o15Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        xf4 xf4Var2 = wycVar.a.d;
        if (xf4Var2 != null) {
            ArrayList arrayList2 = (ArrayList) xf4Var2.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o15 o15Var2 = (o15) obj2;
                try {
                    try {
                        o15Var2.getClass();
                    } catch (Throwable unused3) {
                        o15Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        n19Var.start();
        wycVar.start();
    }

    public final void j() {
        n19 n19Var;
        wyc wycVar;
        synchronized (this.g) {
            n19Var = this.j;
            wycVar = this.k;
            this.j = null;
            this.k = null;
        }
        if (n19Var != null) {
            n19Var.h();
        }
        if (wycVar != null) {
            wycVar.f();
        }
    }
}
