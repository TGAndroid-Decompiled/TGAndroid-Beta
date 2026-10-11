package ii;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class l2 implements Runnable {
    public final int f12550a;
    public final f6 f12551b;

    public l2(f6 f6Var, int i10) {
        this.f12550a = i10;
        this.f12551b = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f12550a) {
            case 0:
                this.f12551b.x();
                return;
            default:
                f6 f6Var = this.f12551b;
                f6Var.G = null;
                a aVar = f6Var.f12423x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f12233b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = f6Var.f12418f.getText().toString();
                        if (!obj.equals(f6Var.H)) {
                            a aVar2 = f6Var.f12423x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f12233b).language;
                            int i10 = f6Var.I + 1;
                            f6Var.I = i10;
                            fi.m0 m0Var = new fi.m0(f6Var, i10, aVar2, obj, 1);
                            li.q qVar = li.k.f15623a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = li.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                li.k.f15623a.d(spannableString.toString(), b10, new ah.b(24, spannableString, m0Var));
                                return;
                            } else {
                                AndroidUtilities.runOnUIThread(new ki.i0(2, m0Var, spannableString));
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
