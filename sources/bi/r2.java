package bi;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
public final class r2 implements Runnable {
    public final int f3316a;
    public final q6 f3317b;

    public r2(q6 q6Var, int i10) {
        this.f3316a = i10;
        this.f3317b = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f3316a) {
            case 0:
                this.f3317b.x();
                return;
            default:
                q6 q6Var = this.f3317b;
                q6Var.G = null;
                a aVar = q6Var.f3309y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f2818b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = q6Var.f3303f.getText().toString();
                        if (!obj.equals(q6Var.H)) {
                            a aVar2 = q6Var.f3309y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f2818b).language;
                            int i10 = q6Var.I + 1;
                            q6Var.I = i10;
                            i6 i6Var = new i6(q6Var, i10, aVar2, obj, 0);
                            di.s sVar = di.l.f5973a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = di.s.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                di.l.f5973a.d(spannableString.toString(), b10, new ag.m(10, spannableString, i6Var));
                                return;
                            } else {
                                org.telegram.messenger.i0.g3(new d1.e(2, i6Var, spannableString));
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
