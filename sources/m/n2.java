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
import g7.k8;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class n2 {

    public static n2 f17385i;

    public WeakHashMap f17387a;

    public a0.k f17388b;

    public a0.l f17389c;
    public final WeakHashMap d = new WeakHashMap(0);

    public TypedValue f17390e;

    public boolean f17391f;

    public com.google.firebase.messaging.m f17392g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;

    public static final l2 f17386j = new l2(6);

    public static synchronized n2 d() {
        try {
            if (f17385i == null) {
                n2 n2Var = new n2();
                f17385i = n2Var;
                j(n2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17385i;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        l2 l2Var = f17386j;
        l2Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) l2Var.a(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
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
        if (this.f17388b == null) {
            this.f17388b = new a0.k(0);
        }
        this.f17388b.put(str, m2Var);
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

    public final Drawable c(Context context, int i10) {
        if (this.f17390e == null) {
            this.f17390e = new TypedValue();
        }
        TypedValue typedValue = this.f17390e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableP = null;
        if (this.f17392g != null) {
            if (i10 == 2131230760) {
                layerDrawableP = new LayerDrawable(new Drawable[]{g(context, 2131230759), g(context, 2131230761)});
            } else if (i10 == 2131230795) {
                layerDrawableP = com.google.firebase.messaging.m.p(this, context, 2131165243);
            } else if (i10 == 2131230794) {
                layerDrawableP = com.google.firebase.messaging.m.p(this, context, 2131165244);
            } else if (i10 == 2131230796) {
                layerDrawableP = com.google.firebase.messaging.m.p(this, context, 2131165245);
            }
        }
        if (layerDrawableP != null) {
            layerDrawableP.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawableP);
        }
        return layerDrawableP;
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
        Drawable drawableK;
        try {
            if (!this.f17391f) {
                this.f17391f = true;
                Drawable drawableG = g(context, 2131230822);
                if (drawableG == null || (!(drawableG instanceof k2.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableG.getClass().getName()))) {
                    this.f17391f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i10);
            if (drawableK == null) {
                drawableK = c(context, i10);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i10);
            }
            if (drawableK != null) {
                drawableK = m(context, i10, z10, drawableK);
            }
            if (drawableK != null) {
                m1.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized Drawable g(Context context, int i10) {
        return f(i10, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        a0.l lVar;
        WeakHashMap weakHashMap = this.f17387a;
        ColorStateList colorStateListR = null;
        colorStateList = (weakHashMap == null || (lVar = (a0.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.c(i10);
        if (colorStateList == null) {
            com.google.firebase.messaging.m mVar = this.f17392g;
            if (mVar != null) {
                colorStateListR = mVar.r(context, i10);
            }
            if (colorStateListR != null) {
                if (this.f17387a == null) {
                    this.f17387a = new WeakHashMap();
                }
                a0.l lVar2 = (a0.l) this.f17387a.get(context);
                if (lVar2 == null) {
                    lVar2 = new a0.l();
                    this.f17387a.put(context, lVar2);
                }
                lVar2.a(i10, colorStateListR);
            }
            colorStateList = colorStateListR;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        a0.k kVar = this.f17388b;
        if (kVar == null || kVar.isEmpty()) {
            return null;
        }
        a0.l lVar = this.f17389c;
        if (lVar != null) {
            String str = (String) lVar.c(i10);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f17388b.get(str) == null) {
                return null;
            }
        } else {
            this.f17389c = new a0.l();
        }
        if (this.f17390e == null) {
            this.f17390e = new TypedValue();
        }
        TypedValue typedValue = this.f17390e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f17389c.a(i10, name);
                m2 m2Var = (m2) this.f17388b.get(name);
                if (m2Var != null) {
                    drawableE = m2Var.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, drawableE);
                }
            } catch (Exception e9) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e9);
            }
        }
        if (drawableE == null) {
            this.f17389c.a(i10, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(com.google.firebase.messaging.m mVar) {
        this.f17392g = mVar;
    }

    public final Drawable m(Context context, int i10, boolean z10, Drawable drawable) {
        int iRound;
        boolean z11;
        PorterDuffColorFilter porterDuffColorFilterH;
        ColorStateList colorStateListI = i(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListI != null) {
            int[] iArr = m1.f17377a;
            Drawable drawableD = k8.d(drawable.mutate());
            drawableD.setTintList(colorStateListI);
            if (this.f17392g != null && i10 == 2131230809) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableD.setTintMode(mode);
            }
            return drawableD;
        }
        int i11 = 2130968729;
        if (this.f17392g != null) {
            if (i10 == 2131230804) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int iC = d3.c(context, 2130968729);
                PorterDuff.Mode mode2 = r.f17437b;
                com.google.firebase.messaging.m.z(drawableFindDrawableByLayerId, iC, mode2);
                com.google.firebase.messaging.m.z(layerDrawable.findDrawableByLayerId(16908303), d3.c(context, 2130968729), mode2);
                com.google.firebase.messaging.m.z(layerDrawable.findDrawableByLayerId(16908301), d3.c(context, 2130968727), mode2);
                return drawable;
            }
            if (i10 == 2131230795 || i10 == 2131230794 || i10 == 2131230796) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int iB = d3.b(context, 2130968729);
                PorterDuff.Mode mode3 = r.f17437b;
                com.google.firebase.messaging.m.z(drawableFindDrawableByLayerId2, iB, mode3);
                com.google.firebase.messaging.m.z(layerDrawable2.findDrawableByLayerId(16908303), d3.c(context, 2130968727), mode3);
                com.google.firebase.messaging.m.z(layerDrawable2.findDrawableByLayerId(16908301), d3.c(context, 2130968727), mode3);
                return drawable;
            }
        }
        com.google.firebase.messaging.m mVar = this.f17392g;
        boolean z12 = false;
        if (mVar != null) {
            PorterDuff.Mode mode4 = r.f17437b;
            if (com.google.firebase.messaging.m.f(i10, (int[]) mVar.f4602a)) {
                iRound = -1;
                z11 = true;
            } else if (com.google.firebase.messaging.m.f(i10, (int[]) mVar.f4604c)) {
                iRound = -1;
                z11 = true;
                i11 = 2130968727;
            } else {
                i11 = 16842801;
                if (com.google.firebase.messaging.m.f(i10, (int[]) mVar.d)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i10 == 2131230781) {
                    iRound = Math.round(40.8f);
                    i11 = 16842800;
                    z11 = true;
                } else if (i10 != 2131230763) {
                    iRound = -1;
                    z11 = false;
                    i11 = 0;
                }
                iRound = -1;
                z11 = true;
            }
            if (z11) {
                int[] iArr2 = m1.f17377a;
                Drawable drawableMutate = drawable.mutate();
                int iC2 = d3.c(context, i11);
                synchronized (r.class) {
                    porterDuffColorFilterH = h(iC2, mode4);
                }
                drawableMutate.setColorFilter(porterDuffColorFilterH);
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z12 = true;
            }
        }
        if (z12 || !z10) {
            return drawable;
        }
        return null;
    }
}
