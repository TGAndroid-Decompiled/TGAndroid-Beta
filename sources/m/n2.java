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
    public static n2 f17010i;
    public WeakHashMap f17012a;
    public a0.k f17013b;
    public a0.l f17014c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue f17015e;
    public boolean f17016f;
    public com.google.firebase.messaging.m f17017g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final l2 f17011j = new a0.j(6);

    public static synchronized n2 d() {
        n2 n2Var;
        synchronized (n2.class) {
            try {
                if (f17010i == null) {
                    n2 n2Var2 = new n2();
                    f17010i = n2Var2;
                    j(n2Var2);
                }
                n2Var = f17010i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i9, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n2.class) {
            l2 l2Var = f17011j;
            l2Var.getClass();
            int i10 = (31 + i9) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) l2Var.a(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i9, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) l2Var.b(Integer.valueOf(mode.hashCode() + i10), porterDuffColorFilter);
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
        if (this.f17013b == null) {
            this.f17013b = new a0.k(0);
        }
        this.f17013b.put(str, m2Var);
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i9) {
        if (this.f17015e == null) {
            this.f17015e = new TypedValue();
        }
        TypedValue typedValue = this.f17015e;
        context.getResources().getValue(i9, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f17017g != null) {
            if (i9 == 2131230760) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, 2131230759), g(context, 2131230761)});
            } else if (i9 == 2131230795) {
                layerDrawable = com.google.firebase.messaging.m.p(this, context, 2131165243);
            } else if (i9 == 2131230794) {
                layerDrawable = com.google.firebase.messaging.m.p(this, context, 2131165244);
            } else if (i9 == 2131230796) {
                layerDrawable = com.google.firebase.messaging.m.p(this, context, 2131165245);
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

    public final synchronized Drawable f(int i9, Context context, boolean z10) {
        Drawable k10;
        try {
            if (!this.f17016f) {
                this.f17016f = true;
                Drawable g10 = g(context, 2131230822);
                if (g10 == null || (!(g10 instanceof k2.p) && !"android.graphics.drawable.VectorDrawable".equals(g10.getClass().getName()))) {
                    this.f17016f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k10 = k(context, i9);
            if (k10 == null) {
                k10 = c(context, i9);
            }
            if (k10 == null) {
                k10 = context.getDrawable(i9);
            }
            if (k10 != null) {
                k10 = m(context, i9, z10, k10);
            }
            if (k10 != null) {
                m1.a(k10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k10;
    }

    public final synchronized Drawable g(Context context, int i9) {
        return f(i9, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i9) {
        ColorStateList colorStateList;
        a0.l lVar;
        WeakHashMap weakHashMap = this.f17012a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (lVar = (a0.l) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) lVar.c(i9);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            com.google.firebase.messaging.m mVar = this.f17017g;
            if (mVar != null) {
                colorStateList2 = mVar.r(context, i9);
            }
            if (colorStateList2 != null) {
                if (this.f17012a == null) {
                    this.f17012a = new WeakHashMap();
                }
                a0.l lVar2 = (a0.l) this.f17012a.get(context);
                if (lVar2 == null) {
                    lVar2 = new a0.l();
                    this.f17012a.put(context, lVar2);
                }
                lVar2.a(i9, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i9) {
        int next;
        a0.k kVar = this.f17013b;
        if (kVar != null && !kVar.isEmpty()) {
            a0.l lVar = this.f17014c;
            if (lVar != null) {
                String str = (String) lVar.c(i9);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.f17013b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.f17014c = new a0.l();
            }
            if (this.f17015e == null) {
                this.f17015e = new TypedValue();
            }
            TypedValue typedValue = this.f17015e;
            Resources resources = context.getResources();
            resources.getValue(i9, typedValue, true);
            long j10 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e10 = e(context, j10);
            if (e10 != null) {
                return e10;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i9);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    while (true) {
                        next = xml.next();
                        if (next == 2 || next == 1) {
                            break;
                        }
                    }
                    if (next == 2) {
                        String name = xml.getName();
                        this.f17014c.a(i9, name);
                        m2 m2Var = (m2) this.f17013b.get(name);
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
                this.f17014c.a(i9, "appcompat_skip_skip");
            }
            return e10;
        }
        return null;
    }

    public final synchronized void l(com.google.firebase.messaging.m mVar) {
        this.f17017g = mVar;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        throw new UnsupportedOperationException("Method not decompiled: m.n2.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
