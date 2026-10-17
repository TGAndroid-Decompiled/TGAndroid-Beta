package m;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
public final class m2 {
    public final int f16248a;

    public m2(int i10) {
        this.f16248a = i10;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f16248a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) m2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    j.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            case 1:
                try {
                    return i.e.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e7) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    x4.d dVar = new x4.d(context);
                    dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return dVar;
                } catch (Exception e10) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    x4.o oVar = new x4.o();
                    oVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return oVar;
                } catch (Exception e11) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e11);
                    return null;
                }
        }
    }
}
