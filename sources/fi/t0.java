package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.ed;
import ci.n9;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
public final class t0 implements gi.e {
    public final Context f9974a;
    public final d6 f9975b;
    public final yc f9976c;
    public final int d;
    public final long f9977e;
    public final TLRPC.Chat f9978f;
    public s0 h;
    public n9 f9980i;
    public String f9982k;
    public int f9983l;
    public boolean f9984m;
    public boolean f9985n;
    public long f9986o;
    public int f9987p;
    public b2 f9988q;
    public int f9989r;
    public final a0.i f9979g = new a0.i();
    public ArrayList f9981j = new ArrayList();

    public t0(Context context, d6 d6Var, yc ycVar, int i10, long j3) {
        this.f9974a = context;
        this.f9975b = d6Var;
        this.f9976c = ycVar;
        this.d = i10;
        this.f9977e = j3;
        this.f9978f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f9986o = MessagesController.getMainSettings(i10).getLong(a4.a.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f9987p = 0;
        ArrayList arrayList = this.f9981j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f9979g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f9981j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f9986o) {
                        return;
                    }
                    this.f9987p++;
                }
            }
        }
    }

    public final void b(c71 c71Var) {
        if (!this.f9984m && !this.f9985n && c71Var.f25243e3.N0() + 10 > c71Var.f25244f3.f31309x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f9981j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f9981j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f9979g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10904a;
                        g61 J = g61.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f26666j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f9985n) {
                arrayList.add(g61.o(29));
            }
        }
    }

    public final void d() {
        if (!this.f9984m && !this.f9985n && ChatObject.canUserDoAdminAction(this.f9978f, 27)) {
            this.f9984m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f9977e, this.f9982k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f9986o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f9977e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f9988q == null && this.f9989r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f9983l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 P = e5.P(this.f9974a, this.f9975b, string, replaceTags, LocaleController.getString(i11), new bi.f(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(i6.w0(null, i6.f21058q7, false));
                    return;
                }
                return;
            }
            n9 n9Var = this.f9980i;
            if (n9Var != null) {
                n9Var.run();
            }
            this.f9980i = null;
            b2 b2Var = new b2(this.f9974a, 3, this.f9975b);
            this.f9988q = b2Var;
            b2Var.setOnCancelListener(new ed(this, 3));
            this.f9988q.q(500L);
            this.f9989r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f9977e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f9979g.k(null, j3);
        this.f9983l--;
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
        n9 n9Var = this.f9980i;
        if (n9Var != null) {
            n9Var.run();
        }
        this.f9980i = new n9(this, j3, z10, 1);
        Context context = this.f9974a;
        d6 d6Var = this.f9975b;
        qc qcVar = new qc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        k9 k9Var = qcVar.f29991a;
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
        q90 q90Var = qcVar.f29992b;
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
        pcVar.f29594a = new ai.j(this, j3, 9);
        pcVar.f29595b = this.f9980i;
        qcVar.setButton(pcVar);
        this.f9976c.b(qcVar, 5000).j();
    }
}
