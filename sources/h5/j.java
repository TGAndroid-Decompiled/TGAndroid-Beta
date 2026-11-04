package h5;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.telegram.ui.Components.i9;
public final class j extends com.googlecode.mp4parser.c {
    public static final i9 E;
    public static final i9 F;
    public static final i9 G;
    public static final i9 f14247x;
    public static final i9 f14248y;
    public String f14249e;
    public String f14250f;
    public long h;
    public long f14251n;
    public long f14252r;
    public boolean f14253s;
    public long f14254w;

    static {
        we.a aVar = new we.a(j.class, "HandlerBox.java");
        f14247x = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f14248y = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        E = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        F = aVar.e(aVar.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        G = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
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
        this.f14254w = g5.b.i(byteBuffer);
        this.f14249e = g5.b.d(byteBuffer);
        this.h = g5.b.i(byteBuffer);
        this.f14251n = g5.b.i(byteBuffer);
        this.f14252r = g5.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f14250f = str;
                if (str.endsWith("\u0000")) {
                    this.f14250f = com.google.android.recaptcha.internal.a.j(this.f14250f, 1, 0);
                    this.f14253s = true;
                    return;
                }
                this.f14253s = false;
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        this.f14253s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f14254w);
        byteBuffer.put(g5.c.d(this.f14249e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f14251n);
        byteBuffer.putInt((int) this.f14252r);
        String str = this.f14250f;
        if (str != null) {
            byteBuffer.put(g5.b.b(str));
        }
        if (this.f14253s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l10;
        if (this.f14253s) {
            l10 = g5.b.l(this.f14250f) + 25;
        } else {
            l10 = g5.b.l(this.f14250f) + 24;
        }
        return l10;
    }

    public final String toString() {
        ui.f b10 = we.a.b(G, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14247x, this, this));
        sb2.append(this.f14249e);
        sb2.append(";name=");
        com.google.android.recaptcha.internal.a.t(we.a.b(F, this, this));
        return a1.g.s(sb2, this.f14250f, "]");
    }
}
