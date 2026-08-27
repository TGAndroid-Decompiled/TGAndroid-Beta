package h0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class i {

    public final ColorStateList f7723a;

    public final Configuration f7724b;

    public final int f7725c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f7723a = colorStateList;
        this.f7724b = configuration;
        this.f7725c = theme == null ? 0 : theme.hashCode();
    }
}
