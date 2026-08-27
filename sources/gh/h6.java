package gh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zu0;

public final class h6 extends org.telegram.ui.Cells.d3 {
    public final m6 A;

    public final lg.f f7296x;

    public final int f7297y;

    public h6(m6 m6Var, Context context, zu0 zu0Var, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var, lg.f fVar, int i11) {
        super(context, zu0Var, str, true, i10, c6Var);
        this.A = m6Var;
        this.f7296x = fVar;
        this.f7297y = i11;
    }

    @Override
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        m6 m6Var = this.A;
        MessageObject messageObject = m6Var.f7446i0;
        TLRPC.MessageAction messageAction = m6Var.f7445h0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            ((TLRPC.TL_messageActionStarGift) messageAction).message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
            tL_messageActionGiftCode.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftCode.message = tL_textWithEntities;
        } else {
            if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
                return;
            }
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction;
            tL_messageActionGiftPremium.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftPremium.message = tL_textWithEntities;
        }
        CharSequence[] charSequenceArr = {m6Var.f7451o0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.f7297y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        m6Var.f7444g0.U(messageObject, true);
        m6Var.f7452p0.N(true);
        m6Var.Z(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        lg.f fVar = this.f7296x;
        fVar.setBounds(iDp, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
