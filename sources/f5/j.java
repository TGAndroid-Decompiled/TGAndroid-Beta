package f5;

import com.google.android.gms.internal.play_billing.k3;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import ji.w4;
public final class j extends com.googlecode.mp4parser.c {
    public static final w4 E;
    public static final w4 F;
    public static final w4 f8970w;
    public static final w4 f8971x;
    public static final w4 f8972y;
    public String e;
    public String f8973f;
    public long h;
    public long f8974n;
    public long f8975r;
    public boolean f8976s;
    public long v;

    static {
        te.a aVar = new te.a(j.class, "HandlerBox.java");
        f8970w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f8971x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        f8972y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
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
        this.f8974n = e5.b.i(byteBuffer);
        this.f8975r = e5.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f8973f = str;
                if (str.endsWith("\u0000")) {
                    this.f8973f = k3.j(1, 0, this.f8973f);
                    this.f8976s = true;
                    return;
                }
                this.f8976s = false;
                return;
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        this.f8976s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(e5.c.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f8974n);
        byteBuffer.putInt((int) this.f8975r);
        String str = this.f8973f;
        if (str != null) {
            byteBuffer.put(e5.b.b(str));
        }
        if (this.f8976s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l4;
        if (this.f8976s) {
            l4 = e5.b.l(this.f8973f) + 25;
        } else {
            l4 = e5.b.l(this.f8973f) + 24;
        }
        return l4;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = te.a.b(F, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        k3.p(te.a.b(f8970w, this, this));
        sb2.append(this.e);
        sb2.append(";name=");
        k3.p(te.a.b(E, this, this));
        return a1.g.s(sb2, this.f8973f, "]");
    }
}
