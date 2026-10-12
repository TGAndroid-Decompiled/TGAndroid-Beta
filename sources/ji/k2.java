package ji;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class k2 implements Runnable {
    public final int f13372a;
    public final i6 f13373b;

    public k2(i6 i6Var, int i10) {
        this.f13372a = i10;
        this.f13373b = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f13372a) {
            case 0:
                this.f13373b.x();
                return;
            default:
                i6 i6Var = this.f13373b;
                i6Var.G = null;
                a aVar = i6Var.f13342x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f13103b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = i6Var.f13337f.getText().toString();
                        if (!obj.equals(i6Var.H)) {
                            a aVar2 = i6Var.f13342x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f13103b).language;
                            int i10 = i6Var.I + 1;
                            i6Var.I = i10;
                            gi.m0 m0Var = new gi.m0(i6Var, i10, aVar2, obj, 1);
                            mi.q qVar = mi.k.f15868a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = mi.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                mi.k.f15868a.d(spannableString.toString(), b10, new m4.z0(2, spannableString, m0Var));
                                return;
                            } else {
                                AndroidUtilities.runOnUIThread(new v2(20, m0Var, spannableString));
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
