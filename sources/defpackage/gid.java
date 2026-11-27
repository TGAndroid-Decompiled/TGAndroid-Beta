package defpackage;
public abstract class gid {
    public static final Object a = new Object();
    public static int b;
    public static boolean c;

    public static void a() {
        synchronized (a) {
            if (c) {
                return;
            }
            c = true;
            Thread thread = new Thread(new osa((byte) 21), "widget-engine-memory");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
