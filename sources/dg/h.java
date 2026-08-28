package dg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import bg.u1;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public final class h extends d {
    public final ImageView f4525r;
    public g f4526s;
    public TLRPC.Chat v;
    public boolean f4527w;

    public h(Context context, b6 b6Var) {
        super(context, b6Var);
        int i9;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f4525r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(f6.f0(f6.w0(null, f6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.f23162m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        int i10 = i9 | 17;
        if (z10) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView, e6.d(48, 50.0f, i10, f10, 0.0f, f11, 0.0f));
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

    public final void f(TLRPC.Chat chat, int i9, boolean z10, int i10) {
        String str;
        int i11;
        String string;
        String str2;
        this.f4527w = z10;
        this.v = chat;
        z8 z8Var = this.f4499b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        o9 o9Var = this.f4500c;
        o9Var.setRoundRadius(dp);
        o9Var.e(chat, z8Var);
        String str3 = chat.title;
        c cVar = this.d;
        cVar.k(Emoji.replaceEmoji(str3, cVar.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z10) {
            if (i10 >= 1) {
                if (isChannelAndNotMegaGroup) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                string = LocaleController.formatPluralString(str2, i10, new Object[0]);
            } else {
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.DiscussChannel;
                } else {
                    i11 = R.string.AccDescrGroup;
                }
                string = LocaleController.getString(i11);
            }
            setSubtitle(string);
        } else {
            if (isChannelAndNotMegaGroup) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(LocaleController.formatPluralString(str, i9, new Object[0]));
        }
        this.f4501e.setTextColor(f6.v0(f6.f23247r5, this.f4498a));
        setDivider(true);
        ImageView imageView = this.f4525r;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new u1(4, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f4525r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setChatDeleteListener(g gVar) {
        this.f4526s = gVar;
    }
}
