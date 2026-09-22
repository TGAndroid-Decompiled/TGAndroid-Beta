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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import s4.p0;
public final class g extends x51 {
    public static final int f10030a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) y51Var.G;
        TLRPC.User user = fVar.f10028b;
        long j3 = fVar.f10027a;
        boolean z11 = fVar.f10029c;
        boolean z12 = !y51Var.f30516j;
        v9 v9Var = hVar.f10033c;
        TextView textView = hVar.f10035n;
        TextView textView2 = hVar.d;
        hVar.f10039x = (e) y51Var.H;
        hVar.f10040y = j3;
        hVar.E = user.f18490id;
        int i11 = hVar.f10032b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f10034f.setText(DialogObject.getName(j3));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), j6.w0(null, j6.il, false), new ai.f(12)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f10036r, 0, 1, 33);
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
        hVar.f10038w = z12;
        if (user2 != null) {
            v9Var.e(user2, new g9(0, user2));
        } else {
            v9Var.e(chat, new g9(chat));
        }
        hVar.e.e(user, new g9(0, user));
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        h hVar = new h(context, i10, f6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        f fVar = (f) y51Var.G;
        f fVar2 = (f) y51Var2.G;
        if (fVar.f10027a == fVar2.f10027a && DialogObject.getDialogId(fVar.f10028b) == DialogObject.getDialogId(fVar2.f10028b)) {
            return true;
        }
        return false;
    }
}
