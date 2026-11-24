package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
public final class w07 extends yo implements Menu {
    public final yz6 c;

    public w07(Context context, yz6 yz6Var) {
        super(context);
        if (yz6Var != null) {
            this.c = yz6Var;
        } else {
            w26.j("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return f(this.c.a(0, 0, 0, charSequence));
    }

    @Override
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = f(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        aia aiaVar = (aia) this.b;
        if (aiaVar != null) {
            aiaVar.clear();
        }
        this.c.clear();
    }

    @Override
    public final void close() {
        this.c.close();
    }

    @Override
    public final MenuItem findItem(int i) {
        return f(this.c.findItem(i));
    }

    @Override
    public final MenuItem getItem(int i) {
        return f(this.c.getItem(i));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i, int i2) {
        return this.c.performIdentifierAction(i, i2);
    }

    @Override
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.c.performShortcut(i, keyEvent, i2);
    }

    @Override
    public final void removeGroup(int i) {
        if (((aia) this.b) != null) {
            int i2 = 0;
            while (true) {
                aia aiaVar = (aia) this.b;
                if (i2 >= aiaVar.c) {
                    break;
                }
                if (((ybb) aiaVar.f(i2)).getGroupId() == i) {
                    ((aia) this.b).g(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.c.removeGroup(i);
    }

    @Override
    public final void removeItem(int i) {
        if (((aia) this.b) != null) {
            int i2 = 0;
            while (true) {
                aia aiaVar = (aia) this.b;
                if (i2 >= aiaVar.c) {
                    break;
                } else if (((ybb) aiaVar.f(i2)).getItemId() == i) {
                    ((aia) this.b).g(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.c.removeItem(i);
    }

    @Override
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.c.setGroupCheckable(i, z, z2);
    }

    @Override
    public final void setGroupEnabled(int i, boolean z) {
        this.c.setGroupEnabled(i, z);
    }

    @Override
    public final void setGroupVisible(int i, boolean z) {
        this.c.setGroupVisible(i, z);
    }

    @Override
    public final void setQwertyMode(boolean z) {
        this.c.setQwertyMode(z);
    }

    @Override
    public final int size() {
        return this.c.f.size();
    }

    @Override
    public final SubMenu addSubMenu(int i) {
        return this.c.addSubMenu(i);
    }

    @Override
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.c.addSubMenu(i, i2, i3, i4);
    }

    @Override
    public final MenuItem add(int i) {
        return f(this.c.add(i));
    }

    @Override
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return f(this.c.a(i, i2, i3, charSequence));
    }

    @Override
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return f(this.c.add(i, i2, i3, i4));
    }
}
