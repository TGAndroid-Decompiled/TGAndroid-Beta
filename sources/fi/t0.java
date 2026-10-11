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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rc;
public final class t0 implements gi.e {
    public final Context f10049a;
    public final d6 f10050b;
    public final ad f10051c;
    public final int d;
    public final long f10052e;
    public final TLRPC.Chat f10053f;
    public s0 h;
    public o9 f10055i;
    public String f10057k;
    public int f10058l;
    public boolean f10059m;
    public boolean f10060n;
    public long f10061o;
    public int f10062p;
    public a2 f10063q;
    public int f10064r;
    public final a0.i f10054g = new a0.i();
    public ArrayList f10056j = new ArrayList();

    public t0(Context context, d6 d6Var, ad adVar, int i10, long j3) {
        this.f10049a = context;
        this.f10050b = d6Var;
        this.f10051c = adVar;
        this.d = i10;
        this.f10052e = j3;
        this.f10053f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f10061o = MessagesController.getMainSettings(i10).getLong(a1.g.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f10062p = 0;
        ArrayList arrayList = this.f10056j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f10054g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f10056j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f10061o) {
                        return;
                    }
                    this.f10062p++;
                }
            }
        }
    }

    public final void b(m71 m71Var) {
        if (!this.f10059m && !this.f10060n && m71Var.V2.N0() + 10 > m71Var.W2.f25893x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f10056j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f10056j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f10054g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10909a;
                        r61 J = r61.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f30359j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f10060n) {
                arrayList.add(r61.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f10059m && !this.f10060n && ChatObject.canUserDoAdminAction(this.f10053f, 27)) {
            this.f10059m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f10052e, this.f10057k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f10061o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f10052e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f10063q == null && this.f10064r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f10058l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                a2 O = g5.O(this.f10049a, this.f10050b, string, replaceTags, LocaleController.getString(i11), new bi.f(7, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    textView.setTextColor(h6.x0(null, h6.f21026q7, false));
                    return;
                }
                return;
            }
            o9 o9Var = this.f10055i;
            if (o9Var != null) {
                o9Var.run();
            }
            this.f10055i = null;
            a2 a2Var = new a2(this.f10049a, 3, this.f10050b);
            this.f10063q = a2Var;
            a2Var.setOnCancelListener(new fd(this, 3));
            this.f10063q.q(500L);
            this.f10064r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f10052e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f10054g.k(null, j3);
        this.f10058l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.i();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j3)));
        o9 o9Var = this.f10055i;
        if (o9Var != null) {
            o9Var.run();
        }
        this.f10055i = new o9(this, j3, z10, 1);
        Context context = this.f10049a;
        d6 d6Var = this.f10050b;
        rc rcVar = new rc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        m9 m9Var = rcVar.f30436a;
        if (userOrChat != null) {
            m9Var.setCount(1);
            m9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        m9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        m9Var.setScaleX(1.333f);
        m9Var.setScaleY(1.333f);
        m9Var.a(false);
        fa0 fa0Var = rcVar.f30437b;
        fa0Var.setSingleLine(false);
        fa0Var.setMaxLines(2);
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setText(replaceTags);
        if (fa0Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) fa0Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) fa0Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            m9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        qc qcVar = new qc(context, d6Var, true, true);
        qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        qcVar.f30123a = new ai.j(this, j3, 9);
        qcVar.f30124b = this.f10055i;
        rcVar.setButton(qcVar);
        this.f10051c.b(rcVar, 5000).j();
    }
}
