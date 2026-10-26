package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.kd;
import bi.r3;
import fi.lc;
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
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
public final class r0 implements ji.e {
    public final Context f14413a;
    public final u6 f14414b;
    public final wc f14415c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f14416f;
    public q0 h;
    public kd f14418i;
    public String f14420k;
    public int f14421l;
    public boolean f14422m;
    public boolean f14423n;
    public long f14424o;
    public int f14425p;
    public e2 f14426q;
    public int f14427r;
    public final a0.h f14417g = new a0.h();
    public ArrayList f14419j = new ArrayList();

    public r0(Context context, u6 u6Var, wc wcVar, int i10, long j10) {
        this.f14413a = context;
        this.f14414b = u6Var;
        this.f14415c = wcVar;
        this.d = i10;
        this.e = j10;
        this.f14416f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f14424o = MessagesController.getMainSettings(i10).getLong(a1.g.o(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f14425p = 0;
        ArrayList arrayList = this.f14419j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f14417g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f14419j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f14424o) {
                        return;
                    }
                    this.f14425p++;
                }
            }
        }
    }

    public final void b(r71 r71Var) {
        if (!this.f14422m && !this.f14423n && r71Var.f32151f3.N0() + 10 > r71Var.f32152g3.f29511y.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f14419j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f14419j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f14417g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = ji.g.f15983a;
                        t61 K = t61.K(ji.g.class);
                        K.G = new ji.f(peerDialogId, user, z11);
                        K.H = this;
                        K.f32873j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f14423n) {
                arrayList.add(t61.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f14422m && !this.f14423n && ChatObject.canUserDoAdminAction(this.f14416f, 27)) {
            this.f14422m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f14420k, new p0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f14424o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f14426q == null && this.f14427r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f14421l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                e2 O = g5.O(this.f14413a, this.f14414b, string, replaceTags, LocaleController.getString(i11), new bh.n(11, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    f7.V(textView, y6.f23598q7, null);
                    return;
                }
                return;
            }
            kd kdVar = this.f14418i;
            if (kdVar != null) {
                kdVar.run();
            }
            this.f14418i = null;
            e2 e2Var = new e2(this.f14413a, 3, this.f14414b);
            this.f14426q = e2Var;
            e2Var.setOnCancelListener(new lc(this, 3));
            this.f14426q.r(500L);
            this.f14427r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new p0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f14417g.k(null, j10);
        this.f14421l--;
        a();
        q0 q0Var = this.h;
        if (q0Var != null) {
            q0Var.c();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j10)));
        kd kdVar = this.f14418i;
        if (kdVar != null) {
            kdVar.run();
        }
        this.f14418i = new kd(this, j10, z10, 2);
        Context context = this.f14413a;
        u6 u6Var = this.f14414b;
        pc pcVar = new pc(context, u6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        m9 m9Var = pcVar.f31543a;
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
        z90 z90Var = pcVar.f31544b;
        z90Var.setSingleLine(false);
        z90Var.setMaxLines(2);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setText(replaceTags);
        if (z90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) z90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) z90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            m9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        oc ocVar = new oc(context, u6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f31255b = new r3(this, j10, 12);
        ocVar.f31256c = this.f14418i;
        pcVar.setButton(ocVar);
        this.f14415c.b(pcVar, 5000).j();
    }
}
