package defpackage;
public abstract class odd {
    public static final Object a = new Object();
    public static int b;
    public static boolean c;

    public static void a() {
        synchronized (a) {
            if (c) {
                return;
            }
            c = true;
            Thread thread = new Thread(new cza((byte) 18), "widget-engine-memory");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
