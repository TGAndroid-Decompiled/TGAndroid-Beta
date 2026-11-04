package mi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.bd;
public final class m0 {
    public static ArrayList d;
    public final int f19739a;
    public final String f19740b;
    public final List f19741c;

    public m0(int i3, String str, String... strArr) {
        this.f19739a = i3;
        this.f19740b = str;
        this.f19741c = Arrays.asList(strArr);
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
            arrayList3.add(new m0(2131231558, bd.M0(2131754030, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new m0(2131231559, bd.M0(2131754029, null), "##", "/h2"));
            d.add(new m0(2131231560, bd.M0(2131754028, null), "###", "/h3"));
            d.add(new m0(2131231561, bd.M0(2131754027, null), "####", "/h4"));
            d.add(new m0(2131231562, bd.M0(2131754026, null), "#####", "/h5"));
            d.add(new m0(2131231563, bd.M0(2131754025, null), "######", "/h6"));
            d.add(new m0(2131231580, bd.M0(2131753996, null), "|", "/quote"));
            d.add(new m0(2131231579, bd.M0(2131753997, null), "/pullquote"));
            d.add(new m0(2131231551, bd.M0(2131754055, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new m0(2131231554, bd.M0(2131754032, null), "/footer"));
            d.add(new m0(2131231564, bd.M0(2131754051, null), "-", "/list"));
            d.add(new m0(2131231576, bd.M0(2131754048, null), "1."));
            d.add(new m0(2131231597, bd.M0(2131754004, null), "[]", "/todo", "/checklist"));
            d.add(new m0(2131231552, bd.M0(2131754046, null), ">", "/toggle", "/details"));
            d.add(new m0(2131231548, bd.M0(2131746021, null), "/button"));
            d.add(new m0(2131231584, bd.M0(2131754047, null), "/table"));
            d.add(new m0(2131231569, bd.M0(2131754049, null), "/math", "/latex", "/expression"));
            d.add(new m0(2131231553, bd.M0(2131754053, null), "---"));
            d.add(new m0(2131231570, bd.M0(2131754052, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new m0(2131231570, bd.M0(2131754045, null), "/video", "/vid", "/media"));
            d.add(new m0(2131231546, bd.M0(2131754054, null), "/audio", "/music", "/media"));
            d.add(new m0(2131231568, bd.M0(2131754050, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            m0 m0Var = (m0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = m0Var.f19740b.toLowerCase().split(" ");
                int length = split.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (split[i10].startsWith(lowerCase)) {
                            break;
                        }
                        i10++;
                    } else {
                        for (String str2 : m0Var.f19741c) {
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
            arrayList.add(m0Var);
        }
        return arrayList;
    }
}
