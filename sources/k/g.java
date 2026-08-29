package k;

import a4.w;
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
import l.n;
import l.r;
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final h E;
    public final Menu f13208a;
    public boolean h;
    public int f13214i;
    public int f13215j;
    public CharSequence f13216k;
    public CharSequence f13217l;
    public int f13218m;
    public char f13219n;
    public int f13220o;
    public char f13221p;
    public int f13222q;
    public int f13223r;
    public boolean f13224s;
    public boolean f13225t;
    public boolean f13226u;
    public int v;
    public int f13227w;
    public String f13228x;
    public String f13229y;
    public n f13230z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f13209b = 0;
    public int f13210c = 0;
    public int d = 0;
    public int f13211e = 0;
    public boolean f13212f = true;
    public boolean f13213g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f13208a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f13235c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f13235c;
        MenuItem enabled = menuItem.setChecked(this.f13224s).setVisible(this.f13225t).setEnabled(this.f13226u);
        boolean z11 = false;
        if (this.f13223r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f13217l).setIcon(this.f13218m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f13229y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f13229y;
                ?? obj2 = new Object();
                obj2.f13206a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f13207b = cls.getMethod(str, f.f13205c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e10) {
                    StringBuilder s10 = w.s("Couldn't resolve menu item onClick handler ", str, " in class ");
                    s10.append(cls.getName());
                    InflateException inflateException = new InflateException(s10.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f13223r >= 2) {
            if (menuItem instanceof l.m) {
                l.m mVar = (l.m) menuItem;
                mVar.f14026x = (mVar.f14026x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f14036c;
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
        String str2 = this.f13228x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f13231e, hVar.f13233a));
            z11 = true;
        }
        int i11 = this.f13227w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f13230z;
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
            i6.a.j(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            i6.a.r(menuItem, charSequence2);
        }
        char c3 = this.f13219n;
        int i12 = this.f13220o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c3, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            i6.a.h(menuItem, c3, i12);
        }
        char c6 = this.f13221p;
        int i13 = this.f13222q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c6, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            i6.a.n(menuItem, c6, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                i6.a.m(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                i6.a.l(menuItem, colorStateList);
            }
        }
    }
}
