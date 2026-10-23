package hi;

import ai.td;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ei.o8;
import ei.p6;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.qn;
import w7.z5;
public final class r extends n2 implements ne.d {
    public final ne.b f12209a;
    public long f12210b;
    public FrameLayout f12211c;
    public c71 d;
    public kh.f e;
    public LinearLayout f12212f;
    public ei.d h;
    public ei.d f12213n;
    public tx0 f12214r;
    public TLRPC.ChatFull f12215s;
    public s0 v;

    public r(Bundle bundle) {
        super(bundle);
        this.f12209a = new ne.b(0, this, bs.h, 320L, false);
    }

    public static void U(r rVar, h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof ii.e) {
            ii.e eVar = (ii.e) obj;
            long j10 = eVar.f13159a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(qn.W9(user.f20427id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ji.b(rVar.getParentActivity(), chat, new p6(29, rVar, eVar)).show();
            } else {
                rVar.presentFragment(qn.W9(-chat.f20280id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f12212f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f12214r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        s0 s0Var = new s0(getParentActivity(), this.resourceProvider, xc.a0(this), this.currentAccount, this.f12210b);
        this.v = s0Var;
        s0Var.h = new ya.d(this, 23);
        s0Var.d();
        this.v.e();
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 7));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12211c = frameLayout;
        int i10 = h6.f20936a7;
        frameLayout.setBackgroundColor(h6.x0(null, i10, false));
        c71 c71Var = new c71(this, new hg.o(this, 1), new p(this), new p(this));
        this.d = c71Var;
        c71Var.setClipToPadding(false);
        c71 c71Var2 = this.d;
        c71Var2.W2.f30865r = false;
        c71Var2.p1();
        this.d.j(new ah.d0(this, 10));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f12211c.addView(this.d, z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f12211c.addView(this.e, z5.g());
        this.f12211c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12212f = linearLayout;
        linearLayout.setOrientation(0);
        this.f12212f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.f12213n = dVar;
        dVar.d();
        this.f12213n.setColor(i0.a.f(0.125f, getThemedColor(h6.f20994d6), getThemedColor(h6.G6)));
        this.f12213n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f12213n.e();
        this.f12213n.setOnClickListener(new View.OnClickListener(this) {
            public final r f12206b;

            {
                this.f12206b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f12206b.v.f(false, true);
                        return;
                    default:
                        this.f12206b.v.f(true, true);
                        return;
                }
            }
        });
        this.f12212f.addView(this.f12213n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final r f12206b;

            {
                this.f12206b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f12206b.v.f(false, true);
                        return;
                    default:
                        this.f12206b.v.f(true, true);
                        return;
                }
            }
        });
        this.f12212f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f12211c.addView(this.f12212f, z5.e(-1, -2, 80));
        tx0 tx0Var = new tx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f12214r = tx0Var;
        tx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f12214r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f12214r.setAnimateLayoutChange(true);
        this.f12214r.setVisibility(8);
        this.f12211c.addView(this.f12214r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f12215s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f12209a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f12211c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.i0.f44830a;
        r0.a0.i(frameLayout2, pVar);
        setBulletinDelegate(new o8(4));
        FrameLayout frameLayout3 = this.f12211c;
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
    public final boolean onFragmentCreate() {
        this.f12210b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f12210b));
        this.f12215s = getMessagesController().getChatFull(this.f12210b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        s0 s0Var = this.v;
        td tdVar = s0Var.f12223i;
        if (tdVar != null) {
            tdVar.run();
        }
        s0Var.f12223i = null;
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f12212f.setAlpha(f11);
        LinearLayout linearLayout = this.f12212f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f12214r.setAlpha(f7);
        tx0 tx0Var = this.f12214r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        tx0Var.setVisibility(i12);
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
