package k;

import a8.p0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import l.m;
import l.n;
import l.r;
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final h E;
    public final Menu f17119a;
    public boolean h;
    public int f17125i;
    public int f17126j;
    public CharSequence f17127k;
    public CharSequence f17128l;
    public int f17129m;
    public char f17130n;
    public int f17131o;
    public char f17132p;
    public int f17133q;
    public int f17134r;
    public boolean f17135s;
    public boolean f17136t;
    public boolean f17137u;
    public int v;
    public int f17138w;
    public String f17139x;
    public String f17140y;
    public n f17141z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f17120b = 0;
    public int f17121c = 0;
    public int d = 0;
    public int f17122e = 0;
    public boolean f17123f = true;
    public boolean f17124g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f17119a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f17146c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z9;
        h hVar = this.E;
        Context context = hVar.f17146c;
        MenuItem enabled = menuItem.setChecked(this.f17135s).setVisible(this.f17136t).setEnabled(this.f17137u);
        boolean z10 = false;
        if (this.f17134r >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        enabled.setCheckable(z9).setTitleCondensed(this.f17128l).setIcon(this.f17129m);
        int i7 = this.v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        if (this.f17140y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f17140y;
                ?? obj2 = new Object();
                obj2.f17117a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f17118b = cls.getMethod(str, f.f17116c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e10) {
                    StringBuilder u10 = p0.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                    u10.append(cls.getName());
                    InflateException inflateException = new InflateException(u10.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f17134r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f17715x = (mVar.f17715x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f17725c;
                try {
                    if (rVar.d == null) {
                        rVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str2 = this.f17139x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f17142e, hVar.f17144a));
            z10 = true;
        }
        int i10 = this.f17138w;
        if (i10 > 0) {
            if (!z10) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f17141z;
        if (nVar != null) {
            if (menuItem instanceof l0.a) {
                ((l0.a) menuItem).a(nVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z11 = menuItem instanceof l0.a;
        if (z11) {
            ((l0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.l(menuItem, charSequence2);
        }
        char c10 = this.f17130n;
        int i11 = this.f17131o;
        if (z11) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.g(menuItem, c10, i11);
        }
        char c11 = this.f17132p;
        int i12 = this.f17133q;
        if (z11) {
            ((l0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.k(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.i.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.i.i(menuItem, colorStateList);
            }
        }
    }
}
