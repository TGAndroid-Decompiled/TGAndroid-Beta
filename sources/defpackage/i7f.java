package defpackage;

import android.content.Context;
import android.util.Log;
public abstract class i7f {
    public static final opd a;
    public static final opd b;
    public static Context c;

    static {
        new opd(zoe.U("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), (byte) 0);
        new opd(zoe.U("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), (byte) 1);
        new opd(zoe.U("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), (byte) 2);
        new opd(zoe.U("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), (byte) 3);
        a = new opd(zoe.U("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), (byte) 4);
        b = new opd(zoe.U("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), (byte) 5);
    }

    public static synchronized void a(Context context) {
        synchronized (i7f.class) {
            if (c == null) {
                if (context != null) {
                    c = context.getApplicationContext();
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }
}
