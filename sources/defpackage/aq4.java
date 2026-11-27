package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public final class aq4 implements LayoutInflater.Factory2 {
    public final kq4 a;

    public aq4(kq4 kq4Var) {
        this.a = kq4Var;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        gp4 gp4Var;
        Activity activity;
        xq4 g;
        int i;
        Activity activity2;
        boolean equals = kp4.class.getName().equals(str);
        kq4 kq4Var = this.a;
        if (equals) {
            return new kp4(context, attributeSet, kq4Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u19.a);
            int i2 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = gp4.class.isAssignableFrom(eq4.b(context.getClassLoader(), attributeValue));
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
                        gp4Var = kq4Var.C(resourceId);
                    } else {
                        gp4Var = null;
                    }
                    if (gp4Var == null && string != null) {
                        gp4Var = kq4Var.D(string);
                    }
                    if (gp4Var == null && i2 != -1) {
                        gp4Var = kq4Var.C(i2);
                    }
                    if (gp4Var == null) {
                        eq4 H = kq4Var.H();
                        context.getClassLoader();
                        gp4Var = H.a(attributeValue);
                        gp4Var.E = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        gp4Var.O = i;
                        gp4Var.P = i2;
                        gp4Var.Q = string;
                        gp4Var.F = true;
                        gp4Var.K = kq4Var;
                        ip4 ip4Var = kq4Var.w;
                        gp4Var.L = ip4Var;
                        Context context2 = ip4Var.b;
                        gp4Var.V = true;
                        if (ip4Var == null) {
                            activity2 = null;
                        } else {
                            activity2 = ip4Var.a;
                        }
                        if (activity2 != null) {
                            gp4Var.V = true;
                        }
                        g = kq4Var.a(gp4Var);
                        if (kq4.K(2)) {
                            Log.v("FragmentManager", "Fragment " + gp4Var + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!gp4Var.F) {
                        gp4Var.F = true;
                        gp4Var.K = kq4Var;
                        ip4 ip4Var2 = kq4Var.w;
                        gp4Var.L = ip4Var2;
                        Context context3 = ip4Var2.b;
                        gp4Var.V = true;
                        if (ip4Var2 == null) {
                            activity = null;
                        } else {
                            activity = ip4Var2.a;
                        }
                        if (activity != null) {
                            gp4Var.V = true;
                        }
                        g = kq4Var.g(gp4Var);
                        if (kq4.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + gp4Var + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    yq4 yq4Var = zq4.a;
                    zq4.b(new pq4(gp4Var, "Attempting to use <fragment> tag to add fragment " + gp4Var + " to container " + viewGroup));
                    zq4.a(gp4Var).getClass();
                    gp4Var.W = viewGroup;
                    g.j();
                    g.i();
                    grb.i(qd4.y("Fragment ", attributeValue, " did not create a view."));
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
