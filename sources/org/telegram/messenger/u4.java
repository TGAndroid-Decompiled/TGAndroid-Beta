package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class u4 implements Comparator {
    public final int f25716a;
    public final Collator f25717b;

    public u4(Collator collator, int i7) {
        this.f25716a = i7;
        this.f25717b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str;
        String m10;
        switch (this.f25716a) {
            case 0:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                char charAt = str2.charAt(0);
                char charAt2 = str3.charAt(0);
                if (charAt == '#') {
                    return 1;
                }
                if (charAt2 == '#') {
                    return -1;
                }
                return this.f25717b.compare(str2, str3);
            case 1:
                d5 d5Var = (d5) obj;
                d5 d5Var2 = (d5) obj2;
                String str4 = d5Var.f21962i;
                if (str4.length() == 0) {
                    str4 = d5Var.f21963j;
                }
                String str5 = d5Var2.f21962i;
                if (str5.length() == 0) {
                    str5 = d5Var2.f21963j;
                }
                return this.f25717b.compare(str4, str5);
            case 2:
                String str6 = "";
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    str = g5.m(0, user.first_name, user.last_name);
                } else if (!(obj instanceof d5)) {
                    str = "";
                } else {
                    d5 d5Var3 = (d5) obj;
                    TLRPC.User user2 = d5Var3.f21966m;
                    if (user2 != null) {
                        str = g5.m(0, user2.first_name, user2.last_name);
                    } else {
                        str = g5.m(0, d5Var3.f21962i, d5Var3.f21963j);
                    }
                }
                if (obj2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) obj2;
                    str6 = g5.m(0, user3.first_name, user3.last_name);
                } else if (obj2 instanceof d5) {
                    d5 d5Var4 = (d5) obj2;
                    TLRPC.User user4 = d5Var4.f21966m;
                    if (user4 != null) {
                        m10 = g5.m(0, user4.first_name, user4.last_name);
                    } else {
                        m10 = g5.m(0, d5Var4.f21962i, d5Var4.f21963j);
                    }
                    str6 = m10;
                }
                return this.f25717b.compare(str, str6);
            case 3:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                char charAt3 = str7.charAt(0);
                char charAt4 = str8.charAt(0);
                if (charAt3 == '#') {
                    return 1;
                }
                if (charAt4 == '#') {
                    return -1;
                }
                return this.f25717b.compare(str7, str8);
            case 4:
                String str9 = (String) obj;
                String str10 = (String) obj2;
                char charAt5 = str9.charAt(0);
                char charAt6 = str10.charAt(0);
                if (charAt5 == '#') {
                    return 1;
                }
                if (charAt6 == '#') {
                    return -1;
                }
                return this.f25717b.compare(str9, str10);
            default:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                char charAt7 = str11.charAt(0);
                char charAt8 = str12.charAt(0);
                if (charAt7 == '#') {
                    return 1;
                }
                if (charAt8 == '#') {
                    return -1;
                }
                return this.f25717b.compare(str11, str12);
        }
    }
}
