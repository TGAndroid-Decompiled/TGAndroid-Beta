package mi;

import android.text.SpannableString;
import android.text.TextUtils;
import ci.w9;
import org.telegram.tgnet.tl.TL_iv;
public final class j2 implements Runnable {
    public final int f19699a;
    public final b6 f19700b;

    public j2(b6 b6Var, int i3) {
        this.f19699a = i3;
        this.f19700b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f19699a) {
            case 0:
                this.f19700b.x();
                return;
            default:
                b6 b6Var = this.f19700b;
                b6Var.H = null;
                a aVar = b6Var.f19491y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f19431b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = b6Var.f19485f.getText().toString();
                        if (!obj.equals(b6Var.I)) {
                            a aVar2 = b6Var.f19491y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f19431b).language;
                            int i3 = b6Var.J + 1;
                            b6Var.J = i3;
                            w9 w9Var = new w9(b6Var, i3, aVar2, obj, 2);
                            oi.q qVar = oi.k.f21149a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = oi.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                oi.k.f21149a.d(spannableString.toString(), b10, new d4(10, spannableString, w9Var));
                                return;
                            } else {
                                org.telegram.messenger.g0.h3(new m2.s(18, w9Var, spannableString));
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
