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
public final class hc9 {
    public static hc9 i;
    public WeakHashMap a;
    public cka b;
    public rma c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public eq g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final fc9 j = new fi6(6);

    public static synchronized hc9 d() {
        hc9 hc9Var;
        synchronized (hc9.class) {
            if (i == null) {
                hc9 hc9Var2 = new hc9();
                i = hc9Var2;
                j(hc9Var2);
            }
            hc9Var = i;
        }
        return hc9Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (hc9.class) {
            fc9 fc9Var = j;
            fc9Var.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) fc9Var.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) fc9Var.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(hc9 hc9Var) {
        if (Build.VERSION.SDK_INT < 24) {
            hc9Var.a("vector", new gc9((byte) 3));
            hc9Var.a("animated-vector", new gc9((byte) 2));
            hc9Var.a("animated-selector", new gc9((byte) 1));
            hc9Var.a("drawable", new gc9((byte) 0));
        }
    }

    public static void n(android.graphics.drawable.Drawable r4, defpackage.s34 r5, int[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc9.n(android.graphics.drawable.Drawable, s34, int[]):void");
    }

    public final void a(String str, gc9 gc9Var) {
        cka ckaVar = this.b;
        if (ckaVar == null) {
            ckaVar = new cka(0);
            this.b = ckaVar;
        }
        ckaVar.put(str, gc9Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            vh6 vh6Var = (vh6) this.d.get(context);
            if (vh6Var == null) {
                vh6Var = new vh6();
                this.d.put(context, vh6Var);
            }
            vh6Var.k(new WeakReference(constantState), j2);
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
                layerDrawable = eq.f(this, context, 2131165243);
            } else if (i2 == 2131230833) {
                layerDrawable = eq.f(this, context, 2131165244);
            } else if (i2 == 2131230835) {
                layerDrawable = eq.f(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        vh6 vh6Var = (vh6) this.d.get(context);
        if (vh6Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) vh6Var.f(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            vh6Var.l(j2);
        }
        return null;
    }

    public final synchronized Drawable f(int i2, Context context, boolean z) {
        Drawable k;
        if (!this.f) {
            this.f = true;
            Drawable g = g(context, 2131230861);
            if (g == null || (!(g instanceof sbc) && !"android.graphics.drawable.VectorDrawable".equals(g.getClass().getName()))) {
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
            vr3.a(k);
        }
        return k;
    }

    public final synchronized Drawable g(Context context, int i2) {
        return f(i2, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        rma rmaVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (rmaVar = (rma) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) bfd.a(rmaVar, i2);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            eq eqVar = this.g;
            if (eqVar != null) {
                colorStateList2 = eqVar.g(context, i2);
            }
            if (colorStateList2 != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                rma rmaVar2 = (rma) weakHashMap2.get(context);
                if (rmaVar2 == null) {
                    rmaVar2 = new rma();
                    this.a.put(context, rmaVar2);
                }
                rmaVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        cka ckaVar = this.b;
        if (ckaVar != null && !ckaVar.isEmpty()) {
            rma rmaVar = this.c;
            if (rmaVar != null) {
                String str = (String) bfd.a(rmaVar, i2);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.c = new rma();
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
                            gc9 gc9Var = (gc9) this.b.get(name);
                            if (gc9Var != null) {
                                e = gc9Var.a(context, xml, asAttributeSet, context.getTheme());
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

    public final synchronized void l(eq eqVar) {
        this.g = eqVar;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc9.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
