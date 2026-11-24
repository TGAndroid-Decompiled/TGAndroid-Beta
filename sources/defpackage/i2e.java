package defpackage;

import java.io.PrintStream;
public abstract class i2e {
    public static final w3f a;

    static {
        w3f c2eVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num != null && num.intValue() >= 19) {
                c2eVar = new c2e((byte) 1);
            } else if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                c2eVar = new y2e();
            } else {
                c2eVar = new c2e((byte) 0);
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = c2e.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            c2eVar = new c2e((byte) 0);
        }
        a = c2eVar;
    }
}
