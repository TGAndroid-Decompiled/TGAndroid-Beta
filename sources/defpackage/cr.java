package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class cr implements View.OnClickListener {
    public final View a;
    public final String b;
    public Method c;
    public Context d;

    public cr(View view, String str) {
        this.a = view;
        this.b = str;
    }

    @Override
    public final void onClick(View view) {
        int id;
        String str;
        Method method;
        Method method2 = this.c;
        if (method2 == null) {
            View view2 = this.a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.c = method;
                            this.d = context;
                            method2 = method;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    if (view2.getId() == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder p = ik8.p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    p.append(view2.getClass());
                    p.append(str);
                    throw new IllegalStateException(p.toString());
                }
            }
        }
        try {
            method2.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            su3.f("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            su3.f("Could not execute method for android:onClick", e2);
        }
    }
}
