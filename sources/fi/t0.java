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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zc;
public final class t0 implements gi.e {
    public final Context f10048a;
    public final c6 f10049b;
    public final zc f10050c;
    public final int d;
    public final long f10051e;
    public final TLRPC.Chat f10052f;
    public s0 h;
    public o9 f10054i;
    public String f10056k;
    public int f10057l;
    public boolean f10058m;
    public boolean f10059n;
    public long f10060o;
    public int f10061p;
    public a2 f10062q;
    public int f10063r;
    public final a0.i f10053g = new a0.i();
    public ArrayList f10055j = new ArrayList();

    public t0(Context context, c6 c6Var, zc zcVar, int i10, long j3) {
        this.f10048a = context;
        this.f10049b = c6Var;
        this.f10050c = zcVar;
        this.d = i10;
        this.f10051e = j3;
        this.f10052f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f10060o = MessagesController.getMainSettings(i10).getLong(a1.g.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f10061p = 0;
        ArrayList arrayList = this.f10055j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f10053g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f10055j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f10060o) {
                        return;
                    }
                    this.f10061p++;
                }
            }
        }
    }

    public final void b(p71 p71Var) {
        if (!this.f10058m && !this.f10059n && p71Var.V2.N0() + 10 > p71Var.W2.f26678x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f10055j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f10055j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f10053g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10908a;
                        u61 J = u61.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f31074j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f10059n) {
                arrayList.add(u61.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f10058m && !this.f10059n && ChatObject.canUserDoAdminAction(this.f10052f, 27)) {
            this.f10058m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f10051e, this.f10056k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f10060o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f10051e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f10062q == null && this.f10063r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f10057l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                a2 O = g5.O(this.f10048a, this.f10049b, string, replaceTags, LocaleController.getString(i11), new bi.f(7, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    textView.setTextColor(h6.x0(null, h6.f20799q7, false));
                    return;
                }
                return;
            }
            o9 o9Var = this.f10054i;
            if (o9Var != null) {
                o9Var.run();
            }
            this.f10054i = null;
            a2 a2Var = new a2(this.f10048a, 3, this.f10049b);
            this.f10062q = a2Var;
            a2Var.setOnCancelListener(new fd(this, 3));
            this.f10062q.q(500L);
            this.f10063r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f10051e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f10053g.k(null, j3);
        this.f10057l--;
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
        o9 o9Var = this.f10054i;
        if (o9Var != null) {
            o9Var.run();
        }
        this.f10054i = new o9(this, j3, z10, 1);
        Context context = this.f10048a;
        c6 c6Var = this.f10049b;
        rc rcVar = new rc(context, c6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        m9 m9Var = rcVar.f30138a;
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
        ia0 ia0Var = rcVar.f30139b;
        ia0Var.setSingleLine(false);
        ia0Var.setMaxLines(2);
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setText(replaceTags);
        if (ia0Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) ia0Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) ia0Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            m9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        qc qcVar = new qc(context, c6Var, true, true);
        qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        qcVar.f29816a = new ai.j(this, j3, 9);
        qcVar.f29817b = this.f10054i;
        rcVar.setButton(qcVar);
        this.f10050c.b(rcVar, 5000).j();
    }
}
