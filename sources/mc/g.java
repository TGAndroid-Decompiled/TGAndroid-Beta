package mc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f13627p = Logger.getLogger(g.class.getName());
    public int d;
    public int e;
    public int f13628f;
    public int f13629g;
    public int h;
    public int f13630i;
    public String f13631j;
    public int f13632k;
    public int f13633l;
    public d f13634m;
    public m f13635n;
    public ArrayList f13636o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = e5.b.h(byteBuffer);
        int a2 = e5.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.e = i12;
        this.f13628f = (a2 >>> 6) & 1;
        this.f13629g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f13632k = e5.b.h(byteBuffer);
        }
        if (this.f13628f == 1) {
            int a10 = e5.b.a(byteBuffer.get());
            this.f13630i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f13631j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.f13629g == 1) {
            this.f13633l = e5.b.h(byteBuffer);
        }
        int i13 = this.f13616c + 4;
        int i14 = 0;
        if (this.e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f13628f == 1) {
            i11 = this.f13630i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f13629g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f13627p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f13634m = (d) a12;
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
                this.f13635n = (m) a14;
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
            this.f13636o.add(a16);
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
        if (this.f13628f > 0) {
            i10 += this.f13630i + 1;
        }
        if (this.f13629g > 0) {
            i10 += 2;
        }
        a aVar = this.f13634m.f13624j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f13635n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f13636o;
                if (this.f13628f == gVar.f13628f && this.f13630i == gVar.f13630i && this.f13632k == gVar.f13632k && this.d == gVar.d && this.f13633l == gVar.f13633l && this.f13629g == gVar.f13629g && this.e == gVar.e && this.h == gVar.h) {
                    String str = this.f13631j;
                    if (str != null) {
                        if (!str.equals(gVar.f13631j)) {
                            return false;
                        }
                    } else if (gVar.f13631j != null) {
                        return false;
                    }
                    d dVar = this.f13634m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f13634m)) {
                            return false;
                        }
                    } else if (gVar.f13634m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f13636o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f13635n;
                    m mVar2 = gVar.f13635n;
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
        int i13 = ((((((((((this.d * 31) + this.e) * 31) + this.f13628f) * 31) + this.f13629g) * 31) + this.h) * 31) + this.f13630i) * 31;
        String str = this.f13631j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f13632k) * 31) + this.f13633l) * 31;
        d dVar = this.f13634m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f13635n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f13636o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f13628f + ", oCRstreamFlag=" + this.f13629g + ", streamPriority=" + this.h + ", URLLength=" + this.f13630i + ", URLString='" + this.f13631j + "', remoteODFlag=0, dependsOnEsId=" + this.f13632k + ", oCREsId=" + this.f13633l + ", decoderConfigDescriptor=" + this.f13634m + ", slConfigDescriptor=" + this.f13635n + '}';
    }
}
