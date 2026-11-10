package o0;

import android.util.Base64;
import java.util.List;
public final class d {
    public final String f20683a;
    public final String f20684b;
    public final String f20685c;
    public final List d;
    public final String f20686e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f20683a = str;
        str2.getClass();
        this.f20684b = str2;
        this.f20685c = str3;
        list.getClass();
        this.d = list;
        this.f20686e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f20683a + ", mProviderPackage: " + this.f20684b + ", mQuery: " + this.f20685c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.d;
            if (i7 < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i7);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i7++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
