package d4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import h5.d0;
import j3.n0;
import org.telegram.ui.yh;
public final class n {
    public final String f4164a;
    public final String f4165b;
    public final String f4166c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f4167f;
    public final boolean f4168g;
    public final boolean h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z10, boolean z11) {
        str.getClass();
        this.f4164a = str;
        this.f4165b = str2;
        this.f4166c = str3;
        this.d = codecCapabilities;
        this.f4168g = z4;
        this.e = z10;
        this.f4167f = z11;
        this.h = h5.o.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(d0.f(i10, widthAlignment) * widthAlignment, d0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    public static d4.n h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: d4.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):d4.n");
    }

    public final n3.k b(n0 n0Var, n0 n0Var2) {
        int i10;
        n0 n0Var3;
        n0 n0Var4;
        int i11;
        if (!d0.a(n0Var.C, n0Var2.C)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.h) {
            if (n0Var.K != n0Var2.K) {
                i10 |= 1024;
            }
            if (!this.e && (n0Var.H != n0Var2.H || n0Var.I != n0Var2.I)) {
                i10 |= 512;
            }
            if (!d0.a(n0Var.O, n0Var2.O)) {
                i10 |= 2048;
            }
            if (d0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f4164a) && !n0Var.b(n0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                if (n0Var.b(n0Var2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new n3.k(this.f4164a, n0Var, n0Var2, i11, 0);
            }
            n0Var3 = n0Var;
            n0Var4 = n0Var2;
        } else {
            n0Var3 = n0Var;
            n0Var4 = n0Var2;
            if (n0Var3.P != n0Var4.P) {
                i10 |= 4096;
            }
            if (n0Var3.Q != n0Var4.Q) {
                i10 |= 8192;
            }
            if (n0Var3.R != n0Var4.R) {
                i10 |= 16384;
            }
            String str = this.f4165b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d = y.d(n0Var3);
                Pair d10 = y.d(n0Var4);
                if (d != null && d10 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d10.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new n3.k(this.f4164a, n0Var3, n0Var4, 3, 0);
                    }
                }
            }
            if (!n0Var3.b(n0Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new n3.k(this.f4164a, n0Var3, n0Var4, 1, 0);
            }
        }
        return new n3.k(this.f4164a, n0Var3, n0Var4, 0, i10);
    }

    public final boolean c(n0 n0Var, boolean z4) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = y.d(n0Var);
        if (d != null) {
            int intValue = ((Integer) d.first).intValue();
            int intValue2 = ((Integer) d.second).intValue();
            boolean equals = "video/dolby-vision".equals(n0Var.C);
            int i11 = 8;
            String str = this.f4165b;
            if (equals) {
                if ("video/avc".equals(str)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (d0.f6937a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
                    } else {
                        i10 = 0;
                    }
                    if (i10 >= 180000000) {
                        i11 = 1024;
                    } else if (i10 >= 120000000) {
                        i11 = 512;
                    } else if (i10 >= 60000000) {
                        i11 = 256;
                    } else if (i10 >= 30000000) {
                        i11 = 128;
                    } else if (i10 >= 18000000) {
                        i11 = 64;
                    } else if (i10 >= 12000000) {
                        i11 = 32;
                    } else if (i10 >= 7200000) {
                        i11 = 16;
                    } else if (i10 < 3600000) {
                        if (i10 >= 1800000) {
                            i11 = 4;
                        } else if (i10 >= 800000) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i11;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z4)) {
                        if ("video/hevc".equals(str) && 2 == intValue) {
                            String str2 = d0.f6938b;
                            if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + n0Var.f8740r + ", " + this.f4166c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(n0 n0Var) {
        boolean z4;
        int i10;
        String str = n0Var.C;
        String str2 = this.f4165b;
        boolean z10 = false;
        if (!str2.equals(str) && !str2.equals(y.b(n0Var))) {
            z4 = false;
        } else {
            z4 = true;
        }
        int i11 = n0Var.I;
        int i12 = n0Var.H;
        if (!z4 || !c(n0Var, true)) {
            return false;
        }
        if (this.h) {
            if (i12 > 0 && i11 > 0) {
                if (d0.f6937a >= 21) {
                    return f(i12, i11, n0Var.J);
                }
                if (i12 * i11 <= y.j()) {
                    z10 = true;
                }
                if (!z10) {
                    g("legacyFrameSize, " + i12 + "x" + i11);
                }
                return z10;
            }
        } else {
            int i13 = d0.f6937a;
            if (i13 >= 21) {
                int i14 = n0Var.Q;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (i14 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                        g("sampleRate.support, " + i14);
                        return false;
                    }
                }
                int i15 = n0Var.P;
                if (i15 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i10 = 6;
                        } else if ("audio/eac3".equals(str2)) {
                            i10 = 16;
                        } else {
                            i10 = 30;
                        }
                        h5.a.K("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f4164a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                        maxInputChannelCount = i10;
                    }
                    if (maxInputChannelCount < i15) {
                        g("channelCount.support, " + i15);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean e(n0 n0Var) {
        if (this.h) {
            return this.e;
        }
        Pair d = y.d(n0Var);
        if (d != null && ((Integer) d.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10, int i11, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (d0.f6937a >= 29) {
            int a2 = m.a(videoCapabilities, i10, i11, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                StringBuilder m9 = e2.c.m("sizeAndRate.cover, ", i10, "x", i11, "@");
                m9.append(d);
                g(m9.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.f4164a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(d0.f6938b)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder m10 = e2.c.m("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    m10.append(d);
                    StringBuilder m11 = yh.m("AssumedSupport [", m10.toString(), "] [", str, ", ");
                    m11.append(this.f4165b);
                    m11.append("] [");
                    m11.append(d0.e);
                    m11.append("]");
                    h5.a.n("MediaCodecInfo", m11.toString());
                }
            }
            StringBuilder m12 = e2.c.m("sizeAndRate.support, ", i10, "x", i11, "@");
            m12.append(d);
            g(m12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder t6 = android.support.v4.media.a.t("NoSupport [", str, "] [");
        t6.append(this.f4164a);
        t6.append(", ");
        t6.append(this.f4165b);
        t6.append("] [");
        t6.append(d0.e);
        t6.append("]");
        h5.a.n("MediaCodecInfo", t6.toString());
    }

    public final String toString() {
        return this.f4164a;
    }
}
