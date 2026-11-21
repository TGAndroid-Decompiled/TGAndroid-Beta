package lc;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;
public final class g extends b {
    public static final Logger f19770p = Logger.getLogger(g.class.getName());
    public int d;
    public int f19771e;
    public int f19772f;
    public int f19773g;
    public int h;
    public int f19774i;
    public String f19775j;
    public int f19776k;
    public int f19777l;
    public d f19778m;
    public m f19779n;
    public ArrayList f19780o;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i7;
        int i10;
        this.d = h5.b.h(byteBuffer);
        int a10 = h5.b.a(byteBuffer.get());
        int i11 = a10 >>> 7;
        this.f19771e = i11;
        this.f19772f = (a10 >>> 6) & 1;
        this.f19773g = (a10 >>> 5) & 1;
        this.h = a10 & 31;
        if (i11 == 1) {
            this.f19776k = h5.b.h(byteBuffer);
        }
        if (this.f19772f == 1) {
            int a11 = h5.b.a(byteBuffer.get());
            this.f19774i = a11;
            byte[] bArr = new byte[a11];
            byteBuffer.get(bArr);
            try {
                this.f19775j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        if (this.f19773g == 1) {
            this.f19777l = h5.b.h(byteBuffer);
        }
        int i12 = this.f19758c + 4;
        int i13 = 0;
        if (this.f19771e == 1) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int i14 = i12 + i7;
        if (this.f19772f == 1) {
            i10 = this.f19774i + 1;
        } else {
            i10 = 0;
        }
        int i15 = i14 + i10;
        if (this.f19773g == 1) {
            i13 = 2;
        }
        int i16 = i15 + i13;
        int position = byteBuffer.position();
        int a12 = a();
        int i17 = i16 + 2;
        Logger logger = f19770p;
        if (a12 > i17) {
            b a13 = k.a(-1, byteBuffer);
            logger.finer(a13 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a13.a()));
            int a14 = a13.a();
            byteBuffer.position(position + a14);
            i16 += a14;
            if (a13 instanceof d) {
                this.f19778m = (d) a13;
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
                this.f19779n = (m) a15;
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
            this.f19780o.add(a17);
        }
    }

    public final int c() {
        int i7;
        int i10;
        if (this.f19771e > 0) {
            i7 = 7;
        } else {
            i7 = 5;
        }
        if (this.f19772f > 0) {
            i7 += this.f19774i + 1;
        }
        if (this.f19773g > 0) {
            i7 += 2;
        }
        a aVar = this.f19778m.f19767j;
        if (aVar == null) {
            i10 = 0;
        } else if (aVar.f19736e == 2) {
            i10 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        int i11 = i10 + 15 + i7;
        this.f19779n.getClass();
        return i11 + 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f19780o;
                if (this.f19772f == gVar.f19772f && this.f19774i == gVar.f19774i && this.f19776k == gVar.f19776k && this.d == gVar.d && this.f19777l == gVar.f19777l && this.f19773g == gVar.f19773g && this.f19771e == gVar.f19771e && this.h == gVar.h) {
                    String str = this.f19775j;
                    if (str != null) {
                        if (!str.equals(gVar.f19775j)) {
                            return false;
                        }
                    } else if (gVar.f19775j != null) {
                        return false;
                    }
                    d dVar = this.f19778m;
                    if (dVar != null) {
                        if (!dVar.equals(gVar.f19778m)) {
                            return false;
                        }
                    } else if (gVar.f19778m != null) {
                        return false;
                    }
                    ArrayList arrayList2 = this.f19780o;
                    if (arrayList2 != null) {
                        if (!arrayList2.equals(arrayList)) {
                            return false;
                        }
                    } else if (arrayList != null) {
                        return false;
                    }
                    m mVar = this.f19779n;
                    m mVar2 = gVar.f19779n;
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
        int i7;
        int i10;
        int i11;
        int i12 = ((((((((((this.d * 31) + this.f19771e) * 31) + this.f19772f) * 31) + this.f19773g) * 31) + this.h) * 31) + this.f19774i) * 31;
        String str = this.f19775j;
        int i13 = 0;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (((((i12 + i7) * 961) + this.f19776k) * 31) + this.f19777l) * 31;
        d dVar = this.f19778m;
        if (dVar != null) {
            i10 = dVar.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        m mVar = this.f19779n;
        if (mVar != null) {
            i11 = mVar.d;
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        ArrayList arrayList = this.f19780o;
        if (arrayList != null) {
            i13 = arrayList.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.f19771e + ", URLFlag=" + this.f19772f + ", oCRstreamFlag=" + this.f19773g + ", streamPriority=" + this.h + ", URLLength=" + this.f19774i + ", URLString='" + this.f19775j + "', remoteODFlag=0, dependsOnEsId=" + this.f19776k + ", oCREsId=" + this.f19777l + ", decoderConfigDescriptor=" + this.f19778m + ", slConfigDescriptor=" + this.f19779n + '}';
    }
}
