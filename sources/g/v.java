package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class v implements View.OnClickListener {
    public final View f11766a;
    public final String f11767b;
    public Method f11768c;
    public Context d;

    public v(View view, String str) {
        this.f11766a = view;
        this.f11767b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f11768c == null) {
            View view2 = this.f11766a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f11767b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f11768c = method;
                            this.d = context;
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
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder u10 = a1.g.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    u10.append(view2.getClass());
                    u10.append(str);
                    throw new IllegalStateException(u10.toString());
                }
            }
        }
        try {
            this.f11768c.invoke(this.d, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
