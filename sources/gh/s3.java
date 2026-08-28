package gh;

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
import org.telegram.ui.Components.f80;
public final class s3 extends View {
    public final TextPaint f8860a;
    public final f80 f8861b;
    public final Paint f8862c;
    public final Paint d;
    public StaticLayout f8863e;
    public boolean f8864f;
    public int h;
    public int f8865n;
    public BitmapShader f8866r;
    public Matrix f8867s;
    public Matrix v;
    public CharSequence f8868w;

    public s3(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(6.0f);
        this.f8865n = AndroidUtilities.dp(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f8860a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        Paint paint = new Paint(1);
        this.f8862c = paint;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        this.f8861b = new f80(0);
    }

    public final void a(int i9, CharSequence charSequence) {
        if (i9 <= 0) {
            this.f8868w = charSequence;
            return;
        }
        this.f8863e = new StaticLayout(charSequence, this.f8860a, i9 - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        f80 f80Var = this.f8861b;
        f80Var.rewind();
        int i10 = this.h;
        int i11 = this.f8865n;
        f80Var.f30220e = i10;
        f80Var.f30221f = i11;
        if (this.f8864f) {
            f80Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.f8863e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i12 = 0; i12 < this.f8863e.getLineCount(); i12++) {
                width = Math.min(width, this.f8863e.getLineLeft(i12));
                f11 = Math.min(f11, this.f8863e.getLineTop(i12));
                f12 = Math.max(f12, this.f8863e.getLineRight(i12));
                f10 = Math.max(f10, this.f8863e.getLineBottom(i12));
            }
            this.f8861b.addRect(width, f11, f12, this.f8863e.getHeight(), Path.Direction.CW);
        } else {
            f80Var.e(this.f8863e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f8863e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), f80Var);
            f80Var.a();
        }
        invalidate();
    }

    public final void b(int i9, TL_stars.SavedStarGift savedStarGift) {
        int i10;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long clientUserId = UserConfig.getInstance(i9).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(savedStarGift.gift.owner_id);
            if (clientUserId == peerDialogId) {
                if (savedStarGift.gift.crafted) {
                    i10 = R.string.GiftSelfTopActionCrafted;
                } else {
                    i10 = R.string.GiftSelfTopAction;
                }
                set(AndroidUtilities.replaceTags(LocaleController.formatString(i10, LocaleController.formatDate(savedStarGift.date))));
                return;
            } else if (clientUserId == peerDialogId2) {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i9, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
                return;
            } else {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i9, peerDialogId), DialogObject.getShortName(i9, peerDialogId2), LocaleController.formatDate(savedStarGift.date))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8863e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f8863e.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
            Matrix matrix = this.f8867s;
            if (matrix != null) {
                matrix.reset();
                this.v.reset();
                s3 s3Var = this;
                while (s3Var != 0) {
                    this.v.postConcat(s3Var.getMatrix());
                    if (s3Var.getParent() instanceof View) {
                        s3Var = (View) s3Var.getParent();
                    } else {
                        s3Var = 0;
                    }
                }
                this.v.invert(this.f8867s);
                this.f8867s.preTranslate((-this.h) / 2, -AndroidUtilities.dp(16.0f));
                this.f8867s.preScale(12.0f, 12.0f);
                this.f8866r.setLocalMatrix(this.f8867s);
            }
            Paint paint = this.f8862c;
            f80 f80Var = this.f8861b;
            canvas.drawPath(f80Var, paint);
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(l1);
            canvas.drawPath(f80Var, paint2);
            this.f8863e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int height;
        int size = View.MeasureSpec.getSize(i9);
        CharSequence charSequence = this.f8868w;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f8863e;
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
            int i9 = messageObject.currentAccount;
            long clientUserId = UserConfig.getInstance(i9).getClientUserId();
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
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i9, peerDialogId), LocaleController.formatDate(messageObject.messageOwner.date))));
                } else {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i9, peerDialogId), DialogObject.getShortName(i9, peerDialogId2), LocaleController.formatDate(messageObject.messageOwner.date))));
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

    public void setFullRect(boolean z10) {
        this.f8864f = z10;
    }

    public void setRoundRadius(float f10) {
        this.f8862c.setPathEffect(new CornerPathEffect(f10));
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
