package o0;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class h {
    public static final a0.j f16300a = new a0.j(16);
    public static final ThreadPoolExecutor f16301b;
    public static final Object f16302c;
    public static final a0.k d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f16301b = threadPoolExecutor;
        f16302c = new Object();
        d = new a0.k(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb.append(((d) list.get(i11)).f16291e);
            sb.append("-");
            sb.append(i10);
            if (i11 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static o0.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: o0.h.b(java.lang.String, android.content.Context, java.util.List, int):o0.g");
    }
}
