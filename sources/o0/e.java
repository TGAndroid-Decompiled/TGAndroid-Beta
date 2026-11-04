package o0;

import android.util.Base64;
import java.util.List;
public final class e {
    public final String f20481a;
    public final String f20482b;
    public final String f20483c;
    public final List d;
    public final String f20484e;

    public e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f20481a = str;
        str2.getClass();
        this.f20482b = str2;
        this.f20483c = str3;
        list.getClass();
        this.d = list;
        this.f20484e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f20481a + ", mProviderPackage: " + this.f20482b + ", mQuery: " + this.f20483c + ", mCertificates:");
        int i3 = 0;
        while (true) {
            List list = this.d;
            if (i3 < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i3);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i3++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
