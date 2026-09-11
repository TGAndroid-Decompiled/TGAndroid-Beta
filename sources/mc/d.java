package mc;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
public final class d extends b {
    public static final Logger f16171m = Logger.getLogger(d.class.getName());
    public int d;
    public int f16172e;
    public int f16173f;
    public int f16174g;
    public long h;
    public long f16175i;
    public a f16176j;
    public ArrayList f16177k;
    public byte[] f16178l;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        b a2;
        this.d = e5.b.a(byteBuffer.get());
        int a10 = e5.b.a(byteBuffer.get());
        this.f16172e = a10 >>> 2;
        this.f16173f = (a10 >> 1) & 1;
        this.f16174g = e5.b.a(byteBuffer.get()) + (e5.b.h(byteBuffer) << 8);
        this.h = e5.b.i(byteBuffer);
        this.f16175i = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = f16171m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a11 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a11 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a11.a()));
            int a12 = a11.a();
            if (position2 < a12) {
                byte[] bArr = new byte[a12 - position2];
                this.f16178l = bArr;
                byteBuffer.get(bArr);
            }
            if (a11 instanceof a) {
                this.f16176j = (a) a11;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            logger.finer(k.a(this.d, byteBuffer) + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a2.a()));
        }
    }

    public final String toString() {
        String obj;
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.d);
        sb2.append(", streamType=");
        sb2.append(this.f16172e);
        sb2.append(", upStream=");
        sb2.append(this.f16173f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f16174g);
        sb2.append(", maxBitRate=");
        sb2.append(this.h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f16175i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.f16176j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f16178l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(e5.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.f16177k;
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
