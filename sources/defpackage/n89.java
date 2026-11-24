package defpackage;
public final class n89 {
    public static final Throwable a;
    public static final n89 b;

    static {
        try {
            b = new Object();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static n89 a() {
        String stringBuffer;
        n89 n89Var = b;
        if (n89Var == null) {
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
        return n89Var;
    }

    public static void b(c5a c5aVar) {
        Object obj = c5aVar.c;
        if (obj instanceof y1) {
            if (!((y1) obj).isParsed()) {
                ((y1) obj).parseDetails();
                return;
            }
            return;
        }
        String name = y1.class.getName();
        throw new RuntimeException("Only methods in subclasses of " + name + " can  be annotated with ParseDetail");
    }
}
