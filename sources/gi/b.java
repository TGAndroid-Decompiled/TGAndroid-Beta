package gi;

import ai.g;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.c1;
import bi.d;
import bi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import s4.p0;
import w7.a6;
public final class b extends ab {
    public j61 X;
    public boolean Y;
    public final FrameLayout Z;
    public final boolean f9157a0;
    public final boolean f9158b0;
    public int f9159c0;

    public b(Context context, TLRPC.Chat chat, long j3, Utilities.Callback callback) {
        super(context, (f6) null, false);
        int i10;
        int i11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f9158b0 = UserObject.isBot(user);
        this.f9157a0 = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(y());
        setBackgroundColor(j6.v0(j6.f17872a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new p0(-1, -2));
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        if (chat2 != null) {
            i10 = -1;
            j6Var.t(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            i10 = -1;
            if (user != null) {
                j6Var.t(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
        }
        frameLayout.addView(j6Var, a6.c(-2.0f, i10));
        vl0 vl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.o1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new g(this, 11));
        d dVar = new d(context, this.resourcesProvider, true);
        if (chat != null) {
            if (ChatObject.canAddChatToCommunity(chat)) {
                i11 = R.string.CommunityAddToCommunityButton;
            } else {
                i11 = R.string.CommunityAddToCommunityRequestButton;
            }
            dVar.setText(LocaleController.getString(i11));
        } else {
            dVar.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        dVar.e();
        dVar.setOnClickListener(new q(this, callback, chat, 5));
        this.containerView.addView(dVar, a6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.X.N(false);
    }

    public final void P(Utilities.Callback callback, boolean z10, boolean z11) {
        int i10;
        if (z11 && !z10 && !this.f9158b0) {
            Context context = getContext();
            f6 f6Var = this.resourcesProvider;
            String string = LocaleController.getString(R.string.CommunityAddToCommunityTitle);
            if (this.f9157a0) {
                i10 = R.string.CommunityAddToCommunityChannelMessage;
            } else {
                i10 = R.string.CommunityAddToCommunityGroupMessage;
            }
            d5.P(context, f6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Add), new c1(this, callback, z10, 3)).show();
            return;
        }
        callback.run(Boolean.valueOf(z10));
        dismiss();
    }

    public final void Q(boolean z10) {
        boolean z11;
        if (this.Y != z10) {
            this.Y = z10;
            vl0 vl0Var = this.d;
            View T0 = vl0Var.T0(this.f9159c0 + 1);
            if (T0 instanceof k6) {
                ((k6) T0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View T02 = vl0Var.T0(this.f9159c0 + 2);
            if (T02 instanceof k6) {
                ((k6) T02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.X.N(true);
            }
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, false, new a(this, 0), this.resourcesProvider);
        this.X = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f9158b0) {
            i10 = R.string.CommunityAddBotTitle;
        } else {
            i10 = R.string.CommunityAddChatTitle;
        }
        return LocaleController.getString(i10);
    }
}
