package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
public class a0 extends f2.v implements Menu {
    public final k f11115c;

    public a0(Context context, k kVar) {
        super(context);
        if (kVar != null) {
            this.f11115c = kVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f11115c.a(0, 0, 0, charSequence));
    }

    @Override
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f11115c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = f(menuItemArr3[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f11115c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        a0.k kVar = (a0.k) this.f5835b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f11115c.clear();
    }

    @Override
    public final void close() {
        this.f11115c.close();
    }

    @Override
    public final MenuItem findItem(int i10) {
        return f(this.f11115c.findItem(i10));
    }

    @Override
    public final MenuItem getItem(int i10) {
        return f(this.f11115c.getItem(i10));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.f11115c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f11115c.isShortcutKey(i10, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f11115c.performIdentifierAction(i10, i11);
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f11115c.performShortcut(i10, keyEvent, i11);
    }

    @Override
    public final void removeGroup(int i10) {
        if (((a0.k) this.f5835b) != null) {
            int i11 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.f5835b;
                if (i11 >= kVar.f25c) {
                    break;
                }
                if (((l0.a) kVar.e(i11)).getGroupId() == i10) {
                    ((a0.k) this.f5835b).f(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f11115c.removeGroup(i10);
    }

    @Override
    public final void removeItem(int i10) {
        if (((a0.k) this.f5835b) != null) {
            int i11 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.f5835b;
                if (i11 >= kVar.f25c) {
                    break;
                } else if (((l0.a) kVar.e(i11)).getItemId() == i10) {
                    ((a0.k) this.f5835b).f(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f11115c.removeItem(i10);
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z4, boolean z10) {
        this.f11115c.setGroupCheckable(i10, z4, z10);
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z4) {
        this.f11115c.setGroupEnabled(i10, z4);
    }

    @Override
    public final void setGroupVisible(int i10, boolean z4) {
        this.f11115c.setGroupVisible(i10, z4);
    }

    @Override
    public final void setQwertyMode(boolean z4) {
        this.f11115c.setQwertyMode(z4);
    }

    @Override
    public final int size() {
        return this.f11115c.size();
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return this.f11115c.addSubMenu(i10);
    }

    @Override
    public final MenuItem add(int i10) {
        return f(this.f11115c.add(i10));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f11115c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return f(this.f11115c.a(i10, i11, i12, charSequence));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f11115c.addSubMenu(i10, i11, i12, i13);
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return f(this.f11115c.add(i10, i11, i12, i13));
    }
}
