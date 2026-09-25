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
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xc;
public final class t0 implements gi.e {
    public final Context f9161a;
    public final d6 f9162b;
    public final xc f9163c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f9164f;
    public s0 h;
    public o9 f9166i;
    public String f9168k;
    public int f9169l;
    public boolean f9170m;
    public boolean f9171n;
    public long f9172o;
    public int f9173p;
    public a2 f9174q;
    public int f9175r;
    public final a0.i f9165g = new a0.i();
    public ArrayList f9167j = new ArrayList();

    public t0(Context context, d6 d6Var, xc xcVar, int i10, long j3) {
        this.f9161a = context;
        this.f9162b = d6Var;
        this.f9163c = xcVar;
        this.d = i10;
        this.e = j3;
        this.f9164f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f9172o = MessagesController.getMainSettings(i10).getLong(a4.a.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f9173p = 0;
        ArrayList arrayList = this.f9167j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f9165g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f9167j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f9172o) {
                        return;
                    }
                    this.f9173p++;
                }
            }
        }
    }

    public final void b(r61 r61Var) {
        if (!this.f9170m && !this.f9171n && r61Var.X2.N0() + 10 > r61Var.Y2.f25294x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f9167j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f9167j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f9165g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10011a;
                        v51 J = v51.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f29047j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f9171n) {
                arrayList.add(v51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f9170m && !this.f9171n && ChatObject.canUserDoAdminAction(this.f9164f, 27)) {
            this.f9170m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f9168k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f9172o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f9174q == null && this.f9175r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f9169l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                a2 P = e5.P(this.f9161a, this.f9162b, string, replaceTags, LocaleController.getString(i11), new bi.f(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(h6.w0(null, h6.f19299q7, false));
                    return;
                }
                return;
            }
            o9 o9Var = this.f9166i;
            if (o9Var != null) {
                o9Var.run();
            }
            this.f9166i = null;
            a2 a2Var = new a2(this.f9161a, 3, this.f9162b);
            this.f9174q = a2Var;
            a2Var.setOnCancelListener(new fd(this, 3));
            this.f9174q.q(500L);
            this.f9175r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f9165g.k(null, j3);
        this.f9169l--;
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
        o9 o9Var = this.f9166i;
        if (o9Var != null) {
            o9Var.run();
        }
        this.f9166i = new o9(this, j3, z10, 1);
        Context context = this.f9161a;
        d6 d6Var = this.f9162b;
        pc pcVar = new pc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        k9 k9Var = pcVar.f27314a;
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
        n90 n90Var = pcVar.f27315b;
        n90Var.setSingleLine(false);
        n90Var.setMaxLines(2);
        n90Var.setTextSize(1, 14.0f);
        n90Var.setText(replaceTags);
        if (n90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) n90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) n90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            k9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        oc ocVar = new oc(context, d6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f27022a = new ai.j(this, j3, 9);
        ocVar.f27023b = this.f9166i;
        pcVar.setButton(ocVar);
        this.f9163c.b(pcVar, 5000).j();
    }
}
