package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y9;
import s4.q0;
public final class g extends t61 {
    public static final int f15982a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) u61Var.G;
        TLRPC.User user = fVar.f15980b;
        long j10 = fVar.f15979a;
        boolean z11 = fVar.f15981c;
        boolean z12 = !u61Var.f33247j;
        y9 y9Var = hVar.f15985c;
        TextView textView = hVar.f15987n;
        TextView textView2 = hVar.d;
        hVar.E = (e) u61Var.H;
        hVar.F = j10;
        hVar.G = user.f22177id;
        int i11 = hVar.f15984b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        hVar.f15986f.setText(DialogObject.getName(j10));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(i10, DialogObject.getShortName(user)), y6.il, null, new ag.c(20)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f15989s, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.f15991x = z12;
        if (user2 != null) {
            y9Var.f(user2, new j9(0, user2));
        } else {
            y9Var.f(chat, new j9(chat));
        }
        hVar.e.f(user, new j9(0, user));
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        h hVar = new h(context, i10, u6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        f fVar = (f) u61Var.G;
        f fVar2 = (f) u61Var2.G;
        if (fVar.f15979a == fVar2.f15979a && DialogObject.getDialogId(fVar.f15980b) == DialogObject.getDialogId(fVar2.f15980b)) {
            return true;
        }
        return false;
    }
}
