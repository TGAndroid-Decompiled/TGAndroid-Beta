package a4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import f5.d0;
import j3.t0;
import org.telegram.ui.th;
public final class q {
    public final String f104a;
    public final String f105b;
    public final String f106c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean f107e;
    public final boolean f108f;
    public final boolean f109g;
    public final boolean h;

    public q(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f104a = str;
        this.f105b = str2;
        this.f106c = str3;
        this.d = codecCapabilities;
        this.f109g = z10;
        this.f107e = z11;
        this.f108f = z12;
        this.h = f5.o.j(str2);
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

    public static a4.q h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: a4.q.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):a4.q");
    }

    public final m3.l b(t0 t0Var, t0 t0Var2) {
        int i10;
        t0 t0Var3;
        t0 t0Var4;
        int i11;
        if (!d0.a(t0Var.B, t0Var2.B)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.h) {
            if (t0Var.J != t0Var2.J) {
                i10 |= 1024;
            }
            if (!this.f107e && (t0Var.G != t0Var2.G || t0Var.H != t0Var2.H)) {
                i10 |= 512;
            }
            if (!d0.a(t0Var.N, t0Var2.N)) {
                i10 |= 2048;
            }
            if (d0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f104a) && !t0Var.b(t0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                if (t0Var.b(t0Var2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new m3.l(this.f104a, t0Var, t0Var2, i11, 0);
            }
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
        } else {
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
            if (t0Var3.O != t0Var4.O) {
                i10 |= 4096;
            }
            if (t0Var3.P != t0Var4.P) {
                i10 |= 8192;
            }
            if (t0Var3.Q != t0Var4.Q) {
                i10 |= 16384;
            }
            String str = this.f105b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d = b0.d(t0Var3);
                Pair d10 = b0.d(t0Var4);
                if (d != null && d10 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d10.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new m3.l(this.f104a, t0Var3, t0Var4, 3, 0);
                    }
                }
            }
            if (!t0Var3.b(t0Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new m3.l(this.f104a, t0Var3, t0Var4, 1, 0);
            }
        }
        return new m3.l(this.f104a, t0Var3, t0Var4, 0, i10);
    }

    public final boolean c(t0 t0Var, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = b0.d(t0Var);
        if (d != null) {
            int intValue = ((Integer) d.first).intValue();
            int intValue2 = ((Integer) d.second).intValue();
            boolean equals = "video/dolby-vision".equals(t0Var.B);
            int i11 = 8;
            String str = this.f105b;
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
                if (d0.f6579a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
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
                    if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == intValue) {
                            String str2 = d0.f6580b;
                            if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + t0Var.f10803r + ", " + this.f106c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(t0 t0Var) {
        boolean z10;
        int i10;
        String str = t0Var.B;
        String str2 = this.f105b;
        boolean z11 = false;
        if (!str2.equals(str) && !str2.equals(b0.b(t0Var))) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = t0Var.H;
        int i12 = t0Var.G;
        if (!z10 || !c(t0Var, true)) {
            return false;
        }
        if (this.h) {
            if (i12 > 0 && i11 > 0) {
                if (d0.f6579a >= 21) {
                    return f(i12, i11, t0Var.I);
                }
                if (i12 * i11 <= b0.j()) {
                    z11 = true;
                }
                if (!z11) {
                    g("legacyFrameSize, " + i12 + "x" + i11);
                }
                return z11;
            }
        } else {
            int i13 = d0.f6579a;
            if (i13 >= 21) {
                int i14 = t0Var.P;
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
                int i15 = t0Var.O;
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
                        f5.a.K("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f104a + ", [" + maxInputChannelCount + " to " + i10 + "]");
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

    public final boolean e(t0 t0Var) {
        if (this.h) {
            return this.f107e;
        }
        Pair d = b0.d(t0Var);
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
        if (d0.f6579a >= 29) {
            int a2 = p.a(videoCapabilities, i10, i11, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                StringBuilder o10 = com.google.android.recaptcha.internal.a.o("sizeAndRate.cover, ", i10, "x", i11, "@");
                o10.append(d);
                g(o10.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.f104a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(d0.f6580b)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder o11 = com.google.android.recaptcha.internal.a.o("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    o11.append(d);
                    StringBuilder k9 = th.k("AssumedSupport [", o11.toString(), "] [", str, ", ");
                    k9.append(this.f105b);
                    k9.append("] [");
                    k9.append(d0.f6582e);
                    k9.append("]");
                    f5.a.n("MediaCodecInfo", k9.toString());
                }
            }
            StringBuilder o12 = com.google.android.recaptcha.internal.a.o("sizeAndRate.support, ", i10, "x", i11, "@");
            o12.append(d);
            g(o12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder s10 = w.s("NoSupport [", str, "] [");
        s10.append(this.f104a);
        s10.append(", ");
        s10.append(this.f105b);
        s10.append("] [");
        s10.append(d0.f6582e);
        s10.append("]");
        f5.a.n("MediaCodecInfo", s10.toString());
    }

    public final String toString() {
        return this.f104a;
    }
}
