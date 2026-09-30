package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class l2 implements Runnable {
    public final int f11495a;
    public final e6 f11496b;

    public l2(e6 e6Var, int i10) {
        this.f11495a = i10;
        this.f11496b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f11495a) {
            case 0:
                this.f11496b.x();
                return;
            default:
                e6 e6Var = this.f11496b;
                e6Var.G = null;
                a aVar = e6Var.f11368x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f11205b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = e6Var.f11363f.getText().toString();
                        if (!obj.equals(e6Var.H)) {
                            a aVar2 = e6Var.f11368x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f11205b).language;
                            int i10 = e6Var.I + 1;
                            e6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new fi.m0(e6Var, i10, aVar2, obj, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
