package defpackage;

import android.os.Build;
import android.os.Bundle;
public final class hw6 {
    public byte a = 1;
    public boolean b;
    public boolean c;
    public boolean d;
    public Bundle e;

    public hw6() {
        this.b = Build.VERSION.SDK_INT >= 30;
    }
}
