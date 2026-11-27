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
public final class vd9 {
    public static vd9 i;
    public WeakHashMap a;
    public vla b;
    public koa c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public fp g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final td9 j = new ji6(6);

    public static synchronized vd9 d() {
        vd9 vd9Var;
        synchronized (vd9.class) {
            if (i == null) {
                vd9 vd9Var2 = new vd9();
                i = vd9Var2;
                j(vd9Var2);
            }
            vd9Var = i;
        }
        return vd9Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (vd9.class) {
            td9 td9Var = j;
            td9Var.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) td9Var.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) td9Var.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(vd9 vd9Var) {
        if (Build.VERSION.SDK_INT < 24) {
            vd9Var.a("vector", new ud9((byte) 3));
            vd9Var.a("animated-vector", new ud9((byte) 2));
            vd9Var.a("animated-selector", new ud9((byte) 1));
            vd9Var.a("drawable", new ud9((byte) 0));
        }
    }

    public static void n(android.graphics.drawable.Drawable r4, defpackage.c34 r5, int[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd9.n(android.graphics.drawable.Drawable, c34, int[]):void");
    }

    public final void a(String str, ud9 ud9Var) {
        vla vlaVar = this.b;
        if (vlaVar == null) {
            vlaVar = new vla(0);
            this.b = vlaVar;
        }
        vlaVar.put(str, ud9Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            zh6 zh6Var = (zh6) this.d.get(context);
            if (zh6Var == null) {
                zh6Var = new zh6();
                this.d.put(context, zh6Var);
            }
            zh6Var.k(j2, new WeakReference(constantState));
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
                layerDrawable = fp.f(this, context, 2131165243);
            } else if (i2 == 2131230833) {
                layerDrawable = fp.f(this, context, 2131165244);
            } else if (i2 == 2131230835) {
                layerDrawable = fp.f(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        zh6 zh6Var = (zh6) this.d.get(context);
        if (zh6Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) zh6Var.f(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            zh6Var.l(j2);
        }
        return null;
    }

    public final synchronized Drawable f(int i2, Context context, boolean z) {
        Drawable k;
        if (!this.f) {
            this.f = true;
            Drawable g = g(context, 2131230861);
            if (g == null || (!(g instanceof rdc) && !"android.graphics.drawable.VectorDrawable".equals(g.getClass().getName()))) {
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
            cr3.a(k);
        }
        return k;
    }

    public final synchronized Drawable g(Context context, int i2) {
        return f(i2, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        koa koaVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (koaVar = (koa) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) shd.a(koaVar, i2);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            fp fpVar = this.g;
            if (fpVar != null) {
                colorStateList2 = fpVar.g(context, i2);
            }
            if (colorStateList2 != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                koa koaVar2 = (koa) weakHashMap2.get(context);
                if (koaVar2 == null) {
                    koaVar2 = new koa();
                    this.a.put(context, koaVar2);
                }
                koaVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        vla vlaVar = this.b;
        if (vlaVar != null && !vlaVar.isEmpty()) {
            koa koaVar = this.c;
            if (koaVar != null) {
                String str = (String) shd.a(koaVar, i2);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.c = new koa();
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
                            ud9 ud9Var = (ud9) this.b.get(name);
                            if (ud9Var != null) {
                                e = ud9Var.a(context, xml, asAttributeSet, context.getTheme());
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

    public final synchronized void l(fp fpVar) {
        this.g = fpVar;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd9.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
