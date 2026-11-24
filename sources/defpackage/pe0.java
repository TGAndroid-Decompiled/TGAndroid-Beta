package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public abstract class pe0 {
    public static ExecutorService a;
    public static final int[] b = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] c = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] d = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] e = {16842755, 16843781, 16844062};
    public static final int[] f = {16843161};
    public static final int[] g = {16842755, 16843213};
    public static final int[] h = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    public static final int[] i = {16843490};
    public static final int[] j = {16843486, 16843487, 16843488, 16843489};
    public static final int[] k = {16842788, 16843073, 16843488, 16843992};
    public static final int[] l = {16843489, 16843781, 16843892, 16843893};

    public static synchronized Executor a() {
        ExecutorService executorService;
        synchronized (pe0.class) {
            executorService = a;
            if (executorService == null) {
                String str = hac.a;
                executorService = Executors.newSingleThreadExecutor(new ds2("ExoPlayer:BackgroundExecutor", (byte) 1));
                a = executorService;
            }
        }
        return executorService;
    }
}
