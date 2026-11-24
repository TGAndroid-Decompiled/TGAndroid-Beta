package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class ic9 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public ic9(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.a = colorStateList;
        this.b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.c = hashCode;
    }
}
