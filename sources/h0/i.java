package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class i {
    public final ColorStateList f7485a;
    public final Configuration f7486b;
    public final int f7487c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f7485a = colorStateList;
        this.f7486b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f7487c = hashCode;
    }
}
