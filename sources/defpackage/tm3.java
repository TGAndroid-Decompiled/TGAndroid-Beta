package defpackage;

import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;
public final class tm3 implements Runnable {
    public final byte a = 3;
    public final int b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public tm3(um3 um3Var, boolean z, float[] fArr, long j, int i) {
        this.e = um3Var;
        this.d = z;
        this.f = fArr;
        this.c = j;
        this.b = i;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm3.run():void");
    }

    public tm3(ad7 ad7Var, long j, List list, boolean z, int i) {
        this.e = ad7Var;
        this.c = j;
        this.f = list;
        this.d = z;
        this.b = i;
    }

    public tm3(ad7 ad7Var, boolean z, String str, long j, int i, String str2) {
        this.e = ad7Var;
        this.d = z;
        this.f = str;
        this.c = j;
        this.b = i;
    }

    public tm3(LaunchActivity launchActivity, TLObject tLObject, int i, long j, boolean z) {
        this.e = launchActivity;
        this.f = tLObject;
        this.b = i;
        this.c = j;
        this.d = z;
    }
}
