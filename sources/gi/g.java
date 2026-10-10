package gi;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.y9;
import s4.q0;
public final class g extends p61 {
    public static final int f10910a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) q61Var.G;
        TLRPC.User user = fVar.f10908b;
        long j3 = fVar.f10907a;
        boolean z11 = fVar.f10909c;
        boolean z12 = !q61Var.f30061j;
        y9 y9Var = hVar.f10913c;
        TextView textView = hVar.f10916n;
        TextView textView2 = hVar.d;
        hVar.f10920x = (e) q61Var.H;
        hVar.f10921y = j3;
        hVar.E = user.f20189id;
        int i11 = hVar.f10912b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f10915f.setText(DialogObject.getName(j3));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), i6.x0(null, i6.il, false), new ai.f(12)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f10917r, 0, 1, 33);
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
        hVar.f10919w = z12;
        if (user2 != null) {
            y9Var.e(user2, new j9(0, user2));
        } else {
            y9Var.e(chat, new j9(chat));
        }
        hVar.f10914e.e(user, new j9(0, user));
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        h hVar = new h(context, i10, e6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        f fVar = (f) q61Var.G;
        f fVar2 = (f) q61Var2.G;
        if (fVar.f10907a == fVar2.f10907a && DialogObject.getDialogId(fVar.f10908b) == DialogObject.getDialogId(fVar2.f10908b)) {
            return true;
        }
        return false;
    }
}
