package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
public final class ryc {
    public final xna a;
    public final m09 b;
    public final u8a c;
    public final vh4 d;
    public final ee8 e;
    public final ee8 f;
    public pi6 h;
    public wyc i;
    public c59 j;
    public m3d k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public vyc s;
    public vyc t;
    public t68 u;
    public final Object g = new Object();
    public final Object n = new Object();

    public ryc(boolean z, String str, String str2, String str3, xna xnaVar) {
        String str4;
        this.a = xnaVar;
        m09 m09Var = new m09((byte) 6);
        m09Var.c = 1;
        m09Var.b = 1;
        this.b = m09Var;
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
        this.e = new e23(this, "PingSender", new qf5((byte) 16));
        this.f = new e23(this, "PongSender", new qf5((byte) 16));
    }

    public final void a() {
        synchronized (this.n) {
            if (this.m) {
                return;
            }
            this.m = true;
            vh4 vh4Var = this.d;
            ArrayList arrayList = (ArrayList) vh4Var.s();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        hl.c3(new r77(s35Var, (ryc) vh4Var.b, s35Var.a, s35Var.b, (byte) 5));
                    } catch (Throwable unused) {
                        s35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b() {
        xna xnaVar;
        synchronized (this.b) {
            m09 m09Var = this.b;
            if (m09Var.b == 1) {
                m09Var.b = 2;
            } else {
                throw new syc(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            xna xnaVar2 = this.a;
            try {
                xnaVar2.a();
                h(xnaVar2.g);
                ArrayList arrayList = this.l;
                t68 t68Var = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        tyc tycVar = (tyc) obj;
                        if (tycVar instanceof t68) {
                            t68Var = (t68) tycVar;
                            break;
                        }
                    }
                }
                this.u = t68Var;
                this.b.b = 3;
                this.d.e();
                i();
            } catch (syc e) {
                Socket socket = xnaVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (syc e2) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.b = 5;
            this.d.e();
            throw e2;
        }
    }

    public final void c() {
        synchronized (this.b) {
            int F = ik8.F(this.b.b);
            if (F != 0) {
                if (F != 2) {
                    return;
                }
                m09 m09Var = this.b;
                m09Var.b = 4;
                if (m09Var.c == 1) {
                    m09Var.c = 3;
                }
                g(vyc.a(1000, null));
                this.d.e();
                j();
                return;
            }
            qs2 qs2Var = new qs2("FinishThread", this, 4, (byte) 1);
            vh4 vh4Var = qs2Var.a.d;
            if (vh4Var != null) {
                ArrayList arrayList = (ArrayList) vh4Var.s();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    s35 s35Var = (s35) obj;
                    try {
                        try {
                            s35Var.getClass();
                        } catch (Throwable unused) {
                            s35Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            qs2Var.start();
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
        this.d.e();
        vh4 vh4Var = this.d;
        vyc vycVar = this.s;
        vyc vycVar2 = this.t;
        int i = 0;
        if (this.b.c == 2) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = (ArrayList) vh4Var.s();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    s35Var.a((ryc) vh4Var.b, vycVar, vycVar2, z);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                s35Var.getClass();
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
        ee8 ee8Var = this.e;
        synchronized (ee8Var) {
        }
        ee8Var.e();
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

    public final void g(vyc vycVar) {
        if (vycVar != null) {
            synchronized (this.b) {
                int i = this.b.b;
                if (i != 3 && i != 4) {
                    return;
                }
                m3d m3dVar = this.k;
                if (m3dVar == null) {
                    return;
                }
                m3dVar.e(vycVar);
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryc.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        c59 c59Var = new c59(this);
        m3d m3dVar = new m3d(this);
        synchronized (this.g) {
            this.j = c59Var;
            this.k = m3dVar;
        }
        vh4 vh4Var = c59Var.a.d;
        int i = 0;
        if (vh4Var != null) {
            ArrayList arrayList = (ArrayList) vh4Var.s();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        s35Var.getClass();
                    } catch (Throwable unused) {
                        s35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        vh4 vh4Var2 = m3dVar.a.d;
        if (vh4Var2 != null) {
            ArrayList arrayList2 = (ArrayList) vh4Var2.s();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused3) {
                        s35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        c59Var.start();
        m3dVar.start();
    }

    public final void j() {
        c59 c59Var;
        m3d m3dVar;
        synchronized (this.g) {
            c59Var = this.j;
            m3dVar = this.k;
            this.j = null;
            this.k = null;
        }
        if (c59Var != null) {
            c59Var.h();
        }
        if (m3dVar != null) {
            m3dVar.f();
        }
    }
}
