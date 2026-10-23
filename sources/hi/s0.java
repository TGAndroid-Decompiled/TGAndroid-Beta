package hi;

import ai.td;
import ai.v3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ei.pc;
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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
public final class s0 implements ii.d {
    public final Context f12218a;
    public final d6 f12219b;
    public final xc f12220c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f12221f;
    public r0 h;
    public td f12223i;
    public String f12225k;
    public int f12226l;
    public boolean f12227m;
    public boolean f12228n;
    public long f12229o;
    public int f12230p;
    public b2 f12231q;
    public int f12232r;
    public final a0.h f12222g = new a0.h();
    public ArrayList f12224j = new ArrayList();

    public s0(Context context, d6 d6Var, xc xcVar, int i10, long j10) {
        this.f12218a = context;
        this.f12219b = d6Var;
        this.f12220c = xcVar;
        this.d = i10;
        this.e = j10;
        this.f12221f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f12229o = MessagesController.getMainSettings(i10).getLong(a1.g.o(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f12230p = 0;
        ArrayList arrayList = this.f12224j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f12222g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f12224j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f12229o) {
                        return;
                    }
                    this.f12230p++;
                }
            }
        }
    }

    public final void b(c71 c71Var) {
        if (!this.f12227m && !this.f12228n && c71Var.V2.N0() + 10 > c71Var.W2.f30868x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f12224j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f12224j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f12222g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = ii.f.f13162a;
                        h61 J = h61.J(ii.f.class);
                        J.G = new ii.e(peerDialogId, user, z11);
                        J.H = this;
                        J.f26784j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f12228n) {
                arrayList.add(h61.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f12227m && !this.f12228n && ChatObject.canUserDoAdminAction(this.f12221f, 27)) {
            this.f12227m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f12225k, new q0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f12229o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f12231q == null && this.f12232r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f12226l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                b2 O = f5.O(this.f12218a, this.f12219b, string, replaceTags, LocaleController.getString(i11), new ah.t(11, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    textView.setTextColor(h6.x0(null, h6.f21232q7, false));
                    return;
                }
                return;
            }
            td tdVar = this.f12223i;
            if (tdVar != null) {
                tdVar.run();
            }
            this.f12223i = null;
            b2 b2Var = new b2(this.f12218a, 3, this.f12219b);
            this.f12231q = b2Var;
            b2Var.setOnCancelListener(new pc(this, 3));
            this.f12231q.r(500L);
            this.f12232r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new q0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f12222g.k(null, j10);
        this.f12226l--;
        a();
        r0 r0Var = this.h;
        if (r0Var != null) {
            r0Var.l();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j10)));
        td tdVar = this.f12223i;
        if (tdVar != null) {
            tdVar.run();
        }
        this.f12223i = new td(this, j10, z10, 2);
        Context context = this.f12218a;
        d6 d6Var = this.f12219b;
        org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        k9 k9Var = pcVar.f29296a;
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
        x90 x90Var = pcVar.f29297b;
        x90Var.setSingleLine(false);
        x90Var.setMaxLines(2);
        x90Var.setTextSize(1, 14.0f);
        x90Var.setText(replaceTags);
        if (x90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) x90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) x90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            k9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        oc ocVar = new oc(context, d6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f28987a = new v3(this, j10, 12);
        ocVar.f28988b = this.f12223i;
        pcVar.setButton(ocVar);
        this.f12220c.b(pcVar, 5000).j();
    }
}
