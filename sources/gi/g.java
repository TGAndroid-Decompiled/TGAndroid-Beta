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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import s4.p0;
public final class g extends f61 {
    public static final int f10904a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) g61Var.G;
        TLRPC.User user = fVar.f10902b;
        long j3 = fVar.f10901a;
        boolean z11 = fVar.f10903c;
        boolean z12 = !g61Var.f26666j;
        w9 w9Var = hVar.f10907c;
        TextView textView = hVar.f10910n;
        TextView textView2 = hVar.d;
        hVar.f10914x = (e) g61Var.H;
        hVar.f10915y = j3;
        hVar.E = user.f20184id;
        int i11 = hVar.f10906b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f10909f.setText(DialogObject.getName(j3));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), i6.w0(null, i6.il, false), new ai.f(12)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f10911r, 0, 1, 33);
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
        hVar.f10913w = z12;
        if (user2 != null) {
            w9Var.e(user2, new h9(0, user2));
        } else {
            w9Var.e(chat, new h9(chat));
        }
        hVar.f10908e.e(user, new h9(0, user));
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        h hVar = new h(context, i10, d6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        f fVar = (f) g61Var.G;
        f fVar2 = (f) g61Var2.G;
        if (fVar.f10901a == fVar2.f10901a && DialogObject.getDialogId(fVar.f10902b) == DialogObject.getDialogId(fVar2.f10902b)) {
            return true;
        }
        return false;
    }
}
