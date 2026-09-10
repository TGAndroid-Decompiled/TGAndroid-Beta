package gg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tp;
import w7.a6;
public final class g2 extends FrameLayout {
    public final g9 f8893a;
    public final ImageReceiver f8894b;
    public final uh.o f8895c;
    public final tp d;
    public final ImageView e;
    public final f6 f8896f;
    public boolean h;
    public final int[] f8897n;
    public boolean f8898r;

    public g2(Context context, f6 f6Var, boolean z10) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        this.f8893a = new g9((f6) null);
        this.f8894b = new ImageReceiver(this);
        this.f8897n = new int[1];
        this.f8896f = f6Var;
        setWillNotDraw(false);
        if (z10) {
            i10 = 42;
        } else {
            i10 = 16;
        }
        uh.o oVar = new uh.o(context);
        this.f8895c = oVar;
        oVar.setLines(2);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        oVar.setTextColor(j6.v0(j6.f18325z6, f6Var));
        oVar.setTextSize(1, 14.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f7 = i10;
        } else {
            f7 = 64.0f;
        }
        if (z11) {
            f10 = 64.0f;
        } else {
            f10 = i10;
        }
        addView(oVar, a6.d(-1, -2.0f, 7, f7, 7.0f, f10, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Uh, false), PorterDuff.Mode.MULTIPLY));
            imageView.setAlpha(0.0f);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(imageView, a6.e(50, 50, i11 | 112));
        } else {
            this.e = null;
        }
        tp tpVar = new tp(getContext(), 21, f6Var);
        this.d = tpVar;
        tpVar.b(-1, j6.f17928d6, j6.f18056k7);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(3);
        addView(tpVar, a6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(j2 j2Var, String str, boolean z10) {
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
        if (j2Var != null) {
            z11 = j2Var.f8921g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) j2Var.f8918b);
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = j6.G6;
        f6 f6Var = this.f8896f;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(j6.v0(i10, f6Var)), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(j6.v0(j6.f18126o6, f6Var));
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = j2Var.e;
        uh.o oVar = this.f8895c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = j2Var.e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = j2Var.e.messageText;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), oVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = j2Var.e.messageOwner;
            if (message != null) {
                MessageObject.replaceAnimatedEmoji(replaceEmoji, message.entities, oVar.getPaint().getFontMetricsInt());
            }
            spannableStringBuilder.append(replaceEmoji);
        }
        if (j2Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
            int i11 = f2.d;
            SpannableString spannableString = new SpannableString("+");
            f2 f2Var = new f2(j2Var.a() - 1);
            this.f8897n[0] = (int) (((t01) f2Var.f8889c).f27247c + AndroidUtilities.dp(10.0f));
            spannableString.setSpan(f2Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, oVar.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        oVar.setText(spannableStringBuilder);
        int i12 = UserConfig.selectedAccount;
        TLRPC.MessageMedia media = MessageObject.getMedia(j2Var.e);
        long j10 = 0;
        ImageReceiver imageReceiver = this.f8894b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = j2Var.e;
            BitmapDrawable bitmapDrawable = messageObject2.strippedThumb;
            if (closestPhotoSizeWithSize != null) {
                j10 = closestPhotoSizeWithSize.size;
            }
            imageReceiver.setImage(forObject, "36_36", bitmapDrawable, j10, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (j2Var.e.isVideo() || j2Var.e.isSticker())) {
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
            MessageObject messageObject3 = j2Var.e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j11, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && (webPage = media.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo);
            BitmapDrawable bitmapDrawable2 = j2Var.e.strippedThumb;
            if (closestPhotoSizeWithSize3 != null) {
                j10 = closestPhotoSizeWithSize3.size;
            }
            imageReceiver.setImage(forObject3, "36_36", bitmapDrawable2, j10, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            g9 g9Var = this.f8893a;
            g9Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), g9Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        }
        this.f8898r = z10;
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
        ImageReceiver imageReceiver = this.f8894b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f8898r) {
            Paint T0 = j6.T0("paintDivider", this.f8896f);
            if (T0 == null) {
                T0 = j6.f18049k0;
            }
            Paint paint = T0;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f8898r ? 1 : 0), 1073741824));
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
