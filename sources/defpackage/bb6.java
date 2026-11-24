package defpackage;

import android.location.Location;
import java.io.Serializable;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
public final class bb6 implements Runnable {
    public final byte a;
    public final byte b;
    public final Object c;
    public final Serializable d;
    public final Object e;
    public final Object f;

    public bb6(ad7 ad7Var, String str, int i, Object[] objArr, CountDownLatch countDownLatch) {
        this.a = (byte) 2;
        this.c = ad7Var;
        this.d = str;
        this.b = i;
        this.e = objArr;
        this.f = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb6.run():void");
    }

    public bb6(pf0 pf0Var, Serializable serializable, Object obj, int i, Serializable serializable2, byte b) {
        this.a = b;
        this.c = pf0Var;
        this.d = serializable;
        this.e = obj;
        this.b = i;
        this.f = serializable2;
    }

    public bb6(Locale locale, Location location, int i, Locale locale2, ra6 ra6Var) {
        this.a = (byte) 0;
        this.c = locale;
        this.e = location;
        this.b = i;
        this.d = locale2;
        this.f = ra6Var;
    }
}
