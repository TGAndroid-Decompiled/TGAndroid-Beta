package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;
import java.util.HashSet;
public final class nm6 {
    public static final mfb m = nze.a(new m40((byte) 4));
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public nm6(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = dg7.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(gcc.g(i, widthAlignment) * widthAlignment, gcc.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            double floor = Math.floor(d);
            if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
                if (Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public static defpackage.nm6 i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm6.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):nm6");
    }

    public final w93 b(ko4 ko4Var, ko4 ko4Var2) {
        int i;
        ko4 ko4Var3;
        ko4 ko4Var4;
        int i2;
        int i3;
        String str = ko4Var.t;
        bm2 bm2Var = ko4Var.L;
        String str2 = ko4Var2.t;
        bm2 bm2Var2 = ko4Var2.L;
        boolean equals = Objects.equals(str, str2);
        boolean z = false;
        if (!equals) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.i) {
            if (ko4Var.G != ko4Var2.G) {
                i |= 1024;
            }
            z = (ko4Var.A == ko4Var2.A && ko4Var.B == ko4Var2.B) ? true : true;
            if (!this.e && z) {
                i |= 512;
            }
            if ((!bm2.e(bm2Var) || !bm2.e(bm2Var2)) && !Objects.equals(bm2Var, bm2Var2)) {
                i |= 2048;
            }
            HashSet hashSet = gt6.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !ko4Var.b(ko4Var2)) {
                i |= 2;
            }
            int i4 = ko4Var.D;
            if (i4 != -1 && (i3 = ko4Var.E) != -1 && i4 == ko4Var2.D && i3 == ko4Var2.E && z) {
                i |= 2;
            }
            if (i == 0 && Objects.equals(ko4Var2.t, "video/dolby-vision")) {
                Pair b = rk2.b(ko4Var);
                Pair b2 = rk2.b(ko4Var2);
                if (b == null || b2 == null || !((Integer) b.first).equals(b2.first)) {
                    i |= 2;
                }
            }
            if (i == 0) {
                if (ko4Var.b(ko4Var2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new w93(this.a, ko4Var, ko4Var2, i2, 0);
            }
            ko4Var3 = ko4Var;
            ko4Var4 = ko4Var2;
        } else {
            ko4Var3 = ko4Var;
            ko4Var4 = ko4Var2;
            if (ko4Var3.N != ko4Var4.N) {
                i |= 4096;
            }
            if (ko4Var3.P != ko4Var4.P) {
                i |= 8192;
            }
            if (ko4Var3.Q != ko4Var4.Q) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b3 = rk2.b(ko4Var3);
                Pair b4 = rk2.b(ko4Var4);
                if (b3 != null && b4 != null) {
                    int intValue = ((Integer) b3.first).intValue();
                    int intValue2 = ((Integer) b4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new w93(this.a, ko4Var3, ko4Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b3.equals(b4)) {
                        return new w93(this.a, ko4Var3, ko4Var4, 3, 0);
                    }
                }
            }
            if (i == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new w93(this.a, ko4Var3, ko4Var4, 3, 0);
            }
            if (!ko4Var3.b(ko4Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new w93(this.a, ko4Var3, ko4Var4, 1, 0);
            }
        }
        return new w93(this.a, ko4Var3, ko4Var4, 0, i);
    }

    public final boolean c(android.content.Context r21, defpackage.ko4 r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm6.c(android.content.Context, ko4, boolean):boolean");
    }

    public final boolean d(ko4 ko4Var) {
        if (Objects.equals(ko4Var.t, "audio/flac") && ko4Var.Q == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context, ko4 ko4Var) {
        int i;
        int i2;
        String str = ko4Var.t;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(wm6.c(ko4Var))) || !c(context, ko4Var, true) || !d(ko4Var)) {
            return false;
        }
        if (this.i) {
            int i3 = ko4Var.A;
            if (i3 > 0 && (i2 = ko4Var.B) > 0) {
                return g(i3, i2, ko4Var.F);
            }
        } else {
            int i4 = ko4Var.P;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                    h("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = ko4Var.N;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i = 16;
                    } else {
                        i = 30;
                    }
                    efd.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    h("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(ko4 ko4Var) {
        boolean z;
        if (this.i) {
            return this.e;
        }
        qk2 d = rk2.d(ko4Var);
        if (d != null && (z = d.c)) {
            yve.p(z);
            if (d.a == 42) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g(int i, int i2, double d) {
        int i3;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (i4 >= 29 && ((bool = fte.a) == null || !bool.booleanValue())) {
                i3 = sr.a(videoCapabilities, i, i2, d);
            } else {
                i3 = 0;
            }
            if (i3 != 2) {
                if (i3 == 1) {
                    StringBuilder p = bs2.p("sizeAndRate.cover, ", i, "x", i2, "@");
                    p.append(d);
                    h(p.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                HashSet hashSet = gt6.a;
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder p2 = bs2.p("sizeAndRate.rotated, ", i, "x", i2, "@");
                    p2.append(d);
                    StringBuilder l = xnb.l("AssumedSupport [", p2.toString(), "] [", str, ", ");
                    l.append(this.b);
                    l.append("] [");
                    l.append(gcc.a);
                    l.append("]");
                    efd.b("MediaCodecInfo", l.toString());
                    return true;
                }
            }
            StringBuilder p3 = bs2.p("sizeAndRate.support, ", i, "x", i2, "@");
            p3.append(d);
            h(p3.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder p = ik8.p("NoSupport [", str, "] [");
        p.append(this.a);
        p.append(", ");
        p.append(this.b);
        p.append("] [");
        p.append(gcc.a);
        p.append("]");
        efd.b("MediaCodecInfo", p.toString());
    }

    public final String toString() {
        return this.a;
    }
}
