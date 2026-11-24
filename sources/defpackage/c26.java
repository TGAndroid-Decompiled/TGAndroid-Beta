package defpackage;

import android.content.ComponentName;
import android.content.Context;
public enum c26 {
    DEFAULT("DefaultIcon", 2131231494, 2131558426, 2131754202, false),
    VINTAGE("VintageIcon", 2131231489, 2131558419, 2131754198, false),
    AQUA("AquaIcon", 2131231483, 2131558426, 2131754204, false),
    PREMIUM("PremiumIcon", 2131231480, 2131558407, 2131754200, true),
    TURBO("TurboIcon", 2131231486, 2131558414, 2131754199, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754201, true);
    
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public ComponentName f;

    c26(String str, int i, int i2, int i3, boolean z) {
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
