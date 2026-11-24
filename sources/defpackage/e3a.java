package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.tgnet.TLRPC;
public final class e3a extends gu3 {
    public final im0 F;
    public final int G;
    public final j3a H;

    public e3a(j3a j3aVar, Context context, ela elaVar, String str, int i, ylb ylbVar, im0 im0Var, int i2) {
        super(context, elaVar, str, true, i, ylbVar);
        this.H = j3aVar;
        this.F = im0Var;
        this.G = i2;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        j3a j3aVar = this.H;
        k47 k47Var = j3aVar.h2;
        TLRPC.MessageAction messageAction = j3aVar.g2;
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
        CharSequence[] charSequenceArr = {j3aVar.o2.getText()};
        tL_textWithEntities.entities = hs6.d0(this.G).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        k47Var.K5();
        j3aVar.f2.i0(k47Var, true);
        j3aVar.p2.O(true);
        j3aVar.b1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = gm.L(10.0f);
        int measuredWidth = getMeasuredWidth() - gm.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        im0 im0Var = this.F;
        im0Var.setBounds(L, 0, measuredWidth, measuredHeight);
        im0Var.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(gm.L(16.0f), 0, gm.L(12.0f), 0);
        super.onMeasure(i, i2);
    }
}
