package defpackage;

import android.content.ComponentName;
import android.content.Context;
public enum c06 {
    DEFAULT("DefaultIcon", 2131231493, 2131558426, 2131754234, false),
    VINTAGE("VintageIcon", 2131231488, 2131558419, 2131754230, false),
    AQUA("AquaIcon", 2131231482, 2131558426, 2131754236, false),
    PREMIUM("PremiumIcon", 2131231479, 2131558407, 2131754232, true),
    TURBO("TurboIcon", 2131231485, 2131558414, 2131754231, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754233, true);
    
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public ComponentName f;

    c06(String str, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final ComponentName a(Context context) {
        ComponentName componentName = this.f;
        if (componentName == null) {
            String packageName = context.getPackageName();
            ComponentName componentName2 = new ComponentName(packageName, "org.telegram.messenger." + this.a);
            this.f = componentName2;
            return componentName2;
        }
        return componentName;
    }
}
