package ae;

public final class c {

    public static final c f246e;

    public boolean f247a;

    public boolean f248b;

    public boolean f249c;
    public boolean d;

    static {
        c cVar = new c();
        cVar.f247a = true;
        cVar.f248b = true;
        cVar.f249c = false;
        cVar.d = false;
        f246e = cVar;
        cVar.f247a = true;
        cVar.f248b = true;
        cVar.f249c = false;
        cVar.d = false;
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
        }
        if (!z10) {
            return str.replace('$', '.');
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            str = str.substring(iLastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
