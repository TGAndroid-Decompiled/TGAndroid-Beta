package k5;

import a8.md;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import m5.l;
public final class a implements l {
    public static final String f16384c;
    public static final Set d;
    public static final a e;
    public static final a f16385f;
    public final String f16386a;
    public final String f16387b;

    static {
        String a2 = md.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f16384c = a2;
        String a10 = md.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a11 = md.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new j5.c("proto"), new j5.c("json"))));
        e = new a(a2, null);
        f16385f = new a(a10, a11);
    }

    public a(String str, String str2) {
        this.f16386a = str;
        this.f16387b = str2;
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
