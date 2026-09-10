package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class i {
    public final ColorStateList f9176a;
    public final Configuration f9177b;
    public final int f9178c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f9176a = colorStateList;
        this.f9177b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f9178c = hashCode;
    }
}
