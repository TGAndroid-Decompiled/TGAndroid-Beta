package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class i {
    public final ColorStateList f10045a;
    public final Configuration f10046b;
    public final int f10047c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f10045a = colorStateList;
        this.f10046b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f10047c = hashCode;
    }
}
