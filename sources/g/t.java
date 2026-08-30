package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class t implements View.OnClickListener {
    public final View f6315a;
    public final String f6316b;
    public Method f6317c;
    public Context d;

    public t(View view, String str) {
        this.f6315a = view;
        this.f6316b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f6317c == null) {
            View view2 = this.f6315a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f6316b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f6317c = method;
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
                    StringBuilder t6 = android.support.v4.media.a.t("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    t6.append(view2.getClass());
                    t6.append(str);
                    throw new IllegalStateException(t6.toString());
                }
            }
        }
        try {
            this.f6317c.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e6) {
            throw new IllegalStateException("Could not execute method for android:onClick", e6);
        }
    }
}
