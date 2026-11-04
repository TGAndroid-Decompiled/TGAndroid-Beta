package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qt0;
public final class x6 extends org.telegram.ui.Cells.h3 {
    public final gh.g F;
    public final int G;
    public final d7 H;

    public x6(d7 d7Var, Context context, qt0 qt0Var, String str, int i3, org.telegram.ui.ActionBar.e6 e6Var, gh.g gVar, int i10) {
        super(context, qt0Var, str, true, i3, e6Var);
        this.H = d7Var;
        this.F = gVar;
        this.G = i10;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        d7 d7Var = this.H;
        zi ziVar = d7Var.f581f2;
        TLRPC.MessageAction messageAction = d7Var.f580e2;
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
        CharSequence[] charSequenceArr = {d7Var.f588m2.getText()};
        tL_textWithEntities.entities = li.b0(this.G).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        ziVar.M5();
        d7Var.f579d2.f0(ziVar, true);
        d7Var.f589n2.O(true);
        d7Var.g1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        gh.g gVar = this.F;
        gVar.setBounds(L, 0, measuredWidth, measuredHeight);
        gVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        super.onMeasure(i3, i10);
    }
}
