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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.x51;
import s4.p0;
public final class g extends i51 {
    public static final int f10030a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) j51Var.G;
        TLRPC.User user = fVar.f10028b;
        long j3 = fVar.f10027a;
        boolean z11 = fVar.f10029c;
        boolean z12 = !j51Var.f25125j;
        u9 u9Var = hVar.f10033c;
        TextView textView = hVar.f10035n;
        TextView textView2 = hVar.d;
        hVar.f10039x = (e) j51Var.H;
        hVar.f10040y = j3;
        hVar.E = user.f18268id;
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
            u9Var.e(user2, new f9(0, user2));
        } else {
            u9Var.e(chat, new f9(chat));
        }
        hVar.e.e(user, new f9(0, user));
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        h hVar = new h(context, i10, f6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        f fVar = (f) j51Var.G;
        f fVar2 = (f) j51Var2.G;
        if (fVar.f10027a == fVar2.f10027a && DialogObject.getDialogId(fVar.f10028b) == DialogObject.getDialogId(fVar2.f10028b)) {
            return true;
        }
        return false;
    }
}
