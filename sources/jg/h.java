package jg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class h extends d {
    public final ImageView f10039r;
    public g f10040s;
    public TLRPC.Chat v;
    public boolean f10041w;

    public h(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f10039r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(k6.f0(k6.w0(null, k6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.f21823m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i11 = i10 | 17;
        if (z4) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView, c6.d(48, 50.0f, i11, f10, 0.0f, f11, 0.0f));
        c cVar = this.d;
        if (LocaleController.isRTL) {
            f12 = 24.0f;
        } else {
            f12 = 0.0f;
        }
        cVar.setPadding(AndroidUtilities.dp(f12), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z4, int i11) {
        String str;
        int i12;
        String string;
        String str2;
        this.f10041w = z4;
        this.v = chat;
        z8 z8Var = this.f10019b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        p9 p9Var = this.f10020c;
        p9Var.setRoundRadius(dp);
        p9Var.e(chat, z8Var);
        String str3 = chat.title;
        c cVar = this.d;
        cVar.k(Emoji.replaceEmoji(str3, cVar.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z4) {
            if (i11 >= 1) {
                if (isChannelAndNotMegaGroup) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                string = LocaleController.formatPluralString(str2, i11, new Object[0]);
            } else {
                if (isChannelAndNotMegaGroup) {
                    i12 = R.string.DiscussChannel;
                } else {
                    i12 = R.string.AccDescrGroup;
                }
                string = LocaleController.getString(i12);
            }
            setSubtitle(string);
        } else {
            if (isChannelAndNotMegaGroup) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(LocaleController.formatPluralString(str, i10, new Object[0]));
        }
        this.f10021e.setTextColor(k6.v0(k6.f21913r5, this.f10018a));
        setDivider(true);
        ImageView imageView = this.f10039r;
        if (z4) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new dg.n(8, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f10039r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setChatDeleteListener(g gVar) {
        this.f10040s = gVar;
    }
}
