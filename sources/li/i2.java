package li;

import android.text.SpannableString;
import android.text.TextUtils;
import bi.ya;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 implements Runnable {
    public final int f18634a;
    public final a6 f18635b;

    public i2(a6 a6Var, int i7) {
        this.f18634a = i7;
        this.f18635b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f18634a) {
            case 0:
                this.f18635b.x();
                return;
            default:
                a6 a6Var = this.f18635b;
                a6Var.G = null;
                a aVar = a6Var.f18432y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f18389b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = a6Var.f18426f.getText().toString();
                        if (!obj.equals(a6Var.H)) {
                            a aVar2 = a6Var.f18432y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f18389b).language;
                            int i7 = a6Var.I + 1;
                            a6Var.I = i7;
                            ya yaVar = new ya(a6Var, i7, aVar2, obj, 2);
                            ni.s sVar = ni.m.f20632a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = ni.s.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                ni.m.f20632a.d(spannableString.toString(), b10, new ni.c(0, spannableString, yaVar));
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
