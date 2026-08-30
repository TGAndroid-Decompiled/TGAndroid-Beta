package o0;

import android.util.Base64;
import java.util.List;
public final class d {
    public final String f16153a;
    public final String f16154b;
    public final String f16155c;
    public final List d;
    public final String e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f16153a = str;
        str2.getClass();
        this.f16154b = str2;
        this.f16155c = str3;
        list.getClass();
        this.d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f16153a + ", mProviderPackage: " + this.f16154b + ", mQuery: " + this.f16155c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.d;
            if (i10 < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i10);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i10++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
