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
    public final Menu f13734a;
    public boolean h;
    public int f13739i;
    public int f13740j;
    public CharSequence f13741k;
    public CharSequence f13742l;
    public int f13743m;
    public char f13744n;
    public int f13745o;
    public char f13746p;
    public int f13747q;
    public int f13748r;
    public boolean f13749s;
    public boolean f13750t;
    public boolean f13751u;
    public int v;
    public int f13752w;
    public String f13753x;
    public String f13754y;
    public n f13755z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int f13735b = 0;
    public int f13736c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f13737f = true;
    public boolean f13738g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f13734a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f13759c.getClassLoader()).getConstructor(clsArr);
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
        Context context = hVar.f13759c;
        MenuItem enabled = menuItem.setChecked(this.f13749s).setVisible(this.f13750t).setEnabled(this.f13751u);
        boolean z11 = false;
        if (this.f13748r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f13742l).setIcon(this.f13743m);
        int i10 = this.v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f13754y != null) {
            if (!context.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(context);
                }
                Object obj = hVar.d;
                String str = this.f13754y;
                ?? obj2 = new Object();
                obj2.f13732a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f13733b = cls.getMethod(str, f.f13731c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder v = a1.g.v("Couldn't resolve menu item onClick handler ", str, " in class ");
                    v.append(cls.getName());
                    InflateException inflateException = new InflateException(v.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f13748r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f14457x = (mVar.f14457x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.f14467c;
                try {
                    if (rVar.d == null) {
                        rVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e7) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
                }
            }
        }
        String str2 = this.f13753x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.e, hVar.f13757a));
            z11 = true;
        }
        int i11 = this.f13752w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f13755z;
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
        char c10 = this.f13744n;
        int i12 = this.f13745o;
        if (z12) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            w6.a.d(menuItem, c10, i12);
        }
        char c11 = this.f13746p;
        int i13 = this.f13747q;
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
