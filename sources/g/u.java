package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class u implements View.OnClickListener {
    public final View f12192a;
    public final String f12193b;
    public Method f12194c;
    public Context d;

    public u(View view, String str) {
        this.f12192a = view;
        this.f12193b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f12194c == null) {
            View view2 = this.f12192a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f12193b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f12194c = method;
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
                    StringBuilder v = a1.g.v("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    v.append(view2.getClass());
                    v.append(str);
                    throw new IllegalStateException(v.toString());
                }
            }
        }
        try {
            this.f12194c.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
