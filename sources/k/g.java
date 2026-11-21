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
    public final Menu f18100a;
    public boolean h;
    public int f18106i;
    public int f18107j;
    public CharSequence f18108k;
    public CharSequence f18109l;
    public int f18110m;
    public char f18111n;
    public int f18112o;
    public char f18113p;
    public int f18114q;
    public int f18115r;
    public boolean f18116s;
    public boolean f18117t;
    public boolean f18118u;
    public int v;
    public int f18119w;
    public String f18120x;
    public String f18121y;
    public n f18122z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f18101b = 0;
    public int f18102c = 0;
    public int d = 0;
    public int f18103e = 0;
    public boolean f18104f = true;
    public boolean f18105g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f18100a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f18127c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f18127c;
        MenuItem enabled = menuItem.setChecked(this.f18116s).setVisible(this.f18117t).setEnabled(this.f18118u);
        boolean z11 = false;
        if (this.f18115r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f18109l).setIcon(this.f18110m);
        int i7 = this.v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        if (this.f18121y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f18121y;
                ?? obj2 = new Object();
                obj2.f18098a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f18099b = cls.getMethod(str, f.f18097c);
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
        if (this.f18115r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f19249x = (mVar.f19249x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f19259c;
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
        String str2 = this.f18120x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f18123e, hVar.f18125a));
            z11 = true;
        }
        int i10 = this.f18119w;
        if (i10 > 0) {
            if (!z11) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f18122z;
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
            f2.i.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.l(menuItem, charSequence2);
        }
        char c10 = this.f18111n;
        int i11 = this.f18112o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.g(menuItem, c10, i11);
        }
        char c11 = this.f18113p;
        int i12 = this.f18114q;
        if (z12) {
            ((l0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2.i.k(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.i.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f2.i.i(menuItem, colorStateList);
            }
        }
    }
}
