package o0;

import android.util.Base64;
import java.util.List;
public final class d {
    public final String f18750a;
    public final String f18751b;
    public final String f18752c;
    public final List d;
    public final String f18753e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f18750a = str;
        str2.getClass();
        this.f18751b = str2;
        this.f18752c = str3;
        list.getClass();
        this.d = list;
        this.f18753e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f18750a + ", mProviderPackage: " + this.f18751b + ", mQuery: " + this.f18752c + ", mCertificates:");
        int i9 = 0;
        while (true) {
            List list = this.d;
            if (i9 < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i9);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i9++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
