package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class v implements View.OnClickListener {
    public final View f10286a;
    public final String f10287b;
    public Method f10288c;
    public Context d;

    public v(View view, String str) {
        this.f10286a = view;
        this.f10287b = str;
    }

    @Override
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f10288c == null) {
            View view2 = this.f10286a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f10287b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f10288c = method;
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
                    StringBuilder v = a4.a.v("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    v.append(view2.getClass());
                    v.append(str);
                    throw new IllegalStateException(v.toString());
                }
            }
        }
        try {
            this.f10288c.invoke(this.d, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
