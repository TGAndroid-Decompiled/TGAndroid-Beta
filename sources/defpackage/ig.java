package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
public final class ig implements DialogInterface.OnShowListener {
    public final byte a;
    public final View b;

    public ig(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ni niVar = (ni) view;
                niVar.requestFocus();
                hl.E3(niVar);
                return;
            case 1:
                qy qyVar = (qy) view;
                qyVar.requestFocus();
                hl.E3(qyVar);
                return;
            case 2:
                k41 k41Var = (k41) view;
                k41Var.requestFocus();
                hl.E3(k41Var);
                return;
            case 3:
                f42 f42Var = (f42) view;
                f42Var.requestFocus();
                hl.E3(f42Var);
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
                pt8 pt8Var = (pt8) view;
                pt8Var.requestFocus();
                hl.E3(pt8Var);
                return;
            default:
                f42 f42Var2 = (f42) view;
                f42Var2.requestFocus();
                hl.E3(f42Var2);
                return;
        }
    }
}
