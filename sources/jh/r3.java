package jh;

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
import org.telegram.ui.Components.s80;
public final class r3 extends View {
    public final TextPaint f12695a;
    public final s80 f12696b;
    public final Paint f12697c;
    public final Paint d;
    public StaticLayout f12698e;
    public boolean f12699f;
    public int h;
    public int f12700n;
    public BitmapShader f12701r;
    public Matrix f12702s;
    public Matrix v;
    public CharSequence f12703w;

    public r3(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(6.0f);
        this.f12700n = AndroidUtilities.dp(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f12695a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        Paint paint = new Paint(1);
        this.f12697c = paint;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        this.f12696b = new s80(0);
    }

    public final void a(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            this.f12703w = charSequence;
            return;
        }
        this.f12698e = new StaticLayout(charSequence, this.f12695a, i10 - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        s80 s80Var = this.f12696b;
        s80Var.rewind();
        int i11 = this.h;
        int i12 = this.f12700n;
        s80Var.f31452e = i11;
        s80Var.f31453f = i12;
        if (this.f12699f) {
            s80Var.e(null, 0, 0.0f, 0.0f);
            float f9 = Float.MAX_VALUE;
            float width = this.f12698e.getWidth();
            float f10 = Float.MIN_VALUE;
            float f11 = 0.0f;
            for (int i13 = 0; i13 < this.f12698e.getLineCount(); i13++) {
                width = Math.min(width, this.f12698e.getLineLeft(i13));
                f10 = Math.min(f10, this.f12698e.getLineTop(i13));
                f11 = Math.max(f11, this.f12698e.getLineRight(i13));
                f9 = Math.max(f9, this.f12698e.getLineBottom(i13));
            }
            this.f12696b.addRect(width, f10, f11, this.f12698e.getHeight(), Path.Direction.CW);
        } else {
            s80Var.e(this.f12698e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f12698e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), s80Var);
            s80Var.a();
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
        if (this.f12698e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f12698e.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
            Matrix matrix = this.f12702s;
            if (matrix != null) {
                matrix.reset();
                this.v.reset();
                r3 r3Var = this;
                while (r3Var != 0) {
                    this.v.postConcat(r3Var.getMatrix());
                    if (r3Var.getParent() instanceof View) {
                        r3Var = (View) r3Var.getParent();
                    } else {
                        r3Var = 0;
                    }
                }
                this.v.invert(this.f12702s);
                this.f12702s.preTranslate((-this.h) / 2, -AndroidUtilities.dp(16.0f));
                this.f12702s.preScale(12.0f, 12.0f);
                this.f12701r.setLocalMatrix(this.f12702s);
            }
            Paint paint = this.f12697c;
            s80 s80Var = this.f12696b;
            canvas.drawPath(s80Var, paint);
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(l1);
            canvas.drawPath(s80Var, paint2);
            this.f12698e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        CharSequence charSequence = this.f12703w;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f12698e;
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

    public void setFullRect(boolean z10) {
        this.f12699f = z10;
    }

    public void setRoundRadius(float f9) {
        this.f12697c.setPathEffect(new CornerPathEffect(f9));
        this.d.setPathEffect(new CornerPathEffect(f9));
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
