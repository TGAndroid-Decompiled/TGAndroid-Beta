package d4;

import android.media.MediaCodecInfo;
import android.util.Pair;
import h5.d0;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import k7.a7;
public abstract class y {
    public static final Pattern f4188a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap f4189b = new HashMap();
    public static int f4190c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (d0.f6924a < 26 && d0.f6925b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f4145a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new t(new s(2), 0));
        }
        int i10 = d0.f6924a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).f4145a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new t(new s(3), 0));
            }
        }
        if (i10 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f4145a)) {
            arrayList.add((n) arrayList.remove(0));
        }
    }

    public static String b(n0 n0Var) {
        Pair d;
        if ("audio/eac3-joc".equals(n0Var.C)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(n0Var.C) && (d = d(n0Var)) != null) {
            int intValue = ((Integer) d.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    public static android.util.Pair d(j3.n0 r34) {
        throw new UnsupportedOperationException("Method not decompiled: d4.y.d(j3.n0):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z4, boolean z10) {
        w uVar;
        synchronized (y.class) {
            try {
                u uVar2 = new u(str, z4, z10);
                HashMap hashMap = f4189b;
                List list = (List) hashMap.get(uVar2);
                if (list != null) {
                    return list;
                }
                int i10 = d0.f6924a;
                if (i10 >= 21) {
                    uVar = new p2.w(z4, z10);
                } else {
                    uVar = new h7.u(4);
                }
                ArrayList f10 = f(uVar2, uVar);
                if (z4 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                    f10 = f(uVar2, new h7.u(4));
                    if (!f10.isEmpty()) {
                        h5.a.K("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) f10.get(0)).f4145a);
                    }
                }
                a(str, f10);
                s8.v t6 = s8.v.t(f10);
                hashMap.put(uVar2, t6);
                return t6;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static java.util.ArrayList f(d4.u r18, d4.w r19) {
        throw new UnsupportedOperationException("Method not decompiled: d4.y.f(d4.u, d4.w):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z4 || !str.endsWith(".secure")) {
                int i10 = d0.f6924a;
                if (i10 >= 21 || (!"CIPAACDecoder".equals(str) && !"CIPMP3Decoder".equals(str) && !"CIPVorbisDecoder".equals(str) && !"CIPAMRNBDecoder".equals(str) && !"AACDecoder".equals(str) && !"MP3Decoder".equals(str))) {
                    if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                        String str3 = d0.f6925b;
                        if (!"a70".equals(str3)) {
                            if ("Xiaomi".equals(d0.f6926c) && str3.startsWith("HM")) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                        String str4 = d0.f6925b;
                        if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                            return false;
                        }
                    }
                    if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                        String str5 = d0.f6925b;
                        if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                            return false;
                        }
                    }
                    if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(d0.f6926c))) {
                        String str6 = d0.f6925b;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            return false;
                        }
                    }
                    if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(d0.f6926c)) {
                        String str7 = d0.f6925b;
                        if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                            return false;
                        }
                    }
                    if (i10 > 19 || !d0.f6925b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
                        if (i10 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (d0.f6924a >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        return !i(mediaCodecInfo, str);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (d0.f6924a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!h5.o.h(str)) {
            String b10 = a7.b(mediaCodecInfo.getName());
            if (!b10.startsWith("arc.")) {
                if (!b10.startsWith("omx.google.") && !b10.startsWith("omx.ffmpeg.")) {
                    if ((!b10.startsWith("omx.sec.") || !b10.contains(".sw.")) && !b10.equals("omx.qcom.video.decoder.hevcswvdec") && !b10.startsWith("c2.android.") && !b10.startsWith("c2.google.")) {
                        if (b10.startsWith("omx.") || b10.startsWith("c2.")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static int j() {
        n nVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        int i11;
        if (f4190c == -1) {
            int i12 = 0;
            List e = e("video/avc", false, false);
            if (e.isEmpty()) {
                nVar = null;
            } else {
                nVar = (n) e.get(0);
            }
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = codecProfileLevelArr[i12].level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                continue;
                            case 64:
                                i11 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i11 = 414720;
                                continue;
                            case 512:
                                i11 = 921600;
                                continue;
                            case 1024:
                                i11 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i11 = 2097152;
                                continue;
                            case 8192:
                                i11 = 2228224;
                                continue;
                            case 16384:
                                i11 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i11 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i11 = 35651584;
                                continue;
                            default:
                                i11 = -1;
                                continue;
                        }
                    } else {
                        i11 = 25344;
                    }
                    i13 = Math.max(i11, i13);
                    i12++;
                }
                if (d0.f6924a >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i12 = Math.max(i13, i10);
            }
            f4190c = i12;
        }
        return f4190c;
    }
}
