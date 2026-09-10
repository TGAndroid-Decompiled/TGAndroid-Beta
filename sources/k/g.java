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
    public final Menu f11962a;
    public boolean h;
    public int f11967i;
    public int f11968j;
    public CharSequence f11969k;
    public CharSequence f11970l;
    public int f11971m;
    public char f11972n;
    public int f11973o;
    public char f11974p;
    public int f11975q;
    public int f11976r;
    public boolean f11977s;
    public boolean f11978t;
    public boolean f11979u;
    public int v;
    public int f11980w;
    public String f11981x;
    public String f11982y;
    public o f11983z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f11963b = 0;
    public int f11964c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f11965f = true;
    public boolean f11966g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f11962a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f11987c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f11987c;
        MenuItem enabled = menuItem.setChecked(this.f11977s).setVisible(this.f11978t).setEnabled(this.f11979u);
        boolean z11 = false;
        if (this.f11976r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f11970l).setIcon(this.f11971m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f11982y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f11982y;
                ?? obj2 = new Object();
                obj2.f11960a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f11961b = cls.getMethod(str, f.f11959c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder v = a4.a.v("Couldn't resolve menu item onClick handler ", str, " in class ");
                    v.append(cls.getName());
                    InflateException inflateException = new InflateException(v.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f11976r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f12670x = (nVar.f12670x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                l0.a aVar = sVar.f12680c;
                try {
                    if (sVar.d == null) {
                        sVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e7) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
                }
            }
        }
        String str2 = this.f11981x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.e, hVar.f11985a));
            z11 = true;
        }
        int i11 = this.f11980w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.f11983z;
        if (oVar != null) {
            if (menuItem instanceof l0.a) {
                ((l0.a) menuItem).a(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof l0.a;
        if (z12) {
            ((l0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.e(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.i(menuItem, charSequence2);
        }
        char c10 = this.f11972n;
        int i12 = this.f11973o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.d(menuItem, c10, i12);
        }
        char c11 = this.f11974p;
        int i13 = this.f11975q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.h(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                w6.a.g(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                w6.a.f(menuItem, colorStateList);
            }
        }
    }
}
