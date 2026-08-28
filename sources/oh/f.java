package oh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bg.d2;
import f2.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
public final class f extends k41 {
    public static final int f19589a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        int i9;
        g gVar = (g) view;
        e eVar = (e) l41Var.G;
        TLRPC.User user = eVar.f19587b;
        long j10 = eVar.f19586a;
        boolean z11 = eVar.f19588c;
        boolean z12 = !l41Var.f30337j;
        o9 o9Var = gVar.f19592c;
        TextView textView = gVar.f19595n;
        TextView textView2 = gVar.d;
        gVar.f19599x = (d) l41Var.H;
        gVar.f19600y = j10;
        gVar.A = user.f22527id;
        int i10 = gVar.f19591b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        gVar.f19594f.setText(DialogObject.getName(j10));
        TextView textView3 = gVar.h;
        if (user2 != null) {
            i9 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i9 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i9 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i9, DialogObject.getShortName(user)), f6.w0(null, f6.il, false), new d2(20)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(gVar.f19596r, 0, 1, 33);
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
        gVar.f19598w = z12;
        if (user2 != null) {
            o9Var.e(user2, new z8(0, user2));
        } else {
            o9Var.e(chat, new z8(chat));
        }
        gVar.f19593e.e(user, new z8(0, user));
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        g gVar = new g(context, i9, b6Var);
        gVar.setLayoutParams(new a1(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        e eVar = (e) l41Var.G;
        e eVar2 = (e) l41Var2.G;
        if (eVar.f19586a == eVar2.f19586a && DialogObject.getDialogId(eVar.f19587b) == DialogObject.getDialogId(eVar2.f19587b)) {
            return true;
        }
        return false;
    }
}
