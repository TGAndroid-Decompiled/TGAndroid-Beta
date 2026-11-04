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
import l.n;
import l.r;
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final h E;
    public final Menu f16398a;
    public boolean h;
    public int f16404i;
    public int f16405j;
    public CharSequence f16406k;
    public CharSequence f16407l;
    public int f16408m;
    public char f16409n;
    public int f16410o;
    public char f16411p;
    public int f16412q;
    public int f16413r;
    public boolean f16414s;
    public boolean f16415t;
    public boolean f16416u;
    public int v;
    public int f16417w;
    public String f16418x;
    public String f16419y;
    public n f16420z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f16399b = 0;
    public int f16400c = 0;
    public int d = 0;
    public int f16401e = 0;
    public boolean f16402f = true;
    public boolean f16403g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f16398a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f16425c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f16425c;
        MenuItem enabled = menuItem.setChecked(this.f16414s).setVisible(this.f16415t).setEnabled(this.f16416u);
        boolean z11 = false;
        if (this.f16413r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f16407l).setIcon(this.f16408m);
        int i3 = this.v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        if (this.f16419y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f16419y;
                ?? obj2 = new Object();
                obj2.f16396a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f16397b = cls.getMethod(str, f.f16395c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e10) {
                    StringBuilder u10 = a1.g.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                    u10.append(cls.getName());
                    InflateException inflateException = new InflateException(u10.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f16413r >= 2) {
            if (menuItem instanceof l.m) {
                l.m mVar = (l.m) menuItem;
                mVar.f17461x = (mVar.f17461x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f17471c;
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
        String str2 = this.f16418x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f16421e, hVar.f16423a));
            z11 = true;
        }
        int i10 = this.f16417w;
        if (i10 > 0) {
            if (!z11) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f16420z;
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
            e2.h.i(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e2.h.q(menuItem, charSequence2);
        }
        char c2 = this.f16409n;
        int i11 = this.f16410o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c2, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e2.h.g(menuItem, c2, i11);
        }
        char c10 = this.f16411p;
        int i12 = this.f16412q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e2.h.m(menuItem, c10, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                e2.h.l(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                e2.h.k(menuItem, colorStateList);
            }
        }
    }
}
