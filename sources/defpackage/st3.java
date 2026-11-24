package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class st3 extends rg0 {
    public static final Logger p = Logger.getLogger(st3.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public ha3 m;
    public hq9 n;
    public ArrayList o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i;
        int i2;
        this.d = jne.f(byteBuffer);
        int a = jne.a(byteBuffer.get());
        int i3 = a >>> 7;
        this.e = i3;
        this.f = (a >>> 6) & 1;
        this.g = (a >>> 5) & 1;
        this.h = a & 31;
        if (i3 == 1) {
            this.k = jne.f(byteBuffer);
        }
        if (this.f == 1) {
            int a2 = jne.a(byteBuffer.get());
            this.i = a2;
            byte[] bArr = new byte[a2];
            byteBuffer.get(bArr);
            try {
                this.j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.g == 1) {
            this.l = jne.f(byteBuffer);
        }
        int i4 = this.c + 4;
        int i5 = 0;
        if (this.e == 1) {
            i = 2;
        } else {
            i = 0;
        }
        int i6 = i4 + i;
        if (this.f == 1) {
            i2 = this.i + 1;
        } else {
            i2 = 0;
        }
        int i7 = i6 + i2;
        if (this.g == 1) {
            i5 = 2;
        }
        int i8 = i7 + i5;
        int position = byteBuffer.position();
        int a3 = a();
        int i9 = i8 + 2;
        Logger logger = p;
        if (a3 > i9) {
            rg0 a4 = bq7.a(-1, byteBuffer);
            logger.finer(a4 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a4.a()));
            int a5 = a4.a();
            byteBuffer.position(position + a5);
            i8 += a5;
            if (a4 instanceof ha3) {
                this.m = (ha3) a4;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i8 + 2) {
            rg0 a6 = bq7.a(-1, byteBuffer);
            logger.finer(a6 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a6.a()));
            int a7 = a6.a();
            byteBuffer.position(position2 + a7);
            i8 += a7;
            if (a6 instanceof hq9) {
                this.n = (hq9) a6;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i8 > 2) {
            int position3 = byteBuffer.position();
            rg0 a8 = bq7.a(-1, byteBuffer);
            logger.finer(a8 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a8.a()));
            int a9 = a8.a();
            byteBuffer.position(position3 + a9);
            i8 += a9;
            this.o.add(a8);
        }
    }

    public final int c() {
        int i;
        if (this.e > 0) {
            i = 7;
        } else {
            i = 5;
        }
        if (this.f > 0) {
            i += this.i + 1;
        }
        if (this.g > 0) {
            i += 2;
        }
        y40 y40Var = this.m.j;
        int i2 = 0;
        if (y40Var != null) {
            if (y40Var.e == 2) {
                i2 = 4;
            } else {
                rjb.j("can't serialize that yet");
                return 0;
            }
        }
        this.n.getClass();
        return i2 + 15 + i + 3;
    }

    public final boolean equals(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (((((i4 + i) * 961) + this.k) * 31) + this.l) * 31;
        ha3 ha3Var = this.m;
        if (ha3Var != null) {
            i2 = ha3Var.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        hq9 hq9Var = this.n;
        if (hq9Var != null) {
            i3 = hq9Var.d;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            i5 = arrayList.hashCode();
        }
        return i8 + i5;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=0, dependsOnEsId=" + this.k + ", oCREsId=" + this.l + ", decoderConfigDescriptor=" + this.m + ", slConfigDescriptor=" + this.n + '}';
    }
}
