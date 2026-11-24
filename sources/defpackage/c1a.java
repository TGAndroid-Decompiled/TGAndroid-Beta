package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.tgnet.TLRPC;
public final class c1a extends ws3 {
    public final il0 F;
    public final int G;
    public final h1a H;

    public c1a(h1a h1aVar, Context context, cja cjaVar, String str, int i, wjb wjbVar, il0 il0Var, int i2) {
        super(context, cjaVar, str, true, i, wjbVar);
        this.H = h1aVar;
        this.F = il0Var;
        this.G = i2;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        h1a h1aVar = this.H;
        k27 k27Var = h1aVar.h2;
        TLRPC.MessageAction messageAction = h1aVar.g2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            ((TLRPC.TL_messageActionStarGift) messageAction).message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
            tL_messageActionGiftCode.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftCode.message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction;
            tL_messageActionGiftPremium.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftPremium.message = tL_textWithEntities;
        } else {
            return;
        }
        CharSequence[] charSequenceArr = {h1aVar.o2.getText()};
        tL_textWithEntities.entities = hq6.d0(this.G).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        k27Var.K5();
        h1aVar.f2.j0(k27Var, true);
        h1aVar.p2.O(true);
        h1aVar.b1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = gl.L(10.0f);
        int measuredWidth = getMeasuredWidth() - gl.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        il0 il0Var = this.F;
        il0Var.setBounds(L, 0, measuredWidth, measuredHeight);
        il0Var.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(gl.L(16.0f), 0, gl.L(12.0f), 0);
        super.onMeasure(i, i2);
    }
}
