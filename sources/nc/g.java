package nc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f17430p = Logger.getLogger(g.class.getName());
    public int d;
    public int e;
    public int f17431f;
    public int f17432g;
    public int h;
    public int f17433i;
    public String f17434j;
    public int f17435k;
    public int f17436l;
    public d f17437m;
    public m f17438n;
    public ArrayList f17439o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = e5.b.h(byteBuffer);
        int a2 = e5.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.e = i12;
        this.f17431f = (a2 >>> 6) & 1;
        this.f17432g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f17435k = e5.b.h(byteBuffer);
        }
        if (this.f17431f == 1) {
            int a10 = e5.b.a(byteBuffer.get());
            this.f17433i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f17434j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.f17432g == 1) {
            this.f17436l = e5.b.h(byteBuffer);
        }
        int i13 = this.f17419c + 4;
        int i14 = 0;
        if (this.e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f17431f == 1) {
            i11 = this.f17433i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f17432g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f17430p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f17437m = (d) a12;
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
                this.f17438n = (m) a14;
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
            this.f17439o.add(a16);
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
        if (this.f17431f > 0) {
            i10 += this.f17433i + 1;
        }
        if (this.f17432g > 0) {
            i10 += 2;
        }
        a aVar = this.f17437m.f17427j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f17438n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f17439o;
                if (this.f17431f == gVar.f17431f && this.f17433i == gVar.f17433i && this.f17435k == gVar.f17435k && this.d == gVar.d && this.f17436l == gVar.f17436l && this.f17432g == gVar.f17432g && this.e == gVar.e && this.h == gVar.h) {
                    String str = this.f17434j;
                    if (str != null) {
                        if (!str.equals(gVar.f17434j)) {
                            return false;
                        }
                    } else if (gVar.f17434j != null) {
                        return false;
                    }
                    d dVar = this.f17437m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f17437m)) {
                            return false;
                        }
                    } else if (gVar.f17437m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f17439o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f17438n;
                    m mVar2 = gVar.f17438n;
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
        int i13 = ((((((((((this.d * 31) + this.e) * 31) + this.f17431f) * 31) + this.f17432g) * 31) + this.h) * 31) + this.f17433i) * 31;
        String str = this.f17434j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f17435k) * 31) + this.f17436l) * 31;
        d dVar = this.f17437m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f17438n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f17439o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f17431f + ", oCRstreamFlag=" + this.f17432g + ", streamPriority=" + this.h + ", URLLength=" + this.f17433i + ", URLString='" + this.f17434j + "', remoteODFlag=0, dependsOnEsId=" + this.f17435k + ", oCREsId=" + this.f17436l + ", decoderConfigDescriptor=" + this.f17437m + ", slConfigDescriptor=" + this.f17438n + '}';
    }
}
