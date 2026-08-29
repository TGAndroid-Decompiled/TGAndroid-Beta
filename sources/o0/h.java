package o0;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class h {
    public static final a0.j f19003a = new a0.j(16);
    public static final ThreadPoolExecutor f19004b;
    public static final Object f19005c;
    public static final a0.k d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f19004b = threadPoolExecutor;
        f19005c = new Object();
        d = new a0.k(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((d) list.get(i11)).f18994e);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static o0.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: o0.h.b(java.lang.String, android.content.Context, java.util.List, int):o0.g");
    }
}
