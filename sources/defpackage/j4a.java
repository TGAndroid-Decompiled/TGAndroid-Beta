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
public abstract class j4a extends m8 {
    public boolean A;
    public g4a B;
    public tj9 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public d4a o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public oc6 t;
    public View u;
    public o39 v;
    public t26 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        g4a g4aVar = this.B;
        if (g4aVar != null && g4aVar.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new eh8(this, (WindowManager) this.B.getContext().getSystemService("window"), (byte) 15));
        }
        this.A = true;
        d(true);
    }

    public final void k(List list, Context context, mu1 mu1Var, ie ieVar, View view, int i) {
        TLRPC.User V1;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i);
        if (!this.y) {
            if (tL_sendAsPeer.premium_required && !y6c.h(y6c.t0).p()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (this.B == null) {
                    this.B = new g4a(this, context);
                }
                tj9 tj9Var = this.C;
                if (tj9Var != null) {
                    gl.r(tj9Var);
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
                    gl.t3(windowManager, this.B, layoutParams);
                    windowManager.addView(this.B, layoutParams);
                }
                if (mu1Var != null) {
                    g4a g4aVar = this.B;
                    ku1 ku1Var = mu1Var.Ba;
                    tj9 tj9Var2 = new tj9(this, mu1Var, (byte) 27);
                    ?? y11Var = new y11(context, ku1Var);
                    Drawable drawable = context.getDrawable(2131232315);
                    be0 be0Var = y11Var.a;
                    be0Var.setImageDrawable(drawable);
                    int themedColor = y11Var.getThemedColor(bkb.xj);
                    y11Var.c = themedColor;
                    be0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    y11Var.b.setText(gl.T2(k96.M0(2131745463, null)));
                    k21 k21Var = new k21(ku1Var, context, true);
                    k21Var.e(k96.M0(2131745462, null));
                    k21Var.b = tj9Var2;
                    y11Var.setButton(k21Var);
                    m21 f = m21.f(g4aVar, y11Var, 1500);
                    f.e.addCallback(new h4a(this, f));
                    f.j();
                }
                tj9 tj9Var3 = new tj9(this, windowManager, (byte) 28);
                this.C = tj9Var3;
                gl.e3(tj9Var3, 2500L);
                return;
            }
            this.y = true;
            o39 o39Var = this.v;
            i4a i4aVar = (i4a) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) ieVar.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) ieVar.c;
            na7 na7Var = (na7) ieVar.d;
            int i2 = ChatActivityEnterView.r7;
            if (chatActivityEnterView.r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.v2(true);
            hy1 hy1Var = chatActivityEnterView.P3;
            if (hy1Var == null || !hy1Var.x0(cf3.n(peer))) {
                long j = chatActivityEnterView.G3;
                long n = cf3.n(peer);
                TLRPC.ChatFull L0 = na7Var.L0(-j);
                if (L0 != null) {
                    L0.default_send_as = na7Var.w1(n);
                    na7Var.getMessagesStorage().K1(L0, false);
                    na7Var.getNotificationCenter().k(kk7.F, Long.valueOf(j), L0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = na7Var.h1(j);
                tL_messages_saveDefaultSendAs.send_as = na7Var.h1(n);
                na7Var.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new x47(na7Var, j, (byte) 17), 64);
            }
            int[] iArr = new int[2];
            bia biaVar = i4aVar.a;
            boolean isSelected = biaVar.isSelected();
            biaVar.getLocationInWindow(iArr);
            biaVar.a(true, true);
            bia biaVar2 = new bia(chatActivityEnterView.getContext());
            long j2 = peer.channel_id;
            long j3 = 0;
            if (j2 != 0) {
                TLRPC.Chat K0 = na7Var.K0(Long.valueOf(j2));
                if (K0 != null) {
                    biaVar2.setAvatar(K0);
                }
            } else {
                long j4 = peer.user_id;
                if (j4 != 0 && (V1 = na7Var.V1(Long.valueOf(j4))) != null) {
                    biaVar2.setAvatar(V1);
                }
            }
            for (int i3 = 0; i3 < o39Var.getChildCount(); i3++) {
                View childAt = o39Var.getChildAt(i3);
                if ((childAt instanceof i4a) && childAt != i4aVar) {
                    ((i4a) childAt).a.a(false, true);
                }
            }
            hn1 hn1Var = new hn1(chatActivityEnterView, biaVar2, iArr, i4aVar, (byte) 4);
            if (!isSelected) {
                j3 = 200;
            }
            gl.e3(hn1Var, j3);
        }
    }

    public final void l(yla... ylaVarArr) {
        d4a d4aVar = this.o;
        oc6 oc6Var = this.t;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((yla) obj).d();
        }
        arrayList.clear();
        oc6Var.setPivotX(gl.L(8.0f));
        oc6Var.setPivotY(oc6Var.getMeasuredHeight() - gl.L(8.0f));
        d4aVar.setPivotX(0.0f);
        d4aVar.setPivotY(0.0f);
        oc6Var.setScaleX(1.0f);
        oc6Var.setScaleY(1.0f);
        d4aVar.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        yla ylaVar = new yla(oc6Var, yla.q);
        ylaVar.m = oo1.j(0.25f, 750.0f, 1.0f);
        ylaVar.b(new yr3(this) {
            public final j4a b;

            {
                this.b = this;
            }

            @Override
            public final void a(yla ylaVar2, float f, float f2) {
                byte b = r2;
                j4a j4aVar = this.b;
                switch (b) {
                    case 0:
                        j4aVar.o.setScaleX(1.0f / f);
                        return;
                    default:
                        j4aVar.o.setScaleY(1.0f / f);
                        return;
                }
            }
        });
        yla ylaVar2 = new yla(oc6Var, yla.r);
        ylaVar2.m = oo1.j(0.25f, 750.0f, 1.0f);
        boolean z = true;
        ylaVar2.b(new yr3(this) {
            public final j4a b;

            {
                this.b = this;
            }

            @Override
            public final void a(yla ylaVar22, float f, float f2) {
                byte b = r2;
                j4a j4aVar = this.b;
                switch (b) {
                    case 0:
                        j4aVar.o.setScaleX(1.0f / f);
                        return;
                    default:
                        j4aVar.o.setScaleY(1.0f / f);
                        return;
                }
            }
        });
        wr3 wr3Var = yla.v;
        yla ylaVar3 = new yla(oc6Var, wr3Var);
        ylaVar3.m = oo1.j(0.0f, 750.0f, 1.0f);
        yla ylaVar4 = new yla(d4aVar, wr3Var);
        ylaVar4.m = oo1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(ylaVar, ylaVar2, ylaVar3, ylaVar4));
        for (yla ylaVar5 : ylaVarArr) {
            if (ylaVar5 != null) {
                arrayList3.add(ylaVar5);
            }
        }
        if (ylaVarArr.length <= 0) {
            z = false;
        }
        this.q = z;
        ((yla) arrayList3.get(0)).a(new zv0(this, (byte) 7));
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            yla ylaVar6 = (yla) obj2;
            arrayList.add(ylaVar6);
            ylaVar6.a(new o11(this, ylaVar6, (byte) 6));
            ylaVar6.h();
        }
    }

    @Override
    public final void showAtLocation(View view, int i, int i2, int i3) {
        this.E = i2;
        this.F = i3;
        super.showAtLocation(view, i, i2, i3);
    }
}
