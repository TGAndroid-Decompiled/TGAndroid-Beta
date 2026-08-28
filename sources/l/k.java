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
    public static final int[] f16553y = {1, 4, 5, 3, 2, 0};
    public final Context f16554a;
    public final Resources f16555b;
    public boolean f16556c;
    public final boolean d;
    public i f16557e;
    public final ArrayList f16558f;
    public final ArrayList f16559g;
    public boolean h;
    public final ArrayList f16560i;
    public final ArrayList f16561j;
    public boolean f16562k;
    public CharSequence f16564m;
    public Drawable f16565n;
    public View f16566o;
    public m v;
    public boolean f16574x;
    public int f16563l = 0;
    public boolean f16567p = false;
    public boolean f16568q = false;
    public boolean f16569r = false;
    public boolean f16570s = false;
    public final ArrayList f16571t = new ArrayList();
    public final CopyOnWriteArrayList f16572u = new CopyOnWriteArrayList();
    public boolean f16573w = false;

    public k(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f16554a = context;
        Resources resources = context.getResources();
        this.f16555b = resources;
        this.f16558f = new ArrayList();
        this.f16559g = new ArrayList();
        this.h = true;
        this.f16560i = new ArrayList();
        this.f16561j = new ArrayList();
        this.f16562k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = k0.f46921a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = d1.f.A(viewConfiguration);
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

    public final m a(int i9, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0 && i13 < 6) {
            int i14 = (f16553y[i13] << 16) | (65535 & i11);
            m mVar = new m(this, i9, i10, i11, i14, charSequence, this.f16563l);
            ArrayList arrayList = this.f16558f;
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
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        Intent intent2;
        int i14;
        PackageManager packageManager = this.f16554a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i13 = queryIntentActivityOptions.size();
        } else {
            i13 = 0;
        }
        if ((i12 & 1) == 0) {
            removeGroup(i9);
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
            m a2 = a(i9, i10, i11, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f16583g = intent3;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a2;
            }
        }
        return i13;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f16572u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f16562k = true;
    }

    public final void c(boolean z10) {
        if (this.f16570s) {
            return;
        }
        this.f16570s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16572u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z10);
            }
        }
        this.f16570s = false;
    }

    @Override
    public final void clear() {
        m mVar = this.v;
        if (mVar != null) {
            d(mVar);
        }
        this.f16558f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f16565n = null;
        this.f16564m = null;
        this.f16566o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16572u;
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
        i iVar = this.f16557e;
        if (iVar != null && iVar.r(kVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16572u;
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
                z10 = xVar.b(mVar);
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
    public final MenuItem findItem(int i9) {
        MenuItem findItem;
        ArrayList arrayList = this.f16558f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f16578a == i9) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (findItem = mVar.f16590o.findItem(i9)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final m g(int i9, KeyEvent keyEvent) {
        char c10;
        ArrayList arrayList = this.f16571t;
        arrayList.clear();
        h(arrayList, i9, keyEvent);
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
                c10 = mVar.f16585j;
            } else {
                c10 = mVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i9 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i9) {
        return (MenuItem) this.f16558f.get(i9);
    }

    public final void h(List list, int i9, KeyEvent keyEvent) {
        char c10;
        int i10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i9 == 67) {
            ArrayList arrayList = this.f16558f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList.get(i11);
                if (mVar.hasSubMenu()) {
                    mVar.f16590o.h(list, i9, keyEvent);
                }
                if (n10) {
                    c10 = mVar.f16585j;
                } else {
                    c10 = mVar.h;
                }
                if (n10) {
                    i10 = mVar.f16586k;
                } else {
                    i10 = mVar.f16584i;
                }
                if ((modifiers & 69647) == (i10 & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == '\b' && i9 == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (!this.f16574x) {
            ArrayList arrayList = this.f16558f;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((m) arrayList.get(i9)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f16562k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16572u;
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
        ArrayList arrayList = this.f16560i;
        ArrayList arrayList2 = this.f16561j;
        if (z10) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i9 = 0; i9 < size; i9++) {
                m mVar = (m) l10.get(i9);
                if ((mVar.f16598x & 32) == 32) {
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
        this.f16562k = false;
    }

    @Override
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        if (g(i9, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.h;
        ArrayList arrayList = this.f16559g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f16558f;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            m mVar = (m) arrayList2.get(i9);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.h = false;
        this.f16562k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f16573w;
    }

    public boolean n() {
        return this.f16556c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z10) {
        if (!this.f16567p) {
            if (z10) {
                this.h = true;
                this.f16562k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f16572u;
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
        this.f16568q = true;
        if (z10) {
            this.f16569r = true;
        }
    }

    @Override
    public final boolean performIdentifierAction(int i9, int i10) {
        return q(findItem(i9), null, i10);
    }

    @Override
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        boolean z10;
        m g10 = g(i9, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i10);
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
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16572u;
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
    public final void removeGroup(int i9) {
        ArrayList arrayList = this.f16558f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((m) arrayList.get(i11)).f16579b == i9) {
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
                if (i10 >= size2 || ((m) arrayList.get(i11)).f16579b != i9) {
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
    public final void removeItem(int i9) {
        ArrayList arrayList = this.f16558f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((m) arrayList.get(i10)).f16578a == i9) {
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
            int size = this.f16558f.size();
            for (int i9 = 0; i9 < size; i9++) {
                MenuItem item = getItem(i9);
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
    public final void setGroupCheckable(int i9, boolean z10, boolean z11) {
        int i10;
        ArrayList arrayList = this.f16558f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f16579b == i9) {
                int i12 = mVar.f16598x & (-5);
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                mVar.f16598x = i12 | i10;
                mVar.setCheckable(z10);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z10) {
        this.f16573w = z10;
    }

    @Override
    public final void setGroupEnabled(int i9, boolean z10) {
        ArrayList arrayList = this.f16558f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f16579b == i9) {
                mVar.setEnabled(z10);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i9, boolean z10) {
        int i10;
        ArrayList arrayList = this.f16558f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f16579b == i9) {
                int i12 = mVar.f16598x;
                int i13 = i12 & (-9);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                int i14 = i13 | i10;
                mVar.f16598x = i14;
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
        this.f16556c = z10;
        p(false);
    }

    @Override
    public final int size() {
        return this.f16558f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f16558f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = getItem(i9);
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

    public final void u(int i9, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f16566o = view;
            this.f16564m = null;
            this.f16565n = null;
        } else {
            if (i9 > 0) {
                this.f16564m = this.f16555b.getText(i9);
            } else if (charSequence != null) {
                this.f16564m = charSequence;
            }
            if (i10 > 0) {
                this.f16565n = this.f16554a.getDrawable(i10);
            } else if (drawable != null) {
                this.f16565n = drawable;
            }
            this.f16566o = null;
        }
        p(false);
    }

    public final void v() {
        this.f16567p = false;
        if (this.f16568q) {
            this.f16568q = false;
            p(this.f16569r);
        }
    }

    public final void w() {
        if (!this.f16567p) {
            this.f16567p = true;
            this.f16568q = false;
            this.f16569r = false;
        }
    }

    @Override
    public final MenuItem add(int i9) {
        return a(0, 0, 0, this.f16555b.getString(i9));
    }

    @Override
    public final SubMenu addSubMenu(int i9) {
        return addSubMenu(0, 0, 0, this.f16555b.getString(i9));
    }

    @Override
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return a(i9, i10, i11, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        m a2 = a(i9, i10, i11, charSequence);
        d0 d0Var = new d0(this.f16554a, this, a2);
        a2.f16590o = d0Var;
        d0Var.setHeaderTitle(a2.f16581e);
        return d0Var;
    }

    @Override
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        return a(i9, i10, i11, this.f16555b.getString(i12));
    }

    @Override
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return addSubMenu(i9, i10, i11, this.f16555b.getString(i12));
    }

    public k k() {
        return this;
    }
}
