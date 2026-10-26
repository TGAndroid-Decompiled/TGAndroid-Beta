package ji;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.y9;
import s4.q0;
public final class g extends s61 {
    public static final int f15983a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) t61Var.G;
        TLRPC.User user = fVar.f15981b;
        long j10 = fVar.f15980a;
        boolean z11 = fVar.f15982c;
        boolean z12 = !t61Var.f32873j;
        y9 y9Var = hVar.f15986c;
        TextView textView = hVar.f15988n;
        TextView textView2 = hVar.d;
        hVar.E = (e) t61Var.H;
        hVar.F = j10;
        hVar.G = user.f22176id;
        int i11 = hVar.f15985b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        hVar.f15987f.setText(DialogObject.getName(j10));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(i10, DialogObject.getShortName(user)), y6.il, null, new ag.c(20)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f15990s, 0, 1, 33);
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
        hVar.f15992x = z12;
        if (user2 != null) {
            y9Var.f(user2, new j9(0, user2));
        } else {
            y9Var.f(chat, new j9(chat));
        }
        hVar.e.f(user, new j9(0, user));
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        h hVar = new h(context, i10, u6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        f fVar = (f) t61Var.G;
        f fVar2 = (f) t61Var2.G;
        if (fVar.f15980a == fVar2.f15980a && DialogObject.getDialogId(fVar.f15981b) == DialogObject.getDialogId(fVar2.f15981b)) {
            return true;
        }
        return false;
    }
}
