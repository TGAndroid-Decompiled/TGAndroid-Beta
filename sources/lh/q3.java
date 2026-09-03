package lh;

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
import org.telegram.ui.Components.y80;
public final class q3 extends View {
    public final TextPaint f12955a;
    public final y80 f12956b;
    public final Paint f12957c;
    public final Paint d;
    public StaticLayout e;
    public boolean f12958f;
    public int h;
    public int f12959n;
    public BitmapShader f12960r;
    public Matrix f12961s;
    public Matrix v;
    public CharSequence f12962w;

    public q3(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(6.0f);
        this.f12959n = AndroidUtilities.dp(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f12955a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        Paint paint = new Paint(1);
        this.f12957c = paint;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        this.f12956b = new y80(0);
    }

    public final void a(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            this.f12962w = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.f12955a, i10 - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        y80 y80Var = this.f12956b;
        y80Var.rewind();
        int i11 = this.h;
        int i12 = this.f12959n;
        y80Var.e = i11;
        y80Var.f28561f = i12;
        if (this.f12958f) {
            y80Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i13 = 0; i13 < this.e.getLineCount(); i13++) {
                width = Math.min(width, this.e.getLineLeft(i13));
                f11 = Math.min(f11, this.e.getLineTop(i13));
                f12 = Math.max(f12, this.e.getLineRight(i13));
                f10 = Math.max(f10, this.e.getLineBottom(i13));
            }
            this.f12956b.addRect(width, f11, f12, this.e.getHeight(), Path.Direction.CW);
        } else {
            y80Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), y80Var);
            y80Var.a();
        }
        invalidate();
    }

    public final void b(int i10, TL_stars.SavedStarGift savedStarGift) {
        int i11;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(savedStarGift.gift.owner_id);
            if (clientUserId == peerDialogId) {
                if (savedStarGift.gift.crafted) {
                    i11 = R.string.GiftSelfTopActionCrafted;
                } else {
                    i11 = R.string.GiftSelfTopAction;
                }
                set(AndroidUtilities.replaceTags(LocaleController.formatString(i11, LocaleController.formatDate(savedStarGift.date))));
                return;
            } else if (clientUserId == peerDialogId2) {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i10, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
                return;
            } else {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i10, peerDialogId), DialogObject.getShortName(i10, peerDialogId2), LocaleController.formatDate(savedStarGift.date))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.e.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
            Matrix matrix = this.f12961s;
            if (matrix != null) {
                matrix.reset();
                this.v.reset();
                q3 q3Var = this;
                while (q3Var != 0) {
                    this.v.postConcat(q3Var.getMatrix());
                    if (q3Var.getParent() instanceof View) {
                        q3Var = (View) q3Var.getParent();
                    } else {
                        q3Var = 0;
                    }
                }
                this.v.invert(this.f12961s);
                this.f12961s.preTranslate((-this.h) / 2, -AndroidUtilities.dp(16.0f));
                this.f12961s.preScale(12.0f, 12.0f);
                this.f12960r.setLocalMatrix(this.f12961s);
            }
            Paint paint = this.f12957c;
            y80 y80Var = this.f12956b;
            canvas.drawPath(y80Var, paint);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(l1);
            canvas.drawPath(y80Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        CharSequence charSequence = this.f12962w;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.e;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight() + AndroidUtilities.dp(32.0f);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.action != null) {
            int i10 = messageObject.currentAccount;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                setVisibility(8);
                return;
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
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
                return;
            } else {
                setVisibility(8);
                return;
            }
        }
        setVisibility(8);
    }

    public void setFullRect(boolean z4) {
        this.f12958f = z4;
    }

    public void setRoundRadius(float f10) {
        this.f12957c.setPathEffect(new CornerPathEffect(f10));
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
