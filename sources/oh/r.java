package oh;

import ag.e2;
import ag.z2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import h7.z5;
import hh.ua;
import java.util.WeakHashMap;
import lh.a8;
import lh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.rn;

public final class r extends n2 implements ud.b {

    public final ud.a f19563a;

    public long f19564b;

    public FrameLayout f19565c;
    public k51 d;

    public sg.f f19566e;

    public LinearLayout f19567f;
    public lh.d h;

    public lh.d f19568n;

    public iw0 f19569r;

    public TLRPC.ChatFull f19570s;
    public q0 v;

    public r(Bundle bundle) {
        super(bundle);
        this.f19563a = new ud.a(0, this, er.h, 320L, false);
    }

    public static void U(r rVar, n41 n41Var) {
        Object obj = n41Var.G;
        if (obj instanceof ph.e) {
            ph.e eVar = (ph.e) obj;
            long j10 = eVar.f46035a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(rn.R9(user.f22527id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                rVar.presentFragment(rn.R9(-chat.f22380id));
            } else {
                new qh.b(rVar.getParentActivity(), chat, new k7(17, rVar, eVar)).show();
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f19567f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f19569r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f19566e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        q0 q0Var = new q0(getParentActivity(), this.resourceProvider, mc.a0(this), this.currentAccount, this.f19564b);
        this.v = q0Var;
        q0Var.h = new m5.o(this, 7);
        q0Var.d();
        this.v.e();
        final int i10 = 0;
        pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e2(this, 9));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19565c = frameLayout;
        int i11 = g6.f22999a7;
        frameLayout.setBackgroundColor(g6.w0(null, i11, false));
        k51 k51Var = new k51(this, new a8(this, 12), new p(this), new p(this));
        this.d = k51Var;
        k51Var.setClipToPadding(false);
        k51 k51Var2 = this.d;
        k51Var2.U2.f26942r = false;
        k51Var2.p1();
        this.d.j(new z2(this, 17));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f19565c.addView(this.d, z5.c(-1.0f, -1));
        sg.f fVar = new sg.f(context);
        this.f19566e = fVar;
        fVar.setupColorKey(i11);
        this.f19566e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f19566e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f19565c.addView(this.f19566e, z5.g());
        this.f19565c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f19567f = linearLayout;
        linearLayout.setOrientation(0);
        this.f19567f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        lh.d dVar = new lh.d(context, this.resourceProvider, true);
        this.f19568n = dVar;
        dVar.d();
        this.f19568n.setColor(i0.b.d(0.125f, getThemedColor(g6.f23053d6), getThemedColor(g6.G6)));
        this.f19568n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f19568n.e();
        this.f19568n.setOnClickListener(new View.OnClickListener(this) {

            public final r f19546b;

            {
                this.f19546b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f19546b.v.f(false, true);
                        break;
                    default:
                        this.f19546b.v.f(true, true);
                        break;
                }
            }
        });
        this.f19567f.addView(this.f19568n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        lh.d dVar2 = new lh.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        lh.d dVar3 = this.h;
        final int i12 = z10 ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) {

            public final r f19546b;

            {
                this.f19546b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f19546b.v.f(false, true);
                        break;
                    default:
                        this.f19546b.v.f(true, true);
                        break;
                }
            }
        });
        this.f19567f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f19565c.addView(this.f19567f, z5.e(-1, -2, 80));
        iw0 iw0Var = new iw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f19569r = iw0Var;
        iw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f19569r.f29506e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f19569r.setAnimateLayoutChange(true);
        this.f19569r.setVisibility(8);
        this.f19565c.addView(this.f19569r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f19570s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f19563a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f19565c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(frameLayout2, pVar);
        setBulletinDelegate(new cg.w(8));
        FrameLayout frameLayout3 = this.f19565c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        float f12 = 1.0f - f10;
        this.f19567f.setAlpha(f12);
        this.f19567f.setVisibility(f12 > 0.0f ? 0 : 8);
        this.f19569r.setAlpha(f10);
        this.f19569r.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f19564b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f19564b));
        this.f19570s = getMessagesController().getChatFull(this.f19564b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        q0 q0Var = this.v;
        ua uaVar = q0Var.f19553i;
        if (uaVar != null) {
            uaVar.run();
        }
        q0Var.f19553i = null;
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
