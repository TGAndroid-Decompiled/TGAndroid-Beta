package mc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f16179p = Logger.getLogger(g.class.getName());
    public int d;
    public int f16180e;
    public int f16181f;
    public int f16182g;
    public int h;
    public int f16183i;
    public String f16184j;
    public int f16185k;
    public int f16186l;
    public d f16187m;
    public m f16188n;
    public ArrayList f16189o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.d = e5.b.h(byteBuffer);
        int a2 = e5.b.a(byteBuffer.get());
        int i12 = a2 >>> 7;
        this.f16180e = i12;
        this.f16181f = (a2 >>> 6) & 1;
        this.f16182g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i12 == 1) {
            this.f16185k = e5.b.h(byteBuffer);
        }
        if (this.f16181f == 1) {
            int a10 = e5.b.a(byteBuffer.get());
            this.f16183i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.f16184j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e7) {
                throw new Error(e7);
            }
        }
        if (this.f16182g == 1) {
            this.f16186l = e5.b.h(byteBuffer);
        }
        int i13 = this.f16167c + 4;
        int i14 = 0;
        if (this.f16180e == 1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i15 = i13 + i10;
        if (this.f16181f == 1) {
            i11 = this.f16183i + 1;
        } else {
            i11 = 0;
        }
        int i16 = i15 + i11;
        if (this.f16182g == 1) {
            i14 = 2;
        }
        int i17 = i16 + i14;
        int position = byteBuffer.position();
        int a11 = a();
        int i18 = i17 + 2;
        Logger logger = f16179p;
        if (a11 > i18) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i17 += a13;
            if (a12 instanceof d) {
                this.f16187m = (d) a12;
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
                this.f16188n = (m) a14;
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
            this.f16189o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11;
        if (this.f16180e > 0) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        if (this.f16181f > 0) {
            i10 += this.f16183i + 1;
        }
        if (this.f16182g > 0) {
            i10 += 2;
        }
        a aVar = this.f16187m.f16176j;
        if (aVar == null) {
            i11 = 0;
        } else if (aVar.f16145e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i12 = i11 + 15 + i10;
        this.f16188n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f16189o;
                if (this.f16181f == gVar.f16181f && this.f16183i == gVar.f16183i && this.f16185k == gVar.f16185k && this.d == gVar.d && this.f16186l == gVar.f16186l && this.f16182g == gVar.f16182g && this.f16180e == gVar.f16180e && this.h == gVar.h) {
                    String str = this.f16184j;
                    if (str != null) {
                        if (!str.equals(gVar.f16184j)) {
                            return false;
                        }
                    } else if (gVar.f16184j != null) {
                        return false;
                    }
                    d dVar = this.f16187m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f16187m)) {
                            return false;
                        }
                    } else if (gVar.f16187m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f16189o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f16188n;
                    m mVar2 = gVar.f16188n;
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
        int i13 = ((((((((((this.d * 31) + this.f16180e) * 31) + this.f16181f) * 31) + this.f16182g) * 31) + this.h) * 31) + this.f16183i) * 31;
        String str = this.f16184j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((i13 + i10) * 961) + this.f16185k) * 31) + this.f16186l) * 31;
        d dVar = this.f16187m;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f16188n;
        if (mVar != null) {
            i12 = mVar.d;
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        ArrayList arrayList = this.f16189o;
        if (arrayList != null) {
            i14 = arrayList.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f16180e + ", URLFlag=" + this.f16181f + ", oCRstreamFlag=" + this.f16182g + ", streamPriority=" + this.h + ", URLLength=" + this.f16183i + ", URLString='" + this.f16184j + "', remoteODFlag=0, dependsOnEsId=" + this.f16185k + ", oCREsId=" + this.f16186l + ", decoderConfigDescriptor=" + this.f16187m + ", slConfigDescriptor=" + this.f16188n + '}';
    }
}
