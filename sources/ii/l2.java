package ii;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class l2 implements Runnable {
    public final int f12548a;
    public final e6 f12549b;

    public l2(e6 e6Var, int i10) {
        this.f12548a = i10;
        this.f12549b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f12548a) {
            case 0:
                this.f12549b.x();
                return;
            default:
                e6 e6Var = this.f12549b;
                e6Var.G = null;
                a aVar = e6Var.f12409x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f12232b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = e6Var.f12404f.getText().toString();
                        if (!obj.equals(e6Var.H)) {
                            a aVar2 = e6Var.f12409x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f12232b).language;
                            int i10 = e6Var.I + 1;
                            e6Var.I = i10;
                            fi.m0 m0Var = new fi.m0(e6Var, i10, aVar2, obj, 1);
                            ki.q qVar = ki.k.f14892a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = ki.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                ki.k.f14892a.d(spannableString.toString(), b10, new ah.b(23, spannableString, m0Var));
                                return;
                            } else {
                                AndroidUtilities.runOnUIThread(new gg.w1(27, m0Var, spannableString));
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
