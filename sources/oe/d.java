package oe;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d {

    public static final Pattern f19438c = Pattern.compile("[0-9]+");

    public int f19439a;

    public ArrayList f19440b;

    public final String a(String str, String str2, String str3, boolean z10) {
        int length = str.length();
        int i10 = this.f19439a;
        if (length < i10) {
            return null;
        }
        int i11 = 0;
        Matcher matcher = f19438c.matcher(str.substring(0, i10));
        int i12 = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
        ArrayList arrayList = this.f19440b;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            c cVar = (c) obj;
            if (i12 >= cVar.f19434a && i12 <= cVar.f19435b && str.length() <= cVar.f19436c) {
                if (z10) {
                    int i14 = cVar.d;
                    if (((i14 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i14 & 1) != 0) || (str2 != null && (i14 & 2) != 0))) {
                        return cVar.a(str, str2, str3);
                    }
                } else if ((str3 == null && str2 == null) || ((str3 != null && (cVar.d & 1) != 0) || (str2 != null && (cVar.d & 2) != 0))) {
                    return cVar.a(str, str2, str3);
                }
            }
        }
        if (z10) {
            return null;
        }
        if (str2 != null) {
            ArrayList arrayList2 = this.f19440b;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                c cVar2 = (c) obj2;
                if (i12 >= cVar2.f19434a && i12 <= cVar2.f19435b && str.length() <= cVar2.f19436c && (str3 == null || (cVar2.d & 1) != 0)) {
                    return cVar2.a(str, str2, str3);
                }
            }
            return null;
        }
        if (str3 == null) {
            return null;
        }
        ArrayList arrayList3 = this.f19440b;
        int size3 = arrayList3.size();
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            c cVar3 = (c) obj3;
            if (i12 >= cVar3.f19434a && i12 <= cVar3.f19435b && str.length() <= cVar3.f19436c && (str2 == null || (cVar3.d & 2) != 0)) {
                return cVar3.a(str, str2, str3);
            }
        }
        return null;
    }
}
