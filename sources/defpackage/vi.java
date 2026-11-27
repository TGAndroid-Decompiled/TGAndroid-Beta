package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.StickersActivity;
public final class vi extends f8c {
    public final byte e;
    public Object f;

    public vi(Object obj, byte b) {
        super("@stickers", (rmb) null);
        this.e = b;
        this.f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i;
        switch (this.e) {
            case 0:
                ((e) this.f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                nd5 nd5Var = ((ld5) this.f).d;
                i = ((e) nd5Var).currentAccount;
                uc7.s1(i).H3("stickers", nd5Var, 1, null);
                return;
            case 2:
                ((m08) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                uc7.s1(StickersActivity.a0(stickersActivity)).H3("stickers", stickersActivity, 3, null);
                return;
            case 4:
                s4b s4bVar = (s4b) this.f;
                uc7.s1(s4bVar.a).H3(getURL(), s4bVar.F1, 1, null);
                s4bVar.dismiss();
                return;
            default:
                hl.g(getURL());
                d31.b0((n41) this.f).k(false).j();
                return;
        }
    }

    public vi(byte b, Object obj, String str) {
        super(str, (rmb) null);
        this.e = b;
        this.f = obj;
    }

    public vi(String str, rmb rmbVar) {
        super(str, rmbVar);
        this.e = (byte) 5;
    }

    public vi(String str, e eVar) {
        super(str, (rmb) null);
        this.e = (byte) 0;
        this.f = eVar;
    }
}
