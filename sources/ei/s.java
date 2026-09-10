package ei;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.a2;
import bi.af;
import bi.fa;
import bi.xa;
import com.google.android.gms.internal.vision.e2;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import w7.a6;
public final class s extends p2 implements le.d {
    public final le.b f7614a;
    public long f7615b;
    public FrameLayout f7616c;
    public r61 d;
    public ih.f e;
    public LinearLayout f7617f;
    public bi.d h;
    public bi.d f7618n;
    public jx0 f7619r;
    public TLRPC.ChatFull f7620s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f7614a = new le.b(0, this, wr.h, 320L, false);
    }

    public static void U(s sVar, v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof fi.f) {
            fi.f fVar = (fi.f) obj;
            long j3 = fVar.f8307a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(eo.R9(user.f17342id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new gi.c(sVar.getParentActivity(), chat, new af(24, sVar, fVar)).show();
            } else {
                sVar.presentFragment(eo.R9(-chat.f17195id));
            }
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f7617f.setAlpha(f11);
        LinearLayout linearLayout = this.f7617f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f7619r.setAlpha(f7);
        jx0 jx0Var = this.f7619r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        jx0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f7617f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f7619r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, wc.a0(this), this.currentAccount, this.f7615b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 17);
        t0Var.d();
        this.v.e();
        e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7616c = frameLayout;
        int i10 = j6.f17872a7;
        frameLayout.setBackgroundColor(j6.w0(null, i10, false));
        r61 r61Var = new r61(this, new ai.c0(this, 19), new q(this), new q(this));
        this.d = r61Var;
        r61Var.setClipToPadding(false);
        r61 r61Var2 = this.d;
        r61Var2.Y2.f24250r = false;
        r61Var2.o1();
        this.d.j(new a2(this, 4));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f7616c.addView(this.d, a6.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f7616c.addView(this.e, a6.g());
        this.f7616c.addView(this.actionBar, a6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f7617f = linearLayout;
        linearLayout.setOrientation(0);
        this.f7617f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        bi.d dVar = new bi.d(context, this.resourceProvider, true);
        this.f7618n = dVar;
        dVar.d();
        this.f7618n.setColor(i0.a.d(0.125f, getThemedColor(j6.f17928d6), getThemedColor(j6.G6)));
        this.f7618n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f7618n.e();
        this.f7618n.setOnClickListener(new View.OnClickListener(this) {
            public final s f7611b;

            {
                this.f7611b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f7611b.v.f(false, true);
                        return;
                    default:
                        this.f7611b.v.f(true, true);
                        return;
                }
            }
        });
        this.f7617f.addView(this.f7618n, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        bi.d dVar2 = new bi.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f7611b;

            {
                this.f7611b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f7611b.v.f(false, true);
                        return;
                    default:
                        this.f7611b.v.f(true, true);
                        return;
                }
            }
        });
        this.f7617f.addView(this.h, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f7616c.addView(this.f7617f, a6.e(-1, -2, 80));
        jx0 jx0Var = new jx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f7619r = jx0Var;
        jx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f7619r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f7619r.setAnimateLayoutChange(true);
        this.f7619r.setVisibility(8);
        this.f7616c.addView(this.f7619r, a6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f7620s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f7614a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f7616c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new fa(4));
        FrameLayout frameLayout3 = this.f7616c;
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
        this.f7615b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f7615b));
        this.f7620s = getMessagesController().getChatFull(this.f7615b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        xa xaVar = t0Var.f7628i;
        if (xaVar != null) {
            xaVar.run();
        }
        t0Var.f7628i = null;
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
