package fh;

import android.view.View;
import android.widget.FrameLayout;
import kh.wb;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.vq0;
public final class b3 implements View.OnClickListener {
    public final int f6383a;
    public final boolean f6384b;
    public final int f6385c;
    public final FrameLayout d;

    public b3(FrameLayout frameLayout, boolean z10, int i9, int i10) {
        this.f6383a = i10;
        this.d = frameLayout;
        this.f6384b = z10;
        this.f6385c = i9;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6383a) {
            case 0:
                vq0 vq0Var = (vq0) this.d;
                if (vq0Var.f6548e.h() && vq0Var.h.getCurrentPosition() != 0) {
                    vq0Var.a();
                    return;
                }
                boolean z10 = this.f6384b;
                int i9 = this.f6385c;
                if (z10) {
                    p2 p2Var = new p2(vq0Var.getContext(), i9, vq0Var.f6547c, null, null);
                    p2Var.U(BirthdayController.getInstance(i9).isToday(vq0Var.f6547c));
                    p2Var.show();
                    return;
                }
                bg.g3.d0(2, BirthdayController.getInstance(i9).getState());
                return;
            default:
                eu0 eu0Var = (eu0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
                if (this.f6384b) {
                    eu0Var.O0(o2Var, eu0Var.f28136f1, this.f6385c);
                    return;
                }
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                wb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
