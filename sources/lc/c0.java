package lc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.y0;
public final class c0 extends b0 {
    public final LinkedList f11740b;
    public final o f11741c;
    public boolean d;
    public y e;
    public boolean f11742f;

    public c0(v vVar) {
        super("WritingThread", vVar, 2);
        this.f11740b = new LinkedList();
        this.f11741c = vVar.f11795u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            w wVar = new w(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            ac.a aVar = this.f11739a.d;
            aVar.d(wVar);
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
                    }
                } catch (Throwable unused2) {
                    y0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f11742f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.f11739a.f11783i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            w wVar = new w(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            ac.a aVar = this.f11739a.d;
            aVar.d(wVar);
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
            throw wVar;
        }
    }

    public final void c() {
        boolean z10;
        v vVar = this.f11739a;
        synchronized (vVar.f11782g) {
            vVar.f11790p = true;
            z10 = vVar.f11789o;
        }
        vVar.a();
        if (z10) {
            vVar.f();
        }
        while (true) {
            int j10 = j();
            if (j10 != 1) {
                if (j10 == 3) {
                    try {
                        this.f11739a.f11783i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j10 == 2) {
                    continue;
                } else {
                    try {
                        i(false);
                    } catch (w unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (w unused3) {
                return;
            }
        }
    }

    public final void d() {
        v vVar = this.f11739a;
        y yVar = this.e;
        synchronized (vVar.f11782g) {
            try {
                vVar.f11792r = true;
                vVar.f11794t = yVar;
                if (!vVar.f11791q) {
                    return;
                }
                vVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(lc.y r9) {
        throw new UnsupportedOperationException("Method not decompiled: lc.c0.f(lc.y):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(y yVar) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f11741c;
        boolean z10 = true;
        if (oVar != null && (((i10 = yVar.e) == 1 || i10 == 2) && yVar.f11799a && !yVar.f11800b && (bArr = yVar.f11803g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (w unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                yVar.c(bArr2);
                yVar.f11800b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f11739a.d.o();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.f11739a.d.o();
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused4) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i13 = yVar.e;
        if (i13 == 8) {
            this.e = yVar;
        }
        if (i13 == 8) {
            ac.g gVar = this.f11739a.f11779b;
            synchronized (gVar) {
                int i14 = gVar.f385a;
                if (i14 != 4 && i14 != 5) {
                    gVar.f385a = 4;
                    if (gVar.f386b == 1) {
                        gVar.f386b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f11739a.d.f();
            }
        }
        try {
            this.f11739a.f11783i.a(yVar);
            ArrayList arrayList3 = (ArrayList) this.f11739a.d.o();
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                y0 y0Var3 = (y0) obj3;
                try {
                    try {
                        y0Var3.getClass();
                    } catch (Throwable unused6) {
                        y0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            w wVar = new w(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            ac.a aVar = this.f11739a.d;
            aVar.d(wVar);
            ArrayList arrayList4 = (ArrayList) aVar.o();
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                y0 y0Var4 = (y0) obj4;
                try {
                    try {
                        y0Var4.getClass();
                    } catch (Throwable unused8) {
                        y0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw wVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: lc.c0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.e != null) {
                    return 1;
                }
                if (this.f11740b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f11740b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
