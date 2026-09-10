package hi;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class n2 implements Runnable {
    public final int f9752a;
    public final g6 f9753b;

    public n2(g6 g6Var, int i10) {
        this.f9752a = i10;
        this.f9753b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f9752a) {
            case 0:
                this.f9753b.x();
                return;
            default:
                g6 g6Var = this.f9753b;
                g6Var.G = null;
                a aVar = g6Var.f9626x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f9421b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = g6Var.f9621f.getText().toString();
                        if (!obj.equals(g6Var.H)) {
                            a aVar2 = g6Var.f9626x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f9421b).language;
                            int i10 = g6Var.I + 1;
                            g6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new ei.m0(g6Var, i10, aVar2, obj, 1));
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
