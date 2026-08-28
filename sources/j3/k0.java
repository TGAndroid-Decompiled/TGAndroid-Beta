package j3;

import java.nio.ByteBuffer;
public final class k0 extends x {
    public static final int f13287i = Float.floatToIntBits(Float.NaN);

    @Override
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = this.f13390b.f13249c;
        int i11 = f13287i;
        if (i10 != 536870912) {
            if (i10 == 805306368) {
                j10 = j(i9);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i11) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    j10.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            j10 = j((i9 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i11) {
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
    public final h f(h hVar) {
        int i9 = hVar.f13249c;
        if (i9 != 536870912 && i9 != 805306368 && i9 != 4) {
            throw new i(hVar);
        }
        if (i9 != 4) {
            return new h(hVar.f13247a, hVar.f13248b, 4);
        }
        return h.f13246e;
    }
}
