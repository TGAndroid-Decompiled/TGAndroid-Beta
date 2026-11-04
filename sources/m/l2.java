package m;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
public final class l2 {
    public final int f18642a;

    public l2(int i3) {
        this.f18642a = i3;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f18642a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) l2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    j.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                    return null;
                }
            case 1:
                try {
                    return i.e.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e11) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e11);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    z4.d dVar = new z4.d(context);
                    dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return dVar;
                } catch (Exception e12) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e12);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    z4.o oVar = new z4.o();
                    oVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return oVar;
                } catch (Exception e13) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e13);
                    return null;
                }
        }
    }
}
