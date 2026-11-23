package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
public class a0 extends g.p implements Menu {
    public final k f19168c;

    public a0(Context context, k kVar) {
        super(context);
        if (kVar != null) {
            this.f19168c = kVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f19168c.a(0, 0, 0, charSequence));
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
        int addIntentOptions = this.f19168c.addIntentOptions(i7, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
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
        return this.f19168c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        a0.l lVar = (a0.l) this.f13033b;
        if (lVar != null) {
            lVar.clear();
        }
        this.f19168c.clear();
    }

    @Override
    public final void close() {
        this.f19168c.close();
    }

    @Override
    public final MenuItem findItem(int i7) {
        return f(this.f19168c.findItem(i7));
    }

    @Override
    public final MenuItem getItem(int i7) {
        return f(this.f19168c.getItem(i7));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.f19168c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f19168c.isShortcutKey(i7, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i7, int i10) {
        return this.f19168c.performIdentifierAction(i7, i10);
    }

    @Override
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        return this.f19168c.performShortcut(i7, keyEvent, i10);
    }

    @Override
    public final void removeGroup(int i7) {
        if (((a0.l) this.f13033b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.f13033b;
                if (i10 >= lVar.f31c) {
                    break;
                }
                if (((l0.a) lVar.f(i10)).getGroupId() == i7) {
                    ((a0.l) this.f13033b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f19168c.removeGroup(i7);
    }

    @Override
    public final void removeItem(int i7) {
        if (((a0.l) this.f13033b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.f13033b;
                if (i10 >= lVar.f31c) {
                    break;
                } else if (((l0.a) lVar.f(i10)).getItemId() == i7) {
                    ((a0.l) this.f13033b).g(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f19168c.removeItem(i7);
    }

    @Override
    public final void setGroupCheckable(int i7, boolean z10, boolean z11) {
        this.f19168c.setGroupCheckable(i7, z10, z11);
    }

    @Override
    public final void setGroupEnabled(int i7, boolean z10) {
        this.f19168c.setGroupEnabled(i7, z10);
    }

    @Override
    public final void setGroupVisible(int i7, boolean z10) {
        this.f19168c.setGroupVisible(i7, z10);
    }

    @Override
    public final void setQwertyMode(boolean z10) {
        this.f19168c.setQwertyMode(z10);
    }

    @Override
    public final int size() {
        return this.f19168c.size();
    }

    @Override
    public final SubMenu addSubMenu(int i7) {
        return this.f19168c.addSubMenu(i7);
    }

    @Override
    public final MenuItem add(int i7) {
        return f(this.f19168c.add(i7));
    }

    @Override
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return this.f19168c.addSubMenu(i7, i10, i11, charSequence);
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return f(this.f19168c.a(i7, i10, i11, charSequence));
    }

    @Override
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return this.f19168c.addSubMenu(i7, i10, i11, i12);
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return f(this.f19168c.add(i7, i10, i11, i12));
    }
}
