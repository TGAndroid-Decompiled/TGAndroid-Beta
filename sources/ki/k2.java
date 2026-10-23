package ki;

import ai.va;
import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class k2 implements Runnable {
    public final int f15416a;
    public final c6 f15417b;

    public k2(c6 c6Var, int i10) {
        this.f15416a = i10;
        this.f15417b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f15416a) {
            case 0:
                this.f15417b.w();
                return;
            default:
                c6 c6Var = this.f15417b;
                c6Var.G = null;
                a aVar = c6Var.f15245x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f15141b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = c6Var.f15240f.getText().toString();
                        if (!obj.equals(c6Var.H)) {
                            a aVar2 = c6Var.f15245x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f15141b).language;
                            int i10 = c6Var.I + 1;
                            c6Var.I = i10;
                            va vaVar = new va(c6Var, i10, aVar2, obj, 2);
                            mi.r rVar = mi.k.f17024a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = mi.r.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                mi.k.f17024a.d(spannableString.toString(), b10, new m4.w0(3, spannableString, vaVar));
                                return;
                            } else {
                                AndroidUtilities.runOnUIThread(new m4.z(4, vaVar, spannableString));
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
