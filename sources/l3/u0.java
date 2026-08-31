package l3;

import java.nio.ByteBuffer;
public final class u0 extends a0 {
    public static final int f11636i = Float.floatToIntBits(Float.NaN);

    @Override
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f11487b.f11562c;
        int i12 = f11636i;
        if (i11 != 536870912) {
            if (i11 == 805306368) {
                j10 = j(i10);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i12) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    j10.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            j10 = j((i10 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i12) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                j10.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j10.flip();
    }

    @Override
    public final l f(l lVar) {
        int i10 = lVar.f11562c;
        if (i10 != 536870912 && i10 != 805306368 && i10 != 4) {
            throw new m(lVar);
        }
        if (i10 != 4) {
            return new l(lVar.f11560a, lVar.f11561b, 4);
        }
        return l.f11559e;
    }
}
