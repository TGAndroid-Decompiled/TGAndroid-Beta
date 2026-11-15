package m;

import a8.b8;
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
public final class m2 {
    public static m2 f19758i;
    public WeakHashMap f19760a;
    public a0.l f19761b;
    public a0.m f19762c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue f19763e;
    public boolean f19764f;
    public b8 f19765g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final k2 f19759j = new a0.j(6);

    public static synchronized m2 d() {
        m2 m2Var;
        synchronized (m2.class) {
            try {
                if (f19758i == null) {
                    m2 m2Var2 = new m2();
                    f19758i = m2Var2;
                    j(m2Var2);
                }
                m2Var = f19758i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (m2.class) {
            k2 k2Var = f19759j;
            k2Var.getClass();
            int i10 = (31 + i7) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) k2Var.a(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) k2Var.b(Integer.valueOf(mode.hashCode() + i10), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(m2 m2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m2Var.a("vector", new l2(3));
            m2Var.a("animated-vector", new l2(2));
            m2Var.a("animated-selector", new l2(1));
            m2Var.a("drawable", new l2(0));
        }
    }

    public final void a(String str, l2 l2Var) {
        if (this.f19761b == null) {
            this.f19761b = new a0.l(0);
        }
        this.f19761b.put(str, l2Var);
    }

    public final synchronized void b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                a0.h hVar = (a0.h) this.d.get(context);
                if (hVar == null) {
                    hVar = new a0.h();
                    this.d.put(context, hVar);
                }
                hVar.k(new WeakReference(constantState), j3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(Context context, int i7) {
        if (this.f19763e == null) {
            this.f19763e = new TypedValue();
        }
        TypedValue typedValue = this.f19763e;
        context.getResources().getValue(i7, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j3);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f19765g != null) {
            if (i7 == 2131230799) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, 2131230798), g(context, 2131230800)});
            } else if (i7 == 2131230834) {
                layerDrawable = b8.g(this, context, 2131165243);
            } else if (i7 == 2131230833) {
                layerDrawable = b8.g(this, context, 2131165244);
            } else if (i7 == 2131230835) {
                layerDrawable = b8.g(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j3) {
        a0.h hVar = (a0.h) this.d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) hVar.f(j3);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.l(j3);
        }
        return null;
    }

    public final synchronized Drawable f(int i7, Context context, boolean z10) {
        Drawable k10;
        try {
            if (!this.f19764f) {
                this.f19764f = true;
                Drawable g10 = g(context, 2131230861);
                if (g10 == null || (!(g10 instanceof a5.q) && !"android.graphics.drawable.VectorDrawable".equals(g10.getClass().getName()))) {
                    this.f19764f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k10 = k(context, i7);
            if (k10 == null) {
                k10 = c(context, i7);
            }
            if (k10 == null) {
                k10 = context.getDrawable(i7);
            }
            if (k10 != null) {
                k10 = m(context, i7, z10, k10);
            }
            if (k10 != null) {
                l1.a(k10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k10;
    }

    public final synchronized Drawable g(Context context, int i7) {
        return f(i7, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i7) {
        ColorStateList colorStateList;
        a0.m mVar;
        WeakHashMap weakHashMap = this.f19760a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (mVar = (a0.m) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) mVar.c(i7);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            b8 b8Var = this.f19765g;
            if (b8Var != null) {
                colorStateList2 = b8Var.h(context, i7);
            }
            if (colorStateList2 != null) {
                if (this.f19760a == null) {
                    this.f19760a = new WeakHashMap();
                }
                a0.m mVar2 = (a0.m) this.f19760a.get(context);
                if (mVar2 == null) {
                    mVar2 = new a0.m();
                    this.f19760a.put(context, mVar2);
                }
                mVar2.a(i7, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i7) {
        int next;
        a0.l lVar = this.f19761b;
        if (lVar != null && !lVar.isEmpty()) {
            a0.m mVar = this.f19762c;
            if (mVar != null) {
                String str = (String) mVar.c(i7);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.f19761b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.f19762c = new a0.m();
            }
            if (this.f19763e == null) {
                this.f19763e = new TypedValue();
            }
            TypedValue typedValue = this.f19763e;
            Resources resources = context.getResources();
            resources.getValue(i7, typedValue, true);
            long j3 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e10 = e(context, j3);
            if (e10 != null) {
                return e10;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i7);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    while (true) {
                        next = xml.next();
                        if (next == 2 || next == 1) {
                            break;
                        }
                    }
                    if (next == 2) {
                        String name = xml.getName();
                        this.f19762c.a(i7, name);
                        l2 l2Var = (l2) this.f19761b.get(name);
                        if (l2Var != null) {
                            e10 = l2Var.a(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (e10 != null) {
                            e10.setChangingConfigurations(typedValue.changingConfigurations);
                            b(context, j3, e10);
                        }
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Exception e11) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
                }
            }
            if (e10 == null) {
                this.f19762c.a(i7, "appcompat_skip_skip");
            }
            return e10;
        }
        return null;
    }

    public final synchronized void l(b8 b8Var) {
        this.f19765g = b8Var;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        throw new UnsupportedOperationException("Method not decompiled: m.m2.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
