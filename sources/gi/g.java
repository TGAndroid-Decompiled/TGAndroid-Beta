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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.y9;
import s4.q0;
public final class g extends t61 {
    public static final int f10908a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) u61Var.G;
        TLRPC.User user = fVar.f10906b;
        long j3 = fVar.f10905a;
        boolean z11 = fVar.f10907c;
        boolean z12 = !u61Var.f31069j;
        y9 y9Var = hVar.f10911c;
        TextView textView = hVar.f10914n;
        TextView textView2 = hVar.d;
        hVar.f10918x = (e) u61Var.H;
        hVar.f10919y = j3;
        hVar.E = user.f19950id;
        int i11 = hVar.f10910b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f10913f.setText(DialogObject.getName(j3));
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
            spannableStringBuilder.setSpan(hVar.f10915r, 0, 1, 33);
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
        hVar.f10917w = z12;
        if (user2 != null) {
            y9Var.e(user2, new j9(0, user2));
        } else {
            y9Var.e(chat, new j9(chat));
        }
        hVar.f10912e.e(user, new j9(0, user));
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        h hVar = new h(context, i10, c6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        f fVar = (f) u61Var.G;
        f fVar2 = (f) u61Var2.G;
        if (fVar.f10905a == fVar2.f10905a && DialogObject.getDialogId(fVar.f10906b) == DialogObject.getDialogId(fVar2.f10906b)) {
            return true;
        }
        return false;
    }
}
