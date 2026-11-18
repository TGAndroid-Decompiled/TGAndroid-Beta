package n2;

import a8.la;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
public final class k0 extends f2.o {
    public int[] f21168i;
    public int[] f21169j;

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        int[] iArr = this.f21169j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f11058b.d) * this.f11059c.d);
        while (position < limit) {
            for (int i12 : iArr) {
                int u10 = (h2.l0.u(this.f11058b.f11054c) * i12) + position;
                int i13 = this.f11058b.f11054c;
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 21) {
                                if (i13 != 22) {
                                    if (i13 != 268435456) {
                                        if (i13 != 1342177280) {
                                            if (i13 != 1610612736) {
                                                if (i13 == 1879048192) {
                                                    l10.putDouble(byteBuffer.getDouble(u10));
                                                } else {
                                                    throw new IllegalStateException("Unexpected encoding: " + this.f11058b.f11054c);
                                                }
                                            }
                                        }
                                    }
                                }
                                l10.putInt(byteBuffer.getInt(u10));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i7 = u10;
                            } else {
                                i7 = u10 + 2;
                            }
                            byte b10 = byteBuffer.get(i7);
                            byte b11 = byteBuffer.get(u10 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                u10 += 2;
                            }
                            int i14 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(u10) << 8) & 65280)) >> 8;
                            boolean z11 = true;
                            if ((i14 & (-16777216)) != 0 && (i14 & (-8388608)) != -8388608) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            la.h(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i14));
                            if (l10.remaining() < 3) {
                                z11 = false;
                            }
                            la.f(z11);
                            if (l10.order() == byteOrder) {
                                i10 = (i14 & 16711680) >> 16;
                            } else {
                                i10 = i14 & 255;
                            }
                            byte b12 = (byte) i10;
                            byte b13 = (byte) ((i14 & 65280) >> 8);
                            if (l10.order() == byteOrder) {
                                i11 = i14 & 255;
                            } else {
                                i11 = (i14 & 16711680) >> 16;
                            }
                            l10.put(b12).put(b13).put((byte) i11);
                        } else {
                            l10.putFloat(byteBuffer.getFloat(u10));
                        }
                    } else {
                        l10.put(byteBuffer.get(u10));
                    }
                }
                l10.putShort(byteBuffer.getShort(u10));
            }
            position += this.f11058b.d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override
    public final f2.k h(f2.k kVar) {
        boolean z10;
        boolean z11;
        int i7 = kVar.f11054c;
        int[] iArr = this.f21168i;
        if (iArr == null) {
            return f2.k.f11051e;
        }
        int i10 = kVar.f11053b;
        if (h2.l0.M(i7)) {
            if (i10 != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new f2.m("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", kVar);
                }
            }
            if (z10) {
                return new f2.k(kVar.f11052a, iArr.length, i7);
            }
            return f2.k.f11051e;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        this.f21169j = this.f21168i;
    }

    @Override
    public final void k() {
        this.f21169j = null;
        this.f21168i = null;
    }
}
