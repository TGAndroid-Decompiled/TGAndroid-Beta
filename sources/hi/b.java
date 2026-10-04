package hi;

import ai.d0;
import ai.g;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.d;
import ci.y0;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import s4.p0;
import w7.z5;
public final class b extends cb {
    public u61 X;
    public boolean Y;
    public final FrameLayout Z;
    public final boolean f11479a0;
    public final boolean f11480b0;
    public int f11481c0;

    public b(Context context, TLRPC.Chat chat, long j3, Utilities.Callback callback) {
        super(context, (d6) null, false);
        int i10;
        int i11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f11480b0 = UserObject.isBot(user);
        this.f11479a0 = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.f25301e.setTitle(y());
        setBackgroundColor(i6.v0(i6.f20761a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new p0(-1, -2));
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        if (chat2 != null) {
            i10 = -1;
            i6Var.t(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            i10 = -1;
            if (user != null) {
                i6Var.t(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
        }
        frameLayout.addView(i6Var, z5.c(-2.0f, i10));
        zl0 zl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.s1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new g(this, 12));
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
        dVar.setOnClickListener(new d0(this, callback, chat, 9));
        this.containerView.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.X.N(false);
    }

    public final void N(Utilities.Callback callback, boolean z10, boolean z11) {
        int i10;
        if (z11 && !z10 && !this.f11480b0) {
            Context context = getContext();
            d6 d6Var = this.resourcesProvider;
            String string = LocaleController.getString(R.string.CommunityAddToCommunityTitle);
            if (this.f11479a0) {
                i10 = R.string.CommunityAddToCommunityChannelMessage;
            } else {
                i10 = R.string.CommunityAddToCommunityGroupMessage;
            }
            e5.P(context, d6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Add), new y0(this, callback, z10, 3)).show();
            return;
        }
        callback.run(Boolean.valueOf(z10));
        dismiss();
    }

    public final void O(boolean z10) {
        boolean z11;
        if (this.Y != z10) {
            this.Y = z10;
            zl0 zl0Var = this.d;
            View V0 = zl0Var.V0(this.f11481c0 + 1);
            if (V0 instanceof j6) {
                ((j6) V0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View V02 = zl0Var.V0(this.f11481c0 + 2);
            if (V02 instanceof j6) {
                ((j6) V02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.X.N(true);
            }
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, false, new a(this, 0), this.resourcesProvider);
        this.X = u61Var;
        u61Var.f31306r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f11480b0) {
            i10 = R.string.CommunityAddBotTitle;
        } else {
            i10 = R.string.CommunityAddChatTitle;
        }
        return LocaleController.getString(i10);
    }
}
