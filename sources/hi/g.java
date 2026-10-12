package hi;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import s4.o0;
public final class g extends k61 {
    public static final int f10831a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) l61Var.G;
        TLRPC.User user = fVar.f10829b;
        long j10 = fVar.f10828a;
        boolean z11 = fVar.f10830c;
        boolean z12 = !l61Var.f26952j;
        z9 z9Var = hVar.f10834c;
        TextView textView = hVar.f10836n;
        TextView textView2 = hVar.d;
        hVar.f10840x = (e) l61Var.H;
        hVar.f10841y = j10;
        hVar.E = user.f19363id;
        int i11 = hVar.f10833b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        hVar.f10835f.setText(DialogObject.getName(j10));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), g6.x0(null, g6.il, false), new ah.j(13)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f10837r, 0, 1, 33);
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
        hVar.f10839w = z12;
        if (user2 != null) {
            z9Var.e(user2, new k9(0, user2));
        } else {
            z9Var.e(chat, new k9(chat));
        }
        hVar.e.e(user, new k9(0, user));
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        h hVar = new h(context, i10, c6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        f fVar = (f) l61Var.G;
        f fVar2 = (f) l61Var2.G;
        if (fVar.f10828a == fVar2.f10828a && DialogObject.getDialogId(fVar.f10829b) == DialogObject.getDialogId(fVar2.f10829b)) {
            return true;
        }
        return false;
    }
}
