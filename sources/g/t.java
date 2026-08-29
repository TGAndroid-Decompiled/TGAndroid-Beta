package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class t implements View.OnClickListener {
    public final View f6943a;
    public final String f6944b;
    public Method f6945c;
    public Context d;

    public t(View view, String str) {
        this.f6943a = view;
        this.f6944b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f6945c == null) {
            View view2 = this.f6943a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f6944b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f6945c = method;
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
                    StringBuilder s10 = a4.w.s("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    s10.append(view2.getClass());
                    s10.append(str);
                    throw new IllegalStateException(s10.toString());
                }
            }
        }
        try {
            this.f6945c.invoke(this.d, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
