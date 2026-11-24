package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
public abstract class zjc {
    public static final im5 a = new im5(new int[]{0, 2, 1}, 3);
    public static final im5 b = new im5(new int[]{0, 2, 1, 3, 4}, 5);
    public static final im5 c = new im5(new int[]{0, 2, 1, 5, 3, 4}, 6);
    public static final im5 d = im5.c(2, 1, 6, 5, 3, 4);
    public static final im5 e = im5.c(2, 1, 7, 5, 6, 3, 4);

    public static ld7 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = g8c.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                lad.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ba8.d(new xu7(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    lad.g("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new wjc(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ld7(arrayList);
    }
}
