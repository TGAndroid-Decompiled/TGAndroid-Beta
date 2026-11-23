package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.p9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.uc1;
public final class j2 implements Runnable {
    public final int f22262a;
    public final a6 f22263b;

    public j2(a6 a6Var, int i7) {
        this.f22262a = i7;
        this.f22263b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f22262a) {
            case 0:
                this.f22263b.x();
                return;
            default:
                a6 a6Var = this.f22263b;
                a6Var.H = null;
                a aVar = a6Var.f22044y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f22001b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = a6Var.f22038f.getText().toString();
                        if (!obj.equals(a6Var.I)) {
                            a aVar2 = a6Var.f22044y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f22001b).language;
                            int i7 = a6Var.J + 1;
                            a6Var.J = i7;
                            p9 p9Var = new p9(a6Var, i7, aVar2, obj, 4);
                            qi.p pVar = qi.j.f56310a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.f56310a.d(spannableString.toString(), b10, new uc1(12, spannableString, p9Var));
                                return;
                            } else {
                                org.telegram.messenger.g0.g3(new org.telegram.ui.web.t1(9, p9Var, spannableString));
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
