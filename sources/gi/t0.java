package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import di.dd;
import di.n9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.zc;
public final class t0 implements hi.e {
    public final Context f10258a;
    public final c6 f10259b;
    public final zc f10260c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f10261f;
    public s0 h;
    public n9 f10263i;
    public String f10265k;
    public int f10266l;
    public boolean f10267m;
    public boolean f10268n;
    public long f10269o;
    public int f10270p;
    public a2 f10271q;
    public int f10272r;
    public final a0.h f10262g = new a0.h();
    public ArrayList f10264j = new ArrayList();

    public t0(Context context, c6 c6Var, zc zcVar, int i10, long j10) {
        this.f10258a = context;
        this.f10259b = c6Var;
        this.f10260c = zcVar;
        this.d = i10;
        this.e = j10;
        this.f10261f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f10269o = MessagesController.getMainSettings(i10).getLong(a1.g.o(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f10270p = 0;
        ArrayList arrayList = this.f10264j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f10262g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f10264j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f10269o) {
                        return;
                    }
                    this.f10270p++;
                }
            }
        }
    }

    public final void b(i71 i71Var) {
        if (!this.f10267m && !this.f10268n && i71Var.V2.N0() + 10 > i71Var.W2.f23148x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f10264j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f10264j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f10262g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = hi.g.f10835a;
                        m61 J = m61.J(hi.g.class);
                        J.G = new hi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f26944j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f10268n) {
                arrayList.add(m61.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f10267m && !this.f10268n && ChatObject.canUserDoAdminAction(this.f10261f, 27)) {
            this.f10267m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f10265k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f10269o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f10271q == null && this.f10272r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f10266l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                a2 O = g5.O(this.f10258a, this.f10259b, string, replaceTags, LocaleController.getString(i11), new ah.t(8, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    textView.setTextColor(g6.x0(null, g6.f19839q7, false));
                    return;
                }
                return;
            }
            n9 n9Var = this.f10263i;
            if (n9Var != null) {
                n9Var.run();
            }
            this.f10263i = null;
            a2 a2Var = new a2(this.f10258a, 3, this.f10259b);
            this.f10271q = a2Var;
            a2Var.setOnCancelListener(new dd(this, 3));
            this.f10271q.q(500L);
            this.f10272r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f10262g.k(null, j10);
        this.f10266l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.p();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j10)));
        n9 n9Var = this.f10263i;
        if (n9Var != null) {
            n9Var.run();
        }
        this.f10263i = new n9(this, j10, z10, 1);
        Context context = this.f10258a;
        c6 c6Var = this.f10259b;
        rc rcVar = new rc(context, c6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        org.telegram.ui.Components.n9 n9Var2 = rcVar.f28493a;
        if (userOrChat != null) {
            n9Var2.setCount(1);
            n9Var2.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        n9Var2.setTranslationX(AndroidUtilities.dp(7.0f));
        n9Var2.setScaleX(1.333f);
        n9Var2.setScaleY(1.333f);
        n9Var2.a(false);
        da0 da0Var = rcVar.f28494b;
        da0Var.setSingleLine(false);
        da0Var.setMaxLines(2);
        da0Var.setTextSize(1, 14.0f);
        da0Var.setText(replaceTags);
        if (da0Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) da0Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) da0Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            n9Var2.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        qc qcVar = new qc(context, c6Var, true, true);
        qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        qcVar.f28266a = new bi.g(this, j10, 9);
        qcVar.f28267b = this.f10263i;
        rcVar.setButton(qcVar);
        this.f10260c.b(rcVar, 5000).j();
    }
}
