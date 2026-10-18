package o0;

import android.util.Base64;
import java.util.List;
public final class d {
    public final String f17518a;
    public final String f17519b;
    public final String f17520c;
    public final List d;
    public final String e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f17518a = str;
        str2.getClass();
        this.f17519b = str2;
        this.f17520c = str3;
        list.getClass();
        this.d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f17518a + ", mProviderPackage: " + this.f17519b + ", mQuery: " + this.f17520c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.d;
            if (i10 < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i10);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i10++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
