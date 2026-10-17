package hi;

import ai.sd;
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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
import w7.z5;
public final class r extends n2 implements ne.d {
    public final ne.b f12210a;
    public long f12211b;
    public FrameLayout f12212c;
    public a71 d;
    public kh.f e;
    public LinearLayout f12213f;
    public ei.d h;
    public ei.d f12214n;
    public rx0 f12215r;
    public TLRPC.ChatFull f12216s;
    public s0 v;

    public r(Bundle bundle) {
        super(bundle);
        this.f12210a = new ne.b(0, this, bs.h, 320L, false);
    }

    public static void U(r rVar, f61 f61Var) {
        Object obj = f61Var.G;
        if (obj instanceof ii.e) {
            ii.e eVar = (ii.e) obj;
            long j10 = eVar.f13154a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(sn.W9(user.f20419id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ji.b(rVar.getParentActivity(), chat, new p6(29, rVar, eVar)).show();
            } else {
                rVar.presentFragment(sn.W9(-chat.f20272id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f12213f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f12215r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        s0 s0Var = new s0(getParentActivity(), this.resourceProvider, xc.a0(this), this.currentAccount, this.f12211b);
        this.v = s0Var;
        s0Var.h = new ya.c(this, 23);
        s0Var.d();
        this.v.e();
        i0.a.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 7));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12212c = frameLayout;
        int i10 = h6.f20928a7;
        frameLayout.setBackgroundColor(h6.x0(null, i10, false));
        a71 a71Var = new a71(this, new hg.o(this, 1), new p(this), new p(this));
        this.d = a71Var;
        a71Var.setClipToPadding(false);
        a71 a71Var2 = this.d;
        a71Var2.W2.f30200r = false;
        a71Var2.p1();
        this.d.j(new ah.d0(this, 10));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f12212c.addView(this.d, z5.d(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f12212c.addView(this.e, z5.g());
        this.f12212c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12213f = linearLayout;
        linearLayout.setOrientation(0);
        this.f12213f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.f12214n = dVar;
        dVar.d();
        this.f12214n.setColor(i0.b.f(0.125f, getThemedColor(h6.f20986d6), getThemedColor(h6.G6)));
        this.f12214n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f12214n.e();
        this.f12214n.setOnClickListener(new View.OnClickListener(this) {
            public final r f12207b;

            {
                this.f12207b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f12207b.v.f(false, true);
                        return;
                    default:
                        this.f12207b.v.f(true, true);
                        return;
                }
            }
        });
        this.f12213f.addView(this.f12214n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final r f12207b;

            {
                this.f12207b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f12207b.v.f(false, true);
                        return;
                    default:
                        this.f12207b.v.f(true, true);
                        return;
                }
            }
        });
        this.f12213f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f12212c.addView(this.f12213f, z5.e(-1, -2, 80));
        rx0 rx0Var = new rx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f12215r = rx0Var;
        rx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f12215r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f12215r.setAnimateLayoutChange(true);
        this.f12215r.setVisibility(8);
        this.f12212c.addView(this.f12215r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f12216s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f12210a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f12212c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.i0.f44844a;
        r0.a0.i(frameLayout2, pVar);
        setBulletinDelegate(new o8(4));
        FrameLayout frameLayout3 = this.f12212c;
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
        this.f12211b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f12211b));
        this.f12216s = getMessagesController().getChatFull(this.f12211b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        s0 s0Var = this.v;
        sd sdVar = s0Var.f12224i;
        if (sdVar != null) {
            sdVar.run();
        }
        s0Var.f12224i = null;
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f12213f.setAlpha(f11);
        LinearLayout linearLayout = this.f12213f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f12215r.setAlpha(f7);
        rx0 rx0Var = this.f12215r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        rx0Var.setVisibility(i12);
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
