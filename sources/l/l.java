package l;

import android.content.ActivityNotFoundException;
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
import android.util.Log;
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
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.k0;

public class l implements Menu {

    public static final int[] f15309y = {1, 4, 5, 3, 2, 0};

    public final Context f15310a;

    public final Resources f15311b;

    public boolean f15312c;
    public final boolean d;

    public j f15313e;

    public final ArrayList f15314f;

    public final ArrayList f15315g;
    public boolean h;

    public final ArrayList f15316i;

    public final ArrayList f15317j;

    public boolean f15318k;

    public CharSequence f15320m;

    public Drawable f15321n;

    public View f15322o;
    public n v;

    public boolean f15330x;

    public int f15319l = 0;

    public boolean f15323p = false;

    public boolean f15324q = false;

    public boolean f15325r = false;

    public boolean f15326s = false;

    public final ArrayList f15327t = new ArrayList();

    public final CopyOnWriteArrayList f15328u = new CopyOnWriteArrayList();

    public boolean f15329w = false;

    public l(Context context) {
        boolean zA;
        boolean z10 = false;
        this.f15310a = context;
        Resources resources = context.getResources();
        this.f15311b = resources;
        this.f15314f = new ArrayList();
        this.f15315g = new ArrayList();
        this.h = true;
        this.f15316i = new ArrayList();
        this.f15317j = new ArrayList();
        this.f15318k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = k0.f46611a;
            if (Build.VERSION.SDK_INT >= 28) {
                zA = d1.f.A(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zA = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zA) {
                z10 = true;
            }
        }
        this.d = z10;
    }

    public final n a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f15309y[i14] << 16) | (65535 & i12);
        n nVar = new n(this, i10, i11, i12, i15, charSequence, this.f15319l);
        ArrayList arrayList = this.f15314f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n) arrayList.get(size)).d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, nVar);
                p(true);
                return nVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, nVar);
        p(true);
        return nVar;
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f15310a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f15339g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = nVarA;
            }
        }
        return size;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f15328u.add(new WeakReference(yVar));
        yVar.i(context, this);
        this.f15318k = true;
    }

    public final void c(boolean z10) {
        if (this.f15326s) {
            return;
        }
        this.f15326s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15328u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z10);
            }
        }
        this.f15326s = false;
    }

    @Override
    public final void clear() {
        n nVar = this.v;
        if (nVar != null) {
            d(nVar);
        }
        this.f15314f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f15321n = null;
        this.f15320m = null;
        this.f15322o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15328u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == nVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar != null) {
                    zK = yVar.k(nVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zK) {
                this.v = null;
            }
        }
        return zK;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f15313e;
        return jVar != null && jVar.t(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15328u;
        boolean zC = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar != null) {
                zC = yVar.c(nVar);
                if (zC) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zC) {
            this.v = nVar;
        }
        return zC;
    }

    @Override
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f15314f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f15334a == i10) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f15346o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f15327t;
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
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            char c10 = zN ? nVar.f15341j : nVar.h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i10 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f15314f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f15314f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList.get(i11);
                if (nVar.hasSubMenu()) {
                    nVar.f15346o.h(list, i10, keyEvent);
                }
                char c10 = zN ? nVar.f15341j : nVar.h;
                if ((modifiers & 69647) == ((zN ? nVar.f15342k : nVar.f15340i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i10 == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (this.f15330x) {
            return true;
        }
        ArrayList arrayList = this.f15314f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f15318k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15328u;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= yVar.d();
                }
            }
            ArrayList arrayList = this.f15316i;
            ArrayList arrayList2 = this.f15317j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n nVar = (n) arrayListL.get(i10);
                    if ((nVar.f15354x & 32) == 32) {
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
            this.f15318k = false;
        }
    }

    @Override
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.h;
        ArrayList arrayList = this.f15315g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f15314f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList2.get(i10);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.h = false;
        this.f15318k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f15329w;
    }

    public boolean n() {
        return this.f15312c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z10) {
        if (this.f15323p) {
            this.f15324q = true;
            if (z10) {
                this.f15325r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.h = true;
            this.f15318k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15328u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.e();
            }
        }
        v();
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        n nVarG = g(i10, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    public final boolean q(MenuItem menuItem, y yVar, int i10) {
        o oVar;
        boolean zExpandActionView;
        o oVar2;
        boolean z10;
        e0 e0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        y yVar2;
        n nVar = (n) menuItem;
        boolean zJ = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        l lVar = nVar.f15345n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f15347p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) && !lVar.e(lVar, nVar)) {
            Intent intent = nVar.f15339g;
            if (intent != null) {
                try {
                    lVar.f15310a.startActivity(intent);
                } catch (ActivityNotFoundException e9) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e9);
                    oVar = nVar.A;
                    if (oVar == null) {
                    }
                    zExpandActionView = false;
                    oVar2 = nVar.A;
                    if (oVar2 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (nVar.e()) {
                        zExpandActionView |= nVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (nVar.hasSubMenu()) {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            e0 e0Var2 = new e0(this.f15310a, this, nVar);
                            nVar.f15346o = e0Var2;
                            e0Var2.setHeaderTitle(nVar.f15337e);
                        }
                        e0Var = nVar.f15346o;
                        if (z10) {
                            oVar2.f15357a.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f15328u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (yVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zJ) {
                                    zJ = yVar2.j(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zJ;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            e0 e0Var3 = new e0(this.f15310a, this, nVar);
                            nVar.f15346o = e0Var3;
                            e0Var3.setHeaderTitle(nVar.f15337e);
                        }
                        e0Var = nVar.f15346o;
                        if (z10) {
                            oVar2.f15357a.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f15328u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zJ = yVar != null ? yVar.j(e0Var) : false;
                            while (r8.hasNext()) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zJ) {
                                    zJ = yVar2.j(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zJ;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                oVar = nVar.A;
                if (oVar == null && oVar.f15357a.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        oVar2 = nVar.A;
        if (oVar2 == null && oVar2.f15357a.hasSubMenu()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                e0 e0Var4 = new e0(this.f15310a, this, nVar);
                nVar.f15346o = e0Var4;
                e0Var4.setHeaderTitle(nVar.f15337e);
            }
            e0Var = nVar.f15346o;
            if (z10) {
                oVar2.f15357a.onPrepareSubMenu(e0Var);
            }
            copyOnWriteArrayList = this.f15328u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (yVar != null) {
                }
                while (r8.hasNext()) {
                    yVar2 = (y) weakReference.get();
                    if (yVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = yVar2.j(e0Var);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15328u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f15314f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((n) arrayList.get(i12)).f15335b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((n) arrayList.get(i12)).f15335b != i10) {
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
        ArrayList arrayList = this.f15314f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((n) arrayList.get(i11)).f15334a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f15314f.size();
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
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f15314f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f15335b == i10) {
                nVar.f15354x = (nVar.f15354x & (-5)) | (z11 ? 4 : 0);
                nVar.setCheckable(z10);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z10) {
        this.f15329w = z10;
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f15314f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f15335b == i10) {
                nVar.setEnabled(z10);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f15314f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f15335b == i10) {
                int i12 = nVar.f15354x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                nVar.f15354x = i13;
                if (i12 != i13) {
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
        this.f15312c = z10;
        p(false);
    }

    @Override
    public final int size() {
        return this.f15314f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f15314f.size();
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
            this.f15322o = view;
            this.f15320m = null;
            this.f15321n = null;
        } else {
            if (i10 > 0) {
                this.f15320m = this.f15311b.getText(i10);
            } else if (charSequence != null) {
                this.f15320m = charSequence;
            }
            if (i11 > 0) {
                this.f15321n = this.f15310a.getDrawable(i11);
            } else if (drawable != null) {
                this.f15321n = drawable;
            }
            this.f15322o = null;
        }
        p(false);
    }

    public final void v() {
        this.f15323p = false;
        if (this.f15324q) {
            this.f15324q = false;
            p(this.f15325r);
        }
    }

    public final void w() {
        if (this.f15323p) {
            return;
        }
        this.f15323p = true;
        this.f15324q = false;
        this.f15325r = false;
    }

    @Override
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f15311b.getString(i10));
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f15311b.getString(i10));
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        n nVarA = a(i10, i11, i12, charSequence);
        e0 e0Var = new e0(this.f15310a, this, nVarA);
        nVarA.f15346o = e0Var;
        e0Var.setHeaderTitle(nVarA.f15337e);
        return e0Var;
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f15311b.getString(i13));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f15311b.getString(i13));
    }

    public l k() {
        return this;
    }
}
