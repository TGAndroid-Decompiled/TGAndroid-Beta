package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class yz6 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public wz6 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public c07 v;
    public boolean x;
    public boolean l = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public yz6(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = kdc.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = fo.D(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final c07 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (y[i5] << 16) | (65535 & i3);
            c07 c07Var = new c07(this, i, i2, i3, i6, charSequence, this.l ? 1 : 0);
            ArrayList arrayList = this.f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((c07) arrayList.get(size)).d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, c07Var);
            p(true);
            return c07Var;
        }
        w26.j("order does not contain a valid category.");
        return null;
    }

    @Override
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            c07 a = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a.setIcon(resolveInfo.loadIcon(packageManager));
            a.g = intent3;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a;
            }
        }
        return i5;
    }

    @Override
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        c07 a = a(i, i2, i3, charSequence);
        bab babVar = new bab(this.a, this, a);
        a.o = babVar;
        babVar.setHeaderTitle(a.e);
        return babVar;
    }

    public final void b(s07 s07Var, Context context) {
        this.u.add(new WeakReference(s07Var));
        s07Var.k(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s07 s07Var = (s07) weakReference.get();
            if (s07Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                s07Var.d(this, z);
            }
        }
        this.s = false;
    }

    @Override
    public final void clear() {
        c07 c07Var = this.v;
        if (c07Var != null) {
            d(c07Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(c07 c07Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == c07Var) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                s07 s07Var = (s07) weakReference.get();
                if (s07Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = s07Var.g(c07Var);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(yz6 yz6Var, MenuItem menuItem) {
        wz6 wz6Var = this.e;
        if (wz6Var != null && wz6Var.B(yz6Var, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(c07 c07Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s07 s07Var = (s07) weakReference.get();
            if (s07Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = s07Var.i(c07Var);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.v = c07Var;
        }
        return z;
    }

    @Override
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c07 c07Var = (c07) arrayList.get(i2);
            if (c07Var.a == i) {
                return c07Var;
            }
            if (c07Var.hasSubMenu() && (findItem = c07Var.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final c07 g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (c07) arrayList.get(0);
            }
            boolean n = n();
            for (int i2 = 0; i2 < size; i2++) {
                c07 c07Var = (c07) arrayList.get(i2);
                if (n) {
                    c = c07Var.j;
                } else {
                    c = c07Var.h;
                }
                char[] cArr = keyData.meta;
                if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i == 67))) {
                    return c07Var;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                c07 c07Var = (c07) arrayList2.get(i3);
                if (c07Var.hasSubMenu()) {
                    c07Var.o.h(arrayList, i, keyEvent);
                }
                if (n) {
                    c = c07Var.j;
                    i2 = c07Var.k;
                } else {
                    c = c07Var.h;
                    i2 = c07Var.i;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == '\b' && i == 67)) && c07Var.isEnabled()) {
                        arrayList.add(c07Var);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (!this.x) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c07) arrayList.get(i)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l = l();
        if (!this.k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s07 s07Var = (s07) weakReference.get();
            if (s07Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z |= s07Var.c();
            }
        }
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.j;
        if (z) {
            arrayList.clear();
            arrayList2.clear();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                c07 c07Var = (c07) l.get(i);
                if ((c07Var.x & 32) == 32) {
                    arrayList.add(c07Var);
                } else {
                    arrayList2.add(c07Var);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.k = false;
    }

    @Override
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (g(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            c07 c07Var = (c07) arrayList2.get(i);
            if (c07Var.isVisible()) {
                arrayList.add(c07Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (!this.p) {
            if (z) {
                this.h = true;
                this.k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    s07 s07Var = (s07) weakReference.get();
                    if (s07Var == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        s07Var.j();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.q = true;
        if (z) {
            this.r = true;
        }
    }

    @Override
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        c07 g = g(i, keyEvent);
        if (g != null) {
            z = q(g, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            c(true);
        }
        return z;
    }

    public final boolean q(android.view.MenuItem r7, defpackage.s07 r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz6.q(android.view.MenuItem, s07, int):boolean");
    }

    public final void r(s07 s07Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s07 s07Var2 = (s07) weakReference.get();
            if (s07Var2 == null || s07Var2 == s07Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((c07) arrayList.get(i3)).b == i) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((c07) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((c07) arrayList.get(i2)).a == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((bab) item.getSubMenu()).s(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c07 c07Var = (c07) arrayList.get(i3);
            if (c07Var.b == i) {
                int i4 = c07Var.x & (-5);
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                c07Var.x = i4 | i2;
                c07Var.setCheckable(z);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c07 c07Var = (c07) arrayList.get(i2);
            if (c07Var.b == i) {
                c07Var.setEnabled(z);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            c07 c07Var = (c07) arrayList.get(i3);
            if (c07Var.b == i) {
                int i4 = c07Var.x;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                c07Var.x = i6;
                if (i4 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((bab) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public yz6 k() {
        return this;
    }
}
