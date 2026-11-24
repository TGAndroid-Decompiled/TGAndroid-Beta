package defpackage;

import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.List;
public final class c17 implements ip9 {
    public final rs8 a;
    public final rs8 b;
    public final sk4 c = new sk4((byte) 1, false);
    public final z83 d = new z83(1, 0);
    public final LongSparseArray e = new LongSparseArray();
    public final int f;
    public byte[] h;
    public long n;
    public boolean r;
    public boolean s;

    public c17(rs8 rs8Var, rs8 rs8Var2, fm4 fm4Var) {
        int i;
        this.a = rs8Var;
        this.b = rs8Var2;
        int i2 = fm4Var.v;
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
    public final void b() {
        this.a.b();
        if (!this.r) {
            this.b.b();
        }
    }

    @Override
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        byte[] bArr;
        boolean z;
        int i2;
        int i3;
        int h = this.a.h(sk4Var, z83Var, i);
        if (h == -4 && !z83Var.isEndOfStream() && (i & 4) == 0) {
            boolean z2 = true;
            if ((i & 1) == 0 && !this.r) {
                long j = z83Var.e;
                boolean z3 = this.s;
                byte[] bArr2 = null;
                LongSparseArray longSparseArray = this.e;
                if (!z3) {
                    while (true) {
                        z83 z83Var2 = this.d;
                        z83Var2.clear();
                        rs8 rs8Var = this.b;
                        sk4 sk4Var2 = this.c;
                        int h2 = rs8Var.h(sk4Var2, z83Var2, 0);
                        if (h2 == -3) {
                            break;
                        } else if (h2 != -5) {
                            if (z83Var2.isEndOfStream()) {
                                this.s = z2;
                                break;
                            }
                            long j2 = z83Var2.e;
                            long j3 = this.n;
                            if (j3 != -9223372036854775807L && j2 < j3) {
                                this.r = z2;
                                longSparseArray.clear();
                                this.h = bArr2;
                            }
                            this.n = j2;
                            ByteBuffer byteBuffer = z83Var2.c;
                            if (!this.r && byteBuffer != null) {
                                z83Var2.d();
                                fm4 fm4Var = (fm4) sk4Var2.c;
                                if (fm4Var != null) {
                                    List list = fm4Var.w;
                                    z = z2;
                                    i2 = 0;
                                    for (int i4 = 0; i4 < list.size(); i4++) {
                                        i2 += ((byte[]) list.get(i4)).length;
                                    }
                                } else {
                                    z = z2;
                                    i2 = 0;
                                }
                                byte[] bArr3 = new byte[byteBuffer.remaining() + i2];
                                if (fm4Var != null) {
                                    List list2 = fm4Var.w;
                                    i3 = 0;
                                    for (int i5 = 0; i5 < list2.size(); i5++) {
                                        byte[] bArr4 = (byte[]) list2.get(i5);
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
                long j4 = z83Var.e;
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
                    ByteBuffer byteBuffer2 = z83Var.f;
                    if (byteBuffer2 != null && byteBuffer2.capacity() >= length) {
                        z83Var.f.clear();
                    } else {
                        z83Var.f = ByteBuffer.allocate(length);
                    }
                    z83Var.f.put(bArr5);
                    z83Var.addFlag(268435456);
                    return h;
                }
            }
        }
        return h;
    }

    @Override
    public final boolean j() {
        return this.a.j();
    }

    @Override
    public final int n(long j) {
        return this.a.n(j);
    }
}
