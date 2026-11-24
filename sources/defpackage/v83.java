package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
public final class v83 extends rf0 {
    public static final Logger m = Logger.getLogger(v83.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public y30 j;
    public ArrayList k;
    public byte[] l;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        rf0 a;
        this.d = hle.a(byteBuffer.get());
        int a2 = hle.a(byteBuffer.get());
        this.e = a2 >>> 2;
        this.f = (a2 >> 1) & 1;
        this.g = hle.a(byteBuffer.get()) + (hle.f(byteBuffer) << 8);
        this.h = hle.g(byteBuffer);
        this.i = hle.g(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            rf0 a3 = yn7.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a3 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a3.a()));
            int a4 = a3.a();
            if (position2 < a4) {
                byte[] bArr = new byte[a4 - position2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (a3 instanceof y30) {
                this.j = (y30) a3;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            logger.finer(yn7.a(this.d, byteBuffer) + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a.a()));
        }
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.d);
        sb.append(", streamType=");
        sb.append(this.e);
        sb.append(", upStream=");
        sb.append(this.f);
        sb.append(", bufferSizeDB=");
        sb.append(this.g);
        sb.append(", maxBitRate=");
        sb.append(this.h);
        sb.append(", avgBitRate=");
        sb.append(this.i);
        sb.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb.append(this.j);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(ead.a(0, bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(arrayList).toString();
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
