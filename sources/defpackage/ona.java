package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ona implements Runnable {
    public final byte a;
    public final qna b;

    public ona(qna qnaVar, byte b) {
        this.a = b;
        this.b = qnaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qna qnaVar = this.b;
        switch (b) {
            case 0:
                if (qnaVar.j.isEmpty()) {
                    qnaVar.i = true;
                    qna.n = null;
                    pna pnaVar = qnaVar.f;
                    if (pnaVar != null) {
                        pnaVar.a = false;
                        qnaVar.f = null;
                    }
                    qnaVar.d.removeView(qnaVar.e);
                    if (qnaVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) qnaVar.d.getParent()).removeView(qnaVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = qnaVar.j;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).invalidate();
                }
                return;
        }
    }
}
