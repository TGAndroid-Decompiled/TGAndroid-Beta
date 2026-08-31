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
import l.o;
import l.s;
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final h E;
    public final Menu f10210a;
    public boolean h;
    public int f10216i;
    public int f10217j;
    public CharSequence f10218k;
    public CharSequence f10219l;
    public int f10220m;
    public char f10221n;
    public int f10222o;
    public char f10223p;
    public int f10224q;
    public int f10225r;
    public boolean f10226s;
    public boolean f10227t;
    public boolean f10228u;
    public int v;
    public int f10229w;
    public String f10230x;
    public String f10231y;
    public o f10232z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f10211b = 0;
    public int f10212c = 0;
    public int d = 0;
    public int f10213e = 0;
    public boolean f10214f = true;
    public boolean f10215g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f10210a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f10237c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z4;
        h hVar = this.E;
        Context context = hVar.f10237c;
        MenuItem enabled = menuItem.setChecked(this.f10226s).setVisible(this.f10227t).setEnabled(this.f10228u);
        boolean z10 = false;
        if (this.f10225r >= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        enabled.setCheckable(z4).setTitleCondensed(this.f10219l).setIcon(this.f10220m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f10231y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f10231y;
                ?? obj2 = new Object();
                obj2.f10208a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f10209b = cls.getMethod(str, f.f10207c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e6) {
                    StringBuilder t6 = android.support.v4.media.a.t("Couldn't resolve menu item onClick handler ", str, " in class ");
                    t6.append(cls.getName());
                    InflateException inflateException = new InflateException(t6.toString());
                    inflateException.initCause(e6);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f10225r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f11439x = (nVar.f11439x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                l0.a aVar = sVar.f11449c;
                try {
                    if (sVar.d == null) {
                        sVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f10230x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f10233e, hVar.f10235a));
            z10 = true;
        }
        int i11 = this.f10229w;
        if (i11 > 0) {
            if (!z10) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.f10232z;
        if (oVar != null) {
            if (menuItem instanceof l0.a) {
                ((l0.a) menuItem).a(oVar);
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
        char c3 = this.f10221n;
        int i12 = this.f10222o;
        if (z11) {
            ((l0.a) menuItem).setAlphabeticShortcut(c3, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            k6.a.h(menuItem, c3, i12);
        }
        char c10 = this.f10223p;
        int i13 = this.f10224q;
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
