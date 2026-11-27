package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
public final class c59 extends xyc {
    public boolean b;
    public vyc c;
    public final ArrayList d;
    public final t68 e;
    public final Object f;
    public Timer h;
    public vw3 n;
    public short r;
    public boolean s;

    public c59(ryc rycVar) {
        super("ReadingThread", rycVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = rycVar.u;
    }

    @Override
    public final void a() {
        try {
            g();
        } catch (Throwable th) {
            syc sycVar = new syc(38, "An uncaught throwable was detected in the reading thread: " + th.getMessage(), th);
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
        ryc rycVar = this.a;
        vyc vycVar = this.c;
        synchronized (rycVar.g) {
            rycVar.q = true;
            rycVar.s = vycVar;
            if (rycVar.r) {
                rycVar.d();
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.a.d.s();
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

    public final void c(byte[] bArr) {
        ryc rycVar = this.a;
        rycVar.getClass();
        vh4 vh4Var = rycVar.d;
        int i = 0;
        try {
            SecureRandom secureRandom = ig7.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) vh4Var.s();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        s35Var.b((ryc) vh4Var.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    s35Var.getClass();
                }
            }
        } catch (Throwable th) {
            rycVar.d.d(new syc(37, "Failed to convert payload data into a string: " + th.getMessage(), th));
            ArrayList arrayList2 = (ArrayList) vh4Var.s();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    s35Var2.getClass();
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            vw3 vw3Var = this.n;
            if (vw3Var != null) {
                vw3Var.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] e(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (syc e) {
            ryc rycVar = this.a;
            rycVar.d.d(e);
            ArrayList arrayList = (ArrayList) rycVar.d.s();
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
            rycVar.g(vyc.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean f(vyc vycVar) {
        byte[] bArr;
        ArrayList arrayList = (ArrayList) this.a.d.s();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
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
        int i3 = vycVar.e;
        boolean z = true;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    switch (i3) {
                        case 8:
                            m09 m09Var = this.a.b;
                            this.c = vycVar;
                            synchronized (m09Var) {
                                int i4 = m09Var.b;
                                if (i4 != 4 && i4 != 5) {
                                    m09Var.b = 4;
                                    if (m09Var.c == 1) {
                                        m09Var.c = 2;
                                    }
                                    this.a.g(vycVar);
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                this.a.d.e();
                            }
                            ArrayList arrayList2 = (ArrayList) this.a.d.s();
                            int size2 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj2 = arrayList2.get(i5);
                                i5++;
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
                            return false;
                        case 9:
                            ryc rycVar = this.a;
                            ArrayList arrayList3 = (ArrayList) rycVar.d.s();
                            int size3 = arrayList3.size();
                            while (i < size3) {
                                Object obj3 = arrayList3.get(i);
                                i++;
                                s35 s35Var3 = (s35) obj3;
                                try {
                                    try {
                                        s35Var3.getClass();
                                    } catch (Throwable unused5) {
                                        s35Var3.getClass();
                                    }
                                } catch (Throwable unused6) {
                                }
                            }
                            byte[] bArr2 = vycVar.g;
                            ?? obj4 = new Object();
                            obj4.a = true;
                            obj4.e = 10;
                            obj4.c(bArr2);
                            rycVar.g(obj4);
                            return true;
                        case 10:
                            ArrayList arrayList4 = (ArrayList) this.a.d.s();
                            int size4 = arrayList4.size();
                            while (i < size4) {
                                Object obj5 = arrayList4.get(i);
                                i++;
                                s35 s35Var4 = (s35) obj5;
                                try {
                                    try {
                                        s35Var4.getClass();
                                    } catch (Throwable unused7) {
                                        s35Var4.getClass();
                                    }
                                } catch (Throwable unused8) {
                                }
                            }
                            break;
                    }
                } else {
                    ArrayList arrayList5 = (ArrayList) this.a.d.s();
                    int size5 = arrayList5.size();
                    while (i < size5) {
                        Object obj6 = arrayList5.get(i);
                        i++;
                        s35 s35Var5 = (s35) obj6;
                        try {
                            try {
                                s35Var5.getClass();
                            } catch (Throwable unused9) {
                            }
                        } catch (Throwable unused10) {
                            s35Var5.getClass();
                        }
                    }
                    if (!vycVar.a) {
                        this.d.add(vycVar);
                    } else {
                        byte[] bArr3 = vycVar.g;
                        if (this.e != null && vycVar.b) {
                            e(bArr3);
                        }
                        b();
                    }
                }
            } else {
                ArrayList arrayList6 = (ArrayList) this.a.d.s();
                int size6 = arrayList6.size();
                while (i < size6) {
                    Object obj7 = arrayList6.get(i);
                    i++;
                    s35 s35Var6 = (s35) obj7;
                    try {
                        try {
                            s35Var6.getClass();
                        } catch (Throwable unused11) {
                            s35Var6.getClass();
                        }
                    } catch (Throwable unused12) {
                    }
                }
                if (!vycVar.a) {
                    this.d.add(vycVar);
                } else {
                    byte[] bArr4 = vycVar.g;
                    if (this.e != null && vycVar.b) {
                        bArr4 = e(bArr4);
                    }
                    c(bArr4);
                }
            }
            return true;
        }
        ArrayList arrayList7 = this.d;
        ryc rycVar2 = this.a;
        ArrayList arrayList8 = (ArrayList) rycVar2.d.s();
        int size7 = arrayList8.size();
        int i6 = 0;
        while (i6 < size7) {
            Object obj8 = arrayList8.get(i6);
            i6++;
            s35 s35Var7 = (s35) obj8;
            try {
                try {
                    s35Var7.getClass();
                } catch (Throwable unused13) {
                    s35Var7.getClass();
                }
            } catch (Throwable unused14) {
            }
        }
        arrayList7.add(vycVar);
        if (vycVar.a) {
            byte[] bArr5 = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int size8 = arrayList7.size();
                int i7 = 0;
                while (i7 < size8) {
                    Object obj9 = arrayList7.get(i7);
                    i7++;
                    byte[] bArr6 = ((vyc) obj9).g;
                    if (bArr6 != null && bArr6.length != 0) {
                        byteArrayOutputStream.write(bArr6);
                    }
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException | OutOfMemoryError e) {
                syc sycVar = new syc(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                this.a.d.d(sycVar);
                ArrayList arrayList9 = (ArrayList) rycVar2.d.s();
                int size9 = arrayList9.size();
                int i8 = 0;
                while (i8 < size9) {
                    Object obj10 = arrayList9.get(i8);
                    i8++;
                    s35 s35Var8 = (s35) obj10;
                    try {
                        try {
                            s35Var8.getClass();
                        } catch (Throwable unused15) {
                        }
                    } catch (Throwable unused16) {
                        s35Var8.getClass();
                    }
                }
                rycVar2.g(vyc.a(1009, sycVar.getMessage()));
                bArr = null;
            }
            if (bArr != null) {
                if (this.e != null && ((vyc) arrayList7.get(0)).b) {
                    bArr5 = e(bArr);
                } else {
                    bArr5 = bArr;
                }
            }
            if (bArr5 == null) {
                return false;
            }
            if (((vyc) arrayList7.get(0)).e == 1) {
                c(bArr5);
            } else {
                b();
            }
            arrayList7.clear();
        }
        return true;
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c59.g():void");
    }

    public final void h() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            interrupt();
            this.r = (short) 10000;
            i();
        }
    }

    public final void i() {
        synchronized (this.f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            vw3 vw3Var = this.n;
            if (vw3Var != null) {
                vw3Var.cancel();
                this.n = null;
            }
            this.n = new vw3(this, (byte) 3);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void j(vyc vycVar) {
        byte[] bArr;
        int i;
        this.a.getClass();
        boolean z = true;
        if ((this.e != null && ((i = vycVar.e) == 1 || i == 2)) || !vycVar.b) {
            if (!vycVar.c) {
                if (!vycVar.d) {
                    int i2 = vycVar.e;
                    if (i2 != 0 && i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                String hexString = Integer.toHexString(vycVar.e);
                                throw new syc(31, "A frame has an unknown opcode: 0x" + hexString);
                        }
                    }
                    if (!vycVar.f) {
                        if (8 <= i2 && i2 <= 15) {
                            if (!vycVar.a) {
                                throw new syc(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z = false;
                            }
                            i2 = vycVar.e;
                            if (i2 == 0) {
                                if (!z) {
                                    throw new syc(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z) {
                                throw new syc(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        if (8 > i2 || i2 > 15 || (bArr = vycVar.g) == null || 125 >= bArr.length) {
                            return;
                        }
                        int length = bArr.length;
                        throw new syc(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + length);
                    }
                    throw new syc(30, "A frame from the server is masked.");
                }
                throw new syc(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new syc(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new syc(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
