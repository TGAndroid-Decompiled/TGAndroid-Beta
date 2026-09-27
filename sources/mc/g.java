package mc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f15037p = Logger.getLogger(g.class.getName());
    public int d;
    public int e;
    public int f15038f;
    public int f15039g;
    public int h;
    public int f15040i;
    public String f15041j;
    public int f15042k;
    public int f15043l;
    public d f15044m;
    public m f15045n;
    public ArrayList f15046o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = e5.b.h(byteBuffer);
        int a2 = e5.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.e = i12;
        this.f15038f = (a2 >>> 6) & 1;
        this.f15039g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f15042k = e5.b.h(byteBuffer);
        }
        if (this.f15038f == 1) {
            int a10 = e5.b.a(byteBuffer.get());
            this.f15040i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f15041j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.f15039g == 1) {
            this.f15043l = e5.b.h(byteBuffer);
        }
        int i13 = this.f15026c + 4;
        int i14 = 0;
        if (this.e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f15038f == 1) {
            i11 = this.f15040i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f15039g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f15037p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f15044m = (d) a12;
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
                this.f15045n = (m) a14;
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
            this.f15046o.add(a16);
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
        if (this.f15038f > 0) {
            i10 += this.f15040i + 1;
        }
        if (this.f15039g > 0) {
            i10 += 2;
        }
        a aVar = this.f15044m.f15034j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f15045n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f15046o;
                if (this.f15038f == gVar.f15038f && this.f15040i == gVar.f15040i && this.f15042k == gVar.f15042k && this.d == gVar.d && this.f15043l == gVar.f15043l && this.f15039g == gVar.f15039g && this.e == gVar.e && this.h == gVar.h) {
                    String str = this.f15041j;
                    if (str != null) {
                        if (!str.equals(gVar.f15041j)) {
                            return false;
                        }
                    } else if (gVar.f15041j != null) {
                        return false;
                    }
                    d dVar = this.f15044m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f15044m)) {
                            return false;
                        }
                    } else if (gVar.f15044m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f15046o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f15045n;
                    m mVar2 = gVar.f15045n;
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
        int i13 = ((((((((((this.d * 31) + this.e) * 31) + this.f15038f) * 31) + this.f15039g) * 31) + this.h) * 31) + this.f15040i) * 31;
        String str = this.f15041j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f15042k) * 31) + this.f15043l) * 31;
        d dVar = this.f15044m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f15045n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f15046o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f15038f + ", oCRstreamFlag=" + this.f15039g + ", streamPriority=" + this.h + ", URLLength=" + this.f15040i + ", URLString='" + this.f15041j + "', remoteODFlag=0, dependsOnEsId=" + this.f15042k + ", oCREsId=" + this.f15043l + ", decoderConfigDescriptor=" + this.f15044m + ", slConfigDescriptor=" + this.f15045n + '}';
    }
}
