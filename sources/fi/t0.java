package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.fd;
import ci.o9;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yc;
public final class t0 implements gi.e {
    public final Context f9173a;
    public final d6 f9174b;
    public final yc f9175c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f9176f;
    public s0 h;
    public o9 f9178i;
    public String f9180k;
    public int f9181l;
    public boolean f9182m;
    public boolean f9183n;
    public long f9184o;
    public int f9185p;
    public a2 f9186q;
    public int f9187r;
    public final a0.i f9177g = new a0.i();
    public ArrayList f9179j = new ArrayList();

    public t0(Context context, d6 d6Var, yc ycVar, int i10, long j3) {
        this.f9173a = context;
        this.f9174b = d6Var;
        this.f9175c = ycVar;
        this.d = i10;
        this.e = j3;
        this.f9176f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f9184o = MessagesController.getMainSettings(i10).getLong(a4.a.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f9185p = 0;
        ArrayList arrayList = this.f9179j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f9177g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f9179j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f9184o) {
                        return;
                    }
                    this.f9185p++;
                }
            }
        }
    }

    public final void b(u61 u61Var) {
        if (!this.f9182m && !this.f9183n && u61Var.f28777e3.N0() + 10 > u61Var.f28778f3.f26226x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f9179j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f9179j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f9177g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10025a;
                        y51 J = y51.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f30635j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f9183n) {
                arrayList.add(y51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f9182m && !this.f9183n && ChatObject.canUserDoAdminAction(this.f9176f, 27)) {
            this.f9182m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f9180k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f9184o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f9186q == null && this.f9187r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f9181l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                a2 P = e5.P(this.f9173a, this.f9174b, string, replaceTags, LocaleController.getString(i11), new bi.f(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(h6.w0(null, h6.f19315q7, false));
                    return;
                }
                return;
            }
            o9 o9Var = this.f9178i;
            if (o9Var != null) {
                o9Var.run();
            }
            this.f9178i = null;
            a2 a2Var = new a2(this.f9173a, 3, this.f9174b);
            this.f9186q = a2Var;
            a2Var.setOnCancelListener(new fd(this, 3));
            this.f9186q.q(500L);
            this.f9187r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f9177g.k(null, j3);
        this.f9181l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.f();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j3)));
        o9 o9Var = this.f9178i;
        if (o9Var != null) {
            o9Var.run();
        }
        this.f9178i = new o9(this, j3, z10, 1);
        Context context = this.f9173a;
        d6 d6Var = this.f9174b;
        qc qcVar = new qc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        k9 k9Var = qcVar.f27638a;
        if (userOrChat != null) {
            k9Var.setCount(1);
            k9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        k9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        k9Var.setScaleX(1.333f);
        k9Var.setScaleY(1.333f);
        k9Var.a(false);
        q90 q90Var = qcVar.f27639b;
        q90Var.setSingleLine(false);
        q90Var.setMaxLines(2);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setText(replaceTags);
        if (q90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) q90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) q90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            k9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        pc pcVar = new pc(context, d6Var, true, true);
        pcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        pcVar.f27306a = new ai.j(this, j3, 9);
        pcVar.f27307b = this.f9178i;
        qcVar.setButton(pcVar);
        this.f9175c.b(qcVar, 5000).j();
    }
}
