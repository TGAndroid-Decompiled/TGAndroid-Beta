package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class h {
    public final ColorStateList f14024a;
    public final Configuration f14025b;
    public final int f14026c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f14024a = colorStateList;
        this.f14025b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f14026c = hashCode;
    }
}
