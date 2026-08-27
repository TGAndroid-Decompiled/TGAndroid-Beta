package k;

import a9.p;
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

    public final Menu f14220a;
    public boolean h;

    public int f14226i;

    public int f14227j;

    public CharSequence f14228k;

    public CharSequence f14229l;

    public int f14230m;

    public char f14231n;

    public int f14232o;

    public char f14233p;

    public int f14234q;

    public int f14235r;

    public boolean f14236s;

    public boolean f14237t;

    public boolean f14238u;
    public int v;

    public int f14239w;

    public String f14240x;

    public String f14241y;

    public o f14242z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    public int f14221b = 0;

    public int f14222c = 0;
    public int d = 0;

    public int f14223e = 0;

    public boolean f14224f = true;

    public boolean f14225g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f14220a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f14247c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e9) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e9);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f14247c;
        boolean z10 = false;
        menuItem.setChecked(this.f14236s).setVisible(this.f14237t).setEnabled(this.f14238u).setCheckable(this.f14235r >= 1).setTitleCondensed(this.f14229l).setIcon(this.f14230m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f14241y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(context);
            }
            Object obj = hVar.d;
            String str = this.f14241y;
            f fVar = new f();
            fVar.f14218a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f14219b = cls.getMethod(str, f.f14217c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e9) {
                StringBuilder sbR = p.r("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbR.append(cls.getName());
                InflateException inflateException = new InflateException(sbR.toString());
                inflateException.initCause(e9);
                throw inflateException;
            }
        }
        if (this.f14235r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f15354x = (nVar.f15354x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                l0.a aVar = sVar.f15364c;
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
        String str2 = this.f14240x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f14243e, hVar.f14245a));
            z10 = true;
        }
        int i11 = this.f14239w;
        if (i11 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        o oVar = this.f14242z;
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
            h6.a.i(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            h6.a.q(menuItem, charSequence2);
        }
        char c10 = this.f14231n;
        int i12 = this.f14232o;
        if (z11) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            h6.a.g(menuItem, c10, i12);
        }
        char c11 = this.f14233p;
        int i13 = this.f14234q;
        if (z11) {
            ((l0.a) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            h6.a.m(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                h6.a.l(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                h6.a.k(menuItem, colorStateList);
            }
        }
    }
}
