package oi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.hd;
public final class j0 {
    public static ArrayList d;
    public final int f22141a;
    public final String f22142b;
    public final List f22143c;

    public j0(int i7, String str, String... strArr) {
        this.f22141a = i7;
        this.f22142b = str;
        this.f22143c = Arrays.asList(strArr);
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
            arrayList3.add(new j0(2131231559, hd.N0(2131754027, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new j0(2131231560, hd.N0(2131754026, null), "##", "/h2"));
            d.add(new j0(2131231561, hd.N0(2131754025, null), "###", "/h3"));
            d.add(new j0(2131231562, hd.N0(2131754024, null), "####", "/h4"));
            d.add(new j0(2131231563, hd.N0(2131754023, null), "#####", "/h5"));
            d.add(new j0(2131231564, hd.N0(2131754022, null), "######", "/h6"));
            d.add(new j0(2131231581, hd.N0(2131753993, null), "|", "/quote"));
            d.add(new j0(2131231580, hd.N0(2131753994, null), "/pullquote"));
            d.add(new j0(2131231552, hd.N0(2131754052, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new j0(2131231555, hd.N0(2131754029, null), "/footer"));
            d.add(new j0(2131231565, hd.N0(2131754048, null), "-", "/list"));
            d.add(new j0(2131231577, hd.N0(2131754045, null), "1."));
            d.add(new j0(2131231598, hd.N0(2131754001, null), "[]", "/todo", "/checklist"));
            d.add(new j0(2131231553, hd.N0(2131754043, null), ">", "/toggle", "/details"));
            d.add(new j0(2131231549, hd.N0(2131745815, null), "/button"));
            d.add(new j0(2131231585, hd.N0(2131754044, null), "/table"));
            d.add(new j0(2131231570, hd.N0(2131754046, null), "/math", "/latex", "/expression"));
            d.add(new j0(2131231554, hd.N0(2131754050, null), "---"));
            d.add(new j0(2131231571, hd.N0(2131754049, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new j0(2131231571, hd.N0(2131754042, null), "/video", "/vid", "/media"));
            d.add(new j0(2131231547, hd.N0(2131754051, null), "/audio", "/music", "/media"));
            d.add(new j0(2131231569, hd.N0(2131754047, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            j0 j0Var = (j0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = j0Var.f22142b.toLowerCase().split(" ");
                int length = split.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (split[i10].startsWith(lowerCase)) {
                            break;
                        }
                        i10++;
                    } else {
                        for (String str2 : j0Var.f22143c) {
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
