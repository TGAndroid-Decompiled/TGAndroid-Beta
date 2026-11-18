package oi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.gd;
public final class j0 {
    public static ArrayList d;
    public final int f22115a;
    public final String f22116b;
    public final List f22117c;

    public j0(int i7, String str, String... strArr) {
        this.f22115a = i7;
        this.f22116b = str;
        this.f22117c = Arrays.asList(strArr);
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
            arrayList3.add(new j0(2131231559, gd.M0(2131754028, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new j0(2131231560, gd.M0(2131754027, null), "##", "/h2"));
            d.add(new j0(2131231561, gd.M0(2131754026, null), "###", "/h3"));
            d.add(new j0(2131231562, gd.M0(2131754025, null), "####", "/h4"));
            d.add(new j0(2131231563, gd.M0(2131754024, null), "#####", "/h5"));
            d.add(new j0(2131231564, gd.M0(2131754023, null), "######", "/h6"));
            d.add(new j0(2131231581, gd.M0(2131753994, null), "|", "/quote"));
            d.add(new j0(2131231580, gd.M0(2131753995, null), "/pullquote"));
            d.add(new j0(2131231552, gd.M0(2131754053, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new j0(2131231555, gd.M0(2131754030, null), "/footer"));
            d.add(new j0(2131231565, gd.M0(2131754049, null), "-", "/list"));
            d.add(new j0(2131231577, gd.M0(2131754046, null), "1."));
            d.add(new j0(2131231598, gd.M0(2131754002, null), "[]", "/todo", "/checklist"));
            d.add(new j0(2131231553, gd.M0(2131754044, null), ">", "/toggle", "/details"));
            d.add(new j0(2131231549, gd.M0(2131745816, null), "/button"));
            d.add(new j0(2131231585, gd.M0(2131754045, null), "/table"));
            d.add(new j0(2131231570, gd.M0(2131754047, null), "/math", "/latex", "/expression"));
            d.add(new j0(2131231554, gd.M0(2131754051, null), "---"));
            d.add(new j0(2131231571, gd.M0(2131754050, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new j0(2131231571, gd.M0(2131754043, null), "/video", "/vid", "/media"));
            d.add(new j0(2131231547, gd.M0(2131754052, null), "/audio", "/music", "/media"));
            d.add(new j0(2131231569, gd.M0(2131754048, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            j0 j0Var = (j0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = j0Var.f22116b.toLowerCase().split(" ");
                int length = split.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (split[i10].startsWith(lowerCase)) {
                            break;
                        }
                        i10++;
                    } else {
                        for (String str2 : j0Var.f22117c) {
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
            arrayList.add(j0Var);
        }
        return arrayList;
    }
}
