package defpackage;

import java.util.ArrayList;
public final class ed7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final ArrayList c;
    public final boolean d;

    public ed7(kf7 kf7Var, boolean z, ArrayList arrayList) {
        this.a = (byte) 2;
        this.b = kf7Var;
        this.d = z;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed7.run():void");
    }

    public ed7(kf7 kf7Var, ArrayList arrayList, boolean z, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = arrayList;
        this.d = z;
    }
}
