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
public class k implements Menu {
    public static final int[] f17416y = {1, 4, 5, 3, 2, 0};
    public final Context f17417a;
    public final Resources f17418b;
    public boolean f17419c;
    public final boolean d;
    public i f17420e;
    public final ArrayList f17421f;
    public final ArrayList f17422g;
    public boolean h;
    public final ArrayList f17423i;
    public final ArrayList f17424j;
    public boolean f17425k;
    public CharSequence f17427m;
    public Drawable f17428n;
    public View f17429o;
    public m v;
    public boolean f17437x;
    public int f17426l = 0;
    public boolean f17430p = false;
    public boolean f17431q = false;
    public boolean f17432r = false;
    public boolean f17433s = false;
    public final ArrayList f17434t = new ArrayList();
    public final CopyOnWriteArrayList f17435u = new CopyOnWriteArrayList();
    public boolean f17436w = false;

    public k(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f17417a = context;
        Resources resources = context.getResources();
        this.f17418b = resources;
        this.f17421f = new ArrayList();
        this.f17422g = new ArrayList();
        this.h = true;
        this.f17423i = new ArrayList();
        this.f17424j = new ArrayList();
        this.f17425k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = j0.f54023a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = d1.f.B(viewConfiguration);
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

    public final m a(int i3, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0 && i13 < 6) {
            int i14 = (f17416y[i13] << 16) | (65535 & i11);
            m mVar = new m(this, i3, i10, i11, i14, charSequence, this.f17426l);
            ArrayList arrayList = this.f17421f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((m) arrayList.get(size)).d <= i14) {
                        i12 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i12 = 0;
                    break;
                }
            }
            arrayList.add(i12, mVar);
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
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        Intent intent2;
        int i14;
        PackageManager packageManager = this.f17417a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i13 = queryIntentActivityOptions.size();
        } else {
            i13 = 0;
        }
        if ((i12 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            if (i16 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i16];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m a10 = a(i3, i10, i11, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f17446g = intent3;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a10;
            }
        }
        return i13;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f17435u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f17425k = true;
    }

    public final void c(boolean z10) {
        if (this.f17433s) {
            return;
        }
        this.f17433s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17435u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.b(this, z10);
            }
        }
        this.f17433s = false;
    }

    @Override
    public final void clear() {
        m mVar = this.v;
        if (mVar != null) {
            d(mVar);
        }
        this.f17421f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f17428n = null;
        this.f17427m = null;
        this.f17429o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17435u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == mVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = xVar.k(mVar);
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

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.f17420e;
        if (iVar != null && iVar.U0(kVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17435u;
        boolean z10 = false;
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
                z10 = xVar.c(mVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.v = mVar;
        }
        return z10;
    }

    @Override
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f17421f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f17441a == i3) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (findItem = mVar.f17453o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final m g(int i3, KeyEvent keyEvent) {
        char c2;
        ArrayList arrayList = this.f17434t;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
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
        boolean n4 = n();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (n4) {
                c2 = mVar.f17448j;
            } else {
                c2 = mVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n4 && c2 == '\b' && i3 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f17421f.get(i3);
    }

    public final void h(List list, int i3, KeyEvent keyEvent) {
        char c2;
        int i10;
        boolean n4 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList = this.f17421f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList.get(i11);
                if (mVar.hasSubMenu()) {
                    mVar.f17453o.h(list, i3, keyEvent);
                }
                if (n4) {
                    c2 = mVar.f17448j;
                } else {
                    c2 = mVar.h;
                }
                if (n4) {
                    i10 = mVar.f17449k;
                } else {
                    i10 = mVar.f17447i;
                }
                if ((modifiers & 69647) == (i10 & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n4 && c2 == '\b' && i3 == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (!this.f17437x) {
            ArrayList arrayList = this.f17421f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((m) arrayList.get(i3)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f17425k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17435u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 |= xVar.d();
            }
        }
        ArrayList arrayList = this.f17423i;
        ArrayList arrayList2 = this.f17424j;
        if (z10) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i3 = 0; i3 < size; i3++) {
                m mVar = (m) l10.get(i3);
                if ((mVar.f17461x & 32) == 32) {
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
        this.f17425k = false;
    }

    @Override
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        if (g(i3, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.h;
        ArrayList arrayList = this.f17422g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f17421f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList2.get(i3);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.h = false;
        this.f17425k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f17436w;
    }

    public boolean n() {
        return this.f17419c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z10) {
        if (!this.f17430p) {
            if (z10) {
                this.h = true;
                this.f17425k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f17435u;
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
        this.f17431q = true;
        if (z10) {
            this.f17432r = true;
        }
    }

    @Override
    public final boolean performIdentifierAction(int i3, int i10) {
        return q(findItem(i3), null, i10);
    }

    @Override
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
        boolean z10;
        m g7 = g(i3, keyEvent);
        if (g7 != null) {
            z10 = q(g7, null, i10);
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    public final boolean q(android.view.MenuItem r7, l.x r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: l.k.q(android.view.MenuItem, l.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17435u;
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
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f17421f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((m) arrayList.get(i11)).f17442b == i3) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((m) arrayList.get(i11)).f17442b != i3) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f17421f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((m) arrayList.get(i10)).f17441a == i3) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f17421f.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem item = getItem(i3);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((d0) item.getSubMenu()).s(bundle);
                }
            }
            int i10 = bundle.getInt("android:menu:expandedactionview");
            if (i10 > 0 && (findItem = findItem(i10)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override
    public final void setGroupCheckable(int i3, boolean z10, boolean z11) {
        int i10;
        ArrayList arrayList = this.f17421f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f17442b == i3) {
                int i12 = mVar.f17461x & (-5);
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                mVar.f17461x = i12 | i10;
                mVar.setCheckable(z10);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z10) {
        this.f17436w = z10;
    }

    @Override
    public final void setGroupEnabled(int i3, boolean z10) {
        ArrayList arrayList = this.f17421f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f17442b == i3) {
                mVar.setEnabled(z10);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i3, boolean z10) {
        int i10;
        ArrayList arrayList = this.f17421f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f17442b == i3) {
                int i12 = mVar.f17461x;
                int i13 = i12 & (-9);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                int i14 = i13 | i10;
                mVar.f17461x = i14;
                if (i12 != i14) {
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
        this.f17419c = z10;
        p(false);
    }

    @Override
    public final int size() {
        return this.f17421f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f17421f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
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

    public final void u(int i3, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f17429o = view;
            this.f17427m = null;
            this.f17428n = null;
        } else {
            if (i3 > 0) {
                this.f17427m = this.f17418b.getText(i3);
            } else if (charSequence != null) {
                this.f17427m = charSequence;
            }
            if (i10 > 0) {
                this.f17428n = this.f17417a.getDrawable(i10);
            } else if (drawable != null) {
                this.f17428n = drawable;
            }
            this.f17429o = null;
        }
        p(false);
    }

    public final void v() {
        this.f17430p = false;
        if (this.f17431q) {
            this.f17431q = false;
            p(this.f17432r);
        }
    }

    public final void w() {
        if (!this.f17430p) {
            this.f17430p = true;
            this.f17431q = false;
            this.f17432r = false;
        }
    }

    @Override
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f17418b.getString(i3));
    }

    @Override
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f17418b.getString(i3));
    }

    @Override
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        return a(i3, i10, i11, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        m a10 = a(i3, i10, i11, charSequence);
        d0 d0Var = new d0(this.f17417a, this, a10);
        a10.f17453o = d0Var;
        d0Var.setHeaderTitle(a10.f17444e);
        return d0Var;
    }

    @Override
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        return a(i3, i10, i11, this.f17418b.getString(i12));
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return addSubMenu(i3, i10, i11, this.f17418b.getString(i12));
    }

    public k k() {
        return this;
    }
}
