package de;
public final class b {
    public static final b e;
    public boolean f4342a;
    public boolean f4343b;
    public boolean f4344c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f4342a = true;
        obj.f4343b = true;
        obj.f4344c = false;
        obj.d = false;
        e = obj;
        obj.f4342a = true;
        obj.f4343b = true;
        obj.f4344c = false;
        obj.d = false;
    }

    public static String a(String str, Class cls, boolean z4) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z4));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z4) {
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
