package oh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import hh.ua;
import java.util.ArrayList;
import lh.lc;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y4;

public final class q0 implements ph.d {

    public final Context f19547a;

    public final c6 f19548b;

    public final mc f19549c;
    public final int d;

    public final long f19550e;

    public final TLRPC.Chat f19551f;
    public p0 h;

    public ua f19553i;

    public String f19555k;

    public int f19556l;

    public boolean f19557m;

    public boolean f19558n;

    public long f19559o;

    public int f19560p;

    public b2 f19561q;

    public int f19562r;

    public final a0.h f19552g = new a0.h();

    public ArrayList f19554j = new ArrayList();

    public q0(Context context, c6 c6Var, mc mcVar, int i10, long j10) {
        this.f19547a = context;
        this.f19548b = c6Var;
        this.f19549c = mcVar;
        this.d = i10;
        this.f19550e = j10;
        this.f19551f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f19559o = MessagesController.getMainSettings(i10).getLong(a9.p.l(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.f19560p = 0;
        ArrayList arrayList = this.f19554j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) this.f19554j.get(i10);
            if (!this.f19552g.d(DialogObject.getPeerDialogId(communityPeerRequest.peer))) {
                if (communityPeerRequest.date <= this.f19559o) {
                    return;
                } else {
                    this.f19560p++;
                }
            }
        }
    }

    public final void b(k51 k51Var) {
        if (this.f19557m || this.f19558n || k51Var.T2.N0() + 10 <= k51Var.U2.f26945x.size()) {
            return;
        }
        d();
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.f19554j;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = this.f19554j;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                a0.h hVar = this.f19552g;
                if (hVar == null || !hVar.d(peerDialogId)) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i10 < size + (-1);
                    int i11 = ph.f.f46038a;
                    n41 n41VarJ = n41.J(ph.f.class);
                    n41VarJ.G = new ph.e(peerDialogId, user, z10);
                    n41VarJ.H = this;
                    n41VarJ.f30842j = !z11;
                    arrayList.add(n41VarJ);
                }
                i10++;
            }
        }
        if (this.f19558n) {
            return;
        }
        arrayList.add(n41.n(29));
    }

    public final void d() {
        if (this.f19557m || this.f19558n || !ChatObject.canUserDoAdminAction(this.f19551f, 27)) {
            return;
        }
        this.f19557m = true;
        MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f19550e, this.f19555k, new o0(this, 1));
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f19559o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f19550e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.f19561q == null && this.f19562r == 0) {
            if (z11) {
                b2 b2VarP = y4.P(this.f19547a, this.f19548b, LocaleController.getString(z10 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.f19556l, new Object[0])), LocaleController.getString(z10 ? R.string.Add : R.string.Decline), new fh.f(12, this, z10));
                b2VarP.show();
                if (z10 || (textView = (TextView) b2VarP.d(-1)) == null) {
                    return;
                }
                textView.setTextColor(g6.w0(null, g6.f23284q7, false));
                return;
            }
            ua uaVar = this.f19553i;
            if (uaVar != null) {
                uaVar.run();
            }
            this.f19553i = null;
            b2 b2Var = new b2(this.f19547a, 3, this.f19548b);
            this.f19561q = b2Var;
            b2Var.setOnCancelListener(new lc(this, 3));
            this.f19561q.q(500L);
            this.f19562r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f19550e, !z10, new o0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        this.f19552g.k(null, j10);
        this.f19556l--;
        a();
        p0 p0Var = this.h;
        if (p0Var != null) {
            p0Var.i();
        }
        int i11 = z10 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i12 = this.d;
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(i12, j10)));
        ua uaVar = this.f19553i;
        if (uaVar != null) {
            uaVar.run();
        }
        this.f19553i = new ua(this, j10, z10, 2);
        Context context = this.f19547a;
        c6 c6Var = this.f19548b;
        dc dcVar = new dc(context, c6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        b9 b9Var = dcVar.f27706a;
        if (userOrChat != null) {
            b9Var.setCount(1);
            b9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i10 = 1;
        } else {
            i10 = 0;
        }
        b9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        b9Var.setScaleX(1.333f);
        b9Var.setScaleY(1.333f);
        b9Var.a(false);
        p80 p80Var = dcVar.f27707b;
        p80Var.setSingleLine(false);
        p80Var.setMaxLines(2);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(spannableStringBuilderReplaceTags);
        if (p80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int iDp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).rightMargin = iDp;
            } else {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).leftMargin = iDp;
            }
        }
        if (LocaleController.isRTL) {
            b9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        cc ccVar = new cc(context, c6Var, true, true);
        ccVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ccVar.f27402a = new cg.b2(this, j10, 13);
        ccVar.f27403b = this.f19553i;
        dcVar.setButton(ccVar);
        this.f19549c.b(dcVar, 5000).j();
    }
}
