package hg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d9;
import bi.g5;
import bi.u8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.e7;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.w6;
import org.telegram.ui.qy;
import org.telegram.ui.uy;
import w7.x5;
public class m extends kl0 implements n2 {
    public static final boolean f11165c0 = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public ll0 K;
    public ii0 L;
    public Drawable O;
    public final j P;
    public boolean Q;
    public final uy R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public boolean f11166a0;
    public final Context f11168c;
    public ArrayList d;
    public boolean f11169e;
    public int f11170f;
    public int h;
    public boolean f11171n;
    public final int f11172r;
    public long f11173s;
    public int v;
    public final boolean f11174w;
    public final ArrayList f11175x;
    public boolean f11176y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int f11167b0 = -1;

    public m(uy uyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f11168c = context;
        this.R = uyVar;
        this.h = i10;
        this.f11172r = i11;
        this.f11174w = z10;
        if (i11 == 0 && i10 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11176y = z11;
        this.f11175x = arrayList;
        this.F = i12;
        this.V = uyVar.X2;
        if (i11 == 0) {
            ?? obj = new Object();
            obj.f11108a = new HashSet();
            obj.f11109b = new HashSet();
            obj.f11110c = new HashSet();
            obj.d = new ArrayList();
            obj.f11111e = new ah.j(obj, 12);
            this.P = obj;
        }
        this.T = requestPeerType;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 1 && i10 != 5 && i10 != 3 && i10 != 8 && i10 != 7 && i10 != 10 && i10 != 11 && i10 != 13 && i10 != 15 && i10 != 16 && i10 != 18 && i10 != 19 && i10 != 20) {
            return true;
        }
        return false;
    }

    public final int E() {
        int i10 = this.h;
        int i11 = this.f11172r;
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
            if (((k) this.M.get(i10)).f11114c != null && ((k) this.M.get(i10)).f11114c.f19873id == j3) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.f11176y) {
            i10 = com.google.android.gms.internal.vision.e2.f(2, i10, MessagesController.getInstance(this.F).hintDialogs);
        }
        if (this.f11171n && this.h == 3) {
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
            String str = kVar.f11121l;
            TLRPC.TL_contact tL_contact = kVar.f11115e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f11122m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f11123n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f11114c;
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
        this.f11171n = z10;
    }

    public final void N(ii0 ii0Var) {
        this.L = ii0Var;
    }

    public final void O(ll0 ll0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < ll0Var.getChildCount(); i10++) {
            if (ll0Var.getChildAt(i10) instanceof r2) {
                ((r2) ll0Var.getChildAt(i10)).f22558f = z10;
            }
        }
        for (int i11 = 0; i11 < ll0Var.getCachedChildCount(); i11++) {
            if (ll0Var.P(i11) instanceof r2) {
                ((r2) ll0Var.P(i11)).f22558f = z10;
            }
        }
        for (int i12 = 0; i12 < ll0Var.getHiddenChildCount(); i12++) {
            if (ll0Var.V(i12) instanceof r2) {
                ((r2) ll0Var.V(i12)).f22558f = z10;
            }
        }
        for (int i13 = 0; i13 < ll0Var.getAttachedScrapChildCount(); i13++) {
            if (ll0Var.O(i13) instanceof r2) {
                ((r2) ll0Var.O(i13)).f22558f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.Q = z10;
    }

    public final void Q(long j3) {
        this.f11173s = j3;
    }

    public final void R(qy qyVar) {
        this.K = qyVar;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public final void U() {
        boolean z10;
        if (this.f11172r == 0 && this.h == 0 && !this.f11174w && !MessagesController.getInstance(this.F).hintDialogs.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11176y = z10;
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: hg.m.V():void");
    }

    public final void W(Runnable runnable) {
        if (this.Z) {
            this.f11166a0 = true;
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
        if (arrayList3.size() >= 50 && f11165c0) {
            Utilities.searchQueue.postRunnable(new androidx.car.app.utils.b(this, gVar, runnable, arrayList2, 14));
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
        return this.f11175x.isEmpty();
    }

    @Override
    public final void c() {
        boolean z10;
        u8 storiesController = MessagesController.getInstance(this.F).getStoriesController();
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
        this.R.getOrCreateStoryViewer().G(this.f11168c, null, arrayList2, 0, null, null, new d9(this.K, true), false);
    }

    @Override
    public final void e(r2 r2Var) {
        int i10 = this.F;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(r2Var.getDialogId())) {
            uy uyVar = this.R;
            uyVar.getOrCreateStoryViewer().getClass();
            uyVar.getOrCreateStoryViewer().D(uyVar.getParentActivity(), r2Var.getDialogId(), d9.a((ll0) r2Var.getParent()));
        }
    }

    @Override
    public final void f(r2 r2Var) {
        this.R.H4(r2Var);
    }

    @Override
    public final int h() {
        int size = this.M.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i10) {
        return ((k) this.M.get(i10)).f11120k;
    }

    @Override
    public final int j(int i10) {
        return ((k) this.M.get(i10)).f44071a;
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
        throw new UnsupportedOperationException("Method not decompiled: hg.m.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        int i11;
        int i12;
        int i13;
        long j3 = this.V;
        Context context = this.f11168c;
        switch (i10) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    r2 r2Var = new r2(this.R, this.f11168c, false, this.F, null);
                    if (S()) {
                        bi.o1 o1Var = new bi.o1(this, 17);
                        r2Var.J1 = true;
                        r2Var.K1 = o1Var;
                    }
                    r2Var.setArchivedPullAnimation(this.L);
                    r2Var.setPreloader(this.P);
                    r2Var.setDialogCellDelegate(this);
                    r2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        e7 e7Var = new e7(r2Var.getContext(), r2Var, false, R.drawable.forward_to_stories, r2Var.F4);
                        r2Var = r2Var;
                        r2Var.G = e7Var;
                        r2Var.F = true;
                    }
                    if (j3 != 0) {
                        r2Var.O0 = true;
                    }
                    r22 = r2Var;
                } else {
                    r22 = new h6(context, null);
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(j6.w0(null, j6.f20663d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new t00(context, null);
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
                r22 = new l4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(j6.w0(null, j6.L6, false));
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
                r22.addView(textView, x5.d(-1, -1.0f, i15 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ah.h0(this, 21));
                break;
            case 3:
                r22 = new g5(context, 2);
                r22.setBackgroundColor(j6.w0(null, j6.f20607a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(j6.V0(context, R.drawable.greydivider, j6.f20627b7));
                r22.addView(view, x5.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.a0(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f22818n = new i9((f6) null);
                r22.f22821w = AndroidUtilities.dp(40.0f);
                r22.F = AndroidUtilities.dp(10.0f);
                r22.H = UserConfig.selectedAccount;
                j6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new x2(context);
                break;
            case 6:
                r22 = new za(context, 8, 0, false);
                break;
            case 7:
                r22 = new l4(context);
                uy uyVar = this.R;
                if (uyVar == null || !uyVar.N0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new a7(context, (p6) null);
                oq oqVar = new oq(new ColorDrawable(j6.w0(null, j6.f20607a7, false)), j6.V0(context, R.drawable.greydivider, j6.f20627b7));
                oqVar.f29167w = true;
                r22.setBackgroundDrawable(oqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new r8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(j6.w0(null, j6.f20663d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                oq oqVar2 = new oq(new ColorDrawable(j6.w0(null, j6.f20607a7, false)), j6.V0(context, R.drawable.greydivider, j6.f20627b7));
                oqVar2.f29167w = true;
                r22.setBackgroundDrawable(oqVar2);
                break;
            case 14:
                l4 l4Var = new l4(this.f11168c, j6.f7, 16, 0, false, null);
                l4Var.setHeight(32);
                l4Var.setClickable(false);
                r22 = l4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f22679b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(j6.w0(null, j6.f20607a7, false));
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new z2(context);
                break;
            case 18:
                r22 = new jn(context, 5);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new w6(this.f11168c, this.F, null, new f(this, 1), null), x5.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new u3(context, null);
                break;
            case 22:
                r22 = new l4(context);
                break;
            case 23:
                r2 r2Var2 = new r2(this.R, this.f11168c, false, this.F, null);
                if (j3 != 0) {
                    r2Var2.O0 = true;
                    r2Var2.P0 = true;
                }
                r22 = r2Var2;
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
        View view = c1Var.f45738a;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            r2Var.T(this.H, false);
            r2Var.V(this.f11175x.contains(Long.valueOf(r2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    @Override
    public void a(r2 r2Var) {
    }

    @Override
    public void d(r2 r2Var) {
    }
}
