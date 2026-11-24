package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
public class kg7 implements by2, Continuation, z0c, w0d, am0, SuccessContinuation, qoa, p40, w23, gm6, hk2 {
    public final byte a;
    public static final kg7 b = new kg7((byte) 1);
    public static final kg7 c = new kg7((byte) 2);
    public static final kg7 d = new kg7((byte) 3);
    public static final kg7 e = new kg7((byte) 4);
    public static final kg7 f = new kg7((byte) 5);
    public static final kg7 h = new kg7((byte) 6);
    public static final kg7 n = new kg7((byte) 7);
    public static final kg7 r = new kg7((byte) 8);
    public static final kg7 s = new kg7((byte) 9);
    public static final kg7 w = new kg7((byte) 10);
    public static final kg7 x = new kg7((byte) 11);
    public static final kg7 y = new kg7((byte) 12);
    public static final kg7 E = new kg7((byte) 13);

    public kg7(byte b2) {
        this.a = b2;
    }

    public static MediaCodec c(eq eqVar) {
        String str = ((lm6) eqVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override
    public final int K1() {
        return 0;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.a) {
            case 11:
                return (byte[]) obj;
            default:
                return (byte[]) obj;
        }
    }

    @Override
    public final hm6 b(eq eqVar) {
        int i;
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = c(eqVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) eqVar.d;
            if (surface == null && ((lm6) eqVar.a).h && Build.VERSION.SDK_INT >= 35) {
                i = 8;
            } else {
                i = 0;
            }
            mediaCodec.configure((MediaFormat) eqVar.b, surface, (MediaCrypto) eqVar.e, i);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new afb(mediaCodec, (bi6) eqVar.f);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    public boolean d(CharSequence charSequence) {
        return false;
    }

    @Override
    public final int g0() {
        return 0;
    }

    @Override
    public final float g1() {
        return 0.0f;
    }

    @Override
    public final int h1() {
        return 0;
    }

    @Override
    public final StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public final qk0 r(String str, zf0 zf0Var, EnumMap enumMap) {
        Charset charset;
        int i;
        int i2;
        Charset charset2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        pk0 pk0Var;
        int i9;
        int i10;
        int i11;
        int i12;
        pk0 b2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        byte b3;
        int i18;
        boolean z;
        int length;
        mka mkaVar;
        y34 y34Var = y34.b;
        qk0 qk0Var = null;
        if (enumMap.containsKey(y34Var)) {
            charset = Charset.forName(enumMap.get(y34Var).toString());
        } else {
            charset = null;
        }
        y34 y34Var2 = y34.a;
        if (enumMap.containsKey(y34Var2)) {
            i = Integer.parseInt(enumMap.get(y34Var2).toString());
        } else {
            i = 33;
        }
        y34 y34Var3 = y34.n;
        byte b4 = 0;
        if (enumMap.containsKey(y34Var3)) {
            i2 = Integer.parseInt(enumMap.get(y34Var3).toString());
        } else {
            i2 = 0;
        }
        if (zf0Var == zf0.a) {
            if (charset != null) {
                charset2 = charset;
            } else {
                charset2 = StandardCharsets.ISO_8859_1;
            }
            byte[] bytes = str.getBytes(charset2);
            hya hyaVar = hya.f;
            int i19 = 4;
            int i20 = 2;
            byte b5 = 46;
            int i21 = 3;
            if (charset != null) {
                il1 a = il1.a(charset);
                if (a != null) {
                    int i22 = a.a[0];
                    xrb xrbVar = hyaVar.e(4, 0).b;
                    if (i22 < 0) {
                        xrbVar.getClass();
                        mkaVar = new mka(xrbVar, 0, 3);
                        length = 3;
                    } else if (i22 <= 999999) {
                        byte[] bytes2 = Integer.toString(i22).getBytes(StandardCharsets.ISO_8859_1);
                        int length2 = bytes2.length;
                        xrbVar.getClass();
                        mka mkaVar2 = new mka(xrbVar, length2, 3);
                        int length3 = bytes2.length;
                        int i23 = 0;
                        while (i23 < length3) {
                            i23++;
                            mkaVar2 = new mka(mkaVar2, bytes2[i23] - 46, 4);
                        }
                        length = (bytes2.length << 2) + 3;
                        mkaVar = mkaVar2;
                    } else {
                        u36.j("ECI code must be between 0 and 999999");
                        return null;
                    }
                    hyaVar = new hya(mkaVar, hyaVar.a, 0, hyaVar.d + length);
                } else {
                    u36.i(charset, "No ECI code for character set ");
                    return null;
                }
            }
            List<hya> singletonList = Collections.singletonList(hyaVar);
            int i24 = 0;
            while (true) {
                boolean z2 = true;
                i3 = 32;
                if (i24 >= bytes.length) {
                    break;
                }
                int i25 = i24 + 1;
                qk0 qk0Var2 = qk0Var;
                if (i25 < bytes.length) {
                    b3 = bytes[i25];
                } else {
                    b3 = b4;
                }
                byte b6 = bytes[i24];
                if (b6 != 13) {
                    if (b6 != 44) {
                        if (b6 != b5) {
                            if (b6 == 58 && b3 == 32) {
                                i18 = 5;
                            }
                            i18 = 0;
                        } else {
                            if (b3 == 32) {
                                i18 = 3;
                            }
                            i18 = 0;
                        }
                    } else {
                        if (b3 == 32) {
                            i18 = i19;
                        }
                        i18 = 0;
                    }
                } else {
                    if (b3 == 10) {
                        i18 = i20;
                    }
                    i18 = 0;
                }
                if (i18 > 0) {
                    LinkedList linkedList = new LinkedList();
                    for (hya hyaVar2 : singletonList) {
                        hya b7 = hyaVar2.b(i24);
                        linkedList.add(b7.d(i19, i18));
                        if (hyaVar2.a != i19) {
                            linkedList.add(b7.e(i19, i18));
                        }
                        if (i18 == 3 || i18 == i19) {
                            linkedList.add(b7.d(i20, 16 - i18).d(i20, 1));
                        }
                        if (hyaVar2.c > 0) {
                            linkedList.add(hyaVar2.a(i24).a(i25));
                        }
                    }
                    singletonList = yf5.a(linkedList);
                    i24 = i25;
                } else {
                    LinkedList linkedList2 = new LinkedList();
                    for (hya hyaVar3 : singletonList) {
                        char c2 = (char) (bytes[i24] & 255);
                        int[][] iArr = yf5.c;
                        int i26 = hyaVar3.a;
                        if (iArr[i26][c2] > 0) {
                            z = z2;
                        } else {
                            z = false;
                        }
                        qk0 qk0Var3 = qk0Var2;
                        int i27 = 0;
                        while (i27 <= i19) {
                            boolean z3 = z2;
                            int i28 = iArr[i27][c2];
                            hya hyaVar4 = qk0Var3;
                            if (i28 > 0) {
                                if (qk0Var3 == null) {
                                    hyaVar4 = hyaVar3.b(i24);
                                }
                                hya hyaVar5 = hyaVar4;
                                if (!z || i27 == i26 || i27 == i20) {
                                    linkedList2.add(hyaVar5.d(i27, i28));
                                }
                                if (!z && yf5.d[i26][i27] >= 0) {
                                    linkedList2.add(hyaVar5.e(i27, i28));
                                }
                                qk0Var3 = hyaVar5;
                            }
                            i27++;
                            z2 = z3;
                            i19 = 4;
                            i20 = 2;
                            qk0Var3 = qk0Var3;
                        }
                        boolean z4 = z2;
                        if (hyaVar3.c > 0 || iArr[i26][c2] == 0) {
                            linkedList2.add(hyaVar3.a(i24));
                        }
                        z2 = z4;
                        i19 = 4;
                        i20 = 2;
                    }
                    singletonList = yf5.a(linkedList2);
                }
                i24++;
                i19 = 4;
                b4 = 0;
                i20 = 2;
                b5 = 46;
                qk0Var = qk0Var2;
            }
            qk0 qk0Var4 = qk0Var;
            int i29 = 1;
            hya hyaVar6 = (hya) Collections.min(singletonList, new ju6((byte) 8));
            hyaVar6.getClass();
            ArrayList arrayList = new ArrayList();
            for (xrb xrbVar2 = hyaVar6.b(bytes.length).b; xrbVar2 != null; xrbVar2 = xrbVar2.a) {
                arrayList.add(xrbVar2);
            }
            pk0 pk0Var2 = new pk0();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((xrb) arrayList.get(size)).a(pk0Var2, bytes);
            }
            int i30 = pk0Var2.b;
            int i31 = 11;
            int z5 = kt6.z(i30, i, 100, 11);
            int i32 = i30 + z5;
            int[] iArr2 = yad.a;
            if (i2 != 0) {
                if (i2 < 0) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                i10 = Math.abs(i2);
                if (i9 != 0) {
                    i3 = 4;
                }
                if (i10 <= i3) {
                    if (i9 != 0) {
                        i17 = 88;
                    } else {
                        i17 = 112;
                    }
                    i11 = (i17 + (i10 << 4)) * i10;
                    i8 = iArr2[i10];
                    int i33 = i11 - (i11 % i8);
                    pk0Var = yad.c(pk0Var2, i8);
                    int i34 = pk0Var.b;
                    if (z5 + i34 <= i33) {
                        if (i9 != 0 && i34 > (i8 << 6)) {
                            u36.j("Data to large for user specified layer");
                            return qk0Var4;
                        }
                    } else {
                        u36.j("Data to large for user specified layer");
                        return qk0Var4;
                    }
                } else {
                    u36.j(td4.o(i2, "Illegal value ", " for layers"));
                    return qk0Var4;
                }
            } else {
                pk0 pk0Var3 = qk0Var4;
                int i35 = 0;
                int i36 = 0;
                while (i35 <= 32) {
                    if (i35 <= i21) {
                        i4 = i29;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        i5 = i35 + 1;
                        i6 = 88;
                    } else {
                        i5 = i35;
                        i6 = 112;
                    }
                    int i37 = (i6 + (i5 << 4)) * i5;
                    if (i32 > i37) {
                        i12 = i29;
                        i7 = i36;
                    } else {
                        if (pk0Var3 != 0 && i36 == iArr2[i5]) {
                            i7 = i36;
                            pk0Var3 = pk0Var3;
                        } else {
                            i7 = iArr2[i5];
                            pk0Var3 = yad.c(pk0Var2, i7);
                        }
                        int i38 = i37 - (i37 % i7);
                        if ((i4 == 0 || pk0Var3.b <= (i7 << 6)) && pk0Var3.b + z5 <= i38) {
                            i8 = i7;
                            pk0Var = pk0Var3;
                            i9 = i4;
                            i10 = i5;
                            i11 = i37;
                        } else {
                            i12 = i29;
                        }
                    }
                    i35++;
                    i29 = i12;
                    i21 = 3;
                    i36 = i7;
                    pk0Var3 = pk0Var3;
                }
                u36.j("Data too large for an Aztec code");
                return qk0Var4;
            }
            pk0 b8 = yad.b(pk0Var, i11, i8);
            int i39 = pk0Var.b / i8;
            pk0 pk0Var4 = new pk0();
            if (i9 != 0) {
                pk0Var4.b(i10 - 1, 2);
                pk0Var4.b(i39 - 1, 6);
                b2 = yad.b(pk0Var4, 28, 4);
            } else {
                pk0Var4.b(i10 - 1, 5);
                pk0Var4.b(i39 - 1, 11);
                b2 = yad.b(pk0Var4, 40, 4);
                i31 = 14;
            }
            int i40 = i31 + (i10 << 2);
            int[] iArr3 = new int[i40];
            if (i9 != 0) {
                for (int i41 = 0; i41 < i40; i41++) {
                    iArr3[i41] = i41;
                }
                i13 = i40;
            } else {
                int i42 = i40 / 2;
                i13 = i40 + 1 + (((i42 - 1) / 15) << 1);
                int i43 = i13 / 2;
                for (int i44 = 0; i44 < i42; i44++) {
                    iArr3[(i42 - i44) - 1] = (i43 - i14) - 1;
                    iArr3[i42 + i44] = (i44 / 15) + i44 + i43 + 1;
                }
            }
            qk0 qk0Var5 = new qk0(i13, i13);
            int i45 = 0;
            int i46 = 0;
            while (i45 < i10) {
                int i47 = (i10 - i45) << 2;
                if (i9 != 0) {
                    i15 = 9;
                } else {
                    i15 = 12;
                }
                int i48 = i47 + i15;
                int i49 = 0;
                while (i49 < i48) {
                    int i50 = i49 << 1;
                    int i51 = 0;
                    while (i51 < 2) {
                        if (b8.d(i46 + i50 + i51)) {
                            int i52 = i45 << 1;
                            qk0Var5.c(iArr3[i52 + i51], iArr3[i52 + i49]);
                        }
                        if (b8.d((i48 << 1) + i46 + i50 + i51)) {
                            int i53 = i45 << 1;
                            i16 = i9;
                            qk0Var5.c(iArr3[i53 + i49], iArr3[td4.f(i40, i29, i53, i51)]);
                        } else {
                            i16 = i9;
                        }
                        if (b8.d((i48 << 2) + i46 + i50 + i51)) {
                            int i54 = (i40 - 1) - (i45 << 1);
                            qk0Var5.c(iArr3[i54 - i51], iArr3[i54 - i49]);
                        }
                        if (b8.d((i48 * 6) + i46 + i50 + i51)) {
                            int i55 = i45 << 1;
                            qk0Var5.c(iArr3[((i40 - 1) - i55) - i49], iArr3[i55 + i51]);
                        }
                        i51++;
                        i9 = i16;
                        i29 = 1;
                    }
                    i49++;
                    i29 = 1;
                }
                i46 += i48 << 3;
                i45++;
                i29 = 1;
            }
            int i56 = i9;
            int i57 = i13 / 2;
            int i58 = 0;
            if (i56 != 0) {
                while (i58 < 7) {
                    int i59 = (i57 - 3) + i58;
                    if (b2.d(i58)) {
                        qk0Var5.c(i59, i57 - 5);
                    }
                    if (b2.d(i58 + 7)) {
                        qk0Var5.c(i57 + 5, i59);
                    }
                    if (b2.d(20 - i58)) {
                        qk0Var5.c(i59, i57 + 5);
                    }
                    if (b2.d(27 - i58)) {
                        qk0Var5.c(i57 - 5, i59);
                    }
                    i58++;
                }
            } else {
                while (i58 < 10) {
                    int i60 = (i58 / 5) + (i57 - 5) + i58;
                    if (b2.d(i58)) {
                        qk0Var5.c(i60, i57 - 7);
                    }
                    if (b2.d(i58 + 10)) {
                        qk0Var5.c(i57 + 7, i60);
                    }
                    if (b2.d(29 - i58)) {
                        qk0Var5.c(i60, i57 + 7);
                    }
                    if (b2.d(39 - i58)) {
                        qk0Var5.c(i57 - 7, i60);
                    }
                    i58++;
                }
            }
            if (i56 != 0) {
                yad.a(qk0Var5, i57, 5);
            } else {
                yad.a(qk0Var5, i57, 7);
                int i61 = 0;
                int i62 = 0;
                while (i61 < (i40 / 2) - 1) {
                    for (int i63 = i57 & 1; i63 < i13; i63 += 2) {
                        int i64 = i57 - i62;
                        qk0Var5.c(i64, i63);
                        int i65 = i57 + i62;
                        qk0Var5.c(i65, i63);
                        qk0Var5.c(i63, i64);
                        qk0Var5.c(i63, i65);
                    }
                    i61 += 15;
                    i62 += 16;
                }
            }
            int i66 = qk0Var5.a;
            int i67 = qk0Var5.b;
            int max = Math.max(0, i66);
            int max2 = Math.max(0, i67);
            int min = Math.min(max / i66, max2 / i67);
            int i68 = (max - (i66 * min)) / 2;
            int i69 = (max2 - (i67 * min)) / 2;
            qk0 qk0Var6 = new qk0(max, max2);
            int i70 = 0;
            while (i70 < i67) {
                int i71 = i68;
                int i72 = 0;
                while (i72 < i66) {
                    if (qk0Var5.b(i72, i70)) {
                        qk0Var6.d(i71, i69, min, min);
                    }
                    i72++;
                    i71 += min;
                }
                i70++;
                i69 += min;
            }
            return qk0Var6;
        }
        u36.i(zf0Var, "Can only encode AZTEC, but got ");
        return null;
    }

    @Override
    public final int r1() {
        return 0;
    }

    @Override
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i == i2) {
            shortBuffer2.put(shortBuffer);
        } else {
            u36.j("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public final Task then(Object obj) {
        Void r1 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public final int u0() {
        return 0;
    }

    @Override
    public final float w0() {
        return -1.0f;
    }

    @Override
    public final float y0() {
        return -1.0f;
    }

    @Override
    public final Object then(Task task) {
        zo zoVar = ua4.r;
        return null;
    }
}
