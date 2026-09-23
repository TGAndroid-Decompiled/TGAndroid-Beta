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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
public final class t0 implements gi.e {
    public final Context f9162a;
    public final d6 f9163b;
    public final xc f9164c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f9165f;
    public s0 h;
    public o9 f9167i;
    public String f9169k;
    public int f9170l;
    public boolean f9171m;
    public boolean f9172n;
    public long f9173o;
    public int f9174p;
    public b2 f9175q;
    public int f9176r;
    public final a0.i f9166g = new a0.i();
    public ArrayList f9168j = new ArrayList();

    public t0(Context context, d6 d6Var, xc xcVar, int i10, long j3) {
        this.f9162a = context;
        this.f9163b = d6Var;
        this.f9164c = xcVar;
        this.d = i10;
        this.e = j3;
        this.f9165f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f9173o = MessagesController.getMainSettings(i10).getLong(a4.a.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f9174p = 0;
        ArrayList arrayList = this.f9168j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f9166g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f9168j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f9173o) {
                        return;
                    }
                    this.f9174p++;
                }
            }
        }
    }

    public final void b(d61 d61Var) {
        if (!this.f9171m && !this.f9172n && d61Var.X2.N0() + 10 > d61Var.Y2.f28665x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f9168j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f9168j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f9166g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10012a;
                        h51 J = h51.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f24505j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f9172n) {
                arrayList.add(h51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f9171m && !this.f9172n && ChatObject.canUserDoAdminAction(this.f9165f, 27)) {
            this.f9171m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f9169k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f9173o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f9175q == null && this.f9176r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f9170l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 P = e5.P(this.f9162a, this.f9163b, string, replaceTags, LocaleController.getString(i11), new bi.f(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(h6.w0(null, h6.f19026q7, false));
                    return;
                }
                return;
            }
            o9 o9Var = this.f9167i;
            if (o9Var != null) {
                o9Var.run();
            }
            this.f9167i = null;
            b2 b2Var = new b2(this.f9162a, 3, this.f9163b);
            this.f9175q = b2Var;
            b2Var.setOnCancelListener(new fd(this, 3));
            this.f9175q.q(500L);
            this.f9176r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f9166g.k(null, j3);
        this.f9170l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.e();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j3)));
        o9 o9Var = this.f9167i;
        if (o9Var != null) {
            o9Var.run();
        }
        this.f9167i = new o9(this, j3, z10, 1);
        Context context = this.f9162a;
        d6 d6Var = this.f9163b;
        pc pcVar = new pc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        k9 k9Var = pcVar.f26999a;
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
        d90 d90Var = pcVar.f27000b;
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
            k9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        oc ocVar = new oc(context, d6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f26716a = new ai.j(this, j3, 9);
        ocVar.f26717b = this.f9167i;
        pcVar.setButton(ocVar);
        this.f9164c.b(pcVar, 5000).j();
    }
}
