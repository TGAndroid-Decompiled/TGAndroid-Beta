package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.fj;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cu0;
public final class z8 extends org.telegram.ui.Cells.i3 {
    public final fh.g F;
    public final int G;
    public final f9 H;

    public z8(f9 f9Var, Context context, cu0 cu0Var, String str, int i7, org.telegram.ui.ActionBar.i6 i6Var, fh.g gVar, int i10) {
        super(context, cu0Var, str, true, i7, i6Var);
        this.H = f9Var;
        this.F = gVar;
        this.G = i10;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        f9 f9Var = this.H;
        fj fjVar = f9Var.f3585i2;
        TLRPC.MessageAction messageAction = f9Var.f3584h2;
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
        CharSequence[] charSequenceArr = {f9Var.f3592p2.getText()};
        tL_textWithEntities.entities = ri.d0(this.G).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        fjVar.L5();
        f9Var.f3583g2.k0(fjVar, true);
        f9Var.f3593q2.O(true);
        f9Var.h1(true);
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
