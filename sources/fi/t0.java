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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
public final class t0 implements gi.e {
    public final Context f9178a;
    public final e6 f9179b;
    public final xc f9180c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f9181f;
    public s0 h;
    public r9 f9183i;
    public String f9185k;
    public int f9186l;
    public boolean f9187m;
    public boolean f9188n;
    public long f9189o;
    public int f9190p;
    public b2 f9191q;
    public int f9192r;
    public final a0.i f9182g = new a0.i();
    public ArrayList f9184j = new ArrayList();

    public t0(Context context, e6 e6Var, xc xcVar, int i10, long j3) {
        this.f9178a = context;
        this.f9179b = e6Var;
        this.f9180c = xcVar;
        this.d = i10;
        this.e = j3;
        this.f9181f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f9189o = MessagesController.getMainSettings(i10).getLong(a4.a.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f9190p = 0;
        ArrayList arrayList = this.f9184j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f9182g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f9184j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f9189o) {
                        return;
                    }
                    this.f9190p++;
                }
            }
        }
    }

    public final void b(t61 t61Var) {
        if (!this.f9187m && !this.f9188n && t61Var.X2.N0() + 10 > t61Var.Y2.f26045x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f9184j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f9184j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f9182g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = gi.g.f10029a;
                        x51 J = x51.J(gi.g.class);
                        J.G = new gi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f30246j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f9188n) {
                arrayList.add(x51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f9187m && !this.f9188n && ChatObject.canUserDoAdminAction(this.f9181f, 27)) {
            this.f9187m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f9185k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f9189o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f9191q == null && this.f9192r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f9186l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 P = e5.P(this.f9178a, this.f9179b, string, replaceTags, LocaleController.getString(i11), new bi.f(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(j6.w0(null, j6.f19301q7, false));
                    return;
                }
                return;
            }
            r9 r9Var = this.f9183i;
            if (r9Var != null) {
                r9Var.run();
            }
            this.f9183i = null;
            b2 b2Var = new b2(this.f9178a, 3, this.f9179b);
            this.f9191q = b2Var;
            b2Var.setOnCancelListener(new id(this, 3));
            this.f9191q.q(500L);
            this.f9192r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f9182g.k(null, j3);
        this.f9186l--;
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
        r9 r9Var = this.f9183i;
        if (r9Var != null) {
            r9Var.run();
        }
        this.f9183i = new r9(this, j3, z10, 1);
        Context context = this.f9178a;
        e6 e6Var = this.f9179b;
        pc pcVar = new pc(context, e6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        k9 k9Var = pcVar.f27182a;
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
        l90 l90Var = pcVar.f27183b;
        l90Var.setSingleLine(false);
        l90Var.setMaxLines(2);
        l90Var.setTextSize(1, 14.0f);
        l90Var.setText(replaceTags);
        if (l90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) l90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) l90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            k9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        oc ocVar = new oc(context, e6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f26906a = new ai.j(this, j3, 9);
        ocVar.f26907b = this.f9183i;
        pcVar.setButton(ocVar);
        this.f9180c.b(pcVar, 5000).j();
    }
}
