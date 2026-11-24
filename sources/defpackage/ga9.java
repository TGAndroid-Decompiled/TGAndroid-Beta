package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
public final class ga9 {
    public final byte a;

    public ga9(byte b) {
        this.a = b;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) ga9.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    ap2.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            case 1:
                try {
                    return xm.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    ln lnVar = new ln(context);
                    lnVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return lnVar;
                } catch (Exception e3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    r9c r9cVar = new r9c();
                    r9cVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return r9cVar;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
    }
}
