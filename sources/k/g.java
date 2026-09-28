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
    public final Menu f13108a;
    public boolean h;
    public int f13113i;
    public int f13114j;
    public CharSequence f13115k;
    public CharSequence f13116l;
    public int f13117m;
    public char f13118n;
    public int f13119o;
    public char f13120p;
    public int f13121q;
    public int f13122r;
    public boolean f13123s;
    public boolean f13124t;
    public boolean f13125u;
    public int v;
    public int f13126w;
    public String f13127x;
    public String f13128y;
    public o f13129z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f13109b = 0;
    public int f13110c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f13111f = true;
    public boolean f13112g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f13108a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f13133c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f13133c;
        MenuItem enabled = menuItem.setChecked(this.f13123s).setVisible(this.f13124t).setEnabled(this.f13125u);
        boolean z11 = false;
        if (this.f13122r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f13116l).setIcon(this.f13117m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f13128y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f13128y;
                ?? obj2 = new Object();
                obj2.f13106a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f13107b = cls.getMethod(str, f.f13105c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder w10 = a4.a.w("Couldn't resolve menu item onClick handler ", str, " in class ");
                    w10.append(cls.getName());
                    InflateException inflateException = new InflateException(w10.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f13122r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f14000x = (nVar.f14000x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                l0.a aVar = sVar.f14010c;
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
        String str2 = this.f13127x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.e, hVar.f13131a));
            z11 = true;
        }
        int i11 = this.f13126w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.f13129z;
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
        char c10 = this.f13118n;
        int i12 = this.f13119o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.d(menuItem, c10, i12);
        }
        char c11 = this.f13120p;
        int i13 = this.f13121q;
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
