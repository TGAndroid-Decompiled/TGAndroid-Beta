package ji;

import ai.p;
import ai.tc;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import ei.d;
import hg.o;
import hg.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;
public final class b extends bb {
    public final tc X;
    public s61 Y;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (d6) null, false);
        int i10;
        int i11;
        this.K = AndroidUtilities.dp(30.0f);
        im0 im0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        im0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new r0(this, 7));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        if (isChannelAndNotMegaGroup) {
            i10 = R.string.CommunityInviteOnlyChannelMessageOwner;
        } else {
            i10 = R.string.CommunityInviteOnlyGroupMessageOwner;
        }
        dVar2.setText(LocaleController.getString(i10));
        dVar2.e();
        dVar2.setOnClickListener(new p(22, this, runnable));
        tc tcVar = new tc(context, 3);
        TextView textView = (TextView) tcVar.d;
        TextView textView2 = (TextView) tcVar.f2231c;
        this.X = tcVar;
        tcVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((w9) tcVar.f2230b).e(chat, new h9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i13 = h6.G6;
        textView2.setTextColor(getThemedColor(i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new yq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        if (isChannelAndNotMegaGroup) {
            i11 = R.string.CommunityInviteOnlyChannelInfo;
        } else {
            i11 = R.string.CommunityInviteOnlyGroupInfo;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        textView.setTextColor(getThemedColor(i13));
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.Y.N(false);
    }

    @Override
    public final CharSequence A() {
        return null;
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new o(this, 12), this.resourcesProvider);
        this.Y = s61Var;
        s61Var.f30200r = false;
        return s61Var;
    }
}
