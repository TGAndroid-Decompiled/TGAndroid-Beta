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
    public static m2 f13062i;
    public WeakHashMap f13064a;
    public a0.l f13065b;
    public a0.m f13066c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f13067f;
    public com.google.firebase.messaging.n f13068g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final k2 f13063j = new a0.k(6);

    public static synchronized m2 d() {
        m2 m2Var;
        synchronized (m2.class) {
            try {
                if (f13062i == null) {
                    m2 m2Var2 = new m2();
                    f13062i = m2Var2;
                    j(m2Var2);
                }
                m2Var = f13062i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (m2.class) {
            k2 k2Var = f13063j;
            k2Var.getClass();
            int i11 = (31 + i10) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) k2Var.a(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) k2Var.b(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
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
        if (this.f13065b == null) {
            this.f13065b = new a0.l(0);
        }
        this.f13065b.put(str, l2Var);
    }

    public final synchronized void b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                a0.i iVar = (a0.i) this.d.get(context);
                if (iVar == null) {
                    iVar = new a0.i();
                    this.d.put(context, iVar);
                }
                iVar.k(new WeakReference(constantState), j3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i10, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j3);
        if (e != null) {
            return e;
        }
        LayerDrawable layerDrawable = null;
        if (this.f13068g != null) {
            if (i10 == 2131230760) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, 2131230759), g(context, 2131230761)});
            } else if (i10 == 2131230795) {
                layerDrawable = com.google.firebase.messaging.n.r(this, context, 2131165243);
            } else if (i10 == 2131230794) {
                layerDrawable = com.google.firebase.messaging.n.r(this, context, 2131165244);
            } else if (i10 == 2131230796) {
                layerDrawable = com.google.firebase.messaging.n.r(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j3) {
        a0.i iVar = (a0.i) this.d.get(context);
        if (iVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) iVar.f(j3);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            iVar.l(j3);
        }
        return null;
    }

    public final synchronized Drawable f(int i10, Context context, boolean z10) {
        Drawable k10;
        try {
            if (!this.f13067f) {
                this.f13067f = true;
                Drawable g10 = g(context, 2131230822);
                if (g10 == null || (!(g10 instanceof x4.p) && !"android.graphics.drawable.VectorDrawable".equals(g10.getClass().getName()))) {
                    this.f13067f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k10 = k(context, i10);
            if (k10 == null) {
                k10 = c(context, i10);
            }
            if (k10 == null) {
                k10 = context.getDrawable(i10);
            }
            if (k10 != null) {
                k10 = m(context, i10, z10, k10);
            }
            if (k10 != null) {
                l1.a(k10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k10;
    }

    public final synchronized Drawable g(Context context, int i10) {
        return f(i10, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        a0.m mVar;
        WeakHashMap weakHashMap = this.f13064a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (mVar = (a0.m) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) mVar.c(i10);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            com.google.firebase.messaging.n nVar = this.f13068g;
            if (nVar != null) {
                colorStateList2 = nVar.t(context, i10);
            }
            if (colorStateList2 != null) {
                if (this.f13064a == null) {
                    this.f13064a = new WeakHashMap();
                }
                a0.m mVar2 = (a0.m) this.f13064a.get(context);
                if (mVar2 == null) {
                    mVar2 = new a0.m();
                    this.f13064a.put(context, mVar2);
                }
                mVar2.a(i10, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        a0.l lVar = this.f13065b;
        if (lVar != null && !lVar.isEmpty()) {
            a0.m mVar = this.f13066c;
            if (mVar != null) {
                String str = (String) mVar.c(i10);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.f13065b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.f13066c = new a0.m();
            }
            if (this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue = this.e;
            Resources resources = context.getResources();
            resources.getValue(i10, typedValue, true);
            long j3 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e = e(context, j3);
            if (e != null) {
                return e;
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
                        this.f13066c.a(i10, name);
                        l2 l2Var = (l2) this.f13065b.get(name);
                        if (l2Var != null) {
                            e = l2Var.a(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (e != null) {
                            e.setChangingConfigurations(typedValue.changingConfigurations);
                            b(context, j3, e);
                        }
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Exception e7) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
                }
            }
            if (e == null) {
                this.f13066c.a(i10, "appcompat_skip_skip");
            }
            return e;
        }
        return null;
    }

    public final synchronized void l(com.google.firebase.messaging.n nVar) {
        this.f13068g = nVar;
    }

    public final android.graphics.drawable.Drawable m(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        throw new UnsupportedOperationException("Method not decompiled: m.m2.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
