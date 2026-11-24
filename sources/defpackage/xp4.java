package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public final class xp4 implements LayoutInflater.Factory2 {
    public final hq4 a;

    public xp4(hq4 hq4Var) {
        this.a = hq4Var;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        dp4 dp4Var;
        Activity activity;
        uq4 g;
        int i;
        Activity activity2;
        boolean equals = hp4.class.getName().equals(str);
        hq4 hq4Var = this.a;
        if (equals) {
            return new hp4(context, attributeSet, hq4Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i09.a);
            int i2 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = dp4.class.isAssignableFrom(bq4.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    if (view != null) {
                        i2 = view.getId();
                    }
                    if (i2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        dp4Var = hq4Var.C(resourceId);
                    } else {
                        dp4Var = null;
                    }
                    if (dp4Var == null && string != null) {
                        dp4Var = hq4Var.D(string);
                    }
                    if (dp4Var == null && i2 != -1) {
                        dp4Var = hq4Var.C(i2);
                    }
                    if (dp4Var == null) {
                        bq4 H = hq4Var.H();
                        context.getClassLoader();
                        dp4Var = H.a(attributeValue);
                        dp4Var.E = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        dp4Var.O = i;
                        dp4Var.P = i2;
                        dp4Var.Q = string;
                        dp4Var.F = true;
                        dp4Var.K = hq4Var;
                        fp4 fp4Var = hq4Var.w;
                        dp4Var.L = fp4Var;
                        Context context2 = fp4Var.b;
                        dp4Var.V = true;
                        if (fp4Var == null) {
                            activity2 = null;
                        } else {
                            activity2 = fp4Var.a;
                        }
                        if (activity2 != null) {
                            dp4Var.V = true;
                        }
                        g = hq4Var.a(dp4Var);
                        if (hq4.K(2)) {
                            Log.v("FragmentManager", "Fragment " + dp4Var + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!dp4Var.F) {
                        dp4Var.F = true;
                        dp4Var.K = hq4Var;
                        fp4 fp4Var2 = hq4Var.w;
                        dp4Var.L = fp4Var2;
                        Context context3 = fp4Var2.b;
                        dp4Var.V = true;
                        if (fp4Var2 == null) {
                            activity = null;
                        } else {
                            activity = fp4Var2.a;
                        }
                        if (activity != null) {
                            dp4Var.V = true;
                        }
                        g = hq4Var.g(dp4Var);
                        if (hq4.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + dp4Var + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    vq4 vq4Var = wq4.a;
                    wq4.b(new mq4(dp4Var, "Attempting to use <fragment> tag to add fragment " + dp4Var + " to container " + viewGroup));
                    wq4.a(dp4Var).getClass();
                    dp4Var.W = viewGroup;
                    g.j();
                    g.i();
                    dq9.m(kt6.o("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
