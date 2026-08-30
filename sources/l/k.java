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
import r0.k0;
public class k implements Menu {
    public static final int[] f11039y = {1, 4, 5, 3, 2, 0};
    public final Context f11040a;
    public final Resources f11041b;
    public boolean f11042c;
    public final boolean d;
    public i e;
    public final ArrayList f11043f;
    public final ArrayList f11044g;
    public boolean h;
    public final ArrayList f11045i;
    public final ArrayList f11046j;
    public boolean f11047k;
    public CharSequence f11049m;
    public Drawable f11050n;
    public View f11051o;
    public m v;
    public boolean f11059x;
    public int f11048l = 0;
    public boolean f11052p = false;
    public boolean f11053q = false;
    public boolean f11054r = false;
    public boolean f11055s = false;
    public final ArrayList f11056t = new ArrayList();
    public final CopyOnWriteArrayList f11057u = new CopyOnWriteArrayList();
    public boolean f11058w = false;

    public k(Context context) {
        boolean z4;
        boolean z10 = false;
        this.f11040a = context;
        Resources resources = context.getResources();
        this.f11041b = resources;
        this.f11043f = new ArrayList();
        this.f11044g = new ArrayList();
        this.h = true;
        this.f11045i = new ArrayList();
        this.f11046j = new ArrayList();
        this.f11047k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = k0.f43123a;
            if (Build.VERSION.SDK_INT >= 28) {
                z4 = d1.f.B(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                z10 = true;
            }
        }
        this.d = z10;
    }

    public final m a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f11039y[i14] << 16) | (65535 & i12);
            m mVar = new m(this, i10, i11, i12, i15, charSequence, this.f11048l);
            ArrayList arrayList = this.f11043f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((m) arrayList.get(size)).d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, mVar);
            p(true);
            return mVar;
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
        PackageManager packageManager = this.f11040a.getPackageManager();
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
            m a2 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f11067g = intent3;
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

    public final void b(x xVar, Context context) {
        this.f11057u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f11047k = true;
    }

    public final void c(boolean z4) {
        if (this.f11055s) {
            return;
        }
        this.f11055s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11057u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z4);
            }
        }
        this.f11055s = false;
    }

    @Override
    public final void clear() {
        m mVar = this.v;
        if (mVar != null) {
            d(mVar);
        }
        this.f11043f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f11050n = null;
        this.f11049m = null;
        this.f11051o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11057u;
        boolean z4 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == mVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 = xVar.k(mVar);
                    if (z4) {
                        break;
                    }
                }
            }
            v();
            if (z4) {
                this.v = null;
            }
        }
        return z4;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.e;
        if (iVar != null && iVar.p(kVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11057u;
        boolean z4 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 = xVar.b(mVar);
                if (z4) {
                    break;
                }
            }
        }
        v();
        if (z4) {
            this.v = mVar;
        }
        return z4;
    }

    @Override
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        ArrayList arrayList = this.f11043f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f11063a == i10) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (findItem = mVar.f11074o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final m g(int i10, KeyEvent keyEvent) {
        char c3;
        ArrayList arrayList = this.f11056t;
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
            return (m) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (n10) {
                c3 = mVar.f11069j;
            } else {
                c3 = mVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (n10 && c3 == '\b' && i10 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f11043f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        char c3;
        int i11;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f11043f;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                m mVar = (m) arrayList.get(i12);
                if (mVar.hasSubMenu()) {
                    mVar.f11074o.h(list, i10, keyEvent);
                }
                if (n10) {
                    c3 = mVar.f11069j;
                } else {
                    c3 = mVar.h;
                }
                if (n10) {
                    i11 = mVar.f11070k;
                } else {
                    i11 = mVar.f11068i;
                }
                if ((modifiers & 69647) == (i11 & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (n10 && c3 == '\b' && i10 == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (!this.f11059x) {
            ArrayList arrayList = this.f11043f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f11047k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11057u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 |= xVar.d();
            }
        }
        ArrayList arrayList = this.f11045i;
        ArrayList arrayList2 = this.f11046j;
        if (z4) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = (m) l10.get(i10);
                if ((mVar.f11082x & 32) == 32) {
                    arrayList.add(mVar);
                } else {
                    arrayList2.add(mVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f11047k = false;
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
        boolean z4 = this.h;
        ArrayList arrayList = this.f11044g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f11043f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList2.get(i10);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.h = false;
        this.f11047k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f11058w;
    }

    public boolean n() {
        return this.f11042c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z4) {
        if (!this.f11052p) {
            if (z4) {
                this.h = true;
                this.f11047k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f11057u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    x xVar = (x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        xVar.e();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f11053q = true;
        if (z4) {
            this.f11054r = true;
        }
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z4;
        m g10 = g(i10, keyEvent);
        if (g10 != null) {
            z4 = q(g10, null, i11);
        } else {
            z4 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z4;
    }

    public final boolean q(android.view.MenuItem r7, l.x r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: l.k.q(android.view.MenuItem, l.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11057u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f11043f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (((m) arrayList.get(i12)).f11064b == i10) {
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
                if (i11 >= size2 || ((m) arrayList.get(i12)).f11064b != i10) {
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
        ArrayList arrayList = this.f11043f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((m) arrayList.get(i11)).f11063a == i10) {
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
            int size = this.f11043f.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((d0) item.getSubMenu()).s(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z4, boolean z10) {
        int i11;
        ArrayList arrayList = this.f11043f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            m mVar = (m) arrayList.get(i12);
            if (mVar.f11064b == i10) {
                int i13 = mVar.f11082x & (-5);
                if (z10) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                mVar.f11082x = i13 | i11;
                mVar.setCheckable(z4);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z4) {
        this.f11058w = z4;
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z4) {
        ArrayList arrayList = this.f11043f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f11064b == i10) {
                mVar.setEnabled(z4);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i10, boolean z4) {
        int i11;
        ArrayList arrayList = this.f11043f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            m mVar = (m) arrayList.get(i12);
            if (mVar.f11064b == i10) {
                int i13 = mVar.f11082x;
                int i14 = i13 & (-9);
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                mVar.f11082x = i15;
                if (i13 != i15) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override
    public void setQwertyMode(boolean z4) {
        this.f11042c = z4;
        p(false);
    }

    @Override
    public final int size() {
        return this.f11043f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f11043f.size();
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
                ((d0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f11051o = view;
            this.f11049m = null;
            this.f11050n = null;
        } else {
            if (i10 > 0) {
                this.f11049m = this.f11041b.getText(i10);
            } else if (charSequence != null) {
                this.f11049m = charSequence;
            }
            if (i11 > 0) {
                this.f11050n = this.f11040a.getDrawable(i11);
            } else if (drawable != null) {
                this.f11050n = drawable;
            }
            this.f11051o = null;
        }
        p(false);
    }

    public final void v() {
        this.f11052p = false;
        if (this.f11053q) {
            this.f11053q = false;
            p(this.f11054r);
        }
    }

    public final void w() {
        if (!this.f11052p) {
            this.f11052p = true;
            this.f11053q = false;
            this.f11054r = false;
        }
    }

    @Override
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f11041b.getString(i10));
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f11041b.getString(i10));
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        m a2 = a(i10, i11, i12, charSequence);
        d0 d0Var = new d0(this.f11040a, this, a2);
        a2.f11074o = d0Var;
        d0Var.setHeaderTitle(a2.e);
        return d0Var;
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f11041b.getString(i13));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f11041b.getString(i13));
    }

    public k k() {
        return this;
    }
}
