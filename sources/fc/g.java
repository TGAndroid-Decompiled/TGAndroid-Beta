package fc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f7005p = Logger.getLogger(g.class.getName());
    public int d;
    public int e;
    public int f7006f;
    public int f7007g;
    public int h;
    public int f7008i;
    public String f7009j;
    public int f7010k;
    public int f7011l;
    public d f7012m;
    public m f7013n;
    public ArrayList f7014o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = e5.b.h(byteBuffer);
        int a2 = e5.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.e = i12;
        this.f7006f = (a2 >>> 6) & 1;
        this.f7007g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f7010k = e5.b.h(byteBuffer);
        }
        if (this.f7006f == 1) {
            int a10 = e5.b.a(byteBuffer.get());
            this.f7008i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f7009j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.f7007g == 1) {
            this.f7011l = e5.b.h(byteBuffer);
        }
        int i13 = this.f6994c + 4;
        int i14 = 0;
        if (this.e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f7006f == 1) {
            i11 = this.f7008i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f7007g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f7005p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f7012m = (d) a12;
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
                this.f7013n = (m) a14;
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
            this.f7014o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f7006f > 0) {
            i10 += this.f7008i + 1;
        }
        if (this.f7007g > 0) {
            i10 += 2;
        }
        a aVar = this.f7012m.f7002j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f7013n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f7014o;
                if (this.f7006f == gVar.f7006f && this.f7008i == gVar.f7008i && this.f7010k == gVar.f7010k && this.d == gVar.d && this.f7011l == gVar.f7011l && this.f7007g == gVar.f7007g && this.e == gVar.e && this.h == gVar.h) {
                    String str = this.f7009j;
                    if (str != null) {
                        if (!str.equals(gVar.f7009j)) {
                            return false;
                        }
                    } else if (gVar.f7009j != null) {
                        return false;
                    }
                    d dVar = this.f7012m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f7012m)) {
                            return false;
                        }
                    } else if (gVar.f7012m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f7014o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f7013n;
                    m mVar2 = gVar.f7013n;
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
        int i13 = ((((((((((this.d * 31) + this.e) * 31) + this.f7006f) * 31) + this.f7007g) * 31) + this.h) * 31) + this.f7008i) * 31;
        String str = this.f7009j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f7010k) * 31) + this.f7011l) * 31;
        d dVar = this.f7012m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f7013n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f7014o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f7006f + ", oCRstreamFlag=" + this.f7007g + ", streamPriority=" + this.h + ", URLLength=" + this.f7008i + ", URLString='" + this.f7009j + "', remoteODFlag=0, dependsOnEsId=" + this.f7010k + ", oCREsId=" + this.f7011l + ", decoderConfigDescriptor=" + this.f7012m + ", slConfigDescriptor=" + this.f7013n + '}';
    }
}
