package defpackage;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
public final class ge5 extends g2 {
    public static final ai4 E;
    public static final ai4 F;
    public static final ai4 G;
    public static final ai4 x;
    public static final ai4 y;
    public String e;
    public String f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public long w;

    static {
        i94 i94Var = new i94(ge5.class, "HandlerBox.java");
        x = i94Var.e(i94Var.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        y = i94Var.e(i94Var.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        E = i94Var.e(i94Var.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        F = i94Var.e(i94Var.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        i94Var.e(i94Var.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        G = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
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
        this.w = jne.g(byteBuffer);
        this.e = jne.b(byteBuffer);
        this.h = jne.g(byteBuffer);
        this.n = jne.g(byteBuffer);
        this.r = jne.g(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f = str;
                if (str.endsWith("\u0000")) {
                    this.f = ts2.m(1, 0, this.f);
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
        byteBuffer.put(nt5.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.n);
        byteBuffer.putInt((int) this.r);
        String str = this.f;
        if (str != null) {
            byteBuffer.put(rze.a(str));
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
            b = rze.b(str) + 25;
        } else {
            b = rze.b(str) + 24;
        }
        return b;
    }

    public final String toString() {
        xvc b = i94.b(G, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("HandlerBox[handlerType=");
        aq1.r(i94.b(x, this, this));
        sb.append(this.e);
        sb.append(";name=");
        aq1.r(i94.b(F, this, this));
        return b10.j(sb, this.f, "]");
    }
}
