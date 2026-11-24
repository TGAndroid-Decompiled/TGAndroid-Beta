package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class ub9 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public ub9(int i, String str, String... strArr) {
        this.a = i;
        this.b = str;
        this.c = Arrays.asList(strArr);
    }

    public static ArrayList a(String str) {
        String trim;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        if (trim.startsWith("/")) {
            trim = trim.substring(1);
        }
        String lowerCase = trim.toLowerCase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = d;
        if (arrayList2 == null) {
            ArrayList arrayList3 = new ArrayList();
            d = arrayList3;
            arrayList3.add(new ub9(2131231562, k96.M0(2131754027, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new ub9(2131231563, k96.M0(2131754026, null), "##", "/h2"));
            d.add(new ub9(2131231564, k96.M0(2131754025, null), "###", "/h3"));
            d.add(new ub9(2131231565, k96.M0(2131754024, null), "####", "/h4"));
            d.add(new ub9(2131231566, k96.M0(2131754023, null), "#####", "/h5"));
            d.add(new ub9(2131231567, k96.M0(2131754022, null), "######", "/h6"));
            d.add(new ub9(2131231584, k96.M0(2131753993, null), "|", "/quote"));
            d.add(new ub9(2131231583, k96.M0(2131753994, null), "/pullquote"));
            d.add(new ub9(2131231555, k96.M0(2131754052, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new ub9(2131231558, k96.M0(2131754029, null), "/footer"));
            d.add(new ub9(2131231568, k96.M0(2131754048, null), "-", "/list"));
            d.add(new ub9(2131231580, k96.M0(2131754045, null), "1."));
            d.add(new ub9(2131231601, k96.M0(2131754001, null), "[]", "/todo", "/checklist"));
            d.add(new ub9(2131231556, k96.M0(2131754043, null), ">", "/toggle", "/details"));
            d.add(new ub9(2131231552, k96.M0(2131745818, null), "/button"));
            d.add(new ub9(2131231588, k96.M0(2131754044, null), "/table"));
            d.add(new ub9(2131231573, k96.M0(2131754046, null), "/math", "/latex", "/expression"));
            d.add(new ub9(2131231557, k96.M0(2131754050, null), "---"));
            d.add(new ub9(2131231574, k96.M0(2131754049, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new ub9(2131231574, k96.M0(2131754042, null), "/video", "/vid", "/media"));
            d.add(new ub9(2131231550, k96.M0(2131754051, null), "/audio", "/music", "/media"));
            d.add(new ub9(2131231572, k96.M0(2131754047, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ub9 ub9Var = (ub9) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = ub9Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (split[i2].startsWith(lowerCase)) {
                            break;
                        }
                        i2++;
                    } else {
                        for (String str2 : ub9Var.c) {
                            String lowerCase2 = str2.toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                    }
                }
            }
            arrayList.add(ub9Var);
        }
        return arrayList;
    }
}
