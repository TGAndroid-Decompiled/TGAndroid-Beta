package li;

import android.text.SpannableString;
import android.text.TextUtils;
import bi.ua;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 implements Runnable {
    public final int f17295a;
    public final d6 f17296b;

    public i2(d6 d6Var, int i10) {
        this.f17295a = i10;
        this.f17296b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f17295a) {
            case 0:
                this.f17296b.w();
                return;
            default:
                d6 d6Var = this.f17296b;
                d6Var.G = null;
                a aVar = d6Var.f17202x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f17054b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = d6Var.f17197f.getText().toString();
                        if (!obj.equals(d6Var.H)) {
                            a aVar2 = d6Var.f17202x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f17054b).language;
                            int i10 = d6Var.I + 1;
                            d6Var.I = i10;
                            ua uaVar = new ua(d6Var, i10, aVar2, obj, 2);
                            ni.q qVar = ni.k.f18887a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = ni.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                ni.k.f18887a.d(spannableString.toString(), b10, new m4.s0(5, spannableString, uaVar));
                                return;
                            } else {
                                AndroidUtilities.runOnUIThread(new k2.e0(17, uaVar, spannableString));
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
