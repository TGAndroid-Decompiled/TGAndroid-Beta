package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.d;
import bi.x;
import di.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import s4.o0;
import w7.a6;
public final class b extends db {
    public z61 X;
    public boolean Y;
    public final FrameLayout Z;
    public final boolean f11762a0;
    public final boolean f11763b0;
    public int f11764c0;

    public b(Context context, TLRPC.Chat chat, long j10, Utilities.Callback callback) {
        super(context, (c6) null, false);
        int i10;
        int i11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f11763b0 = UserObject.isBot(user);
        this.f11762a0 = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(A());
        setBackgroundColor(g6.w0(g6.f19843a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new o0(-1, -2));
        i6 i6Var = new i6(context, null);
        if (chat2 != null) {
            i10 = -1;
            i6Var.u(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            i10 = -1;
            if (user != null) {
                i6Var.u(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
        }
        frameLayout.addView(i6Var, a6.d(-2.0f, i10));
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.p1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new d(this, 12));
        di.d dVar = new di.d(context, this.resourcesProvider, true);
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
        dVar.setOnClickListener(new x(this, callback, chat, 9));
        this.containerView.addView(dVar, a6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.X.N(false);
    }

    @Override
    public final CharSequence A() {
        int i10;
        if (this.f11763b0) {
            i10 = R.string.CommunityAddBotTitle;
        } else {
            i10 = R.string.CommunityAddChatTitle;
        }
        return LocaleController.getString(i10);
    }

    public final void Q(Utilities.Callback callback, boolean z10, boolean z11) {
        int i10;
        if (z11 && !z10 && !this.f11763b0) {
            Context context = getContext();
            c6 c6Var = this.resourcesProvider;
            String string = LocaleController.getString(R.string.CommunityAddToCommunityTitle);
            if (this.f11762a0) {
                i10 = R.string.CommunityAddToCommunityChannelMessage;
            } else {
                i10 = R.string.CommunityAddToCommunityGroupMessage;
            }
            g5.O(context, c6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Add), new x0(this, callback, z10, 3)).show();
            return;
        }
        callback.run(Boolean.valueOf(z10));
        dismiss();
    }

    public final void R(boolean z10) {
        boolean z11;
        if (this.Y != z10) {
            this.Y = z10;
            mm0 mm0Var = this.d;
            View U0 = mm0Var.U0(this.f11764c0 + 1);
            if (U0 instanceof j6) {
                ((j6) U0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View U02 = mm0Var.U0(this.f11764c0 + 2);
            if (U02 instanceof j6) {
                ((j6) U02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.X.N(true);
            }
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(this.d, getContext(), this.currentAccount, 0, false, new a(this, 0), this.resourcesProvider);
        this.X = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
