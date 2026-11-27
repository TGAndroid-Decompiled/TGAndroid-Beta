package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class mh5 implements iy7 {
    public final jh5 a;
    public final fh5 b;
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

    public mh5(jh5 jh5Var, fh5 fh5Var) {
        this.a = jh5Var;
        this.b = fh5Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static hr3 b(String str, gr3[] gr3VarArr) {
        gr3[] gr3VarArr2 = new gr3[gr3VarArr.length];
        for (int i = 0; i < gr3VarArr.length; i++) {
            gr3 gr3Var = gr3VarArr[i];
            gr3VarArr2[i] = new gr3(gr3Var.b, gr3Var.c, gr3Var.d, null);
        }
        return new hr3(str, true, gr3VarArr2);
    }

    public static gr3 c(String str, String str2, HashMap hashMap, rr4 rr4Var) {
        String j = j(str, o0, "1", hashMap, rr4Var);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = p0;
        if (equals) {
            String k = k(str, pattern, hashMap, rr4Var);
            return new gr3(o51.e, null, "video/mp4", Base64.decode(k.substring(k.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = o51.e;
            String str3 = gcc.a;
            return new gr3(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        } else {
            String k2 = k(str, pattern, hashMap, rr4Var);
            byte[] decode = Base64.decode(k2.substring(k2.indexOf(44)), 0);
            UUID uuid2 = o51.f;
            return new gr3(uuid2, null, "video/mp4", lwe.a(uuid2, null, decode));
        }
    }

    public static defpackage.fh5 d(defpackage.jh5 r140, defpackage.fh5 r141, defpackage.pm3 r142, android.net.Uri r143, defpackage.rr4 r144) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh5.d(jh5, fh5, pm3, android.net.Uri, rr4):fh5");
    }

    public static defpackage.jh5 e(defpackage.pm3 r51, android.net.Uri r52, defpackage.rr4 r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh5.e(pm3, android.net.Uri, rr4):jh5");
    }

    public static boolean f(String str, Pattern pattern, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (b.find()) {
            return "YES".equals(b.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (b.find()) {
            String group = b.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d2;
    }

    public static int h(String str, Pattern pattern, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (b.find()) {
            String group = b.group(1);
            group.getClass();
            return Integer.parseInt(group);
        }
        return -1;
    }

    public static long i(String str, Pattern pattern, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (b.find()) {
            String group = b.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String j(String str, Pattern pattern, String str2, Map map, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (b.find()) {
            str2 = b.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map, rr4Var);
        }
        return str2;
    }

    public static String k(String str, Pattern pattern, Map map, rr4 rr4Var) {
        String j = j(str, pattern, null, map, rr4Var);
        if (j != null) {
            return j;
        }
        throw hy7.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(a1, str);
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
        throw hy7.b("duplicate variable name \"" + str + "\"", null);
    }

    @Override
    public final java.lang.Object I(android.net.Uri r8, defpackage.l73 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh5.I(android.net.Uri, l73):java.lang.Object");
    }
}
