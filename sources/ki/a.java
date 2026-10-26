package ki;

import ai.k;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.u7;
import bi.w0;
import fi.d;
import hi.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import s4.q0;
public final class a extends bb {
    public j71 X;
    public boolean Y;
    public final FrameLayout Z;
    public final boolean f16656a0;
    public final boolean f16657b0;
    public int f16658c0;

    public a(Context context, TLRPC.Chat chat, long j10, Utilities.Callback callback) {
        super(context, (u6) null, false);
        int i10;
        int i11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f16657b0 = UserObject.isBot(user);
        this.f16656a0 = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(y());
        setBackgroundColorKey(y6.f23299a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new q0(-1, -2));
        m6 m6Var = new m6(context, null);
        if (chat2 != null) {
            i10 = -1;
            m6Var.s(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            i10 = -1;
            if (user != null) {
                m6Var.s(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
        }
        frameLayout.addView(m6Var, gb1.g(-2.0f, i10));
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.u1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new k(this, 17));
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
        dVar.f();
        dVar.setOnClickListener(new w0(this, callback, chat, 12));
        this.containerView.addView(dVar, gb1.j(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.X.O(false);
    }

    public final void P(Utilities.Callback callback, boolean z10, boolean z11) {
        int i10;
        if (z11 && !z10 && !this.f16657b0) {
            Context context = getContext();
            u6 u6Var = this.resourcesProvider;
            String string = LocaleController.getString(R.string.CommunityAddToCommunityTitle);
            if (this.f16656a0) {
                i10 = R.string.CommunityAddToCommunityChannelMessage;
            } else {
                i10 = R.string.CommunityAddToCommunityGroupMessage;
            }
            g5.O(context, u6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Add), new u7(this, callback, z10, 6)).show();
            return;
        }
        callback.run(Boolean.valueOf(z10));
        dismiss();
    }

    public final void Q(boolean z10) {
        boolean z11;
        if (this.Y != z10) {
            this.Y = z10;
            mm0 mm0Var = this.d;
            View U0 = mm0Var.U0(this.f16658c0 + 1);
            if (U0 instanceof n6) {
                ((n6) U0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View U02 = mm0Var.U0(this.f16658c0 + 2);
            if (U02 instanceof n6) {
                ((n6) U02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.X.O(true);
            }
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, false, new e2(this, 14), this.resourcesProvider);
        this.X = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f16657b0) {
            i10 = R.string.CommunityAddBotTitle;
        } else {
            i10 = R.string.CommunityAddChatTitle;
        }
        return LocaleController.getString(i10);
    }
}
