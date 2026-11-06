package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
public class a0 extends g.p implements Menu {
    public final k f17628c;

    public a0(Context context, k kVar) {
        super(context);
        if (kVar != null) {
            this.f17628c = kVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f17628c.a(0, 0, 0, charSequence));
    }

    @Override
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f17628c.addIntentOptions(i7, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = f(menuItemArr3[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f17628c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        a0.l lVar = (a0.l) this.f13337b;
        if (lVar != null) {
            lVar.clear();
        }
        this.f17628c.clear();
    }

    @Override
    public final void close() {
        this.f17628c.close();
    }

    @Override
    public final MenuItem findItem(int i7) {
        return f(this.f17628c.findItem(i7));
    }

    @Override
    public final MenuItem getItem(int i7) {
        return f(this.f17628c.getItem(i7));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.f17628c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f17628c.isShortcutKey(i7, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i7, int i10) {
        return this.f17628c.performIdentifierAction(i7, i10);
    }

    @Override
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        return this.f17628c.performShortcut(i7, keyEvent, i10);
    }

    @Override
    public final void removeGroup(int i7) {
        if (((a0.l) this.f13337b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.f13337b;
                if (i10 >= lVar.f31c) {
                    break;
                }
                if (((l0.a) lVar.f(i10)).getGroupId() == i7) {
                    ((a0.l) this.f13337b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f17628c.removeGroup(i7);
    }

    @Override
    public final void removeItem(int i7) {
        if (((a0.l) this.f13337b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.f13337b;
                if (i10 >= lVar.f31c) {
                    break;
                } else if (((l0.a) lVar.f(i10)).getItemId() == i7) {
                    ((a0.l) this.f13337b).g(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f17628c.removeItem(i7);
    }

    @Override
    public final void setGroupCheckable(int i7, boolean z9, boolean z10) {
        this.f17628c.setGroupCheckable(i7, z9, z10);
    }

    @Override
    public final void setGroupEnabled(int i7, boolean z9) {
        this.f17628c.setGroupEnabled(i7, z9);
    }

    @Override
    public final void setGroupVisible(int i7, boolean z9) {
        this.f17628c.setGroupVisible(i7, z9);
    }

    @Override
    public final void setQwertyMode(boolean z9) {
        this.f17628c.setQwertyMode(z9);
    }

    @Override
    public final int size() {
        return this.f17628c.size();
    }

    @Override
    public final SubMenu addSubMenu(int i7) {
        return this.f17628c.addSubMenu(i7);
    }

    @Override
    public final MenuItem add(int i7) {
        return f(this.f17628c.add(i7));
    }

    @Override
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return this.f17628c.addSubMenu(i7, i10, i11, charSequence);
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return f(this.f17628c.a(i7, i10, i11, charSequence));
    }

    @Override
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return this.f17628c.addSubMenu(i7, i10, i11, i12);
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return f(this.f17628c.add(i7, i10, i11, i12));
    }
}
