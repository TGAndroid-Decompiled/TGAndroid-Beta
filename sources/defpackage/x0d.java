package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public final class x0d extends iwc {
    public final LinkedList b;
    public final f58 c;
    public boolean d;
    public gwc e;
    public boolean f;

    public x0d(cwc cwcVar) {
        super("WritingThread", cwcVar, 2);
        this.b = new LinkedList();
        this.c = cwcVar.u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th) {
            dwc dwcVar = new dwc(39, "An uncaught throwable was detected in the writing thread: " + th.getMessage(), th);
            yh4 yh4Var = this.a.d;
            yh4Var.f(dwcVar);
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
                    }
                } catch (Throwable unused2) {
                    o35Var.getClass();
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
            dwc dwcVar = new dwc(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            yh4 yh4Var = this.a.d;
            yh4Var.f(dwcVar);
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
            throw dwcVar;
        }
    }

    public final void c() {
        boolean z;
        cwc cwcVar = this.a;
        synchronized (cwcVar.g) {
            cwcVar.p = true;
            z = cwcVar.o;
        }
        cwcVar.a();
        if (z) {
            cwcVar.f();
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
                    } catch (dwc unused2) {
                    }
                } else {
                    continue;
                }
            }
            try {
                h(true);
                return;
            } catch (dwc unused3) {
                return;
            }
        }
    }

    public final void d() {
        cwc cwcVar = this.a;
        gwc gwcVar = this.e;
        synchronized (cwcVar.g) {
            cwcVar.r = true;
            cwcVar.t = gwcVar;
            if (!cwcVar.q) {
                return;
            }
            cwcVar.d();
        }
    }

    public final void e(gwc gwcVar) {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (!this.d && this.e == null) {
                int i = gwcVar.e;
                if (8 <= i && i <= 15) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.a.getClass();
                }
            }
            int i2 = gwcVar.e;
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
                    int i4 = ((gwc) it.next()).e;
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
                linkedList.add(i3, gwcVar);
            } else {
                this.b.addLast(gwcVar);
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

    public final void g(gwc gwcVar) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        f58 f58Var = this.c;
        boolean z = true;
        if (f58Var != null && (((i = gwcVar.e) == 1 || i == 2) && gwcVar.a && !gwcVar.b && (bArr = gwcVar.g) != null && bArr.length != 0)) {
            try {
                bArr2 = f58Var.b(bArr);
            } catch (dwc unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                gwcVar.c(bArr2);
                gwcVar.b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            o35 o35Var = (o35) obj;
            try {
                try {
                    o35Var.getClass();
                } catch (Throwable unused2) {
                    o35Var.getClass();
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
                o35 o35Var2 = (o35) obj2;
                try {
                    try {
                        o35Var2.getClass();
                    } catch (Throwable unused4) {
                        o35Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i4 = gwcVar.e;
        if (i4 == 8) {
            this.e = gwcVar;
        }
        if (i4 == 8) {
            az8 az8Var = this.a.b;
            synchronized (az8Var) {
                int i5 = az8Var.b;
                if (i5 != 4 && i5 != 5) {
                    az8Var.b = 4;
                    if (az8Var.c == 1) {
                        az8Var.c = 3;
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
            this.a.i.a(gwcVar);
            ArrayList arrayList3 = (ArrayList) this.a.d.u();
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                o35 o35Var3 = (o35) obj3;
                try {
                    try {
                        o35Var3.getClass();
                    } catch (Throwable unused6) {
                        o35Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            dwc dwcVar = new dwc(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            yh4 yh4Var = this.a.d;
            yh4Var.f(dwcVar);
            ArrayList arrayList4 = (ArrayList) yh4Var.u();
            int size4 = arrayList4.size();
            while (i2 < size4) {
                Object obj4 = arrayList4.get(i2);
                i2++;
                o35 o35Var4 = (o35) obj4;
                try {
                    try {
                        o35Var4.getClass();
                    } catch (Throwable unused8) {
                        o35Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw dwcVar;
        }
    }

    public final void h(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0d.h(boolean):void");
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
