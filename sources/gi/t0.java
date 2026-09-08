package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import di.id;
import di.q9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.yc;
public final class t0 implements hi.e {
    public final Context f10797a;
    public final f6 f10798b;
    public final yc f10799c;
    public final int d;
    public final long f10800e;
    public final TLRPC.Chat f10801f;
    public s0 h;
    public q9 f10803i;
    public String f10805k;
    public int f10806l;
    public boolean f10807m;
    public boolean f10808n;
    public long f10809o;
    public int f10810p;
    public b2 f10811q;
    public int f10812r;
    public final a0.i f10802g = new a0.i();
    public ArrayList f10804j = new ArrayList();

    public t0(Context context, f6 f6Var, yc ycVar, int i10, long j3) {
        this.f10797a = context;
        this.f10798b = f6Var;
        this.f10799c = ycVar;
        this.d = i10;
        this.f10800e = j3;
        this.f10801f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f10809o = MessagesController.getMainSettings(i10).getLong(a4.a.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f10810p = 0;
        ArrayList arrayList = this.f10804j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f10802g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f10804j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f10809o) {
                        return;
                    }
                    this.f10810p++;
                }
            }
        }
    }

    public final void b(d61 d61Var) {
        if (!this.f10807m && !this.f10808n && d61Var.X2.N0() + 10 > d61Var.Y2.f31165x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f10804j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f10804j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f10802g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = hi.g.f11388a;
                        h51 J = h51.J(hi.g.class);
                        J.G = new hi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f26619j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f10808n) {
                arrayList.add(h51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f10807m && !this.f10808n && ChatObject.canUserDoAdminAction(this.f10801f, 27)) {
            this.f10807m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f10800e, this.f10805k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f10809o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f10800e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f10811q == null && this.f10812r == 0) {
            if (z11) {
                if (z10) {
                    i10 = R.string.CommunityAddAllChatsTitle;
                } else {
                    i10 = R.string.CommunityDeclineAllTitle;
                }
                String string = LocaleController.getString(i10);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f10806l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 P = e5.P(this.f10797a, this.f10798b, string, replaceTags, LocaleController.getString(i11), new ah.u(7, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(j6.w0(null, j6.f20925q7, false));
                    return;
                }
                return;
            }
            q9 q9Var = this.f10803i;
            if (q9Var != null) {
                q9Var.run();
            }
            this.f10803i = null;
            b2 b2Var = new b2(this.f10797a, 3, this.f10798b);
            this.f10811q = b2Var;
            b2Var.setOnCancelListener(new id(this, 3));
            this.f10811q.q(500L);
            this.f10812r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f10800e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f10802g.k(null, j3);
        this.f10806l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.l();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j3)));
        q9 q9Var = this.f10803i;
        if (q9Var != null) {
            q9Var.run();
        }
        this.f10803i = new q9(this, j3, z10, 1);
        Context context = this.f10797a;
        f6 f6Var = this.f10798b;
        pc pcVar = new pc(context, f6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        l9 l9Var = pcVar.f29374a;
        if (userOrChat != null) {
            l9Var.setCount(1);
            l9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        l9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        l9Var.setScaleX(1.333f);
        l9Var.setScaleY(1.333f);
        l9Var.a(false);
        d90 d90Var = pcVar.f29375b;
        d90Var.setSingleLine(false);
        d90Var.setMaxLines(2);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setText(replaceTags);
        if (d90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) d90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) d90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            l9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        oc ocVar = new oc(context, f6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f29056a = new bi.g(this, j3, 9);
        ocVar.f29057b = this.f10803i;
        pcVar.setButton(ocVar);
        this.f10799c.b(pcVar, 5000).j();
    }
}
