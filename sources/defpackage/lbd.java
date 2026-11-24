package defpackage;

import android.content.Context;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class lbd implements aq2, l8e, cs3 {
    public final byte a;

    public lbd(byte b) {
        this.a = b;
    }

    public static boolean b(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            } else if (bArr[i3] >= 0) {
                i3++;
            } else {
                while (i3 < i) {
                    int i4 = i3 + 1;
                    i2 = bArr[i3];
                    if (i2 < 0) {
                        if (i2 < -32) {
                            if (i4 < i) {
                                if (i2 >= -62) {
                                    i3 += 2;
                                    if (bArr[i4] > -65) {
                                    }
                                }
                                i2 = -1;
                                break;
                            }
                            break;
                        } else if (i2 < -16) {
                            if (i4 >= i - 1) {
                                i2 = ihf.a(bArr, i4, i);
                                break;
                            }
                            int i5 = i3 + 2;
                            char c = bArr[i4];
                            if (c <= -65 && ((i2 != -32 || c >= -96) && (i2 != -19 || c < -96))) {
                                i3 += 3;
                                if (bArr[i5] > -65) {
                                }
                            }
                            i2 = -1;
                            break;
                        } else if (i4 >= i - 2) {
                            i2 = ihf.a(bArr, i4, i);
                            break;
                        } else {
                            int i6 = i3 + 2;
                            int i7 = bArr[i4];
                            if (i7 <= -65) {
                                if ((((i7 + 112) + (i2 << 28)) >> 30) == 0) {
                                    int i8 = i3 + 3;
                                    if (bArr[i6] <= -65) {
                                        i3 += 4;
                                        if (bArr[i8] > -65) {
                                        }
                                    }
                                }
                            }
                            i2 = -1;
                            break;
                        }
                    }
                    i3 = i4;
                }
            }
        }
        i2 = 0;
        if (i2 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 0:
                return new ce7();
            default:
                th2 th2Var = new th2();
                sv svVar = new sv((byte) 15);
                ReferenceQueue referenceQueue = th2Var.a;
                Set set = th2Var.b;
                set.add(new ind(th2Var, referenceQueue, set, svVar));
                Thread thread = new Thread(new rld(referenceQueue, set, (byte) 16), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return th2Var;
        }
    }

    @Override
    public final pc0 a(Context context, String str, bs3 bs3Var) {
        pc0 pc0Var = new pc0();
        pc0Var.a = bs3Var.b(context, str);
        int i = 1;
        int a = bs3Var.a(context, str, true);
        pc0Var.b = a;
        int i2 = pc0Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                pc0Var.c = i;
                return pc0Var;
            }
        }
        if (a < i2) {
            i = -1;
        }
        pc0Var.c = i;
        return pc0Var;
    }

    @Override
    public final vae zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override
    public final boolean zzc(Class cls) {
        return false;
    }
}
