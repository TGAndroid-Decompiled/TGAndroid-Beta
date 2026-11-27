package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public final class q51 {
    public static final String c;
    public static final Set d;
    public static final q51 e;
    public static final q51 f;
    public final String a;
    public final String b;

    static {
        String a = eze.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a;
        String a2 = eze.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a3 = eze.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new n34("proto"), new n34("json"))));
        e = new q51(a, null);
        f = new q51(a2, a3);
    }

    public q51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static q51 a(byte[] bArr) {
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
                    return new q51(str3, str2);
                }
                lq5.j("Missing endpoint in CCTDestination extras");
                return null;
            }
            lq5.j("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        lq5.j("Version marker missing from extras");
        return null;
    }
}
