package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
public final class as8 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final int c;
    public final FrameLayout d;

    public as8(FrameLayout frameLayout, boolean z, int i, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.b = z;
        this.c = i;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                lea leaVar = (lea) frameLayout;
                if (leaVar.e.h() && leaVar.h.getCurrentPosition() != 0) {
                    leaVar.a();
                    return;
                }
                int i = this.c;
                if (z) {
                    ux4 ux4Var = new ux4(leaVar.getContext(), i, leaVar.c, null, null);
                    ux4Var.a1(ok0.a(i).c(leaVar.c));
                    ux4Var.show();
                    return;
                }
                yw4.f1(false, ok0.a(i).b());
                return;
            default:
                nha nhaVar = (nha) frameLayout;
                d dVar = nhaVar.y1;
                if (z) {
                    nhaVar.U0(this.c, nhaVar.m1, dVar);
                    return;
                }
                dVar.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                v9b.C(dVar.getParentActivity(), dVar.getCurrentAccount()).Q(null);
                return;
        }
    }
}
