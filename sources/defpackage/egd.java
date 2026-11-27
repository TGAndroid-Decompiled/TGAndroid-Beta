package defpackage;

import android.content.Context;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class egd implements tq2, bde, us3 {
    public final byte a;

    public egd(byte b) {
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
                                i2 = ylf.a(bArr, i4, i);
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
                            i2 = ylf.a(bArr, i4, i);
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
    public final rc0 a(Context context, String str, ts3 ts3Var) {
        rc0 rc0Var = new rc0();
        rc0Var.a = ts3Var.b(context, str);
        int i = 1;
        int a = ts3Var.a(context, str, true);
        rc0Var.b = a;
        int i2 = rc0Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                rc0Var.c = i;
                return rc0Var;
            }
        }
        if (a < i2) {
            i = -1;
        }
        rc0Var.c = i;
        return rc0Var;
    }

    @Override
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 0:
                return new mg7();
            default:
                pi2 pi2Var = new pi2();
                tv tvVar = new tv((byte) 15);
                ReferenceQueue referenceQueue = pi2Var.a;
                Set set = pi2Var.b;
                set.add(new zrd(pi2Var, referenceQueue, set, tvVar));
                Thread thread = new Thread(new iqd(referenceQueue, set, (byte) 16), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return pi2Var;
        }
    }

    @Override
    public final lfe zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override
    public final boolean zzc(Class cls) {
        return false;
    }
}
