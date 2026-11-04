package ic;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f14751p = Logger.getLogger(g.class.getName());
    public int d;
    public int f14752e;
    public int f14753f;
    public int f14754g;
    public int h;
    public int f14755i;
    public String f14756j;
    public int f14757k;
    public int f14758l;
    public d f14759m;
    public m f14760n;
    public ArrayList f14761o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i3;
        int i10;
        this.d = g5.b.h(byteBuffer);
        int a10 = g5.b.a(byteBuffer.get());
        int i11 = a10 >>> 7;
        this.f14752e = i11;
        this.f14753f = (a10 >>> 6) & 1;
        this.f14754g = (a10 >>> 5) & 1;
        this.h = a10 & 31;
        if (i11 == 1) {
            this.f14757k = g5.b.h(byteBuffer);
        }
        if (this.f14753f == 1) {
            int a11 = g5.b.a(byteBuffer.get());
            this.f14755i = a11;
            byte[] bArr = new byte[a11];
            byteBuffer.get(bArr);
            try {
                this.f14756j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        if (this.f14754g == 1) {
            this.f14758l = g5.b.h(byteBuffer);
        }
        int i12 = this.f14739c + 4;
        int i13 = 0;
        if (this.f14752e == 1) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int i14 = i12 + i3;
        if (this.f14753f == 1) {
            i10 = this.f14755i + 1;
        } else {
            i10 = 0;
        }
        int i15 = i14 + i10;
        if (this.f14754g == 1) {
            i13 = 2;
        }
        int i16 = i15 + i13;
        int position = byteBuffer.position();
        int a12 = a();
        int i17 = i16 + 2;
        Logger logger = f14751p;
        if (a12 > i17) {
            b a13 = k.a(-1, byteBuffer);
            logger.finer(a13 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a13.a()));
            int a14 = a13.a();
            byteBuffer.position(position + a14);
            i16 += a14;
            if (a13 instanceof d) {
                this.f14759m = (d) a13;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i16 + 2) {
            b a15 = k.a(-1, byteBuffer);
            logger.finer(a15 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a15.a()));
            int a16 = a15.a();
            byteBuffer.position(position2 + a16);
            i16 += a16;
            if (a15 instanceof m) {
                this.f14760n = (m) a15;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i16 > 2) {
            int position3 = byteBuffer.position();
            b a17 = k.a(-1, byteBuffer);
            logger.finer(a17 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a17.a()));
            int a18 = a17.a();
            byteBuffer.position(position3 + a18);
            i16 += a18;
            this.f14761o.add(a17);
        }
    }

    public final int c() {
        int i3;
        int i10;
        if (this.f14752e > 0) {
            i3 = 7;
        } else {
            i3 = 5;
        }
        if (this.f14753f > 0) {
            i3 += this.f14755i + 1;
        }
        if (this.f14754g > 0) {
            i3 += 2;
        }
        a aVar = this.f14759m.f14748j;
        if (aVar == null) {
            i10 = 0;
        } else if (aVar.f14717e == 2) {
            i10 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i11 = i10 + 15 + i3;
        this.f14760n.getClass();
        return i11 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f14761o;
                if (this.f14753f == gVar.f14753f && this.f14755i == gVar.f14755i && this.f14757k == gVar.f14757k && this.d == gVar.d && this.f14758l == gVar.f14758l && this.f14754g == gVar.f14754g && this.f14752e == gVar.f14752e && this.h == gVar.h) {
                    String str = this.f14756j;
                    if (str != null) {
                        if (!str.equals(gVar.f14756j)) {
                            return false;
                        }
                    } else if (gVar.f14756j != null) {
                        return false;
                    }
                    d dVar = this.f14759m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f14759m)) {
                            return false;
                        }
                    } else if (gVar.f14759m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f14761o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f14760n;
                    m mVar2 = gVar.f14760n;
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
        int i3;
        int i10;
        int i11;
        int i12 = ((((((((((this.d * 31) + this.f14752e) * 31) + this.f14753f) * 31) + this.f14754g) * 31) + this.h) * 31) + this.f14755i) * 31;
        String str = this.f14756j;
        int i13 = 0;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (((((i12 + i3) * 961) + this.f14757k) * 31) + this.f14758l) * 31;
        d dVar = this.f14759m;
        if (dVar != null) {
            i10 = dVar.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        m mVar = this.f14760n;
        if (mVar != null) {
            i11 = mVar.d;
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        ArrayList arrayList = this.f14761o;
        if (arrayList != null) {
            i13 = arrayList.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f14752e + ", URLFlag=" + this.f14753f + ", oCRstreamFlag=" + this.f14754g + ", streamPriority=" + this.h + ", URLLength=" + this.f14755i + ", URLString='" + this.f14756j + "', remoteODFlag=0, dependsOnEsId=" + this.f14757k + ", oCREsId=" + this.f14758l + ", decoderConfigDescriptor=" + this.f14759m + ", slConfigDescriptor=" + this.f14760n + '}';
    }
}
