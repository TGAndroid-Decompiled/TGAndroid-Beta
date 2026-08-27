package o4;

import h7.u6;
import java.util.ArrayList;

public final class c implements j {

    public static final int[] f19197b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i10, ArrayList arrayList) {
        if (u6.c(i10, 0, 7, f19197b) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }
}
