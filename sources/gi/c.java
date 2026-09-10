package gi;

import ai.u;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import bi.d;
import bi.n3;
import ci.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import w7.a6;
public final class c extends ab {
    public final h X;
    public j61 Y;

    public c(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (f6) null, false);
        int i10;
        int i11;
        this.K = AndroidUtilities.dp(30.0f);
        vl0 vl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new u(this, 21));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        if (isChannelAndNotMegaGroup) {
            i10 = R.string.CommunityInviteOnlyChannelMessageOwner;
        } else {
            i10 = R.string.CommunityInviteOnlyGroupMessageOwner;
        }
        dVar2.setText(LocaleController.getString(i10));
        dVar2.e();
        dVar2.setOnClickListener(new n3(8, this, runnable));
        h hVar = new h(context, 1);
        TextView textView = (TextView) hVar.f4708c;
        TextView textView2 = (TextView) hVar.f4707b;
        this.X = hVar;
        hVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((w9) hVar.d).e(chat, new g9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i13 = j6.G6;
        textView2.setTextColor(getThemedColor(i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new uq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
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
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new a(this, 1), this.resourcesProvider);
        this.Y = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
