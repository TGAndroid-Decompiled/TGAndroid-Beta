package oc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.w0;
public final class q extends a0 {
    public boolean f20988b;
    public x f20989c;
    public final ArrayList d;
    public final o f20990e;
    public final Object f20991f;
    public Timer h;
    public g6.q f20992n;
    public long f20993r;
    public boolean f20994s;

    public q(u uVar) {
        super("ReadingThread", uVar, 1);
        this.d = new ArrayList();
        this.f20991f = new Object();
        this.f20990e = uVar.f21025u;
    }

    @Override
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            v vVar = new v(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
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
        u uVar = this.f20959a;
        x xVar = this.f20989c;
        synchronized (uVar.f21012g) {
            try {
                uVar.f21021q = true;
                uVar.f21023s = xVar;
                if (uVar.f21022r) {
                    uVar.d();
                }
            } finally {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.f20959a.d.q();
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
    }

    public final void c(byte[] bArr) {
        u uVar = this.f20959a;
        uVar.getClass();
        b4.n nVar = uVar.d;
        int i3 = 0;
        try {
            SecureRandom secureRandom = k.f20982a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) nVar.q();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                w0 w0Var = (w0) obj;
                try {
                    try {
                        w0Var.b((u) nVar.f2378b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    w0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            uVar.d.d(new v(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) nVar.q();
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
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
        }
    }

    public final void e() {
        synchronized (this.f20991f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            g6.q qVar = this.f20992n;
            if (qVar != null) {
                qVar.cancel();
                this.f20992n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.f20990e.c(bArr);
        } catch (v e10) {
            u uVar = this.f20959a;
            uVar.d.d(e10);
            ArrayList arrayList = (ArrayList) uVar.d.q();
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
            uVar.g(x.a(1003, e10.getMessage()));
            return null;
        }
    }

    public final boolean g(oc.x r10) {
        throw new UnsupportedOperationException("Method not decompiled: oc.q.g(oc.x):boolean");
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: oc.q.h():void");
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.f20988b) {
                    return;
                }
                this.f20988b = true;
                interrupt();
                this.f20993r = 10000L;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f20991f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            g6.q qVar = this.f20992n;
            if (qVar != null) {
                qVar.cancel();
                this.f20992n = null;
            }
            this.f20992n = new g6.q(this, 2);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.f20992n, this.f20993r);
        }
    }

    public final void k(x xVar) {
        byte[] bArr;
        int i3;
        this.f20959a.getClass();
        boolean z10 = true;
        if ((this.f20990e != null && ((i3 = xVar.f21032e) == 1 || i3 == 2)) || !xVar.f21030b) {
            if (!xVar.f21031c) {
                if (!xVar.d) {
                    int i10 = xVar.f21032e;
                    if (i10 != 0 && i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                throw new v(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(xVar.f21032e));
                        }
                    }
                    if (!xVar.f21033f) {
                        if (8 <= i10 && i10 <= 15) {
                            if (!xVar.f21029a) {
                                throw new v(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z10 = false;
                            }
                            if (xVar.f21032e == 0) {
                                if (!z10) {
                                    throw new v(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z10) {
                                throw new v(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        int i11 = xVar.f21032e;
                        if (8 > i11 || i11 > 15 || (bArr = xVar.f21034g) == null || 125 >= bArr.length) {
                            return;
                        }
                        throw new v(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
                    }
                    throw new v(30, "A frame from the server is masked.");
                }
                throw new v(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new v(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new v(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
