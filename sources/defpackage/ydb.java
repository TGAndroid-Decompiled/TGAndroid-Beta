package defpackage;

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
import java.lang.reflect.Method;
public final class ydb {
    public CharSequence A;
    public CharSequence B;
    public final zdb E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public d27 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public ydb(zdb zdbVar, Menu menu) {
        this.E = zdbVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z;
        zdb zdbVar = this.E;
        Context context = zdbVar.c;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean z2 = false;
        if (this.r >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (!context.isRestricted()) {
                Object obj = zdbVar.d;
                if (obj == null) {
                    obj = zdb.a(context);
                    zdbVar.d = obj;
                }
                String str = this.y;
                xdb xdbVar = new xdb();
                xdbVar.b = obj;
                Class<?> cls = obj.getClass();
                try {
                    xdbVar.c = cls.getMethod(str, xdb.d);
                    menuItem.setOnMenuItemClickListener(xdbVar);
                } catch (Exception e) {
                    StringBuilder p = wi8.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                    p.append(cls.getName());
                    InflateException inflateException = new InflateException(p.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                dq9.m("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof c27) {
                c27 c27Var = (c27) menuItem;
                c27Var.x = (c27Var.x & (-5)) | 4;
            } else if (menuItem instanceof g27) {
                g27 g27Var = (g27) menuItem;
                aeb aebVar = g27Var.c;
                try {
                    Method method = g27Var.d;
                    if (method == null) {
                        method = aebVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        g27Var.d = method;
                    }
                    method.invoke(aebVar, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, zdb.e, zdbVar.a));
            z2 = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (!z2) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        d27 d27Var = this.z;
        if (d27Var != null) {
            if (menuItem instanceof aeb) {
                ((aeb) menuItem).a(d27Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof aeb;
        if (z3) {
            ((aeb) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            i10.l(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z3) {
            ((aeb) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            i10.p(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z3) {
            ((aeb) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            i10.k(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z3) {
            ((aeb) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            i10.o(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z3) {
                ((aeb) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                i10.n(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z3) {
                ((aeb) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                i10.m(menuItem, colorStateList);
            }
        }
    }
}
