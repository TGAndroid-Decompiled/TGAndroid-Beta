package g5;

import c3.h0;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import li.e3;
public final class j extends com.googlecode.mp4parser.c {
    public static final e3 E;
    public static final e3 F;
    public static final e3 f12305w;
    public static final e3 f12306x;
    public static final e3 f12307y;
    public String e;
    public String f12308f;
    public long h;
    public long f12309n;
    public long f12310r;
    public boolean f12311s;
    public long v;

    static {
        ue.a aVar = new ue.a(j.class, "HandlerBox.java");
        f12305w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f12306x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        f12307y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        E = aVar.e(aVar.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        F = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.v = f5.b.i(byteBuffer);
        this.e = f5.b.d(byteBuffer);
        this.h = f5.b.i(byteBuffer);
        this.f12309n = f5.b.i(byteBuffer);
        this.f12310r = f5.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f12308f = str;
                if (str.endsWith("\u0000")) {
                    this.f12308f = h0.l(1, 0, this.f12308f);
                    this.f12311s = true;
                    return;
                }
                this.f12311s = false;
                return;
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        this.f12311s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(f5.c.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f12309n);
        byteBuffer.putInt((int) this.f12310r);
        String str = this.f12308f;
        if (str != null) {
            byteBuffer.put(f5.b.b(str));
        }
        if (this.f12311s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l4;
        if (this.f12311s) {
            l4 = f5.b.l(this.f12308f) + 25;
        } else {
            l4 = f5.b.l(this.f12308f) + 24;
        }
        return l4;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(F, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        h0.s(ue.a.b(f12305w, this, this));
        sb2.append(this.e);
        sb2.append(";name=");
        h0.s(ue.a.b(E, this, this));
        return a1.g.s(sb2, this.f12308f, "]");
    }
}
