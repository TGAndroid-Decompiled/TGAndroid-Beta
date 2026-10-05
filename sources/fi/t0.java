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
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
public final class t0 implements gi.e {
    public final Context f9975a;
    public final d6 f9976b;
    public final yc f9977c;
    public final int d;
    public final long f9978e;
    public final TLRPC.Chat f9979f;
    public s0 h;
    public n9 f9981i;
    public String f9983k;
    public int f9984l;
    public boolean f9985m;
    public boolean f9986n;
    public long f9987o;
    public int f9988p;
    public b2 f9989q;
    public int f9990r;
    public final a0.i f9980g = new a0.i();
    public ArrayList f9982j = new ArrayList();

    public t0(Context context, d6 d6Var, yc ycVar, int i10, long j3) {
        this.f9975a = context;
        this.f9976b = d6Var;
        this.f9977c = ycVar;
        this.d = i10;
        this.f9978e = j3;
        this.f9979f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f9987o = MessagesController.getMainSettings(i10).getLong(a4.a.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f9988p = 0;
        ArrayList arrayList = this.f9982j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f9980g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f9982j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f9987o) {
                        return;
                    }
                    this.f9988p++;
                }
            }
        }
    }

    public final void b(e71 e71Var) {
        if (!this.f9985m && !this.f9986n && e71Var.f26033e3.N0() + 10 > e71Var.f26034f3.f32534x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f9982j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f9982j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f9980g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10905a;
                        h61 K = h61.K(gi.g.class);
                        K.G = new gi.f(peerDialogId, user, z11);
                        K.H = this;
                        K.f27091j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f9986n) {
                arrayList.add(h61.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f9985m && !this.f9986n && ChatObject.canUserDoAdminAction(this.f9979f, 27)) {
            this.f9985m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f9978e, this.f9983k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f9987o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f9978e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f9989q == null && this.f9990r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f9984l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 P = e5.P(this.f9975a, this.f9976b, string, replaceTags, LocaleController.getString(i11), new bi.f(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(i6.w0(null, i6.f21068q7, false));
                    return;
                }
                return;
            }
            n9 n9Var = this.f9981i;
            if (n9Var != null) {
                n9Var.run();
            }
            this.f9981i = null;
            b2 b2Var = new b2(this.f9975a, 3, this.f9976b);
            this.f9989q = b2Var;
            b2Var.setOnCancelListener(new ed(this, 3));
            this.f9989q.q(500L);
            this.f9990r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f9978e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f9980g.k(null, j3);
        this.f9984l--;
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
        n9 n9Var = this.f9981i;
        if (n9Var != null) {
            n9Var.run();
        }
        this.f9981i = new n9(this, j3, z10, 1);
        Context context = this.f9975a;
        d6 d6Var = this.f9976b;
        qc qcVar = new qc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        k9 k9Var = qcVar.f30019a;
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
        q90 q90Var = qcVar.f30020b;
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
        pcVar.f29693a = new ai.j(this, j3, 9);
        pcVar.f29694b = this.f9981i;
        qcVar.setButton(pcVar);
        this.f9977c.b(qcVar, 5000).j();
    }
}
