package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public final class m3d extends xyc {
    public final LinkedList b;
    public final t68 c;
    public boolean d;
    public vyc e;
    public boolean f;

    public m3d(ryc rycVar) {
        super("WritingThread", rycVar, 2);
        this.b = new LinkedList();
        this.c = rycVar.u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th) {
            syc sycVar = new syc(39, "An uncaught throwable was detected in the writing thread: " + th.getMessage(), th);
            vh4 vh4Var = this.a.d;
            vh4Var.d(sycVar);
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
                    }
                } catch (Throwable unused2) {
                    s35Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.a.i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            syc sycVar = new syc(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            vh4 vh4Var = this.a.d;
            vh4Var.d(sycVar);
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
            throw sycVar;
        }
    }

    public final void c() {
        boolean z;
        ryc rycVar = this.a;
        synchronized (rycVar.g) {
            rycVar.p = true;
            z = rycVar.o;
        }
        rycVar.a();
        if (z) {
            rycVar.f();
        }
        while (true) {
            int i = i();
            if (i != 1) {
                if (i == 3) {
                    try {
                        this.a.i.flush();
                    } catch (IOException unused) {
                    }
                } else if (i != 2) {
                    try {
                        h(false);
                    } catch (syc unused2) {
                    }
                } else {
                    continue;
                }
            }
            try {
                h(true);
                return;
            } catch (syc unused3) {
                return;
            }
        }
    }

    public final void d() {
        ryc rycVar = this.a;
        vyc vycVar = this.e;
        synchronized (rycVar.g) {
            rycVar.r = true;
            rycVar.t = vycVar;
            if (!rycVar.q) {
                return;
            }
            rycVar.d();
        }
    }

    public final void e(vyc vycVar) {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (!this.d && this.e == null) {
                int i = vycVar.e;
                if (8 <= i && i <= 15) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.a.getClass();
                }
            }
            int i2 = vycVar.e;
            if (i2 == 9 || i2 == 10) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinkedList linkedList = this.b;
                Iterator it = linkedList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    int i4 = ((vyc) it.next()).e;
                    if (i4 == 9 || i4 == 10) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    i3++;
                }
                linkedList.add(i3, vycVar);
            } else {
                this.b.addLast(vycVar);
            }
            notifyAll();
        }
    }

    public final void f() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void g(vyc vycVar) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        t68 t68Var = this.c;
        boolean z = true;
        if (t68Var != null && (((i = vycVar.e) == 1 || i == 2) && vycVar.a && !vycVar.b && (bArr = vycVar.g) != null && bArr.length != 0)) {
            try {
                bArr2 = t68Var.b(bArr);
            } catch (syc unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                vycVar.c(bArr2);
                vycVar.b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.a.d.s();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    s35Var.getClass();
                } catch (Throwable unused2) {
                    s35Var.getClass();
                }
            } catch (Throwable unused3) {
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.a.d.s();
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused4) {
                        s35Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i4 = vycVar.e;
        if (i4 == 8) {
            this.e = vycVar;
        }
        if (i4 == 8) {
            l09 l09Var = this.a.b;
            synchronized (l09Var) {
                int i5 = l09Var.b;
                if (i5 != 4 && i5 != 5) {
                    l09Var.b = 4;
                    if (l09Var.c == 1) {
                        l09Var.c = 3;
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                this.a.d.e();
            }
        }
        try {
            this.a.i.a(vycVar);
            ArrayList arrayList3 = (ArrayList) this.a.d.s();
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                s35 s35Var3 = (s35) obj3;
                try {
                    try {
                        s35Var3.getClass();
                    } catch (Throwable unused6) {
                        s35Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            syc sycVar = new syc(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            vh4 vh4Var = this.a.d;
            vh4Var.d(sycVar);
            ArrayList arrayList4 = (ArrayList) vh4Var.s();
            int size4 = arrayList4.size();
            while (i2 < size4) {
                Object obj4 = arrayList4.get(i2);
                i2++;
                s35 s35Var4 = (s35) obj4;
                try {
                    try {
                        s35Var4.getClass();
                    } catch (Throwable unused8) {
                        s35Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw sycVar;
        }
    }

    public final void h(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3d.h(boolean):void");
    }

    public final int i() {
        synchronized (this) {
            if (this.d) {
                return 1;
            }
            if (this.e != null) {
                return 1;
            }
            if (this.b.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.d) {
                return 1;
            }
            if (this.b.size() == 0) {
                return 2;
            }
            return 0;
        }
    }
}
