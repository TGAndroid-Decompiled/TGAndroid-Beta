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
public final class m2 {
    public static m2 f18646i;
    public WeakHashMap f18648a;
    public a0.l f18649b;
    public a0.m f18650c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue f18651e;
    public boolean f18652f;
    public l2.e f18653g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final k2 f18647j = new a0.j(6);

    public static synchronized m2 d() {
        m2 m2Var;
        synchronized (m2.class) {
            try {
                if (f18646i == null) {
                    m2 m2Var2 = new m2();
                    f18646i = m2Var2;
                    j(m2Var2);
                }
                m2Var = f18646i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (m2.class) {
            k2 k2Var = f18647j;
            k2Var.getClass();
            int i10 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) k2Var.a(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
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
        if (this.f18649b == null) {
            this.f18649b = new a0.l(0);
        }
        this.f18649b.put(str, l2Var);
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

    public final Drawable c(Context context, int i3) {
        if (this.f18651e == null) {
            this.f18651e = new TypedValue();
        }
        TypedValue typedValue = this.f18651e;
        context.getResources().getValue(i3, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f18653g != null) {
            if (i3 == 2131230799) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, 2131230798), g(context, 2131230800)});
            } else if (i3 == 2131230834) {
                layerDrawable = l2.e.i(this, context, 2131165243);
            } else if (i3 == 2131230833) {
                layerDrawable = l2.e.i(this, context, 2131165244);
            } else if (i3 == 2131230835) {
                layerDrawable = l2.e.i(this, context, 2131165245);
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

    public final synchronized Drawable f(int i3, Context context, boolean z10) {
        Drawable k10;
        try {
            if (!this.f18652f) {
                this.f18652f = true;
                Drawable g7 = g(context, 2131230861);
                if (g7 == null || (!(g7 instanceof z4.o) && !"android.graphics.drawable.VectorDrawable".equals(g7.getClass().getName()))) {
                    this.f18652f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k10 = k(context, i3);
            if (k10 == null) {
                k10 = c(context, i3);
            }
            if (k10 == null) {
                k10 = context.getDrawable(i3);
            }
            if (k10 != null) {
                k10 = m(context, i3, z10, k10);
            }
            if (k10 != null) {
                l1.a(k10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k10;
    }

    public final synchronized Drawable g(Context context, int i3) {
        return f(i3, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i3) {
        ColorStateList colorStateList;
        a0.m mVar;
        WeakHashMap weakHashMap = this.f18648a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (mVar = (a0.m) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) mVar.c(i3);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            l2.e eVar = this.f18653g;
            if (eVar != null) {
                colorStateList2 = eVar.j(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f18648a == null) {
                    this.f18648a = new WeakHashMap();
                }
                a0.m mVar2 = (a0.m) this.f18648a.get(context);
                if (mVar2 == null) {
                    mVar2 = new a0.m();
                    this.f18648a.put(context, mVar2);
                }
                mVar2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i3) {
        int next;
        a0.l lVar = this.f18649b;
        if (lVar != null && !lVar.isEmpty()) {
            a0.m mVar = this.f18650c;
            if (mVar != null) {
                String str = (String) mVar.c(i3);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.f18649b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.f18650c = new a0.m();
            }
            if (this.f18651e == null) {
                this.f18651e = new TypedValue();
            }
            TypedValue typedValue = this.f18651e;
            Resources resources = context.getResources();
            resources.getValue(i3, typedValue, true);
            long j10 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e10 = e(context, j10);
            if (e10 != null) {
                return e10;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i3);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    while (true) {
                        next = xml.next();
                        if (next == 2 || next == 1) {
                            break;
                        }
                    }
                    if (next == 2) {
                        String name = xml.getName();
                        this.f18650c.a(i3, name);
                        l2 l2Var = (l2) this.f18649b.get(name);
                        if (l2Var != null) {
                            e10 = l2Var.a(context, xml, asAttributeSet, context.getTheme());
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
                this.f18650c.a(i3, "appcompat_skip_skip");
            }
            return e10;
        }
        return null;
    }

    public final synchronized void l(l2.e eVar) {
        this.f18653g = eVar;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        throw new UnsupportedOperationException("Method not decompiled: m.m2.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
