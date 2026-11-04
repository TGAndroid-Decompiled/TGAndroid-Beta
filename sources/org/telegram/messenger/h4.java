package org.telegram.messenger;

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
public abstract class h4 {
    public static final List f22883a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint f22884b = new Paint(2);

    public static f4 a(String str, Integer num, Integer num2) {
        Pair c2;
        if (str != null && (c2 = c(str)) != null) {
            if (num == null) {
                num = (Integer) c2.first;
            }
            g4 g4Var = new g4(num.intValue(), 0);
            if (num2 == null) {
                num2 = (Integer) c2.second;
            }
            g4 g4Var2 = new g4(num2.intValue(), 1);
            ?? e6Var = new e6();
            e6Var.f22445c = g4Var;
            e6Var.d = g4Var2;
            return e6Var;
        }
        return null;
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        return f22883a.indexOf(str.substring(str.length() - 2));
    }

    public static Pair c(String str) {
        int i3;
        String[] split;
        int i10 = -1;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i3 = b(str);
                    if (i3 >= 0) {
                        i10 = i3;
                    }
                    split = str.split("\u200d");
                    if (split.length != 2 && split[0].startsWith("🫱") && split[1].startsWith("🫲")) {
                        if (split[0].length() == 2 || (split[0].length() == 4 && (i3 = b(split[0])) >= 0)) {
                            if (split[1].length() == 2 || (split[1].length() == 4 && (i10 = b(split[1])) >= 0)) {
                                return new Pair(Integer.valueOf(i3), Integer.valueOf(i10));
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
        i3 = -1;
        split = str.split("\u200d");
        return split.length != 2 ? null : null;
    }
}
