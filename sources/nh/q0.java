package nh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bg.i2;
import gh.ua;
import java.util.ArrayList;
import kh.pc;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.y4;
public final class q0 implements oh.d {
    public final Context f18698a;
    public final b6 f18699b;
    public final oc f18700c;
    public final int d;
    public final long f18701e;
    public final TLRPC.Chat f18702f;
    public p0 h;
    public ua f18704i;
    public String f18706k;
    public int f18707l;
    public boolean f18708m;
    public boolean f18709n;
    public long f18710o;
    public int f18711p;
    public c2 f18712q;
    public int f18713r;
    public final a0.h f18703g = new a0.h();
    public ArrayList f18705j = new ArrayList();

    public q0(Context context, b6 b6Var, oc ocVar, int i9, long j10) {
        this.f18698a = context;
        this.f18699b = b6Var;
        this.f18700c = ocVar;
        this.d = i9;
        this.f18701e = j10;
        this.f18702f = MessagesController.getInstance(i9).getChat(Long.valueOf(j10));
        this.f18710o = MessagesController.getMainSettings(i9).getLong(aa.d.m(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f18711p = 0;
        ArrayList arrayList = this.f18705j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (!this.f18703g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f18705j.get(i9)).peer))) {
                    if (communityPeerRequest.date <= this.f18710o) {
                        return;
                    }
                    this.f18711p++;
                }
            }
        }
    }

    public final void b(i51 i51Var) {
        if (!this.f18708m && !this.f18709n && i51Var.T2.N0() + 10 > i51Var.U2.f35191x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f18705j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f18705j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i9 = 0; i9 < size; i9++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i9);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f18703g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i9 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = oh.f.f19589a;
                        l41 J = l41.J(oh.f.class);
                        J.G = new oh.e(peerDialogId, user, z11);
                        J.H = this;
                        J.f30337j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f18709n) {
                arrayList.add(l41.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f18708m && !this.f18709n && ChatObject.canUserDoAdminAction(this.f18702f, 27)) {
            this.f18708m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f18701e, this.f18706k, new o0(this, 1));
        }
    }

    public final void e() {
        int i9 = this.d;
        long currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        this.f18710o = currentTime;
        MessagesController.getMainSettings(i9).edit().putLong("community_requests_last_view_time_" + this.f18701e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i9;
        String str;
        int i10;
        TextView textView;
        if (this.f18712q == null && this.f18713r == 0) {
            if (z11) {
                if (z10) {
                    i9 = R.string.CommunityAddAllChatsTitle;
                } else {
                    i9 = R.string.CommunityDeclineAllTitle;
                }
                String string = LocaleController.getString(i9);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f18707l, new Object[0]));
                if (z10) {
                    i10 = R.string.Add;
                } else {
                    i10 = R.string.Decline;
                }
                c2 P = y4.P(this.f18698a, this.f18699b, string, replaceTags, LocaleController.getString(i10), new eh.f(12, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(f6.w0(null, f6.f23230q7, false));
                    return;
                }
                return;
            }
            ua uaVar = this.f18704i;
            if (uaVar != null) {
                uaVar.run();
            }
            this.f18704i = null;
            c2 c2Var = new c2(this.f18698a, 3, this.f18699b);
            this.f18712q = c2Var;
            c2Var.setOnCancelListener(new pc(this, 3));
            this.f18712q.q(500L);
            this.f18713r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f18701e, !z10, new o0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i9;
        int i10;
        this.f18703g.k(null, j10);
        this.f18707l--;
        a();
        p0 p0Var = this.h;
        if (p0Var != null) {
            p0Var.c();
        }
        if (z10) {
            i9 = R.string.CommunityRequestApprovedToast;
        } else {
            i9 = R.string.CommunityRequestDeclinedToast;
        }
        int i11 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i9, DialogObject.getShortName(i11, j10)));
        ua uaVar = this.f18704i;
        if (uaVar != null) {
            uaVar.run();
        }
        this.f18704i = new ua(this, j10, z10, 2);
        Context context = this.f18698a;
        b6 b6Var = this.f18699b;
        fc fcVar = new fc(context, b6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(j10);
        c9 c9Var = fcVar.f28372a;
        if (userOrChat != null) {
            c9Var.setCount(1);
            c9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i10 = 1;
        } else {
            i10 = 0;
        }
        c9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        c9Var.setScaleX(1.333f);
        c9Var.setScaleY(1.333f);
        c9Var.a(false);
        l80 l80Var = fcVar.f28373b;
        l80Var.setSingleLine(false);
        l80Var.setMaxLines(2);
        l80Var.setTextSize(1, 14.0f);
        l80Var.setText(replaceTags);
        if (l80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) l80Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) l80Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            c9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        ec ecVar = new ec(context, b6Var, true, true);
        ecVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ecVar.f27999a = new i2(this, j10, 13);
        ecVar.f28000b = this.f18704i;
        fcVar.setButton(ecVar);
        this.f18700c.b(fcVar, 5000).j();
    }
}
