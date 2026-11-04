package l5;

import b8.vd;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import n5.k;
public final class a implements k {
    public static final String f18035c;
    public static final Set d;
    public static final a f18036e;
    public static final a f18037f;
    public final String f18038a;
    public final String f18039b;

    static {
        String a10 = vd.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f18035c = a10;
        String a11 = vd.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a12 = vd.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new k5.c("proto"), new k5.c("json"))));
        f18036e = new a(a10, null);
        f18037f = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f18038a = str;
        this.f18039b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
