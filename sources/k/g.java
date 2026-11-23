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
    public final Menu f18066a;
    public boolean h;
    public int f18072i;
    public int f18073j;
    public CharSequence f18074k;
    public CharSequence f18075l;
    public int f18076m;
    public char f18077n;
    public int f18078o;
    public char f18079p;
    public int f18080q;
    public int f18081r;
    public boolean f18082s;
    public boolean f18083t;
    public boolean f18084u;
    public int v;
    public int f18085w;
    public String f18086x;
    public String f18087y;
    public n f18088z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f18067b = 0;
    public int f18068c = 0;
    public int d = 0;
    public int f18069e = 0;
    public boolean f18070f = true;
    public boolean f18071g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f18066a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f18093c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z10;
        h hVar = this.E;
        Context context = hVar.f18093c;
        MenuItem enabled = menuItem.setChecked(this.f18082s).setVisible(this.f18083t).setEnabled(this.f18084u);
        boolean z11 = false;
        if (this.f18081r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f18075l).setIcon(this.f18076m);
        int i7 = this.v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        if (this.f18087y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f18087y;
                ?? obj2 = new Object();
                obj2.f18064a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f18065b = cls.getMethod(str, f.f18063c);
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
        if (this.f18081r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f19218x = (mVar.f19218x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f19228c;
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
        String str2 = this.f18086x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f18089e, hVar.f18091a));
            z11 = true;
        }
        int i10 = this.f18085w;
        if (i10 > 0) {
            if (!z11) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f18088z;
        if (nVar != null) {
            if (menuItem instanceof l0.a) {
                ((l0.a) menuItem).a(nVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof l0.a;
        if (z12) {
            ((l0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.l(menuItem, charSequence2);
        }
        char c10 = this.f18077n;
        int i11 = this.f18078o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.g(menuItem, c10, i11);
        }
        char c11 = this.f18079p;
        int i12 = this.f18080q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.k(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.i.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.i.i(menuItem, colorStateList);
            }
        }
    }
}
