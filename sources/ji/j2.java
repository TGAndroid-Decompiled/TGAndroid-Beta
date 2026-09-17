package ji;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class j2 implements Runnable {
    public final int f14014a;
    public final g6 f14015b;

    public j2(g6 g6Var, int i10) {
        this.f14014a = i10;
        this.f14015b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f14014a) {
            case 0:
                this.f14015b.x();
                return;
            default:
                g6 g6Var = this.f14015b;
                g6Var.G = null;
                a aVar = g6Var.f13964x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f13758b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = g6Var.f13959f.getText().toString();
                        if (!obj.equals(g6Var.H)) {
                            a aVar2 = g6Var.f13964x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f13758b).language;
                            int i10 = g6Var.I + 1;
                            g6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new gi.m0(g6Var, i10, aVar2, obj, 1));
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
