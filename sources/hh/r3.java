package hh;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j80;

public final class r3 extends View {

    public final TextPaint f9981a;

    public final j80 f9982b;

    public final Paint f9983c;
    public final Paint d;

    public StaticLayout f9984e;

    public boolean f9985f;
    public int h;

    public int f9986n;

    public BitmapShader f9987r;

    public Matrix f9988s;
    public Matrix v;

    public CharSequence f9989w;

    public r3(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(6.0f);
        this.f9986n = AndroidUtilities.dp(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f9981a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        Paint paint = new Paint(1);
        this.f9983c = paint;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        this.f9982b = new j80(0);
    }

    public final void a(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            this.f9989w = charSequence;
            return;
        }
        this.f9984e = new StaticLayout(charSequence, this.f9981a, i10 - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        j80 j80Var = this.f9982b;
        j80Var.rewind();
        int i11 = this.h;
        int i12 = this.f9986n;
        j80Var.f29463e = i11;
        j80Var.f29464f = i12;
        if (this.f9985f) {
            j80Var.e(null, 0, 0.0f, 0.0f);
            float fMax = Float.MAX_VALUE;
            float width = this.f9984e.getWidth();
            float fMin = Float.MIN_VALUE;
            float fMax2 = 0.0f;
            for (int i13 = 0; i13 < this.f9984e.getLineCount(); i13++) {
                width = Math.min(width, this.f9984e.getLineLeft(i13));
                fMin = Math.min(fMin, this.f9984e.getLineTop(i13));
                fMax2 = Math.max(fMax2, this.f9984e.getLineRight(i13));
                fMax = Math.max(fMax, this.f9984e.getLineBottom(i13));
            }
            this.f9982b.addRect(width, fMin, fMax2, this.f9984e.getHeight(), Path.Direction.CW);
        } else {
            j80Var.e(this.f9984e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f9984e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), j80Var);
            j80Var.a();
        }
        invalidate();
    }

    public final void b(int i10, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(savedStarGift.gift.owner_id);
        if (clientUserId == peerDialogId) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(savedStarGift.gift.crafted ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(savedStarGift.date))));
        } else if (clientUserId == peerDialogId2) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i10, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
        } else {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i10, peerDialogId), DialogObject.getShortName(i10, peerDialogId2), LocaleController.formatDate(savedStarGift.date))));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9984e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f9984e.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
            Matrix matrix = this.f9988s;
            if (matrix != null) {
                matrix.reset();
                this.v.reset();
                View view = this;
                while (view != null) {
                    this.v.postConcat(view.getMatrix());
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                this.v.invert(this.f9988s);
                this.f9988s.preTranslate((-this.h) / 2, -AndroidUtilities.dp(16.0f));
                this.f9988s.preScale(12.0f, 12.0f);
                this.f9987r.setLocalMatrix(this.f9988s);
            }
            Paint paint = this.f9983c;
            j80 j80Var = this.f9982b;
            canvas.drawPath(j80Var, paint);
            int iL1 = org.telegram.ui.ActionBar.g6.l1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(iL1);
            canvas.drawPath(j80Var, paint2);
            this.f9984e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        CharSequence charSequence = this.f9989w;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f9984e;
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + AndroidUtilities.dp(32.0f), 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null || message.action == null) {
            setVisibility(8);
            return;
        }
        int i10 = messageObject.currentAccount;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            setVisibility(8);
            return;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            setVisibility(8);
            return;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer == null) {
            setVisibility(8);
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.peer);
        if (clientUserId == peerDialogId) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString((tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(messageObject.messageOwner.date))));
        } else if (clientUserId == peerDialogId2) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i10, peerDialogId), LocaleController.formatDate(messageObject.messageOwner.date))));
        } else {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i10, peerDialogId), DialogObject.getShortName(i10, peerDialogId2), LocaleController.formatDate(messageObject.messageOwner.date))));
        }
        setVisibility(0);
    }

    public void setFullRect(boolean z10) {
        this.f9985f = z10;
    }

    public void setRoundRadius(float f10) {
        this.f9983c.setPathEffect(new CornerPathEffect(f10));
        this.d.setPathEffect(new CornerPathEffect(f10));
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
