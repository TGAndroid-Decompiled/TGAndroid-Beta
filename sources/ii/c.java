package ii;

import ah.h0;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class c extends bb {
    public final v0 X;
    public v51 Y;

    public c(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (f6) null, false);
        int i10;
        int i11;
        this.K = AndroidUtilities.dp(30.0f);
        ll0 ll0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new h0(this, 27));
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
        TextView textView2 = (TextView) v0Var.f3884c;
        this.X = v0Var;
        v0Var.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((x9) v0Var.f3883b).e(chat, new i9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i13 = j6.G6;
        textView2.setTextColor(getThemedColor(i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new nq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        if (isChannelAndNotMegaGroup) {
            i11 = R.string.CommunityInviteOnlyChannelInfo;
        } else {
            i11 = R.string.CommunityInviteOnlyGroupInfo;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        textView.setTextColor(getThemedColor(i13));
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.Y.N(false);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new a(this, 1), this.resourcesProvider);
        this.Y = v51Var;
        v51Var.f31135r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
