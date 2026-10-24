package hi;

import ai.ud;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w90;
public final class s0 implements ii.e {
    public final Context f12250a;
    public final g6 f12251b;
    public final vc f12252c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f12253f;
    public r0 h;
    public ud f12255i;
    public String f12257k;
    public int f12258l;
    public boolean f12259m;
    public boolean f12260n;
    public long f12261o;
    public int f12262p;
    public c2 f12263q;
    public int f12264r;
    public final a0.h f12254g = new a0.h();
    public ArrayList f12256j = new ArrayList();

    public s0(Context context, g6 g6Var, vc vcVar, int i10, long j10) {
        this.f12250a = context;
        this.f12251b = g6Var;
        this.f12252c = vcVar;
        this.d = i10;
        this.e = j10;
        this.f12253f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f12261o = MessagesController.getMainSettings(i10).getLong(a1.g.o(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f12262p = 0;
        ArrayList arrayList = this.f12256j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f12254g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f12256j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f12261o) {
                        return;
                    }
                    this.f12262p++;
                }
            }
        }
    }

    public final void b(i71 i71Var) {
        if (!this.f12259m && !this.f12260n && i71Var.Y2.N0() + 10 > i71Var.Z2.f24650y.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f12256j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f12256j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f12254g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = ii.g.f13208a;
                        l61 J = l61.J(ii.g.class);
                        J.G = new ii.f(peerDialogId, user, z11);
                        J.H = this;
                        J.f28225j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f12260n) {
                arrayList.add(l61.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f12259m && !this.f12260n && ChatObject.canUserDoAdminAction(this.f12253f, 27)) {
            this.f12259m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f12257k, new q0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f12261o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f12263q == null && this.f12264r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f12258l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                c2 O = d5.O(this.f12250a, this.f12251b, string, replaceTags, LocaleController.getString(i11), new ah.t(11, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    r6.W(textView, k6.f21422q7, null);
                    return;
                }
                return;
            }
            ud udVar = this.f12255i;
            if (udVar != null) {
                udVar.run();
            }
            this.f12255i = null;
            c2 c2Var = new c2(this.f12250a, 3, this.f12251b);
            this.f12263q = c2Var;
            c2Var.setOnCancelListener(new pc(this, 3));
            this.f12263q.r(500L);
            this.f12264r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new q0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f12254g.k(null, j10);
        this.f12258l--;
        a();
        r0 r0Var = this.h;
        if (r0Var != null) {
            r0Var.q();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j10)));
        ud udVar = this.f12255i;
        if (udVar != null) {
            udVar.run();
        }
        this.f12255i = new ud(this, j10, z10, 2);
        Context context = this.f12250a;
        g6 g6Var = this.f12251b;
        nc ncVar = new nc(context, g6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        i9 i9Var = ncVar.f28864a;
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
        w90 w90Var = ncVar.f28865b;
        w90Var.setSingleLine(false);
        w90Var.setMaxLines(2);
        w90Var.setTextSize(1, 14.0f);
        w90Var.setText(replaceTags);
        if (w90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) w90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) w90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            i9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        mc mcVar = new mc(context, g6Var, true, true);
        mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        mcVar.f28574b = new v3(this, j10, 12);
        mcVar.f28575c = this.f12255i;
        ncVar.setButton(mcVar);
        this.f12252c.b(ncVar, 5000).j();
    }
}
