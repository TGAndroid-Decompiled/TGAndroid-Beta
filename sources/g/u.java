package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class u implements View.OnClickListener {
    public final View f10191a;
    public final String f10192b;
    public Method f10193c;
    public Context d;

    public u(View view, String str) {
        this.f10191a = view;
        this.f10192b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f10193c == null) {
            View view2 = this.f10191a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f10192b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f10193c = method;
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
                    StringBuilder w10 = a1.g.w("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    w10.append(view2.getClass());
                    w10.append(str);
                    throw new IllegalStateException(w10.toString());
                }
            }
        }
        try {
            this.f10193c.invoke(this.d, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
