package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class kf9 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public kf9(int i, String str, String... strArr) {
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
            arrayList3.add(new kf9(2131231562, ob6.M0(2131754023, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new kf9(2131231563, ob6.M0(2131754022, null), "##", "/h2"));
            d.add(new kf9(2131231564, ob6.M0(2131754021, null), "###", "/h3"));
            d.add(new kf9(2131231565, ob6.M0(2131754020, null), "####", "/h4"));
            d.add(new kf9(2131231566, ob6.M0(2131754019, null), "#####", "/h5"));
            d.add(new kf9(2131231567, ob6.M0(2131754018, null), "######", "/h6"));
            d.add(new kf9(2131231584, ob6.M0(2131753989, null), "|", "/quote"));
            d.add(new kf9(2131231583, ob6.M0(2131753990, null), "/pullquote"));
            d.add(new kf9(2131231555, ob6.M0(2131754048, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new kf9(2131231558, ob6.M0(2131754025, null), "/footer"));
            d.add(new kf9(2131231568, ob6.M0(2131754044, null), "-", "/list"));
            d.add(new kf9(2131231580, ob6.M0(2131754041, null), "1."));
            d.add(new kf9(2131231601, ob6.M0(2131753997, null), "[]", "/todo", "/checklist"));
            d.add(new kf9(2131231556, ob6.M0(2131754039, null), ">", "/toggle", "/details"));
            d.add(new kf9(2131231552, ob6.M0(2131745738, null), "/button"));
            d.add(new kf9(2131231588, ob6.M0(2131754040, null), "/table"));
            d.add(new kf9(2131231573, ob6.M0(2131754042, null), "/math", "/latex", "/expression"));
            d.add(new kf9(2131231557, ob6.M0(2131754046, null), "---"));
            d.add(new kf9(2131231574, ob6.M0(2131754045, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new kf9(2131231574, ob6.M0(2131754038, null), "/video", "/vid", "/media"));
            d.add(new kf9(2131231550, ob6.M0(2131754047, null), "/audio", "/music", "/media"));
            d.add(new kf9(2131231572, ob6.M0(2131754043, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            kf9 kf9Var = (kf9) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = kf9Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (split[i2].startsWith(lowerCase)) {
                            break;
                        }
                        i2++;
                    } else {
                        for (String str2 : kf9Var.c) {
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
            arrayList.add(kf9Var);
        }
        return arrayList;
    }
}
