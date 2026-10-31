package org.telegram.messenger;

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
public abstract class k4 {
    public static final List f16523a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint f16524b = new Paint(2);

    public static i4 a(String str, Integer num, Integer num2) {
        Pair c10;
        if (str != null && (c10 = c(str)) != null) {
            if (num == null) {
                num = (Integer) c10.first;
            }
            j4 j4Var = new j4(num.intValue(), 0);
            if (num2 == null) {
                num2 = (Integer) c10.second;
            }
            j4 j4Var2 = new j4(num2.intValue(), 1);
            ?? g6Var = new g6();
            g6Var.f16050c = j4Var;
            g6Var.d = j4Var2;
            return g6Var;
        }
        return null;
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        return f16523a.indexOf(str.substring(str.length() - 2));
    }

    public static Pair c(String str) {
        int i10;
        String[] split;
        int i11 = -1;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i10 = b(str);
                    if (i10 >= 0) {
                        i11 = i10;
                    }
                    split = str.split("\u200d");
                    if (split.length != 2 && split[0].startsWith("🫱") && split[1].startsWith("🫲")) {
                        if (split[0].length() == 2 || (split[0].length() == 4 && (i10 = b(split[0])) >= 0)) {
                            if (split[1].length() == 2 || (split[1].length() == 4 && (i11 = b(split[1])) >= 0)) {
                                return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
            }
            return new Pair(Integer.valueOf(i11), Integer.valueOf(i11));
        }
        i10 = -1;
        split = str.split("\u200d");
        return split.length != 2 ? null : null;
    }
}
