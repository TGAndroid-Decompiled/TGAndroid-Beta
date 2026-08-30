package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class i {
    public final ColorStateList f6868a;
    public final Configuration f6869b;
    public final int f6870c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f6868a = colorStateList;
        this.f6869b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f6870c = hashCode;
    }
}
