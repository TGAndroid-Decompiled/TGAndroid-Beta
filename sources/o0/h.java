package o0;

import a0.l;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class h {
    public static final a0.j f20491a = new a0.j(16);
    public static final ThreadPoolExecutor f20492b;
    public static final Object f20493c;
    public static final l d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20492b = threadPoolExecutor;
        f20493c = new Object();
        d = new l(0);
    }

    public static String a(int i3, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((e) list.get(i10)).f20484e);
            sb2.append("-");
            sb2.append(i3);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static o0.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: o0.h.b(java.lang.String, android.content.Context, java.util.List, int):o0.g");
    }
}
