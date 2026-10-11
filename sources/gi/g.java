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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.y9;
import s4.q0;
public final class g extends q61 {
    public static final int f10909a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) r61Var.G;
        TLRPC.User user = fVar.f10907b;
        long j3 = fVar.f10906a;
        boolean z11 = fVar.f10908c;
        boolean z12 = !r61Var.f30359j;
        y9 y9Var = hVar.f10912c;
        TextView textView = hVar.f10915n;
        TextView textView2 = hVar.d;
        hVar.f10919x = (e) r61Var.H;
        hVar.f10920y = j3;
        hVar.E = user.f20179id;
        int i11 = hVar.f10911b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f10914f.setText(DialogObject.getName(j3));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), h6.x0(null, h6.il, false), new ai.f(12)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f10916r, 0, 1, 33);
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
        hVar.f10918w = z12;
        if (user2 != null) {
            y9Var.e(user2, new j9(0, user2));
        } else {
            y9Var.e(chat, new j9(chat));
        }
        hVar.f10913e.e(user, new j9(0, user));
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        h hVar = new h(context, i10, d6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        f fVar = (f) r61Var.G;
        f fVar2 = (f) r61Var2.G;
        if (fVar.f10906a == fVar2.f10906a && DialogObject.getDialogId(fVar.f10907b) == DialogObject.getDialogId(fVar2.f10907b)) {
            return true;
        }
        return false;
    }
}
