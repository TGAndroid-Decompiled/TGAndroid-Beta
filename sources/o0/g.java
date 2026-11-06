package o0;

import a0.l;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class g {
    public static final a0.j f20685a = new a0.j(16);
    public static final ThreadPoolExecutor f20686b;
    public static final Object f20687c;
    public static final l d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20686b = threadPoolExecutor;
        f20687c = new Object();
        d = new l(0);
    }

    public static String a(int i7, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((d) list.get(i10)).f20678e);
            sb2.append("-");
            sb2.append(i7);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static o0.f b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: o0.g.b(java.lang.String, android.content.Context, java.util.List, int):o0.f");
    }
}
