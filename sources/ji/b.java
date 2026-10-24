package ji;

import ai.p;
import ai.vc;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.za;
import w7.z5;
public final class b extends za {
    public final vc X;
    public a71 Y;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (g6) null, false);
        int i10;
        int i11;
        this.K = AndroidUtilities.dp(30.0f);
        lm0 lm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new r0(this, 7));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        if (isChannelAndNotMegaGroup) {
            i10 = R.string.CommunityInviteOnlyChannelMessageOwner;
        } else {
            i10 = R.string.CommunityInviteOnlyGroupMessageOwner;
        }
        dVar2.setText(LocaleController.getString(i10));
        dVar2.f();
        dVar2.setOnClickListener(new p(22, this, runnable));
        vc vcVar = new vc(context, 3);
        TextView textView = (TextView) vcVar.d;
        TextView textView2 = (TextView) vcVar.f2336c;
        this.X = vcVar;
        vcVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((u9) vcVar.f2335b).e(chat, new f9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i13 = k6.G6;
        r6.W(textView2, i13, this.resourcesProvider);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new vq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        if (isChannelAndNotMegaGroup) {
            i11 = R.string.CommunityInviteOnlyChannelInfo;
        } else {
            i11 = R.string.CommunityInviteOnlyGroupInfo;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        r6.W(textView, i13, this.resourcesProvider);
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.Y.N(false);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new o(this, 12), this.resourcesProvider);
        this.Y = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return null;
    }
}
