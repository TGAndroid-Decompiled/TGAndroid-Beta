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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sc;
public final class t0 implements gi.e {
    public final Context f10050a;
    public final e6 f10051b;
    public final ad f10052c;
    public final int d;
    public final long f10053e;
    public final TLRPC.Chat f10054f;
    public s0 h;
    public o9 f10056i;
    public String f10058k;
    public int f10059l;
    public boolean f10060m;
    public boolean f10061n;
    public long f10062o;
    public int f10063p;
    public b2 f10064q;
    public int f10065r;
    public final a0.i f10055g = new a0.i();
    public ArrayList f10057j = new ArrayList();

    public t0(Context context, e6 e6Var, ad adVar, int i10, long j3) {
        this.f10050a = context;
        this.f10051b = e6Var;
        this.f10052c = adVar;
        this.d = i10;
        this.f10053e = j3;
        this.f10054f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f10062o = MessagesController.getMainSettings(i10).getLong(a1.g.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f10063p = 0;
        ArrayList arrayList = this.f10057j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f10055g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f10057j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f10062o) {
                        return;
                    }
                    this.f10063p++;
                }
            }
        }
    }

    public final void b(l71 l71Var) {
        if (!this.f10060m && !this.f10061n && l71Var.V2.N0() + 10 > l71Var.W2.f25590x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f10057j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f10057j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f10055g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10910a;
                        q61 J = q61.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f30061j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f10061n) {
                arrayList.add(q61.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f10060m && !this.f10061n && ChatObject.canUserDoAdminAction(this.f10054f, 27)) {
            this.f10060m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f10053e, this.f10058k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f10062o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f10053e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f10064q == null && this.f10065r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f10059l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 O = g5.O(this.f10050a, this.f10051b, string, replaceTags, LocaleController.getString(i11), new bi.f(7, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    textView.setTextColor(i6.x0(null, i6.f21041q7, false));
                    return;
                }
                return;
            }
            o9 o9Var = this.f10056i;
            if (o9Var != null) {
                o9Var.run();
            }
            this.f10056i = null;
            b2 b2Var = new b2(this.f10050a, 3, this.f10051b);
            this.f10064q = b2Var;
            b2Var.setOnCancelListener(new fd(this, 3));
            this.f10064q.q(500L);
            this.f10065r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f10053e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f10055g.k(null, j3);
        this.f10059l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.n();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j3)));
        o9 o9Var = this.f10056i;
        if (o9Var != null) {
            o9Var.run();
        }
        this.f10056i = new o9(this, j3, z10, 1);
        Context context = this.f10050a;
        e6 e6Var = this.f10051b;
        sc scVar = new sc(context, e6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        m9 m9Var = scVar.f30755a;
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
        fa0 fa0Var = scVar.f30756b;
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
        rc rcVar = new rc(context, e6Var, true, true);
        rcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        rcVar.f30443a = new ai.j(this, j3, 9);
        rcVar.f30444b = this.f10056i;
        scVar.setButton(rcVar);
        this.f10052c.b(scVar, 5000).j();
    }
}
