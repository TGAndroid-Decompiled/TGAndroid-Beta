package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Comparator {
    public final int f19397a;
    public final Collator f19398b;

    public x4(Collator collator, int i10) {
        this.f19397a = i10;
        this.f19398b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str;
        String m10;
        switch (this.f19397a) {
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
                return this.f19398b.compare(str2, str3);
            case 1:
                f5 f5Var = (f5) obj;
                f5 f5Var2 = (f5) obj2;
                String str4 = f5Var.f15697i;
                if (str4.length() == 0) {
                    str4 = f5Var.f15698j;
                }
                String str5 = f5Var2.f15697i;
                if (str5.length() == 0) {
                    str5 = f5Var2.f15698j;
                }
                return this.f19398b.compare(str4, str5);
            case 2:
                String str6 = "";
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    str = i5.m(0, user.first_name, user.last_name);
                } else if (!(obj instanceof f5)) {
                    str = "";
                } else {
                    f5 f5Var3 = (f5) obj;
                    TLRPC.User user2 = f5Var3.f15701m;
                    if (user2 != null) {
                        str = i5.m(0, user2.first_name, user2.last_name);
                    } else {
                        str = i5.m(0, f5Var3.f15697i, f5Var3.f15698j);
                    }
                }
                if (obj2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) obj2;
                    str6 = i5.m(0, user3.first_name, user3.last_name);
                } else if (obj2 instanceof f5) {
                    f5 f5Var4 = (f5) obj2;
                    TLRPC.User user4 = f5Var4.f15701m;
                    if (user4 != null) {
                        m10 = i5.m(0, user4.first_name, user4.last_name);
                    } else {
                        m10 = i5.m(0, f5Var4.f15697i, f5Var4.f15698j);
                    }
                    str6 = m10;
                }
                return this.f19398b.compare(str, str6);
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
                return this.f19398b.compare(str7, str8);
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
                return this.f19398b.compare(str9, str10);
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
                return this.f19398b.compare(str11, str12);
        }
    }
}
