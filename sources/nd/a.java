package nd;
public abstract class a {
    public static final Integer f20536a;

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
            f20536a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f20536a = num2;
    }
}
