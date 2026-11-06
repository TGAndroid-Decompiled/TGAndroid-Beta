package li;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.hd;
public final class l0 {
    public static ArrayList d;
    public final int f18676a;
    public final String f18677b;
    public final List f18678c;

    public l0(int i7, String str, String... strArr) {
        this.f18676a = i7;
        this.f18677b = str;
        this.f18678c = Arrays.asList(strArr);
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
            arrayList3.add(new l0(2131231558, hd.M0(2131754030, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new l0(2131231559, hd.M0(2131754029, null), "##", "/h2"));
            d.add(new l0(2131231560, hd.M0(2131754028, null), "###", "/h3"));
            d.add(new l0(2131231561, hd.M0(2131754027, null), "####", "/h4"));
            d.add(new l0(2131231562, hd.M0(2131754026, null), "#####", "/h5"));
            d.add(new l0(2131231563, hd.M0(2131754025, null), "######", "/h6"));
            d.add(new l0(2131231580, hd.M0(2131753996, null), "|", "/quote"));
            d.add(new l0(2131231579, hd.M0(2131753997, null), "/pullquote"));
            d.add(new l0(2131231551, hd.M0(2131754055, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new l0(2131231554, hd.M0(2131754032, null), "/footer"));
            d.add(new l0(2131231564, hd.M0(2131754051, null), "-", "/list"));
            d.add(new l0(2131231576, hd.M0(2131754048, null), "1."));
            d.add(new l0(2131231597, hd.M0(2131754004, null), "[]", "/todo", "/checklist"));
            d.add(new l0(2131231552, hd.M0(2131754046, null), ">", "/toggle", "/details"));
            d.add(new l0(2131231548, hd.M0(2131746012, null), "/button"));
            d.add(new l0(2131231584, hd.M0(2131754047, null), "/table"));
            d.add(new l0(2131231569, hd.M0(2131754049, null), "/math", "/latex", "/expression"));
            d.add(new l0(2131231553, hd.M0(2131754053, null), "---"));
            d.add(new l0(2131231570, hd.M0(2131754052, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new l0(2131231570, hd.M0(2131754045, null), "/video", "/vid", "/media"));
            d.add(new l0(2131231546, hd.M0(2131754054, null), "/audio", "/music", "/media"));
            d.add(new l0(2131231568, hd.M0(2131754050, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            l0 l0Var = (l0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = l0Var.f18677b.toLowerCase().split(" ");
                int length = split.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (split[i10].startsWith(lowerCase)) {
                            break;
                        }
                        i10++;
                    } else {
                        for (String str2 : l0Var.f18678c) {
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
            arrayList.add(l0Var);
        }
        return arrayList;
    }
}
