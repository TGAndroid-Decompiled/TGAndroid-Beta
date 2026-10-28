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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
public final class r0 implements ji.e {
    public final Context f14412a;
    public final u6 f14413b;
    public final wc f14414c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f14415f;
    public q0 h;
    public kd f14417i;
    public String f14419k;
    public int f14420l;
    public boolean f14421m;
    public boolean f14422n;
    public long f14423o;
    public int f14424p;
    public e2 f14425q;
    public int f14426r;
    public final a0.h f14416g = new a0.h();
    public ArrayList f14418j = new ArrayList();

    public r0(Context context, u6 u6Var, wc wcVar, int i10, long j10) {
        this.f14412a = context;
        this.f14413b = u6Var;
        this.f14414c = wcVar;
        this.d = i10;
        this.e = j10;
        this.f14415f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f14423o = MessagesController.getMainSettings(i10).getLong(a1.g.o(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f14424p = 0;
        ArrayList arrayList = this.f14418j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f14416g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f14418j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f14423o) {
                        return;
                    }
                    this.f14424p++;
                }
            }
        }
    }

    public final void b(s71 s71Var) {
        if (!this.f14421m && !this.f14422n && s71Var.f32503f3.N0() + 10 > s71Var.f32504g3.f29882y.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f14418j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f14418j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f14416g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = ji.g.f15982a;
                        u61 K = u61.K(ji.g.class);
                        K.G = new ji.f(peerDialogId, user, z11);
                        K.H = this;
                        K.f33247j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f14422n) {
                arrayList.add(u61.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f14421m && !this.f14422n && ChatObject.canUserDoAdminAction(this.f14415f, 27)) {
            this.f14421m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f14419k, new p0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f14423o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f14425q == null && this.f14426r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f14420l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                e2 O = g5.O(this.f14412a, this.f14413b, string, replaceTags, LocaleController.getString(i11), new bh.n(11, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    f7.V(textView, y6.f23599q7, null);
                    return;
                }
                return;
            }
            kd kdVar = this.f14417i;
            if (kdVar != null) {
                kdVar.run();
            }
            this.f14417i = null;
            e2 e2Var = new e2(this.f14412a, 3, this.f14413b);
            this.f14425q = e2Var;
            e2Var.setOnCancelListener(new lc(this, 3));
            this.f14425q.r(500L);
            this.f14426r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new p0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f14416g.k(null, j10);
        this.f14420l--;
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
        kd kdVar = this.f14417i;
        if (kdVar != null) {
            kdVar.run();
        }
        this.f14417i = new kd(this, j10, z10, 2);
        Context context = this.f14412a;
        u6 u6Var = this.f14413b;
        pc pcVar = new pc(context, u6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        m9 m9Var = pcVar.f31568a;
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
        aa0 aa0Var = pcVar.f31569b;
        aa0Var.setSingleLine(false);
        aa0Var.setMaxLines(2);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setText(replaceTags);
        if (aa0Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) aa0Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) aa0Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            m9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        oc ocVar = new oc(context, u6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f31259b = new r3(this, j10, 12);
        ocVar.f31260c = this.f14417i;
        pcVar.setButton(ocVar);
        this.f14414c.b(pcVar, 5000).j();
    }
}
