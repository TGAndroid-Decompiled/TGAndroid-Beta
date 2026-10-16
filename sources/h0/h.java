package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class h {
    public final ColorStateList f10296a;
    public final Configuration f10297b;
    public final int f10298c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f10296a = colorStateList;
        this.f10297b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f10298c = hashCode;
    }
}
