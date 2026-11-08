package li;

import android.text.SpannableString;
import android.text.TextUtils;
import bi.ya;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 implements Runnable {
    public final int f18637a;
    public final a6 f18638b;

    public i2(a6 a6Var, int i7) {
        this.f18637a = i7;
        this.f18638b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f18637a) {
            case 0:
                this.f18638b.x();
                return;
            default:
                a6 a6Var = this.f18638b;
                a6Var.G = null;
                a aVar = a6Var.f18435y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f18392b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = a6Var.f18429f.getText().toString();
                        if (!obj.equals(a6Var.H)) {
                            a aVar2 = a6Var.f18435y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f18392b).language;
                            int i7 = a6Var.I + 1;
                            a6Var.I = i7;
                            ya yaVar = new ya(a6Var, i7, aVar2, obj, 2);
                            ni.s sVar = ni.m.f20635a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = ni.s.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                ni.m.f20635a.d(spannableString.toString(), b10, new ni.c(0, spannableString, yaVar));
                                return;
                            } else {
                                org.telegram.messenger.g0.h3(new j3(13, yaVar, spannableString));
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
