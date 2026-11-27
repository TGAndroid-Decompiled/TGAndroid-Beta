package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
public interface ufb extends MenuItem {
    ufb a(k27 k27Var);

    k27 b();

    @Override
    int getAlphabeticModifiers();

    @Override
    CharSequence getContentDescription();

    @Override
    ColorStateList getIconTintList();

    @Override
    PorterDuff.Mode getIconTintMode();

    @Override
    int getNumericModifiers();

    @Override
    CharSequence getTooltipText();

    @Override
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override
    ufb setContentDescription(CharSequence charSequence);

    @Override
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override
    MenuItem setNumericShortcut(char c, int i);

    @Override
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override
    ufb setTooltipText(CharSequence charSequence);
}
