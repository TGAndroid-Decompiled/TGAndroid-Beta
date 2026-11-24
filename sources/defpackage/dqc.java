package defpackage;
public abstract class dqc {
    public static do3 a;
    public static final int[] b = new int[129];

    static {
        int i = 0;
        while (true) {
            int[] iArr = b;
            if (i < 129) {
                iArr[i] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i))) * 255.0d);
                i++;
            } else {
                return;
            }
        }
    }
}
