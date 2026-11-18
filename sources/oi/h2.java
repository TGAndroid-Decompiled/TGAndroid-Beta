package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.o9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.wc1;
public final class h2 implements Runnable {
    public final int f22085a;
    public final z5 f22086b;

    public h2(z5 z5Var, int i7) {
        this.f22085a = i7;
        this.f22086b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f22085a) {
            case 0:
                this.f22086b.x();
                return;
            default:
                z5 z5Var = this.f22086b;
                z5Var.H = null;
                a aVar = z5Var.f22568y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f21910b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = z5Var.f22562f.getText().toString();
                        if (!obj.equals(z5Var.I)) {
                            a aVar2 = z5Var.f22568y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f21910b).language;
                            int i7 = z5Var.J + 1;
                            z5Var.J = i7;
                            o9 o9Var = new o9(z5Var, i7, aVar2, obj, 3);
                            qi.p pVar = qi.j.f56187a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.f56187a.d(spannableString.toString(), b10, new wc1(12, spannableString, o9Var));
                                return;
                            } else {
                                org.telegram.messenger.g0.g3(new p4.o0(3, o9Var, spannableString));
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
