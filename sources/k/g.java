package k;

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
    public final Menu f16013a;
    public boolean h;
    public int f16018i;
    public int f16019j;
    public CharSequence f16020k;
    public CharSequence f16021l;
    public int f16022m;
    public char f16023n;
    public int f16024o;
    public char f16025p;
    public int f16026q;
    public int f16027r;
    public boolean f16028s;
    public boolean f16029t;
    public boolean f16030u;
    public int v;
    public int f16031w;
    public String f16032x;
    public String f16033y;
    public n f16034z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f16014b = 0;
    public int f16015c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f16016f = true;
    public boolean f16017g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f16013a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f16038c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z10;
        h hVar = this.E;
        Context context = hVar.f16038c;
        MenuItem enabled = menuItem.setChecked(this.f16028s).setVisible(this.f16029t).setEnabled(this.f16030u);
        boolean z11 = false;
        if (this.f16027r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f16021l).setIcon(this.f16022m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f16033y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f16033y;
                ?? obj2 = new Object();
                obj2.f16011a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f16012b = cls.getMethod(str, f.f16010c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder v = a1.g.v("Couldn't resolve menu item onClick handler ", str, " in class ");
                    v.append(cls.getName());
                    InflateException inflateException = new InflateException(v.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f16027r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f16761x = (mVar.f16761x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f16771c;
                try {
                    if (rVar.d == null) {
                        rVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f16032x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.e, hVar.f16036a));
            z11 = true;
        }
        int i11 = this.f16031w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f16034z;
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
            x6.a.e(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            x6.a.i(menuItem, charSequence2);
        }
        char c10 = this.f16023n;
        int i12 = this.f16024o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            x6.a.d(menuItem, c10, i12);
        }
        char c11 = this.f16025p;
        int i13 = this.f16026q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            x6.a.h(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                x6.a.g(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                x6.a.f(menuItem, colorStateList);
            }
        }
    }
}
