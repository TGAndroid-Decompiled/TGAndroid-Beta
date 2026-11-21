package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.p9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.wc1;
public final class j2 implements Runnable {
    public final int f22194a;
    public final a6 f22195b;

    public j2(a6 a6Var, int i7) {
        this.f22194a = i7;
        this.f22195b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f22194a) {
            case 0:
                this.f22195b.x();
                return;
            default:
                a6 a6Var = this.f22195b;
                a6Var.H = null;
                a aVar = a6Var.f21975y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21932b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = a6Var.f21969f.getText().toString();
                        if (!obj.equals(a6Var.I)) {
                            a aVar2 = a6Var.f21975y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f21932b).language;
                            int i7 = a6Var.J + 1;
                            a6Var.J = i7;
                            p9 p9Var = new p9(a6Var, i7, aVar2, obj, 4);
                            qi.p pVar = qi.j.f56228a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.f56228a.d(spannableString.toString(), b10, new wc1(12, spannableString, p9Var));
                                return;
                            } else {
                                org.telegram.messenger.g0.g3(new p4.z(5, p9Var, spannableString));
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
