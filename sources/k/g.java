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
    public final Menu f14403a;
    public boolean h;
    public int f14409i;
    public int f14410j;
    public CharSequence f14411k;
    public CharSequence f14412l;
    public int f14413m;
    public char f14414n;
    public int f14415o;
    public char f14416p;
    public int f14417q;
    public int f14418r;
    public boolean f14419s;
    public boolean f14420t;
    public boolean f14421u;
    public int v;
    public int f14422w;
    public String f14423x;
    public String f14424y;
    public n f14425z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f14404b = 0;
    public int f14405c = 0;
    public int d = 0;
    public int f14406e = 0;
    public boolean f14407f = true;
    public boolean f14408g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f14403a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f14430c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f14430c;
        MenuItem enabled = menuItem.setChecked(this.f14419s).setVisible(this.f14420t).setEnabled(this.f14421u);
        boolean z11 = false;
        if (this.f14418r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f14412l).setIcon(this.f14413m);
        int i9 = this.v;
        if (i9 >= 0) {
            menuItem.setShowAsAction(i9);
        }
        if (this.f14424y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f14424y;
                ?? obj2 = new Object();
                obj2.f14401a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f14402b = cls.getMethod(str, f.f14400c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e10) {
                    StringBuilder t10 = aa.d.t("Couldn't resolve menu item onClick handler ", str, " in class ");
                    t10.append(cls.getName());
                    InflateException inflateException = new InflateException(t10.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f14418r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f16598x = (mVar.f16598x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f16608c;
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
        String str2 = this.f14423x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f14426e, hVar.f14428a));
            z11 = true;
        }
        int i10 = this.f14422w;
        if (i10 > 0) {
            if (!z11) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f14425z;
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
            g6.a.i(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            g6.a.q(menuItem, charSequence2);
        }
        char c10 = this.f14414n;
        int i11 = this.f14415o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            g6.a.g(menuItem, c10, i11);
        }
        char c11 = this.f14416p;
        int i12 = this.f14417q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            g6.a.m(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                g6.a.l(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                g6.a.k(menuItem, colorStateList);
            }
        }
    }
}
