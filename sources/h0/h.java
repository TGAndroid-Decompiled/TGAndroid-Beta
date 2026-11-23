package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
public final class h {
    public final ColorStateList f13726a;
    public final Configuration f13727b;
    public final int f13728c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f13726a = colorStateList;
        this.f13727b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f13728c = hashCode;
    }
}
