package defpackage;

import android.util.Base64;
import java.util.List;
public final class un4 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public un4(String str, String str2, String str3, List list) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = c00.j(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.a);
        sb.append(", mProviderPackage: ");
        sb.append(this.b);
        sb.append(", mQuery: ");
        StringBuilder sb2 = new StringBuilder(c00.k(sb, this.c, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.d;
            if (i < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
