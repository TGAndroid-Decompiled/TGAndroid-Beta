package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class u implements View.OnClickListener {
    public final View f7246a;
    public final String f7247b;
    public Method f7248c;
    public Context d;

    public u(View view, String str) {
        this.f7246a = view;
        this.f7247b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f7248c == null) {
            View view2 = this.f7246a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f7247b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f7248c = method;
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
            this.f7248c.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not execute method for android:onClick", e7);
        }
    }
}
