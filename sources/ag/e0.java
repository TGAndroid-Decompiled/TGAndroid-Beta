package ag;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class e0 implements View.OnClickListener {

    public final int f350a;

    public final i1 f351b;

    public e0(i1 i1Var, int i10) {
        this.f350a = i10;
        this.f351b = i1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f350a) {
            case 0:
                i1 i1Var = this.f351b;
                AndroidUtilities.addToClipboard(i1Var.p1());
                i1Var.dismiss();
                break;
            case 1:
                r0 r0Var = this.f351b.A0;
                if (!r0Var.h) {
                    r0Var.f647r.performClick();
                } else {
                    r0Var.f644e.performClick();
                }
                break;
            case 2:
                r0 r0Var2 = this.f351b.A0;
                if (!r0Var2.h) {
                    r0Var2.f647r.performClick();
                } else {
                    r0Var2.f644e.performClick();
                }
                break;
            default:
                i1.S(this.f351b);
                break;
        }
    }
}
