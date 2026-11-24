package defpackage;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class a0 implements View.OnClickListener {
    public final byte a;
    public final e0 b;

    public a0(e0 e0Var, byte b) {
        this.a = b;
        this.b = e0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        e0 e0Var = this.b;
        switch (b) {
            case 0:
                e0Var.dismiss();
                return;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i = e0Var.c2 + 1;
                    e0Var.c2 = i;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = e0Var.d2;
                    if (i >= aicomposetoneexampleArr.length) {
                        e0Var.c2 = 0;
                        i = 0;
                    }
                    if (aicomposetoneexampleArr[i] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i;
                        ConnectionsManager.getInstance(e0Var.a).sendRequestTyped(gettoneexample, new hc((byte) 0), new c0(e0Var, i, (byte) 0));
                    }
                    e0Var.b2.O(true);
                    return;
                }
                return;
        }
    }
}
