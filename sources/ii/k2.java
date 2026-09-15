package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class k2 implements Runnable {
    public final int f11467a;
    public final d6 f11468b;

    public k2(d6 d6Var, int i10) {
        this.f11467a = i10;
        this.f11468b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f11467a) {
            case 0:
                this.f11468b.x();
                return;
            default:
                d6 d6Var = this.f11468b;
                d6Var.G = null;
                a aVar = d6Var.f11342x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f11201b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = d6Var.f11337f.getText().toString();
                        if (!obj.equals(d6Var.H)) {
                            a aVar2 = d6Var.f11342x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f11201b).language;
                            int i10 = d6Var.I + 1;
                            d6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new fi.m0(d6Var, i10, aVar2, obj, 1));
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
