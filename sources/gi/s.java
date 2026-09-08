package gi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import di.c9;
import di.q9;
import fi.j4;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import w7.x5;
public final class s extends n2 implements le.d {
    public final le.b f10787a;
    public long f10788b;
    public FrameLayout f10789c;
    public d61 d;
    public kh.f f10790e;
    public LinearLayout f10791f;
    public di.d h;
    public di.d f10792n;
    public xw0 f10793r;
    public TLRPC.ChatFull f10794s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f10787a = new le.b(0, this, pr.h, 320L, false);
    }

    public static void U(s sVar, h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof hi.f) {
            hi.f fVar = (hi.f) obj;
            long j3 = fVar.f11385a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(co.R9(user.f20043id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ii.c(sVar.getParentActivity(), chat, new j4(1, sVar, fVar)).show();
            } else {
                sVar.presentFragment(co.R9(-chat.f19896id));
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f10791f.setAlpha(f11);
        LinearLayout linearLayout = this.f10791f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f10793r.setAlpha(f7);
        xw0 xw0Var = this.f10793r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        xw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f10791f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f10793r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f10790e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, yc.a0(this), this.currentAccount, this.f10788b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 19);
        t0Var.d();
        this.v.e();
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10789c = frameLayout;
        int i10 = j6.f20634a7;
        frameLayout.setBackgroundColor(j6.w0(null, i10, false));
        d61 d61Var = new d61(this, new ci.u(this, 19), new q(this), new q(this));
        this.d = d61Var;
        d61Var.setClipToPadding(false);
        d61 d61Var2 = this.d;
        d61Var2.Y2.f31162r = false;
        d61Var2.o1();
        this.d.j(new ah.e0(this, 7));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f10789c.addView(this.d, x5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f10790e = view;
        view.setupColorKey(i10);
        this.f10790e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f10790e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f10789c.addView(this.f10790e, x5.g());
        this.f10789c.addView(this.actionBar, x5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10791f = linearLayout;
        linearLayout.setOrientation(0);
        this.f10791f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.f10792n = dVar;
        dVar.d();
        this.f10792n.setColor(i0.a.d(0.125f, getThemedColor(j6.f20690d6), getThemedColor(j6.G6)));
        this.f10792n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f10792n.e();
        this.f10792n.setOnClickListener(new View.OnClickListener(this) {
            public final s f10784b;

            {
                this.f10784b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10784b.v.f(false, true);
                        return;
                    default:
                        this.f10784b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10791f.addView(this.f10792n, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        di.d dVar2 = new di.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f10784b;

            {
                this.f10784b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10784b.v.f(false, true);
                        return;
                    default:
                        this.f10784b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10791f.addView(this.h, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10789c.addView(this.f10791f, x5.e(-1, -2, 80));
        xw0 xw0Var = new xw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f10793r = xw0Var;
        xw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f10793r.f32782e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f10793r.setAnimateLayoutChange(true);
        this.f10793r.setVisibility(8);
        this.f10789c.addView(this.f10793r, x5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f10794s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f10787a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f10789c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new c9(4));
        FrameLayout frameLayout3 = this.f10789c;
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
        this.f10788b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f10788b));
        this.f10794s = getMessagesController().getChatFull(this.f10788b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        q9 q9Var = t0Var.f10803i;
        if (q9Var != null) {
            q9Var.run();
        }
        t0Var.f10803i = null;
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
