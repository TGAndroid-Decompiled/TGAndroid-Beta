package mc;

import h5.f;
import java.util.ArrayList;
import java.util.regex.Pattern;
public abstract class e {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(h5.b bVar, String str) {
        f parent = bVar.getParent();
        ArrayList arrayList = ((com.googlecode.mp4parser.e) parent).f7977b;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h5.b bVar2 = (h5.b) obj;
            if (bVar2.getType().equals(bVar.getType())) {
                if (bVar2 == bVar) {
                    break;
                }
                i3++;
            }
        }
        String str2 = String.format("/%s[%d]", bVar.getType(), Integer.valueOf(i3)) + str;
        if (parent instanceof h5.b) {
            return a((h5.b) parent, str2);
        }
        return str2;
    }
}
