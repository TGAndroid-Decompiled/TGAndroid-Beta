package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;
import java.util.HashSet;
public final class lm6 {
    public static final sdb m = xwe.a(new k50((byte) 4));
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

    public lm6(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = wf7.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(hac.g(i, widthAlignment) * widthAlignment, hac.g(i2, heightAlignment) * heightAlignment);
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

    public static defpackage.lm6 i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm6.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):lm6");
    }

    public final pa3 b(go4 go4Var, go4 go4Var2) {
        int i;
        go4 go4Var3;
        go4 go4Var4;
        int i2;
        int i3;
        String str = go4Var.t;
        tm2 tm2Var = go4Var.L;
        String str2 = go4Var2.t;
        tm2 tm2Var2 = go4Var2.L;
        boolean equals = Objects.equals(str, str2);
        boolean z = false;
        if (!equals) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.i) {
            if (go4Var.G != go4Var2.G) {
                i |= 1024;
            }
            z = (go4Var.A == go4Var2.A && go4Var.B == go4Var2.B) ? true : true;
            if (!this.e && z) {
                i |= 512;
            }
            if ((!tm2.e(tm2Var) || !tm2.e(tm2Var2)) && !Objects.equals(tm2Var, tm2Var2)) {
                i |= 2048;
            }
            HashSet hashSet = ct6.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !go4Var.b(go4Var2)) {
                i |= 2;
            }
            int i4 = go4Var.D;
            if (i4 != -1 && (i3 = go4Var.E) != -1 && i4 == go4Var2.D && i3 == go4Var2.E && z) {
                i |= 2;
            }
            if (i == 0 && Objects.equals(go4Var2.t, "video/dolby-vision")) {
                Pair b = jl2.b(go4Var);
                Pair b2 = jl2.b(go4Var2);
                if (b == null || b2 == null || !((Integer) b.first).equals(b2.first)) {
                    i |= 2;
                }
            }
            if (i == 0) {
                if (go4Var.b(go4Var2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new pa3(this.a, go4Var, go4Var2, i2, 0);
            }
            go4Var3 = go4Var;
            go4Var4 = go4Var2;
        } else {
            go4Var3 = go4Var;
            go4Var4 = go4Var2;
            if (go4Var3.N != go4Var4.N) {
                i |= 4096;
            }
            if (go4Var3.P != go4Var4.P) {
                i |= 8192;
            }
            if (go4Var3.Q != go4Var4.Q) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b3 = jl2.b(go4Var3);
                Pair b4 = jl2.b(go4Var4);
                if (b3 != null && b4 != null) {
                    int intValue = ((Integer) b3.first).intValue();
                    int intValue2 = ((Integer) b4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new pa3(this.a, go4Var3, go4Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b3.equals(b4)) {
                        return new pa3(this.a, go4Var3, go4Var4, 3, 0);
                    }
                }
            }
            if (i == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new pa3(this.a, go4Var3, go4Var4, 3, 0);
            }
            if (!go4Var3.b(go4Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new pa3(this.a, go4Var3, go4Var4, 1, 0);
            }
        }
        return new pa3(this.a, go4Var3, go4Var4, 0, i);
    }

    public final boolean c(android.content.Context r21, defpackage.go4 r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm6.c(android.content.Context, go4, boolean):boolean");
    }

    public final boolean d(go4 go4Var) {
        if (Objects.equals(go4Var.t, "audio/flac") && go4Var.Q == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context, go4 go4Var) {
        int i;
        int i2;
        String str = go4Var.t;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(tm6.c(go4Var))) || !c(context, go4Var, true) || !d(go4Var)) {
            return false;
        }
        if (this.i) {
            int i3 = go4Var.A;
            if (i3 > 0 && (i2 = go4Var.B) > 0) {
                return g(i3, i2, go4Var.F);
            }
        } else {
            int i4 = go4Var.P;
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
            int i5 = go4Var.N;
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
                    ncd.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i + "]");
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

    public final boolean f(go4 go4Var) {
        boolean z;
        if (this.i) {
            return this.e;
        }
        il2 d = jl2.d(go4Var);
        if (d != null && (z = d.c)) {
            jte.p(z);
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
            if (i4 >= 29 && ((bool = qqe.a) == null || !bool.booleanValue())) {
                i3 = rs.a(videoCapabilities, i, i2, d);
            } else {
                i3 = 0;
            }
            if (i3 != 2) {
                if (i3 == 1) {
                    StringBuilder o = ts2.o("sizeAndRate.cover, ", i, "x", i2, "@");
                    o.append(d);
                    h(o.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                HashSet hashSet = ct6.a;
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder o2 = ts2.o("sizeAndRate.rotated, ", i, "x", i2, "@");
                    o2.append(d);
                    StringBuilder m2 = mlb.m("AssumedSupport [", o2.toString(), "] [", str, ", ");
                    m2.append(this.b);
                    m2.append("] [");
                    m2.append(hac.a);
                    m2.append("]");
                    ncd.b("MediaCodecInfo", m2.toString());
                    return true;
                }
            }
            StringBuilder o3 = ts2.o("sizeAndRate.support, ", i, "x", i2, "@");
            o3.append(d);
            h(o3.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder p = wi8.p("NoSupport [", str, "] [");
        p.append(this.a);
        p.append(", ");
        p.append(this.b);
        p.append("] [");
        p.append(hac.a);
        p.append("]");
        ncd.b("MediaCodecInfo", p.toString());
    }

    public final String toString() {
        return this.a;
    }
}
