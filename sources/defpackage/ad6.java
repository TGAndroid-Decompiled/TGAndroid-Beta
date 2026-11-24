package defpackage;

import android.location.Location;
import java.io.Serializable;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
public final class ad6 implements Runnable {
    public final byte a;
    public final byte b;
    public final Object c;
    public final Serializable d;
    public final Object e;
    public final Object f;

    public ad6(cf7 cf7Var, String str, int i, Object[] objArr, CountDownLatch countDownLatch) {
        this.a = (byte) 2;
        this.c = cf7Var;
        this.d = str;
        this.b = i;
        this.e = objArr;
        this.f = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad6.run():void");
    }

    public ad6(pg0 pg0Var, Serializable serializable, Object obj, int i, Serializable serializable2, byte b) {
        this.a = b;
        this.c = pg0Var;
        this.d = serializable;
        this.e = obj;
        this.b = i;
        this.f = serializable2;
    }

    public ad6(Locale locale, Location location, int i, Locale locale2, qc6 qc6Var) {
        this.a = (byte) 0;
        this.c = locale;
        this.e = location;
        this.b = i;
        this.d = locale2;
        this.f = qc6Var;
    }
}
