package be;
public final class b {
    public static final b f2073e;
    public boolean f2074a;
    public boolean f2075b;
    public boolean f2076c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f2074a = true;
        obj.f2075b = true;
        obj.f2076c = false;
        obj.d = false;
        f2073e = obj;
        obj.f2074a = true;
        obj.f2075b = true;
        obj.f2076c = false;
        obj.d = false;
    }

    public static String a(String str, Class cls, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z10));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z10) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            return str.replace('$', '.');
        } else {
            return str.replace('$', '.');
        }
    }
}
