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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import s4.p0;
public final class g extends g51 {
    public static final int f10012a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) h51Var.G;
        TLRPC.User user = fVar.f10010b;
        long j3 = fVar.f10009a;
        boolean z11 = fVar.f10011c;
        boolean z12 = !h51Var.f24505j;
        w9 w9Var = hVar.f10015c;
        TextView textView = hVar.f10017n;
        TextView textView2 = hVar.d;
        hVar.f10021x = (e) h51Var.H;
        hVar.f10022y = j3;
        hVar.E = user.f18230id;
        int i11 = hVar.f10014b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f10016f.setText(DialogObject.getName(j3));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), h6.w0(null, h6.il, false), new ai.f(12)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f10018r, 0, 1, 33);
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
        hVar.f10020w = z12;
        if (user2 != null) {
            w9Var.e(user2, new h9(0, user2));
        } else {
            w9Var.e(chat, new h9(chat));
        }
        hVar.e.e(user, new h9(0, user));
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        h hVar = new h(context, i10, d6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        f fVar = (f) h51Var.G;
        f fVar2 = (f) h51Var2.G;
        if (fVar.f10009a == fVar2.f10009a && DialogObject.getDialogId(fVar.f10010b) == DialogObject.getDialogId(fVar2.f10010b)) {
            return true;
        }
        return false;
    }
}
