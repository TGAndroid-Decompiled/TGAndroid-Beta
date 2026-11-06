package g;

import a8.p0;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class v implements View.OnClickListener {
    public final View f13381a;
    public final String f13382b;
    public Method f13383c;
    public Context d;

    public v(View view, String str) {
        this.f13381a = view;
        this.f13382b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f13383c == null) {
            View view2 = this.f13381a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f13382b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f13383c = method;
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
                    StringBuilder u10 = p0.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    u10.append(view2.getClass());
                    u10.append(str);
                    throw new IllegalStateException(u10.toString());
                }
            }
        }
        try {
            this.f13383c.invoke(this.d, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
