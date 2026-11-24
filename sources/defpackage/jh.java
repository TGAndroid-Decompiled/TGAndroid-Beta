package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
public final class jh implements DialogInterface.OnShowListener {
    public final byte a;
    public final View b;

    public jh(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                mj mjVar = (mj) view;
                mjVar.requestFocus();
                gm.E3(mjVar);
                return;
            case 1:
                pz pzVar = (pz) view;
                pzVar.requestFocus();
                gm.E3(pzVar);
                return;
            case 2:
                j51 j51Var = (j51) view;
                j51Var.requestFocus();
                gm.E3(j51Var);
                return;
            case 3:
                a52 a52Var = (a52) view;
                a52Var.requestFocus();
                gm.E3(a52Var);
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
                fs8 fs8Var = (fs8) view;
                fs8Var.requestFocus();
                gm.E3(fs8Var);
                return;
            default:
                a52 a52Var2 = (a52) view;
                a52Var2.requestFocus();
                gm.E3(a52Var2);
                return;
        }
    }
}
