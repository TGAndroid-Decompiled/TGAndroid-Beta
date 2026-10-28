package ii;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.kd;
import fi.k8;
import hi.e2;
import hi.u2;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;
public final class r extends r2 implements oe.d {
    public final oe.b f14404a;
    public long f14405b;
    public FrameLayout f14406c;
    public s71 d;
    public lh.f e;
    public LinearLayout f14407f;
    public fi.d h;
    public fi.d f14408n;
    public fy0 f14409r;
    public TLRPC.ChatFull f14410s;
    public r0 v;
    public int f14411w;

    public r(Bundle bundle) {
        super(bundle);
        this.f14404a = new oe.b(0, this, ds.h, 320L, false);
    }

    public static void V(r rVar, u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof ji.f) {
            ji.f fVar = (ji.f) obj;
            long j10 = fVar.f15979a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(wn.ea(user.f22177id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ki.b(rVar.getParentActivity(), chat, new u2(13, rVar, fVar)).show();
            } else {
                rVar.presentFragment(wn.ea(-chat.f22028id));
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f14407f.setAlpha(f11);
        LinearLayout linearLayout = this.f14407f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f14409r.setAlpha(f7);
        fy0 fy0Var = this.f14409r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        fy0Var.setVisibility(i12);
    }

    public final void W(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f14407f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f14409r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        r0 r0Var = new r0(getParentActivity(), this.resourceProvider, wc.b0(this), this.currentAccount, this.f14405b);
        this.v = r0Var;
        r0Var.h = new rb.c(this, 29);
        r0Var.d();
        this.v.e();
        this.actionBar.setBackButtonDrawable(new j2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 7));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14406c = frameLayout;
        int i10 = y6.f23300a7;
        f7.i(i10, frameLayout, null);
        s71 s71Var = new s71(this, new e2(this, 4), new p(this), new p(this));
        this.d = s71Var;
        s71Var.setClipToPadding(false);
        s71 s71Var2 = this.d;
        s71Var2.f32504g3.f29878r = false;
        s71Var2.u1();
        this.d.j(new ai.b(this, 14));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f14406c.addView(this.d, kb1.g(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f14406c.addView(this.e, kb1.k());
        this.f14406c.addView(this.actionBar, kb1.i(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f14407f = linearLayout;
        linearLayout.setOrientation(0);
        this.f14407f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.f14408n = dVar;
        dVar.e();
        fi.d dVar2 = this.f14408n;
        int f7 = i0.a.f(0.125f, getThemedColor(y6.f23357d6), getThemedColor(y6.G6));
        this.f14411w = f7;
        dVar2.setColor(f7);
        this.f14408n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f14408n.f();
        this.f14408n.setOnClickListener(new View.OnClickListener(this) {
            public final r f14403b;

            {
                this.f14403b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f14403b.v.f(false, true);
                        return;
                    default:
                        this.f14403b.v.f(true, true);
                        return;
                }
            }
        });
        this.f14407f.addView(this.f14408n, kb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        fi.d dVar3 = new fi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final r f14403b;

            {
                this.f14403b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f14403b.v.f(false, true);
                        return;
                    default:
                        this.f14403b.v.f(true, true);
                        return;
                }
            }
        });
        this.f14407f.addView(this.h, kb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f14406c.addView(this.f14407f, kb1.i(-1, -2, 80));
        fy0 fy0Var = new fy0(getParentActivity(), null, 16, this.resourceProvider);
        this.f14409r = fy0Var;
        fy0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f14409r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f14409r.setAnimateLayoutChange(true);
        this.f14409r.setVisibility(8);
        this.f14406c.addView(this.f14409r, kb1.i(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f14410s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f14404a.a(z10, false);
        W(0);
        FrameLayout frameLayout2 = this.f14406c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.i0.f47143a;
        r0.a0.i(frameLayout2, pVar);
        setBulletinDelegate(new k8(4));
        FrameLayout frameLayout3 = this.f14406c;
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
        this.f14405b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f14405b));
        this.f14410s = getMessagesController().getChatFull(this.f14405b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        r0 r0Var = this.v;
        kd kdVar = r0Var.f14417i;
        if (kdVar != null) {
            kdVar.run();
        }
        r0Var.f14417i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f7 = i0.a.f(0.125f, getThemedColor(y6.f23357d6), getThemedColor(y6.G6));
            fi.d dVar = this.f14408n;
            if (dVar != null && f7 != this.f14411w) {
                this.f14411w = f7;
                dVar.setColor(f7);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
