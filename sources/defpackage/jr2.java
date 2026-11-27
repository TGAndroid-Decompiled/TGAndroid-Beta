package defpackage;

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
public abstract class jr2 {
    public static final List a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint b = new Paint(2);

    public static hr2 a(String str, Integer num, Integer num2) {
        Pair c;
        if (str != null && (c = c(str)) != null) {
            if (num == null) {
                num = (Integer) c.first;
            }
            ir2 ir2Var = new ir2(num.intValue(), 0);
            if (num2 == null) {
                num2 = (Integer) c.second;
            }
            ir2 ir2Var2 = new ir2(num2.intValue(), 1);
            ?? lv3Var = new lv3();
            lv3Var.c = ir2Var;
            lv3Var.d = ir2Var2;
            return lv3Var;
        }
        return null;
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        return a.indexOf(str.substring(str.length() - 2));
    }

    public static Pair c(String str) {
        int i;
        String[] split;
        int i2 = -1;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i = b(str);
                    if (i >= 0) {
                        i2 = i;
                    }
                    split = str.split("\u200d");
                    if (split.length != 2 && split[0].startsWith("🫱") && split[1].startsWith("🫲")) {
                        if (split[0].length() == 2 || (split[0].length() == 4 && (i = b(split[0])) >= 0)) {
                            if (split[1].length() == 2 || (split[1].length() == 4 && (i2 = b(split[1])) >= 0)) {
                                return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
            }
            return new Pair(Integer.valueOf(i2), Integer.valueOf(i2));
        }
        i = -1;
        split = str.split("\u200d");
        return split.length != 2 ? null : null;
    }
}
