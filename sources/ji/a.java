package ji;

import ai.v0;
import ai.wa;
import ai.y7;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ei.d;
import hg.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import s4.o0;
import w7.z5;
public final class a extends bb {
    public u61 X;
    public boolean Y;
    public final FrameLayout Z;
    public final boolean f14517a0;
    public final boolean f14518b0;
    public int f14519c0;

    public a(Context context, TLRPC.Chat chat, long j10, Utilities.Callback callback) {
        super(context, (d6) null, false);
        int i10;
        int i11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f14518b0 = UserObject.isBot(user);
        this.f14517a0 = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(A());
        setBackgroundColor(h6.w0(h6.f20936a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new o0(-1, -2));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        if (chat2 != null) {
            i10 = -1;
            h6Var.u(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            i10 = -1;
            if (user != null) {
                h6Var.u(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
        }
        frameLayout.addView(h6Var, z5.c(-2.0f, i10));
        jm0 jm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.p1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new wa(this, 16));
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
        dVar.setOnClickListener(new v0(this, callback, chat, 12));
        this.containerView.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.X.N(false);
    }

    @Override
    public final CharSequence A() {
        int i10;
        if (this.f14518b0) {
            i10 = R.string.CommunityAddBotTitle;
        } else {
            i10 = R.string.CommunityAddChatTitle;
        }
        return LocaleController.getString(i10);
    }

    public final void Q(Utilities.Callback callback, boolean z10, boolean z11) {
        int i10;
        if (z11 && !z10 && !this.f14518b0) {
            Context context = getContext();
            d6 d6Var = this.resourcesProvider;
            String string = LocaleController.getString(R.string.CommunityAddToCommunityTitle);
            if (this.f14517a0) {
                i10 = R.string.CommunityAddToCommunityChannelMessage;
            } else {
                i10 = R.string.CommunityAddToCommunityGroupMessage;
            }
            f5.O(context, d6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Add), new y7(this, callback, z10, 6)).show();
            return;
        }
        callback.run(Boolean.valueOf(z10));
        dismiss();
    }

    public final void R(boolean z10) {
        boolean z11;
        if (this.Y != z10) {
            this.Y = z10;
            jm0 jm0Var = this.d;
            View U0 = jm0Var.U0(this.f14519c0 + 1);
            if (U0 instanceof i6) {
                ((i6) U0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View U02 = jm0Var.U0(this.f14519c0 + 2);
            if (U02 instanceof i6) {
                ((i6) U02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.X.N(true);
            }
        }
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, false, new o(this, 11), this.resourcesProvider);
        this.X = u61Var;
        u61Var.f30865r = false;
        return u61Var;
    }
}
