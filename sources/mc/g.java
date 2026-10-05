package mc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f16385p = Logger.getLogger(g.class.getName());
    public int d;
    public int f16386e;
    public int f16387f;
    public int f16388g;
    public int h;
    public int f16389i;
    public String f16390j;
    public int f16391k;
    public int f16392l;
    public d f16393m;
    public m f16394n;
    public ArrayList f16395o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = e5.b.h(byteBuffer);
        int a2 = e5.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.f16386e = i12;
        this.f16387f = (a2 >>> 6) & 1;
        this.f16388g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f16391k = e5.b.h(byteBuffer);
        }
        if (this.f16387f == 1) {
            int a10 = e5.b.a(byteBuffer.get());
            this.f16389i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f16390j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e7) {
                throw new Error(e7);
            }
        }
        if (this.f16388g == 1) {
            this.f16392l = e5.b.h(byteBuffer);
        }
        int i13 = this.f16373c + 4;
        int i14 = 0;
        if (this.f16386e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f16387f == 1) {
            i11 = this.f16389i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f16388g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f16385p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f16393m = (d) a12;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i17 + 2) {
            b a14 = k.a(-1, byteBuffer);
            logger.finer(a14 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a14.a()));
            int a15 = a14.a();
            byteBuffer.position(position2 + a15);
            i17 += a15;
            if (a14 instanceof m) {
                this.f16394n = (m) a14;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i17 > 2) {
            int position3 = byteBuffer.position();
            b a16 = k.a(-1, byteBuffer);
            logger.finer(a16 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a16.a()));
            int a17 = a16.a();
            byteBuffer.position(position3 + a17);
            i17 += a17;
            this.f16395o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.f16386e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f16387f > 0) {
            i10 += this.f16389i + 1;
        }
        if (this.f16388g > 0) {
            i10 += 2;
        }
        a aVar = this.f16393m.f16382j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.f16351e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f16394n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f16395o;
                if (this.f16387f == gVar.f16387f && this.f16389i == gVar.f16389i && this.f16391k == gVar.f16391k && this.d == gVar.d && this.f16392l == gVar.f16392l && this.f16388g == gVar.f16388g && this.f16386e == gVar.f16386e && this.h == gVar.h) {
                    String str = this.f16390j;
                    if (str != null) {
                        if (!str.equals(gVar.f16390j)) {
                            return false;
                        }
                    } else if (gVar.f16390j != null) {
                        return false;
                    }
                    d dVar = this.f16393m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f16393m)) {
                            return false;
                        }
                    } else if (gVar.f16393m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f16395o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f16394n;
                    m mVar2 = gVar.f16394n;
                    if (mVar != null) {
                        if (mVar.equals(mVar2)) {
                            return true;
                        }
                        return false;
                    } else if (mVar2 == null) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((((((((((this.d * 31) + this.f16386e) * 31) + this.f16387f) * 31) + this.f16388g) * 31) + this.h) * 31) + this.f16389i) * 31;
        String str = this.f16390j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f16391k) * 31) + this.f16392l) * 31;
        d dVar = this.f16393m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f16394n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f16395o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f16386e + ", URLFlag=" + this.f16387f + ", oCRstreamFlag=" + this.f16388g + ", streamPriority=" + this.h + ", URLLength=" + this.f16389i + ", URLString='" + this.f16390j + "', remoteODFlag=0, dependsOnEsId=" + this.f16391k + ", oCREsId=" + this.f16392l + ", decoderConfigDescriptor=" + this.f16393m + ", slConfigDescriptor=" + this.f16394n + '}';
    }
}
