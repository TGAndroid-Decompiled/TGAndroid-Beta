package oe;

import a9.p;
import java.util.ArrayList;

public final class a {

    public String f19423a;

    public ArrayList f19424b;

    public ArrayList f19425c;
    public ArrayList d;

    public final String a(String str) {
        String str2;
        String strSubstring;
        String str3;
        String str4 = null;
        if (str.startsWith(this.f19423a)) {
            str3 = this.f19423a;
            strSubstring = str.substring(str3.length());
        } else {
            ArrayList arrayList = this.f19424b;
            int size = arrayList.size();
            int i10 = 0;
            do {
                if (i10 >= size) {
                    str2 = null;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                str2 = (String) obj;
            } while (!str.startsWith(str2));
            if (str2 != null) {
                strSubstring = str.substring(str2.length());
                str3 = null;
                str4 = str2;
            } else {
                strSubstring = str;
                str3 = null;
            }
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            String strA = ((d) obj2).a(strSubstring, str3, str4, true);
            if (strA != null) {
                return strA;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            String strA2 = ((d) obj3).a(strSubstring, str3, str4, false);
            if (strA2 != null) {
                return strA2;
            }
        }
        return (str3 == null || strSubstring.length() == 0) ? str : p.w(str3, " ", strSubstring);
    }
}
