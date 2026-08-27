package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class b0 extends f2.w implements Menu {

    public final l f15270c;

    public b0(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f15270c = lVar;
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f15270c.a(0, 0, 0, charSequence));
    }

    @Override
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f15270c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = f(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f15270c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        a0.k kVar = (a0.k) this.f5851b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f15270c.clear();
    }

    @Override
    public final void close() {
        this.f15270c.close();
    }

    @Override
    public final MenuItem findItem(int i10) {
        return f(this.f15270c.findItem(i10));
    }

    @Override
    public final MenuItem getItem(int i10) {
        return f(this.f15270c.getItem(i10));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.f15270c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f15270c.isShortcutKey(i10, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f15270c.performIdentifierAction(i10, i11);
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f15270c.performShortcut(i10, keyEvent, i11);
    }

    @Override
    public final void removeGroup(int i10) {
        if (((a0.k) this.f5851b) != null) {
            int i11 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.f5851b;
                if (i11 >= kVar.f28c) {
                    break;
                }
                if (((l0.a) kVar.e(i11)).getGroupId() == i10) {
                    ((a0.k) this.f5851b).f(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f15270c.removeGroup(i10);
    }

    @Override
    public final void removeItem(int i10) {
        if (((a0.k) this.f5851b) != null) {
            int i11 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.f5851b;
                if (i11 >= kVar.f28c) {
                    break;
                }
                if (((l0.a) kVar.e(i11)).getItemId() == i10) {
                    ((a0.k) this.f5851b).f(i11);
                    break;
                }
                i11++;
            }
        }
        this.f15270c.removeItem(i10);
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f15270c.setGroupCheckable(i10, z10, z11);
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f15270c.setGroupEnabled(i10, z10);
    }

    @Override
    public final void setGroupVisible(int i10, boolean z10) {
        this.f15270c.setGroupVisible(i10, z10);
    }

    @Override
    public final void setQwertyMode(boolean z10) {
        this.f15270c.setQwertyMode(z10);
    }

    @Override
    public final int size() {
        return this.f15270c.size();
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return this.f15270c.addSubMenu(i10);
    }

    @Override
    public final MenuItem add(int i10) {
        return f(this.f15270c.add(i10));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f15270c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return f(this.f15270c.a(i10, i11, i12, charSequence));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f15270c.addSubMenu(i10, i11, i12, i13);
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return f(this.f15270c.add(i10, i11, i12, i13));
    }
}
