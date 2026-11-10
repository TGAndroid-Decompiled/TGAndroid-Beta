package li;

import android.text.SpannableString;
import android.text.TextUtils;
import bi.ya;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 implements Runnable {
    public final int f18640a;
    public final a6 f18641b;

    public i2(a6 a6Var, int i7) {
        this.f18640a = i7;
        this.f18641b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f18640a) {
            case 0:
                this.f18641b.x();
                return;
            default:
                a6 a6Var = this.f18641b;
                a6Var.G = null;
                a aVar = a6Var.f18438y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f18395b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = a6Var.f18432f.getText().toString();
                        if (!obj.equals(a6Var.H)) {
                            a aVar2 = a6Var.f18438y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f18395b).language;
                            int i7 = a6Var.I + 1;
                            a6Var.I = i7;
                            ya yaVar = new ya(a6Var, i7, aVar2, obj, 2);
                            ni.s sVar = ni.m.f20640a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = ni.s.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                ni.m.f20640a.d(spannableString.toString(), b10, new ni.c(0, spannableString, yaVar));
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
