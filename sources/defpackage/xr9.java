package defpackage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class xr9 {
    public static final Pattern c = Pattern.compile("[0-9]+");
    public int a;
    public ArrayList b;

    public final String a(String str, String str2, String str3, boolean z) {
        int i;
        int length = str.length();
        int i2 = this.a;
        if (length >= i2) {
            int i3 = 0;
            Matcher matcher = c.matcher(str.substring(0, i2));
            if (matcher.find()) {
                i = Integer.parseInt(matcher.group(0));
            } else {
                i = 0;
            }
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                g78 g78Var = (g78) obj;
                if (i >= g78Var.a && i <= g78Var.b && str.length() <= g78Var.c) {
                    if (z) {
                        int i5 = g78Var.d;
                        if (((i5 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i5 & 1) != 0) || (str2 != null && (i5 & 2) != 0))) {
                            return g78Var.a(str, str2, str3);
                        }
                    } else if (str3 == null) {
                        if (str2 == null) {
                            return g78Var.a(str, str2, str3);
                        }
                        if (str2 == null && (g78Var.d & 2) != 0) {
                            return g78Var.a(str, str2, str3);
                        }
                    } else {
                        if ((g78Var.d & 1) != 0) {
                            return g78Var.a(str, str2, str3);
                        }
                        if (str2 == null) {
                            continue;
                        } else {
                            return g78Var.a(str, str2, str3);
                        }
                    }
                }
            }
            if (!z) {
                if (str2 != null) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        g78 g78Var2 = (g78) obj2;
                        if (i >= g78Var2.a && i <= g78Var2.b && str.length() <= g78Var2.c && (str3 == null || (g78Var2.d & 1) != 0)) {
                            return g78Var2.a(str, str2, str3);
                        }
                    }
                    return null;
                } else if (str3 != null) {
                    ArrayList arrayList3 = this.b;
                    int size3 = arrayList3.size();
                    while (i3 < size3) {
                        Object obj3 = arrayList3.get(i3);
                        i3++;
                        g78 g78Var3 = (g78) obj3;
                        if (i >= g78Var3.a && i <= g78Var3.b && str.length() <= g78Var3.c && (str2 == null || (g78Var3.d & 2) != 0)) {
                            return g78Var3.a(str, str2, str3);
                        }
                    }
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
