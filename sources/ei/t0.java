package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.va;
import bi.xa;
import bi.xe;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
public final class t0 implements fi.e {
    public final Context f7623a;
    public final f6 f7624b;
    public final wc f7625c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f7626f;
    public s0 h;
    public xa f7628i;
    public String f7630k;
    public int f7631l;
    public boolean f7632m;
    public boolean f7633n;
    public long f7634o;
    public int f7635p;
    public d2 f7636q;
    public int f7637r;
    public final a0.i f7627g = new a0.i();
    public ArrayList f7629j = new ArrayList();

    public t0(Context context, f6 f6Var, wc wcVar, int i10, long j3) {
        this.f7623a = context;
        this.f7624b = f6Var;
        this.f7625c = wcVar;
        this.d = i10;
        this.e = j3;
        this.f7626f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.f7634o = MessagesController.getMainSettings(i10).getLong(a4.a.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f7635p = 0;
        ArrayList arrayList = this.f7629j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f7627g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f7629j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f7634o) {
                        return;
                    }
                    this.f7635p++;
                }
            }
        }
    }

    public final void b(r61 r61Var) {
        if (!this.f7632m && !this.f7633n && r61Var.X2.N0() + 10 > r61Var.Y2.f24253x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f7629j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f7629j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.i iVar = this.f7627g;
                    if (iVar == null || !iVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = fi.g.f8310a;
                        v51 J = v51.J(fi.g.class);
                        J.G = new fi.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f27827j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f7633n) {
                arrayList.add(v51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f7632m && !this.f7633n && ChatObject.canUserDoAdminAction(this.f7626f, 27)) {
            this.f7632m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f7630k, new r0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f7634o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f7636q == null && this.f7637r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f7631l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                d2 P = d5.P(this.f7623a, this.f7624b, string, replaceTags, LocaleController.getString(i11), new ai.j(6, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(j6.w0(null, j6.f18162q7, false));
                    return;
                }
                return;
            }
            xa xaVar = this.f7628i;
            if (xaVar != null) {
                xaVar.run();
            }
            this.f7628i = null;
            d2 d2Var = new d2(this.f7623a, 3, this.f7624b);
            this.f7636q = d2Var;
            d2Var.setOnCancelListener(new xe(this, 3));
            this.f7636q.q(500L);
            this.f7637r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        int i11;
        this.f7627g.k(null, j3);
        this.f7631l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.F();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j3)));
        xa xaVar = this.f7628i;
        if (xaVar != null) {
            xaVar.run();
        }
        this.f7628i = new xa(this, j3, z10, 1);
        Context context = this.f7623a;
        f6 f6Var = this.f7624b;
        oc ocVar = new oc(context, f6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        j9 j9Var = ocVar.f25757a;
        if (userOrChat != null) {
            j9Var.setCount(1);
            j9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        j9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        j9Var.setScaleX(1.333f);
        j9Var.setScaleY(1.333f);
        j9Var.a(false);
        m90 m90Var = ocVar.f25758b;
        m90Var.setSingleLine(false);
        m90Var.setMaxLines(2);
        m90Var.setTextSize(1, 14.0f);
        m90Var.setText(replaceTags);
        if (m90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) m90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) m90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            j9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        nc ncVar = new nc(context, f6Var, true, true);
        ncVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ncVar.f25483a = new va(this, j3, 4);
        ncVar.f25484b = this.f7628i;
        ocVar.setButton(ncVar);
        this.f7625c.b(ocVar, 5000).j();
    }
}
