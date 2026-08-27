package nh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.gf;
import org.telegram.ui.rn;

public final class m extends FrameLayout {

    public static final int f18804n = 0;

    public final c6 f18805a;

    public final n9 f18806b;

    public final ImageView f18807c;
    public final TextView d;

    public final TextView f18808e;

    public final TextView f18809f;
    public final p80 h;

    public m(Activity activity, c6 c6Var) {
        super(activity);
        this.f18805a = c6Var;
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 0);
        linearLayoutF.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        b6.b(linearLayoutF, 0.025f, 1.4f);
        addView(linearLayoutF, z5.e(-1, -1, 119));
        int i10 = g6.Oh;
        setBackground(g6.Y(g6.l1(0.1f, g6.v0(i10, c6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayoutF.addView(linearLayout, z5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, z5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, z5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f18809f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(g6.v0(i10, c6Var));
        b6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(g6.b0(AndroidUtilities.dp(9.0f), g6.l1(0.1f, g6.v0(i10, c6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, z5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f18808e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.v0(i11, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        p80 p80Var = new p80(activity, null);
        this.h = p80Var;
        p80Var.setTextSize(1, 13.0f);
        p80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
        p80Var.setTextColor(g6.v0(i11, c6Var));
        linearLayout.addView(p80Var, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(p80Var);
        n9 n9Var = new n9(activity);
        this.f18806b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        n9Var.setVisibility(8);
        linearLayoutF.addView(n9Var, z5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f18807c = imageView;
        imageView.setBackground(g6.f0(5, g6.l1(0.2f, g6.v0(g6.W5, c6Var)), -1));
        b6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23061de, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ag.l2(9));
        imageView.setVisibility(8);
        linearLayoutF.addView(imageView, z5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final rn rnVar, final MessageObject messageObject, gf gfVar, gf gfVar2) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        c6 c6Var;
        float fMeasureText;
        float f10;
        float fDp;
        TextView textView;
        if (messageObject == null) {
            return;
        }
        String str = messageObject.sponsoredTitle;
        TextView textView2 = this.d;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false);
        CharSequence charSequence = messageObject.messageText;
        p80 p80Var = this.h;
        CharSequence charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequence, p80Var.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.f18807c;
        n9 n9Var = this.f18806b;
        if (messageMedia == null) {
            TLRPC.Photo photo = messageObject.sponsoredPhoto;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                n9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
                n9Var.setVisibility(0);
                imageView.setVisibility(8);
            } else {
                n9Var.setVisibility(8);
                imageView.setVisibility(0);
                z10 = false;
            }
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
            i10 = g6.Oh;
            c6Var = this.f18805a;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " \u2009");
            spannableStringBuilder.append(charSequenceReplaceEmoji);
            fMeasureText = textView2.getPaint().measureText(spannableStringBuilder.toString());
            float fDp2 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
            TextView textView3 = this.f18809f;
            float fMeasureText2 = (fDp2 - textView3.getPaint().measureText(textView3.getText().toString())) - AndroidUtilities.dp(32.0f);
            if (z10) {
                f10 = 58.0f;
            } else {
                f10 = 0.0f;
            }
            fDp = fMeasureText2 - AndroidUtilities.dp(f10);
            textView = this.f18808e;
            if (fMeasureText > fDp) {
                spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
                textView.setVisibility(0);
                textView.setText(charSequenceReplaceEmoji);
            } else {
                textView.setVisibility(8);
            }
            textView2.setText(spannableStringBuilder);
            p80Var.setText(charSequenceReplaceEmoji2);
            p80Var.setOnLinkPressListener(new o80() {
                @Override
                public final void a(ClickableSpan clickableSpan) {
                    m mVar = this.f18790a;
                    mVar.getClass();
                    rn rnVar2 = rnVar;
                    if (rnVar2 != null) {
                        rnVar2.J9(messageObject, false, false);
                    }
                    if (clickableSpan instanceof URLSpan) {
                        String url = ((URLSpan) clickableSpan).getURL();
                        if (url != null) {
                            url = url.trim();
                        }
                        if (rnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                            rnVar2.da(url, true);
                            return;
                        }
                    }
                    clickableSpan.onClick(mVar.h);
                }
            });
            textView3.setOnClickListener(new c5(gfVar, 3));
            setOnClickListener(new gh.a4(this, rnVar, messageObject, str2, 2));
            imageView.setOnClickListener(new c5(gfVar2, 4));
        }
        n9Var.setVisibility(0);
        imageView.setVisibility(8);
        TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
        TLRPC.Document document = messageMedia2.document;
        if (document != null) {
            n9Var.k(ImageLocation.getForDocument(messageObject.sponsoredMedia.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), messageObject.sponsoredMedia.document), "48_48", 0L, null, null, 0);
        } else {
            TLRPC.Photo photo2 = messageMedia2.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
                n9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize2, false), messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
            }
        }
        z10 = true;
        spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        i10 = g6.Oh;
        c6Var = this.f18805a;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " \u2009");
        spannableStringBuilder.append(charSequenceReplaceEmoji);
        fMeasureText = textView2.getPaint().measureText(spannableStringBuilder.toString());
        float fDp3 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
        TextView textView4 = this.f18809f;
        float fMeasureText3 = (fDp3 - textView4.getPaint().measureText(textView4.getText().toString())) - AndroidUtilities.dp(32.0f);
        if (z10) {
            f10 = 58.0f;
        } else {
            f10 = 0.0f;
        }
        fDp = fMeasureText3 - AndroidUtilities.dp(f10);
        textView = this.f18808e;
        if (fMeasureText > fDp) {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
            textView.setVisibility(0);
            textView.setText(charSequenceReplaceEmoji);
        } else {
            textView.setVisibility(8);
        }
        textView2.setText(spannableStringBuilder);
        p80Var.setText(charSequenceReplaceEmoji2);
        p80Var.setOnLinkPressListener(new o80() {
            @Override
            public final void a(ClickableSpan clickableSpan) {
                m mVar = this.f18790a;
                mVar.getClass();
                rn rnVar2 = rnVar;
                if (rnVar2 != null) {
                    rnVar2.J9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (rnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        rnVar2.da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(mVar.h);
            }
        });
        textView4.setOnClickListener(new c5(gfVar, 3));
        setOnClickListener(new gh.a4(this, rnVar, messageObject, str2, 2));
        imageView.setOnClickListener(new c5(gfVar2, 4));
    }
}
