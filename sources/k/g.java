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
    public final Menu f10486a;
    public boolean h;
    public int f10491i;
    public int f10492j;
    public CharSequence f10493k;
    public CharSequence f10494l;
    public int f10495m;
    public char f10496n;
    public int f10497o;
    public char f10498p;
    public int f10499q;
    public int f10500r;
    public boolean f10501s;
    public boolean f10502t;
    public boolean f10503u;
    public int v;
    public int f10504w;
    public String f10505x;
    public String f10506y;
    public o f10507z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f10487b = 0;
    public int f10488c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f10489f = true;
    public boolean f10490g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f10486a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f10511c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f10511c;
        MenuItem enabled = menuItem.setChecked(this.f10501s).setVisible(this.f10502t).setEnabled(this.f10503u);
        boolean z11 = false;
        if (this.f10500r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f10494l).setIcon(this.f10495m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f10506y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f10506y;
                ?? obj2 = new Object();
                obj2.f10484a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f10485b = cls.getMethod(str, f.f10483c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder u10 = a1.g.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                    u10.append(cls.getName());
                    InflateException inflateException = new InflateException(u10.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f10500r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f11540x = (nVar.f11540x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                l0.a aVar = sVar.f11550c;
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
        String str2 = this.f10505x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.e, hVar.f10509a));
            z11 = true;
        }
        int i11 = this.f10504w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.f10507z;
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
        char c10 = this.f10496n;
        int i12 = this.f10497o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.d(menuItem, c10, i12);
        }
        char c11 = this.f10498p;
        int i13 = this.f10499q;
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
