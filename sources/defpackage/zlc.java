package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
public abstract class zlc {
    public static final io5 a = new io5(new int[]{0, 2, 1}, 3);
    public static final io5 b = new io5(new int[]{0, 2, 1, 3, 4}, 5);
    public static final io5 c = new io5(new int[]{0, 2, 1, 5, 3, 4}, 6);
    public static final io5 d = io5.c(2, 1, 6, 5, 3, 4);
    public static final io5 e = io5.c(2, 1, 7, 5, 6, 3, 4);

    public static nf7 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = hac.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                ncd.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(cc8.d(new yw7(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    ncd.g("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new wlc(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new nf7(arrayList);
    }
}
