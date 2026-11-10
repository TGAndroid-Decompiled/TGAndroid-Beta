package i5;

import a8.p0;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import y7.i6;
public final class j extends com.googlecode.mp4parser.c {
    public static final i6 D;
    public static final i6 E;
    public static final i6 F;
    public static final i6 f15296x;
    public static final i6 f15297y;
    public String f15298e;
    public String f15299f;
    public long h;
    public long f15300n;
    public long f15301r;
    public boolean f15302s;
    public long f15303w;

    static {
        ze.a aVar = new ze.a(j.class, "HandlerBox.java");
        f15296x = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f15297y = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        D = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
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
        this.f15303w = h5.b.i(byteBuffer);
        this.f15298e = h5.b.d(byteBuffer);
        this.h = h5.b.i(byteBuffer);
        this.f15300n = h5.b.i(byteBuffer);
        this.f15301r = h5.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f15299f = str;
                if (str.endsWith("\u0000")) {
                    this.f15299f = com.google.android.recaptcha.internal.a.k(this.f15299f, 1, 0);
                    this.f15302s = true;
                    return;
                }
                this.f15302s = false;
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        this.f15302s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f15303w);
        byteBuffer.put(h5.c.d(this.f15298e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f15300n);
        byteBuffer.putInt((int) this.f15301r);
        String str = this.f15299f;
        if (str != null) {
            byteBuffer.put(h5.b.b(str));
        }
        if (this.f15302s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l10;
        if (this.f15302s) {
            l10 = h5.b.l(this.f15299f) + 25;
        } else {
            l10 = h5.b.l(this.f15299f) + 24;
        }
        return l10;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(F, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15296x, this, this));
        sb2.append(this.f15298e);
        sb2.append(";name=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(E, this, this));
        return p0.s(sb2, this.f15299f, "]");
    }
}
