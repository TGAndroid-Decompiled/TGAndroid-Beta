package lg;

import android.content.DialogInterface;
import android.view.View;
public final class r implements DialogInterface.OnDismissListener {
    public final int f18421a;
    public final View f18422b;

    public r(int i3, View view) {
        this.f18421a = i3;
        this.f18422b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18421a) {
            case 0:
                v.f18489e = null;
                View view = this.f18422b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                r1.f18449f = null;
                View view2 = this.f18422b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
