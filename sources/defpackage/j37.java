package defpackage;

import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.List;
public final class j37 implements at9 {
    public final aw8 a;
    public final aw8 b;
    public final ym4 c = new ym4((byte) 1, false);
    public final s93 d = new s93(1, 0);
    public final LongSparseArray e = new LongSparseArray();
    public final int f;
    public byte[] h;
    public long n;
    public boolean r;
    public boolean s;

    public j37(aw8 aw8Var, aw8 aw8Var2, ko4 ko4Var) {
        int i;
        this.a = aw8Var;
        this.b = aw8Var2;
        int i2 = ko4Var.v;
        if (i2 != -1) {
            i = i2 + 2;
        } else {
            i = 18;
        }
        this.f = i;
        this.n = -9223372036854775807L;
    }

    @Override
    public final int a() {
        return this.a.a();
    }

    @Override
    public final void g() {
        this.a.g();
        if (!this.r) {
            this.b.g();
        }
    }

    @Override
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        byte[] bArr;
        boolean z;
        int i2;
        int i3;
        int i4 = this.a.i(ym4Var, s93Var, i);
        if (i4 == -4 && !s93Var.isEndOfStream() && (i & 4) == 0) {
            boolean z2 = true;
            if ((i & 1) == 0 && !this.r) {
                long j = s93Var.e;
                boolean z3 = this.s;
                byte[] bArr2 = null;
                LongSparseArray longSparseArray = this.e;
                if (!z3) {
                    while (true) {
                        s93 s93Var2 = this.d;
                        s93Var2.clear();
                        aw8 aw8Var = this.b;
                        ym4 ym4Var2 = this.c;
                        int i5 = aw8Var.i(ym4Var2, s93Var2, 0);
                        if (i5 == -3) {
                            break;
                        } else if (i5 != -5) {
                            if (s93Var2.isEndOfStream()) {
                                this.s = z2;
                                break;
                            }
                            long j2 = s93Var2.e;
                            long j3 = this.n;
                            if (j3 != -9223372036854775807L && j2 < j3) {
                                this.r = z2;
                                longSparseArray.clear();
                                this.h = bArr2;
                            }
                            this.n = j2;
                            ByteBuffer byteBuffer = s93Var2.c;
                            if (!this.r && byteBuffer != null) {
                                s93Var2.d();
                                ko4 ko4Var = (ko4) ym4Var2.c;
                                if (ko4Var != null) {
                                    List list = ko4Var.w;
                                    z = z2;
                                    i2 = 0;
                                    for (int i6 = 0; i6 < list.size(); i6++) {
                                        i2 += ((byte[]) list.get(i6)).length;
                                    }
                                } else {
                                    z = z2;
                                    i2 = 0;
                                }
                                byte[] bArr3 = new byte[byteBuffer.remaining() + i2];
                                if (ko4Var != null) {
                                    List list2 = ko4Var.w;
                                    i3 = 0;
                                    for (int i7 = 0; i7 < list2.size(); i7++) {
                                        byte[] bArr4 = (byte[]) list2.get(i7);
                                        System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                                        i3 += bArr4.length;
                                    }
                                } else {
                                    i3 = 0;
                                }
                                byteBuffer.get(bArr3, i3, byteBuffer.remaining());
                                longSparseArray.put(j2, bArr3);
                                while (longSparseArray.size() > this.f) {
                                    longSparseArray.removeAt(0);
                                }
                            } else {
                                z = z2;
                            }
                            if (j2 > j) {
                                break;
                            }
                            z2 = z;
                            bArr2 = null;
                        }
                    }
                }
                long j4 = s93Var.e;
                int size = longSparseArray.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (longSparseArray.keyAt(size) <= j4) {
                            bArr = (byte[]) longSparseArray.valueAt(size);
                            break;
                        }
                        size--;
                    } else {
                        bArr = null;
                        break;
                    }
                }
                if (bArr != null) {
                    this.h = bArr;
                }
                byte[] bArr5 = this.h;
                if (bArr5 != null) {
                    int length = bArr5.length;
                    ByteBuffer byteBuffer2 = s93Var.f;
                    if (byteBuffer2 != null && byteBuffer2.capacity() >= length) {
                        s93Var.f.clear();
                    } else {
                        s93Var.f = ByteBuffer.allocate(length);
                    }
                    s93Var.f.put(bArr5);
                    s93Var.addFlag(268435456);
                    return i4;
                }
            }
        }
        return i4;
    }

    @Override
    public final boolean k() {
        return this.a.k();
    }

    @Override
    public final int o(long j) {
        return this.a.o(j);
    }
}
