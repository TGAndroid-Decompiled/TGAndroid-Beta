package o4;

import g7.r6;
import java.util.ArrayList;
public final class c implements j {
    public static final int[] f18850b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i9, ArrayList arrayList) {
        if (r6.c(i9, 0, 7, f18850b) != -1 && !arrayList.contains(Integer.valueOf(i9))) {
            arrayList.add(Integer.valueOf(i9));
        }
    }
}
