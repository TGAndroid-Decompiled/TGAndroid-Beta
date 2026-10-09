package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class l2 implements Runnable {
    public final int f12551a;
    public final f6 f12552b;

    public l2(f6 f6Var, int i10) {
        this.f12551a = i10;
        this.f12552b = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f12551a) {
            case 0:
                this.f12552b.x();
                return;
            default:
                f6 f6Var = this.f12552b;
                f6Var.G = null;
                a aVar = f6Var.f12424x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f12234b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = f6Var.f12419f.getText().toString();
                        if (!obj.equals(f6Var.H)) {
                            a aVar2 = f6Var.f12424x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.f12234b).language;
                            int i10 = f6Var.I + 1;
                            f6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new fi.m0(f6Var, i10, aVar2, obj, 1));
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
