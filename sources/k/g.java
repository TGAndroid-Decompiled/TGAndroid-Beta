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
    public final Menu f17677a;
    public boolean h;
    public int f17683i;
    public int f17684j;
    public CharSequence f17685k;
    public CharSequence f17686l;
    public int f17687m;
    public char f17688n;
    public int f17689o;
    public char f17690p;
    public int f17691q;
    public int f17692r;
    public boolean f17693s;
    public boolean f17694t;
    public boolean f17695u;
    public int v;
    public int f17696w;
    public String f17697x;
    public String f17698y;
    public n f17699z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f17678b = 0;
    public int f17679c = 0;
    public int d = 0;
    public int f17680e = 0;
    public boolean f17681f = true;
    public boolean f17682g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f17677a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f17704c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f17704c;
        MenuItem enabled = menuItem.setChecked(this.f17693s).setVisible(this.f17694t).setEnabled(this.f17695u);
        boolean z11 = false;
        if (this.f17692r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f17686l).setIcon(this.f17687m);
        int i7 = this.v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        if (this.f17698y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f17698y;
                ?? obj2 = new Object();
                obj2.f17675a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f17676b = cls.getMethod(str, f.f17674c);
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
        if (this.f17692r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f18857x = (mVar.f18857x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f18867c;
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
        String str2 = this.f17697x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f17700e, hVar.f17702a));
            z11 = true;
        }
        int i10 = this.f17696w;
        if (i10 > 0) {
            if (!z11) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f17699z;
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
            f2.h.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.h.l(menuItem, charSequence2);
        }
        char c10 = this.f17688n;
        int i11 = this.f17689o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.h.g(menuItem, c10, i11);
        }
        char c11 = this.f17690p;
        int i12 = this.f17691q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.h.k(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.h.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.h.i(menuItem, colorStateList);
            }
        }
    }
}
