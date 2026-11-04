package oc;

import d2.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.w0;
public final class b0 extends a0 {
    public final LinkedList f20961b;
    public final o f20962c;
    public boolean d;
    public x f20963e;
    public boolean f20964f;

    public b0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f20961b = new LinkedList();
        this.f20962c = uVar.f21025u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            b4.n nVar = this.f20959a.d;
            nVar.d(vVar);
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
                    }
                } catch (Throwable unused2) {
                    w0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f20964f = true;
            notifyAll();
        }
        e();
    }

    public final void b() {
        try {
            this.f20959a.f21013i.flush();
            synchronized (this) {
            }
        } catch (IOException e10) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e10.getMessage(), e10);
            b4.n nVar = this.f20959a.d;
            nVar.d(vVar);
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
            throw vVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.f20959a;
        synchronized (uVar.f21012g) {
            uVar.f21020p = true;
            z10 = uVar.f21019o;
        }
        uVar.a();
        if (z10) {
            uVar.f();
        }
        while (true) {
            int j10 = j();
            if (j10 != 1) {
                if (j10 == 3) {
                    try {
                        this.f20959a.f21013i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j10 == 2) {
                    continue;
                } else {
                    try {
                        i(false);
                    } catch (v unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (v unused3) {
                return;
            }
        }
    }

    public final void e() {
        u uVar = this.f20959a;
        x xVar = this.f20963e;
        synchronized (uVar.f21012g) {
            try {
                uVar.f21022r = true;
                uVar.f21024t = xVar;
                if (!uVar.f21021q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(oc.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: oc.b0.f(oc.x):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(x xVar) {
        int i3;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f20962c;
        boolean z10 = true;
        if (oVar != null && (((i3 = xVar.f21032e) == 1 || i3 == 2) && xVar.f21029a && !xVar.f21030b && (bArr = xVar.f21034g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.f21030b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f20959a.d.q();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            w0 w0Var = (w0) obj;
            try {
                try {
                    w0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                w0Var.getClass();
            }
        }
        if (this.f20963e != null) {
            ArrayList arrayList2 = (ArrayList) this.f20959a.d.q();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                w0 w0Var2 = (w0) obj2;
                try {
                    try {
                        w0Var2.getClass();
                    } catch (Throwable unused4) {
                        w0Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i12 = xVar.f21032e;
        if (i12 == 8) {
            this.f20963e = xVar;
        }
        if (i12 == 8) {
            t0 t0Var = this.f20959a.f21008b;
            synchronized (t0Var) {
                int i13 = t0Var.f8413a;
                if (i13 != 4 && i13 != 5) {
                    t0Var.f8413a = 4;
                    if (t0Var.f8414b == 1) {
                        t0Var.f8414b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f20959a.d.g();
            }
        }
        try {
            this.f20959a.f21013i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.f20959a.d.q();
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                w0 w0Var3 = (w0) obj3;
                try {
                    try {
                        w0Var3.getClass();
                    } catch (Throwable unused6) {
                        w0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e10) {
            v vVar = new v(26, "An I/O error occurred when a frame was tried to be sent: " + e10.getMessage(), e10);
            b4.n nVar = this.f20959a.d;
            nVar.d(vVar);
            ArrayList arrayList4 = (ArrayList) nVar.q();
            int size4 = arrayList4.size();
            while (i10 < size4) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                w0 w0Var4 = (w0) obj4;
                try {
                    try {
                        w0Var4.getClass();
                    } catch (Throwable unused8) {
                        w0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw vVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: oc.b0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.f20963e != null) {
                    return 1;
                }
                if (this.f20961b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f20961b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
