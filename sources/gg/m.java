package gg;

import ai.h5;
import ai.l9;
import ai.u9;
import ai.w5;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v6;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.my;
import org.telegram.ui.qy;
import w7.y5;
public class m extends vl0 implements o2 {
    public static final boolean f9832c0 = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public wl0 K;
    public ti0 L;
    public Drawable O;
    public final j P;
    public boolean Q;
    public final qy R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public boolean f9833a0;
    public final Context f9835c;
    public ArrayList d;
    public boolean e;
    public int f9836f;
    public int h;
    public boolean f9837n;
    public final int f9838r;
    public long f9839s;
    public int v;
    public final boolean f9840w;
    public final ArrayList f9841x;
    public boolean f9842y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int f9834b0 = -1;

    public m(qy qyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f9835c = context;
        this.R = qyVar;
        this.h = i10;
        this.f9838r = i11;
        this.f9840w = z10;
        if (i11 == 0 && i10 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9842y = z11;
        this.f9841x = arrayList;
        this.F = i12;
        this.V = qyVar.X2;
        if (i11 == 0) {
            ?? obj = new Object();
            obj.f9779a = new HashSet();
            obj.f9780b = new HashSet();
            obj.f9781c = new HashSet();
            obj.d = new ArrayList();
            obj.e = new ai.f(obj, 11);
            this.P = obj;
        }
        this.T = requestPeerType;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42949f;
        if (i10 != 1 && i10 != 5 && i10 != 3 && i10 != 8 && i10 != 7 && i10 != 10 && i10 != 11 && i10 != 13 && i10 != 15 && i10 != 16 && i10 != 18 && i10 != 19 && i10 != 20) {
            return true;
        }
        return false;
    }

    public final int E() {
        int i10 = this.h;
        int i11 = this.f9838r;
        if (i10 != 7 && i10 != 8) {
            if (i11 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (MessagesController.getInstance(this.F).isDialogsEndReached(i11)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int F(long j3) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            if (((k) this.M.get(i10)).f9784c != null && ((k) this.M.get(i10)).f9784c.f18325id == j3) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.f9842y) {
            i10 = com.google.android.gms.internal.vision.e2.f(2, i10, MessagesController.getInstance(this.F).hintDialogs);
        }
        if (this.f9837n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        if (i11 != 11 && i11 != 13) {
            if (i11 == 12) {
                return i10 - 1;
            }
            return i10;
        }
        return i10 - 2;
    }

    public final MessagesController.DialogFilter H() {
        int i10 = this.h;
        if (i10 != 7 && i10 != 8) {
            return null;
        }
        return MessagesController.getInstance(this.F).selectedDialogFilter[this.h - 7];
    }

    public final Object I(int i10) {
        if (i10 >= 0 && i10 < this.M.size()) {
            k kVar = (k) this.M.get(i10);
            String str = kVar.f9790l;
            TLRPC.TL_contact tL_contact = kVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f9791m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f9792n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f9784c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.F).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z10) {
        this.f9837n = z10;
    }

    public final void N(ti0 ti0Var) {
        this.L = ti0Var;
    }

    public final void O(wl0 wl0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < wl0Var.getChildCount(); i10++) {
            if (wl0Var.getChildAt(i10) instanceof s2) {
                ((s2) wl0Var.getChildAt(i10)).f20931f = z10;
            }
        }
        for (int i11 = 0; i11 < wl0Var.getCachedChildCount(); i11++) {
            if (wl0Var.P(i11) instanceof s2) {
                ((s2) wl0Var.P(i11)).f20931f = z10;
            }
        }
        for (int i12 = 0; i12 < wl0Var.getHiddenChildCount(); i12++) {
            if (wl0Var.V(i12) instanceof s2) {
                ((s2) wl0Var.V(i12)).f20931f = z10;
            }
        }
        for (int i13 = 0; i13 < wl0Var.getAttachedScrapChildCount(); i13++) {
            if (wl0Var.O(i13) instanceof s2) {
                ((s2) wl0Var.O(i13)).f20931f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.Q = z10;
    }

    public final void Q(long j3) {
        this.f9839s = j3;
    }

    public final void R(my myVar) {
        this.K = myVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z10) {
        int i10 = this.F;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.I >= 2000) {
                this.I = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new d(MessagesController.getInstance(i10), currentTime, 1));
                    if (z10) {
                        l();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void U() {
        boolean z10;
        if (this.f9838r == 0 && this.h == 0 && !this.f9840w && !MessagesController.getInstance(this.F).hintDialogs.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9842y = z10;
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: gg.m.V():void");
    }

    public final void W(Runnable runnable) {
        if (this.Z) {
            this.f9833a0 = true;
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        V();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && f9832c0) {
            Utilities.searchQueue.postRunnable(new h5(this, gVar, runnable, arrayList2, 13));
            return;
        }
        s4.k c10 = s4.o.c(gVar, true);
        this.Z = false;
        if (runnable != null) {
            runnable.run();
        }
        this.M = arrayList2;
        c10.b(this);
    }

    @Override
    public final boolean b() {
        return this.f9841x.isEmpty();
    }

    @Override
    public final void c() {
        boolean z10;
        l9 storiesController = MessagesController.getInstance(this.F).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.R.getOrCreateStoryViewer().G(this.f9835c, null, arrayList2, 0, null, null, new u9(this.K, true), false);
    }

    @Override
    public final void e(s2 s2Var) {
        int i10 = this.F;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(s2Var.getDialogId())) {
            qy qyVar = this.R;
            qyVar.getOrCreateStoryViewer().getClass();
            qyVar.getOrCreateStoryViewer().D(qyVar.getParentActivity(), s2Var.getDialogId(), u9.a((wl0) s2Var.getParent()));
        }
    }

    @Override
    public final void f(s2 s2Var) {
        this.R.H4(s2Var);
    }

    @Override
    public final int h() {
        int size = this.M.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i10) {
        return ((k) this.M.get(i10)).f9789k;
    }

    @Override
    public final int j(int i10) {
        return ((k) this.M.get(i10)).f15700a;
    }

    @Override
    public void l() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        V();
        super.l();
    }

    @Override
    public final void v(s4.c1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: gg.m.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        int i11;
        int i12;
        int i13;
        long j3 = this.V;
        Context context = this.f9835c;
        switch (i10) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    s2 s2Var = new s2(this.R, this.f9835c, false, this.F, null);
                    if (S()) {
                        ai.y1 y1Var = new ai.y1(this, 20);
                        s2Var.J1 = true;
                        s2Var.K1 = y1Var;
                    }
                    s2Var.setArchivedPullAnimation(this.L);
                    s2Var.setPreloader(this.P);
                    s2Var.setDialogCellDelegate(this);
                    s2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        f7 f7Var = new f7(s2Var.getContext(), s2Var, false, R.drawable.forward_to_stories, s2Var.F4);
                        s2Var = s2Var;
                        s2Var.G = f7Var;
                        s2Var.F = true;
                    }
                    if (j3 != 0) {
                        s2Var.O0 = true;
                    }
                    r22 = s2Var;
                } else {
                    r22 = new i6(context, null);
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(h6.w0(null, h6.f19045d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new u00(context, null);
                r22.setIsSingleCell(true);
                if (i10 == 13) {
                    i11 = 18;
                } else {
                    i11 = 7;
                }
                r22.setViewType(i11);
                if (i11 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    r22.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new m4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(h6.w0(null, h6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                textView.setGravity(i12 | 16);
                if (!LocaleController.isRTL) {
                    i15 = 5;
                }
                r22.addView(textView, y5.d(-1, -1.0f, i15 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ai.v0(this, 20));
                break;
            case 3:
                r22 = new w5(context, 2);
                r22.setBackgroundColor(h6.w0(null, h6.f18989a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(h6.V0(context, R.drawable.greydivider, h6.f19009b7));
                r22.addView(view, y5.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.a0(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f21172n = new h9((d6) null);
                r22.f21175w = AndroidUtilities.dp(40.0f);
                r22.F = AndroidUtilities.dp(10.0f);
                r22.H = UserConfig.selectedAccount;
                h6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new y2(context);
                break;
            case 6:
                r22 = new za(context, 8, 0, false);
                break;
            case 7:
                r22 = new m4(context);
                qy qyVar = this.R;
                if (qyVar == null || !qyVar.N0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new b7(context, (org.telegram.ui.Cells.c1) null);
                qq qqVar = new qq(new ColorDrawable(h6.w0(null, h6.f18989a7, false)), h6.V0(context, R.drawable.greydivider, h6.f19009b7));
                qqVar.f27733w = true;
                r22.setBackgroundDrawable(qqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new r8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(h6.w0(null, h6.f19045d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                qq qqVar2 = new qq(new ColorDrawable(h6.w0(null, h6.f18989a7, false)), h6.V0(context, R.drawable.greydivider, h6.f19009b7));
                qqVar2.f27733w = true;
                r22.setBackgroundDrawable(qqVar2);
                break;
            case 14:
                m4 m4Var = new m4(this.f9835c, h6.f7, 16, 0, false, null);
                m4Var.setHeight(32);
                m4Var.setClickable(false);
                r22 = m4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f20859b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(h6.w0(null, h6.f18989a7, false));
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new a3(context);
                break;
            case 18:
                r22 = new ln(context, 5);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new v6(this.f9835c, this.F, null, new f(this, 1), null), y5.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new v3(context, null);
                break;
            case 22:
                r22 = new m4(context);
                break;
            case 23:
                s2 s2Var2 = new s2(this.R, this.f9835c, false, this.F, null);
                if (j3 != 0) {
                    s2Var2.O0 = true;
                    s2Var2.P0 = true;
                }
                r22 = s2Var2;
                break;
        }
        if (i10 != 5 && i10 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new s4.p0(-1, i13));
        return new s4.c1(r22);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42946a;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            s2Var.T(this.H, false);
            s2Var.V(this.f9841x.contains(Long.valueOf(s2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    @Override
    public void a(s2 s2Var) {
    }

    @Override
    public void d(s2 s2Var) {
    }
}
