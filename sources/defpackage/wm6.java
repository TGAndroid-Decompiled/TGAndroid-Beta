package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public abstract class wm6 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((nm6) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(nm6.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new jz0(new lq5((byte) 26), (byte) 4));
        }
        if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((nm6) arrayList.get(0)).a)) {
            arrayList.add((nm6) arrayList.remove(0));
        }
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(ko4 ko4Var) {
        qk2 d;
        boolean z;
        String str = ko4Var.t;
        if ("audio/eac3-joc".equals(str)) {
            if (!Objects.equals(Build.MANUFACTURER, "Google")) {
                return "audio/eac3";
            }
            return null;
        } else if (!"audio/vnd.dts.hd".equals(str) && !"audio/vnd.dts.uhd;profile=p2".equals(str)) {
            if ("video/dolby-vision".equals(str) && (d = rk2.d(ko4Var)) != null && (z = d.c)) {
                yve.p(z);
                int i = d.a;
                if (i != 16 && i != 256) {
                    if (i == 512) {
                        return "video/avc";
                    }
                    if (i == 1024) {
                        bm2 bm2Var = ko4Var.L;
                        if (bm2Var == null || bm2Var.c != 6 || bm2Var.b != 1) {
                            return "video/av01";
                        }
                        return null;
                    }
                } else {
                    return "video/hevc";
                }
            }
            if ("video/mv-hevc".equals(str)) {
                return "video/hevc";
            }
            return null;
        } else {
            return "audio/vnd.dts";
        }
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        } else if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (wm6.class) {
            sm6 sm6Var = new sm6(str, z, z2);
            HashMap hashMap = a;
            List list = (List) hashMap.get(sm6Var);
            if (list != null) {
                return list;
            }
            ArrayList f = f(sm6Var, new n31(z, z2, str.equals("video/mv-hevc")));
            if (z && f.isEmpty() && Build.VERSION.SDK_INT == 23) {
                f = f(sm6Var, new faf((byte) 21));
                if (!f.isEmpty()) {
                    efd.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((nm6) f.get(0)).a);
                }
            }
            a(str, f);
            po5 q = po5.q(f);
            hashMap.put(sm6Var, q);
            return q;
        }
    }

    public static java.util.ArrayList f(defpackage.sm6 r20, defpackage.um6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm6.f(sm6, um6):java.util.ArrayList");
    }

    public static j99 g(ko4 ko4Var, boolean z, boolean z2) {
        Iterable e;
        List e2 = e(ko4Var.t, z, z2);
        String c = c(ko4Var);
        if (c == null) {
            no5 no5Var = po5.b;
            e = j99.e;
        } else {
            e = e(c, z, z2);
        }
        mo5 p = po5.p();
        p.d(e2);
        p.d(e);
        return p.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z || !str.endsWith(".secure")) {
                int i = Build.VERSION.SDK_INT;
                if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                    String str3 = Build.DEVICE;
                    if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                        return false;
                    }
                }
                if (i != 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        return !j(mediaCodecInfo, str);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!eg7.i(str)) {
            String c = jrd.c(mediaCodecInfo.getName());
            if (!c.startsWith("arc.")) {
                if (!c.startsWith("omx.google.") && !c.startsWith("omx.ffmpeg.")) {
                    if ((!c.startsWith("omx.sec.") || !c.contains(".sw.")) && !c.equals("omx.qcom.video.decoder.hevcswvdec") && !c.startsWith("c2.android.") && !c.startsWith("c2.google.")) {
                        if (c.startsWith("omx.") || c.startsWith("c2.")) {
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
}
