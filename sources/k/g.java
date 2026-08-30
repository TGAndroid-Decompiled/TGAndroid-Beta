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
    public final Menu f9514a;
    public boolean h;
    public int f9519i;
    public int f9520j;
    public CharSequence f9521k;
    public CharSequence f9522l;
    public int f9523m;
    public char f9524n;
    public int f9525o;
    public char f9526p;
    public int f9527q;
    public int f9528r;
    public boolean f9529s;
    public boolean f9530t;
    public boolean f9531u;
    public int v;
    public int f9532w;
    public String f9533x;
    public String f9534y;
    public n f9535z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f9515b = 0;
    public int f9516c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f9517f = true;
    public boolean f9518g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f9514a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f9539c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z4;
        h hVar = this.E;
        Context context = hVar.f9539c;
        MenuItem enabled = menuItem.setChecked(this.f9529s).setVisible(this.f9530t).setEnabled(this.f9531u);
        boolean z10 = false;
        if (this.f9528r >= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        enabled.setCheckable(z4).setTitleCondensed(this.f9522l).setIcon(this.f9523m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f9534y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f9534y;
                ?? obj2 = new Object();
                obj2.f9512a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f9513b = cls.getMethod(str, f.f9511c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder t6 = android.support.v4.media.a.t("Couldn't resolve menu item onClick handler ", str, " in class ");
                    t6.append(cls.getName());
                    InflateException inflateException = new InflateException(t6.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f9528r >= 2) {
            if (menuItem instanceof l.m) {
                l.m mVar = (l.m) menuItem;
                mVar.f11082x = (mVar.f11082x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f11092c;
                try {
                    if (rVar.d == null) {
                        rVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e6) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
                }
            }
        }
        String str2 = this.f9533x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.e, hVar.f9537a));
            z10 = true;
        }
        int i11 = this.f9532w;
        if (i11 > 0) {
            if (!z10) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f9535z;
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
            k6.a.j(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            k6.a.r(menuItem, charSequence2);
        }
        char c3 = this.f9524n;
        int i12 = this.f9525o;
        if (z11) {
            ((l0.a) menuItem).setAlphabeticShortcut(c3, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            k6.a.h(menuItem, c3, i12);
        }
        char c10 = this.f9526p;
        int i13 = this.f9527q;
        if (z11) {
            ((l0.a) menuItem).setNumericShortcut(c10, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            k6.a.n(menuItem, c10, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k6.a.m(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k6.a.l(menuItem, colorStateList);
            }
        }
    }
}
