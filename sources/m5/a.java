package m5;

import c8.p9;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import l5.c;
import o5.k;
public final class a implements k {
    public static final String f19876c;
    public static final Set d;
    public static final a f19877e;
    public static final a f19878f;
    public final String f19879a;
    public final String f19880b;

    static {
        String a10 = p9.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f19876c = a10;
        String a11 = p9.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a12 = p9.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f19877e = new a(a10, null);
        f19878f = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f19879a = str;
        this.f19880b = str2;
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
