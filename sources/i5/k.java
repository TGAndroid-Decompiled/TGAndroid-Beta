package i5;

import a8.p0;
import ab.c0;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.telegram.ui.Components.ff;
public final class k extends com.googlecode.mp4parser.c {
    public static final ff E;
    public static final ff F;
    public static final ff G;
    public static final ff f15752x;
    public static final ff f15753y;
    public String f15754e;
    public String f15755f;
    public long h;
    public long f15756n;
    public long f15757r;
    public boolean f15758s;
    public long f15759w;

    static {
        ze.a aVar = new ze.a(k.class, "HandlerBox.java");
        f15752x = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        f15753y = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
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
        this.f15759w = h5.b.i(byteBuffer);
        this.f15754e = h5.b.d(byteBuffer);
        this.h = h5.b.i(byteBuffer);
        this.f15756n = h5.b.i(byteBuffer);
        this.f15757r = h5.b.i(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            try {
                String str = new String(bArr, "UTF-8");
                this.f15755f = str;
                if (str.endsWith("\u0000")) {
                    this.f15755f = e2.k(this.f15755f, 1, 0);
                    this.f15758s = true;
                    return;
                }
                this.f15758s = false;
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        this.f15758s = false;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f15759w);
        byteBuffer.put(h5.c.d(this.f15754e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.f15756n);
        byteBuffer.putInt((int) this.f15757r);
        String str = this.f15755f;
        if (str != null) {
            byteBuffer.put(h5.b.b(str));
        }
        if (this.f15758s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override
    public final long getContentSize() {
        int l10;
        if (this.f15758s) {
            l10 = h5.b.l(this.f15755f) + 25;
        } else {
            l10 = h5.b.l(this.f15755f) + 24;
        }
        return l10;
    }

    public final String toString() {
        c0 b10 = ze.a.b(G, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        c.u(ze.a.b(f15752x, this, this));
        sb2.append(this.f15754e);
        sb2.append(";name=");
        c.u(ze.a.b(F, this, this));
        return p0.s(sb2, this.f15755f, "]");
    }
}
