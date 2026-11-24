package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.StickersActivity;
public final class uj extends g6c {
    public final byte e;
    public Object f;

    public uj(Object obj, byte b) {
        super("@stickers", (wkb) null);
        this.e = b;
        this.f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                ((d) this.f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                kd5 kd5Var = ((id5) this.f).d;
                i = ((d) kd5Var).currentAccount;
                oc7.r1(i).C3("stickers", kd5Var, 1, null);
                return;
            case 2:
                ((iz7) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i2 = ((d) stickersActivity).currentAccount;
                oc7.r1(i2).C3("stickers", stickersActivity, 3, null);
                return;
            case 4:
                x2b x2bVar = (x2b) this.f;
                oc7.r1(x2bVar.a).C3(getURL(), x2bVar.F1, 1, null);
                x2bVar.dismiss();
                return;
            default:
                gm.g(getURL());
                c41.b0((m51) this.f).k(false).j();
                return;
        }
    }

    public uj(byte b, Object obj, String str) {
        super(str, (wkb) null);
        this.e = b;
        this.f = obj;
    }

    public uj(String str, wkb wkbVar) {
        super(str, wkbVar);
        this.e = (byte) 5;
    }

    public uj(String str, d dVar) {
        super(str, (wkb) null);
        this.e = (byte) 0;
        this.f = dVar;
    }
}
