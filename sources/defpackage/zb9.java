package defpackage;
public final class zb9 {
    public static final Throwable a;
    public static final zb9 b;

    static {
        try {
            b = new Object();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static zb9 a() {
        String stringBuffer;
        zb9 zb9Var = b;
        if (zb9Var == null) {
            Throwable th = a;
            if (th == null) {
                stringBuffer = "com.googlecode.mp4parser.RequiresParseDetailAspect";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer("Exception while initializing com.googlecode.mp4parser.RequiresParseDetailAspect: ");
                stringBuffer2.append(th);
                stringBuffer = stringBuffer2.toString();
            }
            ?? runtimeException = new RuntimeException(stringBuffer);
            runtimeException.a = th;
            throw runtimeException;
        }
        return zb9Var;
    }

    public static void b(lyc lycVar) {
        Object obj = lycVar.c;
        if (obj instanceof z1) {
            if (!((z1) obj).isParsed()) {
                ((z1) obj).parseDetails();
                return;
            }
            return;
        }
        String name = z1.class.getName();
        throw new RuntimeException("Only methods in subclasses of " + name + " can  be annotated with ParseDetail");
    }
}
