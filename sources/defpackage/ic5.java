package defpackage;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
public final class ic5 extends g2 {
    public static final z24 E;
    public static final z24 F;
    public static final z24 G;
    public static final z24 x;
    public static final z24 y;
    public String e;
    public String f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public long w;

    static {
        z74 z74Var = new z74(ic5.class, "HandlerBox.java");
        x = z74Var.e(z74Var.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        y = z74Var.e(z74Var.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        E = z74Var.e(z74Var.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        F = z74Var.e(z74Var.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        z74Var.e(z74Var.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        G = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
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
        this.w = hle.g(byteBuffer);
        this.e = hle.b(byteBuffer);
        this.h = hle.g(byteBuffer);
        this.n = hle.g(byteBuffer);
        this.r = hle.g(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f = str;
                if (str.endsWith("\u0000")) {
                    this.f = ir2.n(1, 0, this.f);
                    this.s = true;
                    return;
                }
                this.s = false;
                return;
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        this.s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.w);
        byteBuffer.put(or5.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.n);
        byteBuffer.putInt((int) this.r);
        String str = this.f;
        if (str != null) {
            byteBuffer.put(pxe.a(str));
        }
        if (this.s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int b;
        boolean z = this.s;
        String str = this.f;
        if (z) {
            b = pxe.b(str) + 25;
        } else {
            b = pxe.b(str) + 24;
        }
        return b;
    }

    public final String toString() {
        c5a b = z74.b(G, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("HandlerBox[handlerType=");
        oo1.r(z74.b(x, this, this));
        sb.append(this.e);
        sb.append(";name=");
        oo1.r(z74.b(F, this, this));
        return b00.j(sb, this.f, "]");
    }
}
