package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.zp;
public final class y1 extends FrameLayout {
    public final j9 f15901a;
    public final ImageReceiver f15902b;
    public final xh.n f15903c;
    public final zp d;
    public final ImageView e;
    public final u6 f15904f;
    public boolean h;
    public final int[] f15905n;
    public boolean f15906r;

    public y1(Context context, u6 u6Var, boolean z10) {
        super(context);
        int i10;
        float f7;
        int i11;
        this.f15901a = new j9((u6) null);
        this.f15902b = new ImageReceiver(this);
        this.f15905n = new int[1];
        this.f15904f = u6Var;
        setWillNotDraw(false);
        if (z10) {
            i10 = 42;
        } else {
            i10 = 16;
        }
        xh.n nVar = new xh.n(context);
        this.f15903c = nVar;
        nVar.setLines(2);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        f7.V(nVar, y6.f23767z6, u6Var);
        nVar.setTextSize(1, 14.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f7 = i10;
        } else {
            f7 = 64.0f;
        }
        addView(nVar, gb1.h(-1, -2.0f, 7, f7, 7.0f, z11 ? 64.0f : i10, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            f7.t(imageView, y6.Uh, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(imageView, gb1.i(50, 50, i11 | 112));
        } else {
            this.e = null;
        }
        zp zpVar = new zp(getContext(), 21, u6Var);
        this.d = zpVar;
        zpVar.b(-1, y6.f23356d6, y6.f23485k7);
        zpVar.setDrawUnchecked(false);
        zpVar.setDrawBackgroundAsArc(3);
        addView(zpVar, gb1.m(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(b2 b2Var, String str, boolean z10) {
        boolean z11;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (b2Var != null) {
            z11 = b2Var.f15644g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) b2Var.f15641b);
        spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = y6.G6;
        u6 u6Var = this.f15904f;
        spannableStringBuilder.setSpan(new p10(i10, u6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            p10 p10Var = new p10(y6.f23560o6, u6Var);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(p10Var, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = b2Var.e;
        xh.n nVar = this.f15903c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = b2Var.e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = b2Var.e.messageText;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), nVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = b2Var.e.messageOwner;
            if (message != null) {
                MessageObject.replaceAnimatedEmoji(replaceEmoji, message.entities, nVar.getPaint().getFontMetricsInt());
            }
            spannableStringBuilder.append(replaceEmoji);
        }
        if (b2Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
            int i11 = x1.d;
            SpannableString spannableString = new SpannableString("+");
            x1 x1Var = new x1(b2Var.a() - 1);
            this.f15905n[0] = (int) (((q11) x1Var.f15896c).f31790c + AndroidUtilities.dp(10.0f));
            spannableString.setSpan(x1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, nVar.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        nVar.setText(spannableStringBuilder);
        int i12 = UserConfig.selectedAccount;
        TLRPC.MessageMedia media = MessageObject.getMedia(b2Var.e);
        long j11 = 0;
        ImageReceiver imageReceiver = this.f15902b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = b2Var.e;
            BitmapDrawable bitmapDrawable = messageObject2.strippedThumb;
            if (closestPhotoSizeWithSize != null) {
                j11 = closestPhotoSizeWithSize.size;
            }
            imageReceiver.setImage(forObject, "36_36", bitmapDrawable, j11, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (b2Var.e.isVideo() || b2Var.e.isSticker())) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(media.document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
            if (closestPhotoSizeWithSize2 == null) {
                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                j10 = media.document.size;
                imageLocation = forDocument;
                str2 = "g";
            } else {
                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                j10 = closestPhotoSizeWithSize2.size;
                str2 = "36_36";
                imageLocation = forObject2;
            }
            long j12 = j10;
            MessageObject messageObject3 = b2Var.e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j12, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && (webPage = media.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo);
            BitmapDrawable bitmapDrawable2 = b2Var.e.strippedThumb;
            if (closestPhotoSizeWithSize3 != null) {
                j11 = closestPhotoSizeWithSize3.size;
            }
            imageReceiver.setImage(forObject3, "36_36", bitmapDrawable2, j11, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            j9 j9Var = this.f15901a;
            j9Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), j9Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        }
        this.f15906r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float f7;
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(51.0f);
        } else {
            dp = AndroidUtilities.dp(15.0f);
        }
        float f10 = dp;
        ImageReceiver imageReceiver = this.f15902b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f15906r) {
            Paint V0 = y6.V0("paintDivider", this.f15904f);
            if (V0 == null) {
                V0 = y6.f23478k0;
            }
            Paint paint = V0;
            float f11 = 64.0f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 64.0f;
            }
            float dp2 = AndroidUtilities.dp(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp2, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f15906r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.e.animate();
        if (z10 && !this.h) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).start();
    }
}
