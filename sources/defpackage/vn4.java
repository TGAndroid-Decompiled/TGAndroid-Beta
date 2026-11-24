package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public final class vn4 implements LayoutInflater.Factory2 {
    public final go4 a;

    public vn4(go4 go4Var) {
        this.a = go4Var;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        bn4 bn4Var;
        Activity activity;
        to4 g;
        int i;
        Activity activity2;
        boolean equals = fn4.class.getName().equals(str);
        go4 go4Var = this.a;
        if (equals) {
            return new fn4(context, attributeSet, go4Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hy8.a);
            int i2 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = bn4.class.isAssignableFrom(ao4.b(context.getClassLoader(), attributeValue));
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
                        bn4Var = go4Var.C(resourceId);
                    } else {
                        bn4Var = null;
                    }
                    if (bn4Var == null && string != null) {
                        bn4Var = go4Var.D(string);
                    }
                    if (bn4Var == null && i2 != -1) {
                        bn4Var = go4Var.C(i2);
                    }
                    if (bn4Var == null) {
                        ao4 H = go4Var.H();
                        context.getClassLoader();
                        bn4Var = H.a(attributeValue);
                        bn4Var.E = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        bn4Var.O = i;
                        bn4Var.P = i2;
                        bn4Var.Q = string;
                        bn4Var.F = true;
                        bn4Var.K = go4Var;
                        dn4 dn4Var = go4Var.w;
                        bn4Var.L = dn4Var;
                        Context context2 = dn4Var.b;
                        bn4Var.V = true;
                        if (dn4Var == null) {
                            activity2 = null;
                        } else {
                            activity2 = dn4Var.a;
                        }
                        if (activity2 != null) {
                            bn4Var.V = true;
                        }
                        g = go4Var.a(bn4Var);
                        if (go4.K(2)) {
                            Log.v("FragmentManager", "Fragment " + bn4Var + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!bn4Var.F) {
                        bn4Var.F = true;
                        bn4Var.K = go4Var;
                        dn4 dn4Var2 = go4Var.w;
                        bn4Var.L = dn4Var2;
                        Context context3 = dn4Var2.b;
                        bn4Var.V = true;
                        if (dn4Var2 == null) {
                            activity = null;
                        } else {
                            activity = dn4Var2.a;
                        }
                        if (activity != null) {
                            bn4Var.V = true;
                        }
                        g = go4Var.g(bn4Var);
                        if (go4.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + bn4Var + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    uo4 uo4Var = vo4.a;
                    vo4.b(new lo4(bn4Var, "Attempting to use <fragment> tag to add fragment " + bn4Var + " to container " + viewGroup));
                    vo4.a(bn4Var).getClass();
                    bn4Var.W = viewGroup;
                    g.j();
                    g.i();
                    sc8.j(tb4.y("Fragment ", attributeValue, " did not create a view."));
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
