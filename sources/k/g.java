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
    public final Menu f17116a;
    public boolean h;
    public int f17122i;
    public int f17123j;
    public CharSequence f17124k;
    public CharSequence f17125l;
    public int f17126m;
    public char f17127n;
    public int f17128o;
    public char f17129p;
    public int f17130q;
    public int f17131r;
    public boolean f17132s;
    public boolean f17133t;
    public boolean f17134u;
    public int v;
    public int f17135w;
    public String f17136x;
    public String f17137y;
    public n f17138z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f17117b = 0;
    public int f17118c = 0;
    public int d = 0;
    public int f17119e = 0;
    public boolean f17120f = true;
    public boolean f17121g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f17116a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f17143c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f17143c;
        MenuItem enabled = menuItem.setChecked(this.f17132s).setVisible(this.f17133t).setEnabled(this.f17134u);
        boolean z10 = false;
        if (this.f17131r >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        enabled.setCheckable(z9).setTitleCondensed(this.f17125l).setIcon(this.f17126m);
        int i7 = this.v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        if (this.f17137y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f17137y;
                ?? obj2 = new Object();
                obj2.f17114a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f17115b = cls.getMethod(str, f.f17113c);
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
        if (this.f17131r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f17712x = (mVar.f17712x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f17722c;
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
        String str2 = this.f17136x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f17139e, hVar.f17141a));
            z10 = true;
        }
        int i10 = this.f17135w;
        if (i10 > 0) {
            if (!z10) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f17138z;
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
        char c10 = this.f17127n;
        int i11 = this.f17128o;
        if (z11) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.g(menuItem, c10, i11);
        }
        char c11 = this.f17129p;
        int i12 = this.f17130q;
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
