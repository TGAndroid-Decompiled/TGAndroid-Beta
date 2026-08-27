package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class u implements View.OnClickListener {

    public final View f6314a;

    public final String f6315b;

    public Method f6316c;
    public Context d;

    public u(View view, String str) {
        this.f6314a = view;
        this.f6315b = str;
    }

    @Override
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f6316c != null) {
            break;
        }
        View view2 = this.f6314a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f6315b;
            if (context == null) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                }
                StringBuilder sbR = a9.p.r("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbR.append(view2.getClass());
                sbR.append(str);
                throw new IllegalStateException(sbR.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f6316c = method;
                    this.d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f6316c.invoke(this.d, view);
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e9);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
