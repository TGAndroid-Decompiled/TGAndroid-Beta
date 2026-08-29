package gg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;
public final class h extends d {
    public final ImageView f7309r;
    public g f7310s;
    public TLRPC.Chat v;
    public boolean f7311w;

    public h(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        float f9;
        float f10;
        float f11;
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f7309r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(g6.f0(g6.w0(null, g6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.f23223m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i11 = i10 | 17;
        if (z10) {
            f9 = 3.0f;
        } else {
            f9 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 3.0f;
        }
        addView(imageView, f6.d(48, 50.0f, i11, f9, 0.0f, f10, 0.0f));
        c cVar = this.d;
        if (LocaleController.isRTL) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        cVar.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z10, int i11) {
        String str;
        int i12;
        String string;
        String str2;
        this.f7311w = z10;
        this.v = chat;
        e9 e9Var = this.f7289b;
        e9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        t9 t9Var = this.f7290c;
        t9Var.setRoundRadius(dp);
        t9Var.e(chat, e9Var);
        String str3 = chat.title;
        c cVar = this.d;
        cVar.k(Emoji.replaceEmoji(str3, cVar.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z10) {
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
        this.f7291e.setTextColor(g6.v0(g6.f23310r5, this.f7288a));
        setDivider(true);
        ImageView imageView = this.f7309r;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new ag.n(8, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f7309r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setChatDeleteListener(g gVar) {
        this.f7310s = gVar;
    }
}
