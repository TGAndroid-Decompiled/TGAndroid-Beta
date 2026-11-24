package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
public final class jg implements DialogInterface.OnShowListener {
    public final byte a;
    public final View b;

    public jg(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                mi miVar = (mi) view;
                miVar.requestFocus();
                gl.E3(miVar);
                return;
            case 1:
                py pyVar = (py) view;
                pyVar.requestFocus();
                gl.E3(pyVar);
                return;
            case 2:
                c41 c41Var = (c41) view;
                c41Var.requestFocus();
                gl.E3(c41Var);
                return;
            case 3:
                p32 p32Var = (p32) view;
                p32Var.requestFocus();
                gl.E3(p32Var);
                return;
            case 4:
                DatePicker datePicker = (DatePicker) view;
                int childCount = datePicker.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = datePicker.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            case 5:
                dq8 dq8Var = (dq8) view;
                dq8Var.requestFocus();
                gl.E3(dq8Var);
                return;
            default:
                p32 p32Var2 = (p32) view;
                p32Var2.requestFocus();
                gl.E3(p32Var2);
                return;
        }
    }
}
