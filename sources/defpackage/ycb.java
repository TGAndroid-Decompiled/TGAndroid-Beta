package defpackage;
public final class ycb {
    public static final ycb e;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.a = true;
        obj.b = true;
        obj.c = false;
        obj.d = false;
        e = obj;
        obj.a = true;
        obj.b = true;
        obj.c = false;
        obj.d = false;
    }

    public static String a(String str, Class cls, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z) {
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
