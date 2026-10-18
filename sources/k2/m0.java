package k2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import v7.u6;
public final class m0 extends c2.o {
    public int[] f14754i;
    public int[] f14755j;

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int[] iArr = this.f14755j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l4 = l(((limit - position) / this.f4523b.d) * this.f4524c.d);
        while (position < limit) {
            for (int i13 : iArr) {
                int u10 = (e2.m0.u(this.f4523b.f4519c) * i13) + position;
                int i14 = this.f4523b.f4519c;
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 21) {
                                if (i14 != 22) {
                                    if (i14 != 268435456) {
                                        if (i14 != 1342177280) {
                                            if (i14 != 1610612736) {
                                                if (i14 == 1879048192) {
                                                    l4.putDouble(byteBuffer.getDouble(u10));
                                                } else {
                                                    throw new IllegalStateException("Unexpected encoding: " + this.f4523b.f4519c);
                                                }
                                            }
                                        }
                                    }
                                }
                                l4.putInt(byteBuffer.getInt(u10));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i10 = u10;
                            } else {
                                i10 = u10 + 2;
                            }
                            byte b10 = byteBuffer.get(i10);
                            byte b11 = byteBuffer.get(u10 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                u10 += 2;
                            }
                            int i15 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(u10) << 8) & 65280)) >> 8;
                            boolean z11 = true;
                            if ((i15 & (-16777216)) != 0 && (i15 & (-8388608)) != -8388608) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            u6.h(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i15));
                            if (l4.remaining() < 3) {
                                z11 = false;
                            }
                            u6.g(z11);
                            if (l4.order() == byteOrder) {
                                i11 = (i15 & 16711680) >> 16;
                            } else {
                                i11 = i15 & 255;
                            }
                            byte b12 = (byte) i11;
                            byte b13 = (byte) ((i15 & 65280) >> 8);
                            if (l4.order() == byteOrder) {
                                i12 = i15 & 255;
                            } else {
                                i12 = (i15 & 16711680) >> 16;
                            }
                            l4.put(b12).put(b13).put((byte) i12);
                        } else {
                            l4.putFloat(byteBuffer.getFloat(u10));
                        }
                    } else {
                        l4.put(byteBuffer.get(u10));
                    }
                }
                l4.putShort(byteBuffer.getShort(u10));
            }
            position += this.f4523b.d;
        }
        byteBuffer.position(limit);
        l4.flip();
    }

    @Override
    public final c2.k h(c2.k kVar) {
        boolean z10;
        boolean z11;
        int i10 = kVar.f4519c;
        int[] iArr = this.f14754i;
        if (iArr == null) {
            return c2.k.e;
        }
        int i11 = kVar.f4518b;
        if (e2.m0.M(i10)) {
            if (i11 != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 < i11) {
                    if (i13 != i12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new c2.m("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", kVar);
                }
            }
            if (z10) {
                return new c2.k(kVar.f4517a, iArr.length, i10);
            }
            return c2.k.e;
        }
        throw new c2.m(kVar);
    }

    @Override
    public final void i() {
        this.f14755j = this.f14754i;
    }

    @Override
    public final void k() {
        this.f14755j = null;
        this.f14754i = null;
    }
}
