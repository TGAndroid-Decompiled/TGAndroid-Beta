package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.r61;
import w7.w5;
public final class y1 extends FrameLayout {
    public final j9 f11450a;
    public final ImageReceiver f11451b;
    public final vh.n f11452c;
    public final fq d;
    public final ImageView f11453e;
    public final c6 f11454f;
    public boolean h;
    public final int[] f11455n;
    public boolean f11456r;

    public y1(Context context, c6 c6Var, boolean z10) {
        super(context);
        int i10;
        float f7;
        int i11;
        this.f11450a = new j9((c6) null);
        this.f11451b = new ImageReceiver(this);
        this.f11455n = new int[1];
        this.f11454f = c6Var;
        setWillNotDraw(false);
        if (z10) {
            i10 = 42;
        } else {
            i10 = 16;
        }
        vh.n nVar = new vh.n(context);
        this.f11452c = nVar;
        nVar.setLines(2);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        nVar.setTextColor(h6.w0(h6.f20964z6, c6Var));
        nVar.setTextSize(1, 14.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f7 = i10;
        } else {
            f7 = 64.0f;
        }
        addView(nVar, w5.a(-2.0f, f7, 7.0f, z11 ? 64.0f : i10, 0.0f, -1, 7));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f11453e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.Uh, false), PorterDuff.Mode.MULTIPLY));
            imageView.setAlpha(0.0f);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(imageView, w5.e(50, 50, i11 | 112));
        } else {
            this.f11453e = null;
        }
        fq fqVar = new fq(getContext(), 21, c6Var);
        this.d = fqVar;
        fqVar.b(-1, h6.f20560d6, h6.f20689k7);
        fqVar.setDrawUnchecked(false);
        fqVar.setDrawBackgroundAsArc(3);
        addView(fqVar, w5.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(b2 b2Var, String str, boolean z10) {
        boolean z11;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j3;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (b2Var != null) {
            z11 = b2Var.f11177g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) b2Var.f11173b);
        spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = h6.G6;
        c6 c6Var = this.f11454f;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(h6.w0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(h6.w0(h6.f20763o6, c6Var));
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = b2Var.f11175e;
        vh.n nVar = this.f11452c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = b2Var.f11175e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = b2Var.f11175e.messageText;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), nVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = b2Var.f11175e.messageOwner;
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
            this.f11455n[0] = (int) (((r11) x1Var.f11444c).f29989c + AndroidUtilities.dp(10.0f));
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
        TLRPC.MessageMedia media = MessageObject.getMedia(b2Var.f11175e);
        long j10 = 0;
        ImageReceiver imageReceiver = this.f11451b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = b2Var.f11175e;
            BitmapDrawable bitmapDrawable = messageObject2.strippedThumb;
            if (closestPhotoSizeWithSize != null) {
                j10 = closestPhotoSizeWithSize.size;
            }
            imageReceiver.setImage(forObject, "36_36", bitmapDrawable, j10, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (b2Var.f11175e.isVideo() || b2Var.f11175e.isSticker())) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(media.document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
            if (closestPhotoSizeWithSize2 == null) {
                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                j3 = media.document.size;
                imageLocation = forDocument;
                str2 = "g";
            } else {
                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                j3 = closestPhotoSizeWithSize2.size;
                str2 = "36_36";
                imageLocation = forObject2;
            }
            long j11 = j3;
            MessageObject messageObject3 = b2Var.f11175e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j11, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && (webPage = media.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo);
            BitmapDrawable bitmapDrawable2 = b2Var.f11175e.strippedThumb;
            if (closestPhotoSizeWithSize3 != null) {
                j10 = closestPhotoSizeWithSize3.size;
            }
            imageReceiver.setImage(forObject3, "36_36", bitmapDrawable2, j10, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            j9 j9Var = this.f11450a;
            j9Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), j9Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        }
        this.f11456r = z10;
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
        ImageReceiver imageReceiver = this.f11451b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f11456r) {
            Paint U0 = h6.U0("paintDivider", this.f11454f);
            if (U0 == null) {
                U0 = h6.f20682k0;
            }
            Paint paint = U0;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f11456r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.f11453e.animate();
        if (z10 && !this.h) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).start();
    }
}
