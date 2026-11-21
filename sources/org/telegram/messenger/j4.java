package org.telegram.messenger;

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
public abstract class j4 {
    public static final List f24834a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint f24835b = new Paint(2);

    public static h4 a(String str, Integer num, Integer num2) {
        Pair c10;
        if (str != null && (c10 = c(str)) != null) {
            if (num == null) {
                num = (Integer) c10.first;
            }
            i4 i4Var = new i4(num.intValue(), 0);
            if (num2 == null) {
                num2 = (Integer) c10.second;
            }
            i4 i4Var2 = new i4(num2.intValue(), 1);
            ?? f6Var = new f6();
            f6Var.f24410c = i4Var;
            f6Var.d = i4Var2;
            return f6Var;
        }
        return null;
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        return f24834a.indexOf(str.substring(str.length() - 2));
    }

    public static Pair c(String str) {
        int i7;
        String[] split;
        int i10 = -1;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i7 = b(str);
                    if (i7 >= 0) {
                        i10 = i7;
                    }
                    split = str.split("\u200d");
                    if (split.length != 2 && split[0].startsWith("🫱") && split[1].startsWith("🫲")) {
                        if (split[0].length() == 2 || (split[0].length() == 4 && (i7 = b(split[0])) >= 0)) {
                            if (split[1].length() == 2 || (split[1].length() == 4 && (i10 = b(split[1])) >= 0)) {
                                return new Pair(Integer.valueOf(i7), Integer.valueOf(i10));
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
            }
            return new Pair(Integer.valueOf(i10), Integer.valueOf(i10));
        }
        i7 = -1;
        split = str.split("\u200d");
        return split.length != 2 ? null : null;
    }
}
