package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.p9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.wc1;
public final class h2 implements Runnable {
    public final int f22112a;
    public final z5 f22113b;

    public h2(z5 z5Var, int i7) {
        this.f22112a = i7;
        this.f22113b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f22112a) {
            case 0:
                this.f22113b.x();
                return;
            default:
                z5 z5Var = this.f22113b;
                z5Var.H = null;
                a aVar = z5Var.f22560y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21901b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = z5Var.f22554f.getText().toString();
                        if (!obj.equals(z5Var.I)) {
                            a aVar2 = z5Var.f22560y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f21901b).language;
                            int i7 = z5Var.J + 1;
                            z5Var.J = i7;
                            p9 p9Var = new p9(z5Var, i7, aVar2, obj, 4);
                            qi.p pVar = qi.j.f56197a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.f56197a.d(spannableString.toString(), b10, new wc1(12, spannableString, p9Var));
                                return;
                            } else {
                                org.telegram.messenger.g0.g3(new p4.o0(3, p9Var, spannableString));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
