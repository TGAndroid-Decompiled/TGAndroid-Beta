package ad;
public abstract class a {
    public static final Integer f149a;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f149a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f149a = num2;
    }
}
