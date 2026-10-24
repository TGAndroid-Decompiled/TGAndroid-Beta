package ii;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u9;
import s4.o0;
public final class g extends k61 {
    public static final int f13208a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) l61Var.G;
        TLRPC.User user = fVar.f13206b;
        long j10 = fVar.f13205a;
        boolean z11 = fVar.f13207c;
        boolean z12 = !l61Var.f28225j;
        u9 u9Var = hVar.f13211c;
        TextView textView = hVar.f13213n;
        TextView textView2 = hVar.d;
        hVar.E = (e) l61Var.H;
        hVar.F = j10;
        hVar.G = user.f20491id;
        int i11 = hVar.f13210b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        hVar.f13212f.setText(DialogObject.getName(j10));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(i10, DialogObject.getShortName(user)), k6.il, null, new ah.j(18)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f13215s, 0, 1, 33);
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
        hVar.f13217x = z12;
        if (user2 != null) {
            u9Var.e(user2, new f9(0, user2));
        } else {
            u9Var.e(chat, new f9(chat));
        }
        hVar.e.e(user, new f9(0, user));
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        h hVar = new h(context, i10, g6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        f fVar = (f) l61Var.G;
        f fVar2 = (f) l61Var2.G;
        if (fVar.f13205a == fVar2.f13205a && DialogObject.getDialogId(fVar.f13206b) == DialogObject.getDialogId(fVar2.f13206b)) {
            return true;
        }
        return false;
    }
}
