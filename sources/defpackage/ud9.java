package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class ud9 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public ud9(int i, String str, String... strArr) {
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
            arrayList3.add(new ud9(2131231563, jb6.M0(2131753995, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new ud9(2131231564, jb6.M0(2131753994, null), "##", "/h2"));
            d.add(new ud9(2131231565, jb6.M0(2131753993, null), "###", "/h3"));
            d.add(new ud9(2131231566, jb6.M0(2131753992, null), "####", "/h4"));
            d.add(new ud9(2131231567, jb6.M0(2131753991, null), "#####", "/h5"));
            d.add(new ud9(2131231568, jb6.M0(2131753990, null), "######", "/h6"));
            d.add(new ud9(2131231585, jb6.M0(2131753961, null), "|", "/quote"));
            d.add(new ud9(2131231584, jb6.M0(2131753962, null), "/pullquote"));
            d.add(new ud9(2131231556, jb6.M0(2131754020, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new ud9(2131231559, jb6.M0(2131753997, null), "/footer"));
            d.add(new ud9(2131231569, jb6.M0(2131754016, null), "-", "/list"));
            d.add(new ud9(2131231581, jb6.M0(2131754013, null), "1."));
            d.add(new ud9(2131231602, jb6.M0(2131753969, null), "[]", "/todo", "/checklist"));
            d.add(new ud9(2131231557, jb6.M0(2131754011, null), ">", "/toggle", "/details"));
            d.add(new ud9(2131231553, jb6.M0(2131745744, null), "/button"));
            d.add(new ud9(2131231589, jb6.M0(2131754012, null), "/table"));
            d.add(new ud9(2131231574, jb6.M0(2131754014, null), "/math", "/latex", "/expression"));
            d.add(new ud9(2131231558, jb6.M0(2131754018, null), "---"));
            d.add(new ud9(2131231575, jb6.M0(2131754017, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new ud9(2131231575, jb6.M0(2131754010, null), "/video", "/vid", "/media"));
            d.add(new ud9(2131231551, jb6.M0(2131754019, null), "/audio", "/music", "/media"));
            d.add(new ud9(2131231573, jb6.M0(2131754015, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ud9 ud9Var = (ud9) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = ud9Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (split[i2].startsWith(lowerCase)) {
                            break;
                        }
                        i2++;
                    } else {
                        for (String str2 : ud9Var.c) {
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
            arrayList.add(ud9Var);
        }
        return arrayList;
    }
}
