package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public final class wyc extends huc {
    public final LinkedList b;
    public final d38 c;
    public boolean d;
    public fuc e;
    public boolean f;

    public wyc(buc bucVar) {
        super("WritingThread", bucVar, 2);
        this.b = new LinkedList();
        this.c = bucVar.u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th) {
            cuc cucVar = new cuc(39, "An uncaught throwable was detected in the writing thread: " + th.getMessage(), th);
            xf4 xf4Var = this.a.d;
            xf4Var.f(cucVar);
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
                    }
                } catch (Throwable unused2) {
                    o15Var.getClass();
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
            cuc cucVar = new cuc(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            xf4 xf4Var = this.a.d;
            xf4Var.f(cucVar);
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
            throw cucVar;
        }
    }

    public final void c() {
        boolean z;
        buc bucVar = this.a;
        synchronized (bucVar.g) {
            bucVar.p = true;
            z = bucVar.o;
        }
        bucVar.a();
        if (z) {
            bucVar.f();
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
                    } catch (cuc unused2) {
                    }
                } else {
                    continue;
                }
            }
            try {
                h(true);
                return;
            } catch (cuc unused3) {
                return;
            }
        }
    }

    public final void d() {
        buc bucVar = this.a;
        fuc fucVar = this.e;
        synchronized (bucVar.g) {
            bucVar.r = true;
            bucVar.t = fucVar;
            if (!bucVar.q) {
                return;
            }
            bucVar.d();
        }
    }

    public final void e(fuc fucVar) {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (!this.d && this.e == null) {
                int i = fucVar.e;
                if (8 <= i && i <= 15) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.a.getClass();
                }
            }
            int i2 = fucVar.e;
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
                    int i4 = ((fuc) it.next()).e;
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
                linkedList.add(i3, fucVar);
            } else {
                this.b.addLast(fucVar);
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

    public final void g(fuc fucVar) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        d38 d38Var = this.c;
        boolean z = true;
        if (d38Var != null && (((i = fucVar.e) == 1 || i == 2) && fucVar.a && !fucVar.b && (bArr = fucVar.g) != null && bArr.length != 0)) {
            try {
                bArr2 = d38Var.b(bArr);
            } catch (cuc unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                fucVar.c(bArr2);
                fucVar.b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            o15 o15Var = (o15) obj;
            try {
                try {
                    o15Var.getClass();
                } catch (Throwable unused2) {
                    o15Var.getClass();
                }
            } catch (Throwable unused3) {
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.a.d.u();
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                o15 o15Var2 = (o15) obj2;
                try {
                    try {
                        o15Var2.getClass();
                    } catch (Throwable unused4) {
                        o15Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i4 = fucVar.e;
        if (i4 == 8) {
            this.e = fucVar;
        }
        if (i4 == 8) {
            zw8 zw8Var = this.a.b;
            synchronized (zw8Var) {
                int i5 = zw8Var.b;
                if (i5 != 4 && i5 != 5) {
                    zw8Var.b = 4;
                    if (zw8Var.c == 1) {
                        zw8Var.c = 3;
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                this.a.d.g();
            }
        }
        try {
            this.a.i.a(fucVar);
            ArrayList arrayList3 = (ArrayList) this.a.d.u();
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                o15 o15Var3 = (o15) obj3;
                try {
                    try {
                        o15Var3.getClass();
                    } catch (Throwable unused6) {
                        o15Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            cuc cucVar = new cuc(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            xf4 xf4Var = this.a.d;
            xf4Var.f(cucVar);
            ArrayList arrayList4 = (ArrayList) xf4Var.u();
            int size4 = arrayList4.size();
            while (i2 < size4) {
                Object obj4 = arrayList4.get(i2);
                i2++;
                o15 o15Var4 = (o15) obj4;
                try {
                    try {
                        o15Var4.getClass();
                    } catch (Throwable unused8) {
                        o15Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw cucVar;
        }
    }

    public final void h(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyc.h(boolean):void");
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
