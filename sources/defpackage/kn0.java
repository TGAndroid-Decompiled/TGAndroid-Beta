package defpackage;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class kn0 implements Comparator {
    public final byte a;
    public final Collator b;

    public kn0(Collator collator, byte b) {
        this.a = b;
        this.b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String str;
        String m;
        byte b = this.a;
        Collator collator = this.b;
        switch (b) {
            case 0:
                return collator.compare((String) obj, (String) obj2);
            case 1:
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
                return collator.compare(str2, str3);
            case 2:
                iv2 iv2Var = (iv2) obj;
                iv2 iv2Var2 = (iv2) obj2;
                String str4 = iv2Var.i;
                if (str4.length() == 0) {
                    str4 = iv2Var.j;
                }
                String str5 = iv2Var2.i;
                if (str5.length() == 0) {
                    str5 = iv2Var2.j;
                }
                return collator.compare(str4, str5);
            case 3:
                String str6 = "";
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    str = lv2.m(0, user.first_name, user.last_name);
                } else if (!(obj instanceof iv2)) {
                    str = "";
                } else {
                    iv2 iv2Var3 = (iv2) obj;
                    TLRPC.User user2 = iv2Var3.m;
                    if (user2 != null) {
                        str = lv2.m(0, user2.first_name, user2.last_name);
                    } else {
                        str = lv2.m(0, iv2Var3.i, iv2Var3.j);
                    }
                }
                if (obj2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) obj2;
                    str6 = lv2.m(0, user3.first_name, user3.last_name);
                } else if (obj2 instanceof iv2) {
                    iv2 iv2Var4 = (iv2) obj2;
                    TLRPC.User user4 = iv2Var4.m;
                    if (user4 != null) {
                        m = lv2.m(0, user4.first_name, user4.last_name);
                    } else {
                        m = lv2.m(0, iv2Var4.i, iv2Var4.j);
                    }
                    str6 = m;
                }
                return collator.compare(str, str6);
            case 4:
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
                return collator.compare(str7, str8);
            case 5:
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
                return collator.compare(str9, str10);
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
                return collator.compare(str11, str12);
        }
    }
}
