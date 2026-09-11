package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class i {
    public final ColorStateList f10811a;
    public final Configuration f10812b;
    public final int f10813c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f10811a = colorStateList;
        this.f10812b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f10813c = hashCode;
    }
}
