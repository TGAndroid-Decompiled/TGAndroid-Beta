package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bi.f0;
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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import s4.p0;
public final class g extends u51 {
    public static final int f8310a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) v51Var.G;
        TLRPC.User user = fVar.f8308b;
        long j3 = fVar.f8307a;
        boolean z11 = fVar.f8309c;
        boolean z12 = !v51Var.f27827j;
        w9 w9Var = hVar.f8313c;
        TextView textView = hVar.f8315n;
        TextView textView2 = hVar.d;
        hVar.f8319x = (e) v51Var.H;
        hVar.f8320y = j3;
        hVar.E = user.f17342id;
        int i11 = hVar.f8312b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        hVar.f8314f.setText(DialogObject.getName(j3));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), j6.w0(null, j6.il, false), new f0(6)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f8316r, 0, 1, 33);
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
        hVar.f8318w = z12;
        if (user2 != null) {
            w9Var.e(user2, new g9(0, user2));
        } else {
            w9Var.e(chat, new g9(chat));
        }
        hVar.e.e(user, new g9(0, user));
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        h hVar = new h(context, i10, f6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        f fVar = (f) v51Var.G;
        f fVar2 = (f) v51Var2.G;
        if (fVar.f8307a == fVar2.f8307a && DialogObject.getDialogId(fVar.f8308b) == DialogObject.getDialogId(fVar2.f8308b)) {
            return true;
        }
        return false;
    }
}
