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
    public final Menu f14288a;
    public boolean h;
    public int f14294i;
    public int f14295j;
    public CharSequence f14296k;
    public CharSequence f14297l;
    public int f14298m;
    public char f14299n;
    public int f14300o;
    public char f14301p;
    public int f14302q;
    public int f14303r;
    public boolean f14304s;
    public boolean f14305t;
    public boolean f14306u;
    public int v;
    public int f14307w;
    public String f14308x;
    public String f14309y;
    public n f14310z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f14289b = 0;
    public int f14290c = 0;
    public int d = 0;
    public int f14291e = 0;
    public boolean f14292f = true;
    public boolean f14293g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f14288a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f14315c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z10;
        h hVar = this.E;
        Context context = hVar.f14315c;
        MenuItem enabled = menuItem.setChecked(this.f14304s).setVisible(this.f14305t).setEnabled(this.f14306u);
        boolean z11 = false;
        if (this.f14303r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f14297l).setIcon(this.f14298m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f14309y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f14309y;
                ?? obj2 = new Object();
                obj2.f14286a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f14287b = cls.getMethod(str, f.f14285c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e7) {
                    StringBuilder w10 = a1.g.w("Couldn't resolve menu item onClick handler ", str, " in class ");
                    w10.append(cls.getName());
                    InflateException inflateException = new InflateException(w10.toString());
                    inflateException.initCause(e7);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f14303r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f15279x = (mVar.f15279x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f15289c;
                try {
                    if (rVar.d == null) {
                        rVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f14308x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f14311e, hVar.f14313a));
            z11 = true;
        }
        int i11 = this.f14307w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f14310z;
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
            w6.a.e(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.i(menuItem, charSequence2);
        }
        char c10 = this.f14299n;
        int i12 = this.f14300o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.d(menuItem, c10, i12);
        }
        char c11 = this.f14301p;
        int i13 = this.f14302q;
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
