package lc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.y0;
public final class q extends b0 {
    public boolean f11761b;
    public y f11762c;
    public final ArrayList d;
    public final o e;
    public final Object f11763f;
    public Timer h;
    public e6.r f11764n;
    public long f11765r;
    public boolean f11766s;

    public q(v vVar) {
        super("ReadingThread", vVar, 1);
        this.d = new ArrayList();
        this.f11763f = new Object();
        this.e = vVar.f11795u;
    }

    @Override
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            w wVar = new w(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
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
        v vVar = this.f11739a;
        y yVar = this.f11762c;
        synchronized (vVar.f11782g) {
            try {
                vVar.f11791q = true;
                vVar.f11793s = yVar;
                if (vVar.f11792r) {
                    vVar.d();
                }
            } finally {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.f11739a.d.o();
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

    public final void c(byte[] bArr) {
        v vVar = this.f11739a;
        vVar.getClass();
        ac.a aVar = vVar.d;
        int i10 = 0;
        try {
            SecureRandom secureRandom = k.f11756a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) aVar.o();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.b((v) aVar.f363b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    y0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            vVar.d.d(new w(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) aVar.o();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
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
        }
    }

    public final void d() {
        synchronized (this.f11763f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            e6.r rVar = this.f11764n;
            if (rVar != null) {
                rVar.cancel();
                this.f11764n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (w e) {
            v vVar = this.f11739a;
            vVar.d.d(e);
            ArrayList arrayList = (ArrayList) vVar.d.o();
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
            vVar.g(y.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean g(lc.y r10) {
        throw new UnsupportedOperationException("Method not decompiled: lc.q.g(lc.y):boolean");
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: lc.q.h():void");
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.f11761b) {
                    return;
                }
                this.f11761b = true;
                interrupt();
                this.f11765r = 10000L;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f11763f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            e6.r rVar = this.f11764n;
            if (rVar != null) {
                rVar.cancel();
                this.f11764n = null;
            }
            this.f11764n = new e6.r(this, 1);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.f11764n, this.f11765r);
        }
    }

    public final void k(y yVar) {
        byte[] bArr;
        int i10;
        this.f11739a.getClass();
        boolean z10 = true;
        if ((this.e != null && ((i10 = yVar.e) == 1 || i10 == 2)) || !yVar.f11800b) {
            if (!yVar.f11801c) {
                if (!yVar.d) {
                    int i11 = yVar.e;
                    if (i11 != 0 && i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                throw new w(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(yVar.e));
                        }
                    }
                    if (!yVar.f11802f) {
                        if (8 <= i11 && i11 <= 15) {
                            if (!yVar.f11799a) {
                                throw new w(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z10 = false;
                            }
                            if (yVar.e == 0) {
                                if (!z10) {
                                    throw new w(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z10) {
                                throw new w(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        int i12 = yVar.e;
                        if (8 > i12 || i12 > 15 || (bArr = yVar.f11803g) == null || 125 >= bArr.length) {
                            return;
                        }
                        throw new w(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
                    }
                    throw new w(30, "A frame from the server is masked.");
                }
                throw new w(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new w(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new w(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
