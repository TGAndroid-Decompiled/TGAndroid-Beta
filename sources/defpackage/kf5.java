package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class kf5 implements bv7 {
    public final hf5 a;
    public final df5 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern s = Pattern.compile("SAMPLE-RATE=(\\d+)\\b");
    public static final Pattern w = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern x = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern y = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern E = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern I = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern K = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("SCORE=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("SERVER-URI=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern P = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Q = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern R = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern S = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern T = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern U = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern V = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern W = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern X = a("CAN-SKIP-DATERANGES");
    public static final Pattern Y = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern a0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern b0 = a("CAN-BLOCK-RELOAD");
    public static final Pattern c0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern d0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern e0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern f0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern g0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern h0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern i0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern j0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern k0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern l0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern m0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern n0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern o0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern p0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern r0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern s0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern t0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern z0 = a("AUTOSELECT");
    public static final Pattern A0 = a("DEFAULT");
    public static final Pattern B0 = a("FORCED");
    public static final Pattern C0 = a("INDEPENDENT");
    public static final Pattern D0 = a("GAP");
    public static final Pattern E0 = a("PRECISE");
    public static final Pattern F0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern K0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern N0 = a("END-ON-NEXT");
    public static final Pattern O0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern R0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern S0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern V0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern W0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern X0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern Y0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern Z0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern a1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern b1 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public kf5(hf5 hf5Var, df5 df5Var) {
        this.a = hf5Var;
        this.b = df5Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static qq3 b(String str, pq3[] pq3VarArr) {
        pq3[] pq3VarArr2 = new pq3[pq3VarArr.length];
        for (int i = 0; i < pq3VarArr.length; i++) {
            pq3 pq3Var = pq3VarArr[i];
            pq3VarArr2[i] = new pq3(pq3Var.b, pq3Var.c, pq3Var.d, null);
        }
        return new qq3(str, true, pq3VarArr2);
    }

    public static pq3 c(String str, String str2, HashMap hashMap, np4 np4Var) {
        String j = j(str, o0, "1", hashMap, np4Var);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = p0;
        if (equals) {
            String k = k(str, pattern, hashMap, np4Var);
            return new pq3(g51.e, null, "video/mp4", Base64.decode(k.substring(k.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = g51.e;
            String str3 = g8c.a;
            return new pq3(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        } else {
            String k2 = k(str, pattern, hashMap, np4Var);
            byte[] decode = Base64.decode(k2.substring(k2.indexOf(44)), 0);
            UUID uuid2 = g51.f;
            return new pq3(uuid2, null, "video/mp4", tre.a(uuid2, null, decode));
        }
    }

    public static defpackage.df5 d(defpackage.hf5 r140, defpackage.df5 r141, defpackage.xl3 r142, android.net.Uri r143, defpackage.np4 r144) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf5.d(hf5, df5, xl3, android.net.Uri, np4):df5");
    }

    public static defpackage.hf5 e(defpackage.xl3 r51, android.net.Uri r52, defpackage.np4 r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf5.e(xl3, android.net.Uri, np4):hf5");
    }

    public static boolean f(String str, Pattern pattern, np4 np4Var) {
        int i = np4.b;
        Matcher b = np4Var.b(pattern, str);
        if (b.find()) {
            return "YES".equals(b.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2, np4 np4Var) {
        int i = np4.b;
        Matcher b = np4Var.b(pattern, str);
        if (b.find()) {
            String group = b.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d2;
    }

    public static int h(String str, Pattern pattern, np4 np4Var) {
        int i = np4.b;
        Matcher b = np4Var.b(pattern, str);
        if (b.find()) {
            String group = b.group(1);
            group.getClass();
            return Integer.parseInt(group);
        }
        return -1;
    }

    public static long i(String str, Pattern pattern, np4 np4Var) {
        int i = np4.b;
        Matcher b = np4Var.b(pattern, str);
        if (b.find()) {
            String group = b.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String j(String str, Pattern pattern, String str2, Map map, np4 np4Var) {
        int i = np4.b;
        Matcher b = np4Var.b(pattern, str);
        if (b.find()) {
            str2 = b.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map, np4Var);
        }
        return str2;
    }

    public static String k(String str, Pattern pattern, Map map, np4 np4Var) {
        String j = j(str, pattern, null, map, np4Var);
        if (j != null) {
            return j;
        }
        throw av7.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map, np4 np4Var) {
        int i = np4.b;
        Matcher b = np4Var.b(a1, str);
        StringBuffer stringBuffer = new StringBuffer();
        while (b.find()) {
            String group = b.group(1);
            if (map.containsKey(group)) {
                b.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        b.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void m(String str, HashMap hashMap) {
        if (!hashMap.containsKey(str)) {
            return;
        }
        throw av7.b("duplicate variable name \"" + str + "\"", null);
    }

    @Override
    public final java.lang.Object v(android.net.Uri r8, defpackage.s63 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf5.v(android.net.Uri, s63):java.lang.Object");
    }
}
