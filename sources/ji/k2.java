package ji;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class k2 implements Runnable {
    public final int f13375a;
    public final i6 f13376b;

    public k2(i6 i6Var, int i10) {
        this.f13375a = i10;
        this.f13376b = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f13375a) {
            case 0:
                this.f13376b.x();
                return;
            default:
                i6 i6Var = this.f13376b;
                i6Var.G = null;
                a aVar = i6Var.f13345x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f13107b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = i6Var.f13340f.getText().toString();
                        if (!obj.equals(i6Var.H)) {
                            a aVar2 = i6Var.f13345x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f13107b).language;
                            int i10 = i6Var.I + 1;
                            i6Var.I = i10;
                            gi.m0 m0Var = new gi.m0(i6Var, i10, aVar2, obj, 1);
                            li.q qVar = li.k.f14761a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = li.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                li.k.f14761a.d(spannableString.toString(), b10, new ah.h0(24, spannableString, m0Var));
                                return;
                            } else {
                                AndroidUtilities.runOnUIThread(new v2(9, m0Var, spannableString));
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
