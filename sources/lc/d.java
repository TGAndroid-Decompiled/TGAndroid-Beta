package lc;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
public final class d extends b {
    public static final Logger f19734m = Logger.getLogger(d.class.getName());
    public int d;
    public int f19735e;
    public int f19736f;
    public int f19737g;
    public long h;
    public long f19738i;
    public a f19739j;
    public ArrayList f19740k;
    public byte[] f19741l;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        b a10;
        this.d = h5.b.a(byteBuffer.get());
        int a11 = h5.b.a(byteBuffer.get());
        this.f19735e = a11 >>> 2;
        this.f19736f = (a11 >> 1) & 1;
        this.f19737g = h5.b.a(byteBuffer.get()) + (h5.b.h(byteBuffer) << 8);
        this.h = h5.b.i(byteBuffer);
        this.f19738i = h5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = f19734m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a12 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a12 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            if (position2 < a13) {
                byte[] bArr = new byte[a13 - position2];
                this.f19741l = bArr;
                byteBuffer.get(bArr);
            }
            if (a12 instanceof a) {
                this.f19739j = (a) a12;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            logger.finer(k.a(this.d, byteBuffer) + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a10.a()));
        }
    }

    public final String toString() {
        String obj;
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.d);
        sb2.append(", streamType=");
        sb2.append(this.f19735e);
        sb2.append(", upStream=");
        sb2.append(this.f19736f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f19737g);
        sb2.append(", maxBitRate=");
        sb2.append(this.h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f19738i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.f19739j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f19741l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(h5.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.f19740k;
        if (arrayList == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(arrayList).toString();
        }
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
