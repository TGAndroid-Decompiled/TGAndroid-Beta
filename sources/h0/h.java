package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class h {
    public final ColorStateList f13694a;
    public final Configuration f13695b;
    public final int f13696c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f13694a = colorStateList;
        this.f13695b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f13696c = hashCode;
    }
}
