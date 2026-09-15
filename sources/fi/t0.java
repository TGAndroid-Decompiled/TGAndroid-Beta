package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.id;
import ci.r9;
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
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.vc;
public final class t0 implements gi.e {
    public final Context f9174a;
    public final e6 f9175b;
    public final vc f9176c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f9177f;
    public s0 h;
    public r9 f9179i;
    public String f9181k;
    public int f9182l;
    public boolean f9183m;
    public boolean f9184n;
    public long f9185o;
    public int f9186p;
    public b2 f9187q;
    public int f9188r;
    public final a0.i f9178g = new a0.i();
    public ArrayList f9180j = new ArrayList();

    public t0(Context context, e6 e6Var, vc vcVar, int i10, long j3) {
        this.f9174a = context;
        this.f9175b = e6Var;
        this.f9176c = vcVar;
        this.d = i10;
        this.e = j3;
        this.f9177f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f9185o = MessagesController.getMainSettings(i10).getLong(a4.a.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f9186p = 0;
        ArrayList arrayList = this.f9180j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f9178g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f9180j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f9185o) {
                        return;
                    }
                    this.f9186p++;
                }
            }
        }
    }

    public final void b(e61 e61Var) {
        if (!this.f9183m && !this.f9184n && e61Var.X2.N0() + 10 > e61Var.Y2.f29616x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f9180j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f9180j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f9178g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10025a;
                        i51 J = i51.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f24892j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f9184n) {
                arrayList.add(i51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f9183m && !this.f9184n && ChatObject.canUserDoAdminAction(this.f9177f, 27)) {
            this.f9183m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f9181k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f9185o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f9187q == null && this.f9188r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f9182l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 P = c5.P(this.f9174a, this.f9175b, string, replaceTags, LocaleController.getString(i11), new bi.f(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(i6.w0(null, i6.f19074q7, false));
                    return;
                }
                return;
            }
            r9 r9Var = this.f9179i;
            if (r9Var != null) {
                r9Var.run();
            }
            this.f9179i = null;
            b2 b2Var = new b2(this.f9174a, 3, this.f9175b);
            this.f9187q = b2Var;
            b2Var.setOnCancelListener(new id(this, 3));
            this.f9187q.q(500L);
            this.f9188r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f9178g.k(null, j3);
        this.f9182l--;
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
        r9 r9Var = this.f9179i;
        if (r9Var != null) {
            r9Var.run();
        }
        this.f9179i = new r9(this, j3, z10, 1);
        Context context = this.f9174a;
        e6 e6Var = this.f9175b;
        nc ncVar = new nc(context, e6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        i9 i9Var = ncVar.f26433a;
        if (userOrChat != null) {
            i9Var.setCount(1);
            i9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        i9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        i9Var.setScaleX(1.333f);
        i9Var.setScaleY(1.333f);
        i9Var.a(false);
        c90 c90Var = ncVar.f26434b;
        c90Var.setSingleLine(false);
        c90Var.setMaxLines(2);
        c90Var.setTextSize(1, 14.0f);
        c90Var.setText(replaceTags);
        if (c90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) c90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) c90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            i9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        mc mcVar = new mc(context, e6Var, true, true);
        mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        mcVar.f26137a = new ai.j(this, j3, 9);
        mcVar.f26138b = this.f9179i;
        ncVar.setButton(mcVar);
        this.f9176c.b(ncVar, 5000).j();
    }
}
