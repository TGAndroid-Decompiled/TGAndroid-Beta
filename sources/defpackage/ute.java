package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public abstract class ute {
    public static String a(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((y1c) obj).a.g.t;
            if (eg7.m(str2)) {
                return "video/mp4";
            }
            if (eg7.i(str2)) {
                z = true;
            } else if (eg7.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }
}
