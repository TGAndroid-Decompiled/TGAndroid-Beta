package l0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import l.n;
public interface a extends MenuItem {
    a a(n nVar);

    n b();

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
    MenuItem setAlphabeticShortcut(char c3, int i10);

    @Override
    a setContentDescription(CharSequence charSequence);

    @Override
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override
    MenuItem setNumericShortcut(char c3, int i10);

    @Override
    MenuItem setShortcut(char c3, char c10, int i10, int i11);

    @Override
    a setTooltipText(CharSequence charSequence);
}
