package m2;

import b8.zb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
public final class l0 extends e2.n {
    public int[] f18931i;
    public int[] f18932j;

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int i3;
        boolean z10;
        int i10;
        int i11;
        int[] iArr = this.f18932j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f9359b.d) * this.f9360c.d);
        while (position < limit) {
            for (int i12 : iArr) {
                int u10 = (g2.n0.u(this.f9359b.f9355c) * i12) + position;
                int i13 = this.f9359b.f9355c;
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
                                                    throw new IllegalStateException("Unexpected encoding: " + this.f9359b.f9355c);
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
                                i3 = u10;
                            } else {
                                i3 = u10 + 2;
                            }
                            byte b10 = byteBuffer.get(i3);
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
                            zb.h(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i14));
                            if (l10.remaining() < 3) {
                                z11 = false;
                            }
                            zb.f(z11);
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
            position += this.f9359b.d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override
    public final e2.j h(e2.j jVar) {
        boolean z10;
        boolean z11;
        int i3 = jVar.f9355c;
        int[] iArr = this.f18931i;
        if (iArr == null) {
            return e2.j.f9352e;
        }
        int i10 = jVar.f9354b;
        if (g2.n0.M(i3)) {
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
                    throw new e2.l("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", jVar);
                }
            }
            if (z10) {
                return new e2.j(jVar.f9353a, iArr.length, i3);
            }
            return e2.j.f9352e;
        }
        throw new e2.l(jVar);
    }

    @Override
    public final void i() {
        this.f18932j = this.f18931i;
    }

    @Override
    public final void k() {
        this.f18932j = null;
        this.f18931i = null;
    }
}
