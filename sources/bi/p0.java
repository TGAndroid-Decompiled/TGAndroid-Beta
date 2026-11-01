package bi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.dd;
public final class p0 {
    public static ArrayList d;
    public final int f3272a;
    public final String f3273b;
    public final List f3274c;

    public p0(int i10, String str, String... strArr) {
        this.f3272a = i10;
        this.f3273b = str;
        this.f3274c = Arrays.asList(strArr);
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
            arrayList3.add(new p0(2131231559, dd.L0(2131754030, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new p0(2131231560, dd.L0(2131754029, null), "##", "/h2"));
            d.add(new p0(2131231561, dd.L0(2131754028, null), "###", "/h3"));
            d.add(new p0(2131231562, dd.L0(2131754027, null), "####", "/h4"));
            d.add(new p0(2131231563, dd.L0(2131754026, null), "#####", "/h5"));
            d.add(new p0(2131231564, dd.L0(2131754025, null), "######", "/h6"));
            d.add(new p0(2131231581, dd.L0(2131753996, null), "|", "/quote"));
            d.add(new p0(2131231580, dd.L0(2131753997, null), "/pullquote"));
            d.add(new p0(2131231552, dd.L0(2131754055, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new p0(2131231555, dd.L0(2131754032, null), "/footer"));
            d.add(new p0(2131231565, dd.L0(2131754051, null), "-", "/list"));
            d.add(new p0(2131231577, dd.L0(2131754048, null), "1."));
            d.add(new p0(2131231598, dd.L0(2131754004, null), "[]", "/todo", "/checklist"));
            d.add(new p0(2131231553, dd.L0(2131754046, null), ">", "/toggle", "/details"));
            d.add(new p0(2131231549, dd.L0(2131746028, null), "/button"));
            d.add(new p0(2131231585, dd.L0(2131754047, null), "/table"));
            d.add(new p0(2131231570, dd.L0(2131754049, null), "/math", "/latex", "/expression"));
            d.add(new p0(2131231554, dd.L0(2131754053, null), "---"));
            d.add(new p0(2131231571, dd.L0(2131754052, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new p0(2131231571, dd.L0(2131754045, null), "/video", "/vid", "/media"));
            d.add(new p0(2131231547, dd.L0(2131754054, null), "/audio", "/music", "/media"));
            d.add(new p0(2131231569, dd.L0(2131754050, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            p0 p0Var = (p0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = p0Var.f3273b.toLowerCase().split(" ");
                int length = split.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (split[i11].startsWith(lowerCase)) {
                            break;
                        }
                        i11++;
                    } else {
                        for (String str2 : p0Var.f3274c) {
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
            arrayList.add(p0Var);
        }
        return arrayList;
    }
}
