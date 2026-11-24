package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class cy5 implements Runnable {
    public final byte a = 1;
    public final LaunchActivity b;
    public final byte[] c;
    public final int d;
    public final Integer e;
    public final String f;
    public final int h;
    public final long n;
    public final Object r;
    public final Object s;
    public final Object w;

    public cy5(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i, Integer num, String str, int i2, long j, vt vtVar, d dVar) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i;
        this.e = num;
        this.f = str;
        this.h = i2;
        this.n = j;
        this.s = vtVar;
        this.w = dVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy5.run():void");
    }

    public cy5(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j, Runnable runnable, String str, int i, int i2) {
        this.b = launchActivity;
        this.r = tLObject;
        this.e = num;
        this.s = num2;
        this.c = bArr;
        this.n = j;
        this.w = runnable;
        this.f = str;
        this.d = i;
        this.h = i2;
    }
}
