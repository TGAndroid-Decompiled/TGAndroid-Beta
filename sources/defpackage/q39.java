package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
public final class q39 extends iwc {
    public boolean b;
    public gwc c;
    public final ArrayList d;
    public final f58 e;
    public final Object f;
    public Timer h;
    public lx3 n;
    public short r;
    public boolean s;

    public q39(cwc cwcVar) {
        super("ReadingThread", cwcVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = cwcVar.u;
    }

    @Override
    public final void a() {
        try {
            g();
        } catch (Throwable th) {
            dwc dwcVar = new dwc(38, "An uncaught throwable was detected in the reading thread: " + th.getMessage(), th);
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
        cwc cwcVar = this.a;
        gwc gwcVar = this.c;
        synchronized (cwcVar.g) {
            cwcVar.q = true;
            cwcVar.s = gwcVar;
            if (cwcVar.r) {
                cwcVar.d();
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.a.d.u();
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
    }

    public final void c(byte[] bArr) {
        cwc cwcVar = this.a;
        cwcVar.getClass();
        yh4 yh4Var = cwcVar.d;
        int i = 0;
        try {
            SecureRandom secureRandom = ag7.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) yh4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        o35Var.b((cwc) yh4Var.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    o35Var.getClass();
                }
            }
        } catch (Throwable th) {
            cwcVar.d.f(new dwc(37, "Failed to convert payload data into a string: " + th.getMessage(), th));
            ArrayList arrayList2 = (ArrayList) yh4Var.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o35 o35Var2 = (o35) obj2;
                try {
                    try {
                        o35Var2.getClass();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    o35Var2.getClass();
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
            lx3 lx3Var = this.n;
            if (lx3Var != null) {
                lx3Var.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] e(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (dwc e) {
            cwc cwcVar = this.a;
            cwcVar.d.f(e);
            ArrayList arrayList = (ArrayList) cwcVar.d.u();
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
            cwcVar.g(gwc.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean f(gwc gwcVar) {
        byte[] bArr;
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
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
        int i3 = gwcVar.e;
        boolean z = true;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    switch (i3) {
                        case 8:
                            az8 az8Var = this.a.b;
                            this.c = gwcVar;
                            synchronized (az8Var) {
                                int i4 = az8Var.b;
                                if (i4 != 4 && i4 != 5) {
                                    az8Var.b = 4;
                                    if (az8Var.c == 1) {
                                        az8Var.c = 2;
                                    }
                                    this.a.g(gwcVar);
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                this.a.d.g();
                            }
                            ArrayList arrayList2 = (ArrayList) this.a.d.u();
                            int size2 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj2 = arrayList2.get(i5);
                                i5++;
                                o35 o35Var2 = (o35) obj2;
                                try {
                                    try {
                                        o35Var2.getClass();
                                    } catch (Throwable unused3) {
                                        o35Var2.getClass();
                                    }
                                } catch (Throwable unused4) {
                                }
                            }
                            return false;
                        case 9:
                            cwc cwcVar = this.a;
                            ArrayList arrayList3 = (ArrayList) cwcVar.d.u();
                            int size3 = arrayList3.size();
                            while (i < size3) {
                                Object obj3 = arrayList3.get(i);
                                i++;
                                o35 o35Var3 = (o35) obj3;
                                try {
                                    try {
                                        o35Var3.getClass();
                                    } catch (Throwable unused5) {
                                        o35Var3.getClass();
                                    }
                                } catch (Throwable unused6) {
                                }
                            }
                            byte[] bArr2 = gwcVar.g;
                            ?? obj4 = new Object();
                            obj4.a = true;
                            obj4.e = 10;
                            obj4.c(bArr2);
                            cwcVar.g(obj4);
                            return true;
                        case 10:
                            ArrayList arrayList4 = (ArrayList) this.a.d.u();
                            int size4 = arrayList4.size();
                            while (i < size4) {
                                Object obj5 = arrayList4.get(i);
                                i++;
                                o35 o35Var4 = (o35) obj5;
                                try {
                                    try {
                                        o35Var4.getClass();
                                    } catch (Throwable unused7) {
                                        o35Var4.getClass();
                                    }
                                } catch (Throwable unused8) {
                                }
                            }
                            break;
                    }
                } else {
                    ArrayList arrayList5 = (ArrayList) this.a.d.u();
                    int size5 = arrayList5.size();
                    while (i < size5) {
                        Object obj6 = arrayList5.get(i);
                        i++;
                        o35 o35Var5 = (o35) obj6;
                        try {
                            try {
                                o35Var5.getClass();
                            } catch (Throwable unused9) {
                            }
                        } catch (Throwable unused10) {
                            o35Var5.getClass();
                        }
                    }
                    if (!gwcVar.a) {
                        this.d.add(gwcVar);
                    } else {
                        byte[] bArr3 = gwcVar.g;
                        if (this.e != null && gwcVar.b) {
                            e(bArr3);
                        }
                        b();
                    }
                }
            } else {
                ArrayList arrayList6 = (ArrayList) this.a.d.u();
                int size6 = arrayList6.size();
                while (i < size6) {
                    Object obj7 = arrayList6.get(i);
                    i++;
                    o35 o35Var6 = (o35) obj7;
                    try {
                        try {
                            o35Var6.getClass();
                        } catch (Throwable unused11) {
                            o35Var6.getClass();
                        }
                    } catch (Throwable unused12) {
                    }
                }
                if (!gwcVar.a) {
                    this.d.add(gwcVar);
                } else {
                    byte[] bArr4 = gwcVar.g;
                    if (this.e != null && gwcVar.b) {
                        bArr4 = e(bArr4);
                    }
                    c(bArr4);
                }
            }
            return true;
        }
        ArrayList arrayList7 = this.d;
        cwc cwcVar2 = this.a;
        ArrayList arrayList8 = (ArrayList) cwcVar2.d.u();
        int size7 = arrayList8.size();
        int i6 = 0;
        while (i6 < size7) {
            Object obj8 = arrayList8.get(i6);
            i6++;
            o35 o35Var7 = (o35) obj8;
            try {
                try {
                    o35Var7.getClass();
                } catch (Throwable unused13) {
                    o35Var7.getClass();
                }
            } catch (Throwable unused14) {
            }
        }
        arrayList7.add(gwcVar);
        if (gwcVar.a) {
            byte[] bArr5 = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int size8 = arrayList7.size();
                int i7 = 0;
                while (i7 < size8) {
                    Object obj9 = arrayList7.get(i7);
                    i7++;
                    byte[] bArr6 = ((gwc) obj9).g;
                    if (bArr6 != null && bArr6.length != 0) {
                        byteArrayOutputStream.write(bArr6);
                    }
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException | OutOfMemoryError e) {
                dwc dwcVar = new dwc(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                this.a.d.f(dwcVar);
                ArrayList arrayList9 = (ArrayList) cwcVar2.d.u();
                int size9 = arrayList9.size();
                int i8 = 0;
                while (i8 < size9) {
                    Object obj10 = arrayList9.get(i8);
                    i8++;
                    o35 o35Var8 = (o35) obj10;
                    try {
                        try {
                            o35Var8.getClass();
                        } catch (Throwable unused15) {
                        }
                    } catch (Throwable unused16) {
                        o35Var8.getClass();
                    }
                }
                cwcVar2.g(gwc.a(1009, dwcVar.getMessage()));
                bArr = null;
            }
            if (bArr != null) {
                if (this.e != null && ((gwc) arrayList7.get(0)).b) {
                    bArr5 = e(bArr);
                } else {
                    bArr5 = bArr;
                }
            }
            if (bArr5 == null) {
                return false;
            }
            if (((gwc) arrayList7.get(0)).e == 1) {
                c(bArr5);
            } else {
                b();
            }
            arrayList7.clear();
        }
        return true;
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q39.g():void");
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
            lx3 lx3Var = this.n;
            if (lx3Var != null) {
                lx3Var.cancel();
                this.n = null;
            }
            this.n = new lx3(this, (byte) 3);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void j(gwc gwcVar) {
        byte[] bArr;
        int i;
        this.a.getClass();
        boolean z = true;
        if ((this.e != null && ((i = gwcVar.e) == 1 || i == 2)) || !gwcVar.b) {
            if (!gwcVar.c) {
                if (!gwcVar.d) {
                    int i2 = gwcVar.e;
                    if (i2 != 0 && i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                String hexString = Integer.toHexString(gwcVar.e);
                                throw new dwc(31, "A frame has an unknown opcode: 0x" + hexString);
                        }
                    }
                    if (!gwcVar.f) {
                        if (8 <= i2 && i2 <= 15) {
                            if (!gwcVar.a) {
                                throw new dwc(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z = false;
                            }
                            i2 = gwcVar.e;
                            if (i2 == 0) {
                                if (!z) {
                                    throw new dwc(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z) {
                                throw new dwc(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        if (8 > i2 || i2 > 15 || (bArr = gwcVar.g) == null || 125 >= bArr.length) {
                            return;
                        }
                        int length = bArr.length;
                        throw new dwc(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + length);
                    }
                    throw new dwc(30, "A frame from the server is masked.");
                }
                throw new dwc(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new dwc(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new dwc(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
