package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public final class p61 {
    public static final String c;
    public static final Set d;
    public static final p61 e;
    public static final p61 f;
    public final String a;
    public final String b;

    static {
        String a = owe.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a;
        String a2 = owe.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a3 = owe.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new d44("proto"), new d44("json"))));
        e = new p61(a, null);
        f = new p61(a2, a3);
    }

    public p61(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static p61 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        String str2 = null;
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split("\\Q\\\\E", 2);
            if (split.length == 2) {
                String str3 = split[0];
                if (!str3.isEmpty()) {
                    String str4 = split[1];
                    if (!str4.isEmpty()) {
                        str2 = str4;
                    }
                    return new p61(str3, str2);
                }
                u36.j("Missing endpoint in CCTDestination extras");
                return null;
            }
            u36.j("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        u36.j("Version marker missing from extras");
        return null;
    }
}
