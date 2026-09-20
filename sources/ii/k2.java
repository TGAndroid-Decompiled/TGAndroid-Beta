package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class k2 implements Runnable {
    public final int f11471a;
    public final d6 f11472b;

    public k2(d6 d6Var, int i10) {
        this.f11471a = i10;
        this.f11472b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f11471a) {
            case 0:
                this.f11472b.x();
                return;
            default:
                d6 d6Var = this.f11472b;
                d6Var.G = null;
                a aVar = d6Var.f11346x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f11205b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = d6Var.f11341f.getText().toString();
                        if (!obj.equals(d6Var.H)) {
                            a aVar2 = d6Var.f11346x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f11205b).language;
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
