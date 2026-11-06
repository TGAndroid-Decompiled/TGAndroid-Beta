package m;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
public final class m2 {
    public final int f19158a;

    public m2(int i7) {
        this.f19158a = i7;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f19158a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) m2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
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
                    a5.e eVar = new a5.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e12) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e12);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    a5.q qVar = new a5.q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return qVar;
                } catch (Exception e13) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e13);
                    return null;
                }
        }
    }
}
