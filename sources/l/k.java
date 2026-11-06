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
    public static final int[] f17667y = {1, 4, 5, 3, 2, 0};
    public final Context f17668a;
    public final Resources f17669b;
    public boolean f17670c;
    public final boolean d;
    public i f17671e;
    public final ArrayList f17672f;
    public final ArrayList f17673g;
    public boolean h;
    public final ArrayList f17674i;
    public final ArrayList f17675j;
    public boolean f17676k;
    public CharSequence f17678m;
    public Drawable f17679n;
    public View f17680o;
    public m v;
    public boolean f17688x;
    public int f17677l = 0;
    public boolean f17681p = false;
    public boolean f17682q = false;
    public boolean f17683r = false;
    public boolean f17684s = false;
    public final ArrayList f17685t = new ArrayList();
    public final CopyOnWriteArrayList f17686u = new CopyOnWriteArrayList();
    public boolean f17687w = false;

    public k(Context context) {
        boolean z9;
        boolean z10 = false;
        this.f17668a = context;
        Resources resources = context.getResources();
        this.f17669b = resources;
        this.f17672f = new ArrayList();
        this.f17673g = new ArrayList();
        this.h = true;
        this.f17674i = new ArrayList();
        this.f17675j = new ArrayList();
        this.f17676k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = j0.f54106a;
            if (Build.VERSION.SDK_INT >= 28) {
                z9 = d1.f.B(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (z9) {
                z10 = true;
            }
        }
        this.d = z10;
    }

    public final m a(int i7, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0 && i13 < 6) {
            int i14 = (f17667y[i13] << 16) | (65535 & i11);
            m mVar = new m(this, i7, i10, i11, i14, charSequence, this.f17677l);
            ArrayList arrayList = this.f17672f;
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
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        Intent intent2;
        int i14;
        PackageManager packageManager = this.f17668a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i13 = queryIntentActivityOptions.size();
        } else {
            i13 = 0;
        }
        if ((i12 & 1) == 0) {
            removeGroup(i7);
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
            m a10 = a(i7, i10, i11, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f17697g = intent3;
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
        this.f17686u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f17676k = true;
    }

    public final void c(boolean z9) {
        if (this.f17684s) {
            return;
        }
        this.f17684s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17686u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z9);
            }
        }
        this.f17684s = false;
    }

    @Override
    public final void clear() {
        m mVar = this.v;
        if (mVar != null) {
            d(mVar);
        }
        this.f17672f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f17679n = null;
        this.f17678m = null;
        this.f17680o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17686u;
        boolean z9 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == mVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z9 = xVar.k(mVar);
                    if (z9) {
                        break;
                    }
                }
            }
            v();
            if (z9) {
                this.v = null;
            }
        }
        return z9;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.f17671e;
        if (iVar != null && iVar.F0(kVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17686u;
        boolean z9 = false;
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
                z9 = xVar.b(mVar);
                if (z9) {
                    break;
                }
            }
        }
        v();
        if (z9) {
            this.v = mVar;
        }
        return z9;
    }

    @Override
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        ArrayList arrayList = this.f17672f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f17692a == i7) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (findItem = mVar.f17704o.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final m g(int i7, KeyEvent keyEvent) {
        char c10;
        ArrayList arrayList = this.f17685t;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
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
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (n10) {
                c10 = mVar.f17699j;
            } else {
                c10 = mVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i7 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f17672f.get(i7);
    }

    public final void h(List list, int i7, KeyEvent keyEvent) {
        char c10;
        int i10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList = this.f17672f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList.get(i11);
                if (mVar.hasSubMenu()) {
                    mVar.f17704o.h(list, i7, keyEvent);
                }
                if (n10) {
                    c10 = mVar.f17699j;
                } else {
                    c10 = mVar.h;
                }
                if (n10) {
                    i10 = mVar.f17700k;
                } else {
                    i10 = mVar.f17698i;
                }
                if ((modifiers & 69647) == (i10 & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == '\b' && i7 == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (!this.f17688x) {
            ArrayList arrayList = this.f17672f;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f17676k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17686u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z9 |= xVar.d();
            }
        }
        ArrayList arrayList = this.f17674i;
        ArrayList arrayList2 = this.f17675j;
        if (z9) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i7 = 0; i7 < size; i7++) {
                m mVar = (m) l10.get(i7);
                if ((mVar.f17712x & 32) == 32) {
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
        this.f17676k = false;
    }

    @Override
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        if (g(i7, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z9 = this.h;
        ArrayList arrayList = this.f17673g;
        if (!z9) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f17672f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) arrayList2.get(i7);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.h = false;
        this.f17676k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f17687w;
    }

    public boolean n() {
        return this.f17670c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z9) {
        if (!this.f17681p) {
            if (z9) {
                this.h = true;
                this.f17676k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f17686u;
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
        this.f17682q = true;
        if (z9) {
            this.f17683r = true;
        }
    }

    @Override
    public final boolean performIdentifierAction(int i7, int i10) {
        return q(findItem(i7), null, i10);
    }

    @Override
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        boolean z9;
        m g10 = g(i7, keyEvent);
        if (g10 != null) {
            z9 = q(g10, null, i10);
        } else {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            c(true);
        }
        return z9;
    }

    public final boolean q(android.view.MenuItem r7, l.x r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: l.k.q(android.view.MenuItem, l.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17686u;
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
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f17672f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((m) arrayList.get(i11)).f17693b == i7) {
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
                if (i10 >= size2 || ((m) arrayList.get(i11)).f17693b != i7) {
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
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f17672f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((m) arrayList.get(i10)).f17692a == i7) {
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
            int size = this.f17672f.size();
            for (int i7 = 0; i7 < size; i7++) {
                MenuItem item = getItem(i7);
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
    public final void setGroupCheckable(int i7, boolean z9, boolean z10) {
        int i10;
        ArrayList arrayList = this.f17672f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f17693b == i7) {
                int i12 = mVar.f17712x & (-5);
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                mVar.f17712x = i12 | i10;
                mVar.setCheckable(z9);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z9) {
        this.f17687w = z9;
    }

    @Override
    public final void setGroupEnabled(int i7, boolean z9) {
        ArrayList arrayList = this.f17672f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f17693b == i7) {
                mVar.setEnabled(z9);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i7, boolean z9) {
        int i10;
        ArrayList arrayList = this.f17672f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f17693b == i7) {
                int i12 = mVar.f17712x;
                int i13 = i12 & (-9);
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                int i14 = i13 | i10;
                mVar.f17712x = i14;
                if (i12 != i14) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override
    public void setQwertyMode(boolean z9) {
        this.f17670c = z9;
        p(false);
    }

    @Override
    public final int size() {
        return this.f17672f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f17672f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
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

    public final void u(int i7, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f17680o = view;
            this.f17678m = null;
            this.f17679n = null;
        } else {
            if (i7 > 0) {
                this.f17678m = this.f17669b.getText(i7);
            } else if (charSequence != null) {
                this.f17678m = charSequence;
            }
            if (i10 > 0) {
                this.f17679n = this.f17668a.getDrawable(i10);
            } else if (drawable != null) {
                this.f17679n = drawable;
            }
            this.f17680o = null;
        }
        p(false);
    }

    public final void v() {
        this.f17681p = false;
        if (this.f17682q) {
            this.f17682q = false;
            p(this.f17683r);
        }
    }

    public final void w() {
        if (!this.f17681p) {
            this.f17681p = true;
            this.f17682q = false;
            this.f17683r = false;
        }
    }

    @Override
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f17669b.getString(i7));
    }

    @Override
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f17669b.getString(i7));
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return a(i7, i10, i11, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        m a10 = a(i7, i10, i11, charSequence);
        d0 d0Var = new d0(this.f17668a, this, a10);
        a10.f17704o = d0Var;
        d0Var.setHeaderTitle(a10.f17695e);
        return d0Var;
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return a(i7, i10, i11, this.f17669b.getString(i12));
    }

    @Override
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return addSubMenu(i7, i10, i11, this.f17669b.getString(i12));
    }

    public k k() {
        return this;
    }
}
