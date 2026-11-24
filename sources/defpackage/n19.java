package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
public final class n19 extends huc {
    public boolean b;
    public fuc c;
    public final ArrayList d;
    public final d38 e;
    public final Object f;
    public Timer h;
    public aw3 n;
    public short r;
    public boolean s;

    public n19(buc bucVar) {
        super("ReadingThread", bucVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = bucVar.u;
    }

    @Override
    public final void a() {
        try {
            g();
        } catch (Throwable th) {
            cuc cucVar = new cuc(38, "An uncaught throwable was detected in the reading thread: " + th.getMessage(), th);
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
        buc bucVar = this.a;
        fuc fucVar = this.c;
        synchronized (bucVar.g) {
            bucVar.q = true;
            bucVar.s = fucVar;
            if (bucVar.r) {
                bucVar.d();
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
    }

    public final void c(byte[] bArr) {
        buc bucVar = this.a;
        bucVar.getClass();
        xf4 xf4Var = bucVar.d;
        int i = 0;
        try {
            SecureRandom secureRandom = yd7.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.b((buc) xf4Var.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    o15Var.getClass();
                }
            }
        } catch (Throwable th) {
            bucVar.d.f(new cuc(37, "Failed to convert payload data into a string: " + th.getMessage(), th));
            ArrayList arrayList2 = (ArrayList) xf4Var.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o15 o15Var2 = (o15) obj2;
                try {
                    try {
                        o15Var2.getClass();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    o15Var2.getClass();
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
            aw3 aw3Var = this.n;
            if (aw3Var != null) {
                aw3Var.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] e(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (cuc e) {
            buc bucVar = this.a;
            bucVar.d.f(e);
            ArrayList arrayList = (ArrayList) bucVar.d.u();
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
            bucVar.g(fuc.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean f(fuc fucVar) {
        byte[] bArr;
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
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
        int i3 = fucVar.e;
        boolean z = true;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    switch (i3) {
                        case 8:
                            zw8 zw8Var = this.a.b;
                            this.c = fucVar;
                            synchronized (zw8Var) {
                                int i4 = zw8Var.b;
                                if (i4 != 4 && i4 != 5) {
                                    zw8Var.b = 4;
                                    if (zw8Var.c == 1) {
                                        zw8Var.c = 2;
                                    }
                                    this.a.g(fucVar);
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
                                o15 o15Var2 = (o15) obj2;
                                try {
                                    try {
                                        o15Var2.getClass();
                                    } catch (Throwable unused3) {
                                        o15Var2.getClass();
                                    }
                                } catch (Throwable unused4) {
                                }
                            }
                            return false;
                        case 9:
                            buc bucVar = this.a;
                            ArrayList arrayList3 = (ArrayList) bucVar.d.u();
                            int size3 = arrayList3.size();
                            while (i < size3) {
                                Object obj3 = arrayList3.get(i);
                                i++;
                                o15 o15Var3 = (o15) obj3;
                                try {
                                    try {
                                        o15Var3.getClass();
                                    } catch (Throwable unused5) {
                                        o15Var3.getClass();
                                    }
                                } catch (Throwable unused6) {
                                }
                            }
                            byte[] bArr2 = fucVar.g;
                            ?? obj4 = new Object();
                            obj4.a = true;
                            obj4.e = 10;
                            obj4.c(bArr2);
                            bucVar.g(obj4);
                            return true;
                        case 10:
                            ArrayList arrayList4 = (ArrayList) this.a.d.u();
                            int size4 = arrayList4.size();
                            while (i < size4) {
                                Object obj5 = arrayList4.get(i);
                                i++;
                                o15 o15Var4 = (o15) obj5;
                                try {
                                    try {
                                        o15Var4.getClass();
                                    } catch (Throwable unused7) {
                                        o15Var4.getClass();
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
                        o15 o15Var5 = (o15) obj6;
                        try {
                            try {
                                o15Var5.getClass();
                            } catch (Throwable unused9) {
                            }
                        } catch (Throwable unused10) {
                            o15Var5.getClass();
                        }
                    }
                    if (!fucVar.a) {
                        this.d.add(fucVar);
                    } else {
                        byte[] bArr3 = fucVar.g;
                        if (this.e != null && fucVar.b) {
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
                    o15 o15Var6 = (o15) obj7;
                    try {
                        try {
                            o15Var6.getClass();
                        } catch (Throwable unused11) {
                            o15Var6.getClass();
                        }
                    } catch (Throwable unused12) {
                    }
                }
                if (!fucVar.a) {
                    this.d.add(fucVar);
                } else {
                    byte[] bArr4 = fucVar.g;
                    if (this.e != null && fucVar.b) {
                        bArr4 = e(bArr4);
                    }
                    c(bArr4);
                }
            }
            return true;
        }
        ArrayList arrayList7 = this.d;
        buc bucVar2 = this.a;
        ArrayList arrayList8 = (ArrayList) bucVar2.d.u();
        int size7 = arrayList8.size();
        int i6 = 0;
        while (i6 < size7) {
            Object obj8 = arrayList8.get(i6);
            i6++;
            o15 o15Var7 = (o15) obj8;
            try {
                try {
                    o15Var7.getClass();
                } catch (Throwable unused13) {
                    o15Var7.getClass();
                }
            } catch (Throwable unused14) {
            }
        }
        arrayList7.add(fucVar);
        if (fucVar.a) {
            byte[] bArr5 = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int size8 = arrayList7.size();
                int i7 = 0;
                while (i7 < size8) {
                    Object obj9 = arrayList7.get(i7);
                    i7++;
                    byte[] bArr6 = ((fuc) obj9).g;
                    if (bArr6 != null && bArr6.length != 0) {
                        byteArrayOutputStream.write(bArr6);
                    }
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException | OutOfMemoryError e) {
                cuc cucVar = new cuc(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                this.a.d.f(cucVar);
                ArrayList arrayList9 = (ArrayList) bucVar2.d.u();
                int size9 = arrayList9.size();
                int i8 = 0;
                while (i8 < size9) {
                    Object obj10 = arrayList9.get(i8);
                    i8++;
                    o15 o15Var8 = (o15) obj10;
                    try {
                        try {
                            o15Var8.getClass();
                        } catch (Throwable unused15) {
                        }
                    } catch (Throwable unused16) {
                        o15Var8.getClass();
                    }
                }
                bucVar2.g(fuc.a(1009, cucVar.getMessage()));
                bArr = null;
            }
            if (bArr != null) {
                if (this.e != null && ((fuc) arrayList7.get(0)).b) {
                    bArr5 = e(bArr);
                } else {
                    bArr5 = bArr;
                }
            }
            if (bArr5 == null) {
                return false;
            }
            if (((fuc) arrayList7.get(0)).e == 1) {
                c(bArr5);
            } else {
                b();
            }
            arrayList7.clear();
        }
        return true;
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n19.g():void");
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
            aw3 aw3Var = this.n;
            if (aw3Var != null) {
                aw3Var.cancel();
                this.n = null;
            }
            this.n = new aw3(this, (byte) 3);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void j(fuc fucVar) {
        byte[] bArr;
        int i;
        this.a.getClass();
        boolean z = true;
        if ((this.e != null && ((i = fucVar.e) == 1 || i == 2)) || !fucVar.b) {
            if (!fucVar.c) {
                if (!fucVar.d) {
                    int i2 = fucVar.e;
                    if (i2 != 0 && i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                String hexString = Integer.toHexString(fucVar.e);
                                throw new cuc(31, "A frame has an unknown opcode: 0x" + hexString);
                        }
                    }
                    if (!fucVar.f) {
                        if (8 <= i2 && i2 <= 15) {
                            if (!fucVar.a) {
                                throw new cuc(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z = false;
                            }
                            i2 = fucVar.e;
                            if (i2 == 0) {
                                if (!z) {
                                    throw new cuc(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z) {
                                throw new cuc(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        if (8 > i2 || i2 > 15 || (bArr = fucVar.g) == null || 125 >= bArr.length) {
                            return;
                        }
                        int length = bArr.length;
                        throw new cuc(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + length);
                    }
                    throw new cuc(30, "A frame from the server is masked.");
                }
                throw new cuc(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new cuc(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new cuc(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
