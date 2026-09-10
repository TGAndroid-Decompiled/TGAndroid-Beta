package f5;

import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import m.g3;
public final class j extends com.googlecode.mp4parser.c {
    public static final g3 E;
    public static final g3 F;
    public static final g3 f7798w;
    public static final g3 f7799x;
    public static final g3 f7800y;
    public String e;
    public String f7801f;
    public long h;
    public long f7802n;
    public long f7803r;
    public boolean f7804s;
    public long v;

    static {
        re.a aVar = new re.a(j.class, "HandlerBox.java");
        f7798w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f7799x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        f7800y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
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
        this.v = e5.b.i(byteBuffer);
        this.e = e5.b.d(byteBuffer);
        this.h = e5.b.i(byteBuffer);
        this.f7802n = e5.b.i(byteBuffer);
        this.f7803r = e5.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f7801f = str;
                if (str.endsWith("\u0000")) {
                    this.f7801f = e2.h(1, 0, this.f7801f);
                    this.f7804s = true;
                    return;
                }
                this.f7804s = false;
                return;
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        this.f7804s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(e5.c.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f7802n);
        byteBuffer.putInt((int) this.f7803r);
        String str = this.f7801f;
        if (str != null) {
            byteBuffer.put(e5.b.b(str));
        }
        if (this.f7804s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l4;
        if (this.f7804s) {
            l4 = e5.b.l(this.f7801f) + 25;
        } else {
            l4 = e5.b.l(this.f7801f) + 24;
        }
        return l4;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(F, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        e2.q(re.a.b(f7798w, this, this));
        sb2.append(this.e);
        sb2.append(";name=");
        e2.q(re.a.b(E, this, this));
        return a4.a.s(sb2, this.f7801f, "]");
    }
}
