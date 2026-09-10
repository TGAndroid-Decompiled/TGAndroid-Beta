package l;

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
import r0.j0;
public class l implements Menu {
    public static final int[] f12627y = {1, 4, 5, 3, 2, 0};
    public final Context f12628a;
    public final Resources f12629b;
    public boolean f12630c;
    public final boolean d;
    public j e;
    public final ArrayList f12631f;
    public final ArrayList f12632g;
    public boolean h;
    public final ArrayList f12633i;
    public final ArrayList f12634j;
    public boolean f12635k;
    public CharSequence f12637m;
    public Drawable f12638n;
    public View f12639o;
    public n v;
    public boolean f12647x;
    public int f12636l = 0;
    public boolean f12640p = false;
    public boolean f12641q = false;
    public boolean f12642r = false;
    public boolean f12643s = false;
    public final ArrayList f12644t = new ArrayList();
    public final CopyOnWriteArrayList f12645u = new CopyOnWriteArrayList();
    public boolean f12646w = false;

    public l(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f12628a = context;
        Resources resources = context.getResources();
        this.f12629b = resources;
        this.f12631f = new ArrayList();
        this.f12632g = new ArrayList();
        this.h = true;
        this.f12633i = new ArrayList();
        this.f12634j = new ArrayList();
        this.f12635k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = j0.f41067a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = b5.d.B(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.d = z11;
    }

    public final n a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f12627y[i14] << 16) | (65535 & i12);
            n nVar = new n(this, i10, i11, i12, i15, charSequence, this.f12636l);
            ArrayList arrayList = this.f12631f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((n) arrayList.get(size)).d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, nVar);
            p(true);
            return nVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f12628a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n a2 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f12655g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a2;
            }
        }
        return i14;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f12645u.add(new WeakReference(yVar));
        yVar.i(context, this);
        this.f12635k = true;
    }

    public final void c(boolean z10) {
        if (this.f12643s) {
            return;
        }
        this.f12643s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12645u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.c(this, z10);
            }
        }
        this.f12643s = false;
    }

    @Override
    public final void clear() {
        n nVar = this.v;
        if (nVar != null) {
            d(nVar);
        }
        this.f12631f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f12638n = null;
        this.f12637m = null;
        this.f12639o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12645u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == nVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = yVar.k(nVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.v = null;
            }
        }
        return z10;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.e;
        if (jVar != null && jVar.B(lVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12645u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = yVar.b(nVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.v = nVar;
        }
        return z10;
    }

    @Override
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        ArrayList arrayList = this.f12631f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f12651a == i10) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f12662o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final n g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList arrayList = this.f12644t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (n10) {
                c10 = nVar.f12657j;
            } else {
                c10 = nVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i10 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f12631f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f12631f;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                n nVar = (n) arrayList.get(i12);
                if (nVar.hasSubMenu()) {
                    nVar.f12662o.h(list, i10, keyEvent);
                }
                if (n10) {
                    c10 = nVar.f12657j;
                } else {
                    c10 = nVar.h;
                }
                if (n10) {
                    i11 = nVar.f12658k;
                } else {
                    i11 = nVar.f12656i;
                }
                if ((modifiers & 69647) == (i11 & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == '\b' && i10 == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (!this.f12647x) {
            ArrayList arrayList = this.f12631f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l4 = l();
        if (!this.f12635k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12645u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 |= yVar.d();
            }
        }
        ArrayList arrayList = this.f12633i;
        ArrayList arrayList2 = this.f12634j;
        if (z10) {
            arrayList.clear();
            arrayList2.clear();
            int size = l4.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) l4.get(i10);
                if ((nVar.f12670x & 32) == 32) {
                    arrayList.add(nVar);
                } else {
                    arrayList2.add(nVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f12635k = false;
    }

    @Override
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (g(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.h;
        ArrayList arrayList = this.f12632g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f12631f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList2.get(i10);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.h = false;
        this.f12635k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f12646w;
    }

    public boolean n() {
        return this.f12630c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z10) {
        if (!this.f12640p) {
            if (z10) {
                this.h = true;
                this.f12635k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f12645u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    y yVar = (y) weakReference.get();
                    if (yVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        yVar.e();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f12641q = true;
        if (z10) {
            this.f12642r = true;
        }
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        n g10 = g(i10, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    public final boolean q(android.view.MenuItem r7, l.y r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: l.l.q(android.view.MenuItem, l.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12645u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f12631f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (((n) arrayList.get(i12)).f12652b == i10) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((n) arrayList.get(i12)).f12652b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f12631f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((n) arrayList.get(i11)).f12651a == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f12631f.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((e0) item.getSubMenu()).s(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int i11;
        ArrayList arrayList = this.f12631f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f12652b == i10) {
                int i13 = nVar.f12670x & (-5);
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                nVar.f12670x = i13 | i11;
                nVar.setCheckable(z10);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z10) {
        this.f12646w = z10;
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f12631f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f12652b == i10) {
                nVar.setEnabled(z10);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        ArrayList arrayList = this.f12631f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f12652b == i10) {
                int i13 = nVar.f12670x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                nVar.f12670x = i15;
                if (i13 != i15) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override
    public void setQwertyMode(boolean z10) {
        this.f12630c = z10;
        p(false);
    }

    @Override
    public final int size() {
        return this.f12631f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f12631f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
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
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f12639o = view;
            this.f12637m = null;
            this.f12638n = null;
        } else {
            if (i10 > 0) {
                this.f12637m = this.f12629b.getText(i10);
            } else if (charSequence != null) {
                this.f12637m = charSequence;
            }
            if (i11 > 0) {
                this.f12638n = this.f12628a.getDrawable(i11);
            } else if (drawable != null) {
                this.f12638n = drawable;
            }
            this.f12639o = null;
        }
        p(false);
    }

    public final void v() {
        this.f12640p = false;
        if (this.f12641q) {
            this.f12641q = false;
            p(this.f12642r);
        }
    }

    public final void w() {
        if (!this.f12640p) {
            this.f12640p = true;
            this.f12641q = false;
            this.f12642r = false;
        }
    }

    @Override
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f12629b.getString(i10));
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f12629b.getString(i10));
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        n a2 = a(i10, i11, i12, charSequence);
        e0 e0Var = new e0(this.f12628a, this, a2);
        a2.f12662o = e0Var;
        e0Var.setHeaderTitle(a2.e);
        return e0Var;
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f12629b.getString(i13));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f12629b.getString(i13));
    }

    public l k() {
        return this;
    }
}
