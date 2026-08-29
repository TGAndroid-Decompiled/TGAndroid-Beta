package m;

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
public final class n2 {
    public static n2 f16608i;
    public WeakHashMap f16610a;
    public a0.k f16611b;
    public a0.l f16612c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue f16613e;
    public boolean f16614f;
    public bg.c2 f16615g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final l2 f16609j = new a0.j(6);

    public static synchronized n2 d() {
        n2 n2Var;
        synchronized (n2.class) {
            try {
                if (f16608i == null) {
                    n2 n2Var2 = new n2();
                    f16608i = n2Var2;
                    j(n2Var2);
                }
                n2Var = f16608i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n2.class) {
            l2 l2Var = f16609j;
            l2Var.getClass();
            int i11 = (31 + i10) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) l2Var.a(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) l2Var.b(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(n2 n2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            n2Var.a("vector", new m2(3));
            n2Var.a("animated-vector", new m2(2));
            n2Var.a("animated-selector", new m2(1));
            n2Var.a("drawable", new m2(0));
        }
    }

    public final void a(String str, m2 m2Var) {
        if (this.f16611b == null) {
            this.f16611b = new a0.k(0);
        }
        this.f16611b.put(str, m2Var);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                a0.h hVar = (a0.h) this.d.get(context);
                if (hVar == null) {
                    hVar = new a0.h();
                    this.d.put(context, hVar);
                }
                hVar.k(new WeakReference(constantState), j10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f16613e == null) {
            this.f16613e = new TypedValue();
        }
        TypedValue typedValue = this.f16613e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f16615g != null) {
            if (i10 == 2131230760) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, 2131230759), g(context, 2131230761)});
            } else if (i10 == 2131230795) {
                layerDrawable = bg.c2.p(this, context, 2131165243);
            } else if (i10 == 2131230794) {
                layerDrawable = bg.c2.p(this, context, 2131165244);
            } else if (i10 == 2131230796) {
                layerDrawable = bg.c2.p(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j10) {
        a0.h hVar = (a0.h) this.d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) hVar.f(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.l(j10);
        }
        return null;
    }

    public final synchronized Drawable f(int i10, Context context, boolean z10) {
        Drawable k9;
        try {
            if (!this.f16614f) {
                this.f16614f = true;
                Drawable g10 = g(context, 2131230822);
                if (g10 == null || (!(g10 instanceof k2.p) && !"android.graphics.drawable.VectorDrawable".equals(g10.getClass().getName()))) {
                    this.f16614f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k9 = k(context, i10);
            if (k9 == null) {
                k9 = c(context, i10);
            }
            if (k9 == null) {
                k9 = context.getDrawable(i10);
            }
            if (k9 != null) {
                k9 = m(context, i10, z10, k9);
            }
            if (k9 != null) {
                m1.a(k9);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k9;
    }

    public final synchronized Drawable g(Context context, int i10) {
        return f(i10, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        a0.l lVar;
        WeakHashMap weakHashMap = this.f16610a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (lVar = (a0.l) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) lVar.c(i10);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            bg.c2 c2Var = this.f16615g;
            if (c2Var != null) {
                colorStateList2 = c2Var.r(context, i10);
            }
            if (colorStateList2 != null) {
                if (this.f16610a == null) {
                    this.f16610a = new WeakHashMap();
                }
                a0.l lVar2 = (a0.l) this.f16610a.get(context);
                if (lVar2 == null) {
                    lVar2 = new a0.l();
                    this.f16610a.put(context, lVar2);
                }
                lVar2.a(i10, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        a0.k kVar = this.f16611b;
        if (kVar != null && !kVar.isEmpty()) {
            a0.l lVar = this.f16612c;
            if (lVar != null) {
                String str = (String) lVar.c(i10);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.f16611b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.f16612c = new a0.l();
            }
            if (this.f16613e == null) {
                this.f16613e = new TypedValue();
            }
            TypedValue typedValue = this.f16613e;
            Resources resources = context.getResources();
            resources.getValue(i10, typedValue, true);
            long j10 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e10 = e(context, j10);
            if (e10 != null) {
                return e10;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i10);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    while (true) {
                        next = xml.next();
                        if (next == 2 || next == 1) {
                            break;
                        }
                    }
                    if (next == 2) {
                        String name = xml.getName();
                        this.f16612c.a(i10, name);
                        m2 m2Var = (m2) this.f16611b.get(name);
                        if (m2Var != null) {
                            e10 = m2Var.a(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (e10 != null) {
                            e10.setChangingConfigurations(typedValue.changingConfigurations);
                            b(context, j10, e10);
                        }
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Exception e11) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
                }
            }
            if (e10 == null) {
                this.f16612c.a(i10, "appcompat_skip_skip");
            }
            return e10;
        }
        return null;
    }

    public final synchronized void l(bg.c2 c2Var) {
        this.f16615g = c2Var;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        throw new UnsupportedOperationException("Method not decompiled: m.n2.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
