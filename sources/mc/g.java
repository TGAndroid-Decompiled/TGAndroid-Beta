package mc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f16375p = Logger.getLogger(g.class.getName());
    public int d;
    public int f16376e;
    public int f16377f;
    public int f16378g;
    public int h;
    public int f16379i;
    public String f16380j;
    public int f16381k;
    public int f16382l;
    public d f16383m;
    public m f16384n;
    public ArrayList f16385o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = e5.b.h(byteBuffer);
        int a2 = e5.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.f16376e = i12;
        this.f16377f = (a2 >>> 6) & 1;
        this.f16378g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f16381k = e5.b.h(byteBuffer);
        }
        if (this.f16377f == 1) {
            int a10 = e5.b.a(byteBuffer.get());
            this.f16379i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f16380j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e7) {
                throw new Error(e7);
            }
        }
        if (this.f16378g == 1) {
            this.f16382l = e5.b.h(byteBuffer);
        }
        int i13 = this.f16363c + 4;
        int i14 = 0;
        if (this.f16376e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f16377f == 1) {
            i11 = this.f16379i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f16378g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f16375p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f16383m = (d) a12;
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
                this.f16384n = (m) a14;
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
            this.f16385o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.f16376e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f16377f > 0) {
            i10 += this.f16379i + 1;
        }
        if (this.f16378g > 0) {
            i10 += 2;
        }
        a aVar = this.f16383m.f16372j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.f16341e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f16384n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f16385o;
                if (this.f16377f == gVar.f16377f && this.f16379i == gVar.f16379i && this.f16381k == gVar.f16381k && this.d == gVar.d && this.f16382l == gVar.f16382l && this.f16378g == gVar.f16378g && this.f16376e == gVar.f16376e && this.h == gVar.h) {
                    String str = this.f16380j;
                    if (str != null) {
                        if (!str.equals(gVar.f16380j)) {
                            return false;
                        }
                    } else if (gVar.f16380j != null) {
                        return false;
                    }
                    d dVar = this.f16383m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f16383m)) {
                            return false;
                        }
                    } else if (gVar.f16383m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f16385o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f16384n;
                    m mVar2 = gVar.f16384n;
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
        int i13 = ((((((((((this.d * 31) + this.f16376e) * 31) + this.f16377f) * 31) + this.f16378g) * 31) + this.h) * 31) + this.f16379i) * 31;
        String str = this.f16380j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f16381k) * 31) + this.f16382l) * 31;
        d dVar = this.f16383m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f16384n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f16385o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f16376e + ", URLFlag=" + this.f16377f + ", oCRstreamFlag=" + this.f16378g + ", streamPriority=" + this.h + ", URLLength=" + this.f16379i + ", URLString='" + this.f16380j + "', remoteODFlag=0, dependsOnEsId=" + this.f16381k + ", oCREsId=" + this.f16382l + ", decoderConfigDescriptor=" + this.f16383m + ", slConfigDescriptor=" + this.f16384n + '}';
    }
}
