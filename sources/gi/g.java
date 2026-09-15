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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import s4.p0;
public final class g extends h51 {
    public static final int f10025a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) i51Var.G;
        TLRPC.User user = fVar.f10023b;
        long j3 = fVar.f10022a;
        boolean z11 = fVar.f10024c;
        boolean z12 = !i51Var.f24892j;
        u9 u9Var = hVar.f10028c;
        TextView textView = hVar.f10030n;
        TextView textView2 = hVar.d;
        hVar.f10034x = (e) i51Var.H;
        hVar.f10035y = j3;
        hVar.E = user.f18259id;
        int i11 = hVar.f10027b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f10029f.setText(DialogObject.getName(j3));
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
            spannableStringBuilder.setSpan(hVar.f10031r, 0, 1, 33);
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
        hVar.f10033w = z12;
        if (user2 != null) {
            u9Var.e(user2, new f9(0, user2));
        } else {
            u9Var.e(chat, new f9(chat));
        }
        hVar.e.e(user, new f9(0, user));
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        h hVar = new h(context, i10, e6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        f fVar = (f) i51Var.G;
        f fVar2 = (f) i51Var2.G;
        if (fVar.f10022a == fVar2.f10022a && DialogObject.getDialogId(fVar.f10023b) == DialogObject.getDialogId(fVar2.f10023b)) {
            return true;
        }
        return false;
    }
}
