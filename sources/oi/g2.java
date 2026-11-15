package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.l9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Wallet.k8;
public final class g2 implements Runnable {
    public final int f21709a;
    public final y5 f21710b;

    public g2(y5 y5Var, int i7) {
        this.f21709a = i7;
        this.f21710b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f21709a) {
            case 0:
                this.f21710b.x();
                return;
            default:
                y5 y5Var = this.f21710b;
                y5Var.H = null;
                a aVar = y5Var.f22151y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21544b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = y5Var.f22145f.getText().toString();
                        if (!obj.equals(y5Var.I)) {
                            a aVar2 = y5Var.f22151y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f21544b).language;
                            int i7 = y5Var.J + 1;
                            y5Var.J = i7;
                            l9 l9Var = new l9(y5Var, i7, aVar2, obj, 2);
                            qi.p pVar = qi.j.f55613a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.f55613a.d(spannableString.toString(), b10, new k8(14, spannableString, l9Var));
                                return;
                            } else {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.web.e1(11, l9Var, spannableString));
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
