package ii;

import ah.g0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import bi.u1;
import bi.v0;
import di.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class c extends db {
    public final v0 X;
    public z61 Y;

    public c(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (c6) null, false);
        int i10;
        int i11;
        this.K = AndroidUtilities.dp(30.0f);
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new g0(this, 27));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        if (isChannelAndNotMegaGroup) {
            i10 = R.string.CommunityInviteOnlyChannelMessageOwner;
        } else {
            i10 = R.string.CommunityInviteOnlyGroupMessageOwner;
        }
        dVar2.setText(LocaleController.getString(i10));
        dVar2.e();
        dVar2.setOnClickListener(new u1(12, this, runnable));
        v0 v0Var = new v0(context, 2);
        TextView textView = (TextView) v0Var.d;
        TextView textView2 = (TextView) v0Var.f3848c;
        this.X = v0Var;
        v0Var.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((z9) v0Var.f3847b).e(chat, new k9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i13 = g6.G6;
        textView2.setTextColor(getThemedColor(i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new br(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        if (isChannelAndNotMegaGroup) {
            i11 = R.string.CommunityInviteOnlyChannelInfo;
        } else {
            i11 = R.string.CommunityInviteOnlyGroupInfo;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        textView.setTextColor(getThemedColor(i13));
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, a6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, a6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.Y.N(false);
    }

    @Override
    public final CharSequence A() {
        return null;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(this.d, getContext(), this.currentAccount, 0, true, new a(this, 1), this.resourcesProvider);
        this.Y = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
