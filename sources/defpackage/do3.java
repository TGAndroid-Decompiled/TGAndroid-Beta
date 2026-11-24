package defpackage;

import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;
public final class do3 implements Runnable {
    public final byte a = 3;
    public final int b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public do3(eo3 eo3Var, boolean z, float[] fArr, long j, int i) {
        this.e = eo3Var;
        this.d = z;
        this.f = fArr;
        this.c = j;
        this.b = i;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do3.run():void");
    }

    public do3(cf7 cf7Var, long j, List list, boolean z, int i) {
        this.e = cf7Var;
        this.c = j;
        this.f = list;
        this.d = z;
        this.b = i;
    }

    public do3(cf7 cf7Var, boolean z, String str, long j, int i, String str2) {
        this.e = cf7Var;
        this.d = z;
        this.f = str;
        this.c = j;
        this.b = i;
    }

    public do3(LaunchActivity launchActivity, TLObject tLObject, int i, long j, boolean z) {
        this.e = launchActivity;
        this.f = tLObject;
        this.b = i;
        this.c = j;
        this.d = z;
    }
}
