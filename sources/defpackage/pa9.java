package defpackage;
public final class pa9 {
    public static final Throwable a;
    public static final pa9 b;

    static {
        try {
            b = new Object();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static pa9 a() {
        String stringBuffer;
        pa9 pa9Var = b;
        if (pa9Var == null) {
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
        return pa9Var;
    }

    public static void b(xvc xvcVar) {
        Object obj = xvcVar.c;
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
