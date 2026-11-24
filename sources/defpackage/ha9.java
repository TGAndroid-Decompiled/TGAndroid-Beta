package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
public final class ha9 {
    public static ha9 i;
    public WeakHashMap a;
    public aia b;
    public qka c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public ep g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final fa9 j = new fg6(6);

    public static synchronized ha9 d() {
        ha9 ha9Var;
        synchronized (ha9.class) {
            if (i == null) {
                ha9 ha9Var2 = new ha9();
                i = ha9Var2;
                j(ha9Var2);
            }
            ha9Var = i;
        }
        return ha9Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ha9.class) {
            fa9 fa9Var = j;
            fa9Var.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) fa9Var.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) fa9Var.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(ha9 ha9Var) {
        if (Build.VERSION.SDK_INT < 24) {
            ha9Var.a("vector", new ga9((byte) 3));
            ha9Var.a("animated-vector", new ga9((byte) 2));
            ha9Var.a("animated-selector", new ga9((byte) 1));
            ha9Var.a("drawable", new ga9((byte) 0));
        }
    }

    public static void n(android.graphics.drawable.Drawable r4, defpackage.h24 r5, int[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha9.n(android.graphics.drawable.Drawable, h24, int[]):void");
    }

    public final void a(String str, ga9 ga9Var) {
        aia aiaVar = this.b;
        if (aiaVar == null) {
            aiaVar = new aia(0);
            this.b = aiaVar;
        }
        aiaVar.put(str, ga9Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            vf6 vf6Var = (vf6) this.d.get(context);
            if (vf6Var == null) {
                vf6Var = new vf6();
                this.d.put(context, vf6Var);
            }
            vf6Var.k(new WeakReference(constantState), j2);
        }
    }

    public final Drawable c(Context context, int i2) {
        TypedValue typedValue = this.e;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.e = typedValue;
        }
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j2);
        if (e != null) {
            return e;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null) {
            if (i2 == 2131230799) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, 2131230798), g(context, 2131230800)});
            } else if (i2 == 2131230834) {
                layerDrawable = ep.f(this, context, 2131165243);
            } else if (i2 == 2131230833) {
                layerDrawable = ep.f(this, context, 2131165244);
            } else if (i2 == 2131230835) {
                layerDrawable = ep.f(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        vf6 vf6Var = (vf6) this.d.get(context);
        if (vf6Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) vf6Var.f(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            vf6Var.l(j2);
        }
        return null;
    }

    public final synchronized Drawable f(int i2, Context context, boolean z) {
        Drawable k;
        if (!this.f) {
            this.f = true;
            Drawable g = g(context, 2131230861);
            if (g == null || (!(g instanceof r9c) && !"android.graphics.drawable.VectorDrawable".equals(g.getClass().getName()))) {
                this.f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        k = k(context, i2);
        if (k == null) {
            k = c(context, i2);
        }
        if (k == null) {
            k = context.getDrawable(i2);
        }
        if (k != null) {
            k = m(context, i2, z, k);
        }
        if (k != null) {
            lq3.a(k);
        }
        return k;
    }

    public final synchronized Drawable g(Context context, int i2) {
        return f(i2, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        qka qkaVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (qkaVar = (qka) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) zcd.a(qkaVar, i2);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            ep epVar = this.g;
            if (epVar != null) {
                colorStateList2 = epVar.g(context, i2);
            }
            if (colorStateList2 != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                qka qkaVar2 = (qka) weakHashMap2.get(context);
                if (qkaVar2 == null) {
                    qkaVar2 = new qka();
                    this.a.put(context, qkaVar2);
                }
                qkaVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        aia aiaVar = this.b;
        if (aiaVar != null && !aiaVar.isEmpty()) {
            qka qkaVar = this.c;
            if (qkaVar != null) {
                String str = (String) zcd.a(qkaVar, i2);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.c = new qka();
            }
            TypedValue typedValue = this.e;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.e = typedValue;
            }
            Resources resources = context.getResources();
            resources.getValue(i2, typedValue, true);
            long j2 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e = e(context, j2);
            if (e != null) {
                return e;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i2);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            String name = xml.getName();
                            this.c.a(i2, name);
                            ga9 ga9Var = (ga9) this.b.get(name);
                            if (ga9Var != null) {
                                e = ga9Var.a(context, xml, asAttributeSet, context.getTheme());
                            }
                            if (e != null) {
                                e.setChangingConfigurations(typedValue.changingConfigurations);
                                b(context, j2, e);
                            }
                        }
                    } while (next != 1);
                    throw new XmlPullParserException("No start tag found");
                } catch (Exception e2) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
                }
            }
            if (e == null) {
                this.c.a(i2, "appcompat_skip_skip");
            }
            return e;
        }
        return null;
    }

    public final synchronized void l(ep epVar) {
        this.g = epVar;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha9.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
