package ji;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class j2 implements Runnable {
    public final int f13988a;
    public final g6 f13989b;

    public j2(g6 g6Var, int i10) {
        this.f13988a = i10;
        this.f13989b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f13988a) {
            case 0:
                this.f13989b.x();
                return;
            default:
                g6 g6Var = this.f13989b;
                g6Var.G = null;
                a aVar = g6Var.f13938x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f13732b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = g6Var.f13933f.getText().toString();
                        if (!obj.equals(g6Var.H)) {
                            a aVar2 = g6Var.f13938x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f13732b).language;
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
