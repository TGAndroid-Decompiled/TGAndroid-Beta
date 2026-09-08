package k2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
public final class t extends c2.i {
    public int[] f14698i;
    public int[] f14699j;

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int[] iArr = this.f14699j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j3 = j(((limit - position) / this.f4184b.d) * this.f4185c.d);
        while (position < limit) {
            for (int i13 : iArr) {
                int t10 = (e2.d0.t(this.f4184b.f4182c) * i13) + position;
                int i14 = this.f4184b.f4182c;
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 21) {
                                if (i14 != 22) {
                                    if (i14 != 268435456) {
                                        if (i14 != 1342177280) {
                                            if (i14 != 1610612736) {
                                                throw new IllegalStateException("Unexpected encoding: " + this.f4184b.f4182c);
                                            }
                                        }
                                    }
                                }
                                j3.putInt(byteBuffer.getInt(t10));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i10 = t10;
                            } else {
                                i10 = t10 + 2;
                            }
                            byte b10 = byteBuffer.get(i10);
                            byte b11 = byteBuffer.get(t10 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                t10 += 2;
                            }
                            int i15 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(t10) << 8) & 65280)) >> 8;
                            boolean z11 = true;
                            if ((i15 & (-16777216)) != 0 && (i15 & (-8388608)) != -8388608) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            e2.d.a("Value out of range of 24-bit integer: " + Integer.toHexString(i15), z10);
                            if (j3.remaining() < 3) {
                                z11 = false;
                            }
                            e2.d.b(z11);
                            if (j3.order() == byteOrder) {
                                i11 = (i15 & 16711680) >> 16;
                            } else {
                                i11 = i15 & 255;
                            }
                            byte b12 = (byte) i11;
                            byte b13 = (byte) ((i15 & 65280) >> 8);
                            if (j3.order() == byteOrder) {
                                i12 = i15 & 255;
                            } else {
                                i12 = (i15 & 16711680) >> 16;
                            }
                            j3.put(b12).put(b13).put((byte) i12);
                        } else {
                            j3.putFloat(byteBuffer.getFloat(t10));
                        }
                    } else {
                        j3.put(byteBuffer.get(t10));
                    }
                }
                j3.putShort(byteBuffer.getShort(t10));
            }
            position += this.f4184b.d;
        }
        byteBuffer.position(limit);
        j3.flip();
    }

    @Override
    public final c2.f f(c2.f fVar) {
        boolean z10;
        boolean z11;
        int i10 = fVar.f4182c;
        int[] iArr = this.f14698i;
        if (iArr == null) {
            return c2.f.f4179e;
        }
        int i11 = fVar.f4181b;
        if (e2.d0.K(i10)) {
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
                    throw new c2.g("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", fVar);
                }
            }
            if (z10) {
                return new c2.f(fVar.f4180a, iArr.length, i10);
            }
            return c2.f.f4179e;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        this.f14699j = this.f14698i;
    }

    @Override
    public final void i() {
        this.f14699j = null;
        this.f14698i = null;
    }
}
