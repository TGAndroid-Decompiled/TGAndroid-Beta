package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
public class a0 extends g.p implements Menu {
    public final k f17377c;

    public a0(Context context, k kVar) {
        super(context);
        if (kVar != null) {
            this.f17377c = kVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f17377c.a(0, 0, 0, charSequence));
    }

    @Override
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f17377c.addIntentOptions(i3, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
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
        return this.f17377c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        a0.l lVar = (a0.l) this.f11721b;
        if (lVar != null) {
            lVar.clear();
        }
        this.f17377c.clear();
    }

    @Override
    public final void close() {
        this.f17377c.close();
    }

    @Override
    public final MenuItem findItem(int i3) {
        return f(this.f17377c.findItem(i3));
    }

    @Override
    public final MenuItem getItem(int i3) {
        return f(this.f17377c.getItem(i3));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.f17377c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.f17377c.isShortcutKey(i3, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i3, int i10) {
        return this.f17377c.performIdentifierAction(i3, i10);
    }

    @Override
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
        return this.f17377c.performShortcut(i3, keyEvent, i10);
    }

    @Override
    public final void removeGroup(int i3) {
        if (((a0.l) this.f11721b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.f11721b;
                if (i10 >= lVar.f31c) {
                    break;
                }
                if (((l0.a) lVar.f(i10)).getGroupId() == i3) {
                    ((a0.l) this.f11721b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f17377c.removeGroup(i3);
    }

    @Override
    public final void removeItem(int i3) {
        if (((a0.l) this.f11721b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.f11721b;
                if (i10 >= lVar.f31c) {
                    break;
                } else if (((l0.a) lVar.f(i10)).getItemId() == i3) {
                    ((a0.l) this.f11721b).g(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f17377c.removeItem(i3);
    }

    @Override
    public final void setGroupCheckable(int i3, boolean z10, boolean z11) {
        this.f17377c.setGroupCheckable(i3, z10, z11);
    }

    @Override
    public final void setGroupEnabled(int i3, boolean z10) {
        this.f17377c.setGroupEnabled(i3, z10);
    }

    @Override
    public final void setGroupVisible(int i3, boolean z10) {
        this.f17377c.setGroupVisible(i3, z10);
    }

    @Override
    public final void setQwertyMode(boolean z10) {
        this.f17377c.setQwertyMode(z10);
    }

    @Override
    public final int size() {
        return this.f17377c.size();
    }

    @Override
    public final SubMenu addSubMenu(int i3) {
        return this.f17377c.addSubMenu(i3);
    }

    @Override
    public final MenuItem add(int i3) {
        return f(this.f17377c.add(i3));
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        return this.f17377c.addSubMenu(i3, i10, i11, charSequence);
    }

    @Override
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        return f(this.f17377c.a(i3, i10, i11, charSequence));
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return this.f17377c.addSubMenu(i3, i10, i11, i12);
    }

    @Override
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        return f(this.f17377c.add(i3, i10, i11, i12));
    }
}
