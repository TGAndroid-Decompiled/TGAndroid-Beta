package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class h {
    public final ColorStateList f12538a;
    public final Configuration f12539b;
    public final int f12540c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f12538a = colorStateList;
        this.f12539b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f12540c = hashCode;
    }
}
