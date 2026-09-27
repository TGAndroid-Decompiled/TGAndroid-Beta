package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class l2 implements Runnable {
    public final int f11484a;
    public final e6 f11485b;

    public l2(e6 e6Var, int i10) {
        this.f11484a = i10;
        this.f11485b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f11484a) {
            case 0:
                this.f11485b.x();
                return;
            default:
                e6 e6Var = this.f11485b;
                e6Var.G = null;
                a aVar = e6Var.f11357x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f11194b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = e6Var.f11352f.getText().toString();
                        if (!obj.equals(e6Var.H)) {
                            a aVar2 = e6Var.f11357x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f11194b).language;
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
