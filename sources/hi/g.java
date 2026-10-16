package hi;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z9;
import s4.o0;
public final class g extends l61 {
    public static final int f10835a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        int i10;
        h hVar = (h) view;
        f fVar = (f) m61Var.G;
        TLRPC.User user = fVar.f10833b;
        long j10 = fVar.f10832a;
        boolean z11 = fVar.f10834c;
        boolean z12 = !m61Var.f26944j;
        z9 z9Var = hVar.f10838c;
        TextView textView = hVar.f10840n;
        TextView textView2 = hVar.d;
        hVar.f10844x = (e) m61Var.H;
        hVar.f10845y = j10;
        hVar.E = user.f19063id;
        int i11 = hVar.f10837b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        hVar.f10839f.setText(DialogObject.getName(j10));
        TextView textView3 = hVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), g6.x0(null, g6.il, false), new ah.j(13)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f10841r, 0, 1, 33);
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
        hVar.f10843w = z12;
        if (user2 != null) {
            z9Var.e(user2, new k9(0, user2));
        } else {
            z9Var.e(chat, new k9(chat));
        }
        hVar.e.e(user, new k9(0, user));
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        h hVar = new h(context, i10, c6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        f fVar = (f) m61Var.G;
        f fVar2 = (f) m61Var2.G;
        if (fVar.f10832a == fVar2.f10832a && DialogObject.getDialogId(fVar.f10833b) == DialogObject.getDialogId(fVar2.f10833b)) {
            return true;
        }
        return false;
    }
}
