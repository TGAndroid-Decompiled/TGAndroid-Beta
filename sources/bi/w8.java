package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.du0;
public final class w8 extends org.telegram.ui.Cells.i3 {
    public final fh.g F;
    public final int G;
    public final c9 H;

    public w8(c9 c9Var, Context context, du0 du0Var, String str, int i7, org.telegram.ui.ActionBar.h6 h6Var, fh.g gVar, int i10) {
        super(context, du0Var, str, true, i7, h6Var);
        this.H = c9Var;
        this.F = gVar;
        this.G = i10;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        c9 c9Var = this.H;
        gj gjVar = c9Var.f3514i2;
        TLRPC.MessageAction messageAction = c9Var.f3513h2;
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
        CharSequence[] charSequenceArr = {c9Var.f3521p2.getText()};
        tL_textWithEntities.entities = si.d0(this.G).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        gjVar.L5();
        c9Var.f3512g2.i0(gjVar, true);
        c9Var.f3522q2.O(true);
        c9Var.h1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        fh.g gVar = this.F;
        gVar.setBounds(L, 0, measuredWidth, measuredHeight);
        gVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        super.onMeasure(i7, i10);
    }
}
