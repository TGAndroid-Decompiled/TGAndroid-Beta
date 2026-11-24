package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public abstract class l6a extends m8 {
    public boolean A;
    public i6a B;
    public e6a C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public f6a o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public ne6 t;
    public View u;
    public r59 v;
    public u46 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        i6a i6aVar = this.B;
        if (i6aVar != null && i6aVar.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ic8(this, (WindowManager) this.B.getContext().getSystemService("window"), (byte) 16));
        }
        this.A = true;
        d(true);
    }

    public final void k(List list, Context context, yv1 yv1Var, jf jfVar, View view, int i) {
        TLRPC.User W1;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i);
        if (!this.y) {
            if (tL_sendAsPeer.premium_required && !z8c.h(z8c.t0).p()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (this.B == null) {
                    this.B = new i6a(this, context);
                }
                e6a e6aVar = this.C;
                if (e6aVar != null) {
                    gm.r(e6aVar);
                }
                if (this.B.getParent() == null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.format = -3;
                    layoutParams.type = 99;
                    layoutParams.flags |= Integer.MIN_VALUE;
                    if (Build.VERSION.SDK_INT >= 28) {
                        layoutParams.layoutInDisplayCutoutMode = 1;
                    }
                    gm.s3(windowManager, this.B, layoutParams);
                    windowManager.addView(this.B, layoutParams);
                }
                if (yv1Var != null) {
                    i6a i6aVar = this.B;
                    wv1 wv1Var = yv1Var.Ba;
                    il9 il9Var = new il9(this, yv1Var, (byte) 29);
                    ?? g31Var = new g31(context, wv1Var);
                    Drawable drawable = context.getDrawable(2131232316);
                    bf0 bf0Var = g31Var.a;
                    bf0Var.setImageDrawable(drawable);
                    int themedColor = g31Var.getThemedColor(cmb.xj);
                    g31Var.c = themedColor;
                    bf0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    g31Var.b.setText(gm.S2(jb6.M0(2131745389, null)));
                    s31 s31Var = new s31(wv1Var, context, true);
                    s31Var.e(jb6.M0(2131745388, null));
                    s31Var.b = il9Var;
                    g31Var.setButton(s31Var);
                    u31 f = u31.f(i6aVar, g31Var, 1500);
                    f.e.addCallback(new j6a(this, f));
                    f.j();
                }
                e6a e6aVar2 = new e6a(this, windowManager, (byte) 0);
                this.C = e6aVar2;
                gm.d3(e6aVar2, 2500L);
                return;
            }
            this.y = true;
            r59 r59Var = this.v;
            k6a k6aVar = (k6a) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) jfVar.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) jfVar.c;
            oc7 oc7Var = (oc7) jfVar.d;
            int i2 = ChatActivityEnterView.z7;
            if (chatActivityEnterView.r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.A2(true);
            uz1 uz1Var = chatActivityEnterView.P3;
            if (uz1Var == null || !uz1Var.E0(pg3.n(peer))) {
                long j = chatActivityEnterView.G3;
                long n = pg3.n(peer);
                TLRPC.ChatFull M0 = oc7Var.M0(-j);
                if (M0 != null) {
                    M0.default_send_as = oc7Var.x1(n);
                    oc7Var.getMessagesStorage().K1(M0, false);
                    oc7Var.getNotificationCenter().k(nm7.F, Long.valueOf(j), M0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = oc7Var.i1(j);
                tL_messages_saveDefaultSendAs.send_as = oc7Var.i1(n);
                oc7Var.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new x67(oc7Var, j, (byte) 17), 64);
            }
            int[] iArr = new int[2];
            dka dkaVar = k6aVar.a;
            boolean isSelected = dkaVar.isSelected();
            dkaVar.getLocationInWindow(iArr);
            dkaVar.a(true, true);
            dka dkaVar2 = new dka(chatActivityEnterView.getContext());
            long j2 = peer.channel_id;
            long j3 = 0;
            if (j2 != 0) {
                TLRPC.Chat L0 = oc7Var.L0(Long.valueOf(j2));
                if (L0 != null) {
                    dkaVar2.setAvatar(L0);
                }
            } else {
                long j4 = peer.user_id;
                if (j4 != 0 && (W1 = oc7Var.W1(Long.valueOf(j4))) != null) {
                    dkaVar2.setAvatar(W1);
                }
            }
            for (int i3 = 0; i3 < r59Var.getChildCount(); i3++) {
                View childAt = r59Var.getChildAt(i3);
                if ((childAt instanceof k6a) && childAt != k6aVar) {
                    ((k6a) childAt).a.a(false, true);
                }
            }
            xo1 xo1Var = new xo1(chatActivityEnterView, dkaVar2, iArr, k6aVar, (byte) 4);
            if (!isSelected) {
                j3 = 200;
            }
            gm.d3(xo1Var, j3);
        }
    }

    public final void l(zna... znaVarArr) {
        f6a f6aVar = this.o;
        ne6 ne6Var = this.t;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((zna) obj).d();
        }
        arrayList.clear();
        ne6Var.setPivotX(gm.L(8.0f));
        ne6Var.setPivotY(ne6Var.getMeasuredHeight() - gm.L(8.0f));
        f6aVar.setPivotX(0.0f);
        f6aVar.setPivotY(0.0f);
        ne6Var.setScaleX(1.0f);
        ne6Var.setScaleY(1.0f);
        f6aVar.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        zna znaVar = new zna(ne6Var, zna.q);
        znaVar.m = aq1.j(0.25f, 750.0f, 1.0f);
        znaVar.b(new it3(this) {
            public final l6a b;

            {
                this.b = this;
            }

            @Override
            public final void a(zna znaVar2, float f, float f2) {
                byte b = r2;
                l6a l6aVar = this.b;
                switch (b) {
                    case 0:
                        l6aVar.o.setScaleX(1.0f / f);
                        return;
                    default:
                        l6aVar.o.setScaleY(1.0f / f);
                        return;
                }
            }
        });
        zna znaVar2 = new zna(ne6Var, zna.r);
        znaVar2.m = aq1.j(0.25f, 750.0f, 1.0f);
        boolean z = true;
        znaVar2.b(new it3(this) {
            public final l6a b;

            {
                this.b = this;
            }

            @Override
            public final void a(zna znaVar22, float f, float f2) {
                byte b = r2;
                l6a l6aVar = this.b;
                switch (b) {
                    case 0:
                        l6aVar.o.setScaleX(1.0f / f);
                        return;
                    default:
                        l6aVar.o.setScaleY(1.0f / f);
                        return;
                }
            }
        });
        gt3 gt3Var = zna.v;
        zna znaVar3 = new zna(ne6Var, gt3Var);
        znaVar3.m = aq1.j(0.0f, 750.0f, 1.0f);
        zna znaVar4 = new zna(f6aVar, gt3Var);
        znaVar4.m = aq1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(znaVar, znaVar2, znaVar3, znaVar4));
        for (zna znaVar5 : znaVarArr) {
            if (znaVar5 != null) {
                arrayList3.add(znaVar5);
            }
        }
        if (znaVarArr.length <= 0) {
            z = false;
        }
        this.q = z;
        ((zna) arrayList3.get(0)).a(new hx0(this, (byte) 7));
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            zna znaVar6 = (zna) obj2;
            arrayList.add(znaVar6);
            znaVar6.a(new w21(this, znaVar6, (byte) 6));
            znaVar6.h();
        }
    }

    @Override
    public final void showAtLocation(View view, int i, int i2, int i3) {
        this.E = i2;
        this.F = i3;
        super.showAtLocation(view, i, i2, i3);
    }
}
