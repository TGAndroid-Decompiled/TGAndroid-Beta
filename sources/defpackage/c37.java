package defpackage;

import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.List;
public final class c37 implements jr9 {
    public final su8 a;
    public final su8 b;
    public final mj4 c = new mj4((byte) 3, false);
    public final la3 d = new la3(1, 0);
    public final LongSparseArray e = new LongSparseArray();
    public final int f;
    public byte[] h;
    public long n;
    public boolean r;
    public boolean s;

    public c37(su8 su8Var, su8 su8Var2, go4 go4Var) {
        int i;
        this.a = su8Var;
        this.b = su8Var2;
        int i2 = go4Var.v;
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
    public final void d() {
        this.a.d();
        if (!this.r) {
            this.b.d();
        }
    }

    @Override
    public final boolean i() {
        return this.a.i();
    }

    @Override
    public final int m(long j) {
        return this.a.m(j);
    }

    @Override
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        byte[] bArr;
        boolean z;
        int i2;
        int i3;
        int p = this.a.p(mj4Var, la3Var, i);
        if (p == -4 && !la3Var.isEndOfStream() && (i & 4) == 0) {
            boolean z2 = true;
            if ((i & 1) == 0 && !this.r) {
                long j = la3Var.e;
                boolean z3 = this.s;
                byte[] bArr2 = null;
                LongSparseArray longSparseArray = this.e;
                if (!z3) {
                    while (true) {
                        la3 la3Var2 = this.d;
                        la3Var2.clear();
                        su8 su8Var = this.b;
                        mj4 mj4Var2 = this.c;
                        int p2 = su8Var.p(mj4Var2, la3Var2, 0);
                        if (p2 == -3) {
                            break;
                        } else if (p2 != -5) {
                            if (la3Var2.isEndOfStream()) {
                                this.s = z2;
                                break;
                            }
                            long j2 = la3Var2.e;
                            long j3 = this.n;
                            if (j3 != -9223372036854775807L && j2 < j3) {
                                this.r = z2;
                                longSparseArray.clear();
                                this.h = bArr2;
                            }
                            this.n = j2;
                            ByteBuffer byteBuffer = la3Var2.c;
                            if (!this.r && byteBuffer != null) {
                                la3Var2.d();
                                go4 go4Var = (go4) mj4Var2.c;
                                if (go4Var != null) {
                                    List list = go4Var.w;
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
                                if (go4Var != null) {
                                    List list2 = go4Var.w;
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
                long j4 = la3Var.e;
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
                    ByteBuffer byteBuffer2 = la3Var.f;
                    if (byteBuffer2 != null && byteBuffer2.capacity() >= length) {
                        la3Var.f.clear();
                    } else {
                        la3Var.f = ByteBuffer.allocate(length);
                    }
                    la3Var.f.put(bArr5);
                    la3Var.addFlag(268435456);
                    return p;
                }
            }
        }
        return p;
    }
}
